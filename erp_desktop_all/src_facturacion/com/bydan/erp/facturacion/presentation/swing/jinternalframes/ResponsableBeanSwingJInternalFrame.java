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

import com.bydan.erp.facturacion.util.ResponsableConstantesFunciones;
import com.bydan.erp.facturacion.util.ResponsableParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ResponsableParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.ResponsableBean;
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
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ResponsableBeanSwingJInternalFrame extends ResponsableJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ResponsableBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Responsable> responsableValidator = new ClassValidator<Responsable>(Responsable.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Responsable responsable;	
	public Responsable responsableAux;
	public Responsable responsableAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Responsable responsableTotales;
	public Long idResponsableActual;
	public Long iIdNuevoResponsable=0L;
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

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	

	public Boolean isTienePermisosFactura=false;

	public Boolean getIsTienePermisosFactura() {
		return isTienePermisosFactura;
	}

	public void setIsTienePermisosFactura(Boolean isTienePermisosFactura) {
		this.isTienePermisosFactura= isTienePermisosFactura;
	}


	public Boolean isTienePermisosConsignacion=false;

	public Boolean getIsTienePermisosConsignacion() {
		return isTienePermisosConsignacion;
	}

	public void setIsTienePermisosConsignacion(Boolean isTienePermisosConsignacion) {
		this.isTienePermisosConsignacion= isTienePermisosConsignacion;
	}


	public Boolean isTienePermisosPedidoExpor=false;

	public Boolean getIsTienePermisosPedidoExpor() {
		return isTienePermisosPedidoExpor;
	}

	public void setIsTienePermisosPedidoExpor(Boolean isTienePermisosPedidoExpor) {
		this.isTienePermisosPedidoExpor= isTienePermisosPedidoExpor;
	}


	public Boolean isTienePermisosPedido=false;

	public Boolean getIsTienePermisosPedido() {
		return isTienePermisosPedido;
	}

	public void setIsTienePermisosPedido(Boolean isTienePermisosPedido) {
		this.isTienePermisosPedido= isTienePermisosPedido;
	}


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
	
	public Boolean isPermisoTodoResponsable;
	public Boolean isPermisoNuevoResponsable;
	public Boolean isPermisoActualizarResponsable;
	public Boolean isPermisoActualizarOriginalResponsable;
	public Boolean isPermisoEliminarResponsable;
	public Boolean isPermisoGuardarCambiosResponsable;
	public Boolean isPermisoConsultaResponsable;
	public Boolean isPermisoBusquedaResponsable;
	public Boolean isPermisoReporteResponsable;
	public Boolean isPermisoPaginacionMedioResponsable;
	public Boolean isPermisoPaginacionAltoResponsable;
	public Boolean isPermisoPaginacionTodoResponsable;
	public Boolean isPermisoCopiarResponsable;
	public Boolean isPermisoVerFormResponsable;
	public Boolean isPermisoDuplicarResponsable;
	public Boolean isPermisoOrdenResponsable;
	
	
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
	
	public ResponsableParameterReturnGeneral responsableReturnGeneral;
	public ResponsableParameterReturnGeneral responsableParameterGeneral;
	
	

	public FacturaLogic facturaLogic=null;

	public FacturaLogic getFacturaLogic() {
		return facturaLogic;
	}

	public void setFacturaLogic(FacturaLogic facturaLogic) {
		this.facturaLogic = facturaLogic;
	}


	public ConsignacionLogic consignacionLogic=null;

	public ConsignacionLogic getConsignacionLogic() {
		return consignacionLogic;
	}

	public void setConsignacionLogic(ConsignacionLogic consignacionLogic) {
		this.consignacionLogic = consignacionLogic;
	}


	public PedidoLogic pedidoLogic=null;

	public PedidoLogic getPedidoLogic() {
		return pedidoLogic;
	}

	public void setPedidoLogic(PedidoLogic pedidoLogic) {
		this.pedidoLogic = pedidoLogic;
	}


	public PedidoExporLogic pedidoexporLogic=null;

	public PedidoExporLogic getPedidoExporLogic() {
		return pedidoexporLogic;
	}

	public void setPedidoExporLogic(PedidoExporLogic pedidoexporLogic) {
		this.pedidoexporLogic = pedidoexporLogic;
	}


	public NotaCreditoSoliLogic notacreditosoliLogic=null;

	public NotaCreditoSoliLogic getNotaCreditoSoliLogic() {
		return notacreditosoliLogic;
	}

	public void setNotaCreditoSoliLogic(NotaCreditoSoliLogic notacreditosoliLogic) {
		this.notacreditosoliLogic = notacreditosoliLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoResponsable=false;
	public Boolean esParaAccionDesdeFormularioResponsable=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ResponsableSessionBeanAdditional responsableSessionBeanAdditional=null;
	
	public ResponsableSessionBeanAdditional getResponsableSessionBeanAdditional() {
		return this.responsableSessionBeanAdditional;
	}
	
	public void setResponsableSessionBeanAdditional(ResponsableSessionBeanAdditional responsableSessionBeanAdditional) {
		try {
			this.responsableSessionBeanAdditional=responsableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ResponsableBeanSwingJInternalFrameAdditional responsableBeanSwingJInternalFrameAdditional=null;
	//public class ResponsableBeanSwingJInternalFrame
	
	public ResponsableBeanSwingJInternalFrameAdditional getResponsableBeanSwingJInternalFrameAdditional() {
		return this.responsableBeanSwingJInternalFrameAdditional;
	}
	
	public void setResponsableBeanSwingJInternalFrameAdditional(ResponsableBeanSwingJInternalFrameAdditional responsableBeanSwingJInternalFrameAdditional) {
		try {
			this.responsableBeanSwingJInternalFrameAdditional=responsableBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ResponsableLogic responsableLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Responsable responsableBean;
	public ResponsableConstantesFunciones responsableConstantesFunciones;
	//public ResponsableParameterReturnGeneral responsableReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<Responsable> responsables;	
	//public List<Responsable> responsablesEliminados;
	//public List<Responsable> responsablesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoResponsable=false;
	public Boolean isVisibilidadCeldaDuplicarResponsable=true;
	public Boolean isVisibilidadCeldaCopiarResponsable=true;
	public Boolean isVisibilidadCeldaVerFormResponsable=true;
	public Boolean isVisibilidadCeldaOrdenResponsable=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesResponsable=false;
	public Boolean isVisibilidadCeldaModificarResponsable=false;
	public Boolean isVisibilidadCeldaActualizarResponsable=false;
	public Boolean isVisibilidadCeldaEliminarResponsable=false;
	public Boolean isVisibilidadCeldaCancelarResponsable=false;
	public Boolean isVisibilidadCeldaGuardarResponsable=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosResponsable=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdentificacion=false;
	public Boolean isVisibilidadBusquedaPorNombreCompleto=false;
	public Boolean isVisibilidadBusquedaPorRuc=false;
	public Boolean isVisibilidadBusquedaPorTelefono=false;
	public Boolean isVisibilidadBusquedaPorTelefonoCelular=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoResponsable() {
		return this.iIdNuevoResponsable;
	}

	public void setiIdNuevoResponsable(Long iIdNuevoResponsable) {
		this.iIdNuevoResponsable = iIdNuevoResponsable;
	}
	
	public Long getidResponsableActual() {
		return this.idResponsableActual;
	}

	public void setidResponsableActual(Long idResponsableActual) {
		this.idResponsableActual = idResponsableActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Responsable getresponsable() {
		return this.responsable;
	}

	public void setresponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	
	public Responsable getresponsableAux() {
		return this.responsableAux;
	}

	public void setresponsableAux(Responsable responsableAux) {
		this.responsableAux = responsableAux;
	}				
	
	public Responsable getresponsableAnterior() {
		return this.responsableAnterior;
	}

	public void setresponsableAnterior(Responsable responsableAnterior) {
		this.responsableAnterior = responsableAnterior;
	}	
	
	public Responsable getresponsableTotales() {
		return this.responsableTotales;
	}

	public void setresponsableTotales(Responsable responsableTotales) {
		this.responsableTotales = responsableTotales;
	}	
	
	public Responsable getresponsableBean() {
		return this.responsableBean;
	}

	public void setresponsableBean(Responsable responsableBean) {
		this.responsableBean = responsableBean;
	}	
	
	public ResponsableParameterReturnGeneral getresponsableReturnGeneral() {
		return this.responsableReturnGeneral;
	}

	public void setresponsableReturnGeneral(ResponsableParameterReturnGeneral responsableReturnGeneral) {
		this.responsableReturnGeneral = responsableReturnGeneral;
	}	
	
	
	public String identificacionBusquedaPorIdentificacion="";

	public String getidentificacionBusquedaPorIdentificacion() {
		return this.identificacionBusquedaPorIdentificacion;
	}

	public void setidentificacionBusquedaPorIdentificacion(String identificacionBusquedaPorIdentificacion) {
		this.identificacionBusquedaPorIdentificacion = identificacionBusquedaPorIdentificacion;
	}

	public String nombre_completoBusquedaPorNombreCompleto="";

	public String getnombre_completoBusquedaPorNombreCompleto() {
		return this.nombre_completoBusquedaPorNombreCompleto;
	}

	public void setnombre_completoBusquedaPorNombreCompleto(String nombre_completoBusquedaPorNombreCompleto) {
		this.nombre_completoBusquedaPorNombreCompleto = nombre_completoBusquedaPorNombreCompleto;
	}

	public String rucBusquedaPorRuc="";

	public String getrucBusquedaPorRuc() {
		return this.rucBusquedaPorRuc;
	}

	public void setrucBusquedaPorRuc(String rucBusquedaPorRuc) {
		this.rucBusquedaPorRuc = rucBusquedaPorRuc;
	}

	public String telefonoBusquedaPorTelefono="";

	public String gettelefonoBusquedaPorTelefono() {
		return this.telefonoBusquedaPorTelefono;
	}

	public void settelefonoBusquedaPorTelefono(String telefonoBusquedaPorTelefono) {
		this.telefonoBusquedaPorTelefono = telefonoBusquedaPorTelefono;
	}

	public String telefono_celularBusquedaPorTelefonoCelular="";

	public String gettelefono_celularBusquedaPorTelefonoCelular() {
		return this.telefono_celularBusquedaPorTelefonoCelular;
	}

	public void settelefono_celularBusquedaPorTelefonoCelular(String telefono_celularBusquedaPorTelefonoCelular) {
		this.telefono_celularBusquedaPorTelefonoCelular = telefono_celularBusquedaPorTelefonoCelular;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
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

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ResponsableLogic getResponsableLogic()	{		
		return responsableLogic;
	}

	public void setResponsableLogic(ResponsableLogic responsableLogic) {
		this.responsableLogic = responsableLogic;
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
	
	public Boolean getIsEsNuevoResponsable() {
		return isEsNuevoResponsable;
	}

	public void setIsEsNuevoResponsable(Boolean isEsNuevoResponsable) {
		this.isEsNuevoResponsable = isEsNuevoResponsable;
	}

	public Boolean getEsParaAccionDesdeFormularioResponsable() {
		return esParaAccionDesdeFormularioResponsable;
	}
	
	public void setEsParaAccionDesdeFormularioResponsable(Boolean esParaAccionDesdeFormularioResponsable) {
		this.esParaAccionDesdeFormularioResponsable = esParaAccionDesdeFormularioResponsable;
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

			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(responsableSessionBean.getlidEmpresaActual());
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

			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(responsableSessionBean.getlidSucursalActual());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(responsableSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(responsableSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
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

					if(this.responsable!=null) {
						this.responsable.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormResponsable!=null) {
						this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaResponsable.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormResponsable!=null) {
						if(this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaResponsableGenerico)throws Exception
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
				jComboBoxid_empresaResponsableGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaResponsableGenerico!=null && jComboBoxid_empresaResponsableGenerico.getItemCount()>0) {
					jComboBoxid_empresaResponsableGenerico.setSelectedIndex(0);
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

					if(this.responsable!=null) {
						this.responsable.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormResponsable!=null) {
						this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalResponsable.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormResponsable!=null) {
						if(this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalResponsableGenerico)throws Exception
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
				jComboBoxid_sucursalResponsableGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalResponsableGenerico!=null && jComboBoxid_sucursalResponsableGenerico.getItemCount()>0) {
					jComboBoxid_sucursalResponsableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.responsable!=null) {
						this.responsable.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormResponsable!=null) {
						this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteResponsable.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormResponsable!=null) {
						if(this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteResponsable!=null) {
						jComboBoxid_clienteFK_IdClienteResponsable.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteResponsable!=null) {
							//jComboBoxid_clienteFK_IdClienteResponsable.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteResponsable.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteResponsable.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteResponsableGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteResponsableGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteResponsableGenerico!=null && jComboBoxid_clienteResponsableGenerico.getItemCount()>0) {
					jComboBoxid_clienteResponsableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.responsable!=null) {
						this.responsable.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormResponsable!=null) {
						this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioResponsable.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormResponsable!=null) {
						if(this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.setSelectedIndex(0);
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

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioResponsableGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioResponsableGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioResponsableGenerico!=null && jComboBoxid_usuarioResponsableGenerico.getItemCount()>0) {
					jComboBoxid_usuarioResponsableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Responsable responsable,JComboBox jComboBoxid_empresaResponsableGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaResponsableGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaResponsableGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				responsable.setid_empresa(empresaAux.getId());
				responsable.setempresa_descripcion(ResponsableConstantesFunciones.getEmpresaDescripcion(empresaAux));
				responsable.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Responsable responsable,JComboBox jComboBoxid_sucursalResponsableGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalResponsableGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalResponsableGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				responsable.setid_sucursal(sucursalAux.getId());
				responsable.setsucursal_descripcion(ResponsableConstantesFunciones.getSucursalDescripcion(sucursalAux));
				responsable.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Responsable responsable,JComboBox jComboBoxid_clienteResponsableGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteResponsableGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteResponsableGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				responsable.setid_cliente(clienteAux.getId());
				responsable.setcliente_descripcion(ResponsableConstantesFunciones.getClienteDescripcion(clienteAux));
				responsable.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(Responsable responsable,JComboBox jComboBoxid_usuarioResponsableGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioResponsableGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioResponsableGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				responsable.setid_usuario(usuarioAux.getId());
				responsable.setusuario_descripcion(ResponsableConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				responsable.setUsuario(usuarioAux);			}
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

					if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsable!=null) { 
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsable!=null) { 
					}

					if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsable!=null) { 
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsable!=null) { 
					}

					if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsable!=null) { 
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsable!=null) { 
					}

					if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteResponsable.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteResponsable.addItem(cliente);
							}
						}

						if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsable!=null) { 
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsable!=null) { 
					}

					if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormResponsable!=null) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsable!=null) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormResponsable!=null) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsable!=null) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormResponsable!=null) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsable!=null) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteResponsable.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteResponsable.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormResponsable!=null) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsable!=null) {
							this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesResponsable() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ResponsableConstantesFunciones.refrescarForeignKeysDescripcionesResponsable(this.responsableLogic.getResponsables());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ResponsableConstantesFunciones.refrescarForeignKeysDescripcionesResponsable(this.responsables);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//responsableLogic.setResponsables(this.responsables);
			responsableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ResponsableParameterReturnGeneral getResponsableParameterGeneral() {
		return this.responsableParameterGeneral;
	}
	
	public void setResponsableParameterGeneral(ResponsableParameterReturnGeneral responsableParameterGeneral) {
		this.responsableParameterGeneral = responsableParameterGeneral;
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
	
	public Boolean getIsPermisoTodoResponsable() {
		return isPermisoTodoResponsable;
	}

	public void setIsPermisoTodoResponsable(Boolean isPermisoTodoResponsable) {
		this.isPermisoTodoResponsable = isPermisoTodoResponsable;
	}

	public Boolean getIsPermisoNuevoResponsable() {
		return isPermisoNuevoResponsable;
	}

	public void setIsPermisoNuevoResponsable(Boolean isPermisoNuevoResponsable) {
		this.isPermisoNuevoResponsable = isPermisoNuevoResponsable;
	}

	public Boolean getIsPermisoActualizarResponsable() {
		return isPermisoActualizarResponsable;
	}

	public void setIsPermisoActualizarResponsable(Boolean isPermisoActualizarResponsable) {
		this.isPermisoActualizarResponsable = isPermisoActualizarResponsable;
	}

	public Boolean getIsPermisoEliminarResponsable() {
		return isPermisoEliminarResponsable;
	}

	public void setIsPermisoEliminarResponsable(Boolean isPermisoEliminarResponsable) {
		this.isPermisoEliminarResponsable = isPermisoEliminarResponsable;
	}

	public Boolean getIsPermisoGuardarCambiosResponsable() {
		return isPermisoGuardarCambiosResponsable;
	}

	public void setIsPermisoGuardarCambiosResponsable(Boolean isPermisoGuardarCambiosResponsable) {
		this.isPermisoGuardarCambiosResponsable = isPermisoGuardarCambiosResponsable;
	}
	
	public Boolean getIsPermisoConsultaResponsable() {
		return isPermisoConsultaResponsable;
	}

	public void setIsPermisoConsultaResponsable(Boolean isPermisoConsultaResponsable) {
		this.isPermisoConsultaResponsable = isPermisoConsultaResponsable;
	}

	public Boolean getIsPermisoBusquedaResponsable() {
		return isPermisoBusquedaResponsable;
	}

	public void setIsPermisoBusquedaResponsable(Boolean isPermisoBusquedaResponsable) {
		this.isPermisoBusquedaResponsable = isPermisoBusquedaResponsable;
	}

	public Boolean getIsPermisoReporteResponsable() {
		return isPermisoReporteResponsable;
	}

	public void setIsPermisoReporteResponsable(Boolean isPermisoReporteResponsable) {
		this.isPermisoReporteResponsable = isPermisoReporteResponsable;
	}
	
	public Boolean getIsPermisoPaginacionMedioResponsable() {
		return isPermisoPaginacionMedioResponsable;
	}

	public void setIsPermisoPaginacionMedioResponsable(Boolean isPermisoPaginacionMedioResponsable) {
		this.isPermisoPaginacionMedioResponsable = isPermisoPaginacionMedioResponsable;
	}
	
	public Boolean getIsPermisoPaginacionTodoResponsable() {
		return isPermisoPaginacionTodoResponsable;
	}

	public void setIsPermisoPaginacionTodoResponsable(Boolean isPermisoPaginacionTodoResponsable) {
		this.isPermisoPaginacionTodoResponsable = isPermisoPaginacionTodoResponsable;
	}
	
	public Boolean getIsPermisoPaginacionAltoResponsable() {
		return isPermisoPaginacionAltoResponsable;
	}

	public void setIsPermisoPaginacionAltoResponsable(Boolean isPermisoPaginacionAltoResponsable) {
		this.isPermisoPaginacionAltoResponsable = isPermisoPaginacionAltoResponsable;
	}
	
	public Boolean getIsPermisoCopiarResponsable() {
		return isPermisoCopiarResponsable;
	}

	public void setIsPermisoCopiarResponsable(Boolean isPermisoCopiarResponsable) {
		this.isPermisoCopiarResponsable = isPermisoCopiarResponsable;
	}
	
	public Boolean getIsPermisoVerFormResponsable() {
		return isPermisoVerFormResponsable;
	}

	public void setIsPermisoVerFormResponsable(Boolean isPermisoVerFormResponsable) {
		this.isPermisoVerFormResponsable = isPermisoVerFormResponsable;
	}
	
	public Boolean getIsPermisoDuplicarResponsable() {
		return isPermisoDuplicarResponsable;
	}

	public void setIsPermisoDuplicarResponsable(Boolean isPermisoDuplicarResponsable) {
		this.isPermisoDuplicarResponsable = isPermisoDuplicarResponsable;
	}
	
	public Boolean getIsPermisoOrdenResponsable() {
		return isPermisoOrdenResponsable;
	}

	public void setIsPermisoOrdenResponsable(Boolean isPermisoOrdenResponsable) {
		this.isPermisoOrdenResponsable = isPermisoOrdenResponsable;
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
	
	public Boolean getIsVisibilidadCeldaNuevoResponsable() {
		return isVisibilidadCeldaNuevoResponsable;
	}

	public void setIsVisibilidadCeldaNuevoResponsable(Boolean isVisibilidadCeldaNuevoResponsable) {
		this.isVisibilidadCeldaNuevoResponsable = isVisibilidadCeldaNuevoResponsable;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarResponsable() {
		return isVisibilidadCeldaDuplicarResponsable;
	}

	public void setIsVisibilidadCeldaDuplicarResponsable(Boolean isVisibilidadCeldaDuplicarResponsable) {
		this.isVisibilidadCeldaDuplicarResponsable = isVisibilidadCeldaDuplicarResponsable;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarResponsable() {
		return isVisibilidadCeldaCopiarResponsable;
	}

	public void setIsVisibilidadCeldaCopiarResponsable(Boolean isVisibilidadCeldaCopiarResponsable) {
		this.isVisibilidadCeldaCopiarResponsable = isVisibilidadCeldaCopiarResponsable;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormResponsable() {
		return isVisibilidadCeldaVerFormResponsable;
	}

	public void setIsVisibilidadCeldaVerFormResponsable(Boolean isVisibilidadCeldaVerFormResponsable) {
		this.isVisibilidadCeldaVerFormResponsable = isVisibilidadCeldaVerFormResponsable;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenResponsable() {
		return isVisibilidadCeldaOrdenResponsable;
	}

	public void setIsVisibilidadCeldaOrdenResponsable(Boolean isVisibilidadCeldaOrdenResponsable) {
		this.isVisibilidadCeldaOrdenResponsable = isVisibilidadCeldaOrdenResponsable;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesResponsable() {
		return isVisibilidadCeldaNuevoRelacionesResponsable;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesResponsable(Boolean isVisibilidadCeldaNuevoRelacionesResponsable) {
		this.isVisibilidadCeldaNuevoRelacionesResponsable = isVisibilidadCeldaNuevoRelacionesResponsable;
	}
	
	public Boolean getIsVisibilidadCeldaModificarResponsable() {
		return isVisibilidadCeldaModificarResponsable;
	}

	public void setIsVisibilidadCeldaModificarResponsable(Boolean isVisibilidadCeldaModificarResponsable) {
		this.isVisibilidadCeldaModificarResponsable = isVisibilidadCeldaModificarResponsable;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarResponsable() {
		return isVisibilidadCeldaActualizarResponsable;
	}

	public void setIsVisibilidadCeldaActualizarResponsable(Boolean isVisibilidadCeldaActualizarResponsable) {
		this.isVisibilidadCeldaActualizarResponsable = isVisibilidadCeldaActualizarResponsable;
	}

	public Boolean getIsVisibilidadCeldaEliminarResponsable() {
		return isVisibilidadCeldaEliminarResponsable;
	}

	public void setIsVisibilidadCeldaEliminarResponsable(Boolean isVisibilidadCeldaEliminarResponsable) {
		this.isVisibilidadCeldaEliminarResponsable = isVisibilidadCeldaEliminarResponsable;
	}

	public Boolean getIsVisibilidadCeldaCancelarResponsable() {
		return isVisibilidadCeldaCancelarResponsable;
	}

	public void setIsVisibilidadCeldaCancelarResponsable(Boolean isVisibilidadCeldaCancelarResponsable) {
		this.isVisibilidadCeldaCancelarResponsable = isVisibilidadCeldaCancelarResponsable;
	}

	public Boolean getIsVisibilidadCeldaGuardarResponsable() {
		return isVisibilidadCeldaGuardarResponsable;
	}

	public void setIsVisibilidadCeldaGuardarResponsable(Boolean isVisibilidadCeldaGuardarResponsable) {
		this.isVisibilidadCeldaGuardarResponsable = isVisibilidadCeldaGuardarResponsable;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosResponsable() {
		return isVisibilidadCeldaGuardarCambiosResponsable;
	}

	public void setIsVisibilidadCeldaGuardarCambiosResponsable(Boolean isVisibilidadCeldaGuardarCambiosResponsable) {
		this.isVisibilidadCeldaGuardarCambiosResponsable = isVisibilidadCeldaGuardarCambiosResponsable;
	}
		
	public ResponsableSessionBean getresponsableSessionBean() {
		return this.responsableSessionBean;
	}
	
	public void setresponsableSessionBean(ResponsableSessionBean responsableSessionBean) {
		this.responsableSessionBean=responsableSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdentificacion() {
		return this.isVisibilidadBusquedaPorIdentificacion;
	}

	public void setisVisibilidadBusquedaPorIdentificacion(Boolean isVisibilidadBusquedaPorIdentificacion) {
		this.isVisibilidadBusquedaPorIdentificacion=isVisibilidadBusquedaPorIdentificacion;
	}

	public Boolean getisVisibilidadBusquedaPorNombreCompleto() {
		return this.isVisibilidadBusquedaPorNombreCompleto;
	}

	public void setisVisibilidadBusquedaPorNombreCompleto(Boolean isVisibilidadBusquedaPorNombreCompleto) {
		this.isVisibilidadBusquedaPorNombreCompleto=isVisibilidadBusquedaPorNombreCompleto;
	}

	public Boolean getisVisibilidadBusquedaPorRuc() {
		return this.isVisibilidadBusquedaPorRuc;
	}

	public void setisVisibilidadBusquedaPorRuc(Boolean isVisibilidadBusquedaPorRuc) {
		this.isVisibilidadBusquedaPorRuc=isVisibilidadBusquedaPorRuc;
	}

	public Boolean getisVisibilidadBusquedaPorTelefono() {
		return this.isVisibilidadBusquedaPorTelefono;
	}

	public void setisVisibilidadBusquedaPorTelefono(Boolean isVisibilidadBusquedaPorTelefono) {
		this.isVisibilidadBusquedaPorTelefono=isVisibilidadBusquedaPorTelefono;
	}

	public Boolean getisVisibilidadBusquedaPorTelefonoCelular() {
		return this.isVisibilidadBusquedaPorTelefonoCelular;
	}

	public void setisVisibilidadBusquedaPorTelefonoCelular(Boolean isVisibilidadBusquedaPorTelefonoCelular) {
		this.isVisibilidadBusquedaPorTelefonoCelular=isVisibilidadBusquedaPorTelefonoCelular;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
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

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysResponsable(Responsable responsable)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(responsable,null);
				this.setActualParaGuardarSucursalForeignKey(responsable,null);
				this.setActualParaGuardarClienteForeignKey(responsable,null);
				this.setActualParaGuardarUsuarioForeignKey(responsable,null);
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
	
	public void bugActualizarReferenciaActual(Responsable responsable,Responsable responsableAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalResponsable(responsable);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		responsableAux.setId(responsable.getId());
		responsableAux.setVersionRow(responsable.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessResponsable();
		
			int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = responsableValidator.getInvalidValues(this.responsable);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			responsableLogic.setDatosCliente(datosCliente);
			responsableLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				responsableAux=new  Responsable();
				
				responsableAux.setIsNew(true);
				responsableAux.setIsChanged(true);
				
				responsableAux.setResponsableOriginal(this.responsable);
				
				responsableAux.setId(this.responsable.getId());	
				responsableAux.setVersionRow(this.responsable.getVersionRow());	
				responsableAux.setid_empresa(this.responsable.getid_empresa());	
				responsableAux.setid_sucursal(this.responsable.getid_sucursal());	
				responsableAux.setid_cliente(this.responsable.getid_cliente());	
				responsableAux.setid_usuario(this.responsable.getid_usuario());	
				responsableAux.setidentificacion(this.responsable.getidentificacion());	
				responsableAux.setruc(this.responsable.getruc());	
				responsableAux.setnombre(this.responsable.getnombre());	
				responsableAux.setapellido(this.responsable.getapellido());	
				responsableAux.setnombre_completo(this.responsable.getnombre_completo());	
				responsableAux.setemail(this.responsable.getemail());	
				responsableAux.settelefono(this.responsable.gettelefono());	
				responsableAux.settelefono_celular(this.responsable.gettelefono_celular());	
				responsableAux.setdireccion(this.responsable.getdireccion());	
				responsableAux.setfax(this.responsable.getfax());	
				responsableAux.setobservacion(this.responsable.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.responsableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.responsableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(responsableAux,responsableLogic.getResponsables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsableAux,responsables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.responsableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.responsableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.saveResponsables();//WithConnection
						//responsableLogic.getSetVersionRowResponsables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.responsable,responsableAux);
					
					this.refrescarForeignKeysDescripcionesResponsable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.responsableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas().addAll(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturasEliminados);
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions().addAll(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors().addAll(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos().addAll(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturas.addAll(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturasEliminados);
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacions.addAll(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexpors.addAll(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidos.addAll(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolis.addAll(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								responsableLogic.saveResponsableRelaciones(responsableAux,this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas(),this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions(),this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos(),this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors(),this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());//WithConnection
								//responsableLogic.getSetVersionRowResponsables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.responsable,responsableAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(new ArrayList<Factura>());
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(new ArrayList<Consignacion>());
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(new ArrayList<PedidoExpor>());
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(new ArrayList<Pedido>());
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(new ArrayList<NotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturas= new ArrayList<Factura>();
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacions= new ArrayList<Consignacion>();
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexpors= new ArrayList<PedidoExpor>();
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidos= new ArrayList<Pedido>();
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolis= new ArrayList<NotaCreditoSoli>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setFacturas(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());

							if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setConsignacions(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());

							if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setPedidos(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());

							if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setPedidoExpors(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());

							if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setNotaCreditoSolis(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.responsableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.responsableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(responsableAux,responsableLogic.getResponsables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(responsableAux,responsables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.responsable,responsableAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				responsableAux=new  Responsable();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.responsableSessionBean.getEsGuardarRelacionado() 
					|| (this.responsableSessionBean.getEsGuardarRelacionado() && this.responsable.getId()>=0)) {
						
					responsableAux.setIsNew(false);
				}
				
				responsableAux.setIsDeleted(false);
			
				responsableAux.setId(this.responsable.getId());	
				responsableAux.setVersionRow(this.responsable.getVersionRow());	
				responsableAux.setid_empresa(this.responsable.getid_empresa());	
				responsableAux.setid_sucursal(this.responsable.getid_sucursal());	
				responsableAux.setid_cliente(this.responsable.getid_cliente());	
				responsableAux.setid_usuario(this.responsable.getid_usuario());	
				responsableAux.setidentificacion(this.responsable.getidentificacion());	
				responsableAux.setruc(this.responsable.getruc());	
				responsableAux.setnombre(this.responsable.getnombre());	
				responsableAux.setapellido(this.responsable.getapellido());	
				responsableAux.setnombre_completo(this.responsable.getnombre_completo());	
				responsableAux.setemail(this.responsable.getemail());	
				responsableAux.settelefono(this.responsable.gettelefono());	
				responsableAux.settelefono_celular(this.responsable.gettelefono_celular());	
				responsableAux.setdireccion(this.responsable.getdireccion());	
				responsableAux.setfax(this.responsable.getfax());	
				responsableAux.setobservacion(this.responsable.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(responsableAux,responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsableAux,responsables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.responsableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.responsableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.saveResponsables();//WithConnection
						//responsableLogic.getSetVersionRowResponsables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.responsable,responsableAux);
					
					this.refrescarForeignKeysDescripcionesResponsable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.responsableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas().addAll(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturasEliminados);
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions().addAll(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors().addAll(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos().addAll(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturas.addAll(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturasEliminados);
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacions.addAll(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexpors.addAll(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidos.addAll(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolis.addAll(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								responsableLogic.saveResponsableRelaciones(responsableAux,this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas(),this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions(),this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos(),this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors(),this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());//WithConnection
								//responsableLogic.getSetVersionRowResponsables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.responsable,responsableAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(new ArrayList<Factura>());
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(new ArrayList<Consignacion>());
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(new ArrayList<PedidoExpor>());
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(new ArrayList<Pedido>());
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(new ArrayList<NotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturas= new ArrayList<Factura>();
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacions= new ArrayList<Consignacion>();
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexpors= new ArrayList<PedidoExpor>();
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidos= new ArrayList<Pedido>();
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolis= new ArrayList<NotaCreditoSoli>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setFacturas(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());

							if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setConsignacions(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());

							if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setPedidos(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());

							if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setPedidoExpors(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());

							if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setNotaCreditoSolis(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.responsableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.responsableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(responsableAux,responsableLogic.getResponsables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(responsableAux,responsables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.responsable,responsableAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				responsableAux=new  Responsable();
				
				responsableAux.setIsNew(false);
				responsableAux.setIsChanged(false);
				
				responsableAux.setIsDeleted(true);
				
				responsableAux.setId(this.responsable.getId());	
				responsableAux.setVersionRow(this.responsable.getVersionRow());	
				responsableAux.setid_empresa(this.responsable.getid_empresa());	
				responsableAux.setid_sucursal(this.responsable.getid_sucursal());	
				responsableAux.setid_cliente(this.responsable.getid_cliente());	
				responsableAux.setid_usuario(this.responsable.getid_usuario());	
				responsableAux.setidentificacion(this.responsable.getidentificacion());	
				responsableAux.setruc(this.responsable.getruc());	
				responsableAux.setnombre(this.responsable.getnombre());	
				responsableAux.setapellido(this.responsable.getapellido());	
				responsableAux.setnombre_completo(this.responsable.getnombre_completo());	
				responsableAux.setemail(this.responsable.getemail());	
				responsableAux.settelefono(this.responsable.gettelefono());	
				responsableAux.settelefono_celular(this.responsable.gettelefono_celular());	
				responsableAux.setdireccion(this.responsable.getdireccion());	
				responsableAux.setfax(this.responsable.getfax());	
				responsableAux.setobservacion(this.responsable.getobservacion());	
				
				if(this.responsableSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.responsableAux.getId()>=0) {	
						this.responsablesEliminados.add(responsableAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(responsableAux,responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsableAux,responsables);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.responsableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.responsableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.saveResponsables();//WithConnection
						//responsableLogic.getSetVersionRowResponsables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.responsableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas().addAll(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturasEliminados);
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions().addAll(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors().addAll(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos().addAll(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturas.addAll(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturasEliminados);
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacions.addAll(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexpors.addAll(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidos.addAll(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolis.addAll(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								responsableLogic.saveResponsableRelaciones(responsableAux,this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas(),this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions(),this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos(),this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors(),this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());//WithConnection
								//responsableLogic.getSetVersionRowResponsables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(new ArrayList<Factura>());
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(new ArrayList<Consignacion>());
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(new ArrayList<PedidoExpor>());
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(new ArrayList<Pedido>());
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(new ArrayList<NotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturas= new ArrayList<Factura>();
							this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacions= new ArrayList<Consignacion>();
							this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexpors= new ArrayList<PedidoExpor>();
							this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidos= new ArrayList<Pedido>();
							this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolis= new ArrayList<NotaCreditoSoli>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setFacturas(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());

							if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setConsignacions(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());

							if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setPedidos(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());

							if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setPedidoExpors(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());

							if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							responsableAux.setNotaCreditoSolis(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.responsableSessionBean.getEstaModoGuardarRelaciones() 
								|| this.responsableSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(responsableAux,responsableLogic.getResponsables());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(responsableAux,responsables);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getResponsables().addAll(this.responsablesEliminados);
					
					responsableLogic.saveResponsables();//WithConnection
					//responsableLogic.getSetVersionRowResponsables();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesResponsable();
				
				this.responsablesEliminados= new ArrayList<Responsable>();		
			}
			
			if(this.responsableSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Responsable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.responsable=responsableAux;
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
      		//this.finishProcessResponsable();
      	}
		
	}	
	
	public void actualizarRelaciones(Responsable responsableLocal) throws Exception {
		
		if(this.responsableSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				responsableLocal.setFacturas(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
				responsableLocal.setConsignacions(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());
				responsableLocal.setPedidos(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());
				responsableLocal.setPedidoExpors(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
				responsableLocal.setNotaCreditoSolis(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
			
			} else {
			
				responsableLocal.setFacturas(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturas);
				responsableLocal.setConsignacions(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacions);
				responsableLocal.setPedidos(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidos);
				responsableLocal.setPedidoExpors(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexpors);
				responsableLocal.setNotaCreditoSolis(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosolis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Responsable responsableLocal) throws Exception {	
		if(this.responsableSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				responsableLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				responsableLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				responsableLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				responsableLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarResponsableActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = responsableValidator.getInvalidValues(this.responsable);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Responsable responsable,List<Responsable> responsables) throws Exception {
		try	{		
			ResponsableConstantesFunciones.actualizarLista(responsable,responsables,this.responsableSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Responsable responsable,List<Responsable> responsables) throws Exception {
		try	{			
			ResponsableConstantesFunciones.actualizarSelectedLista(responsable,responsables);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Responsable> responsablesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				responsablesLocal=this.responsableLogic.getResponsables();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				responsablesLocal=this.responsables;
			}
			//ARCHITECTURE
		
			for(Responsable responsableLocal:responsablesLocal) {
				if(this.permiteMantenimiento(responsableLocal) && responsableLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ResponsableConstantesFunciones.getResponsableLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelid_empresaResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelid_sucursalResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelid_clienteResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelid_usuarioResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.IDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelidentificacionResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelrucResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelnombreResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelapellidoResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelnombre_completoResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelemailResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabeltelefonoResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.TELEFONOCELULAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabeltelefono_celularResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabeldireccionResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.FAX)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelfaxResponsable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelobservacionResponsable,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormResponsable!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelid_empresaResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelid_sucursalResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelid_clienteResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelid_usuarioResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelidentificacionResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelrucResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelnombreResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelapellidoResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelnombre_completoResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelemailResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabeltelefonoResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabeltelefono_celularResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabeldireccionResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelfaxResponsable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsable.jLabelobservacionResponsable,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Factura")) {
			if(this.responsable==null) {
				this.responsable= new Responsable();
			}

			if(this.responsableSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoResponsable
				this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);

				this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.getfactura().setResponsable(this.responsable);
			}

			return;
		}
		 else  if(sTipo.equals("Consignacion")) {
			if(this.responsable==null) {
				this.responsable= new Responsable();
			}

			if(this.responsableSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoResponsable
				this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);

				this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.getconsignacion().setResponsable(this.responsable);
			}

			return;
		}
		 else  if(sTipo.equals("Pedido")) {
			if(this.responsable==null) {
				this.responsable= new Responsable();
			}

			if(this.responsableSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoResponsable
				this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);

				this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.getpedido().setResponsable(this.responsable);
			}

			return;
		}
		 else  if(sTipo.equals("PedidoExpor")) {
			if(this.responsable==null) {
				this.responsable= new Responsable();
			}

			if(this.responsableSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoResponsable
				this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);

				this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.getpedidoexpor().setResponsable(this.responsable);
			}

			return;
		}
		 else  if(sTipo.equals("NotaCreditoSoli")) {
			if(this.responsable==null) {
				this.responsable= new Responsable();
			}

			if(this.responsableSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoResponsable
				this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);

				this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.getnotacreditosoli().setResponsable(this.responsable);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoResponsable--;	
		
		
		this.responsableAux=new Responsable();
		
		this.responsableAux.setId(this.iIdNuevoResponsable);
		this.responsableAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.responsableLogic.getResponsables().add(this.responsableAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.responsables.add(this.responsableAux);
		}
		//ARCHITECTURE
		
		this.responsable=this.responsableAux;
		
		if(ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioResponsable(this.responsable);
			this.setVariablesObjetoActualToFormularioForeignKeyResponsable(this.responsable);
		}
				
		//this.setDefaultControlesResponsable();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyResponsable();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyResponsable();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyResponsable();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResponsable(this.responsableBean,this.responsable,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ResponsableConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.responsableSessionBean.getConGuardarRelaciones()) {
			classes=ResponsableConstantesFunciones.getClassesRelationshipsOfResponsable(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.responsableReturnGeneral=responsableLogic.procesarEventosResponsablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsableLogic.getResponsables(),this.responsable,this.responsableParameterGeneral,this.isEsNuevoResponsable,classes);//this.responsableLogic.getResponsable()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanResponsable(this.responsableReturnGeneral,this.responsableBean,false);
		
		if(this.responsableReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyResponsable(this.responsableReturnGeneral.getResponsable());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioResponsable(this.responsableReturnGeneral.getResponsable());
		}
		
		if(this.responsableReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioResponsable(this.responsableReturnGeneral.getResponsable(),classes);//this.responsableBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualResponsable(this.responsable,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyResponsable();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyResponsable();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResponsableBeanSwingJInternalFrameAdditional.RecargarFormResponsable(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingResponsable(false);
						
			if(responsableSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaSessionBean.getEsGuardarRelacionado() && FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionSessionBean.getEsGuardarRelacionado() && ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConsignacionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado() && PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoExporActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoSessionBean.getEsGuardarRelacionado() && PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getEsGuardarRelacionado() && NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoSoliActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ResponsableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsable();
			}
			
			this.actualizarVisualTableDatosResponsable();
			
			this.jTableDatosResponsable.setRowSelectionInterval(this.getIndiceNuevoResponsable(), this.getIndiceNuevoResponsable());
			
			this.seleccionarFilaTablaResponsableActual();
						
			this.actualizarEstadoCeldasBotonesResponsable("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesResponsable(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormResponsable.jTextFieldidentificacionResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activaridentificacionResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextFieldrucResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarrucResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreanombreResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarnombreResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreaapellidoResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarapellidoResponsable);//
		this.jInternalFrameDetalleFormResponsable.jTextAreanombre_completoResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarnombre_completoResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreaemailResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activaremailResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextFieldtelefonoResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activartelefonoResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextFieldtelefono_celularResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activartelefono_celularResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreadireccionResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activardireccionResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextFieldfaxResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarfaxResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreaobservacionResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarobservacionResponsable);	
		//
		this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarid_empresaResponsable);//
		this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarid_sucursalResponsable);
		this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarid_clienteResponsable);//
		this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.setEnabled(isHabilitar && this.responsableConstantesFunciones.activarid_usuarioResponsable);
	};
	
	public void setDefaultControlesResponsable() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoResponsable(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.responsableSessionBean.setConGuardarRelaciones(true);			
			this.responsableSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.responsableSessionBean.setConGuardarRelaciones(false);			
			this.responsableSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoResponsable() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsable responsableAux:this.responsableLogic.getResponsables()) {
				if(responsableAux.getId().equals(this.iIdNuevoResponsable)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsable responsableAux:this.responsables) {
				if(responsableAux.getId().equals(this.iIdNuevoResponsable)) {
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
	
	public int getIndiceActualResponsable(Responsable responsable,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsable responsableAux:this.responsableLogic.getResponsables()) {
				if(responsableAux.getId().equals(responsable.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsable responsableAux:this.responsables) {
				if(responsableAux.getId().equals(responsable.getId())) {
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
	
	public void setCamposBaseDesdeOriginalResponsable(Responsable responsableOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsable responsableAux:this.responsableLogic.getResponsables()) {
				if(responsableAux.getResponsableOriginal().getId().equals(responsableOriginal.getId())) {
					existe=true;
					responsableOriginal.setId(responsableAux.getId());
					responsableOriginal.setVersionRow(responsableAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsable responsableAux:this.responsables) {
				if(responsableAux.getResponsableOriginal().getId().equals(responsableOriginal.getId())) {
					existe=true;
					responsableOriginal.setId(responsableAux.getId());
					responsableOriginal.setVersionRow(responsableAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosResponsable(Boolean esParaCancelar) throws Exception {
		responsablesAux=new ArrayList<Responsable>();
		responsableAux=new Responsable();
		
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Responsable responsableAux:this.responsableLogic.getResponsables()) {
					if(responsableAux.getId()<0) {
						responsablesAux.add(responsableAux);
					}		
				}
				this.iIdNuevoResponsable=0L;
				this.responsableLogic.getResponsables().removeAll(responsablesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Responsable responsableAux:this.responsables) {
					if(responsableAux.getId()<0) {
						responsablesAux.add(responsableAux);
					}		
				}
				this.iIdNuevoResponsable=0L;
				this.responsables.removeAll(responsablesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoResponsable 
					&& this.responsableLogic.getResponsables().size()>0
					) {
					responsableAux=this.responsableLogic.getResponsables().get(this.responsableLogic.getResponsables().size() - 1);
				
					if(responsableAux.getId()<0) {
						this.responsableLogic.getResponsables().remove(responsableAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoResponsable && this.responsables.size()>0) {
					responsableAux=this.responsables.get(this.responsables.size() - 1);
				
					if(responsableAux.getId()<0) {
						this.responsables.remove(responsableAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoResponsable(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(responsable.getId()<0) {
				this.responsableLogic.getResponsables().remove(this.responsable);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(responsable.getId()<0) {
				this.responsables.remove(this.responsable);
			}
		}			
	}
	
	public void setEstadosInicialesResponsable(List<Responsable> responsablesAux) throws Exception {
		ResponsableConstantesFunciones.setEstadosInicialesResponsable(responsablesAux);
	}
	
	public void setEstadosInicialesResponsable(Responsable responsableAux) throws Exception {
		ResponsableConstantesFunciones.setEstadosInicialesResponsable(responsableAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarResponsableActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesResponsable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarResponsableActual()) {
				if(!this.isEsNuevoResponsable) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesResponsable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoResponsable=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarResponsableActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Responsable ?", "MANTENIMIENTO DE Responsable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesResponsable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Responsable responsable) throws Exception {
		ResponsableConstantesFunciones.seleccionarAsignar(this.responsable,responsable);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarResponsable=this.isPermisoActualizarOriginalResponsable;
			
			
			this.seleccionarAsignar(responsable);
			
			

			idClienteActual=responsable.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResponsableConstantesFunciones.quitarEspaciosResponsable(this.responsable,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesResponsable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.responsableSessionBean.setsFuncionBusquedaRapida(this.responsableSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoResponsable) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosResponsable(esParaCancelar);				
				this.cancelarNuevoResponsable(esParaCancelar);								
			}
			
			this.responsable=new Responsable();
			
			this.inicializarResponsable();
			
			this.actualizarEstadoCeldasBotonesResponsable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarResponsable() throws Exception {
		try {
			ResponsableConstantesFunciones.inicializarResponsable(this.responsable);
			
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
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.responsableLogic.getResponsables().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteResponsables(String sAccionBusqueda,List<Responsable> responsablesParaReportes) throws Exception {
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
					sPathReporteFinal="Responsable"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ResponsableMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ResponsableMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Responsable"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Responsables");		
		parameters.put("busquedapor", ResponsableConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Factura.class));
			classes.add(new Classe(Consignacion.class));
			classes.add(new Classe(PedidoExpor.class));
			classes.add(new Classe(Pedido.class));
			classes.add(new Classe(NotaCreditoSoli.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ResponsableLogic responsableLogicAuxiliar=new ResponsableLogic();
					responsableLogicAuxiliar.setDatosCliente(responsableLogic.getDatosCliente());				
					responsableLogicAuxiliar.setResponsables(responsablesParaReportes);
					
					responsableLogicAuxiliar.cargarRelacionesLoteForeignKeyResponsableWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					responsablesParaReportes=responsableLogicAuxiliar.getResponsables();
					
					//responsableLogic.getNewConnexionToDeep();
					
					//for (Responsable responsable:responsablesParaReportes) {
					//	responsableLogic.deepLoad(responsable, false, DeepLoadType.INCLUDE, classes);
					//}						
					//responsableLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//responsableLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFactura = AuxiliarReportes.class.getResourceAsStream("FacturaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_factura", reportFileFactura);

			InputStream reportFileConsignacion = AuxiliarReportes.class.getResourceAsStream("ConsignacionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_consignacion", reportFileConsignacion);

			InputStream reportFilePedidoExpor = AuxiliarReportes.class.getResourceAsStream("PedidoExporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidoexpor", reportFilePedidoExpor);

			InputStream reportFilePedido = AuxiliarReportes.class.getResourceAsStream("PedidoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedido", reportFilePedido);

			InputStream reportFileNotaCreditoSoli = AuxiliarReportes.class.getResourceAsStream("NotaCreditoSoliDetalleRelacionesDesign.jasper");
			parameters.put("subreport_notacreditosoli", reportFileNotaCreditoSoli);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceResponsable=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ResponsableConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ResponsableConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceResponsable=new JRBeanArrayDataSource(ResponsableJInternalFrame.TraerResponsableBeans(responsablesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceResponsable);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ResponsableConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ResponsableConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ResponsableBean.TraerResponsableBeans(responsablesParaReportes).toArray()));
							
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
				this.generarExcelReporteResponsables(sAccionBusqueda,sTipoArchivoReporte,responsablesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalResponsables(sAccionBusqueda,sTipoArchivoReporte,responsablesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoResponsableActionPerformed(null);
					//this.generarExcelReporteResponsables(sAccionBusqueda,sTipoArchivoReporte,responsablesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalResponsables(sAccionBusqueda,sTipoArchivoReporte,responsablesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesResponsables(sAccionBusqueda,sTipoArchivoReporte,responsablesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesResponsables(sAccionBusqueda,sTipoArchivoReporte,responsablesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteResponsables(String sAccionBusqueda,String sTipoArchivoReporte,List<Responsable> responsablesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsable";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Responsables");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResponsable("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Responsable responsable : responsablesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ResponsableConstantesFunciones.generarExcelReporteDataResponsable("NORMAL",row,workbook,responsable,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderResponsable(String sTipo,Row row,Workbook workbook) {
		
		ResponsableConstantesFunciones.generarExcelReporteHeaderResponsable(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalResponsables(String sAccionBusqueda,String sTipoArchivoReporte,List<Responsable> responsablesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsable_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Responsables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Responsable responsable : responsablesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ResponsableConstantesFunciones.getResponsableDescripcion(responsable));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_IDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getidentificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getemail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.gettelefono_celular());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_FAX))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_FAX);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getfax());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsable.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesResponsables(String sAccionBusqueda,String sTipoArchivoReporte,List<Responsable> responsablesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Responsable> responsablesRespaldo=null;
		
		classes=ResponsableConstantesFunciones.getClassesRelationshipsOfResponsable(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.responsableLogic.setDatosCliente(this.datosCliente);
		this.responsableLogic.setDatosDeep(this.datosDeep);
		this.responsableLogic.setIsConDeep(true);
		
		responsablesRespaldo=this.responsableLogic.getResponsables();
		
		this.responsableLogic.setResponsables(responsablesParaReportes);	
		this.responsableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		responsablesParaReportes=this.responsableLogic.getResponsables();
		this.responsableLogic.setResponsables(responsablesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsable_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Responsables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResponsable("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Responsable responsable : responsablesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderResponsable("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ResponsableConstantesFunciones.generarExcelReporteDataResponsable("NORMAL",row,workbook,responsable,cellStyleDataAux);
		
			
			


				//Factura
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaConstantesFunciones.SCLASSWEBTITULO))) {

				if(responsable.getFacturas()!=null && responsable.getFacturas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaConstantesFunciones.generarExcelReporteHeaderFactura("RELACIONADO",row,workbook);
				}

				if(responsable.getFacturas()!=null) {
					i2=0;
					for(Factura factura : responsable.getFacturas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaConstantesFunciones.generarExcelReporteDataFactura("RELACIONADO",row,workbook,factura,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Consignacion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ConsignacionConstantesFunciones.SCLASSWEBTITULO))) {

				if(responsable.getConsignacions()!=null && responsable.getConsignacions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ConsignacionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ConsignacionConstantesFunciones.generarExcelReporteHeaderConsignacion("RELACIONADO",row,workbook);
				}

				if(responsable.getConsignacions()!=null) {
					i2=0;
					for(Consignacion consignacion : responsable.getConsignacions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ConsignacionConstantesFunciones.generarExcelReporteDataConsignacion("RELACIONADO",row,workbook,consignacion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Pedido
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoConstantesFunciones.SCLASSWEBTITULO))) {

				if(responsable.getPedidos()!=null && responsable.getPedidos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoConstantesFunciones.generarExcelReporteHeaderPedido("RELACIONADO",row,workbook);
				}

				if(responsable.getPedidos()!=null) {
					i2=0;
					for(Pedido pedido : responsable.getPedidos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoConstantesFunciones.generarExcelReporteDataPedido("RELACIONADO",row,workbook,pedido,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PedidoExpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoExporConstantesFunciones.SCLASSWEBTITULO))) {

				if(responsable.getPedidoExpors()!=null && responsable.getPedidoExpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoExporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoExporConstantesFunciones.generarExcelReporteHeaderPedidoExpor("RELACIONADO",row,workbook);
				}

				if(responsable.getPedidoExpors()!=null) {
					i2=0;
					for(PedidoExpor pedidoexpor : responsable.getPedidoExpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoExporConstantesFunciones.generarExcelReporteDataPedidoExpor("RELACIONADO",row,workbook,pedidoexpor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//NotaCreditoSoli
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO))) {

				if(responsable.getNotaCreditoSolis()!=null && responsable.getNotaCreditoSolis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NotaCreditoSoliConstantesFunciones.generarExcelReporteHeaderNotaCreditoSoli("RELACIONADO",row,workbook);
				}

				if(responsable.getNotaCreditoSolis()!=null) {
					i2=0;
					for(NotaCreditoSoli notacreditosoli : responsable.getNotaCreditoSolis()) {
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
		cell.setCellValue(ResponsableConstantesFunciones.getResponsableDescripcion(responsable));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoResponsable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoResponsable.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsable.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessResponsable() throws Exception {		
		this.startProcessResponsable(true);
	}
	
	public void startProcessResponsable(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasResponsable ,this.jPanelParametrosReportesResponsable, this.jScrollPanelDatosResponsable,this.jPanelPaginacionResponsable, this.jScrollPanelDatosEdicionResponsable, this.jPanelAccionesResponsable,this.jPanelAccionesFormularioResponsable,this.jmenuBarResponsable,this.jmenuBarDetalleResponsable,this.jTtoolBarResponsable,this.jTtoolBarDetalleResponsable);		
		
		final JTabbedPane jTabbedPaneBusquedasResponsable=this.jTabbedPaneBusquedasResponsable; 
		
		final JPanel jPanelParametrosReportesResponsable=this.jPanelParametrosReportesResponsable;
		//final JScrollPane jScrollPanelDatosResponsable=this.jScrollPanelDatosResponsable;
		final JTable jTableDatosResponsable=this.jTableDatosResponsable;		
		final JPanel jPanelPaginacionResponsable=this.jPanelPaginacionResponsable;
		//final JScrollPane jScrollPanelDatosEdicionResponsable=this.jScrollPanelDatosEdicionResponsable;
		final JPanel jPanelAccionesResponsable=this.jPanelAccionesResponsable;
		
		JPanel jPanelCamposAuxiliarResponsable=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarResponsable=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormResponsable!=null) {
			jPanelCamposAuxiliarResponsable=this.jInternalFrameDetalleFormResponsable.jPanelCamposResponsable;
			jPanelAccionesFormularioAuxiliarResponsable=this.jInternalFrameDetalleFormResponsable.jPanelAccionesFormularioResponsable;
		}
		
		final JPanel jPanelCamposResponsable=jPanelCamposAuxiliarResponsable;
		final JPanel jPanelAccionesFormularioResponsable=jPanelAccionesFormularioAuxiliarResponsable;
		
		
		final JMenuBar jmenuBarResponsable=this.jmenuBarResponsable;
		final JToolBar jTtoolBarResponsable=this.jTtoolBarResponsable;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarResponsable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResponsable=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) {
			jmenuBarDetalleAuxiliarResponsable=this.jInternalFrameDetalleFormResponsable.jmenuBarDetalleResponsable;
			jTtoolBarDetalleAuxiliarResponsable=this.jInternalFrameDetalleFormResponsable.jTtoolBarDetalleResponsable;
		}
		
		final JMenuBar jmenuBarDetalleResponsable=jmenuBarDetalleAuxiliarResponsable;
		final JToolBar jTtoolBarDetalleResponsable=jTtoolBarDetalleAuxiliarResponsable;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResponsable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResponsable;
			processRunnable.jTableDatos=jTableDatosResponsable;
			processRunnable.jPanelCampos=jPanelCamposResponsable;
			processRunnable.jPanelPaginacion=jPanelPaginacionResponsable;
			processRunnable.jPanelAcciones=jPanelAccionesResponsable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResponsable;
			
			
			processRunnable.jmenuBar=jmenuBarResponsable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResponsable;
			processRunnable.jTtoolBar=jTtoolBarResponsable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResponsable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResponsable ,jPanelParametrosReportesResponsable,jTableDatosResponsable, /*jScrollPanelDatosResponsable,*/jPanelCamposResponsable,jPanelPaginacionResponsable, /*jScrollPanelDatosEdicionResponsable,*/ jPanelAccionesResponsable,jPanelAccionesFormularioResponsable,jmenuBarResponsable,jmenuBarDetalleResponsable,jTtoolBarResponsable,jTtoolBarDetalleResponsable);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResponsable ,jPanelParametrosReportesResponsable, jScrollPanelDatosResponsable,jPanelPaginacionResponsable, jScrollPanelDatosEdicionResponsable, jPanelAccionesResponsable,jPanelAccionesFormularioResponsable,jmenuBarResponsable,jmenuBarDetalleResponsable,jTtoolBarResponsable,jTtoolBarDetalleResponsable);
						
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
	
	public void finishProcessResponsable() {// throws Exception 
		this.finishProcessResponsable(true);
	}
	
	public void finishProcessResponsable(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasResponsable ,this.jPanelParametrosReportesResponsable, this.jScrollPanelDatosResponsable,this.jPanelPaginacionResponsable, this.jScrollPanelDatosEdicionResponsable, this.jPanelAccionesResponsable,this.jPanelAccionesFormularioResponsable,this.jmenuBarResponsable,this.jmenuBarDetalleResponsable,this.jTtoolBarResponsable,this.jTtoolBarDetalleResponsable);		
		
		final JTabbedPane jTabbedPaneBusquedasResponsable=this.jTabbedPaneBusquedasResponsable; 
		
		final JPanel jPanelParametrosReportesResponsable=this.jPanelParametrosReportesResponsable;
		//final JScrollPane jScrollPanelDatosResponsable=this.jScrollPanelDatosResponsable;
		final JTable jTableDatosResponsable=this.jTableDatosResponsable;		
		final JPanel jPanelPaginacionResponsable=this.jPanelPaginacionResponsable;
		//final JScrollPane jScrollPanelDatosEdicionResponsable=this.jScrollPanelDatosEdicionResponsable;
		final JPanel jPanelAccionesResponsable=this.jPanelAccionesResponsable;
		
		JPanel jPanelCamposAuxiliarResponsable=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarResponsable=new JPanel();
		
		if(this.jInternalFrameDetalleFormResponsable!=null) {
			jPanelCamposAuxiliarResponsable=this.jInternalFrameDetalleFormResponsable.jPanelCamposResponsable;
			jPanelAccionesFormularioAuxiliarResponsable=this.jInternalFrameDetalleFormResponsable.jPanelAccionesFormularioResponsable;
		}
		
		final JPanel jPanelCamposResponsable=jPanelCamposAuxiliarResponsable;
		final JPanel jPanelAccionesFormularioResponsable=jPanelAccionesFormularioAuxiliarResponsable;
		
		
		final JMenuBar jmenuBarResponsable=this.jmenuBarResponsable;		
		final JToolBar jTtoolBarResponsable=this.jTtoolBarResponsable;
				
		JMenuBar jmenuBarDetalleAuxiliarResponsable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResponsable=new JToolBar();
		
		if(this.jInternalFrameDetalleFormResponsable!=null) {
			jmenuBarDetalleAuxiliarResponsable=this.jInternalFrameDetalleFormResponsable.jmenuBarDetalleResponsable;
			jTtoolBarDetalleAuxiliarResponsable=this.jInternalFrameDetalleFormResponsable.jTtoolBarDetalleResponsable;		
		}
		
		final JMenuBar jmenuBarDetalleResponsable=jmenuBarDetalleAuxiliarResponsable;
		final JToolBar jTtoolBarDetalleResponsable=jTtoolBarDetalleAuxiliarResponsable;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResponsable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResponsable;
			processRunnable.jTableDatos=jTableDatosResponsable;
			processRunnable.jPanelCampos=jPanelCamposResponsable;
			processRunnable.jPanelPaginacion=jPanelPaginacionResponsable;
			processRunnable.jPanelAcciones=jPanelAccionesResponsable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResponsable;
			
			
			processRunnable.jmenuBar=jmenuBarResponsable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResponsable;
			processRunnable.jTtoolBar=jTtoolBarResponsable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResponsable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasResponsable ,jPanelParametrosReportesResponsable, jTableDatosResponsable,/*jScrollPanelDatosResponsable,*/jPanelCamposResponsable,jPanelPaginacionResponsable, /*jScrollPanelDatosEdicionResponsable,*/ jPanelAccionesResponsable,jPanelAccionesFormularioResponsable,jmenuBarResponsable,jmenuBarDetalleResponsable,jTtoolBarResponsable,jTtoolBarDetalleResponsable));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesResponsable(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarResponsable(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuResponsable(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarResponsable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarResponsable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleResponsable,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuResponsable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarResponsable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleResponsable,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.responsableConstantesFunciones.getsFinalQueryResponsable();
		String  finalQueryPaginacionTodos=this.responsableConstantesFunciones.getsFinalQueryResponsable();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ResponsableConstantesFunciones.getArrayColumnasGlobalesNoResponsable(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ResponsableConstantesFunciones.getArrayColumnasGlobalesResponsable(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ResponsableConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.responsablesEliminados= new ArrayList<Responsable>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessResponsable();
		
				///*ResponsableSessionBean*/this.responsableSessionBean=new ResponsableSessionBean();
			
			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
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
					this.iNumeroPaginacion=ResponsableConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ResponsableConstantesFunciones.getClassesForeignKeysOfResponsable(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/responsable."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			responsablesAux= new ArrayList<Responsable>();
			
				
			responsableLogic.setDatosCliente(this.datosCliente);
			responsableLogic.setDatosDeep(this.datosDeep);
			responsableLogic.setIsConDeep(true);
			
			
			responsableLogic.getResponsableDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					responsableLogic.getTodosResponsables(finalQueryGlobal,pagination);
					
					//responsableLogic.getTodosResponsablesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(responsableLogic.getResponsables()==null|| responsableLogic.getResponsables().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							responsablesAux= new ArrayList<Responsable>();
							responsablesAux.addAll(responsableLogic.getResponsables());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesAux= new ArrayList<Responsable>();
							responsablesAux.addAll(responsables);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							responsableLogic.getTodosResponsables(finalQueryGlobal+"",this.pagination);												
							
							//responsableLogic.getTodosResponsablesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteResponsables("Todos",responsableLogic.getResponsables() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							responsableLogic.setResponsables(new ArrayList<Responsable>());					
							responsableLogic.getResponsables().addAll(responsablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsables=new ArrayList<Responsable>();
							responsables.addAll(responsablesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idResponsable=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idResponsable=this.idActual;
				
				} else if(this.idResponsableActual!=null && this.idResponsableActual!=0L) {
					idResponsable=idResponsableActual;
				}
				
					
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndicePorId(idResponsable);
				
				this.responsables=new ArrayList<Responsable>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					responsableLogic.getEntity(idResponsable);
					
					//responsableLogic.getEntityWithConnection(idResponsable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.setResponsables(new ArrayList<Responsable>());
					responsableLogic.getResponsables().add(responsableLogic.getResponsable());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsables=new ArrayList<Responsable>();
					this.responsables.add(responsable);
				}
				
				if(responsableLogic.getResponsable()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdentificacion")) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableLogic.getResponsablesBusquedaPorIdentificacion(finalQueryGlobal,pagination,identificacionBusquedaPorIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableLogic.getResponsables()==null||responsableLogic.getResponsables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsables==null|| responsables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesAux=new ArrayList<Responsable>();
						responsablesAux.addAll(responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesAux=new ArrayList<Responsable>();
							responsablesAux.addAll(responsables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableLogic.getResponsablesBusquedaPorIdentificacion(finalQueryGlobal,pagination,identificacionBusquedaPorIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsables("BusquedaPorIdentificacion",responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsables("BusquedaPorIdentificacion",responsables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.setResponsables(new ArrayList<Responsable>());
						responsableLogic.getResponsables().addAll(responsablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsables=new ArrayList<Responsable>();
							responsables.addAll(responsablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombreCompleto")) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableLogic.getResponsablesBusquedaPorNombreCompleto(finalQueryGlobal,pagination,nombre_completoBusquedaPorNombreCompleto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableLogic.getResponsables()==null||responsableLogic.getResponsables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsables==null|| responsables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesAux=new ArrayList<Responsable>();
						responsablesAux.addAll(responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesAux=new ArrayList<Responsable>();
							responsablesAux.addAll(responsables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableLogic.getResponsablesBusquedaPorNombreCompleto(finalQueryGlobal,pagination,nombre_completoBusquedaPorNombreCompleto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsables("BusquedaPorNombreCompleto",responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsables("BusquedaPorNombreCompleto",responsables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.setResponsables(new ArrayList<Responsable>());
						responsableLogic.getResponsables().addAll(responsablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsables=new ArrayList<Responsable>();
							responsables.addAll(responsablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorRuc")) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableLogic.getResponsablesBusquedaPorRuc(finalQueryGlobal,pagination,rucBusquedaPorRuc);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableLogic.getResponsables()==null||responsableLogic.getResponsables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsables==null|| responsables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesAux=new ArrayList<Responsable>();
						responsablesAux.addAll(responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesAux=new ArrayList<Responsable>();
							responsablesAux.addAll(responsables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableLogic.getResponsablesBusquedaPorRuc(finalQueryGlobal,pagination,rucBusquedaPorRuc);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsables("BusquedaPorRuc",responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsables("BusquedaPorRuc",responsables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.setResponsables(new ArrayList<Responsable>());
						responsableLogic.getResponsables().addAll(responsablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsables=new ArrayList<Responsable>();
							responsables.addAll(responsablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorTelefono")) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableLogic.getResponsablesBusquedaPorTelefono(finalQueryGlobal,pagination,telefonoBusquedaPorTelefono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableLogic.getResponsables()==null||responsableLogic.getResponsables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsables==null|| responsables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesAux=new ArrayList<Responsable>();
						responsablesAux.addAll(responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesAux=new ArrayList<Responsable>();
							responsablesAux.addAll(responsables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableLogic.getResponsablesBusquedaPorTelefono(finalQueryGlobal,pagination,telefonoBusquedaPorTelefono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsables("BusquedaPorTelefono",responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsables("BusquedaPorTelefono",responsables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.setResponsables(new ArrayList<Responsable>());
						responsableLogic.getResponsables().addAll(responsablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsables=new ArrayList<Responsable>();
							responsables.addAll(responsablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorTelefonoCelular")) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefonoCelular(telefono_celularBusquedaPorTelefonoCelular);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableLogic.getResponsablesBusquedaPorTelefonoCelular(finalQueryGlobal,pagination,telefono_celularBusquedaPorTelefonoCelular);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefonoCelular(telefono_celularBusquedaPorTelefonoCelular);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefonoCelular(telefono_celularBusquedaPorTelefonoCelular);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableLogic.getResponsables()==null||responsableLogic.getResponsables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsables==null|| responsables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesAux=new ArrayList<Responsable>();
						responsablesAux.addAll(responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesAux=new ArrayList<Responsable>();
							responsablesAux.addAll(responsables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableLogic.getResponsablesBusquedaPorTelefonoCelular(finalQueryGlobal,pagination,telefono_celularBusquedaPorTelefonoCelular);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefonoCelular(telefono_celularBusquedaPorTelefonoCelular);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceBusquedaPorTelefonoCelular(telefono_celularBusquedaPorTelefonoCelular);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsables("BusquedaPorTelefonoCelular",responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsables("BusquedaPorTelefonoCelular",responsables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.setResponsables(new ArrayList<Responsable>());
						responsableLogic.getResponsables().addAll(responsablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsables=new ArrayList<Responsable>();
							responsables.addAll(responsablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableLogic.getResponsablesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableLogic.getResponsables()==null||responsableLogic.getResponsables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsables==null|| responsables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesAux=new ArrayList<Responsable>();
						responsablesAux.addAll(responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesAux=new ArrayList<Responsable>();
							responsablesAux.addAll(responsables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableLogic.getResponsablesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsables("FK_IdCliente",responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsables("FK_IdCliente",responsables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.setResponsables(new ArrayList<Responsable>());
						responsableLogic.getResponsables().addAll(responsablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsables=new ArrayList<Responsable>();
							responsables.addAll(responsablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableLogic.getResponsablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableLogic.getResponsables()==null||responsableLogic.getResponsables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsables==null|| responsables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesAux=new ArrayList<Responsable>();
						responsablesAux.addAll(responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesAux=new ArrayList<Responsable>();
							responsablesAux.addAll(responsables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableLogic.getResponsablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsables("FK_IdEmpresa",responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsables("FK_IdEmpresa",responsables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.setResponsables(new ArrayList<Responsable>());
						responsableLogic.getResponsables().addAll(responsablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsables=new ArrayList<Responsable>();
							responsables.addAll(responsablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableLogic.getResponsablesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableLogic.getResponsables()==null||responsableLogic.getResponsables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsables==null|| responsables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesAux=new ArrayList<Responsable>();
						responsablesAux.addAll(responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesAux=new ArrayList<Responsable>();
							responsablesAux.addAll(responsables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableLogic.getResponsablesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsables("FK_IdSucursal",responsableLogic.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsables("FK_IdSucursal",responsables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableLogic.setResponsables(new ArrayList<Responsable>());
						responsableLogic.getResponsables().addAll(responsablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsables=new ArrayList<Responsable>();
							responsables.addAll(responsablesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesResponsable();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessResponsable();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=responsableLogic.getResponsables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsables.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=responsableLogic.getResponsables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsables.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Responsable responsable) {
		Boolean permite=true;
		
		if(this.responsable.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ResponsableConstantesFunciones.getOrderByListaResponsable();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ResponsableConstantesFunciones.getOrderByListaResponsable();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsable responsable:responsableLogic.getResponsables()) {
				if(responsable.getsType().equals(Constantes2.S_TOTALES)) {
					responsableTotales=responsable;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsable responsable:this.responsables) {
				if(responsable.getsType().equals(Constantes2.S_TOTALES)) {
					responsableTotales=responsable;
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
			this.responsableAux=new Responsable();
			this.responsableAux.setsType(Constantes2.S_TOTALES);
			this.responsableAux.setIsNew(false);
			this.responsableAux.setIsChanged(false);
			this.responsableAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ResponsableConstantesFunciones.TotalizarValoresFilaResponsable(this.responsableLogic.getResponsables(),this.responsableAux);
				
				this.responsableLogic.getResponsables().add(this.responsableAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ResponsableConstantesFunciones.TotalizarValoresFilaResponsable(this.responsables,this.responsableAux);
				
				this.responsables.add(this.responsableAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		responsableTotales=new Responsable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.responsableLogic.getResponsables().remove(responsableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.responsables.remove(responsableTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		responsableTotales=new Responsable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsable responsable:responsableLogic.getResponsables()) {
				if(responsable.getsType().equals(Constantes2.S_TOTALES)) {
					responsableTotales=responsable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResponsableConstantesFunciones.TotalizarValoresFilaResponsable(this.responsableLogic.getResponsables(),responsableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsable responsable:this.responsables) {
				if(responsable.getsType().equals(Constantes2.S_TOTALES)) {
					responsableTotales=responsable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResponsableConstantesFunciones.TotalizarValoresFilaResponsable(this.responsables,responsableTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getResponsablesBusquedaPorIdentificacion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdentificacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsablesBusquedaPorNombreCompleto()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombreCompleto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsablesBusquedaPorRuc()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorRuc";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsablesBusquedaPorTelefono()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorTelefono";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsablesBusquedaPorTelefonoCelular()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorTelefonoCelular";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsablesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsablesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsablesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsablesFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getResponsablesBusquedaPorIdentificacion(String sFinalQuery,String identificacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.getResponsablesBusquedaPorIdentificacion(sFinalQuery,this.pagination,identificacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsablesBusquedaPorNombreCompleto(String sFinalQuery,String nombre_completo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.getResponsablesBusquedaPorNombreCompleto(sFinalQuery,this.pagination,nombre_completo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsablesBusquedaPorRuc(String sFinalQuery,String ruc)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.getResponsablesBusquedaPorRuc(sFinalQuery,this.pagination,ruc);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsablesBusquedaPorTelefono(String sFinalQuery,String telefono)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.getResponsablesBusquedaPorTelefono(sFinalQuery,this.pagination,telefono);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsablesBusquedaPorTelefonoCelular(String sFinalQuery,String telefono_celular)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.getResponsablesBusquedaPorTelefonoCelular(sFinalQuery,this.pagination,telefono_celular);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsablesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.getResponsablesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsablesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.getResponsablesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsablesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.getResponsablesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsablesFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLogic.getResponsablesFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosResponsable() {
		this.isPermisoTodoResponsable=false;
		this.isPermisoNuevoResponsable=false;
		this.isPermisoActualizarResponsable=false;
		this.isPermisoActualizarOriginalResponsable=false;
		this.isPermisoEliminarResponsable=false;
		this.isPermisoGuardarCambiosResponsable=false;
		this.isPermisoConsultaResponsable=false;
		this.isPermisoBusquedaResponsable=false;
		this.isPermisoReporteResponsable=false;		
		this.isPermisoOrdenResponsable=false;		
		this.isPermisoPaginacionMedioResponsable=false;		
		this.isPermisoPaginacionAltoResponsable=false;
		this.isPermisoPaginacionTodoResponsable=false;
		this.isPermisoCopiarResponsable=false;		
		this.isPermisoVerFormResponsable=false;		
		this.isPermisoDuplicarResponsable=false;		
		this.isPermisoOrdenResponsable=false;		
	}
	
	public void setPermisosUsuarioResponsable(Boolean isPermiso) {
		this.isPermisoTodoResponsable=isPermiso;
		this.isPermisoNuevoResponsable=isPermiso;
		this.isPermisoActualizarResponsable=isPermiso;
		this.isPermisoActualizarOriginalResponsable=isPermiso;
		this.isPermisoEliminarResponsable=isPermiso;
		this.isPermisoGuardarCambiosResponsable=isPermiso;
		this.isPermisoConsultaResponsable=isPermiso;
		this.isPermisoBusquedaResponsable=isPermiso;
		this.isPermisoReporteResponsable=isPermiso;
		this.isPermisoOrdenResponsable=isPermiso;		
		this.isPermisoPaginacionMedioResponsable=isPermiso;		
		this.isPermisoPaginacionAltoResponsable=isPermiso;		
		this.isPermisoPaginacionTodoResponsable=isPermiso;		
		this.isPermisoCopiarResponsable=isPermiso;		
		this.isPermisoVerFormResponsable=isPermiso;		
		this.isPermisoDuplicarResponsable=isPermiso;
		this.isPermisoOrdenResponsable=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioResponsable(Boolean isPermiso) {
		//this.isPermisoTodoResponsable=isPermiso;
		this.isPermisoNuevoResponsable=isPermiso;
		this.isPermisoActualizarResponsable=isPermiso;
		this.isPermisoActualizarOriginalResponsable=isPermiso;
		this.isPermisoEliminarResponsable=isPermiso;
		this.isPermisoGuardarCambiosResponsable=isPermiso;
		//this.isPermisoConsultaResponsable=isPermiso;
		//this.isPermisoBusquedaResponsable=isPermiso;
		//this.isPermisoReporteResponsable=isPermiso;
		//this.isPermisoOrdenResponsable=isPermiso;		
		//this.isPermisoPaginacionMedioResponsable=isPermiso;		
		//this.isPermisoPaginacionAltoResponsable=isPermiso;		
		//this.isPermisoPaginacionTodoResponsable=isPermiso;		
		//this.isPermisoCopiarResponsable=isPermiso;		
		//this.isPermisoDuplicarResponsable=isPermiso;
		//this.isPermisoOrdenResponsable=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioResponsableClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FacturaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ConsignacionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PedidoExporConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PedidoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(NotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
		if(ResponsableJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFactura=false;
		this.isTienePermisosFactura=this.verificarGetPermisosUsuarioOpcionResponsableClaseRelacionada(this.opcionsRelacionadas,FacturaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosConsignacion=false;
		this.isTienePermisosConsignacion=this.verificarGetPermisosUsuarioOpcionResponsableClaseRelacionada(this.opcionsRelacionadas,ConsignacionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPedidoExpor=false;
		this.isTienePermisosPedidoExpor=this.verificarGetPermisosUsuarioOpcionResponsableClaseRelacionada(this.opcionsRelacionadas,PedidoExporConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPedido=false;
		this.isTienePermisosPedido=this.verificarGetPermisosUsuarioOpcionResponsableClaseRelacionada(this.opcionsRelacionadas,PedidoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosNotaCreditoSoli=false;
		this.isTienePermisosNotaCreditoSoli=this.verificarGetPermisosUsuarioOpcionResponsableClaseRelacionada(this.opcionsRelacionadas,NotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebResponsable(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioResponsableClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFactura=conPermiso;
		this.isTienePermisosConsignacion=conPermiso;
		this.isTienePermisosPedidoExpor=conPermiso;
		this.isTienePermisosPedido=conPermiso;
		this.isTienePermisosNotaCreditoSoli=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioResponsableClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionResponsableClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioResponsableClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFactura && this.jInternalFrameDetalleFormResponsable!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.remove(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosConsignacion && this.jInternalFrameDetalleFormResponsable!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.remove(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPedidoExpor && this.jInternalFrameDetalleFormResponsable!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.remove(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPedido && this.jInternalFrameDetalleFormResponsable!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.remove(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosNotaCreditoSoli && this.jInternalFrameDetalleFormResponsable!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.remove(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioResponsable() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ResponsableJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.responsableSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ResponsableConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoResponsable=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarResponsable=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalResponsable=this.isPermisoActualizarResponsable;
			this.isPermisoEliminarResponsable=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosResponsable=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaResponsable=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaResponsable=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoResponsable=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteResponsable=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResponsable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioResponsable=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoResponsable=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoResponsable=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarResponsable=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormResponsable=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarResponsable=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResponsable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.responsableSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosResponsable.setToolTipText(this.jTableDatosResponsable.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioResponsable(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioResponsable(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ResponsableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ResponsableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioResponsable() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFactura && this.responsableConstantesFunciones.mostrarFacturaResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura");
			reporte.setsDescripcion("Factura");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosConsignacion && this.responsableConstantesFunciones.mostrarConsignacionResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Consignacion");
			reporte.setsDescripcion("Consignacion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPedido && this.responsableConstantesFunciones.mostrarPedidoResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido");
			reporte.setsDescripcion("Pedido");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPedidoExpor && this.responsableConstantesFunciones.mostrarPedidoExporResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Exportacion");
			reporte.setsDescripcion("Pedido Exportacion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosNotaCreditoSoli && this.responsableConstantesFunciones.mostrarNotaCreditoSoliResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {

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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyResponsableListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyResponsableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ResponsableJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyResponsableListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyResponsableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ResponsableParameterReturnGeneral responsableReturnGeneral=new ResponsableParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.responsableConstantesFunciones.cargarid_empresaResponsable)
					 || (this.esRecargarFks && this.responsableConstantesFunciones.cargarid_empresaResponsable)) {

					if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+responsableSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.responsableConstantesFunciones.cargarid_sucursalResponsable)
					 || (this.esRecargarFks && this.responsableConstantesFunciones.cargarid_sucursalResponsable)) {

					if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+responsableSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.responsableConstantesFunciones.cargarid_clienteResponsable)
					 || (this.esRecargarFks && this.responsableConstantesFunciones.cargarid_clienteResponsable)) {

					if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+responsableSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.responsableConstantesFunciones.cargarid_usuarioResponsable)
					 || (this.esRecargarFks && this.responsableConstantesFunciones.cargarid_usuarioResponsable)) {

					if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+responsableSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				responsableReturnGeneral=responsableLogic.cargarCombosLoteForeignKeyResponsable(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente,finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=responsableReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=responsableReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=responsableReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=responsableReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyResponsable()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.responsableSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyResponsable()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyResponsable(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyResponsable()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyResponsable();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyResponsable(Responsable responsable)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(responsable.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyResponsable(Responsable responsable,String sTipoEvento)throws Exception {	
		try {
			
			

				if(responsable.getCliente()!=null && !sTipoEvento.equals("id_clienteResponsable")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(responsable.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyResponsable()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.responsableConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyResponsable()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyResponsable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyResponsable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroResponsable()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyResponsable()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyResponsable(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyResponsable()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable!=null && this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable!=null && this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable!=null && this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable!=null && this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ResponsableBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ResponsableBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ResponsableBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.responsableSessionBean=new ResponsableSessionBean(); 
		this.responsableConstantesFunciones=new ResponsableConstantesFunciones(); 
		this.responsableBean=new Responsable();//(this.responsableConstantesFunciones); 		
		this.responsableReturnGeneral=new ResponsableParameterReturnGeneral(); 
		
		this.responsableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ResponsableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ResponsableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ResponsableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessResponsable(true);
			
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
			
			this.responsableConstantesFunciones=new ResponsableConstantesFunciones(); 
			this.responsableBean=new Responsable();//this.responsableConstantesFunciones); 			
			this.responsableReturnGeneral=new ResponsableParameterReturnGeneral(); 
		
			ResponsableBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Responsable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.responsable=new Responsable();
			this.responsables = new ArrayList<Responsable>();
			this.responsablesAux = new ArrayList<Responsable>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic=new ResponsableLogic();
				this.responsableLogic.getNewConnexionToDeep("");
			}
			
			//this.responsableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.responsableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormResponsable);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoResponsable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResponsable);	
					}
					
					if(this.jInternalFrameImportacionResponsable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResponsable);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByResponsable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByResponsable);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormResponsable!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormResponsable);
				this.jInternalFrameDetalleFormResponsable.setVisible(false);
				this.jInternalFrameDetalleFormResponsable.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoResponsable!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResponsable);
					this.jInternalFrameReporteDinamicoResponsable.setVisible(false);
					this.jInternalFrameReporteDinamicoResponsable.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionResponsable!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionResponsable);
					this.jInternalFrameImportacionResponsable.setVisible(false);
					this.jInternalFrameImportacionResponsable.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByResponsable!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByResponsable);
					this.jInternalFrameOrderByResponsable.setVisible(false);
					this.jInternalFrameOrderByResponsable.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idResponsableActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ResponsableConstantesFunciones.INUMEROPAGINACION;
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
			
			this.responsableReturnGeneral=new ResponsableParameterReturnGeneral();
			
			this.responsableParameterGeneral=new ResponsableParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.responsableLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ResponsableJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.responsableSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FacturaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ConsignacionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PedidoExporConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PedidoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(NotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResponsableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.responsableSessionBean.getEsGuardarRelacionado(),this.responsableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResponsableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.responsableSessionBean.getEsGuardarRelacionado(),this.responsableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoResponsable=false;
			this.isVisibilidadCeldaDuplicarResponsable=true;
			this.isVisibilidadCeldaCopiarResponsable=true;
			this.isVisibilidadCeldaVerFormResponsable=true;
			this.isVisibilidadCeldaOrdenResponsable=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsable=false;
			this.isVisibilidadCeldaModificarResponsable=false;
			this.isVisibilidadCeldaActualizarResponsable=false;
			this.isVisibilidadCeldaEliminarResponsable=false;
			this.isVisibilidadCeldaCancelarResponsable=false;
			this.isVisibilidadCeldaGuardarResponsable=false;
			this.isVisibilidadCeldaGuardarCambiosResponsable=false;
			
			
			this.isVisibilidadBusquedaPorIdentificacion=true;
			this.isVisibilidadBusquedaPorNombreCompleto=true;
			this.isVisibilidadBusquedaPorRuc=true;
			this.isVisibilidadBusquedaPorTelefono=true;
			this.isVisibilidadBusquedaPorTelefonoCelular=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesResponsable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosResponsable();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioResponsable(false);
			
			this.setPermisosUsuarioResponsable();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsableSessionBean.getEsGuardarRelacionado() 
				|| (this.responsableSessionBean.getEsGuardarRelacionado() && this.responsableSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioResponsableClasesRelacionadas();
			}
			
			if(this.responsableSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioResponsableClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ResponsableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosResponsable();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualResponsable();
			}
			
			if(!this.isPermisoBusquedaResponsable) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasResponsable.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsableSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioResponsable,this.isPermisoPaginacionMedioResponsable,this.isPermisoPaginacionTodoResponsable);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ResponsableConstantesFunciones.getTiposSeleccionarResponsable());
				
				this.tiposColumnasSelect=ResponsableConstantesFunciones.getTiposSeleccionarResponsable(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectResponsable();				
				//this.tiposRelacionesSelect=ResponsableConstantesFunciones.getTiposRelacionesResponsable(true);
				
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
			//if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioResponsable();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioResponsable(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioResponsable(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsable() ;
			
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
			
			
			this.facturaLogic=new FacturaLogic();
			this.consignacionLogic=new ConsignacionLogic();
			this.pedidoLogic=new PedidoLogic();
			this.pedidoexporLogic=new PedidoExporLogic();
			this.notacreditosoliLogic=new NotaCreditoSoliLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.clienteLogic=new ClienteLogic();
			this.usuarioLogic=new UsuarioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				responsableImplementable= (ResponsableImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResponsableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				responsableImplementableHome= (ResponsableImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResponsableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.responsables= new ArrayList<Responsable>();
			this.responsablesEliminados= new ArrayList<Responsable>();
						
			this.isEsNuevoResponsable=false;
			this.esParaAccionDesdeFormularioResponsable=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyResponsable(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroResponsable();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ResponsableBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ResponsableConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesResponsable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingResponsable(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormResponsable!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioResponsable();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioResponsable();
			}
			
			ResponsableBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasResponsable.getTabCount(); i++) {
					this.jTabbedPaneBusquedasResponsable.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasResponsable.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessResponsable(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Responsable: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectResponsable() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FacturaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PedidoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

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
			if(sTipo.equals("RelacionesResponsable")) {
				iIndex=this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosResponsable.getSelectedRow();	
				
				

				if(sTitle.equals("Consignacions")) {
					if(!ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessResponsable();

						this.cargarParteTabPanelRelacionadaConsignacion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Facturas")) {
					if(!FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessResponsable();

						this.cargarParteTabPanelRelacionadaFactura(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Solicitud Nota Creditos")) {
					if(!NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessResponsable();

						this.cargarParteTabPanelRelacionadaNotaCreditoSoli(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedidos")) {
					if(!PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessResponsable();

						this.cargarParteTabPanelRelacionadaPedido(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedido Exportacions")) {
					if(!PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessResponsable();

						this.cargarParteTabPanelRelacionadaPedidoExpor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessResponsable();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaConsignacion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormResponsable.cargarSessionConBeanSwingJInternalFrameConsignacion(false,true,iIndex);
		this.jButtonConsignacionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaConsignacion();

		//this.jTabbedPaneRelacionesResponsable.updateUI();
		//this.jTabbedPaneRelacionesResponsable.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesResponsable.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFactura(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormResponsable.cargarSessionConBeanSwingJInternalFrameFactura(false,true,iIndex);
		this.jButtonFacturaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFactura();

		//this.jTabbedPaneRelacionesResponsable.updateUI();
		//this.jTabbedPaneRelacionesResponsable.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesResponsable.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaNotaCreditoSoli(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormResponsable.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(false,true,iIndex);
		this.jButtonNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNotaCreditoSoli();

		//this.jTabbedPaneRelacionesResponsable.updateUI();
		//this.jTabbedPaneRelacionesResponsable.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesResponsable.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedido(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormResponsable.cargarSessionConBeanSwingJInternalFramePedido(false,true,iIndex);
		this.jButtonPedidoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedido();

		//this.jTabbedPaneRelacionesResponsable.updateUI();
		//this.jTabbedPaneRelacionesResponsable.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesResponsable.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedidoExpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormResponsable.cargarSessionConBeanSwingJInternalFramePedidoExpor(false,true,iIndex);
		this.jButtonPedidoExporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoExpor();

		//this.jTabbedPaneRelacionesResponsable.updateUI();
		//this.jTabbedPaneRelacionesResponsable.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesResponsable.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Factura")) {
				int row=this.jTableDatosResponsable.getSelectedRow();
				jButtonFacturaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Consignacion")) {
				int row=this.jTableDatosResponsable.getSelectedRow();
				jButtonConsignacionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Pedido")) {
				int row=this.jTableDatosResponsable.getSelectedRow();
				jButtonPedidoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PedidoExpor")) {
				int row=this.jTableDatosResponsable.getSelectedRow();
				jButtonPedidoExporActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("NotaCreditoSoli")) {
				int row=this.jTableDatosResponsable.getSelectedRow();
				jButtonNotaCreditoSoliActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Factura")) {

					if(this.isTienePermisosFactura && this.responsableConstantesFunciones.mostrarFacturaResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Facturas"+"("+FacturaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Facturas");

						if(responsableConstantesFunciones.resaltarFacturaResponsable!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(responsableConstantesFunciones.resaltarFacturaResponsable);
						}

						jmenuItem.setEnabled(this.responsableConstantesFunciones.activarFacturaResponsable);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Factura"));

						

						this.jInternalFrameDetalleFormResponsable.jmenuDetalleResponsable.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Consignacion")) {

					if(this.isTienePermisosConsignacion && this.responsableConstantesFunciones.mostrarConsignacionResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Consignacions"+"("+ConsignacionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Consignacions");

						if(responsableConstantesFunciones.resaltarConsignacionResponsable!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(responsableConstantesFunciones.resaltarConsignacionResponsable);
						}

						jmenuItem.setEnabled(this.responsableConstantesFunciones.activarConsignacionResponsable);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Consignacion"));

						

						this.jInternalFrameDetalleFormResponsable.jmenuDetalleResponsable.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pedido")) {

					if(this.isTienePermisosPedido && this.responsableConstantesFunciones.mostrarPedidoResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedidos"+"("+PedidoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedidos");

						if(responsableConstantesFunciones.resaltarPedidoResponsable!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(responsableConstantesFunciones.resaltarPedidoResponsable);
						}

						jmenuItem.setEnabled(this.responsableConstantesFunciones.activarPedidoResponsable);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Pedido"));

						

						this.jInternalFrameDetalleFormResponsable.jmenuDetalleResponsable.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pedido Exportacion")) {

					if(this.isTienePermisosPedidoExpor && this.responsableConstantesFunciones.mostrarPedidoExporResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Exportacions"+"("+PedidoExporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Exportacions");

						if(responsableConstantesFunciones.resaltarPedidoExporResponsable!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(responsableConstantesFunciones.resaltarPedidoExporResponsable);
						}

						jmenuItem.setEnabled(this.responsableConstantesFunciones.activarPedidoExporResponsable);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoExpor"));

						

						this.jInternalFrameDetalleFormResponsable.jmenuDetalleResponsable.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Solicitud Nota Credito")) {

					if(this.isTienePermisosNotaCreditoSoli && this.responsableConstantesFunciones.mostrarNotaCreditoSoliResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Solicitud Nota Creditos"+"("+NotaCreditoSoliConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Solicitud Nota Creditos");

						if(responsableConstantesFunciones.resaltarNotaCreditoSoliResponsable!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(responsableConstantesFunciones.resaltarNotaCreditoSoliResponsable);
						}

						jmenuItem.setEnabled(this.responsableConstantesFunciones.activarNotaCreditoSoliResponsable);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NotaCreditoSoli"));

						

						this.jInternalFrameDetalleFormResponsable.jmenuDetalleResponsable.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyResponsable(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyResponsable(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyResponsable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyResponsableListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyResponsable();
		
		this.cargarCombosFrameForeignKeyResponsable();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyResponsable();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyResponsable();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoResponsableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.responsableSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
			
			if(jTableDatosResponsable.getRowCount()>=1) {
				jTableDatosResponsable.removeRowSelectionInterval(0, jTableDatosResponsable.getRowCount()-1);						
			}
			
			this.isEsNuevoResponsable=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoResponsable(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesResponsable(true);			
			//this.responsable=new Responsable();
			//this.responsable.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsable(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsable() ;
			
			if(ResponsableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsable(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.responsable);	
			this.actualizarInformacion("INFO_PADRE",false,this.responsable);				
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
			if(this.responsableSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Responsable: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarResponsableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosResponsable.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosResponsable.getSelectedRows().length;			
			}
			
			responsablesSeleccionados=this.getResponsablesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoResponsable--;			
				//Responsable responsableAux= new Responsable();			
				//responsableAux.setId(this.iIdNuevoResponsable);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Responsable responsableOrigen=new Responsable();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Responsable responsableOrigen : responsablesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							responsableOrigen =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableOrigen =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaResponsable();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.responsable.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosResponsable(responsableOrigen,this.responsable,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.responsableLogic.getResponsables().add(this.responsableAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.responsables.add(this.responsableAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaResponsable(false);
				
				this.jTableDatosResponsable.setRowSelectionInterval(this.getIndiceNuevoResponsable(), this.getIndiceNuevoResponsable());
				
				int iLastRow =  this.jTableDatosResponsable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResponsable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResponsable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsable(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();									
		
			Responsable responsableOrigen=new Responsable();
			Responsable responsableDestino=new Responsable();
				
			responsablesSeleccionados=this.getResponsablesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosResponsable.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || responsablesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosResponsable.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableOrigen =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						responsableOrigen =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableDestino =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						responsableDestino =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				responsableOrigen =responsablesSeleccionados.get(0);
				responsableDestino =responsablesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosResponsable(responsableOrigen,responsableDestino,true,false);
				
				responsableDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(responsableDestino,responsableLogic.getResponsables());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsableDestino,responsables);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaResponsable(false);
				
				//this.jTableDatosResponsable.setRowSelectionInterval(this.getIndiceNuevoResponsable(), this.getIndiceNuevoResponsable());
				
				int iLastRow =  this.jTableDatosResponsable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResponsable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResponsable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsable(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormResponsable.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesResponsable.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasResponsable.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesResponsable.setVisible(!isVisible);
			this.jPanelPaginacionResponsable.setVisible(!isVisible);
			this.jPanelAccionesResponsable.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameResponsable();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoResponsable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionResponsable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByResponsable();
			
			this.abrirFrameOrderByResponsable();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByResponsable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleResponsable(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormResponsable);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormResponsable.isMaximum()) {
					this.jInternalFrameDetalleFormResponsable.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormResponsable.setSize(this.jInternalFrameDetalleFormResponsable.iWidthFormulario,this.jInternalFrameDetalleFormResponsable.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormResponsable.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormResponsable.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormResponsable.isMaximum()) {
						this.jInternalFrameDetalleFormResponsable.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormResponsable.jContentPaneDetalleResponsable.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormResponsable.jContentPaneDetalleResponsable.getWidth(),ResponsableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormResponsable.jContentPaneDetalleResponsable.getWidth(),ResponsableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormResponsable.jContentPaneDetalleResponsable.getWidth(),ResponsableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaConsignacion();
					}

					if(FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFactura();
					}

					if(NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNotaCreditoSoli();
					}

					if(PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedido();
					}

					if(PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoExpor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormResponsable.setVisible(true);
	        this.jInternalFrameDetalleFormResponsable.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByResponsable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByResponsable==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByResponsable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsable,false,this);
				} else {
					this.jInternalFrameOrderByResponsable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsable,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByResponsable);
				this.jInternalFrameOrderByResponsable.setVisible(false);
				this.jInternalFrameOrderByResponsable.setSelected(false);
				
				this.jInternalFrameOrderByResponsable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResponsable"));
				
				this.inicializarActualizarBindingTablaOrderByResponsable();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionResponsable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionResponsable==null) {
				
				this.jInternalFrameImportacionResponsable=new ImportacionJInternalFrame(ResponsableConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResponsable);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionResponsable);
				this.jInternalFrameImportacionResponsable.setVisible(false);
				this.jInternalFrameImportacionResponsable.setSelected(false);


				this.jInternalFrameImportacionResponsable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResponsable"));
				this.jInternalFrameImportacionResponsable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResponsable"));
				this.jInternalFrameImportacionResponsable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResponsable"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoResponsable() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoResponsable==null) {
				this.jInternalFrameReporteDinamicoResponsable=new ReporteDinamicoJInternalFrame(ResponsableConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResponsable);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResponsable);
				this.jInternalFrameReporteDinamicoResponsable.setVisible(false);
				this.jInternalFrameReporteDinamicoResponsable.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoResponsable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsable"));
				this.jInternalFrameReporteDinamicoResponsable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsable"));
				this.jInternalFrameReporteDinamicoResponsable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsable"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsable();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaConsignacion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormResponsable.jContentPaneDetalleResponsable.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFactura() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormResponsable.jContentPaneDetalleResponsable.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaNotaCreditoSoli() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormResponsable.jContentPaneDetalleResponsable.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedido() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormResponsable.jContentPaneDetalleResponsable.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedidoExpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormResponsable.jContentPaneDetalleResponsable.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleResponsable() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormResponsable);
			
	       	this.jInternalFrameDetalleFormResponsable.setVisible(false);
	        this.jInternalFrameDetalleFormResponsable.setSelected(false);
			
			//this.jInternalFrameDetalleFormResponsable.dispose();
			//this.jInternalFrameDetalleFormResponsable=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoResponsable() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoResponsable.setVisible(true);
	        this.jInternalFrameReporteDinamicoResponsable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionResponsable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionResponsable.setVisible(true);
	        this.jInternalFrameImportacionResponsable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByResponsable() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByResponsable.setVisible(true);
	        this.jInternalFrameOrderByResponsable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByResponsable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByResponsable.setVisible(false);
	        this.jInternalFrameOrderByResponsable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoResponsable() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoResponsable.setVisible(false);
	        this.jInternalFrameReporteDinamicoResponsable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionResponsable() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionResponsable.setVisible(false);
	        this.jInternalFrameImportacionResponsable.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarResponsable(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarResponsable(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesResponsable(true);
			//this.isEsNuevoResponsable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesResponsable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsable(false) ;
			
			if(responsableSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaSessionBean.getEsGuardarRelacionado() && FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionSessionBean.getEsGuardarRelacionado() && ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConsignacionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado() && PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoExporActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoSessionBean.getEsGuardarRelacionado() && PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getEsGuardarRelacionado() && NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ResponsableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsable(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaResponsableActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarResponsable(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesResponsable(true);
			//this.isEsNuevoResponsable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.responsable.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesResponsable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesResponsable(false) ;
			
			if(ResponsableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsable(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.responsableConstantesFunciones.cargarid_clienteResponsable) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingResponsable(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosResponsable.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesResponsable(false);
			
			//if(!this.isEsNuevoResponsable) {								
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				
			}
			
			if(this.permiteMantenimiento(this.responsable)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.responsableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoResponsable=true;
					this.inicializarActualizarBindingTablaResponsable(false);
					this.isEsNuevoResponsable=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoResponsable=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoResponsable=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResponsable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsable(false);
				
				this.habilitarDeshabilitarControlesResponsable(false);
			
												
				
				if(ResponsableJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleResponsable();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoResponsableActionPerformed(evt,responsableSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualResponsable(this.responsable,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosResponsable.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,responsableSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.responsable.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarResponsableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				this.responsable.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				this.responsable.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.responsable)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.responsableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ResponsableModel) this.jTableDatosResponsable.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoResponsable=true;
				this.inicializarActualizarBindingTablaResponsable(false);
				this.isEsNuevoResponsable=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResponsable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsable(false);
				
				this.habilitarDeshabilitarControlesResponsable(false);
				
				
				
				if(ResponsableJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleResponsable();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarResponsableActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosResponsable.getRowCount()>=1) {
				jTableDatosResponsable.removeRowSelectionInterval(0, jTableDatosResponsable.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesResponsable(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaResponsable(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsable(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsable(false) ;
			
			this.isEsNuevoResponsable=false;
			
			if(ResponsableJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleResponsable();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosResponsableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingResponsable(false);
				
				//SI ES MANUAL
				if(ResponsableJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualResponsable();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosResponsableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoResponsable--;			
			//Responsable responsableAux= new Responsable();			
			//responsableAux.setId(this.iIdNuevoResponsable);
			
			if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaResponsable();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
			
			this.responsable.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.responsableLogic.getResponsables().add(this.responsableAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.responsables.add(this.responsableAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaResponsable(false);
			
			this.jTableDatosResponsable.setRowSelectionInterval(this.getIndiceNuevoResponsable(), this.getIndiceNuevoResponsable());
			
			int iLastRow =  this.jTableDatosResponsable.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosResponsable.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosResponsable.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaResponsable(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionResponsableActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingResponsable(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsable(false);
			
			//SI ES MANUAL
			if(ResponsableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsable();
			}
			
			//this.abrirFrameTreeResponsable();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionResponsableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ResponsableS ?", "MANTENIMIENTO DE Responsable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionResponsable.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralResponsable();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.responsableReturnGeneral=responsableLogic.procesarImportacionResponsablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.responsableParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarResponsableReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionResponsableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionResponsable.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionResponsable.setFileImportacion(this.jInternalFrameImportacionResponsable.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionResponsable.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionResponsable.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionResponsable.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionResponsable.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoResponsableActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();		

		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ResponsableBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ResponsableBaseDesign.jrxml";
			
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
			
			this.generarReporteResponsables("Todos",responsablesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoResponsable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResponsableConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_IDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_entificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_entificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_entificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_entificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoCelular_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoCelular_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoCelular_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoCelular_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_FAX:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_x_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_x_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_x_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_x_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoResponsable.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoResponsable.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoResponsable.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ResponsableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ResponsableConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ResponsableConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ResponsableConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case ResponsableConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoria="identificacion";
					break;

				case ResponsableConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ResponsableConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case ResponsableConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="email";
					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR:
					sNombreCampoCategoria="telefono_celular";
					break;

				case ResponsableConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case ResponsableConstantesFunciones.LABEL_FAX:
					sNombreCampoCategoria="fax";
					break;

				case ResponsableConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoResponsable.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ResponsableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ResponsableConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ResponsableConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ResponsableConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case ResponsableConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoriaValor="identificacion";
					break;

				case ResponsableConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ResponsableConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case ResponsableConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="email";
					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR:
					sNombreCampoCategoriaValor="telefono_celular";
					break;

				case ResponsableConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case ResponsableConstantesFunciones.LABEL_FAX:
					sNombreCampoCategoriaValor="fax";
					break;

				case ResponsableConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoResponsable.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsable.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResponsableConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ResponsableConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ResponsableConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ResponsableConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case ResponsableConstantesFunciones.LABEL_IDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"identificacion");
					break;

				case ResponsableConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ResponsableConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case ResponsableConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Email",sNombreCampoCategoria,sNombreCampoCategoriaValor,"email");
					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Celular",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_celular");
					break;

				case ResponsableConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case ResponsableConstantesFunciones.LABEL_FAX:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fax",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fax");
					break;

				case ResponsableConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoResponsableActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();		
		
		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsable";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Responsables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoResponsable.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsable.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ResponsableConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_IDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDENTIFICACION);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getidentificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_RUC);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getemail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.gettelefono_celular());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_FAX:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_FAX);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getfax());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(Responsable responsable:responsablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsable.getobservacion());
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
			//	this.getFilaCabeceraExportarExcelResponsable(row);				
			//	iRow++;
			//}				
			
			//for(Responsable responsableAux:responsablesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelResponsable(responsableAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
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
				this.responsableLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsable(false);
			
			//SI ES MANUAL
			if(ResponsableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsable();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresResponsableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsable(false);
			
			//SI ES MANUAL
			if(ResponsableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResponsable();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesResponsableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsable(false);
			
			//SI ES MANUAL
			if(ResponsableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResponsable();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaResponsable() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosResponsable.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosResponsable.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosResponsable.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosResponsable.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosResponsable.setMinimumSize(dimensionMinimum);
		this.jTableDatosResponsable.setMaximumSize(dimensionMaximum);
		this.jTableDatosResponsable.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingResponsable(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingResponsable(esInicializar,true);
	}
	
	public void inicializarActualizarBindingResponsable(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaResponsable(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesResponsable(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasResponsable(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsable(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesResponsable(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ResponsableJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualResponsable() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaResponsable();
		
		this.inicializarActualizarBindingBotonesManualResponsable(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualResponsable();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsable() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualResponsable(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualResponsable(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosResponsable.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosResponsable.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteResponsable.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormResponsable!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormResponsable.jCheckBoxPostAccionNuevoResponsable.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormResponsable.jCheckBoxPostAccionSinCerrarResponsable.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormResponsable.jCheckBoxPostAccionSinMensajeResponsable.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosResponsable.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosResponsable.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteResponsable.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormResponsable!=null) {
				this.jInternalFrameDetalleFormResponsable.jCheckBoxPostAccionNuevoResponsable.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormResponsable.jCheckBoxPostAccionSinCerrarResponsable.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormResponsable.jCheckBoxPostAccionSinMensajeResponsable.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionResponsable.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionResponsable.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormResponsable!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesResponsable.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoResponsable!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesResponsable.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesResponsable.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarResponsable.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesResponsable.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoResponsable!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesResponsable.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralResponsable.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesResponsable(Boolean esInicializar) throws Exception {
		try	{	
			if(ResponsableJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualResponsable(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesResponsable() throws Exception {
		try	{
			if(ResponsableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualResponsable();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResponsable() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualResponsable() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesResponsable.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesResponsable.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesResponsable.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesResponsable.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesResponsable.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesResponsable.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionResponsable.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionResponsable.addItem(reporte);
			}
			
			
			if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionResponsable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionResponsable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesResponsable.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesResponsable.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesResponsable.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesResponsable.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarResponsable.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarResponsable.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarResponsable.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsable();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsable() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResponsable!=null) {
				this.jInternalFrameReporteDinamicoResponsable.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoResponsable.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResponsable!=null) {
				this.jInternalFrameReporteDinamicoResponsable.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoResponsable.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoResponsable!=null) {
				
				if(this.jInternalFrameReporteDinamicoResponsable.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResponsable.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResponsable.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoResponsable.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResponsable.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResponsable.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualResponsable()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.identificacionBusquedaPorIdentificacion=this.jTextFieldidentificacionBusquedaPorIdentificacionResponsable.getText();
		this.nombre_completoBusquedaPorNombreCompleto=this.jTextAreanombre_completoBusquedaPorNombreCompletoResponsable.getText();
		this.rucBusquedaPorRuc=this.jTextFieldrucBusquedaPorRucResponsable.getText();
		this.telefonoBusquedaPorTelefono=this.jTextFieldtelefonoBusquedaPorTelefonoResponsable.getText();
		this.telefono_celularBusquedaPorTelefonoCelular=this.jTextFieldtelefono_celularBusquedaPorTelefonoCelularResponsable.getText();
		if(this.jComboBoxid_clienteFK_IdClienteResponsable.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteResponsable.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasResponsable(Boolean esInicializar) throws Exception {				
		if(ResponsableJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualResponsable();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaResponsable() throws Exception {
		this.inicializarActualizarBindingTablaResponsable(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByResponsable() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosResponsableOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaResponsable(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=responsableLogic.getResponsables().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=responsables.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosResponsable.setModel(new ResponsableModel(this.responsableLogic.getResponsables(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosResponsable.setModel(new ResponsableModel(this.responsables,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByResponsable!=null && this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByResponsable();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ResponsableConstantesFunciones.SCLASSWEBTITULO,responsableConstantesFunciones.resaltarSeleccionarResponsable,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ResponsableConstantesFunciones.SCLASSWEBTITULO,responsableConstantesFunciones.resaltarSeleccionarResponsable,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_ID));

		if(this.responsableConstantesFunciones.mostraridResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.responsableConstantesFunciones.resaltaridResponsable,this.responsableConstantesFunciones.activaridResponsable,this,true,"idResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltaridResponsable,this.responsableConstantesFunciones.activaridResponsable,this,true,"idResponsable","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_IDEMPRESA));

		if(this.responsableConstantesFunciones.mostrarid_empresaResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.responsableConstantesFunciones.resaltarid_empresaResponsable,this,this.responsableConstantesFunciones.activarid_empresaResponsable));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.responsableConstantesFunciones.resaltarid_empresaResponsable,this,this.responsableConstantesFunciones.activarid_empresaResponsable,false,"id_empresaResponsable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.responsableConstantesFunciones.mostrarid_sucursalResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.responsableConstantesFunciones.resaltarid_sucursalResponsable,this,this.responsableConstantesFunciones.activarid_sucursalResponsable));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.responsableConstantesFunciones.resaltarid_sucursalResponsable,this,this.responsableConstantesFunciones.activarid_sucursalResponsable,false,"id_sucursalResponsable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_IDCLIENTE));

		if(this.responsableConstantesFunciones.mostrarid_clienteResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.responsableConstantesFunciones.resaltarid_clienteResponsable,this,this.responsableConstantesFunciones.activarid_clienteResponsable));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.responsableConstantesFunciones.resaltarid_clienteResponsable,this,this.responsableConstantesFunciones.activarid_clienteResponsable,true,"id_clienteResponsable","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_IDUSUARIO));

		if(this.responsableConstantesFunciones.mostrarid_usuarioResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.responsableConstantesFunciones.resaltarid_usuarioResponsable,this,this.responsableConstantesFunciones.activarid_usuarioResponsable));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.responsableConstantesFunciones.resaltarid_usuarioResponsable,this,this.responsableConstantesFunciones.activarid_usuarioResponsable,false,"id_usuarioResponsable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_IDENTIFICACION));

		if(this.responsableConstantesFunciones.mostraridentificacionResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_IDENTIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltaridentificacionResponsable,this.responsableConstantesFunciones.activaridentificacionResponsable,this,true,"identificacionResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltaridentificacionResponsable,this.responsableConstantesFunciones.activaridentificacionResponsable,this,true,"identificacionResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_RUC));

		if(this.responsableConstantesFunciones.mostrarrucResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltarrucResponsable,this.responsableConstantesFunciones.activarrucResponsable,this,true,"rucResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltarrucResponsable,this.responsableConstantesFunciones.activarrucResponsable,this,true,"rucResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_NOMBRE));

		if(this.responsableConstantesFunciones.mostrarnombreResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltarnombreResponsable,this.responsableConstantesFunciones.activarnombreResponsable,this,true,"nombreResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltarnombreResponsable,this.responsableConstantesFunciones.activarnombreResponsable,this,true,"nombreResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_APELLIDO));

		if(this.responsableConstantesFunciones.mostrarapellidoResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltarapellidoResponsable,this.responsableConstantesFunciones.activarapellidoResponsable,this,true,"apellidoResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltarapellidoResponsable,this.responsableConstantesFunciones.activarapellidoResponsable,this,true,"apellidoResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.responsableConstantesFunciones.mostrarnombre_completoResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltarnombre_completoResponsable,this.responsableConstantesFunciones.activarnombre_completoResponsable,this,true,"nombre_completoResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltarnombre_completoResponsable,this.responsableConstantesFunciones.activarnombre_completoResponsable,this,true,"nombre_completoResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_EMAIL));

		if(this.responsableConstantesFunciones.mostraremailResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltaremailResponsable,this.responsableConstantesFunciones.activaremailResponsable,this,true,"emailResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltaremailResponsable,this.responsableConstantesFunciones.activaremailResponsable,this,true,"emailResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_TELEFONO));

		if(this.responsableConstantesFunciones.mostrartelefonoResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltartelefonoResponsable,this.responsableConstantesFunciones.activartelefonoResponsable,this,true,"telefonoResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltartelefonoResponsable,this.responsableConstantesFunciones.activartelefonoResponsable,this,true,"telefonoResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR));

		if(this.responsableConstantesFunciones.mostrartelefono_celularResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltartelefono_celularResponsable,this.responsableConstantesFunciones.activartelefono_celularResponsable,this,true,"telefono_celularResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltartelefono_celularResponsable,this.responsableConstantesFunciones.activartelefono_celularResponsable,this,true,"telefono_celularResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_DIRECCION));

		if(this.responsableConstantesFunciones.mostrardireccionResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltardireccionResponsable,this.responsableConstantesFunciones.activardireccionResponsable,this,true,"direccionResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltardireccionResponsable,this.responsableConstantesFunciones.activardireccionResponsable,this,true,"direccionResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_FAX));

		if(this.responsableConstantesFunciones.mostrarfaxResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_FAX,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltarfaxResponsable,this.responsableConstantesFunciones.activarfaxResponsable,this,true,"faxResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltarfaxResponsable,this.responsableConstantesFunciones.activarfaxResponsable,this,true,"faxResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsable,ResponsableConstantesFunciones.LABEL_OBSERVACION));

		if(this.responsableConstantesFunciones.mostrarobservacionResponsable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableConstantesFunciones.resaltarobservacionResponsable,this.responsableConstantesFunciones.activarobservacionResponsable,this,true,"observacionResponsable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableConstantesFunciones.resaltarobservacionResponsable,this.responsableConstantesFunciones.activarobservacionResponsable,this,true,"observacionResponsable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.responsableSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFactura && this.responsableConstantesFunciones.mostrarFacturaResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Facturas");
				tableColumn.setHeaderValue("Facturas");
				tableColumn.setCellRenderer(new FacturaTableCell(responsableConstantesFunciones.resaltarFacturaResponsable,this,this.responsableConstantesFunciones.activarFacturaResponsable));
				tableColumn.setCellEditor(new FacturaTableCell(responsableConstantesFunciones.resaltarFacturaResponsable,this,this.responsableConstantesFunciones.activarFacturaResponsable));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosResponsable.addColumn(tableColumn);
			}

			if(this.isTienePermisosConsignacion && this.responsableConstantesFunciones.mostrarConsignacionResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Consignacions");
				tableColumn.setHeaderValue("Consignacions");
				tableColumn.setCellRenderer(new ConsignacionTableCell(responsableConstantesFunciones.resaltarConsignacionResponsable,this,this.responsableConstantesFunciones.activarConsignacionResponsable));
				tableColumn.setCellEditor(new ConsignacionTableCell(responsableConstantesFunciones.resaltarConsignacionResponsable,this,this.responsableConstantesFunciones.activarConsignacionResponsable));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosResponsable.addColumn(tableColumn);
			}

			if(this.isTienePermisosPedido && this.responsableConstantesFunciones.mostrarPedidoResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedidos");
				tableColumn.setHeaderValue("Pedidos");
				tableColumn.setCellRenderer(new PedidoTableCell(responsableConstantesFunciones.resaltarPedidoResponsable,this,this.responsableConstantesFunciones.activarPedidoResponsable));
				tableColumn.setCellEditor(new PedidoTableCell(responsableConstantesFunciones.resaltarPedidoResponsable,this,this.responsableConstantesFunciones.activarPedidoResponsable));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosResponsable.addColumn(tableColumn);
			}

			if(this.isTienePermisosPedidoExpor && this.responsableConstantesFunciones.mostrarPedidoExporResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Exportacions");
				tableColumn.setHeaderValue("Pedido Exportacions");
				tableColumn.setCellRenderer(new PedidoExporTableCell(responsableConstantesFunciones.resaltarPedidoExporResponsable,this,this.responsableConstantesFunciones.activarPedidoExporResponsable));
				tableColumn.setCellEditor(new PedidoExporTableCell(responsableConstantesFunciones.resaltarPedidoExporResponsable,this,this.responsableConstantesFunciones.activarPedidoExporResponsable));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosResponsable.addColumn(tableColumn);
			}

			if(this.isTienePermisosNotaCreditoSoli && this.responsableConstantesFunciones.mostrarNotaCreditoSoliResponsable && !ResponsableConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Solicitud Nota Creditos");
				tableColumn.setHeaderValue("Solicitud Nota Creditos");
				tableColumn.setCellRenderer(new NotaCreditoSoliTableCell(responsableConstantesFunciones.resaltarNotaCreditoSoliResponsable,this,this.responsableConstantesFunciones.activarNotaCreditoSoliResponsable));
				tableColumn.setCellEditor(new NotaCreditoSoliTableCell(responsableConstantesFunciones.resaltarNotaCreditoSoliResponsable,this,this.responsableConstantesFunciones.activarNotaCreditoSoliResponsable));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosResponsable.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.responsableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.responsableSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResponsable.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.responsableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.responsableSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResponsable.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarResponsable && this.isPermisoGuardarCambiosResponsable) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.responsableSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.responsableSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosResponsable.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.responsableSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosResponsable.addColumn(tableColumn);
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
			
			this.jTableDatosResponsable.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResponsable && this.isPermisoGuardarCambiosResponsable) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.responsableSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResponsable && this.isPermisoGuardarCambiosResponsable) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosResponsable.moveColumn(this.jTableDatosResponsable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosResponsable.moveColumn(this.jTableDatosResponsable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.responsableSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosResponsable.moveColumn(this.jTableDatosResponsable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosResponsable.moveColumn(this.jTableDatosResponsable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosResponsable.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosResponsable.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosResponsable,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosResponsable.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosResponsable.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosResponsable.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosResponsable.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosResponsable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=responsableLogic.getResponsables().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=responsables.size()-1;
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
		//this.jTableDatosResponsable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosResponsable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosResponsable();
			
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
				
				//this.isEsNuevoResponsable=false;
					
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
				if(this.responsableSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormResponsable==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResponsable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResponsable.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.responsable.getsType().equals("DUPLICADO")
				   || this.responsable.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoResponsable=true;
				
				} else {
					this.isEsNuevoResponsable=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
					if(this.responsable.getId()>=0 && !this.responsable.getIsNew()) {						
						this.isEsNuevoResponsable=false;
						
					} else {
						this.isEsNuevoResponsable=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoResponsable(esRelaciones);						
				
				this.seleccionarResponsable(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.responsable.getId()<0) {
					this.isEsNuevoResponsable=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarResponsable(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarResponsable(evt,rowIndex);
				}	
				
				if(this.responsableSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Responsable: " + this.dDif); 
					}
				}								
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarResponsable(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.responsable)) {
					if(this.responsable.getId()>0) {
						this.responsable.setIsDeleted(true);
						
						this.responsablesEliminados.add(this.responsable);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.responsableLogic.getResponsables().remove(this.responsable);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.responsables.remove(this.responsable);				
					}
					
					
					((ResponsableModel) this.jTableDatosResponsable.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsable(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarResponsable(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoResponsable) {
			
			if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResponsable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResponsable.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioResponsable(this.responsable);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.responsableConstantesFunciones.cargarid_empresaResponsable || this.responsableConstantesFunciones.event_dependid_empresaResponsable) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.responsable.getid_empresa());
									//this.inicializarActualizarBindingResponsable(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(responsable.getEmpresa()!=null) {
							this.empresasForeignKey.add(responsable.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.responsable.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.responsableConstantesFunciones.cargarid_sucursalResponsable || this.responsableConstantesFunciones.event_dependid_sucursalResponsable) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.responsable.getid_sucursal());
									//this.inicializarActualizarBindingResponsable(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(responsable.getSucursal()!=null) {
							this.sucursalsForeignKey.add(responsable.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.responsable.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.responsableConstantesFunciones.cargarid_clienteResponsable || this.responsableConstantesFunciones.event_dependid_clienteResponsable) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.responsable.getid_cliente());
									//this.inicializarActualizarBindingResponsable(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(responsable.getCliente()!=null) {
							this.clientesForeignKey.add(responsable.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.responsable.getid_cliente(),false,"Formulario");

					//Usuario
					if(!this.responsableConstantesFunciones.cargarid_usuarioResponsable || this.responsableConstantesFunciones.event_dependid_usuarioResponsable) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.responsable.getid_usuario());
									//this.inicializarActualizarBindingResponsable(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(responsable.getUsuario()!=null) {
							this.usuariosForeignKey.add(responsable.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.responsable.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesResponsable("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesResponsable(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsable() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoResponsable(Responsable responsable) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoResponsable(responsable,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoResponsable(Responsable responsable,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioResponsable(responsable);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyResponsable(responsable,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyResponsable(responsable);
	}
	
	public void setVariablesObjetoActualToFormularioResponsable(Responsable responsable) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.setText(responsable.getId().toString());
			this.jInternalFrameDetalleFormResponsable.jTextFieldidentificacionResponsable.setText(responsable.getidentificacion());
			this.jInternalFrameDetalleFormResponsable.jTextFieldrucResponsable.setText(responsable.getruc());
			this.jInternalFrameDetalleFormResponsable.jTextAreanombreResponsable.setText(responsable.getnombre());
			this.jInternalFrameDetalleFormResponsable.jTextAreaapellidoResponsable.setText(responsable.getapellido());
			this.jInternalFrameDetalleFormResponsable.jTextAreanombre_completoResponsable.setText(responsable.getnombre_completo());
			this.jInternalFrameDetalleFormResponsable.jTextAreaemailResponsable.setText(responsable.getemail());
			this.jInternalFrameDetalleFormResponsable.jTextFieldtelefonoResponsable.setText(responsable.gettelefono());
			this.jInternalFrameDetalleFormResponsable.jTextFieldtelefono_celularResponsable.setText(responsable.gettelefono_celular());
			this.jInternalFrameDetalleFormResponsable.jTextAreadireccionResponsable.setText(responsable.getdireccion());
			this.jInternalFrameDetalleFormResponsable.jTextFieldfaxResponsable.setText(responsable.getfax());
			this.jInternalFrameDetalleFormResponsable.jTextAreaobservacionResponsable.setText(responsable.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Responsable responsableLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,responsableLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Responsable responsableLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				responsableLocal=this.responsable;
			} else {
				responsableLocal=this.responsableAnterior;
			}
		}
		
		if(this.permiteMantenimiento(responsableLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoResponsable(responsableLocal,true);
					
					if(responsableSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(responsableLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.responsableSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(responsableLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoResponsable(Responsable responsable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResponsable(responsable,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysResponsable(responsable);
	}
	
	public void setVariablesFormularioToObjetoActualResponsable(Responsable responsable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResponsable(responsable,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualResponsable(Responsable responsable,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.getText()==null || this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.getText()=="" || this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.getText()=="Id") {
				this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.setText("0");
			}

			if(conColumnasBase) {responsable.setId(Long.parseLong(this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelIdResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.setidentificacion(this.jInternalFrameDetalleFormResponsable.jTextFieldidentificacionResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_IDENTIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelidentificacionResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.setruc(this.jInternalFrameDetalleFormResponsable.jTextFieldrucResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelrucResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.setnombre(this.jInternalFrameDetalleFormResponsable.jTextAreanombreResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelnombreResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.setapellido(this.jInternalFrameDetalleFormResponsable.jTextAreaapellidoResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelapellidoResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.setnombre_completo(this.jInternalFrameDetalleFormResponsable.jTextAreanombre_completoResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelnombre_completoResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.setemail(this.jInternalFrameDetalleFormResponsable.jTextAreaemailResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelemailResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.settelefono(this.jInternalFrameDetalleFormResponsable.jTextFieldtelefonoResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabeltelefonoResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.settelefono_celular(this.jInternalFrameDetalleFormResponsable.jTextFieldtelefono_celularResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabeltelefono_celularResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.setdireccion(this.jInternalFrameDetalleFormResponsable.jTextAreadireccionResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabeldireccionResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.setfax(this.jInternalFrameDetalleFormResponsable.jTextFieldfaxResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_FAX+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelfaxResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsable.setobservacion(this.jInternalFrameDetalleFormResponsable.jTextAreaobservacionResponsable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsable.jLabelobservacionResponsable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResponsable(Responsable responsableBean,Responsable responsable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && responsableBean.getid_cliente()!=null && !responsableBean.getid_cliente().equals(-1L))) {responsable.setid_cliente(responsableBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosResponsable(Responsable responsableOrigen,Responsable responsable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && responsableOrigen.getId()!=null && !responsableOrigen.getId().equals(0L))) {responsable.setId(responsableOrigen.getId());}}
			if(conDefault || (!conDefault && responsableOrigen.getid_cliente()!=null && !responsableOrigen.getid_cliente().equals(-1L))) {responsable.setid_cliente(responsableOrigen.getid_cliente());}
			if(conDefault || (!conDefault && responsableOrigen.getidentificacion()!=null && !responsableOrigen.getidentificacion().equals(""))) {responsable.setidentificacion(responsableOrigen.getidentificacion());}
			if(conDefault || (!conDefault && responsableOrigen.getruc()!=null && !responsableOrigen.getruc().equals(""))) {responsable.setruc(responsableOrigen.getruc());}
			if(conDefault || (!conDefault && responsableOrigen.getnombre()!=null && !responsableOrigen.getnombre().equals(""))) {responsable.setnombre(responsableOrigen.getnombre());}
			if(conDefault || (!conDefault && responsableOrigen.getapellido()!=null && !responsableOrigen.getapellido().equals(""))) {responsable.setapellido(responsableOrigen.getapellido());}
			if(conDefault || (!conDefault && responsableOrigen.getnombre_completo()!=null && !responsableOrigen.getnombre_completo().equals(""))) {responsable.setnombre_completo(responsableOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && responsableOrigen.getemail()!=null && !responsableOrigen.getemail().equals(""))) {responsable.setemail(responsableOrigen.getemail());}
			if(conDefault || (!conDefault && responsableOrigen.gettelefono()!=null && !responsableOrigen.gettelefono().equals(""))) {responsable.settelefono(responsableOrigen.gettelefono());}
			if(conDefault || (!conDefault && responsableOrigen.gettelefono_celular()!=null && !responsableOrigen.gettelefono_celular().equals(""))) {responsable.settelefono_celular(responsableOrigen.gettelefono_celular());}
			if(conDefault || (!conDefault && responsableOrigen.getdireccion()!=null && !responsableOrigen.getdireccion().equals(""))) {responsable.setdireccion(responsableOrigen.getdireccion());}
			if(conDefault || (!conDefault && responsableOrigen.getfax()!=null && !responsableOrigen.getfax().equals(""))) {responsable.setfax(responsableOrigen.getfax());}
			if(conDefault || (!conDefault && responsableOrigen.getobservacion()!=null && !responsableOrigen.getobservacion().equals(""))) {responsable.setobservacion(responsableOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResponsable(Responsable responsable) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.setText(responsable.getId().toString());
			this.jInternalFrameDetalleFormResponsable.jTextFieldidentificacionResponsable.setText(responsable.getidentificacion());
			this.jInternalFrameDetalleFormResponsable.jTextFieldrucResponsable.setText(responsable.getruc());
			this.jInternalFrameDetalleFormResponsable.jTextAreanombreResponsable.setText(responsable.getnombre());
			this.jInternalFrameDetalleFormResponsable.jTextAreaapellidoResponsable.setText(responsable.getapellido());
			this.jInternalFrameDetalleFormResponsable.jTextAreanombre_completoResponsable.setText(responsable.getnombre_completo());
			this.jInternalFrameDetalleFormResponsable.jTextAreaemailResponsable.setText(responsable.getemail());
			this.jInternalFrameDetalleFormResponsable.jTextFieldtelefonoResponsable.setText(responsable.gettelefono());
			this.jInternalFrameDetalleFormResponsable.jTextFieldtelefono_celularResponsable.setText(responsable.gettelefono_celular());
			this.jInternalFrameDetalleFormResponsable.jTextAreadireccionResponsable.setText(responsable.getdireccion());
			this.jInternalFrameDetalleFormResponsable.jTextFieldfaxResponsable.setText(responsable.getfax());
			this.jInternalFrameDetalleFormResponsable.jTextAreaobservacionResponsable.setText(responsable.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResponsable(ResponsableBean responsableBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.setText(responsableBean.getId().toString());
			this.jInternalFrameDetalleFormResponsable.jTextFieldidentificacionResponsable.setText(responsableBean.getidentificacion());
			this.jInternalFrameDetalleFormResponsable.jTextFieldrucResponsable.setText(responsableBean.getruc());
			this.jInternalFrameDetalleFormResponsable.jTextAreanombreResponsable.setText(responsableBean.getnombre());
			this.jInternalFrameDetalleFormResponsable.jTextAreaapellidoResponsable.setText(responsableBean.getapellido());
			this.jInternalFrameDetalleFormResponsable.jTextAreanombre_completoResponsable.setText(responsableBean.getnombre_completo());
			this.jInternalFrameDetalleFormResponsable.jTextAreaemailResponsable.setText(responsableBean.getemail());
			this.jInternalFrameDetalleFormResponsable.jTextFieldtelefonoResponsable.setText(responsableBean.gettelefono());
			this.jInternalFrameDetalleFormResponsable.jTextFieldtelefono_celularResponsable.setText(responsableBean.gettelefono_celular());
			this.jInternalFrameDetalleFormResponsable.jTextAreadireccionResponsable.setText(responsableBean.getdireccion());
			this.jInternalFrameDetalleFormResponsable.jTextFieldfaxResponsable.setText(responsableBean.getfax());
			this.jInternalFrameDetalleFormResponsable.jTextAreaobservacionResponsable.setText(responsableBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanResponsable(ResponsableParameterReturnGeneral responsableReturnGeneral,ResponsableBean responsableBean,Boolean conDefault) throws Exception { 
		try {
			Responsable responsableLocal=new Responsable();
			
			responsableLocal=responsableReturnGeneral.getResponsable();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && responsableLocal.getId()!=null && !responsableLocal.getId().equals(0L))) {responsableBean.setId(responsableLocal.getId());}}
			if(conDefault || (!conDefault && responsableLocal.getid_cliente()!=null && !responsableLocal.getid_cliente().equals(-1L))) {responsableBean.setid_cliente(responsableLocal.getid_cliente());}
			if(conDefault || (!conDefault && responsableLocal.getidentificacion()!=null && !responsableLocal.getidentificacion().equals(""))) {responsableBean.setidentificacion(responsableLocal.getidentificacion());}
			if(conDefault || (!conDefault && responsableLocal.getruc()!=null && !responsableLocal.getruc().equals(""))) {responsableBean.setruc(responsableLocal.getruc());}
			if(conDefault || (!conDefault && responsableLocal.getnombre()!=null && !responsableLocal.getnombre().equals(""))) {responsableBean.setnombre(responsableLocal.getnombre());}
			if(conDefault || (!conDefault && responsableLocal.getapellido()!=null && !responsableLocal.getapellido().equals(""))) {responsableBean.setapellido(responsableLocal.getapellido());}
			if(conDefault || (!conDefault && responsableLocal.getnombre_completo()!=null && !responsableLocal.getnombre_completo().equals(""))) {responsableBean.setnombre_completo(responsableLocal.getnombre_completo());}
			if(conDefault || (!conDefault && responsableLocal.getemail()!=null && !responsableLocal.getemail().equals(""))) {responsableBean.setemail(responsableLocal.getemail());}
			if(conDefault || (!conDefault && responsableLocal.gettelefono()!=null && !responsableLocal.gettelefono().equals(""))) {responsableBean.settelefono(responsableLocal.gettelefono());}
			if(conDefault || (!conDefault && responsableLocal.gettelefono_celular()!=null && !responsableLocal.gettelefono_celular().equals(""))) {responsableBean.settelefono_celular(responsableLocal.gettelefono_celular());}
			if(conDefault || (!conDefault && responsableLocal.getdireccion()!=null && !responsableLocal.getdireccion().equals(""))) {responsableBean.setdireccion(responsableLocal.getdireccion());}
			if(conDefault || (!conDefault && responsableLocal.getfax()!=null && !responsableLocal.getfax().equals(""))) {responsableBean.setfax(responsableLocal.getfax());}
			if(conDefault || (!conDefault && responsableLocal.getobservacion()!=null && !responsableLocal.getobservacion().equals(""))) {responsableBean.setobservacion(responsableLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxResponsableGenerico(Long idResponsableSeleccionado,JComboBox jComboBoxResponsable,List<Responsable> responsablesLocal)throws Exception {
		try {
			Responsable  responsableTemp=null;

			for(Responsable responsableAux:responsablesLocal) {
				if(responsableAux.getId()!=null && responsableAux.getId().equals(idResponsableSeleccionado)) {
					responsableTemp=responsableAux;
					break;
				}
			}

			jComboBoxResponsable.setSelectedItem(responsableTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxResponsableGenerico(JComboBox jComboBoxResponsable,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResponsable.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxResponsable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResponsable.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxResponsable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Factura")) {
			jButtonFacturaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Consignacion")) {
			jButtonConsignacionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PedidoExpor")) {
			jButtonPedidoExporActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Pedido")) {
			jButtonPedidoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("NotaCreditoSoli")) {
			jButtonNotaCreditoSoliActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsable=(Responsable) responsableLogic.getResponsables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			responsable =(Responsable) responsables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!responsable.getIsNew() && !responsable.getIsChanged() && !responsable.getIsDeleted()) {
				sDescripcion=responsable.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=responsable.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!responsable.getIsNew() && !responsable.getIsChanged() && !responsable.getIsDeleted()) {
				sDescripcion=responsable.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=responsable.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!responsable.getIsNew() && !responsable.getIsChanged() && !responsable.getIsDeleted()) {
				sDescripcion=responsable.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=responsable.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!responsable.getIsNew() && !responsable.getIsChanged() && !responsable.getIsDeleted()) {
				sDescripcion=responsable.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=responsable.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Responsable responsableRow=new Responsable();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsableRow=(Responsable) responsableLogic.getResponsables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			responsableRow=(Responsable) responsables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFacturaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Responsable responsable) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormResponsable==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable = (Responsable)this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.responsable = (Responsable)this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(responsable!=null) {
						this.responsable = responsable;
					} else {
						this.responsable = new Responsable();
					}
				}

				if(this.isTienePermisosFactura && this.permiteMantenimiento(this.responsable)) {
					FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFramePopup=new FacturaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFramePopup;
					} else {
						facturaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame;
					}

					List<Responsable> responsables=new ArrayList<Responsable>();
					responsables.add(this.responsable);
					if(!esRelacionado) {
						//facturaBeanSwingJInternalFrame.facturaSessionBean.setConGuardarRelaciones(false);
						//facturaBeanSwingJInternalFrame.facturaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormResponsable.cargarFacturaBeanSwingJInternalFrame(responsables,this.responsable,facturaBeanSwingJInternalFrame,/*conInicializar,*/facturaBeanSwingJInternalFrame.facturaSessionBean.getConGuardarRelaciones(),facturaBeanSwingJInternalFrame.facturaSessionBean.getEsGuardarRelacionado());
					facturaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("no_relacionado");

						facturaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaConstantesFunciones.ITAMANIOFILATABLA + (FacturaConstantesFunciones.ITAMANIOFILATABLA/2));

						facturaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
						TitledBorder titledBorderFactura=(TitledBorder)facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

						titledBorderFactura.setTitle(titledBorderResponsable.getTitle() + " -> Factura");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturaBeanSwingJInternalFrame);
						}

						facturaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturaBeanSwingJInternalFrame);

						facturaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.responsableSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonConsignacionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Responsable responsable) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormResponsable==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable = (Responsable)this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.responsable = (Responsable)this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(responsable!=null) {
						this.responsable = responsable;
					} else {
						this.responsable = new Responsable();
					}
				}

				if(this.isTienePermisosConsignacion && this.permiteMantenimiento(this.responsable)) {
					ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFramePopup=new ConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						consignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFramePopup;
					} else {
						consignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame;
					}

					List<Responsable> responsables=new ArrayList<Responsable>();
					responsables.add(this.responsable);
					if(!esRelacionado) {
						//consignacionBeanSwingJInternalFrame.consignacionSessionBean.setConGuardarRelaciones(false);
						//consignacionBeanSwingJInternalFrame.consignacionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					consignacionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormResponsable.cargarConsignacionBeanSwingJInternalFrame(responsables,this.responsable,consignacionBeanSwingJInternalFrame,/*conInicializar,*/consignacionBeanSwingJInternalFrame.consignacionSessionBean.getConGuardarRelaciones(),consignacionBeanSwingJInternalFrame.consignacionSessionBean.getEsGuardarRelacionado());
					consignacionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("no_relacionado");

						consignacionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ConsignacionConstantesFunciones.ITAMANIOFILATABLA + (ConsignacionConstantesFunciones.ITAMANIOFILATABLA/2));

						consignacionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
						TitledBorder titledBorderConsignacion=(TitledBorder)consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.getBorder();

						titledBorderConsignacion.setTitle(titledBorderResponsable.getTitle() + " -> Consignacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,consignacionBeanSwingJInternalFrame);
						}

						consignacionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(consignacionBeanSwingJInternalFrame);

						consignacionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.responsableSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Consignacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPedidoExporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Responsable responsable) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormResponsable==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable = (Responsable)this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.responsable = (Responsable)this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(responsable!=null) {
						this.responsable = responsable;
					} else {
						this.responsable = new Responsable();
					}
				}

				if(this.isTienePermisosPedidoExpor && this.permiteMantenimiento(this.responsable)) {
					PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFramePopup;
					} else {
						pedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame;
					}

					List<Responsable> responsables=new ArrayList<Responsable>();
					responsables.add(this.responsable);
					if(!esRelacionado) {
						//pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setConGuardarRelaciones(false);
						//pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormResponsable.cargarPedidoExporBeanSwingJInternalFrame(responsables,this.responsable,pedidoexporBeanSwingJInternalFrame,/*conInicializar,*/pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getConGuardarRelaciones(),pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado());
					pedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");

						pedidoexporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoExporConstantesFunciones.ITAMANIOFILATABLA + (PedidoExporConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidoexporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
						TitledBorder titledBorderPedidoExpor=(TitledBorder)pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.getBorder();

						titledBorderPedidoExpor.setTitle(titledBorderResponsable.getTitle() + " -> Pedido Exportacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidoexporBeanSwingJInternalFrame);
						}

						pedidoexporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidoexporBeanSwingJInternalFrame);

						pedidoexporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.responsableSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Exportacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPedidoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Responsable responsable) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormResponsable==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable = (Responsable)this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.responsable = (Responsable)this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(responsable!=null) {
						this.responsable = responsable;
					} else {
						this.responsable = new Responsable();
					}
				}

				if(this.isTienePermisosPedido && this.permiteMantenimiento(this.responsable)) {
					PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFramePopup=new PedidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFramePopup;
					} else {
						pedidoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame;
					}

					List<Responsable> responsables=new ArrayList<Responsable>();
					responsables.add(this.responsable);
					if(!esRelacionado) {
						//pedidoBeanSwingJInternalFrame.pedidoSessionBean.setConGuardarRelaciones(false);
						//pedidoBeanSwingJInternalFrame.pedidoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormResponsable.cargarPedidoBeanSwingJInternalFrame(responsables,this.responsable,pedidoBeanSwingJInternalFrame,/*conInicializar,*/pedidoBeanSwingJInternalFrame.pedidoSessionBean.getConGuardarRelaciones(),pedidoBeanSwingJInternalFrame.pedidoSessionBean.getEsGuardarRelacionado());
					pedidoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidoBeanSwingJInternalFrame.actualizarEstadoPanelsPedido("no_relacionado");

						pedidoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoConstantesFunciones.ITAMANIOFILATABLA + (PedidoConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
						TitledBorder titledBorderPedido=(TitledBorder)pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.getBorder();

						titledBorderPedido.setTitle(titledBorderResponsable.getTitle() + " -> Pedido");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidoBeanSwingJInternalFrame);
						}

						pedidoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidoBeanSwingJInternalFrame);

						pedidoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.responsableSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonNotaCreditoSoliActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Responsable responsable) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormResponsable==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable = (Responsable)this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.responsable = (Responsable)this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(responsable!=null) {
						this.responsable = responsable;
					} else {
						this.responsable = new Responsable();
					}
				}

				if(this.isTienePermisosNotaCreditoSoli && this.permiteMantenimiento(this.responsable)) {
					NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFramePopup=new NotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						notacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFramePopup;
					} else {
						notacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame;
					}

					List<Responsable> responsables=new ArrayList<Responsable>();
					responsables.add(this.responsable);
					if(!esRelacionado) {
						//notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setConGuardarRelaciones(false);
						//notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					notacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormResponsable.cargarNotaCreditoSoliBeanSwingJInternalFrame(responsables,this.responsable,notacreditosoliBeanSwingJInternalFrame,/*conInicializar,*/notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getConGuardarRelaciones(),notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getEsGuardarRelacionado());
					notacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("no_relacionado");

						notacreditosoliBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA + (NotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA/2));

						notacreditosoliBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
						TitledBorder titledBorderNotaCreditoSoli=(TitledBorder)notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.getBorder();

						titledBorderNotaCreditoSoli.setTitle(titledBorderResponsable.getTitle() + " -> Solicitud Nota Credito");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,notacreditosoliBeanSwingJInternalFrame);
						}

						notacreditosoliBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(notacreditosoliBeanSwingJInternalFrame);

						notacreditosoliBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.responsableSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Solicitud Nota Credito",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualResponsable(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoResponsable.setVisible((this.isVisibilidadCeldaNuevoResponsable && this.isPermisoNuevoResponsable));			
			this.jButtonDuplicarResponsable.setVisible((this.isVisibilidadCeldaDuplicarResponsable && this.isPermisoDuplicarResponsable));			
			this.jButtonCopiarResponsable.setVisible((this.isVisibilidadCeldaCopiarResponsable && this.isPermisoCopiarResponsable));
			this.jButtonVerFormResponsable.setVisible((this.isVisibilidadCeldaVerFormResponsable && this.isPermisoVerFormResponsable));
			
			this.jButtonAbrirOrderByResponsable.setVisible((this.isVisibilidadCeldaOrdenResponsable && this.isPermisoOrdenResponsable));			
			
			this.jButtonNuevoRelacionesResponsable.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsable && this.isPermisoNuevoResponsable));			
			this.jButtonNuevoGuardarCambiosResponsable.setVisible((this.isVisibilidadCeldaNuevoResponsable && this.isPermisoNuevoResponsable && this.isPermisoGuardarCambiosResponsable));
			
			if(this.jInternalFrameDetalleFormResponsable!=null) {
			this.jInternalFrameDetalleFormResponsable.jButtonModificarResponsable.setVisible((this.isVisibilidadCeldaModificarResponsable && this.isPermisoActualizarResponsable));	
			this.jInternalFrameDetalleFormResponsable.jButtonActualizarResponsable.setVisible((this.isVisibilidadCeldaActualizarResponsable && this.isPermisoActualizarResponsable));	
			this.jInternalFrameDetalleFormResponsable.jButtonEliminarResponsable.setVisible((this.isVisibilidadCeldaEliminarResponsable && this.isPermisoEliminarResponsable));
			this.jInternalFrameDetalleFormResponsable.jButtonCancelarResponsable.setVisible(this.isVisibilidadCeldaCancelarResponsable);							
			this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosResponsable.setVisible((this.isVisibilidadCeldaGuardarResponsable && this.isPermisoGuardarCambiosResponsable));			
			
			}
						
			this.jButtonGuardarCambiosTablaResponsable.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsable && this.isPermisoGuardarCambiosResponsable));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarResponsable.setVisible((this.isVisibilidadCeldaNuevoResponsable && this.isPermisoNuevoResponsable));						
			this.jButtonDuplicarToolBarResponsable.setVisible((this.isVisibilidadCeldaDuplicarResponsable && this.isPermisoDuplicarResponsable));						
			this.jButtonCopiarToolBarResponsable.setVisible((this.isVisibilidadCeldaCopiarResponsable && this.isPermisoCopiarResponsable));			
			this.jButtonVerFormToolBarResponsable.setVisible((this.isVisibilidadCeldaVerFormResponsable && this.isPermisoVerFormResponsable));			
			this.jButtonAbrirOrderByToolBarResponsable.setVisible((this.isVisibilidadCeldaOrdenResponsable && this.isPermisoOrdenResponsable));
			this.jButtonNuevoRelacionesToolBarResponsable.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsable && this.isPermisoNuevoResponsable));			
			this.jButtonNuevoGuardarCambiosToolBarResponsable.setVisible((this.isVisibilidadCeldaNuevoResponsable && this.isPermisoNuevoResponsable && this.isPermisoGuardarCambiosResponsable));			
			
			if(this.jInternalFrameDetalleFormResponsable!=null) {
			this.jInternalFrameDetalleFormResponsable.jButtonModificarToolBarResponsable.setVisible((this.isVisibilidadCeldaModificarResponsable && this.isPermisoActualizarResponsable));	
			this.jInternalFrameDetalleFormResponsable.jButtonActualizarToolBarResponsable.setVisible((this.isVisibilidadCeldaActualizarResponsable  && this.isPermisoActualizarResponsable));	
			this.jInternalFrameDetalleFormResponsable.jButtonEliminarToolBarResponsable.setVisible((this.isVisibilidadCeldaEliminarResponsable && this.isPermisoEliminarResponsable));
			this.jInternalFrameDetalleFormResponsable.jButtonCancelarToolBarResponsable.setVisible(this.isVisibilidadCeldaCancelarResponsable);				
			this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosToolBarResponsable.setVisible((this.isVisibilidadCeldaGuardarResponsable && this.isPermisoGuardarCambiosResponsable));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarResponsable.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsable && this.isPermisoGuardarCambiosResponsable));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoResponsable.setVisible((this.isVisibilidadCeldaNuevoResponsable && this.isPermisoNuevoResponsable));			
			this.jMenuItemDuplicarResponsable.setVisible((this.isVisibilidadCeldaDuplicarResponsable && this.isPermisoDuplicarResponsable));			
			this.jMenuItemCopiarResponsable.setVisible((this.isVisibilidadCeldaCopiarResponsable && this.isPermisoCopiarResponsable));			
			this.jMenuItemVerFormResponsable.setVisible((this.isVisibilidadCeldaVerFormResponsable && this.isPermisoVerFormResponsable));			
			this.jMenuItemAbrirOrderByResponsable.setVisible((this.isVisibilidadCeldaOrdenResponsable && this.isPermisoOrdenResponsable));			
			//this.jMenuItemMostrarOcultarResponsable.setVisible((this.isVisibilidadCeldaOrdenResponsable && this.isPermisoOrdenResponsable));
			this.jMenuItemDetalleAbrirOrderByResponsable.setVisible((this.isVisibilidadCeldaOrdenResponsable && this.isPermisoOrdenResponsable));			
			//this.jMenuItemDetalleMostrarOcultarResponsable.setVisible((this.isVisibilidadCeldaOrdenResponsable && this.isPermisoOrdenResponsable));			
			this.jMenuItemNuevoRelacionesResponsable.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsable && this.isPermisoNuevoResponsable));			
			this.jMenuItemNuevoGuardarCambiosResponsable.setVisible((this.isVisibilidadCeldaNuevoResponsable && this.isPermisoNuevoResponsable && this.isPermisoGuardarCambiosResponsable));									
			
			if(this.jInternalFrameDetalleFormResponsable!=null) {
			this.jInternalFrameDetalleFormResponsable.jMenuItemModificarResponsable.setVisible((this.isVisibilidadCeldaModificarResponsable && this.isPermisoActualizarResponsable));	
			this.jInternalFrameDetalleFormResponsable.jMenuItemActualizarResponsable.setVisible((this.isVisibilidadCeldaActualizarResponsable && this.isPermisoActualizarResponsable));	
			this.jInternalFrameDetalleFormResponsable.jMenuItemEliminarResponsable.setVisible((this.isVisibilidadCeldaEliminarResponsable && this.isPermisoEliminarResponsable));
			this.jInternalFrameDetalleFormResponsable.jMenuItemCancelarResponsable.setVisible(this.isVisibilidadCeldaCancelarResponsable);				
			}
			
			this.jMenuItemGuardarCambiosResponsable.setVisible((this.isVisibilidadCeldaGuardarResponsable && this.isPermisoGuardarCambiosResponsable));						
			this.jMenuItemGuardarCambiosTablaResponsable.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsable && this.isPermisoGuardarCambiosResponsable));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoResponsable=this.jButtonNuevoResponsable.isVisible();
			this.isVisibilidadCeldaDuplicarResponsable=this.jButtonDuplicarResponsable.isVisible();
			this.isVisibilidadCeldaCopiarResponsable=this.jButtonCopiarResponsable.isVisible();
			this.isVisibilidadCeldaVerFormResponsable=this.jButtonVerFormResponsable.isVisible();
			
			this.isVisibilidadCeldaOrdenResponsable=this.jButtonAbrirOrderByResponsable.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesResponsable=this.jButtonNuevoRelacionesResponsable.isVisible();
			this.isVisibilidadCeldaModificarResponsable=this.jButtonModificarResponsable.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsable!=null) {
			this.isVisibilidadCeldaActualizarResponsable=this.jInternalFrameDetalleFormResponsable.jButtonActualizarResponsable.isVisible();
			this.isVisibilidadCeldaEliminarResponsable=this.jInternalFrameDetalleFormResponsable.jButtonEliminarResponsable.isVisible();
			this.isVisibilidadCeldaCancelarResponsable=this.jInternalFrameDetalleFormResponsable.jButtonCancelarResponsable.isVisible();
			this.isVisibilidadCeldaGuardarResponsable=this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosResponsable.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosResponsable=this.jButtonGuardarCambiosTablaResponsable.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoResponsable=this.jButtonNuevoToolBarResponsable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResponsable=this.jButtonNuevoRelacionesToolBarResponsable.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsable!=null) {
			this.isVisibilidadCeldaModificarResponsable=this.jInternalFrameDetalleFormResponsable.jButtonModificarToolBarResponsable.isVisible();
			this.isVisibilidadCeldaActualizarResponsable=this.jInternalFrameDetalleFormResponsable.jButtonActualizarToolBarResponsable.isVisible();
			this.isVisibilidadCeldaEliminarResponsable=this.jInternalFrameDetalleFormResponsable.jButtonEliminarToolBarResponsable.isVisible();
			this.isVisibilidadCeldaCancelarResponsable=this.jInternalFrameDetalleFormResponsable.jButtonCancelarToolBarResponsable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResponsable=this.jButtonGuardarCambiosToolBarResponsable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResponsable=this.jButtonGuardarCambiosTablaToolBarResponsable.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoResponsable=this.jMenuItemNuevoResponsable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResponsable=this.jMenuItemNuevoRelacionesResponsable.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsable!=null) {
			this.isVisibilidadCeldaModificarResponsable=this.jInternalFrameDetalleFormResponsable.jMenuItemModificarResponsable.isVisible();
			this.isVisibilidadCeldaActualizarResponsable=this.jInternalFrameDetalleFormResponsable.jMenuItemActualizarResponsable.isVisible();
			this.isVisibilidadCeldaEliminarResponsable=this.jInternalFrameDetalleFormResponsable.jMenuItemEliminarResponsable.isVisible();
			this.isVisibilidadCeldaCancelarResponsable=this.jInternalFrameDetalleFormResponsable.jMenuItemCancelarResponsable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResponsable=this.jMenuItemGuardarCambiosResponsable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResponsable=this.jMenuItemGuardarCambiosTablaResponsable.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesResponsable(Boolean esInicializar) {
		if(ResponsableJInternalFrame.ISBINDING_MANUAL) {			
			if(this.responsableSessionBean.getConGuardarRelaciones()) {
				//if(this.responsableSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesResponsable();
			}
			
			this.inicializarActualizarBindingBotonesManualResponsable(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualResponsable() {
		this.jButtonNuevoResponsable.setVisible(this.isPermisoNuevoResponsable);			
		this.jButtonDuplicarResponsable.setVisible(this.isPermisoDuplicarResponsable);			
		this.jButtonCopiarResponsable.setVisible(this.isPermisoCopiarResponsable);			
		this.jButtonVerFormResponsable.setVisible(this.isPermisoVerFormResponsable);			
		
		this.jButtonAbrirOrderByResponsable.setVisible(this.isPermisoOrdenResponsable);					
		
		this.jButtonNuevoRelacionesResponsable.setVisible(this.isPermisoNuevoResponsable);			
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonModificarResponsable.setVisible(this.isPermisoActualizarResponsable);	
			this.jInternalFrameDetalleFormResponsable.jButtonActualizarResponsable.setVisible(this.isPermisoActualizarResponsable);	
			this.jInternalFrameDetalleFormResponsable.jButtonEliminarResponsable.setVisible(this.isPermisoEliminarResponsable);
			this.jInternalFrameDetalleFormResponsable.jButtonCancelarResponsable.setVisible(this.isVisibilidadCeldaCancelarResponsable);						
			this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosResponsable.setVisible(this.isPermisoGuardarCambiosResponsable);							
		}
		
		this.jButtonGuardarCambiosTablaResponsable.setVisible(this.isPermisoActualizarResponsable);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleResponsable() {
		this.jInternalFrameDetalleFormResponsable.jButtonModificarResponsable.setVisible(this.isPermisoActualizarResponsable);	
		this.jInternalFrameDetalleFormResponsable.jButtonActualizarResponsable.setVisible(this.isPermisoActualizarResponsable);	
		this.jInternalFrameDetalleFormResponsable.jButtonEliminarResponsable.setVisible(this.isPermisoEliminarResponsable);
		this.jInternalFrameDetalleFormResponsable.jButtonCancelarResponsable.setVisible(this.isVisibilidadCeldaCancelarResponsable);							
		this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosResponsable.setVisible((this.isVisibilidadCeldaGuardarResponsable && this.isPermisoGuardarCambiosResponsable));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosResponsable() {
		if(ResponsableJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualResponsable();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesResponsable() {
	}
	
	public void jTableDatosResponsableListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarResponsable(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.responsable.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaResponsableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebResponsable(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.responsableLogic.getConnexion());

				if(this.responsable.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.responsable.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderResponsable.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.responsable.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalResponsableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebResponsable(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.responsableLogic.getConnexion());

				if(this.responsable.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.responsable.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderResponsable.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.responsable.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteResponsableActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderResponsable=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosResponsable.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderResponsable.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteResponsableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebResponsable(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.responsableLogic.getConnexion());

				if(this.responsable.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.responsable.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderResponsable.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.responsable.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioResponsableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebResponsable(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.responsableLogic.getConnexion());

				if(this.responsable.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.responsable.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsable=(TitledBorder)this.jScrollPanelDatosResponsable.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderResponsable.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.responsable.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidentificacionResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getidentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where identificacion like '%"+this.responsable.getidentificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.responsable.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.responsable.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.responsable.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.responsable.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonemailResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getemail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where email like '%"+this.responsable.getemail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.responsable.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_celularResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.gettelefono_celular()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_celular like '%"+this.responsable.gettelefono_celular()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.responsable.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfaxResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getfax()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fax like '%"+this.responsable.getfax()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionResponsableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsable(this.getresponsable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsable==null) {
						this.responsable = new Responsable();
					}

					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);
				}

				if(this.responsable.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.responsable.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdentificacionResponsableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsable(false,false);

			this.getResponsablesBusquedaPorIdentificacion();

			this.inicializarActualizarBindingResponsable(false);

			//if(ResponsableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreCompletoResponsableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsable(false,false);

			this.getResponsablesBusquedaPorNombreCompleto();

			this.inicializarActualizarBindingResponsable(false);

			//if(ResponsableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorRucResponsableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsable(false,false);

			this.getResponsablesBusquedaPorRuc();

			this.inicializarActualizarBindingResponsable(false);

			//if(ResponsableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorTelefonoResponsableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsable(false,false);

			this.getResponsablesBusquedaPorTelefono();

			this.inicializarActualizarBindingResponsable(false);

			//if(ResponsableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorTelefonoCelularResponsableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsable(false,false);

			this.getResponsablesBusquedaPorTelefonoCelular();

			this.inicializarActualizarBindingResponsable(false);

			//if(ResponsableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteResponsableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsable(false,false);

			this.getResponsablesFK_IdCliente();

			this.inicializarActualizarBindingResponsable(false);

			//if(ResponsableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaResponsableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsable(false,false);

			this.getResponsablesFK_IdEmpresa();

			this.inicializarActualizarBindingResponsable(false);

			//if(ResponsableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalResponsableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsable(false,false);

			this.getResponsablesFK_IdSucursal();

			this.inicializarActualizarBindingResponsable(false);

			//if(ResponsableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioResponsableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsable(false,false);

			this.getResponsablesFK_IdUsuario();

			this.inicializarActualizarBindingResponsable(false);

			//if(ResponsableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameResponsable() {
		if(this.jInternalFrameDetalleFormResponsable!=null) {
		

		if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormResponsable!=null) {
			this.jInternalFrameDetalleFormResponsable.setVisible(false);	    			
			this.jInternalFrameDetalleFormResponsable.dispose();
			this.jInternalFrameDetalleFormResponsable=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoResponsable!=null) {
			this.jInternalFrameReporteDinamicoResponsable.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoResponsable.dispose();
			this.jInternalFrameReporteDinamicoResponsable=null;
		}
		
		if(this.jInternalFrameImportacionResponsable!=null) {
			this.jInternalFrameImportacionResponsable.setVisible(false);	    			
			this.jInternalFrameImportacionResponsable.dispose();
			this.jInternalFrameImportacionResponsable=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessResponsable();
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
			
			if(sTipo.equals("NuevoResponsable")) {
				jButtonNuevoResponsableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarResponsable")) {
				jButtonDuplicarResponsableActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarResponsable")) {
				jButtonCopiarResponsableActionPerformed(evt);
			} else if(sTipo.equals("VerFormResponsable")) {
				jButtonVerFormResponsableActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarResponsable")) {
				jButtonNuevoResponsableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarResponsable")) {
				jButtonDuplicarResponsableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoResponsable")) {
				jButtonNuevoResponsableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarResponsable")) {
				jButtonDuplicarResponsableActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesResponsable")) {
				jButtonNuevoResponsableActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarResponsable")) {
				jButtonNuevoResponsableActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesResponsable")) {
				jButtonNuevoResponsableActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarResponsable")) {
				jButtonModificarResponsableActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarResponsable")) {
				jButtonModificarResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarResponsable")) {
				jButtonModificarResponsableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarResponsable")) {
				jButtonActualizarResponsableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarResponsable")) {
				jButtonActualizarResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarResponsable")) {
				jButtonActualizarResponsableActionPerformed(evt);
			} else if(sTipo.equals("EliminarResponsable")) {
				jButtonEliminarResponsableActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarResponsable")) {
				jButtonEliminarResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarResponsable")) {
				jButtonEliminarResponsableActionPerformed(evt);
			} else if(sTipo.equals("CancelarResponsable")) {
				jButtonCancelarResponsableActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarResponsable")) {
				jButtonCancelarResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarResponsable")) {
				jButtonCancelarResponsableActionPerformed(evt);
			} else if(sTipo.equals("CerrarResponsable")) {
				jButtonCerrarResponsableActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarResponsable")) {
				jButtonCerrarResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarResponsable")) {
				jButtonCerrarResponsableActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarResponsable")) {
				jButtonMostrarOcultarResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarResponsable")) {
				jButtonCancelarResponsableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosResponsable")) {
				jButtonGuardarCambiosResponsableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarResponsable")) {
				jButtonGuardarCambiosResponsableActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarResponsable")) {
				jButtonCopiarResponsableActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarResponsable")) {
				jButtonVerFormResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosResponsable")) {
				jButtonGuardarCambiosResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarResponsable")) {
				jButtonCopiarResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormResponsable")) {
				jButtonVerFormResponsableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaResponsable")) {
				jButtonGuardarCambiosResponsableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarResponsable")) {
				jButtonGuardarCambiosResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaResponsable")) {
				jButtonGuardarCambiosResponsableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionResponsable")) {
				jButtonRecargarInformacionResponsableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarResponsable")) {
				jButtonRecargarInformacionResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionResponsable")) {
				jButtonRecargarInformacionResponsableActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresResponsable")) {
				jButtonAnterioresResponsableActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarResponsable")) {
				jButtonAnterioresResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreResponsable")) {
				jButtonAnterioresResponsableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesResponsable")) {
				jButtonSiguientesResponsableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarResponsable")) {
				jButtonSiguientesResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesResponsable")) {
				jButtonSiguientesResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByResponsable") || sTipo.equals("MenuItemDetalleAbrirOrderByResponsable")) {
				jButtonAbrirOrderByResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarResponsable") || sTipo.equals("MenuItemDetalleMostrarOcultarResponsable")) {
				jButtonMostrarOcultarResponsableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosResponsable")) {
				jButtonNuevoGuardarCambiosResponsableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarResponsable")) {
				jButtonNuevoGuardarCambiosResponsableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosResponsable")) {
				jButtonNuevoGuardarCambiosResponsableActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoResponsable")) {
				jButtonCerrarReporteDinamicoResponsableActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoResponsable")) {
				jButtonGenerarReporteDinamicoResponsableActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoResponsable")) {
				
				jButtonGenerarExcelReporteDinamicoResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionResponsable")) {
				jButtonCerrarImportacionResponsableActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionResponsable")) {
				
				jButtonGenerarImportacionResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionResponsable")) {
				
				jButtonAbrirImportacionResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesResponsable")) {
				jComboBoxTiposAccionesResponsableActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesResponsable")) {
				jComboBoxTiposRelacionesResponsableActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioResponsable")) {
				jComboBoxTiposAccionesResponsableActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarResponsable")) {
				
				jComboBoxTiposSeleccionarResponsableActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralResponsable")) {
				jTextFieldValorCampoGeneralResponsableActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByResponsable")) {
				jButtonAbrirOrderByResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarResponsable")) {
				jButtonAbrirOrderByResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByResponsable")) {
				jButtonCerrarOrderByResponsableActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResponsableBusqueda")) {
				this.jButtonidResponsableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResponsableUpdate")) {
				this.jButtonid_empresaResponsableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResponsableBusqueda")) {
				this.jButtonid_empresaResponsableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalResponsableUpdate")) {
				this.jButtonid_sucursalResponsableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalResponsableBusqueda")) {
				this.jButtonid_sucursalResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteResponsable")) {
				this.jButtonid_clienteResponsableActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteResponsableUpdate")) {
				this.jButtonid_clienteResponsableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteResponsableBusqueda")) {
				this.jButtonid_clienteResponsableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioResponsableUpdate")) {
				this.jButtonid_usuarioResponsableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioResponsableBusqueda")) {
				this.jButtonid_usuarioResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionResponsableBusqueda")) {
				this.jButtonidentificacionResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucResponsableBusqueda")) {
				this.jButtonrucResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreResponsableBusqueda")) {
				this.jButtonnombreResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoResponsableBusqueda")) {
				this.jButtonapellidoResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoResponsableBusqueda")) {
				this.jButtonnombre_completoResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailResponsableBusqueda")) {
				this.jButtonemailResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoResponsableBusqueda")) {
				this.jButtontelefonoResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_celularResponsableBusqueda")) {
				this.jButtontelefono_celularResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionResponsableBusqueda")) {
				this.jButtondireccionResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("faxResponsableBusqueda")) {
				this.jButtonfaxResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionResponsableBusqueda")) {
				this.jButtonobservacionResponsableBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteResponsable")) {
				this.jButtonid_clienteResponsableActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorIdentificacionResponsable")) {
				this.jButtonBusquedaPorIdentificacionResponsableActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreCompletoResponsable")) {
				this.jButtonBusquedaPorNombreCompletoResponsableActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorRucResponsable")) {
				this.jButtonBusquedaPorRucResponsableActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorTelefonoResponsable")) {
				this.jButtonBusquedaPorTelefonoResponsableActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorTelefonoCelularResponsable")) {
				this.jButtonBusquedaPorTelefonoCelularResponsableActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteResponsable")) {
				this.jButtonFK_IdClienteResponsableActionPerformed(evt);
			}
			
			;
			
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessResponsable();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				


				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Responsable responsableLocal=null;
			
			if(!this.getEsControlTabla()) {
				responsableLocal=this.responsable;
			} else {
				responsableLocal=this.responsableAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
							
				
				


				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableAnterior =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableAnterior =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
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
			
			


			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
								
						
				


				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
								
				
				


				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableAnterior =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableAnterior =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableAnterior =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableAnterior =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
							
				
				


				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableAnterior =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.responsableAnterior =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
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
			
			


			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
								
				
				


				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableAnterior =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableAnterior =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosResponsable")) {
					jCheckBoxSeleccionarTodosResponsableItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosResponsable")) {
					jCheckBoxSeleccionadosResponsableItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarResponsable")) {
					
				}
				
				


				
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
												
				
				


				
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableAnterior =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.responsableAnterior =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
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
			
			


			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsable);
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
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
				
				


				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsable.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableAnterior =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableAnterior =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarResponsable")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosResponsableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosResponsable.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.responsable =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.responsable =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.responsable);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarResponsable")) {
				
				}
				
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarResponsable")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosResponsable.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarResponsable")) {
			
			}
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessResponsable();
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
			if(sTipo.equals("NuevoResponsable")) {
				jButtonNuevoResponsableActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarResponsable")) {
				jButtonDuplicarResponsableActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarResponsable")) {
				jButtonCopiarResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormResponsable")) {
				jButtonVerFormResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesResponsable")) {
				jButtonNuevoResponsableActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarResponsable")) {
				jButtonModificarResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarResponsable")) {
				jButtonActualizarResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarResponsable")) {
				jButtonEliminarResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaResponsable")) {
				jButtonGuardarCambiosResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarResponsable")) {
				jButtonCancelarResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarResponsable")) {
				jButtonCerrarResponsableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosResponsable")) {
				jButtonGuardarCambiosResponsableActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosResponsable")) {
				jButtonNuevoGuardarCambiosResponsableActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByResponsable")) {
				jButtonAbrirOrderByResponsableActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionResponsable")) {
				jButtonRecargarInformacionResponsableActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresResponsable")) {
				jButtonAnterioresResponsableActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesResponsable")) {
				jButtonSiguientesResponsableActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResponsableBusqueda")) {
				this.jButtonidResponsableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResponsableUpdate")) {
				this.jButtonid_empresaResponsableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResponsableBusqueda")) {
				this.jButtonid_empresaResponsableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalResponsableUpdate")) {
				this.jButtonid_sucursalResponsableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalResponsableBusqueda")) {
				this.jButtonid_sucursalResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteResponsable")) {
				this.jButtonid_clienteResponsableActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteResponsableUpdate")) {
				this.jButtonid_clienteResponsableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteResponsableBusqueda")) {
				this.jButtonid_clienteResponsableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioResponsableUpdate")) {
				this.jButtonid_usuarioResponsableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioResponsableBusqueda")) {
				this.jButtonid_usuarioResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionResponsableBusqueda")) {
				this.jButtonidentificacionResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucResponsableBusqueda")) {
				this.jButtonrucResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreResponsableBusqueda")) {
				this.jButtonnombreResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoResponsableBusqueda")) {
				this.jButtonapellidoResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoResponsableBusqueda")) {
				this.jButtonnombre_completoResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailResponsableBusqueda")) {
				this.jButtonemailResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoResponsableBusqueda")) {
				this.jButtontelefonoResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_celularResponsableBusqueda")) {
				this.jButtontelefono_celularResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionResponsableBusqueda")) {
				this.jButtondireccionResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("faxResponsableBusqueda")) {
				this.jButtonfaxResponsableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionResponsableBusqueda")) {
				this.jButtonobservacionResponsableBusquedaActionPerformed(evt);
			}
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessResponsable();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameResponsable")) {
				closingInternalFrameResponsable();
				
			} else if(sTipo.equals("jButtonCancelarResponsable")) {
				JInternalFrameBase jInternalFrameDetalleFormResponsable = (JInternalFrameBase)evt.getSource();
	            	
	            ResponsableBeanSwingJInternalFrame jInternalFrameParent=(ResponsableBeanSwingJInternalFrame)jInternalFrameDetalleFormResponsable.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarResponsableActionPerformed(null);
			}
			
			ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.responsable,new Object(),this.responsableParameterGeneral,this.responsableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormResponsable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormResponsable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormResponsable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.responsable)) {
			if(!esControlTabla) {
				if(ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);			
				}
				
				if(this.responsableSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualResponsable(this.responsable,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.responsableReturnGeneral=responsableLogic.procesarEventosResponsablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsableLogic.getResponsables(),this.responsable,this.responsableParameterGeneral,this.isEsNuevoResponsable,classes);//this.responsableLogic.getResponsable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanResponsable(this.responsableReturnGeneral,this.responsableBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.responsableSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanResponsable(classes,this.responsableReturnGeneral,this.responsableBean,false);
					}
						
					if(this.responsableReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyResponsable(this.responsableReturnGeneral.getResponsable());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioResponsable(this.responsableReturnGeneral.getResponsable());	
					}
						
					if(this.responsableReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioResponsable(this.responsableReturnGeneral.getResponsable(),classes);//this.responsableBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioResponsable(this.responsable,classes);//this.responsableBean);									
				}
			
				if(ResponsableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualResponsable(this.responsable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsable(this.responsable);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.responsableAnterior!=null) {
						this.responsable=this.responsableAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.responsableReturnGeneral=responsableLogic.procesarEventosResponsablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsableLogic.getResponsables(),this.responsable,this.responsableParameterGeneral,this.isEsNuevoResponsable,classes);//this.responsableLogic.getResponsable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.responsableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.responsableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.responsableReturnGeneral.getResponsable(),responsableLogic.getResponsables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.responsableReturnGeneral.getResponsable(),this.responsables);
				}
				//ARCHITECTURE
				
				//this.jTableDatosResponsable.repaint();
				
				//((AbstractTableModel) this.jTableDatosResponsable.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosResponsable();
			}
		}
	}
	
	public void actualizarVisualTableDatosResponsable() throws Exception {
		
		ResponsableModel responsableModel=(ResponsableModel)this.jTableDatosResponsable.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsableModel.responsables=this.responsableLogic.getResponsables();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			responsableModel.responsables=this.responsables;
		}
		
		
		((ResponsableModel) this.jTableDatosResponsable.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaResponsable() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getresponsableAnterior(),this.responsableLogic.getResponsables());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getresponsableAnterior(),this.responsables);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosResponsable();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioResponsable(Responsable responsable,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Factura.class)) {
					this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(responsable.getFacturas());
					this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Consignacion.class)) {
					this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(responsable.getConsignacions());
					this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Pedido.class)) {
					this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(responsable.getPedidos());
					this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(responsable.getPedidoExpors());
					this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(responsable.getNotaCreditoSolis());
					this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
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
										
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsable,new Object(),generalEntityParameterGeneral,this.responsableReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.responsableSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ResponsableConstantesFunciones.getClassesRelationshipsOfResponsable(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ResponsableConstantesFunciones.getClassesRelationshipsFromStringsOfResponsable(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormResponsable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ResponsableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsable,new Object(),generalEntityParameterGeneral,this.responsableReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioResponsable(ResponsableBean responsableBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Factura.class)) {
					this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(responsable.getFacturas());
					this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Consignacion.class)) {
					this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(responsable.getConsignacions());
					this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Pedido.class)) {
					this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(responsable.getPedidos());
					this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(responsable.getPedidoExpors());
					this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(responsable.getNotaCreditoSolis());
					this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanResponsable(ArrayList<Classe> classes,ResponsableReturnGeneral responsableReturnGeneral,ResponsableBean responsableBean,Boolean conDefault) throws Exception {
		
			this.responsableBean.setFacturas(responsableReturnGeneral.getResponsable().getFacturas());
			this.responsableBean.setConsignacions(responsableReturnGeneral.getResponsable().getConsignacions());
			this.responsableBean.setPedidos(responsableReturnGeneral.getResponsable().getPedidos());
			this.responsableBean.setPedidoExpors(responsableReturnGeneral.getResponsable().getPedidoExpors());
			this.responsableBean.setNotaCreditoSolis(responsableReturnGeneral.getResponsable().getNotaCreditoSolis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualResponsable(Responsable responsable,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Factura.class)) {
					responsable.setFacturas(this.jInternalFrameDetalleFormResponsable.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Consignacion.class)) {
					responsable.setConsignacions(this.jInternalFrameDetalleFormResponsable.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Pedido.class)) {
					responsable.setPedidos(this.jInternalFrameDetalleFormResponsable.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					responsable.setPedidoExpors(this.jInternalFrameDetalleFormResponsable.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoSoli.class)) {
					responsable.setNotaCreditoSolis(this.jInternalFrameDetalleFormResponsable.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.responsable)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormResponsable = new ResponsableDetalleFormJInternalFrame(jDesktopPane,this.responsableSessionBean.getConGuardarRelaciones(),this.responsableSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormResponsable);
		this.jInternalFrameDetalleFormResponsable.setVisible(false);
		this.jInternalFrameDetalleFormResponsable.setSelected(false);						
		
		this.jInternalFrameDetalleFormResponsable.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormResponsable.responsableLogic=this.responsableLogic;
		
		this.cargarCombosFrameForeignKeyResponsable("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleResponsable();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResponsable();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyResponsable("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyResponsable();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormResponsable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResponsable"));
		
		this.jInternalFrameDetalleFormResponsable.jButtonModificarResponsable.addActionListener(new ButtonActionListener(this,"ModificarResponsable"));

		
		this.jInternalFrameDetalleFormResponsable.jButtonModificarToolBarResponsable.addActionListener(new ButtonActionListener(this,"ModificarToolBarResponsable"));
					
		this.jInternalFrameDetalleFormResponsable.jMenuItemModificarResponsable.addActionListener(new ButtonActionListener(this,"MenuItemModificarResponsable"));		
		
		
		
		this.jInternalFrameDetalleFormResponsable.jButtonActualizarResponsable.addActionListener (new ButtonActionListener(this,"ActualizarResponsable"));
		
		
		this.jInternalFrameDetalleFormResponsable.jButtonActualizarToolBarResponsable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResponsable"));
						
		this.jInternalFrameDetalleFormResponsable.jMenuItemActualizarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResponsable"));		
		
		
		
		this.jInternalFrameDetalleFormResponsable.jButtonEliminarResponsable.addActionListener (new ButtonActionListener(this,"EliminarResponsable"));
		
		
		this.jInternalFrameDetalleFormResponsable.jButtonEliminarToolBarResponsable.addActionListener (new ButtonActionListener(this,"EliminarToolBarResponsable"));
								
		this.jInternalFrameDetalleFormResponsable.jMenuItemEliminarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResponsable"));		
		
		
		
		this.jInternalFrameDetalleFormResponsable.jButtonCancelarResponsable.addActionListener (new ButtonActionListener(this,"CancelarResponsable"));
		
		
		this.jInternalFrameDetalleFormResponsable.jButtonCancelarToolBarResponsable.addActionListener (new ButtonActionListener(this,"CancelarToolBarResponsable"));
					
		this.jInternalFrameDetalleFormResponsable.jMenuItemCancelarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResponsable"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormResponsable.jMenuItemDetalleCerrarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResponsable"));		
		
		
		
		this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosToolBarResponsable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsable"));
		
		
		
		this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosToolBarResponsable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsable"));
		
		
		
		this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResponsable"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonidResponsableBusqueda.addActionListener(new ButtonActionListener(this,"idResponsableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_empresaResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_empresaResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_sucursalResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_sucursalResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableBusqueda"));
		//jButtonid_clienteResponsable.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteResponsableActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsable.addActionListener(new ButtonActionListener(this,"id_clienteResponsable"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_clienteResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteResponsableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_usuarioResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_usuarioResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonidentificacionResponsableBusqueda.addActionListener(new ButtonActionListener(this,"identificacionResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonrucResponsableBusqueda.addActionListener(new ButtonActionListener(this,"rucResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonnombreResponsableBusqueda.addActionListener(new ButtonActionListener(this,"nombreResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonapellidoResponsableBusqueda.addActionListener(new ButtonActionListener(this,"apellidoResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonnombre_completoResponsableBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonemailResponsableBusqueda.addActionListener(new ButtonActionListener(this,"emailResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtontelefonoResponsableBusqueda.addActionListener(new ButtonActionListener(this,"telefonoResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtontelefono_celularResponsableBusqueda.addActionListener(new ButtonActionListener(this,"telefono_celularResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtondireccionResponsableBusqueda.addActionListener(new ButtonActionListener(this,"direccionResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonfaxResponsableBusqueda.addActionListener(new ButtonActionListener(this,"faxResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonobservacionResponsableBusqueda.addActionListener(new ButtonActionListener(this,"observacionResponsableBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResponsable"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameResponsable"));
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResponsable"));
		}
		
		this.jTableDatosResponsable.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarResponsable"));
		
		this.jTableDatosResponsable.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarResponsable"));
		
		this.jButtonNuevoResponsable.addActionListener(new ButtonActionListener(this,"NuevoResponsable"));
		
		this.jButtonDuplicarResponsable.addActionListener(new ButtonActionListener(this,"DuplicarResponsable"));
		
		this.jButtonCopiarResponsable.addActionListener(new ButtonActionListener(this,"CopiarResponsable"));
		
		this.jButtonVerFormResponsable.addActionListener(new ButtonActionListener(this,"VerFormResponsable"));
		
		
		this.jButtonNuevoToolBarResponsable.addActionListener(new ButtonActionListener(this,"NuevoToolBarResponsable"));
			
		this.jButtonDuplicarToolBarResponsable.addActionListener(new ButtonActionListener(this,"DuplicarToolBarResponsable"));
			
		this.jMenuItemNuevoResponsable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoResponsable"));
			
		this.jMenuItemDuplicarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarResponsable"));		
		
		
		this.jButtonNuevoRelacionesResponsable.addActionListener (new ButtonActionListener(this,"NuevoRelacionesResponsable"));
		
		
		this.jButtonNuevoRelacionesToolBarResponsable.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarResponsable"));
			
		this.jMenuItemNuevoRelacionesResponsable.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesResponsable"));		
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonModificarResponsable.addActionListener(new ButtonActionListener(this,"ModificarResponsable"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonModificarToolBarResponsable.addActionListener(new ButtonActionListener(this,"ModificarToolBarResponsable"));
			
			this.jInternalFrameDetalleFormResponsable.jMenuItemModificarResponsable.addActionListener(new ButtonActionListener(this,"MenuItemModificarResponsable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormResponsable.jButtonActualizarResponsable.addActionListener (new ButtonActionListener(this,"ActualizarResponsable"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonActualizarToolBarResponsable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResponsable"));
				
			this.jInternalFrameDetalleFormResponsable.jMenuItemActualizarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResponsable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonEliminarResponsable.addActionListener (new ButtonActionListener(this,"EliminarResponsable"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonEliminarToolBarResponsable.addActionListener (new ButtonActionListener(this,"EliminarToolBarResponsable"));
						
			this.jInternalFrameDetalleFormResponsable.jMenuItemEliminarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResponsable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonCancelarResponsable.addActionListener (new ButtonActionListener(this,"CancelarResponsable"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonCancelarToolBarResponsable.addActionListener (new ButtonActionListener(this,"CancelarToolBarResponsable"));
			
			this.jInternalFrameDetalleFormResponsable.jMenuItemCancelarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResponsable"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarResponsable.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarResponsable"));		
		
		
		this.jButtonCerrarResponsable.addActionListener (new ButtonActionListener(this,"CerrarResponsable"));
		
		
		this.jButtonCerrarToolBarResponsable.addActionListener (new ButtonActionListener(this,"CerrarToolBarResponsable"));
			
		this.jMenuItemCerrarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemCerrarResponsable"));
			
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jMenuItemDetalleCerrarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResponsable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosResponsable.addActionListener (new ButtonActionListener(this,"GuardarCambiosResponsable"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosToolBarResponsable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsable"));
		}
		
		this.jButtonCopiarToolBarResponsable.addActionListener (new ButtonActionListener(this,"CopiarToolBarResponsable"));
			
		this.jButtonVerFormToolBarResponsable.addActionListener (new ButtonActionListener(this,"VerFormToolBarResponsable"));
		
		this.jMenuItemGuardarCambiosResponsable.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosResponsable"));
			
		this.jMenuItemCopiarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemCopiarResponsable"));		
		
		this.jMenuItemVerFormResponsable.addActionListener (new ButtonActionListener(this,"MenuItemVerFormResponsable"));		
		
		
		this.jButtonGuardarCambiosTablaResponsable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResponsable"));
		
		
		this.jButtonGuardarCambiosTablaToolBarResponsable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarResponsable"));
			
		this.jMenuItemGuardarCambiosTablaResponsable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResponsable"));		
		
		
		
		this.jButtonRecargarInformacionResponsable.addActionListener (new ButtonActionListener(this,"RecargarInformacionResponsable"));
					
		this.jButtonRecargarInformacionToolBarResponsable.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarResponsable"));
		
		this.jMenuItemRecargarInformacionResponsable.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionResponsable"));		
		
		
		
		this.jButtonAnterioresResponsable.addActionListener (new ButtonActionListener(this,"AnterioresResponsable"));
		
		
		this.jButtonAnterioresToolBarResponsable.addActionListener (new ButtonActionListener(this,"AnterioresToolBarResponsable"));
		
		this.jMenuItemAnterioresResponsable.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresResponsable"));		
		
		
		this.jButtonSiguientesResponsable.addActionListener (new ButtonActionListener(this,"SiguientesResponsable"));
		
		
		this.jButtonSiguientesToolBarResponsable.addActionListener (new ButtonActionListener(this,"SiguientesToolBarResponsable"));
			
		this.jMenuItemSiguientesResponsable.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesResponsable"));
			
		this.jMenuItemAbrirOrderByResponsable.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByResponsable"));
			
		this.jMenuItemMostrarOcultarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarResponsable"));
			
		this.jMenuItemDetalleAbrirOrderByResponsable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByResponsable"));
			
		this.jMenuItemDetalleMostarOcultarResponsable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarResponsable"));		
		
		
		this.jButtonNuevoGuardarCambiosResponsable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosResponsable"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarResponsable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarResponsable"));
			
		this.jMenuItemNuevoGuardarCambiosResponsable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosResponsable"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosResponsable.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosResponsable"));

		this.jCheckBoxSeleccionadosResponsable.addItemListener(new CheckBoxItemListener(this,"SeleccionadosResponsable"));
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResponsable"));
		}
		
		
		this.jComboBoxTiposRelacionesResponsable.addActionListener (new ButtonActionListener(this,"TiposRelacionesResponsable"));
			
		this.jComboBoxTiposAccionesResponsable.addActionListener (new ButtonActionListener(this,"TiposAccionesResponsable"));
					
		this.jComboBoxTiposSeleccionarResponsable.addActionListener (new ButtonActionListener(this,"TiposSeleccionarResponsable"));
			
		this.jTextFieldValorCampoGeneralResponsable.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralResponsable"));		
		
		
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonidResponsableBusqueda.addActionListener(new ButtonActionListener(this,"idResponsableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_empresaResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_empresaResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_sucursalResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_sucursalResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableBusqueda"));
		//jButtonid_clienteResponsable.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteResponsableActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsable.addActionListener(new ButtonActionListener(this,"id_clienteResponsable"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_clienteResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteResponsableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_usuarioResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_usuarioResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonidentificacionResponsableBusqueda.addActionListener(new ButtonActionListener(this,"identificacionResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonrucResponsableBusqueda.addActionListener(new ButtonActionListener(this,"rucResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonnombreResponsableBusqueda.addActionListener(new ButtonActionListener(this,"nombreResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonapellidoResponsableBusqueda.addActionListener(new ButtonActionListener(this,"apellidoResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonnombre_completoResponsableBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonemailResponsableBusqueda.addActionListener(new ButtonActionListener(this,"emailResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtontelefonoResponsableBusqueda.addActionListener(new ButtonActionListener(this,"telefonoResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtontelefono_celularResponsableBusqueda.addActionListener(new ButtonActionListener(this,"telefono_celularResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtondireccionResponsableBusqueda.addActionListener(new ButtonActionListener(this,"direccionResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonfaxResponsableBusqueda.addActionListener(new ButtonActionListener(this,"faxResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonobservacionResponsableBusqueda.addActionListener(new ButtonActionListener(this,"observacionResponsableBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdentificacionResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorIdentificacionResponsable"));

			this.jButtonBusquedaPorNombreCompletoResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCompletoResponsable"));

			this.jButtonBusquedaPorRucResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorRucResponsable"));

			this.jButtonBusquedaPorTelefonoResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorTelefonoResponsable"));

			this.jButtonBusquedaPorTelefonoCelularResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorTelefonoCelularResponsable"));

			this.jButtonFK_IdClienteResponsable.addActionListener(new ButtonActionListener(this,"FK_IdClienteResponsable"));

			this.jButtonBuscarFK_IdClienteid_clienteResponsable.addActionListener(new ButtonActionListener(this,"id_clienteResponsable"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoResponsable!=null) {
				this.jInternalFrameReporteDinamicoResponsable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsable"));
				this.jInternalFrameReporteDinamicoResponsable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsable"));
				this.jInternalFrameReporteDinamicoResponsable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsable"));
			}
			
			//this.jButtonCerrarReporteDinamicoResponsable.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsable"));				
			//this.jButtonGenerarReporteDinamicoResponsable.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsable"));
			//this.jButtonGenerarExcelReporteDinamicoResponsable.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsable"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionResponsable!=null) {
				this.jInternalFrameImportacionResponsable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResponsable"));
				this.jInternalFrameImportacionResponsable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResponsable"));
				this.jInternalFrameImportacionResponsable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResponsable"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByResponsable.addActionListener (new ButtonActionListener(this,"AbrirOrderByResponsable"));
			
			this.jButtonAbrirOrderByToolBarResponsable.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarResponsable"));			
			
			if(this.jInternalFrameOrderByResponsable!=null) {
				this.jInternalFrameOrderByResponsable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResponsable"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormResponsable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsable.jTabbedPaneRelacionesResponsable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResponsable"));
		
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
            		closingInternalFrameResponsable();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormResponsable.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormResponsable = (JInternalFrameBase)event.getSource();
	            	
	            ResponsableBeanSwingJInternalFrame jInternalFrameParent=(ResponsableBeanSwingJInternalFrame)jInternalFrameDetalleFormResponsable.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarResponsableActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosResponsable.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosResponsableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosResponsable.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosResponsable.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoResponsable";
		inputMap = this.jButtonNuevoResponsable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoResponsable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResponsableActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesResponsable";
		inputMap = this.jButtonNuevoRelacionesResponsable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesResponsable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResponsableActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarResponsable";
		inputMap = this.jButtonModificarResponsable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarResponsable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarResponsableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarResponsable";
		inputMap = this.jButtonActualizarResponsable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarResponsable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarResponsableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarResponsable";
		inputMap = this.jButtonEliminarResponsable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarResponsable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarResponsableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarResponsable";
		inputMap = this.jButtonCancelarResponsable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarResponsable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarResponsableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarResponsable";
		inputMap = this.jButtonCerrarResponsable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarResponsable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarResponsableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosResponsable";
		inputMap = this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosResponsable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormResponsable.jButtonGuardarCambiosResponsable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosResponsableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosResponsable.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosResponsableItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesResponsable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesResponsableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarResponsable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarResponsableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralResponsable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralResponsableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonidResponsableBusqueda.addActionListener(new ButtonActionListener(this,"idResponsableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_empresaResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_empresaResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_sucursalResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_sucursalResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableBusqueda"));
		//jButtonid_clienteResponsable.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteResponsableActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsable.addActionListener(new ButtonActionListener(this,"id_clienteResponsable"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_clienteResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteResponsableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsable.jButtonid_usuarioResponsableUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioResponsableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonid_usuarioResponsableBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonidentificacionResponsableBusqueda.addActionListener(new ButtonActionListener(this,"identificacionResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonrucResponsableBusqueda.addActionListener(new ButtonActionListener(this,"rucResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonnombreResponsableBusqueda.addActionListener(new ButtonActionListener(this,"nombreResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonapellidoResponsableBusqueda.addActionListener(new ButtonActionListener(this,"apellidoResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonnombre_completoResponsableBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonemailResponsableBusqueda.addActionListener(new ButtonActionListener(this,"emailResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtontelefonoResponsableBusqueda.addActionListener(new ButtonActionListener(this,"telefonoResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtontelefono_celularResponsableBusqueda.addActionListener(new ButtonActionListener(this,"telefono_celularResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtondireccionResponsableBusqueda.addActionListener(new ButtonActionListener(this,"direccionResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonfaxResponsableBusqueda.addActionListener(new ButtonActionListener(this,"faxResponsableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsable.jButtonobservacionResponsableBusqueda.addActionListener(new ButtonActionListener(this,"observacionResponsableBusqueda"));
		
		
		this.jButtonBusquedaPorIdentificacionResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorIdentificacionResponsable"));

		this.jButtonBusquedaPorNombreCompletoResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCompletoResponsable"));

		this.jButtonBusquedaPorRucResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorRucResponsable"));

		this.jButtonBusquedaPorTelefonoResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorTelefonoResponsable"));

		this.jButtonBusquedaPorTelefonoCelularResponsable.addActionListener(new ButtonActionListener(this,"BusquedaPorTelefonoCelularResponsable"));

		this.jButtonFK_IdClienteResponsable.addActionListener(new ButtonActionListener(this,"FK_IdClienteResponsable"));

		this.jButtonBuscarFK_IdClienteid_clienteResponsable.addActionListener(new ButtonActionListener(this,"id_clienteResponsable"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionResponsable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionResponsableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarResponsableActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarResponsable.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosResponsable(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Responsable responsableAux:this.responsableLogic.getResponsables()) {
					responsableAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Responsable responsableAux:responsables) {
					responsableAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosResponsableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResponsable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Responsable responsableAux:this.responsableLogic.getResponsables()) {
						responsableAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Responsable responsableAux:responsables) {
						responsableAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Responsable responsableAux:this.responsableLogic.getResponsables()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Responsable responsableAux:responsables) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaResponsable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResponsable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResponsable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResponsable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosResponsableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResponsable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosResponsable.getSelectedRows();
			
			Responsable responsableLocal=new Responsable();
			
			//this.seleccionarTodosResponsable(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableLocal =(Responsable) this.responsableLogic.getResponsables().toArray()[this.jTableDatosResponsable.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					responsableLocal =(Responsable) this.responsables.toArray()[this.jTableDatosResponsable.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				responsableLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Responsable responsableAux:this.responsableLogic.getResponsables()) {
						responsableAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Responsable responsableAux:responsables) {
						responsableAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaResponsable(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResponsable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResponsable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResponsable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualResponsableItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarResponsableParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralResponsableActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingResponsable(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralResponsable.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Responsable responsableAux:this.responsableLogic.getResponsables()) {
				
						if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							responsableAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_RUC)) {
							existe=true;
							responsableAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							responsableAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							responsableAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							responsableAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							responsableAux.setemail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							responsableAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR)) {
							existe=true;
							responsableAux.settelefono_celular(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							responsableAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_FAX)) {
							existe=true;
							responsableAux.setfax(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							responsableAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Responsable responsableAux:responsables) {
					
						if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							responsableAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_RUC)) {
							existe=true;
							responsableAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							responsableAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							responsableAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							responsableAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							responsableAux.setemail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							responsableAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR)) {
							existe=true;
							responsableAux.settelefono_celular(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							responsableAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_FAX)) {
							existe=true;
							responsableAux.setfax(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							responsableAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaResponsable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesResponsableActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingResponsable(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioResponsable=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesResponsable.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteResponsable) {				
					conSplash=true;//false;										
					
					//this.startProcessResponsable(conSplash);
				
					this.generarReporteResponsablesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoResponsablesSeleccionados();
				//this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResponsablesSeleccionados(false);
				//this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResponsablesSeleccionados(true);
				//this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResponsable();
				
				this.exportarResponsablesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionResponsables();
				//this.importarResponsables();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResponsable();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelResponsablesSeleccionados();
				//this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Responsable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessResponsable();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoResponsable)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyResponsable(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.setSelectedIndex(0);					
				}	
			} 			
			else if(ResponsableBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteResponsable) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessResponsable(conSplash);
					
						//this.actualizarParametrosGeneralResponsable();
						
						this.generarReporteProcesoAccionResponsablesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ResponsableBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ResponsableS SELECCIONADOS?", "MANTENIMIENTO DE Responsable", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessResponsable();
				
						this.actualizarParametrosGeneralResponsable();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.responsableReturnGeneral=responsableLogic.procesarAccionResponsablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.responsableLogic.getResponsables(),this.responsableParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarResponsableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralResponsable();
					
					ResponsableBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarResponsableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResponsable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResponsable.jComboBoxTiposAccionesFormularioResponsable.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessResponsable(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesResponsableActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessResponsable();
			
			if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();		
			Responsable responsable=new Responsable();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingResponsable(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesResponsable.getSelectedItem();
			
			
			
			
			responsablesSeleccionados=this.getResponsablesSeleccionados(true);
			//this.sTipoAccion;
			
			if(responsablesSeleccionados.size()==1) {
				for(Responsable responsableAux:responsablesSeleccionados) {
					responsable=responsableAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Factura")) {
					jButtonFacturaActionPerformed(null,rowIndex,true,false,responsable);
				}
				else if(this.sTipoRelacion.equals("Consignacion")) {
					jButtonConsignacionActionPerformed(null,rowIndex,true,false,responsable);
				}
				else if(this.sTipoRelacion.equals("Pedido")) {
					jButtonPedidoActionPerformed(null,rowIndex,true,false,responsable);
				}
				else if(this.sTipoRelacion.equals("Pedido Exportacion")) {
					jButtonPedidoExporActionPerformed(null,rowIndex,true,false,responsable);
				}
				else if(this.sTipoRelacion.equals("Solicitud Nota Credito")) {
					jButtonNotaCreditoSoliActionPerformed(null,rowIndex,true,false,responsable);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessResponsable();
			
      		//this.finishProcessResponsable(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarResponsableReturnGeneral() throws Exception {
		if(this.responsableReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.responsableReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.responsableReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.responsableReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.responsableReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.responsableReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingResponsable(false);
		}
		
		if(this.responsableReturnGeneral.getConRetornoLista() || this.responsableReturnGeneral.getConRetornoObjeto()) {
			if(this.responsableReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.responsableLogic.setResponsables(this.responsableReturnGeneral.getResponsables());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.responsableReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.responsableLogic.setResponsable(this.responsableReturnGeneral.getResponsable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingResponsable(false);
		}
	}
	
	public void actualizarParametrosGeneralResponsable() throws Exception {
		
		
	}
	
	public ArrayList<Responsable> getResponsablesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioResponsable) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Responsable responsableAux:responsableLogic.getResponsables()) {
					if(responsableAux.getIsSelected()) {
						responsablesSeleccionados.add(responsableAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Responsable responsableAux:this.responsables) {
					if(responsableAux.getIsSelected()) {
						responsablesSeleccionados.add(responsableAux);				
					}
				}
			}
			
			if(responsablesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						responsablesSeleccionados.addAll(this.responsableLogic.getResponsables());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						responsablesSeleccionados.addAll(this.responsables);				
					}
				}
			}
		} else {
			responsablesSeleccionados.add(this.responsable);
		}
		
		return responsablesSeleccionados;
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
	
	public void generarReporteResponsablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalResponsablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoResponsablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResponsablesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResponsablesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesResponsablesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Responsable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesResponsablesSeleccionados() throws Exception {
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();		
		
		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteResponsables("Todos",responsablesSeleccionados);
		
	}	
	
	public void generarReporteNormalResponsablesSeleccionados() throws Exception {
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();		
		
		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteResponsables("Todos",responsablesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionResponsablesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();
		
		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteResponsables("Todos",responsablesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoResponsablesSeleccionados() throws Exception {
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();		
		
		
		this.abrirInicializarFrameReporteDinamicoResponsable();
		
		
		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoResponsable();
		
		
		//this.generarReporteResponsables("Todos",responsablesSeleccionados ,responsableImplementable,responsableImplementableHome);
	}
	
	public void mostrarImportacionResponsables() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionResponsable();
		
		this.abrirFrameImportacionResponsable();		
		
			
		//this.generarReporteResponsables("Todos",responsablesSeleccionados ,responsableImplementable,responsableImplementableHome);
	}
	
	public void importarResponsables() throws Exception {		
	
	}
	
	public void exportarResponsablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelResponsablesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoResponsablesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlResponsablesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Responsable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoResponsablesSeleccionados() throws Exception {
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();		
		
		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsable."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarResponsable(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Responsable responsableAux:responsablesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarResponsable(responsableAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//responsableAux.setsDetalleGeneralEntityReporte(responsableAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarResponsable(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_IDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_FAX;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarResponsable(Responsable responsable,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=responsable.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getidentificacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getemail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.gettelefono_celular();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getfax();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsable.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelResponsablesSeleccionados() throws Exception {
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();		
		
		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsable.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Responsables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelResponsable(row);				
				iRow++;
			}				
			
			for(Responsable responsableAux:responsablesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelResponsable(responsableAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlResponsablesSeleccionados() throws Exception {
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();		
		
		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsable.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("responsables");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("responsable");
			//elementRoot.appendChild(element);
		
			for(Responsable responsableAux:responsablesSeleccionados) {
				element = document.createElement("responsable");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlResponsable(responsableAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelResponsable(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_IDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_FAX);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelResponsable(Responsable responsable,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getidentificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getemail());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.gettelefono_celular());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getfax());
		cell = row.createCell(iColumn++);cell.setCellValue(responsable.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlResponsable(Responsable responsable,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ResponsableConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(responsable.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ResponsableConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(responsable.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ResponsableConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(responsable.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ResponsableConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(responsable.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(ResponsableConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(responsable.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementusuario_descripcion = document.createElement(ResponsableConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(responsable.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementidentificacion = document.createElement(ResponsableConstantesFunciones.IDENTIFICACION);
		elementidentificacion.appendChild(document.createTextNode(responsable.getidentificacion().trim()));
		element.appendChild(elementidentificacion);

		Element elementruc = document.createElement(ResponsableConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(responsable.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnombre = document.createElement(ResponsableConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(responsable.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementapellido = document.createElement(ResponsableConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(responsable.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementnombre_completo = document.createElement(ResponsableConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(responsable.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementemail = document.createElement(ResponsableConstantesFunciones.EMAIL);
		elementemail.appendChild(document.createTextNode(responsable.getemail().trim()));
		element.appendChild(elementemail);

		Element elementtelefono = document.createElement(ResponsableConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(responsable.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementtelefono_celular = document.createElement(ResponsableConstantesFunciones.TELEFONOCELULAR);
		elementtelefono_celular.appendChild(document.createTextNode(responsable.gettelefono_celular().trim()));
		element.appendChild(elementtelefono_celular);

		Element elementdireccion = document.createElement(ResponsableConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(responsable.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementfax = document.createElement(ResponsableConstantesFunciones.FAX);
		elementfax.appendChild(document.createTextNode(responsable.getfax().trim()));
		element.appendChild(elementfax);

		Element elementobservacion = document.createElement(ResponsableConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(responsable.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoResponsablesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Responsable> responsablesSeleccionados=new ArrayList<Responsable>();
		
		responsablesSeleccionados=this.getResponsablesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoResponsable(responsablesSeleccionados);
		
		this.generarReporteResponsables("Todos",responsablesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoResponsable(ArrayList<Responsable> responsablesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Responsable responsableAux:responsablesSeleccionados) {
				responsableAux.setsDetalleGeneralEntityReporte(responsableAux.toString());
			
				if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_IDENTIFICACION)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getidentificacion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_RUC)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getemail());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.gettelefono_celular());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_FAX)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getfax());
				}
				 else if(sTipoSeleccionar.equals(ResponsableConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					responsableAux.setsDescripcionGeneralEntityReporte1(responsableAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesResponsable(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoResponsable=true;
				this.isVisibilidadCeldaNuevoRelacionesResponsable=true;
				this.isVisibilidadCeldaGuardarCambiosResponsable=true;
			}
			
			this.isVisibilidadCeldaModificarResponsable=false;
			this.isVisibilidadCeldaActualizarResponsable=false;
			this.isVisibilidadCeldaEliminarResponsable=false;
			this.isVisibilidadCeldaCancelarResponsable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsable=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsable=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoResponsable=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsable=false;
			this.isVisibilidadCeldaGuardarCambiosResponsable=false;
			this.isVisibilidadCeldaModificarResponsable=false;
			this.isVisibilidadCeldaActualizarResponsable=true;
			this.isVisibilidadCeldaEliminarResponsable=false;
			this.isVisibilidadCeldaCancelarResponsable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsable=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsable=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoResponsable=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsable=false;
			this.isVisibilidadCeldaGuardarCambiosResponsable=false;
			this.isVisibilidadCeldaModificarResponsable=false;
			this.isVisibilidadCeldaActualizarResponsable=true;
			this.isVisibilidadCeldaEliminarResponsable=true;
			this.isVisibilidadCeldaCancelarResponsable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsable=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsable=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoResponsable=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsable=false;
			this.isVisibilidadCeldaGuardarCambiosResponsable=false;
			this.isVisibilidadCeldaModificarResponsable=false;
			this.isVisibilidadCeldaActualizarResponsable=true;
			this.isVisibilidadCeldaEliminarResponsable=false;
			this.isVisibilidadCeldaCancelarResponsable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsable=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsable=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoResponsable=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsable=true;
			this.isVisibilidadCeldaGuardarCambiosResponsable=true;
			this.isVisibilidadCeldaModificarResponsable=false;
			this.isVisibilidadCeldaActualizarResponsable=false;
			this.isVisibilidadCeldaEliminarResponsable=false;
			this.isVisibilidadCeldaCancelarResponsable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsable=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsable=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoResponsable=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsable=false;
			this.isVisibilidadCeldaGuardarCambiosResponsable=false;
			this.isVisibilidadCeldaActualizarResponsable=false;
			this.isVisibilidadCeldaEliminarResponsable=false;
			this.isVisibilidadCeldaCancelarResponsable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsable=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsable=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoResponsable=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsable=false;
			this.isVisibilidadCeldaGuardarCambiosResponsable=false;
			this.isVisibilidadCeldaModificarResponsable=true;
			this.isVisibilidadCeldaActualizarResponsable=false;
			this.isVisibilidadCeldaEliminarResponsable=false;
			this.isVisibilidadCeldaCancelarResponsable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsable=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsable=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ResponsableJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoResponsable=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsable=true;
			this.isVisibilidadCeldaGuardarCambiosResponsable=true;
		} else {
			this.actualizarEstadoPanelsResponsable(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarResponsable=false;
			//this.isVisibilidadCeldaVerFormResponsable=false;
			this.isVisibilidadCeldaDuplicarResponsable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!responsableSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesResponsable=false;
		} else {
			this.isVisibilidadCeldaNuevoResponsable=false;
			this.isVisibilidadCeldaGuardarCambiosResponsable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(responsableSessionBean.getEsGuardarRelacionado()) {
			if(!responsableSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesResponsable=false;												
			}
			
			this.jButtonCerrarResponsable.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesResponsable=false;
		}
		
		if(!this.permiteMantenimiento(this.responsable)) {
			this.isVisibilidadCeldaActualizarResponsable=false;
			this.isVisibilidadCeldaEliminarResponsable=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesResponsable() {
		this.isVisibilidadCeldaNuevoResponsable=false;
		this.isVisibilidadCeldaGuardarCambiosResponsable=false;
	}
	
	public void actualizarEstadoPanelsResponsable(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionResponsable!=null) {
				this.jScrollPanelDatosEdicionResponsable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsable!=null) {
				this.jTabbedPaneBusquedasResponsable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsable!=null) {
				this.jScrollPanelDatosResponsable.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsable!=null) {
				this.jPanelPaginacionResponsable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsable!=null) {
				this.jPanelParametrosReportesResponsable.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionResponsable!=null) {
				this.jScrollPanelDatosEdicionResponsable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsable!=null) {
				this.jTabbedPaneBusquedasResponsable.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosResponsable!=null) {
				this.jScrollPanelDatosResponsable.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsable!=null) {
				this.jPanelPaginacionResponsable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsable!=null) {
				this.jPanelParametrosReportesResponsable.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionResponsable!=null) {
				this.jScrollPanelDatosEdicionResponsable.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsable!=null) {
				this.jTabbedPaneBusquedasResponsable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResponsable!=null) {
				this.jScrollPanelDatosResponsable.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsable!=null) {
				this.jPanelPaginacionResponsable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsable!=null) {
				this.jPanelParametrosReportesResponsable.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionResponsable!=null) {
				this.jScrollPanelDatosEdicionResponsable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsable!=null) {
				this.jTabbedPaneBusquedasResponsable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResponsable!=null) {
				this.jScrollPanelDatosResponsable.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsable!=null) {
				this.jPanelPaginacionResponsable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsable!=null) {
				this.jPanelParametrosReportesResponsable.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionResponsable!=null) {
				this.jScrollPanelDatosEdicionResponsable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsable!=null) {
				this.jTabbedPaneBusquedasResponsable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsable!=null) {
				this.jScrollPanelDatosResponsable.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsable!=null) {
				this.jPanelPaginacionResponsable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsable!=null) {
				this.jPanelParametrosReportesResponsable.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionResponsable!=null) {
				this.jScrollPanelDatosEdicionResponsable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsable!=null) {
				this.jTabbedPaneBusquedasResponsable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsable!=null) {
				this.jScrollPanelDatosResponsable.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsable!=null) {
				this.jPanelPaginacionResponsable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsable!=null) {
				this.jPanelParametrosReportesResponsable.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionResponsable!=null) {
				this.jScrollPanelDatosEdicionResponsable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsable!=null) {
				this.jTabbedPaneBusquedasResponsable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsable!=null) {
				this.jScrollPanelDatosResponsable.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsable!=null) {
				this.jPanelPaginacionResponsable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsable!=null) {
				this.jPanelParametrosReportesResponsable.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.responsableSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasResponsable!=null) {
					this.jTabbedPaneBusquedasResponsable.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesResponsable!=null) {
				this.jPanelParametrosReportesResponsable.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.responsableSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsable!=null) {
				this.jTabbedPaneBusquedasResponsable.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesResponsable!=null) {
				this.jPanelParametrosReportesResponsable.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdentificacion=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdentificacion) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorIdentificacionResponsable);}

			this.isVisibilidadBusquedaPorNombreCompleto=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombreCompleto) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorNombreCompletoResponsable);}

			this.isVisibilidadBusquedaPorRuc=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorRuc) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorRucResponsable);}

			this.isVisibilidadBusquedaPorTelefono=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorTelefonoResponsable);}

			this.isVisibilidadBusquedaPorTelefonoCelular=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorTelefonoCelular) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorTelefonoCelularResponsable);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasResponsable.remove(jPanelFK_IdClienteResponsable);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorIdentificacion=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorIdentificacion) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorIdentificacionResponsable);}

			this.isVisibilidadBusquedaPorNombreCompleto=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNombreCompleto) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorNombreCompletoResponsable);}

			this.isVisibilidadBusquedaPorRuc=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorRuc) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorRucResponsable);}

			this.isVisibilidadBusquedaPorTelefono=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorTelefonoResponsable);}

			this.isVisibilidadBusquedaPorTelefonoCelular=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorTelefonoCelular) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorTelefonoCelularResponsable);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasResponsable.remove(jPanelFK_IdClienteResponsable);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaPorIdentificacion=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorIdentificacion) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorIdentificacionResponsable);}

			this.isVisibilidadBusquedaPorNombreCompleto=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorNombreCompleto) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorNombreCompletoResponsable);}

			this.isVisibilidadBusquedaPorRuc=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorRuc) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorRucResponsable);}

			this.isVisibilidadBusquedaPorTelefono=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorTelefonoResponsable);}

			this.isVisibilidadBusquedaPorTelefonoCelular=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorTelefonoCelular) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorTelefonoCelularResponsable);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasResponsable.remove(jPanelFK_IdClienteResponsable);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadBusquedaPorIdentificacion=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorIdentificacion) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorIdentificacionResponsable);}

			this.isVisibilidadBusquedaPorNombreCompleto=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorNombreCompleto) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorNombreCompletoResponsable);}

			this.isVisibilidadBusquedaPorRuc=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorRuc) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorRucResponsable);}

			this.isVisibilidadBusquedaPorTelefono=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorTelefonoResponsable);}

			this.isVisibilidadBusquedaPorTelefonoCelular=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorTelefonoCelular) {this.jTabbedPaneBusquedasResponsable.remove(jPanelBusquedaPorTelefonoCelularResponsable);}

			this.isVisibilidadFK_IdCliente=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasResponsable.remove(jPanelFK_IdClienteResponsable);}
		}
		
	}
	
	

	public String registrarSesionResponsableParaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(this.jInternalFrameDetalleFormResponsable.facturaSessionBean==null) {
				this.jInternalFrameDetalleFormResponsable.facturaSessionBean=new FacturaSessionBean();
			}

			this.jInternalFrameDetalleFormResponsable.facturaSessionBean.setsPathNavegacionActual(responsableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormResponsable.facturaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFactura=this.jInternalFrameDetalleFormResponsable.facturaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormResponsable.facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			this.jInternalFrameDetalleFormResponsable.facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(ResponsableConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormResponsable.facturaSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
			this.jInternalFrameDetalleFormResponsable.facturaSessionBean.setlidResponsableActual(this.idResponsableActual);

			responsableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyResponsable(true);
			responsableSessionBean.setlIdResponsableActualForeignKey(this.idResponsableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionResponsableParaConsignacions() throws Exception {
		Boolean isPaginaPopupConsignacion=false;

		try {

			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(this.jInternalFrameDetalleFormResponsable.consignacionSessionBean==null) {
				this.jInternalFrameDetalleFormResponsable.consignacionSessionBean=new ConsignacionSessionBean();
			}

			this.jInternalFrameDetalleFormResponsable.consignacionSessionBean.setsPathNavegacionActual(responsableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormResponsable.consignacionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupConsignacion=this.jInternalFrameDetalleFormResponsable.consignacionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormResponsable.consignacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeConsignacion(true);
			this.jInternalFrameDetalleFormResponsable.consignacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeConsignacion(ResponsableConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormResponsable.consignacionSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
			this.jInternalFrameDetalleFormResponsable.consignacionSessionBean.setlidResponsableActual(this.idResponsableActual);

			responsableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyResponsable(true);
			responsableSessionBean.setlIdResponsableActualForeignKey(this.idResponsableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionResponsableParaPedidoExpors() throws Exception {
		Boolean isPaginaPopupPedidoExpor=false;

		try {

			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(this.jInternalFrameDetalleFormResponsable.pedidoexporSessionBean==null) {
				this.jInternalFrameDetalleFormResponsable.pedidoexporSessionBean=new PedidoExporSessionBean();
			}

			this.jInternalFrameDetalleFormResponsable.pedidoexporSessionBean.setsPathNavegacionActual(responsableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormResponsable.pedidoexporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoExpor=this.jInternalFrameDetalleFormResponsable.pedidoexporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormResponsable.pedidoexporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoExpor(true);
			this.jInternalFrameDetalleFormResponsable.pedidoexporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoExpor(ResponsableConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormResponsable.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
			this.jInternalFrameDetalleFormResponsable.pedidoexporSessionBean.setlidResponsableActual(this.idResponsableActual);

			responsableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyResponsable(true);
			responsableSessionBean.setlIdResponsableActualForeignKey(this.idResponsableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionResponsableParaPedidos() throws Exception {
		Boolean isPaginaPopupPedido=false;

		try {

			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(this.jInternalFrameDetalleFormResponsable.pedidoSessionBean==null) {
				this.jInternalFrameDetalleFormResponsable.pedidoSessionBean=new PedidoSessionBean();
			}

			this.jInternalFrameDetalleFormResponsable.pedidoSessionBean.setsPathNavegacionActual(responsableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormResponsable.pedidoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedido=this.jInternalFrameDetalleFormResponsable.pedidoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormResponsable.pedidoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedido(true);
			this.jInternalFrameDetalleFormResponsable.pedidoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedido(ResponsableConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormResponsable.pedidoSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
			this.jInternalFrameDetalleFormResponsable.pedidoSessionBean.setlidResponsableActual(this.idResponsableActual);

			responsableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyResponsable(true);
			responsableSessionBean.setlIdResponsableActualForeignKey(this.idResponsableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionResponsableParaNotaCreditoSolis() throws Exception {
		Boolean isPaginaPopupNotaCreditoSoli=false;

		try {

			if(this.responsableSessionBean==null) {
				this.responsableSessionBean=new ResponsableSessionBean();
			}

			if(this.jInternalFrameDetalleFormResponsable.notacreditosoliSessionBean==null) {
				this.jInternalFrameDetalleFormResponsable.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
			}

			this.jInternalFrameDetalleFormResponsable.notacreditosoliSessionBean.setsPathNavegacionActual(responsableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormResponsable.notacreditosoliSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNotaCreditoSoli=this.jInternalFrameDetalleFormResponsable.notacreditosoliSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormResponsable.notacreditosoliSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoSoli(true);
			this.jInternalFrameDetalleFormResponsable.notacreditosoliSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoSoli(ResponsableConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormResponsable.notacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
			this.jInternalFrameDetalleFormResponsable.notacreditosoliSessionBean.setlidResponsableActual(this.idResponsableActual);

			responsableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyResponsable(true);
			responsableSessionBean.setlIdResponsableActualForeignKey(this.idResponsableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionResponsableParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(responsableSessionBean==null) {
				responsableSessionBean=new ResponsableSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(responsableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.responsableFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ResponsableConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
			//clienteSessionBean.setlidResponsableActual(this.idResponsableActual);

			responsableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyResponsable(true);
			responsableSessionBean.setlIdResponsableActualForeignKey(this.idResponsableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ResponsableSessionBean responsableSessionBean=new ResponsableSessionBean();
		
		if(this.responsableSessionBean==null) {
			this.responsableSessionBean=new ResponsableSessionBean();
		}
		
		this.responsableSessionBean.setsUltimaBusquedaResponsable(this.getsAccionBusqueda());
		this.responsableSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.responsableSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdentificacion")) {
			responsableSessionBean.setidentificacion(this.getidentificacionBusquedaPorIdentificacion());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombreCompleto")) {
			responsableSessionBean.setnombre_completo(this.getnombre_completoBusquedaPorNombreCompleto());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorRuc")) {
			responsableSessionBean.setruc(this.getrucBusquedaPorRuc());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorTelefono")) {
			responsableSessionBean.settelefono(this.gettelefonoBusquedaPorTelefono());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorTelefonoCelular")) {
			responsableSessionBean.settelefono_celular(this.gettelefono_celularBusquedaPorTelefonoCelular());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			responsableSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			responsableSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			responsableSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ResponsableSessionBean responsableSessionBean=new ResponsableSessionBean();
		
		if(this.responsableSessionBean==null) {
			this.responsableSessionBean=new ResponsableSessionBean();
		}
		
		if(this.responsableSessionBean.getsUltimaBusquedaResponsable()!=null&&!this.responsableSessionBean.getsUltimaBusquedaResponsable().equals("")) {
			this.setsAccionBusqueda(responsableSessionBean.getsUltimaBusquedaResponsable());
			this.setiNumeroPaginacion(responsableSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(responsableSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdentificacion")) {
				this.setidentificacionBusquedaPorIdentificacion(responsableSessionBean.getidentificacion());
				responsableSessionBean.setidentificacion("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombreCompleto")) {
				this.setnombre_completoBusquedaPorNombreCompleto(responsableSessionBean.getnombre_completo());
				responsableSessionBean.setnombre_completo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorRuc")) {
				this.setrucBusquedaPorRuc(responsableSessionBean.getruc());
				responsableSessionBean.setruc("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorTelefono")) {
				this.settelefonoBusquedaPorTelefono(responsableSessionBean.gettelefono());
				responsableSessionBean.settelefono("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorTelefonoCelular")) {
				this.settelefono_celularBusquedaPorTelefonoCelular(responsableSessionBean.gettelefono_celular());
				responsableSessionBean.settelefono_celular("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(responsableSessionBean.getid_cliente());
				responsableSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(responsableSessionBean.getid_empresa());
				responsableSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(responsableSessionBean.getid_sucursal());
				responsableSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.responsableSessionBean.setsUltimaBusquedaResponsable("");
		this.responsableSessionBean.setiNumeroPaginacion(ResponsableConstantesFunciones.INUMEROPAGINACION);
		this.responsableSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaResponsable(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioResponsable() {
		this.updateBorderResaltarBusquedasFormularioResponsable();
		this.updateVisibilidadBusquedasFormularioResponsable();
		this.updateHabilitarBusquedasFormularioResponsable();
	}
	
	public void updateBorderResaltarBusquedasFormularioResponsable() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasResponsable.getComponents().length>0) {
	

		if(this.responsableConstantesFunciones.resaltarBusquedaPorIdentificacionResponsable!=null) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorIdentificacionResponsable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorIdentificacionResponsable);
			}
		}

		if(this.responsableConstantesFunciones.resaltarBusquedaPorNombreCompletoResponsable!=null) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorNombreCompletoResponsable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorNombreCompletoResponsable);
			}
		}

		if(this.responsableConstantesFunciones.resaltarBusquedaPorRucResponsable!=null) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorRucResponsable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorRucResponsable);
			}
		}

		if(this.responsableConstantesFunciones.resaltarBusquedaPorTelefonoResponsable!=null) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorTelefonoResponsable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorTelefonoResponsable);
			}
		}

		if(this.responsableConstantesFunciones.resaltarBusquedaPorTelefonoCelularResponsable!=null) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorTelefonoCelularResponsable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorTelefonoCelularResponsable);
			}
		}

		if(this.responsableConstantesFunciones.resaltarFK_IdClienteResponsable!=null) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelFK_IdClienteResponsable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				jPanel.setBorder(this.responsableConstantesFunciones.resaltarFK_IdClienteResponsable);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioResponsable() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasResponsable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorIdentificacionResponsable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsableConstantesFunciones.mostrarBusquedaPorIdentificacionResponsable);
			if(!this.responsableConstantesFunciones.mostrarBusquedaPorIdentificacionResponsable && index>-1) {
				this.jTabbedPaneBusquedasResponsable.remove(index);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorNombreCompletoResponsable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsableConstantesFunciones.mostrarBusquedaPorNombreCompletoResponsable);
			if(!this.responsableConstantesFunciones.mostrarBusquedaPorNombreCompletoResponsable && index>-1) {
				this.jTabbedPaneBusquedasResponsable.remove(index);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorRucResponsable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsableConstantesFunciones.mostrarBusquedaPorRucResponsable);
			if(!this.responsableConstantesFunciones.mostrarBusquedaPorRucResponsable && index>-1) {
				this.jTabbedPaneBusquedasResponsable.remove(index);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorTelefonoResponsable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsableConstantesFunciones.mostrarBusquedaPorTelefonoResponsable);
			if(!this.responsableConstantesFunciones.mostrarBusquedaPorTelefonoResponsable && index>-1) {
				this.jTabbedPaneBusquedasResponsable.remove(index);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorTelefonoCelularResponsable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsableConstantesFunciones.mostrarBusquedaPorTelefonoCelularResponsable);
			if(!this.responsableConstantesFunciones.mostrarBusquedaPorTelefonoCelularResponsable && index>-1) {
				this.jTabbedPaneBusquedasResponsable.remove(index);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelFK_IdClienteResponsable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsableConstantesFunciones.mostrarFK_IdClienteResponsable);
			if(!this.responsableConstantesFunciones.mostrarFK_IdClienteResponsable && index>-1) {
				this.jTabbedPaneBusquedasResponsable.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioResponsable() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasResponsable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorIdentificacionResponsable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsableConstantesFunciones.activarBusquedaPorIdentificacionResponsable);
				this.jTabbedPaneBusquedasResponsable.setEnabledAt(index,this.responsableConstantesFunciones.activarBusquedaPorIdentificacionResponsable);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorNombreCompletoResponsable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsableConstantesFunciones.activarBusquedaPorNombreCompletoResponsable);
				this.jTabbedPaneBusquedasResponsable.setEnabledAt(index,this.responsableConstantesFunciones.activarBusquedaPorNombreCompletoResponsable);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorRucResponsable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsableConstantesFunciones.activarBusquedaPorRucResponsable);
				this.jTabbedPaneBusquedasResponsable.setEnabledAt(index,this.responsableConstantesFunciones.activarBusquedaPorRucResponsable);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorTelefonoResponsable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsableConstantesFunciones.activarBusquedaPorTelefonoResponsable);
				this.jTabbedPaneBusquedasResponsable.setEnabledAt(index,this.responsableConstantesFunciones.activarBusquedaPorTelefonoResponsable);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorTelefonoCelularResponsable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsableConstantesFunciones.activarBusquedaPorTelefonoCelularResponsable);
				this.jTabbedPaneBusquedasResponsable.setEnabledAt(index,this.responsableConstantesFunciones.activarBusquedaPorTelefonoCelularResponsable);
			}

			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelFK_IdClienteResponsable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsableConstantesFunciones.activarFK_IdClienteResponsable);
				this.jTabbedPaneBusquedasResponsable.setEnabledAt(index,this.responsableConstantesFunciones.activarFK_IdClienteResponsable);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaResponsable(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdentificacion")) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorIdentificacionResponsable);

			this.jTabbedPaneBusquedasResponsable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);

			this.responsableConstantesFunciones.setResaltarBusquedaPorIdentificacionResponsable(resaltar);

			jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorIdentificacionResponsable);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombreCompleto")) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorNombreCompletoResponsable);

			this.jTabbedPaneBusquedasResponsable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);

			this.responsableConstantesFunciones.setResaltarBusquedaPorNombreCompletoResponsable(resaltar);

			jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorNombreCompletoResponsable);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorRuc")) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorRucResponsable);

			this.jTabbedPaneBusquedasResponsable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);

			this.responsableConstantesFunciones.setResaltarBusquedaPorRucResponsable(resaltar);

			jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorRucResponsable);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorTelefono")) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorTelefonoResponsable);

			this.jTabbedPaneBusquedasResponsable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);

			this.responsableConstantesFunciones.setResaltarBusquedaPorTelefonoResponsable(resaltar);

			jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorTelefonoResponsable);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorTelefonoCelular")) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelBusquedaPorTelefonoCelularResponsable);

			this.jTabbedPaneBusquedasResponsable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);

			this.responsableConstantesFunciones.setResaltarBusquedaPorTelefonoCelularResponsable(resaltar);

			jPanel.setBorder(this.responsableConstantesFunciones.resaltarBusquedaPorTelefonoCelularResponsable);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasResponsable.indexOfComponent(this.jPanelFK_IdClienteResponsable);

			this.jTabbedPaneBusquedasResponsable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsable.getComponent(index);

			this.responsableConstantesFunciones.setResaltarFK_IdClienteResponsable(resaltar);

			jPanel.setBorder(this.responsableConstantesFunciones.resaltarFK_IdClienteResponsable);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarResponsable.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioResponsable() throws Exception {

		if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioResponsable();
		this.updateVisibilidadResaltarControlesFormularioResponsable();
		this.updateHabilitarResaltarControlesFormularioResponsable();
		
	}
	
	public void updateBorderResaltarControlesFormularioResponsable() throws Exception {
		if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.responsableConstantesFunciones.resaltaridResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.setBorder(this.responsableConstantesFunciones.resaltaridResponsable);}
		if(this.responsableConstantesFunciones.resaltarid_empresaResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.setBorder(this.responsableConstantesFunciones.resaltarid_empresaResponsable);}
		if(this.responsableConstantesFunciones.resaltarid_sucursalResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.setBorder(this.responsableConstantesFunciones.resaltarid_sucursalResponsable);}
		if(this.responsableConstantesFunciones.resaltarid_clienteResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.setBorder(this.responsableConstantesFunciones.resaltarid_clienteResponsable);}
		if(this.responsableConstantesFunciones.resaltarid_usuarioResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.setBorder(this.responsableConstantesFunciones.resaltarid_usuarioResponsable);}
		if(this.responsableConstantesFunciones.resaltaridentificacionResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextFieldidentificacionResponsable.setBorder(this.responsableConstantesFunciones.resaltaridentificacionResponsable);}
		if(this.responsableConstantesFunciones.resaltarrucResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextFieldrucResponsable.setBorder(this.responsableConstantesFunciones.resaltarrucResponsable);}
		if(this.responsableConstantesFunciones.resaltarnombreResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextAreanombreResponsable.setBorder(this.responsableConstantesFunciones.resaltarnombreResponsable);}
		if(this.responsableConstantesFunciones.resaltarapellidoResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextAreaapellidoResponsable.setBorder(this.responsableConstantesFunciones.resaltarapellidoResponsable);}
		if(this.responsableConstantesFunciones.resaltarnombre_completoResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextAreanombre_completoResponsable.setBorder(this.responsableConstantesFunciones.resaltarnombre_completoResponsable);}
		if(this.responsableConstantesFunciones.resaltaremailResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextAreaemailResponsable.setBorder(this.responsableConstantesFunciones.resaltaremailResponsable);}
		if(this.responsableConstantesFunciones.resaltartelefonoResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextFieldtelefonoResponsable.setBorder(this.responsableConstantesFunciones.resaltartelefonoResponsable);}
		if(this.responsableConstantesFunciones.resaltartelefono_celularResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextFieldtelefono_celularResponsable.setBorder(this.responsableConstantesFunciones.resaltartelefono_celularResponsable);}
		if(this.responsableConstantesFunciones.resaltardireccionResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextAreadireccionResponsable.setBorder(this.responsableConstantesFunciones.resaltardireccionResponsable);}
		if(this.responsableConstantesFunciones.resaltarfaxResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextFieldfaxResponsable.setBorder(this.responsableConstantesFunciones.resaltarfaxResponsable);}
		if(this.responsableConstantesFunciones.resaltarobservacionResponsable!=null && this.jInternalFrameDetalleFormResponsable!=null) {this.jInternalFrameDetalleFormResponsable.jTextAreaobservacionResponsable.setBorder(this.responsableConstantesFunciones.resaltarobservacionResponsable);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioResponsable() throws Exception {		
		if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResponsable!=null) {
	
		//this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.setVisible(this.responsableConstantesFunciones.mostraridResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelidResponsable.setVisible(this.responsableConstantesFunciones.mostraridResponsable);
		//this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.setVisible(this.responsableConstantesFunciones.mostrarid_empresaResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelid_empresaResponsable.setVisible(this.responsableConstantesFunciones.mostrarid_empresaResponsable);
		//this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.setVisible(this.responsableConstantesFunciones.mostrarid_sucursalResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelid_sucursalResponsable.setVisible(this.responsableConstantesFunciones.mostrarid_sucursalResponsable);
		//this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.setVisible(this.responsableConstantesFunciones.mostrarid_clienteResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelid_clienteResponsable.setVisible(this.responsableConstantesFunciones.mostrarid_clienteResponsable);
			this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsable.setVisible(this.responsableConstantesFunciones.mostrarid_clienteResponsable);
		//this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.setVisible(this.responsableConstantesFunciones.mostrarid_usuarioResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelid_usuarioResponsable.setVisible(this.responsableConstantesFunciones.mostrarid_usuarioResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextFieldidentificacionResponsable.setVisible(this.responsableConstantesFunciones.mostraridentificacionResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelidentificacionResponsable.setVisible(this.responsableConstantesFunciones.mostraridentificacionResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextFieldrucResponsable.setVisible(this.responsableConstantesFunciones.mostrarrucResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelrucResponsable.setVisible(this.responsableConstantesFunciones.mostrarrucResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextAreanombreResponsable.setVisible(this.responsableConstantesFunciones.mostrarnombreResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelnombreResponsable.setVisible(this.responsableConstantesFunciones.mostrarnombreResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextAreaapellidoResponsable.setVisible(this.responsableConstantesFunciones.mostrarapellidoResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelapellidoResponsable.setVisible(this.responsableConstantesFunciones.mostrarapellidoResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextAreanombre_completoResponsable.setVisible(this.responsableConstantesFunciones.mostrarnombre_completoResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelnombre_completoResponsable.setVisible(this.responsableConstantesFunciones.mostrarnombre_completoResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextAreaemailResponsable.setVisible(this.responsableConstantesFunciones.mostraremailResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelemailResponsable.setVisible(this.responsableConstantesFunciones.mostraremailResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextFieldtelefonoResponsable.setVisible(this.responsableConstantesFunciones.mostrartelefonoResponsable);
		this.jInternalFrameDetalleFormResponsable.jPaneltelefonoResponsable.setVisible(this.responsableConstantesFunciones.mostrartelefonoResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextFieldtelefono_celularResponsable.setVisible(this.responsableConstantesFunciones.mostrartelefono_celularResponsable);
		this.jInternalFrameDetalleFormResponsable.jPaneltelefono_celularResponsable.setVisible(this.responsableConstantesFunciones.mostrartelefono_celularResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextAreadireccionResponsable.setVisible(this.responsableConstantesFunciones.mostrardireccionResponsable);
		this.jInternalFrameDetalleFormResponsable.jPaneldireccionResponsable.setVisible(this.responsableConstantesFunciones.mostrardireccionResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextFieldfaxResponsable.setVisible(this.responsableConstantesFunciones.mostrarfaxResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelfaxResponsable.setVisible(this.responsableConstantesFunciones.mostrarfaxResponsable);
		//this.jInternalFrameDetalleFormResponsable.jTextAreaobservacionResponsable.setVisible(this.responsableConstantesFunciones.mostrarobservacionResponsable);
		this.jInternalFrameDetalleFormResponsable.jPanelobservacionResponsable.setVisible(this.responsableConstantesFunciones.mostrarobservacionResponsable);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioResponsable() throws Exception {
		if(this.jInternalFrameDetalleFormResponsable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResponsable!=null) {
	
		this.jInternalFrameDetalleFormResponsable.jLabelidResponsable.setEnabled(this.responsableConstantesFunciones.activaridResponsable);
		this.jInternalFrameDetalleFormResponsable.jComboBoxid_empresaResponsable.setEnabled(this.responsableConstantesFunciones.activarid_empresaResponsable);
		this.jInternalFrameDetalleFormResponsable.jComboBoxid_sucursalResponsable.setEnabled(this.responsableConstantesFunciones.activarid_sucursalResponsable);
		this.jInternalFrameDetalleFormResponsable.jComboBoxid_clienteResponsable.setEnabled(this.responsableConstantesFunciones.activarid_clienteResponsable);
			this.jInternalFrameDetalleFormResponsable.jButtonid_clienteResponsable.setEnabled(this.responsableConstantesFunciones.activarid_clienteResponsable);
		this.jInternalFrameDetalleFormResponsable.jComboBoxid_usuarioResponsable.setEnabled(this.responsableConstantesFunciones.activarid_usuarioResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextFieldidentificacionResponsable.setEnabled(this.responsableConstantesFunciones.activaridentificacionResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextFieldrucResponsable.setEnabled(this.responsableConstantesFunciones.activarrucResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreanombreResponsable.setEnabled(this.responsableConstantesFunciones.activarnombreResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreaapellidoResponsable.setEnabled(this.responsableConstantesFunciones.activarapellidoResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreanombre_completoResponsable.setEnabled(this.responsableConstantesFunciones.activarnombre_completoResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreaemailResponsable.setEnabled(this.responsableConstantesFunciones.activaremailResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextFieldtelefonoResponsable.setEnabled(this.responsableConstantesFunciones.activartelefonoResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextFieldtelefono_celularResponsable.setEnabled(this.responsableConstantesFunciones.activartelefono_celularResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreadireccionResponsable.setEnabled(this.responsableConstantesFunciones.activardireccionResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextFieldfaxResponsable.setEnabled(this.responsableConstantesFunciones.activarfaxResponsable);
		this.jInternalFrameDetalleFormResponsable.jTextAreaobservacionResponsable.setEnabled(this.responsableConstantesFunciones.activarobservacionResponsable);
		}
	}
	
		
}