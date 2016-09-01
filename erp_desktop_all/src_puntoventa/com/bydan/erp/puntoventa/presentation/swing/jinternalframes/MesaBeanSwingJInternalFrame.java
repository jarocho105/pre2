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

import com.bydan.erp.puntoventa.util.MesaConstantesFunciones;
import com.bydan.erp.puntoventa.util.MesaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.MesaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.MesaBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class MesaBeanSwingJInternalFrame extends MesaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MesaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Mesa> mesaValidator = new ClassValidator<Mesa>(Mesa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Mesa mesa;	
	public Mesa mesaAux;
	public Mesa mesaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Mesa mesaTotales;
	public Long idMesaActual;
	public Long iIdNuevoMesa=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosPedidoPuntoVenta=false;

	public Boolean getIsTienePermisosPedidoPuntoVenta() {
		return isTienePermisosPedidoPuntoVenta;
	}

	public void setIsTienePermisosPedidoPuntoVenta(Boolean isTienePermisosPedidoPuntoVenta) {
		this.isTienePermisosPedidoPuntoVenta= isTienePermisosPedidoPuntoVenta;
	}


	public Boolean isTienePermisosFacturaPuntoVenta=false;

	public Boolean getIsTienePermisosFacturaPuntoVenta() {
		return isTienePermisosFacturaPuntoVenta;
	}

	public void setIsTienePermisosFacturaPuntoVenta(Boolean isTienePermisosFacturaPuntoVenta) {
		this.isTienePermisosFacturaPuntoVenta= isTienePermisosFacturaPuntoVenta;
	}


	public Boolean isTienePermisosNotaCreditoPuntoVenta=false;

	public Boolean getIsTienePermisosNotaCreditoPuntoVenta() {
		return isTienePermisosNotaCreditoPuntoVenta;
	}

	public void setIsTienePermisosNotaCreditoPuntoVenta(Boolean isTienePermisosNotaCreditoPuntoVenta) {
		this.isTienePermisosNotaCreditoPuntoVenta= isTienePermisosNotaCreditoPuntoVenta;
	}


	public Boolean isTienePermisosCajeroTurno=false;

	public Boolean getIsTienePermisosCajeroTurno() {
		return isTienePermisosCajeroTurno;
	}

	public void setIsTienePermisosCajeroTurno(Boolean isTienePermisosCajeroTurno) {
		this.isTienePermisosCajeroTurno= isTienePermisosCajeroTurno;
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
	
	public Boolean isPermisoTodoMesa;
	public Boolean isPermisoNuevoMesa;
	public Boolean isPermisoActualizarMesa;
	public Boolean isPermisoActualizarOriginalMesa;
	public Boolean isPermisoEliminarMesa;
	public Boolean isPermisoGuardarCambiosMesa;
	public Boolean isPermisoConsultaMesa;
	public Boolean isPermisoBusquedaMesa;
	public Boolean isPermisoReporteMesa;
	public Boolean isPermisoPaginacionMedioMesa;
	public Boolean isPermisoPaginacionAltoMesa;
	public Boolean isPermisoPaginacionTodoMesa;
	public Boolean isPermisoCopiarMesa;
	public Boolean isPermisoVerFormMesa;
	public Boolean isPermisoDuplicarMesa;
	public Boolean isPermisoOrdenMesa;
	
	
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
	
	public MesaParameterReturnGeneral mesaReturnGeneral;
	public MesaParameterReturnGeneral mesaParameterGeneral;
	
	

	public PedidoPuntoVentaLogic pedidopuntoventaLogic=null;

	public PedidoPuntoVentaLogic getPedidoPuntoVentaLogic() {
		return pedidopuntoventaLogic;
	}

	public void setPedidoPuntoVentaLogic(PedidoPuntoVentaLogic pedidopuntoventaLogic) {
		this.pedidopuntoventaLogic = pedidopuntoventaLogic;
	}


	public FacturaPuntoVentaLogic facturapuntoventaLogic=null;

	public FacturaPuntoVentaLogic getFacturaPuntoVentaLogic() {
		return facturapuntoventaLogic;
	}

	public void setFacturaPuntoVentaLogic(FacturaPuntoVentaLogic facturapuntoventaLogic) {
		this.facturapuntoventaLogic = facturapuntoventaLogic;
	}


	public NotaCreditoPuntoVentaLogic notacreditopuntoventaLogic=null;

	public NotaCreditoPuntoVentaLogic getNotaCreditoPuntoVentaLogic() {
		return notacreditopuntoventaLogic;
	}

	public void setNotaCreditoPuntoVentaLogic(NotaCreditoPuntoVentaLogic notacreditopuntoventaLogic) {
		this.notacreditopuntoventaLogic = notacreditopuntoventaLogic;
	}


	public CajeroTurnoLogic cajeroturnoLogic=null;

	public CajeroTurnoLogic getCajeroTurnoLogic() {
		return cajeroturnoLogic;
	}

	public void setCajeroTurnoLogic(CajeroTurnoLogic cajeroturnoLogic) {
		this.cajeroturnoLogic = cajeroturnoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMesa=false;
	public Boolean esParaAccionDesdeFormularioMesa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MesaSessionBeanAdditional mesaSessionBeanAdditional=null;
	
	public MesaSessionBeanAdditional getMesaSessionBeanAdditional() {
		return this.mesaSessionBeanAdditional;
	}
	
	public void setMesaSessionBeanAdditional(MesaSessionBeanAdditional mesaSessionBeanAdditional) {
		try {
			this.mesaSessionBeanAdditional=mesaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MesaBeanSwingJInternalFrameAdditional mesaBeanSwingJInternalFrameAdditional=null;
	//public class MesaBeanSwingJInternalFrame
	
	public MesaBeanSwingJInternalFrameAdditional getMesaBeanSwingJInternalFrameAdditional() {
		return this.mesaBeanSwingJInternalFrameAdditional;
	}
	
	public void setMesaBeanSwingJInternalFrameAdditional(MesaBeanSwingJInternalFrameAdditional mesaBeanSwingJInternalFrameAdditional) {
		try {
			this.mesaBeanSwingJInternalFrameAdditional=mesaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MesaLogic mesaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Mesa mesaBean;
	public MesaConstantesFunciones mesaConstantesFunciones;
	//public MesaParameterReturnGeneral mesaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<Mesa> mesas;	
	//public List<Mesa> mesasEliminados;
	//public List<Mesa> mesasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMesa=false;
	public Boolean isVisibilidadCeldaDuplicarMesa=true;
	public Boolean isVisibilidadCeldaCopiarMesa=true;
	public Boolean isVisibilidadCeldaVerFormMesa=true;
	public Boolean isVisibilidadCeldaOrdenMesa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMesa=false;
	public Boolean isVisibilidadCeldaModificarMesa=false;
	public Boolean isVisibilidadCeldaActualizarMesa=false;
	public Boolean isVisibilidadCeldaEliminarMesa=false;
	public Boolean isVisibilidadCeldaCancelarMesa=false;
	public Boolean isVisibilidadCeldaGuardarMesa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMesa=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoMesa() {
		return this.iIdNuevoMesa;
	}

	public void setiIdNuevoMesa(Long iIdNuevoMesa) {
		this.iIdNuevoMesa = iIdNuevoMesa;
	}
	
	public Long getidMesaActual() {
		return this.idMesaActual;
	}

	public void setidMesaActual(Long idMesaActual) {
		this.idMesaActual = idMesaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Mesa getmesa() {
		return this.mesa;
	}

	public void setmesa(Mesa mesa) {
		this.mesa = mesa;
	}
	
	public Mesa getmesaAux() {
		return this.mesaAux;
	}

	public void setmesaAux(Mesa mesaAux) {
		this.mesaAux = mesaAux;
	}				
	
	public Mesa getmesaAnterior() {
		return this.mesaAnterior;
	}

	public void setmesaAnterior(Mesa mesaAnterior) {
		this.mesaAnterior = mesaAnterior;
	}	
	
	public Mesa getmesaTotales() {
		return this.mesaTotales;
	}

	public void setmesaTotales(Mesa mesaTotales) {
		this.mesaTotales = mesaTotales;
	}	
	
	public Mesa getmesaBean() {
		return this.mesaBean;
	}

	public void setmesaBean(Mesa mesaBean) {
		this.mesaBean = mesaBean;
	}	
	
	public MesaParameterReturnGeneral getmesaReturnGeneral() {
		return this.mesaReturnGeneral;
	}

	public void setmesaReturnGeneral(MesaParameterReturnGeneral mesaReturnGeneral) {
		this.mesaReturnGeneral = mesaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
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
	
	
	public MesaLogic getMesaLogic()	{		
		return mesaLogic;
	}

	public void setMesaLogic(MesaLogic mesaLogic) {
		this.mesaLogic = mesaLogic;
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
	
	public Boolean getIsEsNuevoMesa() {
		return isEsNuevoMesa;
	}

	public void setIsEsNuevoMesa(Boolean isEsNuevoMesa) {
		this.isEsNuevoMesa = isEsNuevoMesa;
	}

	public Boolean getEsParaAccionDesdeFormularioMesa() {
		return esParaAccionDesdeFormularioMesa;
	}
	
	public void setEsParaAccionDesdeFormularioMesa(Boolean esParaAccionDesdeFormularioMesa) {
		this.esParaAccionDesdeFormularioMesa = esParaAccionDesdeFormularioMesa;
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

			if(this.mesaSessionBean==null) {
				this.mesaSessionBean=new MesaSessionBean();
			}

			if(!this.mesaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(mesaSessionBean.getlidEmpresaActual());
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

			if(this.mesaSessionBean==null) {
				this.mesaSessionBean=new MesaSessionBean();
			}

			if(!this.mesaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(mesaSessionBean.getlidSucursalActual());
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

					if(this.mesa!=null) {
						this.mesa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMesa!=null) {
						this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMesa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMesa!=null) {
						if(this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.getItemCount()>0) {
							this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMesaGenerico)throws Exception
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
				jComboBoxid_empresaMesaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMesaGenerico!=null && jComboBoxid_empresaMesaGenerico.getItemCount()>0) {
					jComboBoxid_empresaMesaGenerico.setSelectedIndex(0);
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

					if(this.mesa!=null) {
						this.mesa.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormMesa!=null) {
						this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalMesa.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormMesa!=null) {
						if(this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.getItemCount()>0) {
							this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalMesaGenerico)throws Exception
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
				jComboBoxid_sucursalMesaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalMesaGenerico!=null && jComboBoxid_sucursalMesaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalMesaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Mesa mesa,JComboBox jComboBoxid_empresaMesaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMesaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMesaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				mesa.setid_empresa(empresaAux.getId());
				mesa.setempresa_descripcion(MesaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				mesa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Mesa mesa,JComboBox jComboBoxid_sucursalMesaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalMesaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalMesaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				mesa.setid_sucursal(sucursalAux.getId());
				mesa.setsucursal_descripcion(MesaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				mesa.setSucursal(sucursalAux);			}
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

					if(!MesaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMesa!=null) { 
							this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMesa!=null) { 
					}

					if(!MesaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MesaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMesa!=null) { 
							this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMesa!=null) { 
					}

					if(!MesaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMesa!=null) {
							this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMesa!=null) {
							this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMesa!=null) {
							this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormMesa!=null) {
							this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesMesa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MesaConstantesFunciones.refrescarForeignKeysDescripcionesMesa(this.mesaLogic.getMesas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MesaConstantesFunciones.refrescarForeignKeysDescripcionesMesa(this.mesas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//mesaLogic.setMesas(this.mesas);
			mesaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MesaParameterReturnGeneral getMesaParameterGeneral() {
		return this.mesaParameterGeneral;
	}
	
	public void setMesaParameterGeneral(MesaParameterReturnGeneral mesaParameterGeneral) {
		this.mesaParameterGeneral = mesaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMesa() {
		return isPermisoTodoMesa;
	}

	public void setIsPermisoTodoMesa(Boolean isPermisoTodoMesa) {
		this.isPermisoTodoMesa = isPermisoTodoMesa;
	}

	public Boolean getIsPermisoNuevoMesa() {
		return isPermisoNuevoMesa;
	}

	public void setIsPermisoNuevoMesa(Boolean isPermisoNuevoMesa) {
		this.isPermisoNuevoMesa = isPermisoNuevoMesa;
	}

	public Boolean getIsPermisoActualizarMesa() {
		return isPermisoActualizarMesa;
	}

	public void setIsPermisoActualizarMesa(Boolean isPermisoActualizarMesa) {
		this.isPermisoActualizarMesa = isPermisoActualizarMesa;
	}

	public Boolean getIsPermisoEliminarMesa() {
		return isPermisoEliminarMesa;
	}

	public void setIsPermisoEliminarMesa(Boolean isPermisoEliminarMesa) {
		this.isPermisoEliminarMesa = isPermisoEliminarMesa;
	}

	public Boolean getIsPermisoGuardarCambiosMesa() {
		return isPermisoGuardarCambiosMesa;
	}

	public void setIsPermisoGuardarCambiosMesa(Boolean isPermisoGuardarCambiosMesa) {
		this.isPermisoGuardarCambiosMesa = isPermisoGuardarCambiosMesa;
	}
	
	public Boolean getIsPermisoConsultaMesa() {
		return isPermisoConsultaMesa;
	}

	public void setIsPermisoConsultaMesa(Boolean isPermisoConsultaMesa) {
		this.isPermisoConsultaMesa = isPermisoConsultaMesa;
	}

	public Boolean getIsPermisoBusquedaMesa() {
		return isPermisoBusquedaMesa;
	}

	public void setIsPermisoBusquedaMesa(Boolean isPermisoBusquedaMesa) {
		this.isPermisoBusquedaMesa = isPermisoBusquedaMesa;
	}

	public Boolean getIsPermisoReporteMesa() {
		return isPermisoReporteMesa;
	}

	public void setIsPermisoReporteMesa(Boolean isPermisoReporteMesa) {
		this.isPermisoReporteMesa = isPermisoReporteMesa;
	}
	
	public Boolean getIsPermisoPaginacionMedioMesa() {
		return isPermisoPaginacionMedioMesa;
	}

	public void setIsPermisoPaginacionMedioMesa(Boolean isPermisoPaginacionMedioMesa) {
		this.isPermisoPaginacionMedioMesa = isPermisoPaginacionMedioMesa;
	}
	
	public Boolean getIsPermisoPaginacionTodoMesa() {
		return isPermisoPaginacionTodoMesa;
	}

	public void setIsPermisoPaginacionTodoMesa(Boolean isPermisoPaginacionTodoMesa) {
		this.isPermisoPaginacionTodoMesa = isPermisoPaginacionTodoMesa;
	}
	
	public Boolean getIsPermisoPaginacionAltoMesa() {
		return isPermisoPaginacionAltoMesa;
	}

	public void setIsPermisoPaginacionAltoMesa(Boolean isPermisoPaginacionAltoMesa) {
		this.isPermisoPaginacionAltoMesa = isPermisoPaginacionAltoMesa;
	}
	
	public Boolean getIsPermisoCopiarMesa() {
		return isPermisoCopiarMesa;
	}

	public void setIsPermisoCopiarMesa(Boolean isPermisoCopiarMesa) {
		this.isPermisoCopiarMesa = isPermisoCopiarMesa;
	}
	
	public Boolean getIsPermisoVerFormMesa() {
		return isPermisoVerFormMesa;
	}

	public void setIsPermisoVerFormMesa(Boolean isPermisoVerFormMesa) {
		this.isPermisoVerFormMesa = isPermisoVerFormMesa;
	}
	
	public Boolean getIsPermisoDuplicarMesa() {
		return isPermisoDuplicarMesa;
	}

	public void setIsPermisoDuplicarMesa(Boolean isPermisoDuplicarMesa) {
		this.isPermisoDuplicarMesa = isPermisoDuplicarMesa;
	}
	
	public Boolean getIsPermisoOrdenMesa() {
		return isPermisoOrdenMesa;
	}

	public void setIsPermisoOrdenMesa(Boolean isPermisoOrdenMesa) {
		this.isPermisoOrdenMesa = isPermisoOrdenMesa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMesa() {
		return isVisibilidadCeldaNuevoMesa;
	}

	public void setIsVisibilidadCeldaNuevoMesa(Boolean isVisibilidadCeldaNuevoMesa) {
		this.isVisibilidadCeldaNuevoMesa = isVisibilidadCeldaNuevoMesa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMesa() {
		return isVisibilidadCeldaDuplicarMesa;
	}

	public void setIsVisibilidadCeldaDuplicarMesa(Boolean isVisibilidadCeldaDuplicarMesa) {
		this.isVisibilidadCeldaDuplicarMesa = isVisibilidadCeldaDuplicarMesa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMesa() {
		return isVisibilidadCeldaCopiarMesa;
	}

	public void setIsVisibilidadCeldaCopiarMesa(Boolean isVisibilidadCeldaCopiarMesa) {
		this.isVisibilidadCeldaCopiarMesa = isVisibilidadCeldaCopiarMesa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMesa() {
		return isVisibilidadCeldaVerFormMesa;
	}

	public void setIsVisibilidadCeldaVerFormMesa(Boolean isVisibilidadCeldaVerFormMesa) {
		this.isVisibilidadCeldaVerFormMesa = isVisibilidadCeldaVerFormMesa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMesa() {
		return isVisibilidadCeldaOrdenMesa;
	}

	public void setIsVisibilidadCeldaOrdenMesa(Boolean isVisibilidadCeldaOrdenMesa) {
		this.isVisibilidadCeldaOrdenMesa = isVisibilidadCeldaOrdenMesa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMesa() {
		return isVisibilidadCeldaNuevoRelacionesMesa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMesa(Boolean isVisibilidadCeldaNuevoRelacionesMesa) {
		this.isVisibilidadCeldaNuevoRelacionesMesa = isVisibilidadCeldaNuevoRelacionesMesa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMesa() {
		return isVisibilidadCeldaModificarMesa;
	}

	public void setIsVisibilidadCeldaModificarMesa(Boolean isVisibilidadCeldaModificarMesa) {
		this.isVisibilidadCeldaModificarMesa = isVisibilidadCeldaModificarMesa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMesa() {
		return isVisibilidadCeldaActualizarMesa;
	}

	public void setIsVisibilidadCeldaActualizarMesa(Boolean isVisibilidadCeldaActualizarMesa) {
		this.isVisibilidadCeldaActualizarMesa = isVisibilidadCeldaActualizarMesa;
	}

	public Boolean getIsVisibilidadCeldaEliminarMesa() {
		return isVisibilidadCeldaEliminarMesa;
	}

	public void setIsVisibilidadCeldaEliminarMesa(Boolean isVisibilidadCeldaEliminarMesa) {
		this.isVisibilidadCeldaEliminarMesa = isVisibilidadCeldaEliminarMesa;
	}

	public Boolean getIsVisibilidadCeldaCancelarMesa() {
		return isVisibilidadCeldaCancelarMesa;
	}

	public void setIsVisibilidadCeldaCancelarMesa(Boolean isVisibilidadCeldaCancelarMesa) {
		this.isVisibilidadCeldaCancelarMesa = isVisibilidadCeldaCancelarMesa;
	}

	public Boolean getIsVisibilidadCeldaGuardarMesa() {
		return isVisibilidadCeldaGuardarMesa;
	}

	public void setIsVisibilidadCeldaGuardarMesa(Boolean isVisibilidadCeldaGuardarMesa) {
		this.isVisibilidadCeldaGuardarMesa = isVisibilidadCeldaGuardarMesa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMesa() {
		return isVisibilidadCeldaGuardarCambiosMesa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMesa(Boolean isVisibilidadCeldaGuardarCambiosMesa) {
		this.isVisibilidadCeldaGuardarCambiosMesa = isVisibilidadCeldaGuardarCambiosMesa;
	}
		
	public MesaSessionBean getmesaSessionBean() {
		return this.mesaSessionBean;
	}
	
	public void setmesaSessionBean(MesaSessionBean mesaSessionBean) {
		this.mesaSessionBean=mesaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMesa(Mesa mesa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(mesa,null);
				this.setActualParaGuardarSucursalForeignKey(mesa,null);
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
	
	public void bugActualizarReferenciaActual(Mesa mesa,Mesa mesaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMesa(mesa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		mesaAux.setId(mesa.getId());
		mesaAux.setVersionRow(mesa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMesa();
		
			int intSelectedRow = this.jTableDatosMesa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = mesaValidator.getInvalidValues(this.mesa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			mesaLogic.setDatosCliente(datosCliente);
			mesaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				mesaAux=new  Mesa();
				
				mesaAux.setIsNew(true);
				mesaAux.setIsChanged(true);
				
				mesaAux.setMesaOriginal(this.mesa);
				
				mesaAux.setId(this.mesa.getId());	
				mesaAux.setVersionRow(this.mesa.getVersionRow());	
				mesaAux.setid_empresa(this.mesa.getid_empresa());	
				mesaAux.setid_sucursal(this.mesa.getid_sucursal());	
				mesaAux.setnombre(this.mesa.getnombre());	
				mesaAux.setnumero(this.mesa.getnumero());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mesaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mesaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(mesaAux,mesaLogic.getMesas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mesaAux,mesas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.mesaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mesaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesaLogic.saveMesas();//WithConnection
						//mesaLogic.getSetVersionRowMesas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mesa,mesaAux);
					
					this.refrescarForeignKeysDescripcionesMesa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mesaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas().addAll(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas().addAll(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas().addAll(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos().addAll(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventas.addAll(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventas.addAll(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventas.addAll(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnos.addAll(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mesaLogic.saveMesaRelaciones(mesaAux,this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas(),this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas(),this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas(),this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());//WithConnection
								//mesaLogic.getSetVersionRowMesas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.mesa,mesaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.setPedidoPuntoVentas(new ArrayList<PedidoPuntoVenta>());
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.setFacturaPuntoVentas(new ArrayList<FacturaPuntoVenta>());
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.setNotaCreditoPuntoVentas(new ArrayList<NotaCreditoPuntoVenta>());
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventas= new ArrayList<PedidoPuntoVenta>();
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventas= new ArrayList<FacturaPuntoVenta>();
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventas= new ArrayList<NotaCreditoPuntoVenta>();
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnos= new ArrayList<CajeroTurno>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setPedidoPuntoVentas(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas());

							if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setFacturaPuntoVentas(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());

							if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());

							if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setCajeroTurnos(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.mesaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.mesaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(mesaAux,mesaLogic.getMesas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(mesaAux,mesas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.mesa,mesaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				mesaAux=new  Mesa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.mesaSessionBean.getEsGuardarRelacionado() 
					|| (this.mesaSessionBean.getEsGuardarRelacionado() && this.mesa.getId()>=0)) {
						
					mesaAux.setIsNew(false);
				}
				
				mesaAux.setIsDeleted(false);
			
				mesaAux.setId(this.mesa.getId());	
				mesaAux.setVersionRow(this.mesa.getVersionRow());	
				mesaAux.setid_empresa(this.mesa.getid_empresa());	
				mesaAux.setid_sucursal(this.mesa.getid_sucursal());	
				mesaAux.setnombre(this.mesa.getnombre());	
				mesaAux.setnumero(this.mesa.getnumero());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mesaAux,mesaLogic.getMesas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mesaAux,mesas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.mesaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mesaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesaLogic.saveMesas();//WithConnection
						//mesaLogic.getSetVersionRowMesas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mesa,mesaAux);
					
					this.refrescarForeignKeysDescripcionesMesa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mesaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas().addAll(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas().addAll(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas().addAll(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos().addAll(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventas.addAll(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventas.addAll(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventas.addAll(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnos.addAll(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mesaLogic.saveMesaRelaciones(mesaAux,this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas(),this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas(),this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas(),this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());//WithConnection
								//mesaLogic.getSetVersionRowMesas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.mesa,mesaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.setPedidoPuntoVentas(new ArrayList<PedidoPuntoVenta>());
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.setFacturaPuntoVentas(new ArrayList<FacturaPuntoVenta>());
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.setNotaCreditoPuntoVentas(new ArrayList<NotaCreditoPuntoVenta>());
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventas= new ArrayList<PedidoPuntoVenta>();
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventas= new ArrayList<FacturaPuntoVenta>();
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventas= new ArrayList<NotaCreditoPuntoVenta>();
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnos= new ArrayList<CajeroTurno>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setPedidoPuntoVentas(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas());

							if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setFacturaPuntoVentas(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());

							if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());

							if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setCajeroTurnos(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.mesaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.mesaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(mesaAux,mesaLogic.getMesas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(mesaAux,mesas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.mesa,mesaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				mesaAux=new  Mesa();
				
				mesaAux.setIsNew(false);
				mesaAux.setIsChanged(false);
				
				mesaAux.setIsDeleted(true);
				
				mesaAux.setId(this.mesa.getId());	
				mesaAux.setVersionRow(this.mesa.getVersionRow());	
				mesaAux.setid_empresa(this.mesa.getid_empresa());	
				mesaAux.setid_sucursal(this.mesa.getid_sucursal());	
				mesaAux.setnombre(this.mesa.getnombre());	
				mesaAux.setnumero(this.mesa.getnumero());	
				
				if(this.mesaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.mesaAux.getId()>=0) {	
						this.mesasEliminados.add(mesaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(mesaAux,mesaLogic.getMesas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mesaAux,mesas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.mesaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mesaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesaLogic.saveMesas();//WithConnection
						//mesaLogic.getSetVersionRowMesas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mesaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas().addAll(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas().addAll(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas().addAll(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos().addAll(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventas.addAll(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventas.addAll(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventas.addAll(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventasEliminados);
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnos.addAll(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoPuntoVenta.detallepedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaPuntoVenta.detallefacturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoPuntoVenta.detallenotacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mesaLogic.saveMesaRelaciones(mesaAux,this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas(),this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas(),this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas(),this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());//WithConnection
								//mesaLogic.getSetVersionRowMesas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.setPedidoPuntoVentas(new ArrayList<PedidoPuntoVenta>());
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.setFacturaPuntoVentas(new ArrayList<FacturaPuntoVenta>());
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.setNotaCreditoPuntoVentas(new ArrayList<NotaCreditoPuntoVenta>());
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventas= new ArrayList<PedidoPuntoVenta>();
							this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventas= new ArrayList<FacturaPuntoVenta>();
							this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventas= new ArrayList<NotaCreditoPuntoVenta>();
							this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnos= new ArrayList<CajeroTurno>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setPedidoPuntoVentas(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas());

							if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setFacturaPuntoVentas(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());

							if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());

							if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();}
							mesaAux.setCajeroTurnos(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.mesaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.mesaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(mesaAux,mesaLogic.getMesas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(mesaAux,mesas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getMesas().addAll(this.mesasEliminados);
					
					mesaLogic.saveMesas();//WithConnection
					//mesaLogic.getSetVersionRowMesas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMesa();
				
				this.mesasEliminados= new ArrayList<Mesa>();		
			}
			
			if(this.mesaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Mesa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.mesa=mesaAux;
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
      		//this.finishProcessMesa();
      	}
		
	}	
	
	public void actualizarRelaciones(Mesa mesaLocal) throws Exception {
		
		if(this.mesaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				mesaLocal.setPedidoPuntoVentas(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas());
				mesaLocal.setFacturaPuntoVentas(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());
				mesaLocal.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());
				mesaLocal.setCajeroTurnos(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());
			
			} else {
			
				mesaLocal.setPedidoPuntoVentas(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventas);
				mesaLocal.setFacturaPuntoVentas(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventas);
				mesaLocal.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventas);
				mesaLocal.setCajeroTurnos(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Mesa mesaLocal) throws Exception {	
		if(this.mesaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				mesaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				mesaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMesaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMesa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = mesaValidator.getInvalidValues(this.mesa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Mesa mesa,List<Mesa> mesas) throws Exception {
		try	{		
			MesaConstantesFunciones.actualizarLista(mesa,mesas,this.mesaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Mesa mesa,List<Mesa> mesas) throws Exception {
		try	{			
			MesaConstantesFunciones.actualizarSelectedLista(mesa,mesas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Mesa> mesasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				mesasLocal=this.mesaLogic.getMesas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				mesasLocal=this.mesas;
			}
			//ARCHITECTURE
		
			for(Mesa mesaLocal:mesasLocal) {
				if(this.permiteMantenimiento(mesaLocal) && mesaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MesaConstantesFunciones.getMesaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MesaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMesa.jLabelid_empresaMesa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MesaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMesa.jLabelid_sucursalMesa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MesaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMesa.jLabelnombreMesa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MesaConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMesa.jLabelnumeroMesa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMesa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMesa.jLabelid_empresaMesa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMesa.jLabelid_sucursalMesa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMesa.jLabelnombreMesa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMesa.jLabelnumeroMesa,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PedidoPuntoVenta")) {
			if(this.mesa==null) {
				this.mesa= new Mesa();
			}

			if(this.mesaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMesa
				this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);

				this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.getpedidopuntoventa().setMesa(this.mesa);
			}

			return;
		}
		 else  if(sTipo.equals("FacturaPuntoVenta")) {
			if(this.mesa==null) {
				this.mesa= new Mesa();
			}

			if(this.mesaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMesa
				this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);

				this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.getfacturapuntoventa().setMesa(this.mesa);
			}

			return;
		}
		 else  if(sTipo.equals("NotaCreditoPuntoVenta")) {
			if(this.mesa==null) {
				this.mesa= new Mesa();
			}

			if(this.mesaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMesa
				this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);

				this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.getnotacreditopuntoventa().setMesa(this.mesa);
			}

			return;
		}
		 else  if(sTipo.equals("CajeroTurno")) {
			if(this.mesa==null) {
				this.mesa= new Mesa();
			}

			if(this.mesaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMesa
				this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);

				this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.getcajeroturno().setMesa(this.mesa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoMesa--;	
		
		
		this.mesaAux=new Mesa();
		
		this.mesaAux.setId(this.iIdNuevoMesa);
		this.mesaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mesaLogic.getMesas().add(this.mesaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.mesas.add(this.mesaAux);
		}
		//ARCHITECTURE
		
		this.mesa=this.mesaAux;
		
		if(MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMesa(this.mesa);
			this.setVariablesObjetoActualToFormularioForeignKeyMesa(this.mesa);
		}
				
		//this.setDefaultControlesMesa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMesa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMesa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMesa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMesa(this.mesaBean,this.mesa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MesaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.mesaSessionBean.getConGuardarRelaciones()) {
			classes=MesaConstantesFunciones.getClassesRelationshipsOfMesa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.mesaReturnGeneral=mesaLogic.procesarEventosMesasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mesaLogic.getMesas(),this.mesa,this.mesaParameterGeneral,this.isEsNuevoMesa,classes);//this.mesaLogic.getMesa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMesa(this.mesaReturnGeneral,this.mesaBean,false);
		
		if(this.mesaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMesa(this.mesaReturnGeneral.getMesa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMesa(this.mesaReturnGeneral.getMesa());
		}
		
		if(this.mesaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMesa(this.mesaReturnGeneral.getMesa(),classes);//this.mesaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMesa(this.mesa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMesa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMesa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MesaBeanSwingJInternalFrameAdditional.RecargarFormMesa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMesa(false);
						
			if(mesaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.getEsGuardarRelacionado() && PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoPuntoVentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getEsGuardarRelacionado() && FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaPuntoVentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() && NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoPuntoVentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.getEsGuardarRelacionado() && CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajeroTurnoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(MesaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMesa();
			}
			
			this.actualizarVisualTableDatosMesa();
			
			this.jTableDatosMesa.setRowSelectionInterval(this.getIndiceNuevoMesa(), this.getIndiceNuevoMesa());
			
			this.seleccionarFilaTablaMesaActual();
						
			this.actualizarEstadoCeldasBotonesMesa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMesa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMesa.jTextAreanombreMesa.setEnabled(isHabilitar && this.mesaConstantesFunciones.activarnombreMesa);
		this.jInternalFrameDetalleFormMesa.jTextFieldnumeroMesa.setEnabled(isHabilitar && this.mesaConstantesFunciones.activarnumeroMesa);	
		//
		this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.setEnabled(isHabilitar && this.mesaConstantesFunciones.activarid_empresaMesa);//
		this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.setEnabled(isHabilitar && this.mesaConstantesFunciones.activarid_sucursalMesa);
	};
	
	public void setDefaultControlesMesa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMesa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.mesaSessionBean.setConGuardarRelaciones(true);			
			this.mesaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.mesaSessionBean.setConGuardarRelaciones(false);			
			this.mesaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoMesa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mesa mesaAux:this.mesaLogic.getMesas()) {
				if(mesaAux.getId().equals(this.iIdNuevoMesa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mesa mesaAux:this.mesas) {
				if(mesaAux.getId().equals(this.iIdNuevoMesa)) {
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
	
	public int getIndiceActualMesa(Mesa mesa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mesa mesaAux:this.mesaLogic.getMesas()) {
				if(mesaAux.getId().equals(mesa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mesa mesaAux:this.mesas) {
				if(mesaAux.getId().equals(mesa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMesa(Mesa mesaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mesa mesaAux:this.mesaLogic.getMesas()) {
				if(mesaAux.getMesaOriginal().getId().equals(mesaOriginal.getId())) {
					existe=true;
					mesaOriginal.setId(mesaAux.getId());
					mesaOriginal.setVersionRow(mesaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mesa mesaAux:this.mesas) {
				if(mesaAux.getMesaOriginal().getId().equals(mesaOriginal.getId())) {
					existe=true;
					mesaOriginal.setId(mesaAux.getId());
					mesaOriginal.setVersionRow(mesaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMesa(Boolean esParaCancelar) throws Exception {
		mesasAux=new ArrayList<Mesa>();
		mesaAux=new Mesa();
		
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Mesa mesaAux:this.mesaLogic.getMesas()) {
					if(mesaAux.getId()<0) {
						mesasAux.add(mesaAux);
					}		
				}
				this.iIdNuevoMesa=0L;
				this.mesaLogic.getMesas().removeAll(mesasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Mesa mesaAux:this.mesas) {
					if(mesaAux.getId()<0) {
						mesasAux.add(mesaAux);
					}		
				}
				this.iIdNuevoMesa=0L;
				this.mesas.removeAll(mesasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMesa 
					&& this.mesaLogic.getMesas().size()>0
					) {
					mesaAux=this.mesaLogic.getMesas().get(this.mesaLogic.getMesas().size() - 1);
				
					if(mesaAux.getId()<0) {
						this.mesaLogic.getMesas().remove(mesaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMesa && this.mesas.size()>0) {
					mesaAux=this.mesas.get(this.mesas.size() - 1);
				
					if(mesaAux.getId()<0) {
						this.mesas.remove(mesaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMesa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(mesa.getId()<0) {
				this.mesaLogic.getMesas().remove(this.mesa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(mesa.getId()<0) {
				this.mesas.remove(this.mesa);
			}
		}			
	}
	
	public void setEstadosInicialesMesa(List<Mesa> mesasAux) throws Exception {
		MesaConstantesFunciones.setEstadosInicialesMesa(mesasAux);
	}
	
	public void setEstadosInicialesMesa(Mesa mesaAux) throws Exception {
		MesaConstantesFunciones.setEstadosInicialesMesa(mesaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMesaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMesa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMesaActual()) {
				if(!this.isEsNuevoMesa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMesa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMesa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMesaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Mesa ?", "MANTENIMIENTO DE Mesa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMesa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Mesa mesa) throws Exception {
		MesaConstantesFunciones.seleccionarAsignar(this.mesa,mesa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMesa=this.isPermisoActualizarOriginalMesa;
			
			
			this.seleccionarAsignar(mesa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MesaConstantesFunciones.quitarEspaciosMesa(this.mesa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMesa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.mesaSessionBean.setsFuncionBusquedaRapida(this.mesaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMesa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMesa(esParaCancelar);				
				this.cancelarNuevoMesa(esParaCancelar);								
			}
			
			this.mesa=new Mesa();
			
			this.inicializarMesa();
			
			this.actualizarEstadoCeldasBotonesMesa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMesa() throws Exception {
		try {
			MesaConstantesFunciones.inicializarMesa(this.mesa);
			
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
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.mesaLogic.getMesas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMesas(String sAccionBusqueda,List<Mesa> mesasParaReportes) throws Exception {
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
					sPathReporteFinal="Mesa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MesaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MesaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Mesa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Mesas");		
		parameters.put("busquedapor", MesaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PedidoPuntoVenta.class));
			classes.add(new Classe(FacturaPuntoVenta.class));
			classes.add(new Classe(NotaCreditoPuntoVenta.class));
			classes.add(new Classe(CajeroTurno.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					MesaLogic mesaLogicAuxiliar=new MesaLogic();
					mesaLogicAuxiliar.setDatosCliente(mesaLogic.getDatosCliente());				
					mesaLogicAuxiliar.setMesas(mesasParaReportes);
					
					mesaLogicAuxiliar.cargarRelacionesLoteForeignKeyMesaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					mesasParaReportes=mesaLogicAuxiliar.getMesas();
					
					//mesaLogic.getNewConnexionToDeep();
					
					//for (Mesa mesa:mesasParaReportes) {
					//	mesaLogic.deepLoad(mesa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//mesaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//mesaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePedidoPuntoVenta = AuxiliarReportes.class.getResourceAsStream("PedidoPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidopuntoventa", reportFilePedidoPuntoVenta);

			InputStream reportFileFacturaPuntoVenta = AuxiliarReportes.class.getResourceAsStream("FacturaPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_facturapuntoventa", reportFileFacturaPuntoVenta);

			InputStream reportFileNotaCreditoPuntoVenta = AuxiliarReportes.class.getResourceAsStream("NotaCreditoPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_notacreditopuntoventa", reportFileNotaCreditoPuntoVenta);

			InputStream reportFileCajeroTurno = AuxiliarReportes.class.getResourceAsStream("CajeroTurnoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cajeroturno", reportFileCajeroTurno);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMesa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MesaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MesaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMesa=new JRBeanArrayDataSource(MesaJInternalFrame.TraerMesaBeans(mesasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMesa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MesaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MesaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MesaBean.TraerMesaBeans(mesasParaReportes).toArray()));
							
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
				this.generarExcelReporteMesas(sAccionBusqueda,sTipoArchivoReporte,mesasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMesas(sAccionBusqueda,sTipoArchivoReporte,mesasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMesaActionPerformed(null);
					//this.generarExcelReporteMesas(sAccionBusqueda,sTipoArchivoReporte,mesasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMesas(sAccionBusqueda,sTipoArchivoReporte,mesasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMesas(sAccionBusqueda,sTipoArchivoReporte,mesasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMesas(sAccionBusqueda,sTipoArchivoReporte,mesasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMesas(String sAccionBusqueda,String sTipoArchivoReporte,List<Mesa> mesasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mesa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Mesas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMesa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Mesa mesa : mesasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MesaConstantesFunciones.generarExcelReporteDataMesa("NORMAL",row,workbook,mesa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMesa(String sTipo,Row row,Workbook workbook) {
		
		MesaConstantesFunciones.generarExcelReporteHeaderMesa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMesas(String sAccionBusqueda,String sTipoArchivoReporte,List<Mesa> mesasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mesa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Mesas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Mesa mesa : mesasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MesaConstantesFunciones.getMesaDescripcion(mesa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MesaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MesaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mesa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MesaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MesaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mesa.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MesaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MesaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mesa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MesaConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MesaConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mesa.getnumero());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMesas(String sAccionBusqueda,String sTipoArchivoReporte,List<Mesa> mesasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Mesa> mesasRespaldo=null;
		
		classes=MesaConstantesFunciones.getClassesRelationshipsOfMesa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.mesaLogic.setDatosCliente(this.datosCliente);
		this.mesaLogic.setDatosDeep(this.datosDeep);
		this.mesaLogic.setIsConDeep(true);
		
		mesasRespaldo=this.mesaLogic.getMesas();
		
		this.mesaLogic.setMesas(mesasParaReportes);	
		this.mesaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		mesasParaReportes=this.mesaLogic.getMesas();
		this.mesaLogic.setMesas(mesasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mesa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Mesas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMesa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Mesa mesa : mesasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMesa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MesaConstantesFunciones.generarExcelReporteDataMesa("NORMAL",row,workbook,mesa,cellStyleDataAux);
		
			
			


				//PedidoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(mesa.getPedidoPuntoVentas()!=null && mesa.getPedidoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoPuntoVentaConstantesFunciones.generarExcelReporteHeaderPedidoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(mesa.getPedidoPuntoVentas()!=null) {
					i2=0;
					for(PedidoPuntoVenta pedidopuntoventa : mesa.getPedidoPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoPuntoVentaConstantesFunciones.generarExcelReporteDataPedidoPuntoVenta("RELACIONADO",row,workbook,pedidopuntoventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FacturaPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(mesa.getFacturaPuntoVentas()!=null && mesa.getFacturaPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaPuntoVentaConstantesFunciones.generarExcelReporteHeaderFacturaPuntoVenta("RELACIONADO",row,workbook);
				}

				if(mesa.getFacturaPuntoVentas()!=null) {
					i2=0;
					for(FacturaPuntoVenta facturapuntoventa : mesa.getFacturaPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaPuntoVentaConstantesFunciones.generarExcelReporteDataFacturaPuntoVenta("RELACIONADO",row,workbook,facturapuntoventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//NotaCreditoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(mesa.getNotaCreditoPuntoVentas()!=null && mesa.getNotaCreditoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NotaCreditoPuntoVentaConstantesFunciones.generarExcelReporteHeaderNotaCreditoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(mesa.getNotaCreditoPuntoVentas()!=null) {
					i2=0;
					for(NotaCreditoPuntoVenta notacreditopuntoventa : mesa.getNotaCreditoPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						NotaCreditoPuntoVentaConstantesFunciones.generarExcelReporteDataNotaCreditoPuntoVenta("RELACIONADO",row,workbook,notacreditopuntoventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CajeroTurno
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO))) {

				if(mesa.getCajeroTurnos()!=null && mesa.getCajeroTurnos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CajeroTurnoConstantesFunciones.generarExcelReporteHeaderCajeroTurno("RELACIONADO",row,workbook);
				}

				if(mesa.getCajeroTurnos()!=null) {
					i2=0;
					for(CajeroTurno cajeroturno : mesa.getCajeroTurnos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CajeroTurnoConstantesFunciones.generarExcelReporteDataCajeroTurno("RELACIONADO",row,workbook,cajeroturno,cellStyleDataAuxHijo);
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
		cell.setCellValue(MesaConstantesFunciones.getMesaDescripcion(mesa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMesa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMesa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMesa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMesa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMesa() throws Exception {		
		this.startProcessMesa(true);
	}
	
	public void startProcessMesa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMesa ,this.jPanelParametrosReportesMesa, this.jScrollPanelDatosMesa,this.jPanelPaginacionMesa, this.jScrollPanelDatosEdicionMesa, this.jPanelAccionesMesa,this.jPanelAccionesFormularioMesa,this.jmenuBarMesa,this.jmenuBarDetalleMesa,this.jTtoolBarMesa,this.jTtoolBarDetalleMesa);		
		
		final JTabbedPane jTabbedPaneBusquedasMesa=this.jTabbedPaneBusquedasMesa; 
		
		final JPanel jPanelParametrosReportesMesa=this.jPanelParametrosReportesMesa;
		//final JScrollPane jScrollPanelDatosMesa=this.jScrollPanelDatosMesa;
		final JTable jTableDatosMesa=this.jTableDatosMesa;		
		final JPanel jPanelPaginacionMesa=this.jPanelPaginacionMesa;
		//final JScrollPane jScrollPanelDatosEdicionMesa=this.jScrollPanelDatosEdicionMesa;
		final JPanel jPanelAccionesMesa=this.jPanelAccionesMesa;
		
		JPanel jPanelCamposAuxiliarMesa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMesa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMesa!=null) {
			jPanelCamposAuxiliarMesa=this.jInternalFrameDetalleFormMesa.jPanelCamposMesa;
			jPanelAccionesFormularioAuxiliarMesa=this.jInternalFrameDetalleFormMesa.jPanelAccionesFormularioMesa;
		}
		
		final JPanel jPanelCamposMesa=jPanelCamposAuxiliarMesa;
		final JPanel jPanelAccionesFormularioMesa=jPanelAccionesFormularioAuxiliarMesa;
		
		
		final JMenuBar jmenuBarMesa=this.jmenuBarMesa;
		final JToolBar jTtoolBarMesa=this.jTtoolBarMesa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMesa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMesa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMesa!=null) {
			jmenuBarDetalleAuxiliarMesa=this.jInternalFrameDetalleFormMesa.jmenuBarDetalleMesa;
			jTtoolBarDetalleAuxiliarMesa=this.jInternalFrameDetalleFormMesa.jTtoolBarDetalleMesa;
		}
		
		final JMenuBar jmenuBarDetalleMesa=jmenuBarDetalleAuxiliarMesa;
		final JToolBar jTtoolBarDetalleMesa=jTtoolBarDetalleAuxiliarMesa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMesa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMesa;
			processRunnable.jTableDatos=jTableDatosMesa;
			processRunnable.jPanelCampos=jPanelCamposMesa;
			processRunnable.jPanelPaginacion=jPanelPaginacionMesa;
			processRunnable.jPanelAcciones=jPanelAccionesMesa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMesa;
			
			
			processRunnable.jmenuBar=jmenuBarMesa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMesa;
			processRunnable.jTtoolBar=jTtoolBarMesa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMesa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMesa ,jPanelParametrosReportesMesa,jTableDatosMesa, /*jScrollPanelDatosMesa,*/jPanelCamposMesa,jPanelPaginacionMesa, /*jScrollPanelDatosEdicionMesa,*/ jPanelAccionesMesa,jPanelAccionesFormularioMesa,jmenuBarMesa,jmenuBarDetalleMesa,jTtoolBarMesa,jTtoolBarDetalleMesa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMesa ,jPanelParametrosReportesMesa, jScrollPanelDatosMesa,jPanelPaginacionMesa, jScrollPanelDatosEdicionMesa, jPanelAccionesMesa,jPanelAccionesFormularioMesa,jmenuBarMesa,jmenuBarDetalleMesa,jTtoolBarMesa,jTtoolBarDetalleMesa);
						
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
	
	public void finishProcessMesa() {// throws Exception 
		this.finishProcessMesa(true);
	}
	
	public void finishProcessMesa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMesa ,this.jPanelParametrosReportesMesa, this.jScrollPanelDatosMesa,this.jPanelPaginacionMesa, this.jScrollPanelDatosEdicionMesa, this.jPanelAccionesMesa,this.jPanelAccionesFormularioMesa,this.jmenuBarMesa,this.jmenuBarDetalleMesa,this.jTtoolBarMesa,this.jTtoolBarDetalleMesa);		
		
		final JTabbedPane jTabbedPaneBusquedasMesa=this.jTabbedPaneBusquedasMesa; 
		
		final JPanel jPanelParametrosReportesMesa=this.jPanelParametrosReportesMesa;
		//final JScrollPane jScrollPanelDatosMesa=this.jScrollPanelDatosMesa;
		final JTable jTableDatosMesa=this.jTableDatosMesa;		
		final JPanel jPanelPaginacionMesa=this.jPanelPaginacionMesa;
		//final JScrollPane jScrollPanelDatosEdicionMesa=this.jScrollPanelDatosEdicionMesa;
		final JPanel jPanelAccionesMesa=this.jPanelAccionesMesa;
		
		JPanel jPanelCamposAuxiliarMesa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMesa=new JPanel();
		
		if(this.jInternalFrameDetalleFormMesa!=null) {
			jPanelCamposAuxiliarMesa=this.jInternalFrameDetalleFormMesa.jPanelCamposMesa;
			jPanelAccionesFormularioAuxiliarMesa=this.jInternalFrameDetalleFormMesa.jPanelAccionesFormularioMesa;
		}
		
		final JPanel jPanelCamposMesa=jPanelCamposAuxiliarMesa;
		final JPanel jPanelAccionesFormularioMesa=jPanelAccionesFormularioAuxiliarMesa;
		
		
		final JMenuBar jmenuBarMesa=this.jmenuBarMesa;		
		final JToolBar jTtoolBarMesa=this.jTtoolBarMesa;
				
		JMenuBar jmenuBarDetalleAuxiliarMesa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMesa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMesa!=null) {
			jmenuBarDetalleAuxiliarMesa=this.jInternalFrameDetalleFormMesa.jmenuBarDetalleMesa;
			jTtoolBarDetalleAuxiliarMesa=this.jInternalFrameDetalleFormMesa.jTtoolBarDetalleMesa;		
		}
		
		final JMenuBar jmenuBarDetalleMesa=jmenuBarDetalleAuxiliarMesa;
		final JToolBar jTtoolBarDetalleMesa=jTtoolBarDetalleAuxiliarMesa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMesa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMesa;
			processRunnable.jTableDatos=jTableDatosMesa;
			processRunnable.jPanelCampos=jPanelCamposMesa;
			processRunnable.jPanelPaginacion=jPanelPaginacionMesa;
			processRunnable.jPanelAcciones=jPanelAccionesMesa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMesa;
			
			
			processRunnable.jmenuBar=jmenuBarMesa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMesa;
			processRunnable.jTtoolBar=jTtoolBarMesa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMesa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMesa ,jPanelParametrosReportesMesa, jTableDatosMesa,/*jScrollPanelDatosMesa,*/jPanelCamposMesa,jPanelPaginacionMesa, /*jScrollPanelDatosEdicionMesa,*/ jPanelAccionesMesa,jPanelAccionesFormularioMesa,jmenuBarMesa,jmenuBarDetalleMesa,jTtoolBarMesa,jTtoolBarDetalleMesa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMesa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMesa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMesa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMesa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMesa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMesa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMesa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMesa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMesa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.mesaConstantesFunciones.getsFinalQueryMesa();
		String  finalQueryPaginacionTodos=this.mesaConstantesFunciones.getsFinalQueryMesa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MesaConstantesFunciones.getArrayColumnasGlobalesNoMesa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MesaConstantesFunciones.getArrayColumnasGlobalesMesa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MesaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.mesasEliminados= new ArrayList<Mesa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMesa();
		
				///*MesaSessionBean*/this.mesaSessionBean=new MesaSessionBean();
			
			if(this.mesaSessionBean==null) {
				this.mesaSessionBean=new MesaSessionBean();
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
					this.iNumeroPaginacion=MesaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MesaConstantesFunciones.getClassesForeignKeysOfMesa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/mesa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			mesasAux= new ArrayList<Mesa>();
			
				
			mesaLogic.setDatosCliente(this.datosCliente);
			mesaLogic.setDatosDeep(this.datosDeep);
			mesaLogic.setIsConDeep(true);
			
			
			mesaLogic.getMesaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					mesaLogic.getTodosMesas(finalQueryGlobal,pagination);
					
					//mesaLogic.getTodosMesasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(mesaLogic.getMesas()==null|| mesaLogic.getMesas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mesasAux= new ArrayList<Mesa>();
							mesasAux.addAll(mesaLogic.getMesas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mesasAux= new ArrayList<Mesa>();
							mesasAux.addAll(mesas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mesaLogic.getTodosMesas(finalQueryGlobal+"",this.pagination);												
							
							//mesaLogic.getTodosMesasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMesas("Todos",mesaLogic.getMesas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mesaLogic.setMesas(new ArrayList<Mesa>());					
							mesaLogic.getMesas().addAll(mesasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mesas=new ArrayList<Mesa>();
							mesas.addAll(mesasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMesa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMesa=this.idActual;
				
				} else if(this.idMesaActual!=null && this.idMesaActual!=0L) {
					idMesa=idMesaActual;
				}
				
					
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndicePorId(idMesa);
				
				this.mesas=new ArrayList<Mesa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					mesaLogic.getEntity(idMesa);
					
					//mesaLogic.getEntityWithConnection(idMesa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesaLogic.setMesas(new ArrayList<Mesa>());
					mesaLogic.getMesas().add(mesaLogic.getMesa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mesas=new ArrayList<Mesa>();
					this.mesas.add(mesa);
				}
				
				if(mesaLogic.getMesa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mesaLogic.getMesasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mesaLogic.getMesas()==null||mesaLogic.getMesas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mesas==null|| mesas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mesasAux=new ArrayList<Mesa>();
						mesasAux.addAll(mesaLogic.getMesas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mesasAux=new ArrayList<Mesa>();
							mesasAux.addAll(mesas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mesaLogic.getMesasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMesas("FK_IdEmpresa",mesaLogic.getMesas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMesas("FK_IdEmpresa",mesas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mesaLogic.setMesas(new ArrayList<Mesa>());
						mesaLogic.getMesas().addAll(mesasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mesas=new ArrayList<Mesa>();
							mesas.addAll(mesasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mesaLogic.getMesasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mesaLogic.getMesas()==null||mesaLogic.getMesas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mesas==null|| mesas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mesasAux=new ArrayList<Mesa>();
						mesasAux.addAll(mesaLogic.getMesas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mesasAux=new ArrayList<Mesa>();
							mesasAux.addAll(mesas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mesaLogic.getMesasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MesaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMesas("FK_IdSucursal",mesaLogic.getMesas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMesas("FK_IdSucursal",mesas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mesaLogic.setMesas(new ArrayList<Mesa>());
						mesaLogic.getMesas().addAll(mesasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mesas=new ArrayList<Mesa>();
							mesas.addAll(mesasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMesa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMesa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mesaLogic.getMesas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mesas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mesaLogic.getMesas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mesas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Mesa mesa) {
		Boolean permite=true;
		
		if(this.mesa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MesaConstantesFunciones.getOrderByListaMesa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MesaConstantesFunciones.getOrderByListaMesa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mesa mesa:mesaLogic.getMesas()) {
				if(mesa.getsType().equals(Constantes2.S_TOTALES)) {
					mesaTotales=mesa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mesa mesa:this.mesas) {
				if(mesa.getsType().equals(Constantes2.S_TOTALES)) {
					mesaTotales=mesa;
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
			this.mesaAux=new Mesa();
			this.mesaAux.setsType(Constantes2.S_TOTALES);
			this.mesaAux.setIsNew(false);
			this.mesaAux.setIsChanged(false);
			this.mesaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MesaConstantesFunciones.TotalizarValoresFilaMesa(this.mesaLogic.getMesas(),this.mesaAux);
				
				this.mesaLogic.getMesas().add(this.mesaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MesaConstantesFunciones.TotalizarValoresFilaMesa(this.mesas,this.mesaAux);
				
				this.mesas.add(this.mesaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		mesaTotales=new Mesa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mesaLogic.getMesas().remove(mesaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mesas.remove(mesaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		mesaTotales=new Mesa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mesa mesa:mesaLogic.getMesas()) {
				if(mesa.getsType().equals(Constantes2.S_TOTALES)) {
					mesaTotales=mesa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MesaConstantesFunciones.TotalizarValoresFilaMesa(this.mesaLogic.getMesas(),mesaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mesa mesa:this.mesas) {
				if(mesa.getsType().equals(Constantes2.S_TOTALES)) {
					mesaTotales=mesa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MesaConstantesFunciones.TotalizarValoresFilaMesa(this.mesas,mesaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMesasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMesasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMesasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesaLogic.getMesasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMesasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesaLogic.getMesasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosMesa() {
		this.isPermisoTodoMesa=false;
		this.isPermisoNuevoMesa=false;
		this.isPermisoActualizarMesa=false;
		this.isPermisoActualizarOriginalMesa=false;
		this.isPermisoEliminarMesa=false;
		this.isPermisoGuardarCambiosMesa=false;
		this.isPermisoConsultaMesa=false;
		this.isPermisoBusquedaMesa=false;
		this.isPermisoReporteMesa=false;		
		this.isPermisoOrdenMesa=false;		
		this.isPermisoPaginacionMedioMesa=false;		
		this.isPermisoPaginacionAltoMesa=false;
		this.isPermisoPaginacionTodoMesa=false;
		this.isPermisoCopiarMesa=false;		
		this.isPermisoVerFormMesa=false;		
		this.isPermisoDuplicarMesa=false;		
		this.isPermisoOrdenMesa=false;		
	}
	
	public void setPermisosUsuarioMesa(Boolean isPermiso) {
		this.isPermisoTodoMesa=isPermiso;
		this.isPermisoNuevoMesa=isPermiso;
		this.isPermisoActualizarMesa=isPermiso;
		this.isPermisoActualizarOriginalMesa=isPermiso;
		this.isPermisoEliminarMesa=isPermiso;
		this.isPermisoGuardarCambiosMesa=isPermiso;
		this.isPermisoConsultaMesa=isPermiso;
		this.isPermisoBusquedaMesa=isPermiso;
		this.isPermisoReporteMesa=isPermiso;
		this.isPermisoOrdenMesa=isPermiso;		
		this.isPermisoPaginacionMedioMesa=isPermiso;		
		this.isPermisoPaginacionAltoMesa=isPermiso;		
		this.isPermisoPaginacionTodoMesa=isPermiso;		
		this.isPermisoCopiarMesa=isPermiso;		
		this.isPermisoVerFormMesa=isPermiso;		
		this.isPermisoDuplicarMesa=isPermiso;
		this.isPermisoOrdenMesa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMesa(Boolean isPermiso) {
		//this.isPermisoTodoMesa=isPermiso;
		this.isPermisoNuevoMesa=isPermiso;
		this.isPermisoActualizarMesa=isPermiso;
		this.isPermisoActualizarOriginalMesa=isPermiso;
		this.isPermisoEliminarMesa=isPermiso;
		this.isPermisoGuardarCambiosMesa=isPermiso;
		//this.isPermisoConsultaMesa=isPermiso;
		//this.isPermisoBusquedaMesa=isPermiso;
		//this.isPermisoReporteMesa=isPermiso;
		//this.isPermisoOrdenMesa=isPermiso;		
		//this.isPermisoPaginacionMedioMesa=isPermiso;		
		//this.isPermisoPaginacionAltoMesa=isPermiso;		
		//this.isPermisoPaginacionTodoMesa=isPermiso;		
		//this.isPermisoCopiarMesa=isPermiso;		
		//this.isPermisoDuplicarMesa=isPermiso;
		//this.isPermisoOrdenMesa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMesaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PedidoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(NotaCreditoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CajeroTurnoConstantesFunciones.SNOMBREOPCION);
		
		if(MesaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPedidoPuntoVenta=false;
		this.isTienePermisosPedidoPuntoVenta=this.verificarGetPermisosUsuarioOpcionMesaClaseRelacionada(this.opcionsRelacionadas,PedidoPuntoVentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFacturaPuntoVenta=false;
		this.isTienePermisosFacturaPuntoVenta=this.verificarGetPermisosUsuarioOpcionMesaClaseRelacionada(this.opcionsRelacionadas,FacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosNotaCreditoPuntoVenta=false;
		this.isTienePermisosNotaCreditoPuntoVenta=this.verificarGetPermisosUsuarioOpcionMesaClaseRelacionada(this.opcionsRelacionadas,NotaCreditoPuntoVentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCajeroTurno=false;
		this.isTienePermisosCajeroTurno=this.verificarGetPermisosUsuarioOpcionMesaClaseRelacionada(this.opcionsRelacionadas,CajeroTurnoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebMesa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMesaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPedidoPuntoVenta=conPermiso;
		this.isTienePermisosFacturaPuntoVenta=conPermiso;
		this.isTienePermisosNotaCreditoPuntoVenta=conPermiso;
		this.isTienePermisosCajeroTurno=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioMesaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMesaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMesaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPedidoPuntoVenta && this.jInternalFrameDetalleFormMesa!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.remove(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFacturaPuntoVenta && this.jInternalFrameDetalleFormMesa!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.remove(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosNotaCreditoPuntoVenta && this.jInternalFrameDetalleFormMesa!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.remove(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCajeroTurno && this.jInternalFrameDetalleFormMesa!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.remove(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioMesa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MesaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.mesaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MesaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMesa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMesa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMesa=this.isPermisoActualizarMesa;
			this.isPermisoEliminarMesa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMesa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMesa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMesa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMesa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMesa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMesa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMesa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMesa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMesa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMesa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMesa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMesa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMesa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.mesaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMesa.setToolTipText(this.jTableDatosMesa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMesa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMesa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MesaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MesaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMesa() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPedidoPuntoVenta && this.mesaConstantesFunciones.mostrarPedidoPuntoVentaMesa && !MesaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Punto Venta");
			reporte.setsDescripcion("Pedido Punto Venta");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFacturaPuntoVenta && this.mesaConstantesFunciones.mostrarFacturaPuntoVentaMesa && !MesaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura Punto Venta");
			reporte.setsDescripcion("Factura Punto Venta");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosNotaCreditoPuntoVenta && this.mesaConstantesFunciones.mostrarNotaCreditoPuntoVentaMesa && !MesaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Nota Credito");
			reporte.setsDescripcion("Nota Credito");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCajeroTurno && this.mesaConstantesFunciones.mostrarCajeroTurnoMesa && !MesaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cajero Turno");
			reporte.setsDescripcion("Cajero Turno");
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
	public void inicializarCombosForeignKeyMesaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMesaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MesaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMesaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyMesaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MesaParameterReturnGeneral mesaReturnGeneral=new MesaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.mesaConstantesFunciones.cargarid_empresaMesa)
					 || (this.esRecargarFks && this.mesaConstantesFunciones.cargarid_empresaMesa)) {

					if(!this.mesaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+mesaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.mesaConstantesFunciones.cargarid_sucursalMesa)
					 || (this.esRecargarFks && this.mesaConstantesFunciones.cargarid_sucursalMesa)) {

					if(!this.mesaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+mesaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				mesaReturnGeneral=mesaLogic.cargarCombosLoteForeignKeyMesa(finalQueryGlobalEmpresa,finalQueryGlobalSucursal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=mesaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=mesaReturnGeneral.getsucursalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMesa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.mesaSessionBean==null) {
				this.mesaSessionBean=new MesaSessionBean();
			}

			if(!this.mesaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.mesaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyMesa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMesa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMesa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMesa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMesa(Mesa mesa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMesa(Mesa mesa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMesa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMesa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMesa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMesa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMesa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMesa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMesa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMesa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa!=null && this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.getItemCount()>0) {
				this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa!=null && this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.getItemCount()>0) {
				this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public MesaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MesaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MesaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.mesaSessionBean=new MesaSessionBean(); 
		this.mesaConstantesFunciones=new MesaConstantesFunciones(); 
		this.mesaBean=new Mesa();//(this.mesaConstantesFunciones); 		
		this.mesaReturnGeneral=new MesaParameterReturnGeneral(); 
		
		this.mesaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mesaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MesaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MesaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MesaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMesa(true);
			
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
			
			this.mesaConstantesFunciones=new MesaConstantesFunciones(); 
			this.mesaBean=new Mesa();//this.mesaConstantesFunciones); 			
			this.mesaReturnGeneral=new MesaParameterReturnGeneral(); 
		
			MesaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mesa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.mesa=new Mesa();
			this.mesas = new ArrayList<Mesa>();
			this.mesasAux = new ArrayList<Mesa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic=new MesaLogic();
				this.mesaLogic.getNewConnexionToDeep("");
			}
			
			//this.mesaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.mesaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMesa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMesa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMesa);	
					}
					
					if(this.jInternalFrameImportacionMesa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMesa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMesa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMesa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMesa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMesa);
				this.jInternalFrameDetalleFormMesa.setVisible(false);
				this.jInternalFrameDetalleFormMesa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMesa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMesa);
					this.jInternalFrameReporteDinamicoMesa.setVisible(false);
					this.jInternalFrameReporteDinamicoMesa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMesa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMesa);
					this.jInternalFrameImportacionMesa.setVisible(false);
					this.jInternalFrameImportacionMesa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMesa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMesa);
					this.jInternalFrameOrderByMesa.setVisible(false);
					this.jInternalFrameOrderByMesa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMesaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MesaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.mesaReturnGeneral=new MesaParameterReturnGeneral();
			
			this.mesaParameterGeneral=new MesaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.mesaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MesaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.mesaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PedidoPuntoVentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(NotaCreditoPuntoVentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CajeroTurnoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MesaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mesaSessionBean.getEsGuardarRelacionado(),this.mesaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MesaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mesaSessionBean.getEsGuardarRelacionado(),this.mesaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMesa=false;
			this.isVisibilidadCeldaDuplicarMesa=true;
			this.isVisibilidadCeldaCopiarMesa=true;
			this.isVisibilidadCeldaVerFormMesa=true;
			this.isVisibilidadCeldaOrdenMesa=true;
			this.isVisibilidadCeldaNuevoRelacionesMesa=false;
			this.isVisibilidadCeldaModificarMesa=false;
			this.isVisibilidadCeldaActualizarMesa=false;
			this.isVisibilidadCeldaEliminarMesa=false;
			this.isVisibilidadCeldaCancelarMesa=false;
			this.isVisibilidadCeldaGuardarMesa=false;
			this.isVisibilidadCeldaGuardarCambiosMesa=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMesa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMesa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMesa(false);
			
			this.setPermisosUsuarioMesa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mesaSessionBean.getEsGuardarRelacionado() 
				|| (this.mesaSessionBean.getEsGuardarRelacionado() && this.mesaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMesaClasesRelacionadas();
			}
			
			if(this.mesaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMesaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MesaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMesa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMesa();
			}
			
			if(!this.isPermisoBusquedaMesa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMesa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mesaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMesa,this.isPermisoPaginacionMedioMesa,this.isPermisoPaginacionTodoMesa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MesaConstantesFunciones.getTiposSeleccionarMesa());
				
				this.tiposColumnasSelect=MesaConstantesFunciones.getTiposSeleccionarMesa(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectMesa();				
				//this.tiposRelacionesSelect=MesaConstantesFunciones.getTiposRelacionesMesa(true);
				
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
			//if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMesa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioMesa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioMesa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMesa() ;
			
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
			
			
			this.pedidopuntoventaLogic=new PedidoPuntoVentaLogic();
			this.facturapuntoventaLogic=new FacturaPuntoVentaLogic();
			this.notacreditopuntoventaLogic=new NotaCreditoPuntoVentaLogic();
			this.cajeroturnoLogic=new CajeroTurnoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				mesaImplementable= (MesaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MesaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				mesaImplementableHome= (MesaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MesaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.mesas= new ArrayList<Mesa>();
			this.mesasEliminados= new ArrayList<Mesa>();
						
			this.isEsNuevoMesa=false;
			this.esParaAccionDesdeFormularioMesa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMesa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMesa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MesaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MesaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMesa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMesa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMesa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMesa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMesa();
			}
			
			MesaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMesa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMesa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMesa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMesa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Mesa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMesa() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMesa")) {
				iIndex=this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMesa.getSelectedRow();	
				
				

				if(sTitle.equals("Cajero Turnos")) {
					if(!CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMesa();

						this.cargarParteTabPanelRelacionadaCajeroTurno(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Factura Punto Ventas")) {
					if(!FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMesa();

						this.cargarParteTabPanelRelacionadaFacturaPuntoVenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Nota Creditos")) {
					if(!NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMesa();

						this.cargarParteTabPanelRelacionadaNotaCreditoPuntoVenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedido Punto Ventas")) {
					if(!PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMesa();

						this.cargarParteTabPanelRelacionadaPedidoPuntoVenta(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMesa();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCajeroTurno(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMesa.cargarSessionConBeanSwingJInternalFrameCajeroTurno(false,true,iIndex);
		this.jButtonCajeroTurnoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCajeroTurno();

		//this.jTabbedPaneRelacionesMesa.updateUI();
		//this.jTabbedPaneRelacionesMesa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMesa.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFacturaPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMesa.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(false,true,iIndex);
		this.jButtonFacturaPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFacturaPuntoVenta();

		//this.jTabbedPaneRelacionesMesa.updateUI();
		//this.jTabbedPaneRelacionesMesa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMesa.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaNotaCreditoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMesa.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(false,true,iIndex);
		this.jButtonNotaCreditoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNotaCreditoPuntoVenta();

		//this.jTabbedPaneRelacionesMesa.updateUI();
		//this.jTabbedPaneRelacionesMesa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMesa.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedidoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMesa.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(false,true,iIndex);
		this.jButtonPedidoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoPuntoVenta();

		//this.jTabbedPaneRelacionesMesa.updateUI();
		//this.jTabbedPaneRelacionesMesa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMesa.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PedidoPuntoVenta")) {
				int row=this.jTableDatosMesa.getSelectedRow();
				jButtonPedidoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FacturaPuntoVenta")) {
				int row=this.jTableDatosMesa.getSelectedRow();
				jButtonFacturaPuntoVentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("NotaCreditoPuntoVenta")) {
				int row=this.jTableDatosMesa.getSelectedRow();
				jButtonNotaCreditoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CajeroTurno")) {
				int row=this.jTableDatosMesa.getSelectedRow();
				jButtonCajeroTurnoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pedido Punto Venta")) {

					if(this.isTienePermisosPedidoPuntoVenta && this.mesaConstantesFunciones.mostrarPedidoPuntoVentaMesa && !MesaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Punto Ventas"+"("+PedidoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Punto Ventas");

						if(mesaConstantesFunciones.resaltarPedidoPuntoVentaMesa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(mesaConstantesFunciones.resaltarPedidoPuntoVentaMesa);
						}

						jmenuItem.setEnabled(this.mesaConstantesFunciones.activarPedidoPuntoVentaMesa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoPuntoVenta"));

						

						this.jInternalFrameDetalleFormMesa.jmenuDetalleMesa.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Factura Punto Venta")) {

					if(this.isTienePermisosFacturaPuntoVenta && this.mesaConstantesFunciones.mostrarFacturaPuntoVentaMesa && !MesaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Factura Punto Ventas"+"("+FacturaPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Factura Punto Ventas");

						if(mesaConstantesFunciones.resaltarFacturaPuntoVentaMesa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(mesaConstantesFunciones.resaltarFacturaPuntoVentaMesa);
						}

						jmenuItem.setEnabled(this.mesaConstantesFunciones.activarFacturaPuntoVentaMesa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FacturaPuntoVenta"));

						

						this.jInternalFrameDetalleFormMesa.jmenuDetalleMesa.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Nota Credito")) {

					if(this.isTienePermisosNotaCreditoPuntoVenta && this.mesaConstantesFunciones.mostrarNotaCreditoPuntoVentaMesa && !MesaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Nota Creditos"+"("+NotaCreditoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Nota Creditos");

						if(mesaConstantesFunciones.resaltarNotaCreditoPuntoVentaMesa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(mesaConstantesFunciones.resaltarNotaCreditoPuntoVentaMesa);
						}

						jmenuItem.setEnabled(this.mesaConstantesFunciones.activarNotaCreditoPuntoVentaMesa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NotaCreditoPuntoVenta"));

						

						this.jInternalFrameDetalleFormMesa.jmenuDetalleMesa.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cajero Turno")) {

					if(this.isTienePermisosCajeroTurno && this.mesaConstantesFunciones.mostrarCajeroTurnoMesa && !MesaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cajero Turnos"+"("+CajeroTurnoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cajero Turnos");

						if(mesaConstantesFunciones.resaltarCajeroTurnoMesa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(mesaConstantesFunciones.resaltarCajeroTurnoMesa);
						}

						jmenuItem.setEnabled(this.mesaConstantesFunciones.activarCajeroTurnoMesa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CajeroTurno"));

						

						this.jInternalFrameDetalleFormMesa.jmenuDetalleMesa.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyMesa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMesa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMesa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMesaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMesa();
		
		this.cargarCombosFrameForeignKeyMesa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMesa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMesa();
		}
	}
	
	
	
	public void jButtonNuevoMesaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.mesaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
			
			if(jTableDatosMesa.getRowCount()>=1) {
				jTableDatosMesa.removeRowSelectionInterval(0, jTableDatosMesa.getRowCount()-1);						
			}
			
			this.isEsNuevoMesa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMesa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMesa(true);			
			//this.mesa=new Mesa();
			//this.mesa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMesa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMesa() ;
			
			if(MesaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMesa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.mesa);	
			this.actualizarInformacion("INFO_PADRE",false,this.mesa);				
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
			if(this.mesaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Mesa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMesaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMesa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMesa.getSelectedRows().length;			
			}
			
			mesasSeleccionados=this.getMesasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMesa--;			
				//Mesa mesaAux= new Mesa();			
				//mesaAux.setId(this.iIdNuevoMesa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Mesa mesaOrigen=new Mesa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Mesa mesaOrigen : mesasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMesa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							mesaOrigen =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mesaOrigen =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMesa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.mesa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMesa(mesaOrigen,this.mesa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mesaLogic.getMesas().add(this.mesaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mesas.add(this.mesaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMesa(false);
				
				this.jTableDatosMesa.setRowSelectionInterval(this.getIndiceNuevoMesa(), this.getIndiceNuevoMesa());
				
				int iLastRow =  this.jTableDatosMesa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMesa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMesa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMesa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMesaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();									
		
			Mesa mesaOrigen=new Mesa();
			Mesa mesaDestino=new Mesa();
				
			mesasSeleccionados=this.getMesasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMesa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || mesasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMesa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesaOrigen =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mesaOrigen =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesaDestino =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mesaDestino =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				mesaOrigen =mesasSeleccionados.get(0);
				mesaDestino =mesasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMesa(mesaOrigen,mesaDestino,true,false);
				
				mesaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mesaDestino,mesaLogic.getMesas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mesaDestino,mesas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMesa(false);
				
				//this.jTableDatosMesa.setRowSelectionInterval(this.getIndiceNuevoMesa(), this.getIndiceNuevoMesa());
				
				int iLastRow =  this.jTableDatosMesa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMesa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMesa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMesa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMesaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMesa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMesaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMesa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMesa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMesa.setVisible(!isVisible);
			this.jPanelPaginacionMesa.setVisible(!isVisible);
			this.jPanelAccionesMesa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMesaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMesa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMesaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMesa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMesaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMesa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMesaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMesa();
			
			this.abrirFrameOrderByMesa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMesaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMesa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMesa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMesa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMesa.isMaximum()) {
					this.jInternalFrameDetalleFormMesa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMesa.setSize(this.jInternalFrameDetalleFormMesa.iWidthFormulario,this.jInternalFrameDetalleFormMesa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMesa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMesa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMesa.isMaximum()) {
						this.jInternalFrameDetalleFormMesa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMesa.jContentPaneDetalleMesa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMesa.jContentPaneDetalleMesa.getWidth(),MesaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMesa.jContentPaneDetalleMesa.getWidth(),MesaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMesa.jContentPaneDetalleMesa.getWidth(),MesaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCajeroTurno();
					}

					if(FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFacturaPuntoVenta();
					}

					if(NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNotaCreditoPuntoVenta();
					}

					if(PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoPuntoVenta();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMesa.setVisible(true);
	        this.jInternalFrameDetalleFormMesa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMesa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMesa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMesa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMesa,false,this);
				} else {
					this.jInternalFrameOrderByMesa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMesa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMesa);
				this.jInternalFrameOrderByMesa.setVisible(false);
				this.jInternalFrameOrderByMesa.setSelected(false);
				
				this.jInternalFrameOrderByMesa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMesa"));
				
				this.inicializarActualizarBindingTablaOrderByMesa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMesa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMesa==null) {
				
				this.jInternalFrameImportacionMesa=new ImportacionJInternalFrame(MesaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMesa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMesa);
				this.jInternalFrameImportacionMesa.setVisible(false);
				this.jInternalFrameImportacionMesa.setSelected(false);


				this.jInternalFrameImportacionMesa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMesa"));
				this.jInternalFrameImportacionMesa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMesa"));
				this.jInternalFrameImportacionMesa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMesa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMesa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMesa==null) {
				this.jInternalFrameReporteDinamicoMesa=new ReporteDinamicoJInternalFrame(MesaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMesa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMesa);
				this.jInternalFrameReporteDinamicoMesa.setVisible(false);
				this.jInternalFrameReporteDinamicoMesa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMesa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMesa"));
				this.jInternalFrameReporteDinamicoMesa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMesa"));
				this.jInternalFrameReporteDinamicoMesa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMesa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMesa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCajeroTurno() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMesa.jContentPaneDetalleMesa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFacturaPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMesa.jContentPaneDetalleMesa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaNotaCreditoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMesa.jContentPaneDetalleMesa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedidoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosPedidoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMesa.jContentPaneDetalleMesa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosPedidoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosPedidoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosPedidoPuntoVenta.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleMesa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMesa);
			
	       	this.jInternalFrameDetalleFormMesa.setVisible(false);
	        this.jInternalFrameDetalleFormMesa.setSelected(false);
			
			//this.jInternalFrameDetalleFormMesa.dispose();
			//this.jInternalFrameDetalleFormMesa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMesa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMesa.setVisible(true);
	        this.jInternalFrameReporteDinamicoMesa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMesa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMesa.setVisible(true);
	        this.jInternalFrameImportacionMesa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMesa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMesa.setVisible(true);
	        this.jInternalFrameOrderByMesa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMesa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMesa.setVisible(false);
	        this.jInternalFrameOrderByMesa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMesa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMesa.setVisible(false);
	        this.jInternalFrameReporteDinamicoMesa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMesa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMesa.setVisible(false);
	        this.jInternalFrameImportacionMesa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMesaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMesa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMesa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMesa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMesa(true);
			//this.isEsNuevoMesa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMesa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMesa(false) ;
			
			if(mesaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.getEsGuardarRelacionado() && PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getEsGuardarRelacionado() && FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() && NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.getEsGuardarRelacionado() && CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajeroTurnoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(MesaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMesa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMesa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMesaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMesa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMesa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMesa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMesa(true);
			//this.isEsNuevoMesa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.mesa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMesa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMesa(false) ;
			
			if(MesaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMesa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMesa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarMesaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMesa(false);
			
			//if(!this.isEsNuevoMesa) {								
				int intSelectedRow = this.jTableDatosMesa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
				
			}
			
			if(this.permiteMantenimiento(this.mesa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.mesaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMesa=true;
					this.inicializarActualizarBindingTablaMesa(false);
					this.isEsNuevoMesa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMesa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMesa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMesa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMesa(false);
				
				this.habilitarDeshabilitarControlesMesa(false);
			
												
				
				if(MesaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMesa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMesaActionPerformed(evt,mesaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMesa(this.mesa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMesa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,mesaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.mesa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMesaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMesa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				this.mesa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				this.mesa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.mesa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.mesaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MesaModel) this.jTableDatosMesa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMesa=true;
				this.inicializarActualizarBindingTablaMesa(false);
				this.isEsNuevoMesa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMesa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMesa(false);
				
				this.habilitarDeshabilitarControlesMesa(false);
				
				
				
				if(MesaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMesa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMesaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMesa.getRowCount()>=1) {
				jTableDatosMesa.removeRowSelectionInterval(0, jTableDatosMesa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMesa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMesa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMesa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMesa(false) ;
			
			this.isEsNuevoMesa=false;
			
			if(MesaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMesa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMesaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMesa(false);
				
				//SI ES MANUAL
				if(MesaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMesa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMesaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMesa--;			
			//Mesa mesaAux= new Mesa();			
			//mesaAux.setId(this.iIdNuevoMesa);
			
			if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMesa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
			
			this.mesa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.mesaLogic.getMesas().add(this.mesaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.mesas.add(this.mesaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMesa(false);
			
			this.jTableDatosMesa.setRowSelectionInterval(this.getIndiceNuevoMesa(), this.getIndiceNuevoMesa());
			
			int iLastRow =  this.jTableDatosMesa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMesa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMesa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMesa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMesaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMesa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMesa(false);
			
			//SI ES MANUAL
			if(MesaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMesa();
			}
			
			//this.abrirFrameTreeMesa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMesaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE MesaS ?", "MANTENIMIENTO DE Mesa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMesa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMesa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.mesaReturnGeneral=mesaLogic.procesarImportacionMesasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.mesaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMesaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMesaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMesa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMesa.setFileImportacion(this.jInternalFrameImportacionMesa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMesa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMesa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMesa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMesa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMesaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();		

		mesasSeleccionados=this.getMesasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMesa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMesa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MesaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MesaBaseDesign.jrxml";
			
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
			
			this.generarReporteMesas("Todos",mesasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMesa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMesa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MesaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MesaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MesaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MesaConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoMesa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMesa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMesa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MesaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MesaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case MesaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case MesaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMesa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MesaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MesaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case MesaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case MesaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMesa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMesa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MesaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MesaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case MesaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case MesaConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
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
	
	public void jButtonGenerarExcelReporteDinamicoMesaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();		
		
		mesasSeleccionados=this.getMesasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mesa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Mesas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMesa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMesa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MesaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MesaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Mesa mesa:mesasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mesa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MesaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MesaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Mesa mesa:mesasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mesa.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MesaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MesaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Mesa mesa:mesasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mesa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MesaConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MesaConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(Mesa mesa:mesasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mesa.getnumero());
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
			//	this.getFilaCabeceraExportarExcelMesa(row);				
			//	iRow++;
			//}				
			
			//for(Mesa mesaAux:mesasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMesa(mesaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
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
				this.mesaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMesa(false);
			
			//SI ES MANUAL
			if(MesaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMesa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMesaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMesa(false);
			
			//SI ES MANUAL
			if(MesaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMesa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMesaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMesa(false);
			
			//SI ES MANUAL
			if(MesaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMesa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMesa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMesa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMesa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMesa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMesa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMesa.setMinimumSize(dimensionMinimum);
		this.jTableDatosMesa.setMaximumSize(dimensionMaximum);
		this.jTableDatosMesa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMesa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMesa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMesa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMesa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMesa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMesa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMesa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMesa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MesaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MesaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMesa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMesa();
		
		this.inicializarActualizarBindingBotonesManualMesa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMesa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMesa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMesa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMesa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMesa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMesa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMesa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMesa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMesa.jCheckBoxPostAccionNuevoMesa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMesa.jCheckBoxPostAccionSinCerrarMesa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMesa.jCheckBoxPostAccionSinMensajeMesa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMesa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMesa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMesa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMesa!=null) {
				this.jInternalFrameDetalleFormMesa.jCheckBoxPostAccionNuevoMesa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMesa.jCheckBoxPostAccionSinCerrarMesa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMesa.jCheckBoxPostAccionSinMensajeMesa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMesa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMesa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMesa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMesa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMesa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMesa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMesa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMesa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMesa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMesa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMesa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMesa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMesa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMesa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMesa(Boolean esInicializar) throws Exception {
		try	{	
			if(MesaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMesa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMesa() throws Exception {
		try	{
			if(MesaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMesa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMesa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMesa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMesa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMesa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMesa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMesa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMesa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMesa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMesa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMesa.addItem(reporte);
			}
			
			
			if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMesa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMesa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMesa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMesa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMesa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMesa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMesa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMesa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMesa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMesa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMesa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMesa!=null) {
				this.jInternalFrameReporteDinamicoMesa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMesa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMesa!=null) {
				this.jInternalFrameReporteDinamicoMesa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMesa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMesa!=null) {
				
				if(this.jInternalFrameReporteDinamicoMesa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMesa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMesa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMesa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMesa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMesa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMesa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMesa(Boolean esInicializar) throws Exception {				
		if(MesaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMesa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMesa() throws Exception {
		this.inicializarActualizarBindingTablaMesa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMesa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMesa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMesa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMesa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MesaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMesa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMesa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MesaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMesaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMesaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MesaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMesa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMesa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MesaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMesa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMesa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=mesaLogic.getMesas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=mesas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMesa.setModel(new MesaModel(this.mesaLogic.getMesas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMesa.setModel(new MesaModel(this.mesas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMesa!=null && this.jInternalFrameOrderByMesa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMesa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMesa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMesa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MesaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MesaConstantesFunciones.SCLASSWEBTITULO,mesaConstantesFunciones.resaltarSeleccionarMesa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MesaConstantesFunciones.SCLASSWEBTITULO,mesaConstantesFunciones.resaltarSeleccionarMesa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMesa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMesa,MesaConstantesFunciones.LABEL_ID));

		if(this.mesaConstantesFunciones.mostraridMesa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MesaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mesaConstantesFunciones.resaltaridMesa,this.mesaConstantesFunciones.activaridMesa,this,true,"idMesa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mesaConstantesFunciones.resaltaridMesa,this.mesaConstantesFunciones.activaridMesa,this,true,"idMesa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMesa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMesa,MesaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.mesaConstantesFunciones.mostrarid_empresaMesa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MesaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.mesaConstantesFunciones.resaltarid_empresaMesa,this,this.mesaConstantesFunciones.activarid_empresaMesa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.mesaConstantesFunciones.resaltarid_empresaMesa,this,this.mesaConstantesFunciones.activarid_empresaMesa,false,"id_empresaMesa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MesaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMesa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMesa,MesaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.mesaConstantesFunciones.mostrarid_sucursalMesa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MesaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.mesaConstantesFunciones.resaltarid_sucursalMesa,this,this.mesaConstantesFunciones.activarid_sucursalMesa));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.mesaConstantesFunciones.resaltarid_sucursalMesa,this,this.mesaConstantesFunciones.activarid_sucursalMesa,false,"id_sucursalMesa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MesaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMesa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMesa,MesaConstantesFunciones.LABEL_NOMBRE));

		if(this.mesaConstantesFunciones.mostrarnombreMesa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MesaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mesaConstantesFunciones.resaltarnombreMesa,this.mesaConstantesFunciones.activarnombreMesa,this,true,"nombreMesa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mesaConstantesFunciones.resaltarnombreMesa,this.mesaConstantesFunciones.activarnombreMesa,this,true,"nombreMesa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MesaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMesa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMesa,MesaConstantesFunciones.LABEL_NUMERO));

		if(this.mesaConstantesFunciones.mostrarnumeroMesa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MesaConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mesaConstantesFunciones.resaltarnumeroMesa,this.mesaConstantesFunciones.activarnumeroMesa,this,true,"numeroMesa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mesaConstantesFunciones.resaltarnumeroMesa,this.mesaConstantesFunciones.activarnumeroMesa,this,true,"numeroMesa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MesaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.mesaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPedidoPuntoVenta && this.mesaConstantesFunciones.mostrarPedidoPuntoVentaMesa && !MesaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Punto Ventas");
				tableColumn.setHeaderValue("Pedido Punto Ventas");
				tableColumn.setCellRenderer(new PedidoPuntoVentaTableCell(mesaConstantesFunciones.resaltarPedidoPuntoVentaMesa,this,this.mesaConstantesFunciones.activarPedidoPuntoVentaMesa));
				tableColumn.setCellEditor(new PedidoPuntoVentaTableCell(mesaConstantesFunciones.resaltarPedidoPuntoVentaMesa,this,this.mesaConstantesFunciones.activarPedidoPuntoVentaMesa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMesa.addColumn(tableColumn);
			}

			if(this.isTienePermisosFacturaPuntoVenta && this.mesaConstantesFunciones.mostrarFacturaPuntoVentaMesa && !MesaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Factura Punto Ventas");
				tableColumn.setHeaderValue("Factura Punto Ventas");
				tableColumn.setCellRenderer(new FacturaPuntoVentaTableCell(mesaConstantesFunciones.resaltarFacturaPuntoVentaMesa,this,this.mesaConstantesFunciones.activarFacturaPuntoVentaMesa));
				tableColumn.setCellEditor(new FacturaPuntoVentaTableCell(mesaConstantesFunciones.resaltarFacturaPuntoVentaMesa,this,this.mesaConstantesFunciones.activarFacturaPuntoVentaMesa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMesa.addColumn(tableColumn);
			}

			if(this.isTienePermisosNotaCreditoPuntoVenta && this.mesaConstantesFunciones.mostrarNotaCreditoPuntoVentaMesa && !MesaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Nota Creditos");
				tableColumn.setHeaderValue("Nota Creditos");
				tableColumn.setCellRenderer(new NotaCreditoPuntoVentaTableCell(mesaConstantesFunciones.resaltarNotaCreditoPuntoVentaMesa,this,this.mesaConstantesFunciones.activarNotaCreditoPuntoVentaMesa));
				tableColumn.setCellEditor(new NotaCreditoPuntoVentaTableCell(mesaConstantesFunciones.resaltarNotaCreditoPuntoVentaMesa,this,this.mesaConstantesFunciones.activarNotaCreditoPuntoVentaMesa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMesa.addColumn(tableColumn);
			}

			if(this.isTienePermisosCajeroTurno && this.mesaConstantesFunciones.mostrarCajeroTurnoMesa && !MesaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cajero Turnos");
				tableColumn.setHeaderValue("Cajero Turnos");
				tableColumn.setCellRenderer(new CajeroTurnoTableCell(mesaConstantesFunciones.resaltarCajeroTurnoMesa,this,this.mesaConstantesFunciones.activarCajeroTurnoMesa));
				tableColumn.setCellEditor(new CajeroTurnoTableCell(mesaConstantesFunciones.resaltarCajeroTurnoMesa,this,this.mesaConstantesFunciones.activarCajeroTurnoMesa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMesa.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mesaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mesaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMesa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mesaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mesaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMesa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMesa && this.isPermisoGuardarCambiosMesa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.mesaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.mesaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMesa.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.mesaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosMesa.addColumn(tableColumn);
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
			
			this.jTableDatosMesa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMesa && this.isPermisoGuardarCambiosMesa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.mesaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMesa && this.isPermisoGuardarCambiosMesa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMesa.moveColumn(this.jTableDatosMesa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMesa.moveColumn(this.jTableDatosMesa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.mesaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosMesa.moveColumn(this.jTableDatosMesa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMesa.moveColumn(this.jTableDatosMesa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMesa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMesa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMesa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMesa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMesa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMesa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMesa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMesa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=mesaLogic.getMesas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=mesas.size()-1;
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
		//this.jTableDatosMesa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMesa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMesa();
			
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
				
				//this.isEsNuevoMesa=false;
					
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
				if(this.mesaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMesa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMesa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMesa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.mesa.getsType().equals("DUPLICADO")
				   || this.mesa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMesa=true;
				
				} else {
					this.isEsNuevoMesa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
					if(this.mesa.getId()>=0 && !this.mesa.getIsNew()) {						
						this.isEsNuevoMesa=false;
						
					} else {
						this.isEsNuevoMesa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMesa(esRelaciones);						
				
				this.seleccionarMesa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.mesa.getId()<0) {
					this.isEsNuevoMesa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMesa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMesa(evt,rowIndex);
				}	
				
				if(this.mesaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Mesa: " + this.dDif); 
					}
				}								
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMesa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.mesa)) {
					if(this.mesa.getId()>0) {
						this.mesa.setIsDeleted(true);
						
						this.mesasEliminados.add(this.mesa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mesaLogic.getMesas().remove(this.mesa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mesas.remove(this.mesa);				
					}
					
					
					((MesaModel) this.jTableDatosMesa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMesa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMesa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMesa) {
			
			if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMesa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMesa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMesa(this.mesa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.mesaConstantesFunciones.cargarid_empresaMesa || this.mesaConstantesFunciones.event_dependid_empresaMesa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.mesa.getid_empresa());
									//this.inicializarActualizarBindingMesa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(mesa.getEmpresa()!=null) {
							this.empresasForeignKey.add(mesa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.mesa.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.mesaConstantesFunciones.cargarid_sucursalMesa || this.mesaConstantesFunciones.event_dependid_sucursalMesa) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.mesa.getid_sucursal());
									//this.inicializarActualizarBindingMesa(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(mesa.getSucursal()!=null) {
							this.sucursalsForeignKey.add(mesa.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.mesa.getid_sucursal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMesa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMesa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMesa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMesa(Mesa mesa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMesa(mesa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMesa(Mesa mesa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMesa(mesa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMesa(mesa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMesa(mesa);
	}
	
	public void setVariablesObjetoActualToFormularioMesa(Mesa mesa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMesa.jLabelidMesa.setText(mesa.getId().toString());
			this.jInternalFrameDetalleFormMesa.jTextAreanombreMesa.setText(mesa.getnombre());
			this.jInternalFrameDetalleFormMesa.jTextFieldnumeroMesa.setText(mesa.getnumero().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Mesa mesaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,mesaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Mesa mesaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				mesaLocal=this.mesa;
			} else {
				mesaLocal=this.mesaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(mesaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMesa(mesaLocal,true);
					
					if(mesaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(mesaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.mesaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(mesaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMesa(Mesa mesa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMesa(mesa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMesa(mesa);
	}
	
	public void setVariablesFormularioToObjetoActualMesa(Mesa mesa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMesa(mesa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMesa(Mesa mesa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMesa.jLabelidMesa.getText()==null || this.jInternalFrameDetalleFormMesa.jLabelidMesa.getText()=="" || this.jInternalFrameDetalleFormMesa.jLabelidMesa.getText()=="Id") {
				this.jInternalFrameDetalleFormMesa.jLabelidMesa.setText("0");
			}

			if(conColumnasBase) {mesa.setId(Long.parseLong(this.jInternalFrameDetalleFormMesa.jLabelidMesa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MesaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMesa.jLabelIdMesa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mesa.setnombre(this.jInternalFrameDetalleFormMesa.jTextAreanombreMesa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MesaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMesa.jLabelnombreMesa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mesa.setnumero(Integer.parseInt(this.jInternalFrameDetalleFormMesa.jTextFieldnumeroMesa.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MesaConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMesa.jLabelnumeroMesa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMesa(Mesa mesaBean,Mesa mesa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMesa(Mesa mesaOrigen,Mesa mesa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mesaOrigen.getId()!=null && !mesaOrigen.getId().equals(0L))) {mesa.setId(mesaOrigen.getId());}}
			if(conDefault || (!conDefault && mesaOrigen.getnombre()!=null && !mesaOrigen.getnombre().equals(""))) {mesa.setnombre(mesaOrigen.getnombre());}
			if(conDefault || (!conDefault && mesaOrigen.getnumero()!=null && !mesaOrigen.getnumero().equals(0))) {mesa.setnumero(mesaOrigen.getnumero());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMesa(Mesa mesa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMesa.jLabelidMesa.setText(mesa.getId().toString());
			this.jInternalFrameDetalleFormMesa.jTextAreanombreMesa.setText(mesa.getnombre());
			this.jInternalFrameDetalleFormMesa.jTextFieldnumeroMesa.setText(mesa.getnumero().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMesa(MesaBean mesaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMesa.jLabelidMesa.setText(mesaBean.getId().toString());
			this.jInternalFrameDetalleFormMesa.jTextAreanombreMesa.setText(mesaBean.getnombre());
			this.jInternalFrameDetalleFormMesa.jTextFieldnumeroMesa.setText(mesaBean.getnumero().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMesa(MesaParameterReturnGeneral mesaReturnGeneral,MesaBean mesaBean,Boolean conDefault) throws Exception { 
		try {
			Mesa mesaLocal=new Mesa();
			
			mesaLocal=mesaReturnGeneral.getMesa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mesaLocal.getId()!=null && !mesaLocal.getId().equals(0L))) {mesaBean.setId(mesaLocal.getId());}}
			if(conDefault || (!conDefault && mesaLocal.getnombre()!=null && !mesaLocal.getnombre().equals(""))) {mesaBean.setnombre(mesaLocal.getnombre());}
			if(conDefault || (!conDefault && mesaLocal.getnumero()!=null && !mesaLocal.getnumero().equals(0))) {mesaBean.setnumero(mesaLocal.getnumero());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMesaGenerico(Long idMesaSeleccionado,JComboBox jComboBoxMesa,List<Mesa> mesasLocal)throws Exception {
		try {
			Mesa  mesaTemp=null;

			for(Mesa mesaAux:mesasLocal) {
				if(mesaAux.getId()!=null && mesaAux.getId().equals(idMesaSeleccionado)) {
					mesaTemp=mesaAux;
					break;
				}
			}

			jComboBoxMesa.setSelectedItem(mesaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMesaGenerico(JComboBox jComboBoxMesa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMesa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMesa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMesa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMesa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PedidoPuntoVenta")) {
			jButtonPedidoPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FacturaPuntoVenta")) {
			jButtonFacturaPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("NotaCreditoPuntoVenta")) {
			jButtonNotaCreditoPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CajeroTurno")) {
			jButtonCajeroTurnoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mesa=(Mesa) mesaLogic.getMesas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mesa =(Mesa) mesas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!mesa.getIsNew() && !mesa.getIsChanged() && !mesa.getIsDeleted()) {
				sDescripcion=mesa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=mesa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!mesa.getIsNew() && !mesa.getIsChanged() && !mesa.getIsDeleted()) {
				sDescripcion=mesa.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=mesa.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Mesa mesaRow=new Mesa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mesaRow=(Mesa) mesaLogic.getMesas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mesaRow=(Mesa) mesas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPedidoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Mesa mesa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMesa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesa = (Mesa)this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.mesa = (Mesa)this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(mesa!=null) {
						this.mesa = mesa;
					} else {
						this.mesa = new Mesa();
					}
				}

				if(this.isTienePermisosPedidoPuntoVenta && this.permiteMantenimiento(this.mesa)) {
					PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFramePopup=new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFramePopup;
					} else {
						pedidopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame;
					}

					List<Mesa> mesas=new ArrayList<Mesa>();
					mesas.add(this.mesa);
					if(!esRelacionado) {
						//pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setConGuardarRelaciones(false);
						//pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMesa.cargarPedidoPuntoVentaBeanSwingJInternalFrame(mesas,this.mesa,pedidopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.getConGuardarRelaciones(),pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
					pedidopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoPuntoVenta("no_relacionado");

						pedidopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (PedidoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMesa=(TitledBorder)this.jScrollPanelDatosMesa.getBorder();
						TitledBorder titledBorderPedidoPuntoVenta=(TitledBorder)pedidopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosPedidoPuntoVenta.getBorder();

						titledBorderPedidoPuntoVenta.setTitle(titledBorderMesa.getTitle() + " -> Pedido Punto Venta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidopuntoventaBeanSwingJInternalFrame);
						}

						pedidopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidopuntoventaBeanSwingJInternalFrame);

						pedidopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.mesaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Punto Venta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFacturaPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Mesa mesa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMesa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesa = (Mesa)this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.mesa = (Mesa)this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(mesa!=null) {
						this.mesa = mesa;
					} else {
						this.mesa = new Mesa();
					}
				}

				if(this.isTienePermisosFacturaPuntoVenta && this.permiteMantenimiento(this.mesa)) {
					FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFramePopup=new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturapuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFramePopup;
					} else {
						facturapuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame;
					}

					List<Mesa> mesas=new ArrayList<Mesa>();
					mesas.add(this.mesa);
					if(!esRelacionado) {
						//facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setConGuardarRelaciones(false);
						//facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturapuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMesa.cargarFacturaPuntoVentaBeanSwingJInternalFrame(mesas,this.mesa,facturapuntoventaBeanSwingJInternalFrame,/*conInicializar,*/facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getConGuardarRelaciones(),facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getEsGuardarRelacionado());
					facturapuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaPuntoVenta("no_relacionado");

						facturapuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (FacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						facturapuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMesa=(TitledBorder)this.jScrollPanelDatosMesa.getBorder();
						TitledBorder titledBorderFacturaPuntoVenta=(TitledBorder)facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.getBorder();

						titledBorderFacturaPuntoVenta.setTitle(titledBorderMesa.getTitle() + " -> Factura Punto Venta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturapuntoventaBeanSwingJInternalFrame);
						}

						facturapuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturapuntoventaBeanSwingJInternalFrame);

						facturapuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.mesaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura Punto Venta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonNotaCreditoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Mesa mesa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMesa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesa = (Mesa)this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.mesa = (Mesa)this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(mesa!=null) {
						this.mesa = mesa;
					} else {
						this.mesa = new Mesa();
					}
				}

				if(this.isTienePermisosNotaCreditoPuntoVenta && this.permiteMantenimiento(this.mesa)) {
					NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFramePopup=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						notacreditopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFramePopup;
					} else {
						notacreditopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame;
					}

					List<Mesa> mesas=new ArrayList<Mesa>();
					mesas.add(this.mesa);
					if(!esRelacionado) {
						//notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setConGuardarRelaciones(false);
						//notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					notacreditopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMesa.cargarNotaCreditoPuntoVentaBeanSwingJInternalFrame(mesas,this.mesa,notacreditopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getConGuardarRelaciones(),notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
					notacreditopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("no_relacionado");

						notacreditopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NotaCreditoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (NotaCreditoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						notacreditopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMesa=(TitledBorder)this.jScrollPanelDatosMesa.getBorder();
						TitledBorder titledBorderNotaCreditoPuntoVenta=(TitledBorder)notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.getBorder();

						titledBorderNotaCreditoPuntoVenta.setTitle(titledBorderMesa.getTitle() + " -> Nota Credito");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,notacreditopuntoventaBeanSwingJInternalFrame);
						}

						notacreditopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(notacreditopuntoventaBeanSwingJInternalFrame);

						notacreditopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.mesaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Nota Credito",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCajeroTurnoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Mesa mesa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMesa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesa = (Mesa)this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.mesa = (Mesa)this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(mesa!=null) {
						this.mesa = mesa;
					} else {
						this.mesa = new Mesa();
					}
				}

				if(this.isTienePermisosCajeroTurno && this.permiteMantenimiento(this.mesa)) {
					CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFramePopup=new CajeroTurnoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cajeroturnoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFramePopup;
					} else {
						cajeroturnoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame;
					}

					List<Mesa> mesas=new ArrayList<Mesa>();
					mesas.add(this.mesa);
					if(!esRelacionado) {
						//cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setConGuardarRelaciones(false);
						//cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cajeroturnoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMesa.cargarCajeroTurnoBeanSwingJInternalFrame(mesas,this.mesa,cajeroturnoBeanSwingJInternalFrame,/*conInicializar,*/cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.getConGuardarRelaciones(),cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.getEsGuardarRelacionado());
					cajeroturnoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("no_relacionado");

						cajeroturnoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CajeroTurnoConstantesFunciones.ITAMANIOFILATABLA + (CajeroTurnoConstantesFunciones.ITAMANIOFILATABLA/2));

						cajeroturnoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMesa=(TitledBorder)this.jScrollPanelDatosMesa.getBorder();
						TitledBorder titledBorderCajeroTurno=(TitledBorder)cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.getBorder();

						titledBorderCajeroTurno.setTitle(titledBorderMesa.getTitle() + " -> Cajero Turno");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cajeroturnoBeanSwingJInternalFrame);
						}

						cajeroturnoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cajeroturnoBeanSwingJInternalFrame);

						cajeroturnoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.mesaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cajero Turno",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMesa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMesa.setVisible((this.isVisibilidadCeldaNuevoMesa && this.isPermisoNuevoMesa));			
			this.jButtonDuplicarMesa.setVisible((this.isVisibilidadCeldaDuplicarMesa && this.isPermisoDuplicarMesa));			
			this.jButtonCopiarMesa.setVisible((this.isVisibilidadCeldaCopiarMesa && this.isPermisoCopiarMesa));
			this.jButtonVerFormMesa.setVisible((this.isVisibilidadCeldaVerFormMesa && this.isPermisoVerFormMesa));
			
			this.jButtonAbrirOrderByMesa.setVisible((this.isVisibilidadCeldaOrdenMesa && this.isPermisoOrdenMesa));			
			
			this.jButtonNuevoRelacionesMesa.setVisible((this.isVisibilidadCeldaNuevoRelacionesMesa && this.isPermisoNuevoMesa));			
			this.jButtonNuevoGuardarCambiosMesa.setVisible((this.isVisibilidadCeldaNuevoMesa && this.isPermisoNuevoMesa && this.isPermisoGuardarCambiosMesa));
			
			if(this.jInternalFrameDetalleFormMesa!=null) {
			this.jInternalFrameDetalleFormMesa.jButtonModificarMesa.setVisible((this.isVisibilidadCeldaModificarMesa && this.isPermisoActualizarMesa));	
			this.jInternalFrameDetalleFormMesa.jButtonActualizarMesa.setVisible((this.isVisibilidadCeldaActualizarMesa && this.isPermisoActualizarMesa));	
			this.jInternalFrameDetalleFormMesa.jButtonEliminarMesa.setVisible((this.isVisibilidadCeldaEliminarMesa && this.isPermisoEliminarMesa));
			this.jInternalFrameDetalleFormMesa.jButtonCancelarMesa.setVisible(this.isVisibilidadCeldaCancelarMesa);							
			this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosMesa.setVisible((this.isVisibilidadCeldaGuardarMesa && this.isPermisoGuardarCambiosMesa));			
			
			}
						
			this.jButtonGuardarCambiosTablaMesa.setVisible((this.isVisibilidadCeldaGuardarCambiosMesa && this.isPermisoGuardarCambiosMesa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMesa.setVisible((this.isVisibilidadCeldaNuevoMesa && this.isPermisoNuevoMesa));						
			this.jButtonDuplicarToolBarMesa.setVisible((this.isVisibilidadCeldaDuplicarMesa && this.isPermisoDuplicarMesa));						
			this.jButtonCopiarToolBarMesa.setVisible((this.isVisibilidadCeldaCopiarMesa && this.isPermisoCopiarMesa));			
			this.jButtonVerFormToolBarMesa.setVisible((this.isVisibilidadCeldaVerFormMesa && this.isPermisoVerFormMesa));			
			this.jButtonAbrirOrderByToolBarMesa.setVisible((this.isVisibilidadCeldaOrdenMesa && this.isPermisoOrdenMesa));
			this.jButtonNuevoRelacionesToolBarMesa.setVisible((this.isVisibilidadCeldaNuevoRelacionesMesa && this.isPermisoNuevoMesa));			
			this.jButtonNuevoGuardarCambiosToolBarMesa.setVisible((this.isVisibilidadCeldaNuevoMesa && this.isPermisoNuevoMesa && this.isPermisoGuardarCambiosMesa));			
			
			if(this.jInternalFrameDetalleFormMesa!=null) {
			this.jInternalFrameDetalleFormMesa.jButtonModificarToolBarMesa.setVisible((this.isVisibilidadCeldaModificarMesa && this.isPermisoActualizarMesa));	
			this.jInternalFrameDetalleFormMesa.jButtonActualizarToolBarMesa.setVisible((this.isVisibilidadCeldaActualizarMesa  && this.isPermisoActualizarMesa));	
			this.jInternalFrameDetalleFormMesa.jButtonEliminarToolBarMesa.setVisible((this.isVisibilidadCeldaEliminarMesa && this.isPermisoEliminarMesa));
			this.jInternalFrameDetalleFormMesa.jButtonCancelarToolBarMesa.setVisible(this.isVisibilidadCeldaCancelarMesa);				
			this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosToolBarMesa.setVisible((this.isVisibilidadCeldaGuardarMesa && this.isPermisoGuardarCambiosMesa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMesa.setVisible((this.isVisibilidadCeldaGuardarCambiosMesa && this.isPermisoGuardarCambiosMesa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMesa.setVisible((this.isVisibilidadCeldaNuevoMesa && this.isPermisoNuevoMesa));			
			this.jMenuItemDuplicarMesa.setVisible((this.isVisibilidadCeldaDuplicarMesa && this.isPermisoDuplicarMesa));			
			this.jMenuItemCopiarMesa.setVisible((this.isVisibilidadCeldaCopiarMesa && this.isPermisoCopiarMesa));			
			this.jMenuItemVerFormMesa.setVisible((this.isVisibilidadCeldaVerFormMesa && this.isPermisoVerFormMesa));			
			this.jMenuItemAbrirOrderByMesa.setVisible((this.isVisibilidadCeldaOrdenMesa && this.isPermisoOrdenMesa));			
			//this.jMenuItemMostrarOcultarMesa.setVisible((this.isVisibilidadCeldaOrdenMesa && this.isPermisoOrdenMesa));
			this.jMenuItemDetalleAbrirOrderByMesa.setVisible((this.isVisibilidadCeldaOrdenMesa && this.isPermisoOrdenMesa));			
			//this.jMenuItemDetalleMostrarOcultarMesa.setVisible((this.isVisibilidadCeldaOrdenMesa && this.isPermisoOrdenMesa));			
			this.jMenuItemNuevoRelacionesMesa.setVisible((this.isVisibilidadCeldaNuevoRelacionesMesa && this.isPermisoNuevoMesa));			
			this.jMenuItemNuevoGuardarCambiosMesa.setVisible((this.isVisibilidadCeldaNuevoMesa && this.isPermisoNuevoMesa && this.isPermisoGuardarCambiosMesa));									
			
			if(this.jInternalFrameDetalleFormMesa!=null) {
			this.jInternalFrameDetalleFormMesa.jMenuItemModificarMesa.setVisible((this.isVisibilidadCeldaModificarMesa && this.isPermisoActualizarMesa));	
			this.jInternalFrameDetalleFormMesa.jMenuItemActualizarMesa.setVisible((this.isVisibilidadCeldaActualizarMesa && this.isPermisoActualizarMesa));	
			this.jInternalFrameDetalleFormMesa.jMenuItemEliminarMesa.setVisible((this.isVisibilidadCeldaEliminarMesa && this.isPermisoEliminarMesa));
			this.jInternalFrameDetalleFormMesa.jMenuItemCancelarMesa.setVisible(this.isVisibilidadCeldaCancelarMesa);				
			}
			
			this.jMenuItemGuardarCambiosMesa.setVisible((this.isVisibilidadCeldaGuardarMesa && this.isPermisoGuardarCambiosMesa));						
			this.jMenuItemGuardarCambiosTablaMesa.setVisible((this.isVisibilidadCeldaGuardarCambiosMesa && this.isPermisoGuardarCambiosMesa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMesa=this.jButtonNuevoMesa.isVisible();
			this.isVisibilidadCeldaDuplicarMesa=this.jButtonDuplicarMesa.isVisible();
			this.isVisibilidadCeldaCopiarMesa=this.jButtonCopiarMesa.isVisible();
			this.isVisibilidadCeldaVerFormMesa=this.jButtonVerFormMesa.isVisible();
			
			this.isVisibilidadCeldaOrdenMesa=this.jButtonAbrirOrderByMesa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMesa=this.jButtonNuevoRelacionesMesa.isVisible();
			this.isVisibilidadCeldaModificarMesa=this.jButtonModificarMesa.isVisible();
			
			if(this.jInternalFrameDetalleFormMesa!=null) {
			this.isVisibilidadCeldaActualizarMesa=this.jInternalFrameDetalleFormMesa.jButtonActualizarMesa.isVisible();
			this.isVisibilidadCeldaEliminarMesa=this.jInternalFrameDetalleFormMesa.jButtonEliminarMesa.isVisible();
			this.isVisibilidadCeldaCancelarMesa=this.jInternalFrameDetalleFormMesa.jButtonCancelarMesa.isVisible();
			this.isVisibilidadCeldaGuardarMesa=this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosMesa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMesa=this.jButtonGuardarCambiosTablaMesa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMesa=this.jButtonNuevoToolBarMesa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMesa=this.jButtonNuevoRelacionesToolBarMesa.isVisible();
			
			if(this.jInternalFrameDetalleFormMesa!=null) {
			this.isVisibilidadCeldaModificarMesa=this.jInternalFrameDetalleFormMesa.jButtonModificarToolBarMesa.isVisible();
			this.isVisibilidadCeldaActualizarMesa=this.jInternalFrameDetalleFormMesa.jButtonActualizarToolBarMesa.isVisible();
			this.isVisibilidadCeldaEliminarMesa=this.jInternalFrameDetalleFormMesa.jButtonEliminarToolBarMesa.isVisible();
			this.isVisibilidadCeldaCancelarMesa=this.jInternalFrameDetalleFormMesa.jButtonCancelarToolBarMesa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMesa=this.jButtonGuardarCambiosToolBarMesa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMesa=this.jButtonGuardarCambiosTablaToolBarMesa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMesa=this.jMenuItemNuevoMesa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMesa=this.jMenuItemNuevoRelacionesMesa.isVisible();
			
			if(this.jInternalFrameDetalleFormMesa!=null) {
			this.isVisibilidadCeldaModificarMesa=this.jInternalFrameDetalleFormMesa.jMenuItemModificarMesa.isVisible();
			this.isVisibilidadCeldaActualizarMesa=this.jInternalFrameDetalleFormMesa.jMenuItemActualizarMesa.isVisible();
			this.isVisibilidadCeldaEliminarMesa=this.jInternalFrameDetalleFormMesa.jMenuItemEliminarMesa.isVisible();
			this.isVisibilidadCeldaCancelarMesa=this.jInternalFrameDetalleFormMesa.jMenuItemCancelarMesa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMesa=this.jMenuItemGuardarCambiosMesa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMesa=this.jMenuItemGuardarCambiosTablaMesa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMesa(Boolean esInicializar) {
		if(MesaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.mesaSessionBean.getConGuardarRelaciones()) {
				//if(this.mesaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMesa();
			}
			
			this.inicializarActualizarBindingBotonesManualMesa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMesa() {
		this.jButtonNuevoMesa.setVisible(this.isPermisoNuevoMesa);			
		this.jButtonDuplicarMesa.setVisible(this.isPermisoDuplicarMesa);			
		this.jButtonCopiarMesa.setVisible(this.isPermisoCopiarMesa);			
		this.jButtonVerFormMesa.setVisible(this.isPermisoVerFormMesa);			
		
		this.jButtonAbrirOrderByMesa.setVisible(this.isPermisoOrdenMesa);					
		
		this.jButtonNuevoRelacionesMesa.setVisible(this.isPermisoNuevoMesa);			
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonModificarMesa.setVisible(this.isPermisoActualizarMesa);	
			this.jInternalFrameDetalleFormMesa.jButtonActualizarMesa.setVisible(this.isPermisoActualizarMesa);	
			this.jInternalFrameDetalleFormMesa.jButtonEliminarMesa.setVisible(this.isPermisoEliminarMesa);
			this.jInternalFrameDetalleFormMesa.jButtonCancelarMesa.setVisible(this.isVisibilidadCeldaCancelarMesa);						
			this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosMesa.setVisible(this.isPermisoGuardarCambiosMesa);							
		}
		
		this.jButtonGuardarCambiosTablaMesa.setVisible(this.isPermisoActualizarMesa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMesa() {
		this.jInternalFrameDetalleFormMesa.jButtonModificarMesa.setVisible(this.isPermisoActualizarMesa);	
		this.jInternalFrameDetalleFormMesa.jButtonActualizarMesa.setVisible(this.isPermisoActualizarMesa);	
		this.jInternalFrameDetalleFormMesa.jButtonEliminarMesa.setVisible(this.isPermisoEliminarMesa);
		this.jInternalFrameDetalleFormMesa.jButtonCancelarMesa.setVisible(this.isVisibilidadCeldaCancelarMesa);							
		this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosMesa.setVisible((this.isVisibilidadCeldaGuardarMesa && this.isPermisoGuardarCambiosMesa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMesa() {
		if(MesaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMesa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMesa() {
	}
	
	public void jTableDatosMesaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMesa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMesaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMesa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMesa(this.getmesa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mesa==null) {
						this.mesa = new Mesa();
					}

					this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
				}

				if(this.mesa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.mesa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMesa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMesaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMesa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMesa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMesa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMesa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMesa(this.getmesa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.mesaLogic.getConnexion());

				if(this.mesa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.mesa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMesa=(TitledBorder)this.jScrollPanelDatosMesa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMesa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMesaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMesa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMesa(this.getmesa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mesa==null) {
						this.mesa = new Mesa();
					}

					this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
				}

				if(this.mesa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.mesa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMesa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalMesaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebMesa(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMesa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMesa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMesa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMesa(this.getmesa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.mesaLogic.getConnexion());

				if(this.mesa.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.mesa.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMesa=(TitledBorder)this.jScrollPanelDatosMesa.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderMesa.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalMesaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMesa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMesa(this.getmesa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mesa==null) {
						this.mesa = new Mesa();
					}

					this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
				}

				if(this.mesa.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.mesa.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMesa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreMesaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMesa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMesa(this.getmesa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mesa==null) {
						this.mesa = new Mesa();
					}

					this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
				}

				if(this.mesa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.mesa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMesa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroMesaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMesa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMesa(this.getmesa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mesa==null) {
						this.mesa = new Mesa();
					}

					this.setVariablesFormularioToObjetoActualMesa(this.mesa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);
				}

				if(this.mesa.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero = "+this.mesa.getnumero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMesa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaMesaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMesa(false,false);

			this.getMesasFK_IdEmpresa();

			this.inicializarActualizarBindingMesa(false);

			//if(MesaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMesa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalMesaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMesa(false,false);

			this.getMesasFK_IdSucursal();

			this.inicializarActualizarBindingMesa(false);

			//if(MesaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMesa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMesa() {
		if(this.jInternalFrameDetalleFormMesa!=null) {
		

		if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormMesa!=null) {
			this.jInternalFrameDetalleFormMesa.setVisible(false);	    			
			this.jInternalFrameDetalleFormMesa.dispose();
			this.jInternalFrameDetalleFormMesa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMesa!=null) {
			this.jInternalFrameReporteDinamicoMesa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMesa.dispose();
			this.jInternalFrameReporteDinamicoMesa=null;
		}
		
		if(this.jInternalFrameImportacionMesa!=null) {
			this.jInternalFrameImportacionMesa.setVisible(false);	    			
			this.jInternalFrameImportacionMesa.dispose();
			this.jInternalFrameImportacionMesa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMesa();
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
			
			if(sTipo.equals("NuevoMesa")) {
				jButtonNuevoMesaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMesa")) {
				jButtonDuplicarMesaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMesa")) {
				jButtonCopiarMesaActionPerformed(evt);
			} else if(sTipo.equals("VerFormMesa")) {
				jButtonVerFormMesaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMesa")) {
				jButtonNuevoMesaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMesa")) {
				jButtonDuplicarMesaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMesa")) {
				jButtonNuevoMesaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMesa")) {
				jButtonDuplicarMesaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMesa")) {
				jButtonNuevoMesaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMesa")) {
				jButtonNuevoMesaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMesa")) {
				jButtonNuevoMesaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMesa")) {
				jButtonModificarMesaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMesa")) {
				jButtonModificarMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMesa")) {
				jButtonModificarMesaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMesa")) {
				jButtonActualizarMesaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMesa")) {
				jButtonActualizarMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMesa")) {
				jButtonActualizarMesaActionPerformed(evt);
			} else if(sTipo.equals("EliminarMesa")) {
				jButtonEliminarMesaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMesa")) {
				jButtonEliminarMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMesa")) {
				jButtonEliminarMesaActionPerformed(evt);
			} else if(sTipo.equals("CancelarMesa")) {
				jButtonCancelarMesaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMesa")) {
				jButtonCancelarMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMesa")) {
				jButtonCancelarMesaActionPerformed(evt);
			} else if(sTipo.equals("CerrarMesa")) {
				jButtonCerrarMesaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMesa")) {
				jButtonCerrarMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMesa")) {
				jButtonCerrarMesaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMesa")) {
				jButtonMostrarOcultarMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMesa")) {
				jButtonCancelarMesaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMesa")) {
				jButtonGuardarCambiosMesaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMesa")) {
				jButtonGuardarCambiosMesaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMesa")) {
				jButtonCopiarMesaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMesa")) {
				jButtonVerFormMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMesa")) {
				jButtonGuardarCambiosMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMesa")) {
				jButtonCopiarMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMesa")) {
				jButtonVerFormMesaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMesa")) {
				jButtonGuardarCambiosMesaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMesa")) {
				jButtonGuardarCambiosMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMesa")) {
				jButtonGuardarCambiosMesaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMesa")) {
				jButtonRecargarInformacionMesaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMesa")) {
				jButtonRecargarInformacionMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMesa")) {
				jButtonRecargarInformacionMesaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMesa")) {
				jButtonAnterioresMesaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMesa")) {
				jButtonAnterioresMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMesa")) {
				jButtonAnterioresMesaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMesa")) {
				jButtonSiguientesMesaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMesa")) {
				jButtonSiguientesMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMesa")) {
				jButtonSiguientesMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMesa") || sTipo.equals("MenuItemDetalleAbrirOrderByMesa")) {
				jButtonAbrirOrderByMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMesa") || sTipo.equals("MenuItemDetalleMostrarOcultarMesa")) {
				jButtonMostrarOcultarMesaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMesa")) {
				jButtonNuevoGuardarCambiosMesaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMesa")) {
				jButtonNuevoGuardarCambiosMesaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMesa")) {
				jButtonNuevoGuardarCambiosMesaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMesa")) {
				jButtonCerrarReporteDinamicoMesaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMesa")) {
				jButtonGenerarReporteDinamicoMesaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMesa")) {
				
				jButtonGenerarExcelReporteDinamicoMesaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMesa")) {
				jButtonCerrarImportacionMesaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMesa")) {
				
				jButtonGenerarImportacionMesaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMesa")) {
				
				jButtonAbrirImportacionMesaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMesa")) {
				jComboBoxTiposAccionesMesaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMesa")) {
				jComboBoxTiposRelacionesMesaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMesa")) {
				jComboBoxTiposAccionesMesaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMesa")) {
				
				jComboBoxTiposSeleccionarMesaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMesa")) {
				jTextFieldValorCampoGeneralMesaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMesa")) {
				jButtonAbrirOrderByMesaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMesa")) {
				jButtonAbrirOrderByMesaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMesa")) {
				jButtonCerrarOrderByMesaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMesaBusqueda")) {
				this.jButtonidMesaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMesaUpdate")) {
				this.jButtonid_empresaMesaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMesaBusqueda")) {
				this.jButtonid_empresaMesaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMesaUpdate")) {
				this.jButtonid_sucursalMesaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMesaBusqueda")) {
				this.jButtonid_sucursalMesaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMesaBusqueda")) {
				this.jButtonnombreMesaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroMesaBusqueda")) {
				this.jButtonnumeroMesaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMesa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				


				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Mesa mesaLocal=null;
			
			if(!this.getEsControlTabla()) {
				mesaLocal=this.mesa;
			} else {
				mesaLocal=this.mesaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
							
				
				


				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMesa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaAnterior =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesaAnterior =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
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
			
			


			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
								
						
				


				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
								
				
				


				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMesa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaAnterior =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesaAnterior =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMesa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaAnterior =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesaAnterior =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
							
				
				


				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMesa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesaAnterior =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mesaAnterior =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
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
			
			


			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
								
				
				


				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMesa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaAnterior =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesaAnterior =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMesa")) {
					jCheckBoxSeleccionarTodosMesaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMesa")) {
					jCheckBoxSeleccionadosMesaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMesa")) {
					
				}
				
				


				
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
												
				
				


				
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMesa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesaAnterior =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mesaAnterior =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
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
			
			


			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mesa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mesa);
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
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
				
				


				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mesa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mesa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMesa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesaAnterior =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesaAnterior =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMesa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMesaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMesa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.mesa =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.mesa =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.mesa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMesa")) {
				
				}
				
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMesa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMesa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMesa")) {
			
			}
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMesa();
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
			if(sTipo.equals("NuevoMesa")) {
				jButtonNuevoMesaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMesa")) {
				jButtonDuplicarMesaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMesa")) {
				jButtonCopiarMesaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMesa")) {
				jButtonVerFormMesaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMesa")) {
				jButtonNuevoMesaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMesa")) {
				jButtonModificarMesaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMesa")) {
				jButtonActualizarMesaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMesa")) {
				jButtonEliminarMesaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMesa")) {
				jButtonGuardarCambiosMesaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMesa")) {
				jButtonCancelarMesaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMesa")) {
				jButtonCerrarMesaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMesa")) {
				jButtonGuardarCambiosMesaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMesa")) {
				jButtonNuevoGuardarCambiosMesaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMesa")) {
				jButtonAbrirOrderByMesaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMesa")) {
				jButtonRecargarInformacionMesaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMesa")) {
				jButtonAnterioresMesaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMesa")) {
				jButtonSiguientesMesaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMesaBusqueda")) {
				this.jButtonidMesaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMesaUpdate")) {
				this.jButtonid_empresaMesaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMesaBusqueda")) {
				this.jButtonid_empresaMesaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMesaUpdate")) {
				this.jButtonid_sucursalMesaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMesaBusqueda")) {
				this.jButtonid_sucursalMesaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMesaBusqueda")) {
				this.jButtonnombreMesaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroMesaBusqueda")) {
				this.jButtonnumeroMesaBusquedaActionPerformed(evt);
			}
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMesa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMesa")) {
				closingInternalFrameMesa();
				
			} else if(sTipo.equals("jButtonCancelarMesa")) {
				JInternalFrameBase jInternalFrameDetalleFormMesa = (JInternalFrameBase)evt.getSource();
	            	
	            MesaBeanSwingJInternalFrame jInternalFrameParent=(MesaBeanSwingJInternalFrame)jInternalFrameDetalleFormMesa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMesaActionPerformed(null);
			}
			
			MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mesa,new Object(),this.mesaParameterGeneral,this.mesaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMesa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMesa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMesa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.mesa)) {
			if(!esControlTabla) {
				if(MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMesa(this.mesa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);			
				}
				
				if(this.mesaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMesa(this.mesa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mesaReturnGeneral=mesaLogic.procesarEventosMesasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mesaLogic.getMesas(),this.mesa,this.mesaParameterGeneral,this.isEsNuevoMesa,classes);//this.mesaLogic.getMesa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMesa(this.mesaReturnGeneral,this.mesaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.mesaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMesa(classes,this.mesaReturnGeneral,this.mesaBean,false);
					}
						
					if(this.mesaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMesa(this.mesaReturnGeneral.getMesa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMesa(this.mesaReturnGeneral.getMesa());	
					}
						
					if(this.mesaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMesa(this.mesaReturnGeneral.getMesa(),classes);//this.mesaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMesa(this.mesa,classes);//this.mesaBean);									
				}
			
				if(MesaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMesa(this.mesa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMesa(this.mesa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.mesaAnterior!=null) {
						this.mesa=this.mesaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mesaReturnGeneral=mesaLogic.procesarEventosMesasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mesaLogic.getMesas(),this.mesa,this.mesaParameterGeneral,this.isEsNuevoMesa,classes);//this.mesaLogic.getMesa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mesaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mesaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.mesaReturnGeneral.getMesa(),mesaLogic.getMesas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.mesaReturnGeneral.getMesa(),this.mesas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMesa.repaint();
				
				//((AbstractTableModel) this.jTableDatosMesa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMesa();
			}
		}
	}
	
	public void actualizarVisualTableDatosMesa() throws Exception {
		
		MesaModel mesaModel=(MesaModel)this.jTableDatosMesa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mesaModel.mesas=this.mesaLogic.getMesas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			mesaModel.mesas=this.mesas;
		}
		
		
		((MesaModel) this.jTableDatosMesa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMesa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmesaAnterior(),this.mesaLogic.getMesas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmesaAnterior(),this.mesas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMesa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMesa(Mesa mesa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.setPedidoPuntoVentas(mesa.getPedidoPuntoVentas());
					this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaPuntoVenta.class)) {
					this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.setFacturaPuntoVentas(mesa.getFacturaPuntoVentas());
					this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.setNotaCreditoPuntoVentas(mesa.getNotaCreditoPuntoVentas());
					this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CajeroTurno.class)) {
					this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(mesa.getCajeroTurnos());
					this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajeroTurno(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
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
										
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mesa,new Object(),generalEntityParameterGeneral,this.mesaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.mesaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MesaConstantesFunciones.getClassesRelationshipsOfMesa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MesaConstantesFunciones.getClassesRelationshipsFromStringsOfMesa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMesa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MesaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mesa,new Object(),generalEntityParameterGeneral,this.mesaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMesa(MesaBean mesaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.setPedidoPuntoVentas(mesa.getPedidoPuntoVentas());
					this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaPuntoVenta.class)) {
					this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.setFacturaPuntoVentas(mesa.getFacturaPuntoVentas());
					this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.setNotaCreditoPuntoVentas(mesa.getNotaCreditoPuntoVentas());
					this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CajeroTurno.class)) {
					this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(mesa.getCajeroTurnos());
					this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajeroTurno(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMesa(ArrayList<Classe> classes,MesaReturnGeneral mesaReturnGeneral,MesaBean mesaBean,Boolean conDefault) throws Exception {
		
			this.mesaBean.setPedidoPuntoVentas(mesaReturnGeneral.getMesa().getPedidoPuntoVentas());
			this.mesaBean.setFacturaPuntoVentas(mesaReturnGeneral.getMesa().getFacturaPuntoVentas());
			this.mesaBean.setNotaCreditoPuntoVentas(mesaReturnGeneral.getMesa().getNotaCreditoPuntoVentas());
			this.mesaBean.setCajeroTurnos(mesaReturnGeneral.getMesa().getCajeroTurnos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMesa(Mesa mesa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoPuntoVenta.class)) {
					mesa.setPedidoPuntoVentas(this.jInternalFrameDetalleFormMesa.pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaLogic.getPedidoPuntoVentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaPuntoVenta.class)) {
					mesa.setFacturaPuntoVentas(this.jInternalFrameDetalleFormMesa.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoPuntoVenta.class)) {
					mesa.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CajeroTurno.class)) {
					mesa.setCajeroTurnos(this.jInternalFrameDetalleFormMesa.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.mesa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMesa = new MesaDetalleFormJInternalFrame(jDesktopPane,this.mesaSessionBean.getConGuardarRelaciones(),this.mesaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMesa);
		this.jInternalFrameDetalleFormMesa.setVisible(false);
		this.jInternalFrameDetalleFormMesa.setSelected(false);						
		
		this.jInternalFrameDetalleFormMesa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMesa.mesaLogic=this.mesaLogic;
		
		this.cargarCombosFrameForeignKeyMesa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMesa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMesa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMesa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMesa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMesa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMesa"));
		
		this.jInternalFrameDetalleFormMesa.jButtonModificarMesa.addActionListener(new ButtonActionListener(this,"ModificarMesa"));

		
		this.jInternalFrameDetalleFormMesa.jButtonModificarToolBarMesa.addActionListener(new ButtonActionListener(this,"ModificarToolBarMesa"));
					
		this.jInternalFrameDetalleFormMesa.jMenuItemModificarMesa.addActionListener(new ButtonActionListener(this,"MenuItemModificarMesa"));		
		
		
		
		this.jInternalFrameDetalleFormMesa.jButtonActualizarMesa.addActionListener (new ButtonActionListener(this,"ActualizarMesa"));
		
		
		this.jInternalFrameDetalleFormMesa.jButtonActualizarToolBarMesa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMesa"));
						
		this.jInternalFrameDetalleFormMesa.jMenuItemActualizarMesa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMesa"));		
		
		
		
		this.jInternalFrameDetalleFormMesa.jButtonEliminarMesa.addActionListener (new ButtonActionListener(this,"EliminarMesa"));
		
		
		this.jInternalFrameDetalleFormMesa.jButtonEliminarToolBarMesa.addActionListener (new ButtonActionListener(this,"EliminarToolBarMesa"));
								
		this.jInternalFrameDetalleFormMesa.jMenuItemEliminarMesa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMesa"));		
		
		
		
		this.jInternalFrameDetalleFormMesa.jButtonCancelarMesa.addActionListener (new ButtonActionListener(this,"CancelarMesa"));
		
		
		this.jInternalFrameDetalleFormMesa.jButtonCancelarToolBarMesa.addActionListener (new ButtonActionListener(this,"CancelarToolBarMesa"));
					
		this.jInternalFrameDetalleFormMesa.jMenuItemCancelarMesa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMesa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMesa.jMenuItemDetalleCerrarMesa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMesa"));		
		
		
		
		this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosToolBarMesa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMesa"));
		
		
		
		this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosToolBarMesa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMesa"));
		
		
		
		this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMesa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonidMesaBusqueda.addActionListener(new ButtonActionListener(this,"idMesaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMesa.jButtonid_empresaMesaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMesaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonid_empresaMesaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMesaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMesa.jButtonid_sucursalMesaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMesaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonid_sucursalMesaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMesaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonnombreMesaBusqueda.addActionListener(new ButtonActionListener(this,"nombreMesaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonnumeroMesaBusqueda.addActionListener(new ButtonActionListener(this,"numeroMesaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMesa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMesa"));
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMesa"));
		}
		
		this.jTableDatosMesa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMesa"));
		
		this.jTableDatosMesa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMesa"));
		
		this.jButtonNuevoMesa.addActionListener(new ButtonActionListener(this,"NuevoMesa"));
		
		this.jButtonDuplicarMesa.addActionListener(new ButtonActionListener(this,"DuplicarMesa"));
		
		this.jButtonCopiarMesa.addActionListener(new ButtonActionListener(this,"CopiarMesa"));
		
		this.jButtonVerFormMesa.addActionListener(new ButtonActionListener(this,"VerFormMesa"));
		
		
		this.jButtonNuevoToolBarMesa.addActionListener(new ButtonActionListener(this,"NuevoToolBarMesa"));
			
		this.jButtonDuplicarToolBarMesa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMesa"));
			
		this.jMenuItemNuevoMesa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMesa"));
			
		this.jMenuItemDuplicarMesa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMesa"));		
		
		
		this.jButtonNuevoRelacionesMesa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMesa"));
		
		
		this.jButtonNuevoRelacionesToolBarMesa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMesa"));
			
		this.jMenuItemNuevoRelacionesMesa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMesa"));		
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonModificarMesa.addActionListener(new ButtonActionListener(this,"ModificarMesa"));
		}
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonModificarToolBarMesa.addActionListener(new ButtonActionListener(this,"ModificarToolBarMesa"));
			
			this.jInternalFrameDetalleFormMesa.jMenuItemModificarMesa.addActionListener(new ButtonActionListener(this,"MenuItemModificarMesa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMesa.jButtonActualizarMesa.addActionListener (new ButtonActionListener(this,"ActualizarMesa"));
		}
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonActualizarToolBarMesa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMesa"));
				
			this.jInternalFrameDetalleFormMesa.jMenuItemActualizarMesa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMesa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonEliminarMesa.addActionListener (new ButtonActionListener(this,"EliminarMesa"));
		}
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonEliminarToolBarMesa.addActionListener (new ButtonActionListener(this,"EliminarToolBarMesa"));
						
			this.jInternalFrameDetalleFormMesa.jMenuItemEliminarMesa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMesa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonCancelarMesa.addActionListener (new ButtonActionListener(this,"CancelarMesa"));
		}
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonCancelarToolBarMesa.addActionListener (new ButtonActionListener(this,"CancelarToolBarMesa"));
			
			this.jInternalFrameDetalleFormMesa.jMenuItemCancelarMesa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMesa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMesa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMesa"));		
		
		
		this.jButtonCerrarMesa.addActionListener (new ButtonActionListener(this,"CerrarMesa"));
		
		
		this.jButtonCerrarToolBarMesa.addActionListener (new ButtonActionListener(this,"CerrarToolBarMesa"));
			
		this.jMenuItemCerrarMesa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMesa"));
			
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jMenuItemDetalleCerrarMesa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMesa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosMesa.addActionListener (new ButtonActionListener(this,"GuardarCambiosMesa"));
		}
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosToolBarMesa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMesa"));
		}
		
		this.jButtonCopiarToolBarMesa.addActionListener (new ButtonActionListener(this,"CopiarToolBarMesa"));
			
		this.jButtonVerFormToolBarMesa.addActionListener (new ButtonActionListener(this,"VerFormToolBarMesa"));
		
		this.jMenuItemGuardarCambiosMesa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMesa"));
			
		this.jMenuItemCopiarMesa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMesa"));		
		
		this.jMenuItemVerFormMesa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMesa"));		
		
		
		this.jButtonGuardarCambiosTablaMesa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMesa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMesa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMesa"));
			
		this.jMenuItemGuardarCambiosTablaMesa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMesa"));		
		
		
		
		this.jButtonRecargarInformacionMesa.addActionListener (new ButtonActionListener(this,"RecargarInformacionMesa"));
					
		this.jButtonRecargarInformacionToolBarMesa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMesa"));
		
		this.jMenuItemRecargarInformacionMesa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMesa"));		
		
		
		
		this.jButtonAnterioresMesa.addActionListener (new ButtonActionListener(this,"AnterioresMesa"));
		
		
		this.jButtonAnterioresToolBarMesa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMesa"));
		
		this.jMenuItemAnterioresMesa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMesa"));		
		
		
		this.jButtonSiguientesMesa.addActionListener (new ButtonActionListener(this,"SiguientesMesa"));
		
		
		this.jButtonSiguientesToolBarMesa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMesa"));
			
		this.jMenuItemSiguientesMesa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMesa"));
			
		this.jMenuItemAbrirOrderByMesa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMesa"));
			
		this.jMenuItemMostrarOcultarMesa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMesa"));
			
		this.jMenuItemDetalleAbrirOrderByMesa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMesa"));
			
		this.jMenuItemDetalleMostarOcultarMesa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMesa"));		
		
		
		this.jButtonNuevoGuardarCambiosMesa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMesa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMesa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMesa"));
			
		this.jMenuItemNuevoGuardarCambiosMesa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMesa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMesa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMesa"));

		this.jCheckBoxSeleccionadosMesa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMesa"));
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMesa"));
		}
		
		
		this.jComboBoxTiposRelacionesMesa.addActionListener (new ButtonActionListener(this,"TiposRelacionesMesa"));
			
		this.jComboBoxTiposAccionesMesa.addActionListener (new ButtonActionListener(this,"TiposAccionesMesa"));
					
		this.jComboBoxTiposSeleccionarMesa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMesa"));
			
		this.jTextFieldValorCampoGeneralMesa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMesa"));		
		
		
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonidMesaBusqueda.addActionListener(new ButtonActionListener(this,"idMesaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMesa.jButtonid_empresaMesaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMesaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonid_empresaMesaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMesaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMesa.jButtonid_sucursalMesaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMesaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonid_sucursalMesaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMesaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonnombreMesaBusqueda.addActionListener(new ButtonActionListener(this,"nombreMesaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonnumeroMesaBusqueda.addActionListener(new ButtonActionListener(this,"numeroMesaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMesa!=null) {
				this.jInternalFrameReporteDinamicoMesa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMesa"));
				this.jInternalFrameReporteDinamicoMesa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMesa"));
				this.jInternalFrameReporteDinamicoMesa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMesa"));
			}
			
			//this.jButtonCerrarReporteDinamicoMesa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMesa"));				
			//this.jButtonGenerarReporteDinamicoMesa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMesa"));
			//this.jButtonGenerarExcelReporteDinamicoMesa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMesa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMesa!=null) {
				this.jInternalFrameImportacionMesa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMesa"));
				this.jInternalFrameImportacionMesa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMesa"));
				this.jInternalFrameImportacionMesa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMesa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMesa.addActionListener (new ButtonActionListener(this,"AbrirOrderByMesa"));
			
			this.jButtonAbrirOrderByToolBarMesa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMesa"));			
			
			if(this.jInternalFrameOrderByMesa!=null) {
				this.jInternalFrameOrderByMesa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMesa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMesa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMesa.jTabbedPaneRelacionesMesa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMesa"));
		
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
            		closingInternalFrameMesa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMesa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMesa = (JInternalFrameBase)event.getSource();
	            	
	            MesaBeanSwingJInternalFrame jInternalFrameParent=(MesaBeanSwingJInternalFrame)jInternalFrameDetalleFormMesa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMesaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMesa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMesaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMesa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMesa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMesa";
		inputMap = this.jButtonNuevoMesa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMesa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMesaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMesa";
		inputMap = this.jButtonNuevoRelacionesMesa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMesa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMesaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMesa";
		inputMap = this.jButtonModificarMesa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMesa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMesaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMesa";
		inputMap = this.jButtonActualizarMesa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMesa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMesaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMesa";
		inputMap = this.jButtonEliminarMesa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMesa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMesaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMesa";
		inputMap = this.jButtonCancelarMesa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMesa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMesaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMesa";
		inputMap = this.jButtonCerrarMesa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMesa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMesaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMesa";
		inputMap = this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosMesa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMesa.jButtonGuardarCambiosMesa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMesaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMesa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMesaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMesa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMesaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMesa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMesaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMesa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMesaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonidMesaBusqueda.addActionListener(new ButtonActionListener(this,"idMesaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMesa.jButtonid_empresaMesaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMesaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonid_empresaMesaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMesaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMesa.jButtonid_sucursalMesaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMesaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonid_sucursalMesaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMesaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonnombreMesaBusqueda.addActionListener(new ButtonActionListener(this,"nombreMesaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMesa.jButtonnumeroMesaBusqueda.addActionListener(new ButtonActionListener(this,"numeroMesaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMesa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMesaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMesaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMesa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMesa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Mesa mesaAux:this.mesaLogic.getMesas()) {
					mesaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Mesa mesaAux:mesas) {
					mesaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMesaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMesa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Mesa mesaAux:this.mesaLogic.getMesas()) {
						mesaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Mesa mesaAux:mesas) {
						mesaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Mesa mesaAux:this.mesaLogic.getMesas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Mesa mesaAux:mesas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMesa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMesa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMesa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMesa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMesaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMesa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMesa.getSelectedRows();
			
			Mesa mesaLocal=new Mesa();
			
			//this.seleccionarTodosMesa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesaLocal =(Mesa) this.mesaLogic.getMesas().toArray()[this.jTableDatosMesa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					mesaLocal =(Mesa) this.mesas.toArray()[this.jTableDatosMesa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				mesaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Mesa mesaAux:this.mesaLogic.getMesas()) {
						mesaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Mesa mesaAux:mesas) {
						mesaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMesa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMesa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMesa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMesa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMesaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMesaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMesaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMesa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMesa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Mesa mesaAux:this.mesaLogic.getMesas()) {
				
						if(sTipoSeleccionar.equals(MesaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							mesaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MesaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							mesaAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Mesa mesaAux:mesas) {
					
						if(sTipoSeleccionar.equals(MesaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							mesaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MesaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							mesaAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMesa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMesaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMesa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMesa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMesa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMesa) {				
					conSplash=true;//false;										
					
					//this.startProcessMesa(conSplash);
				
					this.generarReporteMesasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMesasSeleccionados();
				//this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMesasSeleccionados(false);
				//this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMesasSeleccionados(true);
				//this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMesa();
				
				this.exportarMesasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMesas();
				//this.importarMesas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMesa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMesasSeleccionados();
				//this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Mesa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMesa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMesa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMesa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.setSelectedIndex(0);					
				}	
			} 			
			else if(MesaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMesa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMesa(conSplash);
					
						//this.actualizarParametrosGeneralMesa();
						
						this.generarReporteProcesoAccionMesasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MesaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO MesaS SELECCIONADOS?", "MANTENIMIENTO DE Mesa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMesa();
				
						this.actualizarParametrosGeneralMesa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.mesaReturnGeneral=mesaLogic.procesarAccionMesasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.mesaLogic.getMesas(),this.mesaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMesaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMesa();
					
					MesaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMesaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMesa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMesa.jComboBoxTiposAccionesFormularioMesa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMesa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMesaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMesa();
			
			if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();		
			Mesa mesa=new Mesa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMesa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMesa.getSelectedItem();
			
			
			
			
			mesasSeleccionados=this.getMesasSeleccionados(true);
			//this.sTipoAccion;
			
			if(mesasSeleccionados.size()==1) {
				for(Mesa mesaAux:mesasSeleccionados) {
					mesa=mesaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Pedido Punto Venta")) {
					jButtonPedidoPuntoVentaActionPerformed(null,rowIndex,true,false,mesa);
				}
				else if(this.sTipoRelacion.equals("Factura Punto Venta")) {
					jButtonFacturaPuntoVentaActionPerformed(null,rowIndex,true,false,mesa);
				}
				else if(this.sTipoRelacion.equals("Nota Credito")) {
					jButtonNotaCreditoPuntoVentaActionPerformed(null,rowIndex,true,false,mesa);
				}
				else if(this.sTipoRelacion.equals("Cajero Turno")) {
					jButtonCajeroTurnoActionPerformed(null,rowIndex,true,false,mesa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMesa();
			
      		//this.finishProcessMesa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMesaReturnGeneral() throws Exception {
		if(this.mesaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.mesaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.mesaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.mesaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.mesaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.mesaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMesa(false);
		}
		
		if(this.mesaReturnGeneral.getConRetornoLista() || this.mesaReturnGeneral.getConRetornoObjeto()) {
			if(this.mesaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mesaLogic.setMesas(this.mesaReturnGeneral.getMesas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.mesaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mesaLogic.setMesa(this.mesaReturnGeneral.getMesa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMesa(false);
		}
	}
	
	public void actualizarParametrosGeneralMesa() throws Exception {
		
		
	}
	
	public ArrayList<Mesa> getMesasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMesa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Mesa mesaAux:mesaLogic.getMesas()) {
					if(mesaAux.getIsSelected()) {
						mesasSeleccionados.add(mesaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Mesa mesaAux:this.mesas) {
					if(mesaAux.getIsSelected()) {
						mesasSeleccionados.add(mesaAux);				
					}
				}
			}
			
			if(mesasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						mesasSeleccionados.addAll(this.mesaLogic.getMesas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						mesasSeleccionados.addAll(this.mesas);				
					}
				}
			}
		} else {
			mesasSeleccionados.add(this.mesa);
		}
		
		return mesasSeleccionados;
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
	
	public void generarReporteMesasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMesasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMesasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMesasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMesasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesMesasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Mesa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMesasSeleccionados() throws Exception {
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();		
		
		mesasSeleccionados=this.getMesasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMesas("Todos",mesasSeleccionados);
		
	}	
	
	public void generarReporteNormalMesasSeleccionados() throws Exception {
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();		
		
		mesasSeleccionados=this.getMesasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMesas("Todos",mesasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMesasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();
		
		mesasSeleccionados=this.getMesasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMesas("Todos",mesasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMesasSeleccionados() throws Exception {
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMesa();
		
		
		mesasSeleccionados=this.getMesasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMesa();
		
		
		//this.generarReporteMesas("Todos",mesasSeleccionados ,mesaImplementable,mesaImplementableHome);
	}
	
	public void mostrarImportacionMesas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMesa();
		
		this.abrirFrameImportacionMesa();		
		
			
		//this.generarReporteMesas("Todos",mesasSeleccionados ,mesaImplementable,mesaImplementableHome);
	}
	
	public void importarMesas() throws Exception {		
	
	}
	
	public void exportarMesasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMesasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMesasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMesasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Mesa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMesasSeleccionados() throws Exception {
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();		
		
		mesasSeleccionados=this.getMesasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mesa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMesa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Mesa mesaAux:mesasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMesa(mesaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//mesaAux.setsDetalleGeneralEntityReporte(mesaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMesa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MesaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MesaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MesaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MesaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MesaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MesaConstantesFunciones.LABEL_NUMERO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMesa(Mesa mesa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=mesa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=mesa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=mesa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mesa.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mesa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mesa.getnumero().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMesasSeleccionados() throws Exception {
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();		
		
		mesasSeleccionados=this.getMesasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mesa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Mesas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMesa(row);				
				iRow++;
			}				
			
			for(Mesa mesaAux:mesasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMesa(mesaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMesasSeleccionados() throws Exception {
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();		
		
		mesasSeleccionados=this.getMesasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mesa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("mesas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("mesa");
			//elementRoot.appendChild(element);
		
			for(Mesa mesaAux:mesasSeleccionados) {
				element = document.createElement("mesa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMesa(mesaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mesa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMesa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MesaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MesaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MesaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MesaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MesaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(MesaConstantesFunciones.LABEL_NUMERO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMesa(Mesa mesa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(mesa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(mesa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mesa.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mesa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(mesa.getnumero());				
	}
	
	public void setFilaDatosExportarXmlMesa(Mesa mesa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MesaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(mesa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MesaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(mesa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MesaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(mesa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(MesaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(mesa.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementnombre = document.createElement(MesaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(mesa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnumero = document.createElement(MesaConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(mesa.getnumero().toString().trim()));
		element.appendChild(elementnumero);
	}
	
	public void generarReporteGroupGenericoMesasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Mesa> mesasSeleccionados=new ArrayList<Mesa>();
		
		mesasSeleccionados=this.getMesasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMesa(mesasSeleccionados);
		
		this.generarReporteMesas("Todos",mesasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMesa(ArrayList<Mesa> mesasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Mesa mesaAux:mesasSeleccionados) {
				mesaAux.setsDetalleGeneralEntityReporte(mesaAux.toString());
			
				if(sTipoSeleccionar.equals(MesaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					mesaAux.setsDescripcionGeneralEntityReporte1(mesaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MesaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					mesaAux.setsDescripcionGeneralEntityReporte1(mesaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MesaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					mesaAux.setsDescripcionGeneralEntityReporte1(mesaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(MesaConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					mesaAux.setsDescripcionGeneralEntityReporte1(mesaAux.getnumero().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMesa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMesa=true;
				this.isVisibilidadCeldaNuevoRelacionesMesa=true;
				this.isVisibilidadCeldaGuardarCambiosMesa=true;
			}
			
			this.isVisibilidadCeldaModificarMesa=false;
			this.isVisibilidadCeldaActualizarMesa=false;
			this.isVisibilidadCeldaEliminarMesa=false;
			this.isVisibilidadCeldaCancelarMesa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMesa=true;
				} else {
					this.isVisibilidadCeldaGuardarMesa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMesa=false;
			this.isVisibilidadCeldaNuevoRelacionesMesa=false;
			this.isVisibilidadCeldaGuardarCambiosMesa=false;
			this.isVisibilidadCeldaModificarMesa=false;
			this.isVisibilidadCeldaActualizarMesa=true;
			this.isVisibilidadCeldaEliminarMesa=false;
			this.isVisibilidadCeldaCancelarMesa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMesa=true;
				} else {
					this.isVisibilidadCeldaGuardarMesa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMesa=false;
			this.isVisibilidadCeldaNuevoRelacionesMesa=false;
			this.isVisibilidadCeldaGuardarCambiosMesa=false;
			this.isVisibilidadCeldaModificarMesa=false;
			this.isVisibilidadCeldaActualizarMesa=true;
			this.isVisibilidadCeldaEliminarMesa=true;
			this.isVisibilidadCeldaCancelarMesa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMesa=true;
				} else {
					this.isVisibilidadCeldaGuardarMesa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMesa=false;
			this.isVisibilidadCeldaNuevoRelacionesMesa=false;
			this.isVisibilidadCeldaGuardarCambiosMesa=false;
			this.isVisibilidadCeldaModificarMesa=false;
			this.isVisibilidadCeldaActualizarMesa=true;
			this.isVisibilidadCeldaEliminarMesa=false;
			this.isVisibilidadCeldaCancelarMesa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMesa=false;
				} else {
					this.isVisibilidadCeldaGuardarMesa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMesa=true;
			this.isVisibilidadCeldaNuevoRelacionesMesa=true;
			this.isVisibilidadCeldaGuardarCambiosMesa=true;
			this.isVisibilidadCeldaModificarMesa=false;
			this.isVisibilidadCeldaActualizarMesa=false;
			this.isVisibilidadCeldaEliminarMesa=false;
			this.isVisibilidadCeldaCancelarMesa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMesa=true;
				} else {
					this.isVisibilidadCeldaGuardarMesa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMesa=false;
			this.isVisibilidadCeldaNuevoRelacionesMesa=false;
			this.isVisibilidadCeldaGuardarCambiosMesa=false;
			this.isVisibilidadCeldaActualizarMesa=false;
			this.isVisibilidadCeldaEliminarMesa=false;
			this.isVisibilidadCeldaCancelarMesa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMesa=false;
				} else {
					this.isVisibilidadCeldaGuardarMesa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMesa=false;
			this.isVisibilidadCeldaNuevoRelacionesMesa=false;
			this.isVisibilidadCeldaGuardarCambiosMesa=false;
			this.isVisibilidadCeldaModificarMesa=true;
			this.isVisibilidadCeldaActualizarMesa=false;
			this.isVisibilidadCeldaEliminarMesa=false;
			this.isVisibilidadCeldaCancelarMesa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMesa=false;
				} else {
					this.isVisibilidadCeldaGuardarMesa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MesaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMesa=true;
			this.isVisibilidadCeldaNuevoRelacionesMesa=true;
			this.isVisibilidadCeldaGuardarCambiosMesa=true;
		} else {
			this.actualizarEstadoPanelsMesa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMesa=false;
			//this.isVisibilidadCeldaVerFormMesa=false;
			this.isVisibilidadCeldaDuplicarMesa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!mesaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMesa=false;
		} else {
			this.isVisibilidadCeldaNuevoMesa=false;
			this.isVisibilidadCeldaGuardarCambiosMesa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(mesaSessionBean.getEsGuardarRelacionado()) {
			if(!mesaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMesa=false;												
			}
			
			this.jButtonCerrarMesa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMesa=false;
		}
		
		if(!this.permiteMantenimiento(this.mesa)) {
			this.isVisibilidadCeldaActualizarMesa=false;
			this.isVisibilidadCeldaEliminarMesa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMesa() {
		this.isVisibilidadCeldaNuevoMesa=false;
		this.isVisibilidadCeldaGuardarCambiosMesa=false;
	}
	
	public void actualizarEstadoPanelsMesa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMesa!=null) {
				this.jScrollPanelDatosEdicionMesa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMesa!=null) {
				this.jTabbedPaneBusquedasMesa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMesa!=null) {
				this.jScrollPanelDatosMesa.setVisible(true);
			}
			
			if(this.jPanelPaginacionMesa!=null) {
				this.jPanelPaginacionMesa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMesa!=null) {
				this.jPanelParametrosReportesMesa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMesa!=null) {
				this.jScrollPanelDatosEdicionMesa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMesa!=null) {
				this.jTabbedPaneBusquedasMesa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMesa!=null) {
				this.jScrollPanelDatosMesa.setVisible(false);
			}
			
			if(this.jPanelPaginacionMesa!=null) {
				this.jPanelPaginacionMesa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMesa!=null) {
				this.jPanelParametrosReportesMesa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMesa!=null) {
				this.jScrollPanelDatosEdicionMesa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMesa!=null) {
				this.jTabbedPaneBusquedasMesa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMesa!=null) {
				this.jScrollPanelDatosMesa.setVisible(false);
			}
			
			if(this.jPanelPaginacionMesa!=null) {
				this.jPanelPaginacionMesa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMesa!=null) {
				this.jPanelParametrosReportesMesa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMesa!=null) {
				this.jScrollPanelDatosEdicionMesa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMesa!=null) {
				this.jTabbedPaneBusquedasMesa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMesa!=null) {
				this.jScrollPanelDatosMesa.setVisible(false);
			}
			
			if(this.jPanelPaginacionMesa!=null) {
				this.jPanelPaginacionMesa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMesa!=null) {
				this.jPanelParametrosReportesMesa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMesa!=null) {
				this.jScrollPanelDatosEdicionMesa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMesa!=null) {
				this.jTabbedPaneBusquedasMesa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMesa!=null) {
				this.jScrollPanelDatosMesa.setVisible(true);
			}
			
			if(this.jPanelPaginacionMesa!=null) {
				this.jPanelPaginacionMesa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMesa!=null) {
				this.jPanelParametrosReportesMesa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMesa!=null) {
				this.jScrollPanelDatosEdicionMesa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMesa!=null) {
				this.jTabbedPaneBusquedasMesa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMesa!=null) {
				this.jScrollPanelDatosMesa.setVisible(true);
			}
			
			if(this.jPanelPaginacionMesa!=null) {
				this.jPanelPaginacionMesa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMesa!=null) {
				this.jPanelParametrosReportesMesa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMesa!=null) {
				this.jScrollPanelDatosEdicionMesa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMesa!=null) {
				this.jTabbedPaneBusquedasMesa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMesa!=null) {
				this.jScrollPanelDatosMesa.setVisible(true);
			}
			
			if(this.jPanelPaginacionMesa!=null) {
				this.jPanelPaginacionMesa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMesa!=null) {
				this.jPanelParametrosReportesMesa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.mesaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMesa!=null) {
					this.jTabbedPaneBusquedasMesa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMesa!=null) {
				this.jPanelParametrosReportesMesa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.mesaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMesa!=null) {
				this.jTabbedPaneBusquedasMesa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMesa!=null) {
				this.jPanelParametrosReportesMesa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;
		}
		
	}
	
	

	public String registrarSesionMesaParaPedidoPuntoVentas() throws Exception {
		Boolean isPaginaPopupPedidoPuntoVenta=false;

		try {

			if(this.mesaSessionBean==null) {
				this.mesaSessionBean=new MesaSessionBean();
			}

			if(this.jInternalFrameDetalleFormMesa.pedidopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormMesa.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormMesa.pedidopuntoventaSessionBean.setsPathNavegacionActual(mesaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoPuntoVenta=this.jInternalFrameDetalleFormMesa.pedidopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoPuntoVenta(true);
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoPuntoVenta(MesaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionMesa(true);
			this.jInternalFrameDetalleFormMesa.pedidopuntoventaSessionBean.setlidMesaActual(this.idMesaActual);

			mesaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMesa(true);
			mesaSessionBean.setlIdMesaActualForeignKey(this.idMesaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionMesaParaFacturaPuntoVentas() throws Exception {
		Boolean isPaginaPopupFacturaPuntoVenta=false;

		try {

			if(this.mesaSessionBean==null) {
				this.mesaSessionBean=new MesaSessionBean();
			}

			if(this.jInternalFrameDetalleFormMesa.facturapuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormMesa.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormMesa.facturapuntoventaSessionBean.setsPathNavegacionActual(mesaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMesa.facturapuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFacturaPuntoVenta=this.jInternalFrameDetalleFormMesa.facturapuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMesa.facturapuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFacturaPuntoVenta(true);
			this.jInternalFrameDetalleFormMesa.facturapuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaPuntoVenta(MesaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMesa.facturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionMesa(true);
			this.jInternalFrameDetalleFormMesa.facturapuntoventaSessionBean.setlidMesaActual(this.idMesaActual);

			mesaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMesa(true);
			mesaSessionBean.setlIdMesaActualForeignKey(this.idMesaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionMesaParaNotaCreditoPuntoVentas() throws Exception {
		Boolean isPaginaPopupNotaCreditoPuntoVenta=false;

		try {

			if(this.mesaSessionBean==null) {
				this.mesaSessionBean=new MesaSessionBean();
			}

			if(this.jInternalFrameDetalleFormMesa.notacreditopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormMesa.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaSessionBean.setsPathNavegacionActual(mesaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNotaCreditoPuntoVenta=this.jInternalFrameDetalleFormMesa.notacreditopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta(true);
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta(MesaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionMesa(true);
			this.jInternalFrameDetalleFormMesa.notacreditopuntoventaSessionBean.setlidMesaActual(this.idMesaActual);

			mesaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMesa(true);
			mesaSessionBean.setlIdMesaActualForeignKey(this.idMesaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionMesaParaCajeroTurnos() throws Exception {
		Boolean isPaginaPopupCajeroTurno=false;

		try {

			if(this.mesaSessionBean==null) {
				this.mesaSessionBean=new MesaSessionBean();
			}

			if(this.jInternalFrameDetalleFormMesa.cajeroturnoSessionBean==null) {
				this.jInternalFrameDetalleFormMesa.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			this.jInternalFrameDetalleFormMesa.cajeroturnoSessionBean.setsPathNavegacionActual(mesaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMesa.cajeroturnoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCajeroTurno=this.jInternalFrameDetalleFormMesa.cajeroturnoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMesa.cajeroturnoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno(true);
			this.jInternalFrameDetalleFormMesa.cajeroturnoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno(MesaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMesa.cajeroturnoSessionBean.setisBusquedaDesdeForeignKeySesionMesa(true);
			this.jInternalFrameDetalleFormMesa.cajeroturnoSessionBean.setlidMesaActual(this.idMesaActual);

			mesaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMesa(true);
			mesaSessionBean.setlIdMesaActualForeignKey(this.idMesaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MesaSessionBean mesaSessionBean=new MesaSessionBean();
		
		if(this.mesaSessionBean==null) {
			this.mesaSessionBean=new MesaSessionBean();
		}
		
		this.mesaSessionBean.setsUltimaBusquedaMesa(this.getsAccionBusqueda());
		this.mesaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.mesaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			mesaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			mesaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MesaSessionBean mesaSessionBean=new MesaSessionBean();
		
		if(this.mesaSessionBean==null) {
			this.mesaSessionBean=new MesaSessionBean();
		}
		
		if(this.mesaSessionBean.getsUltimaBusquedaMesa()!=null&&!this.mesaSessionBean.getsUltimaBusquedaMesa().equals("")) {
			this.setsAccionBusqueda(mesaSessionBean.getsUltimaBusquedaMesa());
			this.setiNumeroPaginacion(mesaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(mesaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(mesaSessionBean.getid_empresa());
				mesaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(mesaSessionBean.getid_sucursal());
				mesaSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.mesaSessionBean.setsUltimaBusquedaMesa("");
		this.mesaSessionBean.setiNumeroPaginacion(MesaConstantesFunciones.INUMEROPAGINACION);
		this.mesaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMesa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMesa() {
		this.updateBorderResaltarBusquedasFormularioMesa();
		this.updateVisibilidadBusquedasFormularioMesa();
		this.updateHabilitarBusquedasFormularioMesa();
	}
	
	public void updateBorderResaltarBusquedasFormularioMesa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMesa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMesa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMesa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMesa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMesa.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMesa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarMesa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMesa() throws Exception {

		if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMesa();
		this.updateVisibilidadResaltarControlesFormularioMesa();
		this.updateHabilitarResaltarControlesFormularioMesa();
		
	}
	
	public void updateBorderResaltarControlesFormularioMesa() throws Exception {
		if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.mesaConstantesFunciones.resaltaridMesa!=null && this.jInternalFrameDetalleFormMesa!=null) {this.jInternalFrameDetalleFormMesa.jLabelidMesa.setBorder(this.mesaConstantesFunciones.resaltaridMesa);}
		if(this.mesaConstantesFunciones.resaltarid_empresaMesa!=null && this.jInternalFrameDetalleFormMesa!=null) {this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.setBorder(this.mesaConstantesFunciones.resaltarid_empresaMesa);}
		if(this.mesaConstantesFunciones.resaltarid_sucursalMesa!=null && this.jInternalFrameDetalleFormMesa!=null) {this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.setBorder(this.mesaConstantesFunciones.resaltarid_sucursalMesa);}
		if(this.mesaConstantesFunciones.resaltarnombreMesa!=null && this.jInternalFrameDetalleFormMesa!=null) {this.jInternalFrameDetalleFormMesa.jTextAreanombreMesa.setBorder(this.mesaConstantesFunciones.resaltarnombreMesa);}
		if(this.mesaConstantesFunciones.resaltarnumeroMesa!=null && this.jInternalFrameDetalleFormMesa!=null) {this.jInternalFrameDetalleFormMesa.jTextFieldnumeroMesa.setBorder(this.mesaConstantesFunciones.resaltarnumeroMesa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMesa() throws Exception {		
		if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMesa!=null) {
	
		//this.jInternalFrameDetalleFormMesa.jLabelidMesa.setVisible(this.mesaConstantesFunciones.mostraridMesa);
		this.jInternalFrameDetalleFormMesa.jPanelidMesa.setVisible(this.mesaConstantesFunciones.mostraridMesa);
		//this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.setVisible(this.mesaConstantesFunciones.mostrarid_empresaMesa);
		this.jInternalFrameDetalleFormMesa.jPanelid_empresaMesa.setVisible(this.mesaConstantesFunciones.mostrarid_empresaMesa);
		//this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.setVisible(this.mesaConstantesFunciones.mostrarid_sucursalMesa);
		this.jInternalFrameDetalleFormMesa.jPanelid_sucursalMesa.setVisible(this.mesaConstantesFunciones.mostrarid_sucursalMesa);
		//this.jInternalFrameDetalleFormMesa.jTextAreanombreMesa.setVisible(this.mesaConstantesFunciones.mostrarnombreMesa);
		this.jInternalFrameDetalleFormMesa.jPanelnombreMesa.setVisible(this.mesaConstantesFunciones.mostrarnombreMesa);
		//this.jInternalFrameDetalleFormMesa.jTextFieldnumeroMesa.setVisible(this.mesaConstantesFunciones.mostrarnumeroMesa);
		this.jInternalFrameDetalleFormMesa.jPanelnumeroMesa.setVisible(this.mesaConstantesFunciones.mostrarnumeroMesa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMesa() throws Exception {
		if(this.jInternalFrameDetalleFormMesa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMesa!=null) {
	
		this.jInternalFrameDetalleFormMesa.jLabelidMesa.setEnabled(this.mesaConstantesFunciones.activaridMesa);
		this.jInternalFrameDetalleFormMesa.jComboBoxid_empresaMesa.setEnabled(this.mesaConstantesFunciones.activarid_empresaMesa);
		this.jInternalFrameDetalleFormMesa.jComboBoxid_sucursalMesa.setEnabled(this.mesaConstantesFunciones.activarid_sucursalMesa);
		this.jInternalFrameDetalleFormMesa.jTextAreanombreMesa.setEnabled(this.mesaConstantesFunciones.activarnombreMesa);
		this.jInternalFrameDetalleFormMesa.jTextFieldnumeroMesa.setEnabled(this.mesaConstantesFunciones.activarnumeroMesa);
		}
	}
	
		
}