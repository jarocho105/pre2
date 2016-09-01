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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.ConsignatarioConstantesFunciones;
import com.bydan.erp.cartera.util.ConsignatarioParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ConsignatarioParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ConsignatarioBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ConsignatarioBeanSwingJInternalFrame extends ConsignatarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConsignatarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Consignatario> consignatarioValidator = new ClassValidator<Consignatario>(Consignatario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Consignatario consignatario;	
	public Consignatario consignatarioAux;
	public Consignatario consignatarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Consignatario consignatarioTotales;
	public Long idConsignatarioActual;
	public Long iIdNuevoConsignatario=0L;
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
	
	

	public Boolean isTienePermisosProforma=false;

	public Boolean getIsTienePermisosProforma() {
		return isTienePermisosProforma;
	}

	public void setIsTienePermisosProforma(Boolean isTienePermisosProforma) {
		this.isTienePermisosProforma= isTienePermisosProforma;
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
	
	public Boolean isPermisoTodoConsignatario;
	public Boolean isPermisoNuevoConsignatario;
	public Boolean isPermisoActualizarConsignatario;
	public Boolean isPermisoActualizarOriginalConsignatario;
	public Boolean isPermisoEliminarConsignatario;
	public Boolean isPermisoGuardarCambiosConsignatario;
	public Boolean isPermisoConsultaConsignatario;
	public Boolean isPermisoBusquedaConsignatario;
	public Boolean isPermisoReporteConsignatario;
	public Boolean isPermisoPaginacionMedioConsignatario;
	public Boolean isPermisoPaginacionAltoConsignatario;
	public Boolean isPermisoPaginacionTodoConsignatario;
	public Boolean isPermisoCopiarConsignatario;
	public Boolean isPermisoVerFormConsignatario;
	public Boolean isPermisoDuplicarConsignatario;
	public Boolean isPermisoOrdenConsignatario;
	
	
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
	
	public ConsignatarioParameterReturnGeneral consignatarioReturnGeneral;
	public ConsignatarioParameterReturnGeneral consignatarioParameterGeneral;
	
	

	public ProformaLogic proformaLogic=null;

	public ProformaLogic getProformaLogic() {
		return proformaLogic;
	}

	public void setProformaLogic(ProformaLogic proformaLogic) {
		this.proformaLogic = proformaLogic;
	}


	public ConsignacionLogic consignacionLogic=null;

	public ConsignacionLogic getConsignacionLogic() {
		return consignacionLogic;
	}

	public void setConsignacionLogic(ConsignacionLogic consignacionLogic) {
		this.consignacionLogic = consignacionLogic;
	}


	public PedidoExporLogic pedidoexporLogic=null;

	public PedidoExporLogic getPedidoExporLogic() {
		return pedidoexporLogic;
	}

	public void setPedidoExporLogic(PedidoExporLogic pedidoexporLogic) {
		this.pedidoexporLogic = pedidoexporLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConsignatario=false;
	public Boolean esParaAccionDesdeFormularioConsignatario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConsignatarioSessionBeanAdditional consignatarioSessionBeanAdditional=null;
	
	public ConsignatarioSessionBeanAdditional getConsignatarioSessionBeanAdditional() {
		return this.consignatarioSessionBeanAdditional;
	}
	
	public void setConsignatarioSessionBeanAdditional(ConsignatarioSessionBeanAdditional consignatarioSessionBeanAdditional) {
		try {
			this.consignatarioSessionBeanAdditional=consignatarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConsignatarioBeanSwingJInternalFrameAdditional consignatarioBeanSwingJInternalFrameAdditional=null;
	//public class ConsignatarioBeanSwingJInternalFrame
	
	public ConsignatarioBeanSwingJInternalFrameAdditional getConsignatarioBeanSwingJInternalFrameAdditional() {
		return this.consignatarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setConsignatarioBeanSwingJInternalFrameAdditional(ConsignatarioBeanSwingJInternalFrameAdditional consignatarioBeanSwingJInternalFrameAdditional) {
		try {
			this.consignatarioBeanSwingJInternalFrameAdditional=consignatarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConsignatarioLogic consignatarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Consignatario consignatarioBean;
	public ConsignatarioConstantesFunciones consignatarioConstantesFunciones;
	//public ConsignatarioParameterReturnGeneral consignatarioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<Consignatario> consignatarios;	
	//public List<Consignatario> consignatariosEliminados;
	//public List<Consignatario> consignatariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConsignatario=false;
	public Boolean isVisibilidadCeldaDuplicarConsignatario=true;
	public Boolean isVisibilidadCeldaCopiarConsignatario=true;
	public Boolean isVisibilidadCeldaVerFormConsignatario=true;
	public Boolean isVisibilidadCeldaOrdenConsignatario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConsignatario=false;
	public Boolean isVisibilidadCeldaModificarConsignatario=false;
	public Boolean isVisibilidadCeldaActualizarConsignatario=false;
	public Boolean isVisibilidadCeldaEliminarConsignatario=false;
	public Boolean isVisibilidadCeldaCancelarConsignatario=false;
	public Boolean isVisibilidadCeldaGuardarConsignatario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConsignatario=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoConsignatario() {
		return this.iIdNuevoConsignatario;
	}

	public void setiIdNuevoConsignatario(Long iIdNuevoConsignatario) {
		this.iIdNuevoConsignatario = iIdNuevoConsignatario;
	}
	
	public Long getidConsignatarioActual() {
		return this.idConsignatarioActual;
	}

	public void setidConsignatarioActual(Long idConsignatarioActual) {
		this.idConsignatarioActual = idConsignatarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Consignatario getconsignatario() {
		return this.consignatario;
	}

	public void setconsignatario(Consignatario consignatario) {
		this.consignatario = consignatario;
	}
	
	public Consignatario getconsignatarioAux() {
		return this.consignatarioAux;
	}

	public void setconsignatarioAux(Consignatario consignatarioAux) {
		this.consignatarioAux = consignatarioAux;
	}				
	
	public Consignatario getconsignatarioAnterior() {
		return this.consignatarioAnterior;
	}

	public void setconsignatarioAnterior(Consignatario consignatarioAnterior) {
		this.consignatarioAnterior = consignatarioAnterior;
	}	
	
	public Consignatario getconsignatarioTotales() {
		return this.consignatarioTotales;
	}

	public void setconsignatarioTotales(Consignatario consignatarioTotales) {
		this.consignatarioTotales = consignatarioTotales;
	}	
	
	public Consignatario getconsignatarioBean() {
		return this.consignatarioBean;
	}

	public void setconsignatarioBean(Consignatario consignatarioBean) {
		this.consignatarioBean = consignatarioBean;
	}	
	
	public ConsignatarioParameterReturnGeneral getconsignatarioReturnGeneral() {
		return this.consignatarioReturnGeneral;
	}

	public void setconsignatarioReturnGeneral(ConsignatarioParameterReturnGeneral consignatarioReturnGeneral) {
		this.consignatarioReturnGeneral = consignatarioReturnGeneral;
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
	
	
	public ConsignatarioLogic getConsignatarioLogic()	{		
		return consignatarioLogic;
	}

	public void setConsignatarioLogic(ConsignatarioLogic consignatarioLogic) {
		this.consignatarioLogic = consignatarioLogic;
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
	
	public Boolean getIsEsNuevoConsignatario() {
		return isEsNuevoConsignatario;
	}

	public void setIsEsNuevoConsignatario(Boolean isEsNuevoConsignatario) {
		this.isEsNuevoConsignatario = isEsNuevoConsignatario;
	}

	public Boolean getEsParaAccionDesdeFormularioConsignatario() {
		return esParaAccionDesdeFormularioConsignatario;
	}
	
	public void setEsParaAccionDesdeFormularioConsignatario(Boolean esParaAccionDesdeFormularioConsignatario) {
		this.esParaAccionDesdeFormularioConsignatario = esParaAccionDesdeFormularioConsignatario;
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

			if(this.consignatarioSessionBean==null) {
				this.consignatarioSessionBean=new ConsignatarioSessionBean();
			}

			if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(consignatarioSessionBean.getlidEmpresaActual());
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

			if(this.consignatarioSessionBean==null) {
				this.consignatarioSessionBean=new ConsignatarioSessionBean();
			}

			if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(consignatarioSessionBean.getlidSucursalActual());
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

			if(this.consignatarioSessionBean==null) {
				this.consignatarioSessionBean=new ConsignatarioSessionBean();
			}

			if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(consignatarioSessionBean.getlidClienteActual());
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

			if(this.consignatarioSessionBean==null) {
				this.consignatarioSessionBean=new ConsignatarioSessionBean();
			}

			if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(consignatarioSessionBean.getlidUsuarioActual());
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

					if(this.consignatario!=null) {
						this.consignatario.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConsignatario!=null) {
						this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConsignatario.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConsignatario!=null) {
						if(this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConsignatarioGenerico)throws Exception
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
				jComboBoxid_empresaConsignatarioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConsignatarioGenerico!=null && jComboBoxid_empresaConsignatarioGenerico.getItemCount()>0) {
					jComboBoxid_empresaConsignatarioGenerico.setSelectedIndex(0);
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

					if(this.consignatario!=null) {
						this.consignatario.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormConsignatario!=null) {
						this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalConsignatario.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormConsignatario!=null) {
						if(this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalConsignatarioGenerico)throws Exception
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
				jComboBoxid_sucursalConsignatarioGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalConsignatarioGenerico!=null && jComboBoxid_sucursalConsignatarioGenerico.getItemCount()>0) {
					jComboBoxid_sucursalConsignatarioGenerico.setSelectedIndex(0);
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

					if(this.consignatario!=null) {
						this.consignatario.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormConsignatario!=null) {
						this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteConsignatario.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormConsignatario!=null) {
						if(this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteConsignatario!=null) {
						jComboBoxid_clienteFK_IdClienteConsignatario.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteConsignatario!=null) {
							//jComboBoxid_clienteFK_IdClienteConsignatario.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteConsignatario.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteConsignatario.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteConsignatarioGenerico)throws Exception
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
				jComboBoxid_clienteConsignatarioGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteConsignatarioGenerico!=null && jComboBoxid_clienteConsignatarioGenerico.getItemCount()>0) {
					jComboBoxid_clienteConsignatarioGenerico.setSelectedIndex(0);
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

					if(this.consignatario!=null) {
						this.consignatario.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormConsignatario!=null) {
						this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioConsignatario.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormConsignatario!=null) {
						if(this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioConsignatarioGenerico)throws Exception
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
				jComboBoxid_usuarioConsignatarioGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioConsignatarioGenerico!=null && jComboBoxid_usuarioConsignatarioGenerico.getItemCount()>0) {
					jComboBoxid_usuarioConsignatarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Consignatario consignatario,JComboBox jComboBoxid_empresaConsignatarioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConsignatarioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConsignatarioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				consignatario.setid_empresa(empresaAux.getId());
				consignatario.setempresa_descripcion(ConsignatarioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				consignatario.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Consignatario consignatario,JComboBox jComboBoxid_sucursalConsignatarioGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalConsignatarioGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalConsignatarioGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				consignatario.setid_sucursal(sucursalAux.getId());
				consignatario.setsucursal_descripcion(ConsignatarioConstantesFunciones.getSucursalDescripcion(sucursalAux));
				consignatario.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Consignatario consignatario,JComboBox jComboBoxid_clienteConsignatarioGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteConsignatarioGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteConsignatarioGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				consignatario.setid_cliente(clienteAux.getId());
				consignatario.setcliente_descripcion(ConsignatarioConstantesFunciones.getClienteDescripcion(clienteAux));
				consignatario.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(Consignatario consignatario,JComboBox jComboBoxid_usuarioConsignatarioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioConsignatarioGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioConsignatarioGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				consignatario.setid_usuario(usuarioAux.getId());
				consignatario.setusuario_descripcion(ConsignatarioConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				consignatario.setUsuario(usuarioAux);			}
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

					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsignatario!=null) { 
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsignatario!=null) { 
					}

					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsignatario!=null) { 
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsignatario!=null) { 
					}

					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsignatario!=null) { 
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsignatario!=null) { 
					}

					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteConsignatario.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteConsignatario.addItem(cliente);
							}
						}

						if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsignatario!=null) { 
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsignatario!=null) { 
					}

					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConsignatario!=null) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsignatario!=null) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConsignatario!=null) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsignatario!=null) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConsignatario!=null) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsignatario!=null) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteConsignatario.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteConsignatario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConsignatario!=null) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsignatario!=null) {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesConsignatario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ConsignatarioConstantesFunciones.refrescarForeignKeysDescripcionesConsignatario(this.consignatarioLogic.getConsignatarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ConsignatarioConstantesFunciones.refrescarForeignKeysDescripcionesConsignatario(this.consignatarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//consignatarioLogic.setConsignatarios(this.consignatarios);
			consignatarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ConsignatarioParameterReturnGeneral getConsignatarioParameterGeneral() {
		return this.consignatarioParameterGeneral;
	}
	
	public void setConsignatarioParameterGeneral(ConsignatarioParameterReturnGeneral consignatarioParameterGeneral) {
		this.consignatarioParameterGeneral = consignatarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConsignatario() {
		return isPermisoTodoConsignatario;
	}

	public void setIsPermisoTodoConsignatario(Boolean isPermisoTodoConsignatario) {
		this.isPermisoTodoConsignatario = isPermisoTodoConsignatario;
	}

	public Boolean getIsPermisoNuevoConsignatario() {
		return isPermisoNuevoConsignatario;
	}

	public void setIsPermisoNuevoConsignatario(Boolean isPermisoNuevoConsignatario) {
		this.isPermisoNuevoConsignatario = isPermisoNuevoConsignatario;
	}

	public Boolean getIsPermisoActualizarConsignatario() {
		return isPermisoActualizarConsignatario;
	}

	public void setIsPermisoActualizarConsignatario(Boolean isPermisoActualizarConsignatario) {
		this.isPermisoActualizarConsignatario = isPermisoActualizarConsignatario;
	}

	public Boolean getIsPermisoEliminarConsignatario() {
		return isPermisoEliminarConsignatario;
	}

	public void setIsPermisoEliminarConsignatario(Boolean isPermisoEliminarConsignatario) {
		this.isPermisoEliminarConsignatario = isPermisoEliminarConsignatario;
	}

	public Boolean getIsPermisoGuardarCambiosConsignatario() {
		return isPermisoGuardarCambiosConsignatario;
	}

	public void setIsPermisoGuardarCambiosConsignatario(Boolean isPermisoGuardarCambiosConsignatario) {
		this.isPermisoGuardarCambiosConsignatario = isPermisoGuardarCambiosConsignatario;
	}
	
	public Boolean getIsPermisoConsultaConsignatario() {
		return isPermisoConsultaConsignatario;
	}

	public void setIsPermisoConsultaConsignatario(Boolean isPermisoConsultaConsignatario) {
		this.isPermisoConsultaConsignatario = isPermisoConsultaConsignatario;
	}

	public Boolean getIsPermisoBusquedaConsignatario() {
		return isPermisoBusquedaConsignatario;
	}

	public void setIsPermisoBusquedaConsignatario(Boolean isPermisoBusquedaConsignatario) {
		this.isPermisoBusquedaConsignatario = isPermisoBusquedaConsignatario;
	}

	public Boolean getIsPermisoReporteConsignatario() {
		return isPermisoReporteConsignatario;
	}

	public void setIsPermisoReporteConsignatario(Boolean isPermisoReporteConsignatario) {
		this.isPermisoReporteConsignatario = isPermisoReporteConsignatario;
	}
	
	public Boolean getIsPermisoPaginacionMedioConsignatario() {
		return isPermisoPaginacionMedioConsignatario;
	}

	public void setIsPermisoPaginacionMedioConsignatario(Boolean isPermisoPaginacionMedioConsignatario) {
		this.isPermisoPaginacionMedioConsignatario = isPermisoPaginacionMedioConsignatario;
	}
	
	public Boolean getIsPermisoPaginacionTodoConsignatario() {
		return isPermisoPaginacionTodoConsignatario;
	}

	public void setIsPermisoPaginacionTodoConsignatario(Boolean isPermisoPaginacionTodoConsignatario) {
		this.isPermisoPaginacionTodoConsignatario = isPermisoPaginacionTodoConsignatario;
	}
	
	public Boolean getIsPermisoPaginacionAltoConsignatario() {
		return isPermisoPaginacionAltoConsignatario;
	}

	public void setIsPermisoPaginacionAltoConsignatario(Boolean isPermisoPaginacionAltoConsignatario) {
		this.isPermisoPaginacionAltoConsignatario = isPermisoPaginacionAltoConsignatario;
	}
	
	public Boolean getIsPermisoCopiarConsignatario() {
		return isPermisoCopiarConsignatario;
	}

	public void setIsPermisoCopiarConsignatario(Boolean isPermisoCopiarConsignatario) {
		this.isPermisoCopiarConsignatario = isPermisoCopiarConsignatario;
	}
	
	public Boolean getIsPermisoVerFormConsignatario() {
		return isPermisoVerFormConsignatario;
	}

	public void setIsPermisoVerFormConsignatario(Boolean isPermisoVerFormConsignatario) {
		this.isPermisoVerFormConsignatario = isPermisoVerFormConsignatario;
	}
	
	public Boolean getIsPermisoDuplicarConsignatario() {
		return isPermisoDuplicarConsignatario;
	}

	public void setIsPermisoDuplicarConsignatario(Boolean isPermisoDuplicarConsignatario) {
		this.isPermisoDuplicarConsignatario = isPermisoDuplicarConsignatario;
	}
	
	public Boolean getIsPermisoOrdenConsignatario() {
		return isPermisoOrdenConsignatario;
	}

	public void setIsPermisoOrdenConsignatario(Boolean isPermisoOrdenConsignatario) {
		this.isPermisoOrdenConsignatario = isPermisoOrdenConsignatario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConsignatario() {
		return isVisibilidadCeldaNuevoConsignatario;
	}

	public void setIsVisibilidadCeldaNuevoConsignatario(Boolean isVisibilidadCeldaNuevoConsignatario) {
		this.isVisibilidadCeldaNuevoConsignatario = isVisibilidadCeldaNuevoConsignatario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConsignatario() {
		return isVisibilidadCeldaDuplicarConsignatario;
	}

	public void setIsVisibilidadCeldaDuplicarConsignatario(Boolean isVisibilidadCeldaDuplicarConsignatario) {
		this.isVisibilidadCeldaDuplicarConsignatario = isVisibilidadCeldaDuplicarConsignatario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConsignatario() {
		return isVisibilidadCeldaCopiarConsignatario;
	}

	public void setIsVisibilidadCeldaCopiarConsignatario(Boolean isVisibilidadCeldaCopiarConsignatario) {
		this.isVisibilidadCeldaCopiarConsignatario = isVisibilidadCeldaCopiarConsignatario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConsignatario() {
		return isVisibilidadCeldaVerFormConsignatario;
	}

	public void setIsVisibilidadCeldaVerFormConsignatario(Boolean isVisibilidadCeldaVerFormConsignatario) {
		this.isVisibilidadCeldaVerFormConsignatario = isVisibilidadCeldaVerFormConsignatario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConsignatario() {
		return isVisibilidadCeldaOrdenConsignatario;
	}

	public void setIsVisibilidadCeldaOrdenConsignatario(Boolean isVisibilidadCeldaOrdenConsignatario) {
		this.isVisibilidadCeldaOrdenConsignatario = isVisibilidadCeldaOrdenConsignatario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConsignatario() {
		return isVisibilidadCeldaNuevoRelacionesConsignatario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConsignatario(Boolean isVisibilidadCeldaNuevoRelacionesConsignatario) {
		this.isVisibilidadCeldaNuevoRelacionesConsignatario = isVisibilidadCeldaNuevoRelacionesConsignatario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConsignatario() {
		return isVisibilidadCeldaModificarConsignatario;
	}

	public void setIsVisibilidadCeldaModificarConsignatario(Boolean isVisibilidadCeldaModificarConsignatario) {
		this.isVisibilidadCeldaModificarConsignatario = isVisibilidadCeldaModificarConsignatario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConsignatario() {
		return isVisibilidadCeldaActualizarConsignatario;
	}

	public void setIsVisibilidadCeldaActualizarConsignatario(Boolean isVisibilidadCeldaActualizarConsignatario) {
		this.isVisibilidadCeldaActualizarConsignatario = isVisibilidadCeldaActualizarConsignatario;
	}

	public Boolean getIsVisibilidadCeldaEliminarConsignatario() {
		return isVisibilidadCeldaEliminarConsignatario;
	}

	public void setIsVisibilidadCeldaEliminarConsignatario(Boolean isVisibilidadCeldaEliminarConsignatario) {
		this.isVisibilidadCeldaEliminarConsignatario = isVisibilidadCeldaEliminarConsignatario;
	}

	public Boolean getIsVisibilidadCeldaCancelarConsignatario() {
		return isVisibilidadCeldaCancelarConsignatario;
	}

	public void setIsVisibilidadCeldaCancelarConsignatario(Boolean isVisibilidadCeldaCancelarConsignatario) {
		this.isVisibilidadCeldaCancelarConsignatario = isVisibilidadCeldaCancelarConsignatario;
	}

	public Boolean getIsVisibilidadCeldaGuardarConsignatario() {
		return isVisibilidadCeldaGuardarConsignatario;
	}

	public void setIsVisibilidadCeldaGuardarConsignatario(Boolean isVisibilidadCeldaGuardarConsignatario) {
		this.isVisibilidadCeldaGuardarConsignatario = isVisibilidadCeldaGuardarConsignatario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConsignatario() {
		return isVisibilidadCeldaGuardarCambiosConsignatario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConsignatario(Boolean isVisibilidadCeldaGuardarCambiosConsignatario) {
		this.isVisibilidadCeldaGuardarCambiosConsignatario = isVisibilidadCeldaGuardarCambiosConsignatario;
	}
		
	public ConsignatarioSessionBean getconsignatarioSessionBean() {
		return this.consignatarioSessionBean;
	}
	
	public void setconsignatarioSessionBean(ConsignatarioSessionBean consignatarioSessionBean) {
		this.consignatarioSessionBean=consignatarioSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConsignatario(Consignatario consignatario)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(consignatario,null);
				this.setActualParaGuardarSucursalForeignKey(consignatario,null);
				this.setActualParaGuardarClienteForeignKey(consignatario,null);
				this.setActualParaGuardarUsuarioForeignKey(consignatario,null);
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
	
	public void bugActualizarReferenciaActual(Consignatario consignatario,Consignatario consignatarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConsignatario(consignatario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		consignatarioAux.setId(consignatario.getId());
		consignatarioAux.setVersionRow(consignatario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessConsignatario();
		
			int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = consignatarioValidator.getInvalidValues(this.consignatario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			consignatarioLogic.setDatosCliente(datosCliente);
			consignatarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				consignatarioAux=new  Consignatario();
				
				consignatarioAux.setIsNew(true);
				consignatarioAux.setIsChanged(true);
				
				consignatarioAux.setConsignatarioOriginal(this.consignatario);
				
				consignatarioAux.setId(this.consignatario.getId());	
				consignatarioAux.setVersionRow(this.consignatario.getVersionRow());	
				consignatarioAux.setid_empresa(this.consignatario.getid_empresa());	
				consignatarioAux.setid_sucursal(this.consignatario.getid_sucursal());	
				consignatarioAux.setid_cliente(this.consignatario.getid_cliente());	
				consignatarioAux.setid_usuario(this.consignatario.getid_usuario());	
				consignatarioAux.setnombre_completo(this.consignatario.getnombre_completo());	
				consignatarioAux.setnombre(this.consignatario.getnombre());	
				consignatarioAux.setapellido(this.consignatario.getapellido());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.consignatarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(consignatarioAux,consignatarioLogic.getConsignatarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consignatarioAux,consignatarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.consignatarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.consignatarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatarioLogic.saveConsignatarios();//WithConnection
						//consignatarioLogic.getSetVersionRowConsignatarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.consignatario,consignatarioAux);
					
					this.refrescarForeignKeysDescripcionesConsignatario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas().addAll(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions().addAll(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors().addAll(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformas.addAll(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacions.addAll(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexpors.addAll(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								consignatarioLogic.saveConsignatarioRelaciones(consignatarioAux,this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas(),this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions(),this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());//WithConnection
								//consignatarioLogic.getSetVersionRowConsignatarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.consignatario,consignatarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(new ArrayList<Proforma>());
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(new ArrayList<Consignacion>());
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(new ArrayList<PedidoExpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformas= new ArrayList<Proforma>();
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacions= new ArrayList<Consignacion>();
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexpors= new ArrayList<PedidoExpor>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.quitarFilaTotales();}
							consignatarioAux.setProformas(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());

							if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							consignatarioAux.setConsignacions(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());

							if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							consignatarioAux.setPedidoExpors(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.consignatarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(consignatarioAux,consignatarioLogic.getConsignatarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(consignatarioAux,consignatarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.consignatario,consignatarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				consignatarioAux=new  Consignatario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.consignatarioSessionBean.getEsGuardarRelacionado() 
					|| (this.consignatarioSessionBean.getEsGuardarRelacionado() && this.consignatario.getId()>=0)) {
						
					consignatarioAux.setIsNew(false);
				}
				
				consignatarioAux.setIsDeleted(false);
			
				consignatarioAux.setId(this.consignatario.getId());	
				consignatarioAux.setVersionRow(this.consignatario.getVersionRow());	
				consignatarioAux.setid_empresa(this.consignatario.getid_empresa());	
				consignatarioAux.setid_sucursal(this.consignatario.getid_sucursal());	
				consignatarioAux.setid_cliente(this.consignatario.getid_cliente());	
				consignatarioAux.setid_usuario(this.consignatario.getid_usuario());	
				consignatarioAux.setnombre_completo(this.consignatario.getnombre_completo());	
				consignatarioAux.setnombre(this.consignatario.getnombre());	
				consignatarioAux.setapellido(this.consignatario.getapellido());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(consignatarioAux,consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consignatarioAux,consignatarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.consignatarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.consignatarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatarioLogic.saveConsignatarios();//WithConnection
						//consignatarioLogic.getSetVersionRowConsignatarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.consignatario,consignatarioAux);
					
					this.refrescarForeignKeysDescripcionesConsignatario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas().addAll(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions().addAll(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors().addAll(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformas.addAll(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacions.addAll(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexpors.addAll(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								consignatarioLogic.saveConsignatarioRelaciones(consignatarioAux,this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas(),this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions(),this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());//WithConnection
								//consignatarioLogic.getSetVersionRowConsignatarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.consignatario,consignatarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(new ArrayList<Proforma>());
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(new ArrayList<Consignacion>());
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(new ArrayList<PedidoExpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformas= new ArrayList<Proforma>();
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacions= new ArrayList<Consignacion>();
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexpors= new ArrayList<PedidoExpor>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.quitarFilaTotales();}
							consignatarioAux.setProformas(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());

							if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							consignatarioAux.setConsignacions(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());

							if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							consignatarioAux.setPedidoExpors(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.consignatarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(consignatarioAux,consignatarioLogic.getConsignatarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(consignatarioAux,consignatarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.consignatario,consignatarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				consignatarioAux=new  Consignatario();
				
				consignatarioAux.setIsNew(false);
				consignatarioAux.setIsChanged(false);
				
				consignatarioAux.setIsDeleted(true);
				
				consignatarioAux.setId(this.consignatario.getId());	
				consignatarioAux.setVersionRow(this.consignatario.getVersionRow());	
				consignatarioAux.setid_empresa(this.consignatario.getid_empresa());	
				consignatarioAux.setid_sucursal(this.consignatario.getid_sucursal());	
				consignatarioAux.setid_cliente(this.consignatario.getid_cliente());	
				consignatarioAux.setid_usuario(this.consignatario.getid_usuario());	
				consignatarioAux.setnombre_completo(this.consignatario.getnombre_completo());	
				consignatarioAux.setnombre(this.consignatario.getnombre());	
				consignatarioAux.setapellido(this.consignatario.getapellido());	
				
				if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.consignatarioAux.getId()>=0) {	
						this.consignatariosEliminados.add(consignatarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(consignatarioAux,consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consignatarioAux,consignatarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.consignatarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.consignatarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatarioLogic.saveConsignatarios();//WithConnection
						//consignatarioLogic.getSetVersionRowConsignatarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas().addAll(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions().addAll(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors().addAll(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformas.addAll(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacions.addAll(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionsEliminados);
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexpors.addAll(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jInternalFrameDetalleFormConsignacion.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								consignatarioLogic.saveConsignatarioRelaciones(consignatarioAux,this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas(),this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions(),this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());//WithConnection
								//consignatarioLogic.getSetVersionRowConsignatarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(new ArrayList<Proforma>());
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(new ArrayList<Consignacion>());
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(new ArrayList<PedidoExpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformas= new ArrayList<Proforma>();
							this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacions= new ArrayList<Consignacion>();
							this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexpors= new ArrayList<PedidoExpor>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.quitarFilaTotales();}
							consignatarioAux.setProformas(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());

							if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							consignatarioAux.setConsignacions(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());

							if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							consignatarioAux.setPedidoExpors(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.consignatarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(consignatarioAux,consignatarioLogic.getConsignatarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(consignatarioAux,consignatarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getConsignatarios().addAll(this.consignatariosEliminados);
					
					consignatarioLogic.saveConsignatarios();//WithConnection
					//consignatarioLogic.getSetVersionRowConsignatarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesConsignatario();
				
				this.consignatariosEliminados= new ArrayList<Consignatario>();		
			}
			
			if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Consignatario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.consignatario=consignatarioAux;
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
      		//this.finishProcessConsignatario();
      	}
		
	}	
	
	public void actualizarRelaciones(Consignatario consignatarioLocal) throws Exception {
		
		if(this.consignatarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				consignatarioLocal.setProformas(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());
				consignatarioLocal.setConsignacions(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());
				consignatarioLocal.setPedidoExpors(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
			
			} else {
			
				consignatarioLocal.setProformas(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformas);
				consignatarioLocal.setConsignacions(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacions);
				consignatarioLocal.setPedidoExpors(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexpors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Consignatario consignatarioLocal) throws Exception {	
		if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				consignatarioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				consignatarioLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				consignatarioLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				consignatarioLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConsignatarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = consignatarioValidator.getInvalidValues(this.consignatario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Consignatario consignatario,List<Consignatario> consignatarios) throws Exception {
		try	{		
			ConsignatarioConstantesFunciones.actualizarLista(consignatario,consignatarios,this.consignatarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Consignatario consignatario,List<Consignatario> consignatarios) throws Exception {
		try	{			
			ConsignatarioConstantesFunciones.actualizarSelectedLista(consignatario,consignatarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Consignatario> consignatariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				consignatariosLocal=this.consignatarioLogic.getConsignatarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				consignatariosLocal=this.consignatarios;
			}
			//ARCHITECTURE
		
			for(Consignatario consignatarioLocal:consignatariosLocal) {
				if(this.permiteMantenimiento(consignatarioLocal) && consignatarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConsignatarioConstantesFunciones.getConsignatarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConsignatarioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelid_empresaConsignatario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsignatarioConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelid_sucursalConsignatario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsignatarioConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelid_clienteConsignatario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsignatarioConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelid_usuarioConsignatario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsignatarioConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelnombre_completoConsignatario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsignatarioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelnombreConsignatario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsignatarioConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelapellidoConsignatario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsignatario.jLabelid_empresaConsignatario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsignatario.jLabelid_sucursalConsignatario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsignatario.jLabelid_clienteConsignatario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsignatario.jLabelid_usuarioConsignatario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsignatario.jLabelnombre_completoConsignatario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsignatario.jLabelnombreConsignatario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsignatario.jLabelapellidoConsignatario,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Proforma")) {
			if(this.consignatario==null) {
				this.consignatario= new Consignatario();
			}

			if(this.consignatarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConsignatario
				this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);

				this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.getproforma().setConsignatario(this.consignatario);
			}

			return;
		}
		 else  if(sTipo.equals("Consignacion")) {
			if(this.consignatario==null) {
				this.consignatario= new Consignatario();
			}

			if(this.consignatarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConsignatario
				this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);

				this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.getconsignacion().setConsignatario(this.consignatario);
			}

			return;
		}
		 else  if(sTipo.equals("PedidoExpor")) {
			if(this.consignatario==null) {
				this.consignatario= new Consignatario();
			}

			if(this.consignatarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConsignatario
				this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);

				this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.getpedidoexpor().setConsignatario(this.consignatario);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoConsignatario--;	
		
		
		this.consignatarioAux=new Consignatario();
		
		this.consignatarioAux.setId(this.iIdNuevoConsignatario);
		this.consignatarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consignatarioLogic.getConsignatarios().add(this.consignatarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.consignatarios.add(this.consignatarioAux);
		}
		//ARCHITECTURE
		
		this.consignatario=this.consignatarioAux;
		
		if(ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConsignatario(this.consignatario);
			this.setVariablesObjetoActualToFormularioForeignKeyConsignatario(this.consignatario);
		}
				
		//this.setDefaultControlesConsignatario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConsignatario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConsignatario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsignatario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsignatario(this.consignatarioBean,this.consignatario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ConsignatarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.consignatarioSessionBean.getConGuardarRelaciones()) {
			classes=ConsignatarioConstantesFunciones.getClassesRelationshipsOfConsignatario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.consignatarioReturnGeneral=consignatarioLogic.procesarEventosConsignatariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consignatarioLogic.getConsignatarios(),this.consignatario,this.consignatarioParameterGeneral,this.isEsNuevoConsignatario,classes);//this.consignatarioLogic.getConsignatario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConsignatario(this.consignatarioReturnGeneral,this.consignatarioBean,false);
		
		if(this.consignatarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConsignatario(this.consignatarioReturnGeneral.getConsignatario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConsignatario(this.consignatarioReturnGeneral.getConsignatario());
		}
		
		if(this.consignatarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConsignatario(this.consignatarioReturnGeneral.getConsignatario(),classes);//this.consignatarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConsignatario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConsignatario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConsignatarioBeanSwingJInternalFrameAdditional.RecargarFormConsignatario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConsignatario(false);
						
			if(consignatarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaSessionBean.getEsGuardarRelacionado() && ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProformaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionSessionBean.getEsGuardarRelacionado() && ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConsignacionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado() && PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoExporActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsignatario();
			}
			
			this.actualizarVisualTableDatosConsignatario();
			
			this.jTableDatosConsignatario.setRowSelectionInterval(this.getIndiceNuevoConsignatario(), this.getIndiceNuevoConsignatario());
			
			this.seleccionarFilaTablaConsignatarioActual();
						
			this.actualizarEstadoCeldasBotonesConsignatario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConsignatario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConsignatario.jTextFieldnombre_completoConsignatario.setEnabled(isHabilitar && this.consignatarioConstantesFunciones.activarnombre_completoConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jTextAreanombreConsignatario.setEnabled(isHabilitar && this.consignatarioConstantesFunciones.activarnombreConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jTextAreaapellidoConsignatario.setEnabled(isHabilitar && this.consignatarioConstantesFunciones.activarapellidoConsignatario);	
		//
		this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.setEnabled(isHabilitar && this.consignatarioConstantesFunciones.activarid_empresaConsignatario);//
		this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.setEnabled(isHabilitar && this.consignatarioConstantesFunciones.activarid_sucursalConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.setEnabled(isHabilitar && this.consignatarioConstantesFunciones.activarid_clienteConsignatario);//
		this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.setEnabled(isHabilitar && this.consignatarioConstantesFunciones.activarid_usuarioConsignatario);
	};
	
	public void setDefaultControlesConsignatario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConsignatario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.consignatarioSessionBean.setConGuardarRelaciones(true);			
			this.consignatarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.consignatarioSessionBean.setConGuardarRelaciones(false);			
			this.consignatarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoConsignatario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consignatario consignatarioAux:this.consignatarioLogic.getConsignatarios()) {
				if(consignatarioAux.getId().equals(this.iIdNuevoConsignatario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consignatario consignatarioAux:this.consignatarios) {
				if(consignatarioAux.getId().equals(this.iIdNuevoConsignatario)) {
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
	
	public int getIndiceActualConsignatario(Consignatario consignatario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consignatario consignatarioAux:this.consignatarioLogic.getConsignatarios()) {
				if(consignatarioAux.getId().equals(consignatario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consignatario consignatarioAux:this.consignatarios) {
				if(consignatarioAux.getId().equals(consignatario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConsignatario(Consignatario consignatarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consignatario consignatarioAux:this.consignatarioLogic.getConsignatarios()) {
				if(consignatarioAux.getConsignatarioOriginal().getId().equals(consignatarioOriginal.getId())) {
					existe=true;
					consignatarioOriginal.setId(consignatarioAux.getId());
					consignatarioOriginal.setVersionRow(consignatarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consignatario consignatarioAux:this.consignatarios) {
				if(consignatarioAux.getConsignatarioOriginal().getId().equals(consignatarioOriginal.getId())) {
					existe=true;
					consignatarioOriginal.setId(consignatarioAux.getId());
					consignatarioOriginal.setVersionRow(consignatarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConsignatario(Boolean esParaCancelar) throws Exception {
		consignatariosAux=new ArrayList<Consignatario>();
		consignatarioAux=new Consignatario();
		
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Consignatario consignatarioAux:this.consignatarioLogic.getConsignatarios()) {
					if(consignatarioAux.getId()<0) {
						consignatariosAux.add(consignatarioAux);
					}		
				}
				this.iIdNuevoConsignatario=0L;
				this.consignatarioLogic.getConsignatarios().removeAll(consignatariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Consignatario consignatarioAux:this.consignatarios) {
					if(consignatarioAux.getId()<0) {
						consignatariosAux.add(consignatarioAux);
					}		
				}
				this.iIdNuevoConsignatario=0L;
				this.consignatarios.removeAll(consignatariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConsignatario 
					&& this.consignatarioLogic.getConsignatarios().size()>0
					) {
					consignatarioAux=this.consignatarioLogic.getConsignatarios().get(this.consignatarioLogic.getConsignatarios().size() - 1);
				
					if(consignatarioAux.getId()<0) {
						this.consignatarioLogic.getConsignatarios().remove(consignatarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConsignatario && this.consignatarios.size()>0) {
					consignatarioAux=this.consignatarios.get(this.consignatarios.size() - 1);
				
					if(consignatarioAux.getId()<0) {
						this.consignatarios.remove(consignatarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConsignatario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(consignatario.getId()<0) {
				this.consignatarioLogic.getConsignatarios().remove(this.consignatario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(consignatario.getId()<0) {
				this.consignatarios.remove(this.consignatario);
			}
		}			
	}
	
	public void setEstadosInicialesConsignatario(List<Consignatario> consignatariosAux) throws Exception {
		ConsignatarioConstantesFunciones.setEstadosInicialesConsignatario(consignatariosAux);
	}
	
	public void setEstadosInicialesConsignatario(Consignatario consignatarioAux) throws Exception {
		ConsignatarioConstantesFunciones.setEstadosInicialesConsignatario(consignatarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConsignatarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConsignatario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConsignatarioActual()) {
				if(!this.isEsNuevoConsignatario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConsignatario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConsignatario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConsignatarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Consignatario ?", "MANTENIMIENTO DE Consignatario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConsignatario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Consignatario consignatario) throws Exception {
		ConsignatarioConstantesFunciones.seleccionarAsignar(this.consignatario,consignatario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConsignatario=this.isPermisoActualizarOriginalConsignatario;
			
			
			this.seleccionarAsignar(consignatario);
			
			

			idClienteActual=consignatario.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConsignatarioConstantesFunciones.quitarEspaciosConsignatario(this.consignatario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesConsignatario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.consignatarioSessionBean.setsFuncionBusquedaRapida(this.consignatarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoConsignatario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConsignatario(esParaCancelar);				
				this.cancelarNuevoConsignatario(esParaCancelar);								
			}
			
			this.consignatario=new Consignatario();
			
			this.inicializarConsignatario();
			
			this.actualizarEstadoCeldasBotonesConsignatario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConsignatario() throws Exception {
		try {
			ConsignatarioConstantesFunciones.inicializarConsignatario(this.consignatario);
			
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
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.consignatarioLogic.getConsignatarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConsignatarios(String sAccionBusqueda,List<Consignatario> consignatariosParaReportes) throws Exception {
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
					sPathReporteFinal="Consignatario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConsignatarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConsignatarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Consignatario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Consignatarios");		
		parameters.put("busquedapor", ConsignatarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Proforma.class));
			classes.add(new Classe(Consignacion.class));
			classes.add(new Classe(PedidoExpor.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ConsignatarioLogic consignatarioLogicAuxiliar=new ConsignatarioLogic();
					consignatarioLogicAuxiliar.setDatosCliente(consignatarioLogic.getDatosCliente());				
					consignatarioLogicAuxiliar.setConsignatarios(consignatariosParaReportes);
					
					consignatarioLogicAuxiliar.cargarRelacionesLoteForeignKeyConsignatarioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					consignatariosParaReportes=consignatarioLogicAuxiliar.getConsignatarios();
					
					//consignatarioLogic.getNewConnexionToDeep();
					
					//for (Consignatario consignatario:consignatariosParaReportes) {
					//	consignatarioLogic.deepLoad(consignatario, false, DeepLoadType.INCLUDE, classes);
					//}						
					//consignatarioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//consignatarioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProforma = AuxiliarReportes.class.getResourceAsStream("ProformaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_proforma", reportFileProforma);

			InputStream reportFileConsignacion = AuxiliarReportes.class.getResourceAsStream("ConsignacionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_consignacion", reportFileConsignacion);

			InputStream reportFilePedidoExpor = AuxiliarReportes.class.getResourceAsStream("PedidoExporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidoexpor", reportFilePedidoExpor);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConsignatario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConsignatarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConsignatarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConsignatario=new JRBeanArrayDataSource(ConsignatarioJInternalFrame.TraerConsignatarioBeans(consignatariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConsignatario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConsignatarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConsignatarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConsignatarioBean.TraerConsignatarioBeans(consignatariosParaReportes).toArray()));
							
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
				this.generarExcelReporteConsignatarios(sAccionBusqueda,sTipoArchivoReporte,consignatariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConsignatarios(sAccionBusqueda,sTipoArchivoReporte,consignatariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConsignatarioActionPerformed(null);
					//this.generarExcelReporteConsignatarios(sAccionBusqueda,sTipoArchivoReporte,consignatariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConsignatarios(sAccionBusqueda,sTipoArchivoReporte,consignatariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConsignatarios(sAccionBusqueda,sTipoArchivoReporte,consignatariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConsignatarios(sAccionBusqueda,sTipoArchivoReporte,consignatariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConsignatarios(String sAccionBusqueda,String sTipoArchivoReporte,List<Consignatario> consignatariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consignatario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Consignatarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsignatario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Consignatario consignatario : consignatariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConsignatarioConstantesFunciones.generarExcelReporteDataConsignatario("NORMAL",row,workbook,consignatario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConsignatario(String sTipo,Row row,Workbook workbook) {
		
		ConsignatarioConstantesFunciones.generarExcelReporteHeaderConsignatario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConsignatarios(String sAccionBusqueda,String sTipoArchivoReporte,List<Consignatario> consignatariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consignatario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Consignatarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Consignatario consignatario : consignatariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConsignatarioConstantesFunciones.getConsignatarioDescripcion(consignatario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsignatarioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consignatario.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consignatario.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsignatarioConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consignatario.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsignatarioConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consignatario.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consignatario.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsignatarioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consignatario.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsignatarioConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consignatario.getapellido());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConsignatarios(String sAccionBusqueda,String sTipoArchivoReporte,List<Consignatario> consignatariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Consignatario> consignatariosRespaldo=null;
		
		classes=ConsignatarioConstantesFunciones.getClassesRelationshipsOfConsignatario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.consignatarioLogic.setDatosCliente(this.datosCliente);
		this.consignatarioLogic.setDatosDeep(this.datosDeep);
		this.consignatarioLogic.setIsConDeep(true);
		
		consignatariosRespaldo=this.consignatarioLogic.getConsignatarios();
		
		this.consignatarioLogic.setConsignatarios(consignatariosParaReportes);	
		this.consignatarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		consignatariosParaReportes=this.consignatarioLogic.getConsignatarios();
		this.consignatarioLogic.setConsignatarios(consignatariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consignatario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Consignatarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsignatario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Consignatario consignatario : consignatariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConsignatario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConsignatarioConstantesFunciones.generarExcelReporteDataConsignatario("NORMAL",row,workbook,consignatario,cellStyleDataAux);
		
			
			


				//Proforma
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProformaConstantesFunciones.SCLASSWEBTITULO))) {

				if(consignatario.getProformas()!=null && consignatario.getProformas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProformaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProformaConstantesFunciones.generarExcelReporteHeaderProforma("RELACIONADO",row,workbook);
				}

				if(consignatario.getProformas()!=null) {
					i2=0;
					for(Proforma proforma : consignatario.getProformas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProformaConstantesFunciones.generarExcelReporteDataProforma("RELACIONADO",row,workbook,proforma,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Consignacion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ConsignacionConstantesFunciones.SCLASSWEBTITULO))) {

				if(consignatario.getConsignacions()!=null && consignatario.getConsignacions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ConsignacionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ConsignacionConstantesFunciones.generarExcelReporteHeaderConsignacion("RELACIONADO",row,workbook);
				}

				if(consignatario.getConsignacions()!=null) {
					i2=0;
					for(Consignacion consignacion : consignatario.getConsignacions()) {
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


				//PedidoExpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoExporConstantesFunciones.SCLASSWEBTITULO))) {

				if(consignatario.getPedidoExpors()!=null && consignatario.getPedidoExpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoExporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoExporConstantesFunciones.generarExcelReporteHeaderPedidoExpor("RELACIONADO",row,workbook);
				}

				if(consignatario.getPedidoExpors()!=null) {
					i2=0;
					for(PedidoExpor pedidoexpor : consignatario.getPedidoExpors()) {
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
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConsignatarioConstantesFunciones.getConsignatarioDescripcion(consignatario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsignatario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConsignatario() throws Exception {		
		this.startProcessConsignatario(true);
	}
	
	public void startProcessConsignatario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConsignatario ,this.jPanelParametrosReportesConsignatario, this.jScrollPanelDatosConsignatario,this.jPanelPaginacionConsignatario, this.jScrollPanelDatosEdicionConsignatario, this.jPanelAccionesConsignatario,this.jPanelAccionesFormularioConsignatario,this.jmenuBarConsignatario,this.jmenuBarDetalleConsignatario,this.jTtoolBarConsignatario,this.jTtoolBarDetalleConsignatario);		
		
		final JTabbedPane jTabbedPaneBusquedasConsignatario=this.jTabbedPaneBusquedasConsignatario; 
		
		final JPanel jPanelParametrosReportesConsignatario=this.jPanelParametrosReportesConsignatario;
		//final JScrollPane jScrollPanelDatosConsignatario=this.jScrollPanelDatosConsignatario;
		final JTable jTableDatosConsignatario=this.jTableDatosConsignatario;		
		final JPanel jPanelPaginacionConsignatario=this.jPanelPaginacionConsignatario;
		//final JScrollPane jScrollPanelDatosEdicionConsignatario=this.jScrollPanelDatosEdicionConsignatario;
		final JPanel jPanelAccionesConsignatario=this.jPanelAccionesConsignatario;
		
		JPanel jPanelCamposAuxiliarConsignatario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConsignatario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) {
			jPanelCamposAuxiliarConsignatario=this.jInternalFrameDetalleFormConsignatario.jPanelCamposConsignatario;
			jPanelAccionesFormularioAuxiliarConsignatario=this.jInternalFrameDetalleFormConsignatario.jPanelAccionesFormularioConsignatario;
		}
		
		final JPanel jPanelCamposConsignatario=jPanelCamposAuxiliarConsignatario;
		final JPanel jPanelAccionesFormularioConsignatario=jPanelAccionesFormularioAuxiliarConsignatario;
		
		
		final JMenuBar jmenuBarConsignatario=this.jmenuBarConsignatario;
		final JToolBar jTtoolBarConsignatario=this.jTtoolBarConsignatario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConsignatario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsignatario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) {
			jmenuBarDetalleAuxiliarConsignatario=this.jInternalFrameDetalleFormConsignatario.jmenuBarDetalleConsignatario;
			jTtoolBarDetalleAuxiliarConsignatario=this.jInternalFrameDetalleFormConsignatario.jTtoolBarDetalleConsignatario;
		}
		
		final JMenuBar jmenuBarDetalleConsignatario=jmenuBarDetalleAuxiliarConsignatario;
		final JToolBar jTtoolBarDetalleConsignatario=jTtoolBarDetalleAuxiliarConsignatario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsignatario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsignatario;
			processRunnable.jTableDatos=jTableDatosConsignatario;
			processRunnable.jPanelCampos=jPanelCamposConsignatario;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsignatario;
			processRunnable.jPanelAcciones=jPanelAccionesConsignatario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsignatario;
			
			
			processRunnable.jmenuBar=jmenuBarConsignatario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsignatario;
			processRunnable.jTtoolBar=jTtoolBarConsignatario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsignatario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsignatario ,jPanelParametrosReportesConsignatario,jTableDatosConsignatario, /*jScrollPanelDatosConsignatario,*/jPanelCamposConsignatario,jPanelPaginacionConsignatario, /*jScrollPanelDatosEdicionConsignatario,*/ jPanelAccionesConsignatario,jPanelAccionesFormularioConsignatario,jmenuBarConsignatario,jmenuBarDetalleConsignatario,jTtoolBarConsignatario,jTtoolBarDetalleConsignatario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsignatario ,jPanelParametrosReportesConsignatario, jScrollPanelDatosConsignatario,jPanelPaginacionConsignatario, jScrollPanelDatosEdicionConsignatario, jPanelAccionesConsignatario,jPanelAccionesFormularioConsignatario,jmenuBarConsignatario,jmenuBarDetalleConsignatario,jTtoolBarConsignatario,jTtoolBarDetalleConsignatario);
						
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
	
	public void finishProcessConsignatario() {// throws Exception 
		this.finishProcessConsignatario(true);
	}
	
	public void finishProcessConsignatario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConsignatario ,this.jPanelParametrosReportesConsignatario, this.jScrollPanelDatosConsignatario,this.jPanelPaginacionConsignatario, this.jScrollPanelDatosEdicionConsignatario, this.jPanelAccionesConsignatario,this.jPanelAccionesFormularioConsignatario,this.jmenuBarConsignatario,this.jmenuBarDetalleConsignatario,this.jTtoolBarConsignatario,this.jTtoolBarDetalleConsignatario);		
		
		final JTabbedPane jTabbedPaneBusquedasConsignatario=this.jTabbedPaneBusquedasConsignatario; 
		
		final JPanel jPanelParametrosReportesConsignatario=this.jPanelParametrosReportesConsignatario;
		//final JScrollPane jScrollPanelDatosConsignatario=this.jScrollPanelDatosConsignatario;
		final JTable jTableDatosConsignatario=this.jTableDatosConsignatario;		
		final JPanel jPanelPaginacionConsignatario=this.jPanelPaginacionConsignatario;
		//final JScrollPane jScrollPanelDatosEdicionConsignatario=this.jScrollPanelDatosEdicionConsignatario;
		final JPanel jPanelAccionesConsignatario=this.jPanelAccionesConsignatario;
		
		JPanel jPanelCamposAuxiliarConsignatario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConsignatario=new JPanel();
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) {
			jPanelCamposAuxiliarConsignatario=this.jInternalFrameDetalleFormConsignatario.jPanelCamposConsignatario;
			jPanelAccionesFormularioAuxiliarConsignatario=this.jInternalFrameDetalleFormConsignatario.jPanelAccionesFormularioConsignatario;
		}
		
		final JPanel jPanelCamposConsignatario=jPanelCamposAuxiliarConsignatario;
		final JPanel jPanelAccionesFormularioConsignatario=jPanelAccionesFormularioAuxiliarConsignatario;
		
		
		final JMenuBar jmenuBarConsignatario=this.jmenuBarConsignatario;		
		final JToolBar jTtoolBarConsignatario=this.jTtoolBarConsignatario;
				
		JMenuBar jmenuBarDetalleAuxiliarConsignatario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsignatario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) {
			jmenuBarDetalleAuxiliarConsignatario=this.jInternalFrameDetalleFormConsignatario.jmenuBarDetalleConsignatario;
			jTtoolBarDetalleAuxiliarConsignatario=this.jInternalFrameDetalleFormConsignatario.jTtoolBarDetalleConsignatario;		
		}
		
		final JMenuBar jmenuBarDetalleConsignatario=jmenuBarDetalleAuxiliarConsignatario;
		final JToolBar jTtoolBarDetalleConsignatario=jTtoolBarDetalleAuxiliarConsignatario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsignatario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsignatario;
			processRunnable.jTableDatos=jTableDatosConsignatario;
			processRunnable.jPanelCampos=jPanelCamposConsignatario;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsignatario;
			processRunnable.jPanelAcciones=jPanelAccionesConsignatario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsignatario;
			
			
			processRunnable.jmenuBar=jmenuBarConsignatario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsignatario;
			processRunnable.jTtoolBar=jTtoolBarConsignatario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsignatario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConsignatario ,jPanelParametrosReportesConsignatario, jTableDatosConsignatario,/*jScrollPanelDatosConsignatario,*/jPanelCamposConsignatario,jPanelPaginacionConsignatario, /*jScrollPanelDatosEdicionConsignatario,*/ jPanelAccionesConsignatario,jPanelAccionesFormularioConsignatario,jmenuBarConsignatario,jmenuBarDetalleConsignatario,jTtoolBarConsignatario,jTtoolBarDetalleConsignatario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConsignatario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConsignatario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConsignatario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConsignatario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConsignatario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConsignatario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConsignatario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConsignatario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConsignatario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.consignatarioConstantesFunciones.getsFinalQueryConsignatario();
		String  finalQueryPaginacionTodos=this.consignatarioConstantesFunciones.getsFinalQueryConsignatario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConsignatarioConstantesFunciones.getArrayColumnasGlobalesNoConsignatario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConsignatarioConstantesFunciones.getArrayColumnasGlobalesConsignatario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConsignatarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.consignatariosEliminados= new ArrayList<Consignatario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConsignatario();
		
				///*ConsignatarioSessionBean*/this.consignatarioSessionBean=new ConsignatarioSessionBean();
			
			if(this.consignatarioSessionBean==null) {
				this.consignatarioSessionBean=new ConsignatarioSessionBean();
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
					this.iNumeroPaginacion=ConsignatarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConsignatarioConstantesFunciones.getClassesForeignKeysOfConsignatario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/consignatario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			consignatariosAux= new ArrayList<Consignatario>();
			
				
			consignatarioLogic.setDatosCliente(this.datosCliente);
			consignatarioLogic.setDatosDeep(this.datosDeep);
			consignatarioLogic.setIsConDeep(true);
			
			
			consignatarioLogic.getConsignatarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					consignatarioLogic.getTodosConsignatarios(finalQueryGlobal,pagination);
					
					//consignatarioLogic.getTodosConsignatariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(consignatarioLogic.getConsignatarios()==null|| consignatarioLogic.getConsignatarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							consignatariosAux= new ArrayList<Consignatario>();
							consignatariosAux.addAll(consignatarioLogic.getConsignatarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatariosAux= new ArrayList<Consignatario>();
							consignatariosAux.addAll(consignatarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							consignatarioLogic.getTodosConsignatarios(finalQueryGlobal+"",this.pagination);												
							
							//consignatarioLogic.getTodosConsignatariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteConsignatarios("Todos",consignatarioLogic.getConsignatarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							consignatarioLogic.setConsignatarios(new ArrayList<Consignatario>());					
							consignatarioLogic.getConsignatarios().addAll(consignatariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatarios=new ArrayList<Consignatario>();
							consignatarios.addAll(consignatariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idConsignatario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idConsignatario=this.idActual;
				
				} else if(this.idConsignatarioActual!=null && this.idConsignatarioActual!=0L) {
					idConsignatario=idConsignatarioActual;
				}
				
					
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndicePorId(idConsignatario);
				
				this.consignatarios=new ArrayList<Consignatario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					consignatarioLogic.getEntity(idConsignatario);
					
					//consignatarioLogic.getEntityWithConnection(idConsignatario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consignatarioLogic.setConsignatarios(new ArrayList<Consignatario>());
					consignatarioLogic.getConsignatarios().add(consignatarioLogic.getConsignatario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consignatarios=new ArrayList<Consignatario>();
					this.consignatarios.add(consignatario);
				}
				
				if(consignatarioLogic.getConsignatario()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					consignatarioLogic.getConsignatariosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=consignatarioLogic.getConsignatarios()==null||consignatarioLogic.getConsignatarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=consignatarios==null|| consignatarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatariosAux=new ArrayList<Consignatario>();
						consignatariosAux.addAll(consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatariosAux=new ArrayList<Consignatario>();
							consignatariosAux.addAll(consignatarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							consignatarioLogic.getConsignatariosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConsignatarios("FK_IdCliente",consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConsignatarios("FK_IdCliente",consignatarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatarioLogic.setConsignatarios(new ArrayList<Consignatario>());
						consignatarioLogic.getConsignatarios().addAll(consignatariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatarios=new ArrayList<Consignatario>();
							consignatarios.addAll(consignatariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					consignatarioLogic.getConsignatariosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=consignatarioLogic.getConsignatarios()==null||consignatarioLogic.getConsignatarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=consignatarios==null|| consignatarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatariosAux=new ArrayList<Consignatario>();
						consignatariosAux.addAll(consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatariosAux=new ArrayList<Consignatario>();
							consignatariosAux.addAll(consignatarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							consignatarioLogic.getConsignatariosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConsignatarios("FK_IdEmpresa",consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConsignatarios("FK_IdEmpresa",consignatarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatarioLogic.setConsignatarios(new ArrayList<Consignatario>());
						consignatarioLogic.getConsignatarios().addAll(consignatariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatarios=new ArrayList<Consignatario>();
							consignatarios.addAll(consignatariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					consignatarioLogic.getConsignatariosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=consignatarioLogic.getConsignatarios()==null||consignatarioLogic.getConsignatarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=consignatarios==null|| consignatarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatariosAux=new ArrayList<Consignatario>();
						consignatariosAux.addAll(consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatariosAux=new ArrayList<Consignatario>();
							consignatariosAux.addAll(consignatarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							consignatarioLogic.getConsignatariosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConsignatarios("FK_IdSucursal",consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConsignatarios("FK_IdSucursal",consignatarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatarioLogic.setConsignatarios(new ArrayList<Consignatario>());
						consignatarioLogic.getConsignatarios().addAll(consignatariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatarios=new ArrayList<Consignatario>();
							consignatarios.addAll(consignatariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					consignatarioLogic.getConsignatariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=consignatarioLogic.getConsignatarios()==null||consignatarioLogic.getConsignatarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=consignatarios==null|| consignatarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatariosAux=new ArrayList<Consignatario>();
						consignatariosAux.addAll(consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatariosAux=new ArrayList<Consignatario>();
							consignatariosAux.addAll(consignatarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							consignatarioLogic.getConsignatariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsignatarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConsignatarios("FK_IdUsuario",consignatarioLogic.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConsignatarios("FK_IdUsuario",consignatarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatarioLogic.setConsignatarios(new ArrayList<Consignatario>());
						consignatarioLogic.getConsignatarios().addAll(consignatariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatarios=new ArrayList<Consignatario>();
							consignatarios.addAll(consignatariosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConsignatario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConsignatario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consignatarioLogic.getConsignatarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consignatarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consignatarioLogic.getConsignatarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consignatarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Consignatario consignatario) {
		Boolean permite=true;
		
		if(this.consignatario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConsignatarioConstantesFunciones.getOrderByListaConsignatario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConsignatarioConstantesFunciones.getOrderByListaConsignatario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consignatario consignatario:consignatarioLogic.getConsignatarios()) {
				if(consignatario.getsType().equals(Constantes2.S_TOTALES)) {
					consignatarioTotales=consignatario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consignatario consignatario:this.consignatarios) {
				if(consignatario.getsType().equals(Constantes2.S_TOTALES)) {
					consignatarioTotales=consignatario;
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
			this.consignatarioAux=new Consignatario();
			this.consignatarioAux.setsType(Constantes2.S_TOTALES);
			this.consignatarioAux.setIsNew(false);
			this.consignatarioAux.setIsChanged(false);
			this.consignatarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ConsignatarioConstantesFunciones.TotalizarValoresFilaConsignatario(this.consignatarioLogic.getConsignatarios(),this.consignatarioAux);
				
				this.consignatarioLogic.getConsignatarios().add(this.consignatarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConsignatarioConstantesFunciones.TotalizarValoresFilaConsignatario(this.consignatarios,this.consignatarioAux);
				
				this.consignatarios.add(this.consignatarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		consignatarioTotales=new Consignatario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consignatarioLogic.getConsignatarios().remove(consignatarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consignatarios.remove(consignatarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		consignatarioTotales=new Consignatario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consignatario consignatario:consignatarioLogic.getConsignatarios()) {
				if(consignatario.getsType().equals(Constantes2.S_TOTALES)) {
					consignatarioTotales=consignatario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsignatarioConstantesFunciones.TotalizarValoresFilaConsignatario(this.consignatarioLogic.getConsignatarios(),consignatarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consignatario consignatario:this.consignatarios) {
				if(consignatario.getsType().equals(Constantes2.S_TOTALES)) {
					consignatarioTotales=consignatario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsignatarioConstantesFunciones.TotalizarValoresFilaConsignatario(this.consignatarios,consignatarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConsignatariosFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsignatariosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsignatariosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsignatariosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConsignatariosFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consignatarioLogic.getConsignatariosFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsignatariosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consignatarioLogic.getConsignatariosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsignatariosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consignatarioLogic.getConsignatariosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsignatariosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consignatarioLogic.getConsignatariosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosConsignatario() {
		this.isPermisoTodoConsignatario=false;
		this.isPermisoNuevoConsignatario=false;
		this.isPermisoActualizarConsignatario=false;
		this.isPermisoActualizarOriginalConsignatario=false;
		this.isPermisoEliminarConsignatario=false;
		this.isPermisoGuardarCambiosConsignatario=false;
		this.isPermisoConsultaConsignatario=false;
		this.isPermisoBusquedaConsignatario=false;
		this.isPermisoReporteConsignatario=false;		
		this.isPermisoOrdenConsignatario=false;		
		this.isPermisoPaginacionMedioConsignatario=false;		
		this.isPermisoPaginacionAltoConsignatario=false;
		this.isPermisoPaginacionTodoConsignatario=false;
		this.isPermisoCopiarConsignatario=false;		
		this.isPermisoVerFormConsignatario=false;		
		this.isPermisoDuplicarConsignatario=false;		
		this.isPermisoOrdenConsignatario=false;		
	}
	
	public void setPermisosUsuarioConsignatario(Boolean isPermiso) {
		this.isPermisoTodoConsignatario=isPermiso;
		this.isPermisoNuevoConsignatario=isPermiso;
		this.isPermisoActualizarConsignatario=isPermiso;
		this.isPermisoActualizarOriginalConsignatario=isPermiso;
		this.isPermisoEliminarConsignatario=isPermiso;
		this.isPermisoGuardarCambiosConsignatario=isPermiso;
		this.isPermisoConsultaConsignatario=isPermiso;
		this.isPermisoBusquedaConsignatario=isPermiso;
		this.isPermisoReporteConsignatario=isPermiso;
		this.isPermisoOrdenConsignatario=isPermiso;		
		this.isPermisoPaginacionMedioConsignatario=isPermiso;		
		this.isPermisoPaginacionAltoConsignatario=isPermiso;		
		this.isPermisoPaginacionTodoConsignatario=isPermiso;		
		this.isPermisoCopiarConsignatario=isPermiso;		
		this.isPermisoVerFormConsignatario=isPermiso;		
		this.isPermisoDuplicarConsignatario=isPermiso;
		this.isPermisoOrdenConsignatario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConsignatario(Boolean isPermiso) {
		//this.isPermisoTodoConsignatario=isPermiso;
		this.isPermisoNuevoConsignatario=isPermiso;
		this.isPermisoActualizarConsignatario=isPermiso;
		this.isPermisoActualizarOriginalConsignatario=isPermiso;
		this.isPermisoEliminarConsignatario=isPermiso;
		this.isPermisoGuardarCambiosConsignatario=isPermiso;
		//this.isPermisoConsultaConsignatario=isPermiso;
		//this.isPermisoBusquedaConsignatario=isPermiso;
		//this.isPermisoReporteConsignatario=isPermiso;
		//this.isPermisoOrdenConsignatario=isPermiso;		
		//this.isPermisoPaginacionMedioConsignatario=isPermiso;		
		//this.isPermisoPaginacionAltoConsignatario=isPermiso;		
		//this.isPermisoPaginacionTodoConsignatario=isPermiso;		
		//this.isPermisoCopiarConsignatario=isPermiso;		
		//this.isPermisoDuplicarConsignatario=isPermiso;
		//this.isPermisoOrdenConsignatario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConsignatarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProformaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ConsignacionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PedidoExporConstantesFunciones.SNOMBREOPCION);
		
		if(ConsignatarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProforma=false;
		this.isTienePermisosProforma=this.verificarGetPermisosUsuarioOpcionConsignatarioClaseRelacionada(this.opcionsRelacionadas,ProformaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosConsignacion=false;
		this.isTienePermisosConsignacion=this.verificarGetPermisosUsuarioOpcionConsignatarioClaseRelacionada(this.opcionsRelacionadas,ConsignacionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPedidoExpor=false;
		this.isTienePermisosPedidoExpor=this.verificarGetPermisosUsuarioOpcionConsignatarioClaseRelacionada(this.opcionsRelacionadas,PedidoExporConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebConsignatario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConsignatarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProforma=conPermiso;
		this.isTienePermisosConsignacion=conPermiso;
		this.isTienePermisosPedidoExpor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioConsignatarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConsignatarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConsignatarioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProforma && this.jInternalFrameDetalleFormConsignatario!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.remove(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosConsignacion && this.jInternalFrameDetalleFormConsignatario!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.remove(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPedidoExpor && this.jInternalFrameDetalleFormConsignatario!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.remove(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioConsignatario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConsignatarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConsignatarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConsignatario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConsignatario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConsignatario=this.isPermisoActualizarConsignatario;
			this.isPermisoEliminarConsignatario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConsignatario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConsignatario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConsignatario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConsignatario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConsignatario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsignatario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConsignatario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConsignatario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConsignatario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConsignatario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConsignatario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConsignatario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsignatario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConsignatario.setToolTipText(this.jTableDatosConsignatario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConsignatario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConsignatario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConsignatarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConsignatarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConsignatario() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProforma && this.consignatarioConstantesFunciones.mostrarProformaConsignatario && !ConsignatarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Proforma");
			reporte.setsDescripcion("Proforma");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosConsignacion && this.consignatarioConstantesFunciones.mostrarConsignacionConsignatario && !ConsignatarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Consignacion");
			reporte.setsDescripcion("Consignacion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPedidoExpor && this.consignatarioConstantesFunciones.mostrarPedidoExporConsignatario && !ConsignatarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Exportacion");
			reporte.setsDescripcion("Pedido Exportacion");
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
	public void inicializarCombosForeignKeyConsignatarioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConsignatarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConsignatarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyConsignatarioListas(false);
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
	
	public void cargarCombosLoteForeignKeyConsignatarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ConsignatarioParameterReturnGeneral consignatarioReturnGeneral=new ConsignatarioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.consignatarioConstantesFunciones.cargarid_empresaConsignatario)
					 || (this.esRecargarFks && this.consignatarioConstantesFunciones.cargarid_empresaConsignatario)) {

					if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+consignatarioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.consignatarioConstantesFunciones.cargarid_sucursalConsignatario)
					 || (this.esRecargarFks && this.consignatarioConstantesFunciones.cargarid_sucursalConsignatario)) {

					if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+consignatarioSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.consignatarioConstantesFunciones.cargarid_clienteConsignatario)
					 || (this.esRecargarFks && this.consignatarioConstantesFunciones.cargarid_clienteConsignatario)) {

					if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+consignatarioSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.consignatarioConstantesFunciones.cargarid_usuarioConsignatario)
					 || (this.esRecargarFks && this.consignatarioConstantesFunciones.cargarid_usuarioConsignatario)) {

					if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+consignatarioSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				consignatarioReturnGeneral=consignatarioLogic.cargarCombosLoteForeignKeyConsignatario(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente,finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=consignatarioReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=consignatarioReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=consignatarioReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=consignatarioReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyConsignatario()throws Exception {
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
			if(this.consignatarioSessionBean==null) {
				this.consignatarioSessionBean=new ConsignatarioSessionBean();
			}

			if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

			if(!this.consignatarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
	
	public void initActionsCombosTodosForeignKeyConsignatario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConsignatario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConsignatario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsignatario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConsignatario(Consignatario consignatario)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(consignatario.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConsignatario(Consignatario consignatario,String sTipoEvento)throws Exception {	
		try {
			
			

				if(consignatario.getCliente()!=null && !sTipoEvento.equals("id_clienteConsignatario")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(consignatario.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConsignatario()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.consignatarioConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConsignatario()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConsignatario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConsignatario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConsignatario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConsignatario()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConsignatario(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConsignatario()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario!=null && this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario!=null && this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario!=null && this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario!=null && this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ConsignatarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConsignatarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConsignatarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.consignatarioSessionBean=new ConsignatarioSessionBean(); 
		this.consignatarioConstantesFunciones=new ConsignatarioConstantesFunciones(); 
		this.consignatarioBean=new Consignatario();//(this.consignatarioConstantesFunciones); 		
		this.consignatarioReturnGeneral=new ConsignatarioParameterReturnGeneral(); 
		
		this.consignatarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consignatarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConsignatarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConsignatarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConsignatarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConsignatario(true);
			
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
			
			this.consignatarioConstantesFunciones=new ConsignatarioConstantesFunciones(); 
			this.consignatarioBean=new Consignatario();//this.consignatarioConstantesFunciones); 			
			this.consignatarioReturnGeneral=new ConsignatarioParameterReturnGeneral(); 
		
			ConsignatarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consignatario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.consignatario=new Consignatario();
			this.consignatarios = new ArrayList<Consignatario>();
			this.consignatariosAux = new ArrayList<Consignatario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic=new ConsignatarioLogic();
				this.consignatarioLogic.getNewConnexionToDeep("");
			}
			
			//this.consignatarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.consignatarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConsignatario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConsignatario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsignatario);	
					}
					
					if(this.jInternalFrameImportacionConsignatario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsignatario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConsignatario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConsignatario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConsignatario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConsignatario);
				this.jInternalFrameDetalleFormConsignatario.setVisible(false);
				this.jInternalFrameDetalleFormConsignatario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConsignatario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsignatario);
					this.jInternalFrameReporteDinamicoConsignatario.setVisible(false);
					this.jInternalFrameReporteDinamicoConsignatario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConsignatario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConsignatario);
					this.jInternalFrameImportacionConsignatario.setVisible(false);
					this.jInternalFrameImportacionConsignatario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConsignatario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConsignatario);
					this.jInternalFrameOrderByConsignatario.setVisible(false);
					this.jInternalFrameOrderByConsignatario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConsignatarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConsignatarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.consignatarioReturnGeneral=new ConsignatarioParameterReturnGeneral();
			
			this.consignatarioParameterGeneral=new ConsignatarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.consignatarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConsignatarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProformaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ConsignacionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PedidoExporConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsignatarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consignatarioSessionBean.getEsGuardarRelacionado(),this.consignatarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsignatarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consignatarioSessionBean.getEsGuardarRelacionado(),this.consignatarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConsignatario=false;
			this.isVisibilidadCeldaDuplicarConsignatario=true;
			this.isVisibilidadCeldaCopiarConsignatario=true;
			this.isVisibilidadCeldaVerFormConsignatario=true;
			this.isVisibilidadCeldaOrdenConsignatario=true;
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=false;
			this.isVisibilidadCeldaModificarConsignatario=false;
			this.isVisibilidadCeldaActualizarConsignatario=false;
			this.isVisibilidadCeldaEliminarConsignatario=false;
			this.isVisibilidadCeldaCancelarConsignatario=false;
			this.isVisibilidadCeldaGuardarConsignatario=false;
			this.isVisibilidadCeldaGuardarCambiosConsignatario=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConsignatario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConsignatario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConsignatario(false);
			
			this.setPermisosUsuarioConsignatario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consignatarioSessionBean.getEsGuardarRelacionado() 
				|| (this.consignatarioSessionBean.getEsGuardarRelacionado() && this.consignatarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConsignatarioClasesRelacionadas();
			}
			
			if(this.consignatarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConsignatarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConsignatario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConsignatario();
			}
			
			if(!this.isPermisoBusquedaConsignatario) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConsignatario.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioConsignatario,this.isPermisoPaginacionMedioConsignatario,this.isPermisoPaginacionTodoConsignatario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConsignatarioConstantesFunciones.getTiposSeleccionarConsignatario());
				
				this.tiposColumnasSelect=ConsignatarioConstantesFunciones.getTiposSeleccionarConsignatario(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectConsignatario();				
				//this.tiposRelacionesSelect=ConsignatarioConstantesFunciones.getTiposRelacionesConsignatario(true);
				
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
			//if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConsignatario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioConsignatario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioConsignatario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConsignatario() ;
			
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
			
			
			this.proformaLogic=new ProformaLogic();
			this.consignacionLogic=new ConsignacionLogic();
			this.pedidoexporLogic=new PedidoExporLogic(); 
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
				consignatarioImplementable= (ConsignatarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsignatarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				consignatarioImplementableHome= (ConsignatarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsignatarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.consignatarios= new ArrayList<Consignatario>();
			this.consignatariosEliminados= new ArrayList<Consignatario>();
						
			this.isEsNuevoConsignatario=false;
			this.esParaAccionDesdeFormularioConsignatario=false;
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
				this.cargarCombosForeignKeyConsignatario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConsignatario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConsignatarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConsignatarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConsignatario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConsignatario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConsignatario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConsignatario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConsignatario();
			}
			
			ConsignatarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConsignatario.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConsignatario.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConsignatario.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConsignatario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Consignatario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConsignatario() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProformaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProformaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConsignatario")) {
				iIndex=this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();	
				
				

				if(sTitle.equals("Consignacions")) {
					if(!ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConsignatario();

						this.cargarParteTabPanelRelacionadaConsignacion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedido Exportacions")) {
					if(!PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConsignatario();

						this.cargarParteTabPanelRelacionadaPedidoExpor(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Proformas")) {
					if(!ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConsignatario();

						this.cargarParteTabPanelRelacionadaProforma(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConsignatario();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaConsignacion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConsignatario.cargarSessionConBeanSwingJInternalFrameConsignacion(false,true,iIndex);
		this.jButtonConsignacionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaConsignacion();

		//this.jTabbedPaneRelacionesConsignatario.updateUI();
		//this.jTabbedPaneRelacionesConsignatario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConsignatario.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedidoExpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConsignatario.cargarSessionConBeanSwingJInternalFramePedidoExpor(false,true,iIndex);
		this.jButtonPedidoExporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoExpor();

		//this.jTabbedPaneRelacionesConsignatario.updateUI();
		//this.jTabbedPaneRelacionesConsignatario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConsignatario.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProforma(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConsignatario.cargarSessionConBeanSwingJInternalFrameProforma(false,true,iIndex);
		this.jButtonProformaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProforma();

		//this.jTabbedPaneRelacionesConsignatario.updateUI();
		//this.jTabbedPaneRelacionesConsignatario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConsignatario.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Proforma")) {
				int row=this.jTableDatosConsignatario.getSelectedRow();
				jButtonProformaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Consignacion")) {
				int row=this.jTableDatosConsignatario.getSelectedRow();
				jButtonConsignacionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PedidoExpor")) {
				int row=this.jTableDatosConsignatario.getSelectedRow();
				jButtonPedidoExporActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Proforma")) {

					if(this.isTienePermisosProforma && this.consignatarioConstantesFunciones.mostrarProformaConsignatario && !ConsignatarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Proformas"+"("+ProformaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Proformas");

						if(consignatarioConstantesFunciones.resaltarProformaConsignatario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(consignatarioConstantesFunciones.resaltarProformaConsignatario);
						}

						jmenuItem.setEnabled(this.consignatarioConstantesFunciones.activarProformaConsignatario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Proforma"));

						

						this.jInternalFrameDetalleFormConsignatario.jmenuDetalleConsignatario.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Consignacion")) {

					if(this.isTienePermisosConsignacion && this.consignatarioConstantesFunciones.mostrarConsignacionConsignatario && !ConsignatarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Consignacions"+"("+ConsignacionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Consignacions");

						if(consignatarioConstantesFunciones.resaltarConsignacionConsignatario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(consignatarioConstantesFunciones.resaltarConsignacionConsignatario);
						}

						jmenuItem.setEnabled(this.consignatarioConstantesFunciones.activarConsignacionConsignatario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Consignacion"));

						

						this.jInternalFrameDetalleFormConsignatario.jmenuDetalleConsignatario.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pedido Exportacion")) {

					if(this.isTienePermisosPedidoExpor && this.consignatarioConstantesFunciones.mostrarPedidoExporConsignatario && !ConsignatarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Exportacions"+"("+PedidoExporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Exportacions");

						if(consignatarioConstantesFunciones.resaltarPedidoExporConsignatario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(consignatarioConstantesFunciones.resaltarPedidoExporConsignatario);
						}

						jmenuItem.setEnabled(this.consignatarioConstantesFunciones.activarPedidoExporConsignatario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoExpor"));

						

						this.jInternalFrameDetalleFormConsignatario.jmenuDetalleConsignatario.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyConsignatario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConsignatario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConsignatario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConsignatarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConsignatario();
		
		this.cargarCombosFrameForeignKeyConsignatario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConsignatario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConsignatario();
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
	
	public void jButtonNuevoConsignatarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.consignatarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
			
			if(jTableDatosConsignatario.getRowCount()>=1) {
				jTableDatosConsignatario.removeRowSelectionInterval(0, jTableDatosConsignatario.getRowCount()-1);						
			}
			
			this.isEsNuevoConsignatario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConsignatario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConsignatario(true);			
			//this.consignatario=new Consignatario();
			//this.consignatario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsignatario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsignatario() ;
			
			if(ConsignatarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsignatario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.consignatario);	
			this.actualizarInformacion("INFO_PADRE",false,this.consignatario);				
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
			if(this.consignatarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Consignatario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConsignatarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConsignatario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConsignatario.getSelectedRows().length;			
			}
			
			consignatariosSeleccionados=this.getConsignatariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConsignatario--;			
				//Consignatario consignatarioAux= new Consignatario();			
				//consignatarioAux.setId(this.iIdNuevoConsignatario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Consignatario consignatarioOrigen=new Consignatario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Consignatario consignatarioOrigen : consignatariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							consignatarioOrigen =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consignatarioOrigen =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConsignatario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.consignatario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConsignatario(consignatarioOrigen,this.consignatario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consignatarioLogic.getConsignatarios().add(this.consignatarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consignatarios.add(this.consignatarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConsignatario(false);
				
				this.jTableDatosConsignatario.setRowSelectionInterval(this.getIndiceNuevoConsignatario(), this.getIndiceNuevoConsignatario());
				
				int iLastRow =  this.jTableDatosConsignatario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsignatario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsignatario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsignatario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();									
		
			Consignatario consignatarioOrigen=new Consignatario();
			Consignatario consignatarioDestino=new Consignatario();
				
			consignatariosSeleccionados=this.getConsignatariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConsignatario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || consignatariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConsignatario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatarioOrigen =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consignatarioOrigen =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consignatarioDestino =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consignatarioDestino =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				consignatarioOrigen =consignatariosSeleccionados.get(0);
				consignatarioDestino =consignatariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConsignatario(consignatarioOrigen,consignatarioDestino,true,false);
				
				consignatarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(consignatarioDestino,consignatarioLogic.getConsignatarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consignatarioDestino,consignatarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConsignatario(false);
				
				//this.jTableDatosConsignatario.setRowSelectionInterval(this.getIndiceNuevoConsignatario(), this.getIndiceNuevoConsignatario());
				
				int iLastRow =  this.jTableDatosConsignatario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsignatario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsignatario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsignatario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConsignatario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConsignatario.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConsignatario.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConsignatario.setVisible(!isVisible);
			this.jPanelPaginacionConsignatario.setVisible(!isVisible);
			this.jPanelAccionesConsignatario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConsignatario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConsignatario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConsignatario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConsignatario();
			
			this.abrirFrameOrderByConsignatario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConsignatario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConsignatario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsignatario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConsignatario.isMaximum()) {
					this.jInternalFrameDetalleFormConsignatario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConsignatario.setSize(this.jInternalFrameDetalleFormConsignatario.iWidthFormulario,this.jInternalFrameDetalleFormConsignatario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConsignatario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConsignatario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConsignatario.isMaximum()) {
						this.jInternalFrameDetalleFormConsignatario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConsignatario.jContentPaneDetalleConsignatario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConsignatario.jContentPaneDetalleConsignatario.getWidth(),ConsignatarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConsignatario.jContentPaneDetalleConsignatario.getWidth(),ConsignatarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConsignatario.jContentPaneDetalleConsignatario.getWidth(),ConsignatarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaConsignacion();
					}

					if(PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoExpor();
					}

					if(ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProforma();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConsignatario.setVisible(true);
	        this.jInternalFrameDetalleFormConsignatario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConsignatario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConsignatario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConsignatario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsignatario,false,this);
				} else {
					this.jInternalFrameOrderByConsignatario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsignatario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConsignatario);
				this.jInternalFrameOrderByConsignatario.setVisible(false);
				this.jInternalFrameOrderByConsignatario.setSelected(false);
				
				this.jInternalFrameOrderByConsignatario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsignatario"));
				
				this.inicializarActualizarBindingTablaOrderByConsignatario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConsignatario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConsignatario==null) {
				
				this.jInternalFrameImportacionConsignatario=new ImportacionJInternalFrame(ConsignatarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsignatario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConsignatario);
				this.jInternalFrameImportacionConsignatario.setVisible(false);
				this.jInternalFrameImportacionConsignatario.setSelected(false);


				this.jInternalFrameImportacionConsignatario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsignatario"));
				this.jInternalFrameImportacionConsignatario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsignatario"));
				this.jInternalFrameImportacionConsignatario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsignatario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConsignatario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConsignatario==null) {
				this.jInternalFrameReporteDinamicoConsignatario=new ReporteDinamicoJInternalFrame(ConsignatarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsignatario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsignatario);
				this.jInternalFrameReporteDinamicoConsignatario.setVisible(false);
				this.jInternalFrameReporteDinamicoConsignatario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConsignatario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsignatario"));
				this.jInternalFrameReporteDinamicoConsignatario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsignatario"));
				this.jInternalFrameReporteDinamicoConsignatario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsignatario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsignatario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaConsignacion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConsignatario.jContentPaneDetalleConsignatario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedidoExpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConsignatario.jContentPaneDetalleConsignatario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProforma() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConsignatario.jContentPaneDetalleConsignatario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleConsignatario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsignatario);
			
	       	this.jInternalFrameDetalleFormConsignatario.setVisible(false);
	        this.jInternalFrameDetalleFormConsignatario.setSelected(false);
			
			//this.jInternalFrameDetalleFormConsignatario.dispose();
			//this.jInternalFrameDetalleFormConsignatario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConsignatario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConsignatario.setVisible(true);
	        this.jInternalFrameReporteDinamicoConsignatario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConsignatario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConsignatario.setVisible(true);
	        this.jInternalFrameImportacionConsignatario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConsignatario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConsignatario.setVisible(true);
	        this.jInternalFrameOrderByConsignatario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConsignatario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConsignatario.setVisible(false);
	        this.jInternalFrameOrderByConsignatario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConsignatario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConsignatario.setVisible(false);
	        this.jInternalFrameReporteDinamicoConsignatario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConsignatario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConsignatario.setVisible(false);
	        this.jInternalFrameImportacionConsignatario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConsignatario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConsignatario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConsignatario(true);
			//this.isEsNuevoConsignatario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConsignatario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsignatario(false) ;
			
			if(consignatarioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaSessionBean.getEsGuardarRelacionado() && ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProformaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionSessionBean.getEsGuardarRelacionado() && ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConsignacionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado() && PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoExporActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ConsignatarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsignatario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsignatario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConsignatarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConsignatario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConsignatario(true);
			//this.isEsNuevoConsignatario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.consignatario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConsignatario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConsignatario(false) ;
			
			if(ConsignatarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsignatario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsignatario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.consignatarioConstantesFunciones.cargarid_clienteConsignatario) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingConsignatario(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,ConsignatarioConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsignatario.getSelectedRow();

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
	
	public void jButtonActualizarConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConsignatario(false);
			
			//if(!this.isEsNuevoConsignatario) {								
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				
			}
			
			if(this.permiteMantenimiento(this.consignatario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConsignatario=true;
					this.inicializarActualizarBindingTablaConsignatario(false);
					this.isEsNuevoConsignatario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConsignatario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConsignatario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsignatario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsignatario(false);
				
				this.habilitarDeshabilitarControlesConsignatario(false);
			
												
				
				if(ConsignatarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConsignatario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConsignatarioActionPerformed(evt,consignatarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConsignatario(this.consignatario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConsignatario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,consignatarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.consignatario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConsignatarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				this.consignatario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				this.consignatario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.consignatario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConsignatarioModel) this.jTableDatosConsignatario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConsignatario=true;
				this.inicializarActualizarBindingTablaConsignatario(false);
				this.isEsNuevoConsignatario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsignatario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsignatario(false);
				
				this.habilitarDeshabilitarControlesConsignatario(false);
				
				
				
				if(ConsignatarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConsignatario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConsignatarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConsignatario.getRowCount()>=1) {
				jTableDatosConsignatario.removeRowSelectionInterval(0, jTableDatosConsignatario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConsignatario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConsignatario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsignatario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsignatario(false) ;
			
			this.isEsNuevoConsignatario=false;
			
			if(ConsignatarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConsignatario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConsignatarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConsignatario(false);
				
				//SI ES MANUAL
				if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConsignatario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConsignatarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConsignatario--;			
			//Consignatario consignatarioAux= new Consignatario();			
			//consignatarioAux.setId(this.iIdNuevoConsignatario);
			
			if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConsignatario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
			
			this.consignatario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.consignatarioLogic.getConsignatarios().add(this.consignatarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.consignatarios.add(this.consignatarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConsignatario(false);
			
			this.jTableDatosConsignatario.setRowSelectionInterval(this.getIndiceNuevoConsignatario(), this.getIndiceNuevoConsignatario());
			
			int iLastRow =  this.jTableDatosConsignatario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConsignatario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConsignatario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConsignatario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConsignatarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConsignatario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsignatario(false);
			
			//SI ES MANUAL
			if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsignatario();
			}
			
			//this.abrirFrameTreeConsignatario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConsignatarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ConsignatarioS ?", "MANTENIMIENTO DE Consignatario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionConsignatario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralConsignatario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.consignatarioReturnGeneral=consignatarioLogic.procesarImportacionConsignatariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.consignatarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarConsignatarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConsignatarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConsignatario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConsignatario.setFileImportacion(this.jInternalFrameImportacionConsignatario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConsignatario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConsignatario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConsignatario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConsignatario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConsignatarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();		

		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConsignatarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConsignatarioBaseDesign.jrxml";
			
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
			
			this.generarReporteConsignatarios("Todos",consignatariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsignatarioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsignatarioConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsignatarioConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsignatarioConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConsignatario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConsignatarioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ConsignatarioConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConsignatarioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ConsignatarioConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsignatarioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ConsignatarioConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apello",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
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
	
	public void jButtonGenerarExcelReporteDinamicoConsignatarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();		
		
		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consignatario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Consignatarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConsignatarioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Consignatario consignatario:consignatariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consignatario.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Consignatario consignatario:consignatariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consignatario.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(Consignatario consignatario:consignatariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consignatario.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsignatarioConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(Consignatario consignatario:consignatariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consignatario.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(Consignatario consignatario:consignatariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consignatario.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsignatarioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Consignatario consignatario:consignatariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consignatario.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsignatarioConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(Consignatario consignatario:consignatariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consignatario.getapellido());
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
			//	this.getFilaCabeceraExportarExcelConsignatario(row);				
			//	iRow++;
			//}				
			
			//for(Consignatario consignatarioAux:consignatariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConsignatario(consignatarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
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
				this.consignatarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsignatario(false);
			
			//SI ES MANUAL
			if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsignatario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConsignatarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsignatario(false);
			
			//SI ES MANUAL
			if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsignatario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConsignatarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsignatario(false);
			
			//SI ES MANUAL
			if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsignatario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConsignatario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConsignatario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConsignatario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConsignatario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConsignatario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConsignatario.setMinimumSize(dimensionMinimum);
		this.jTableDatosConsignatario.setMaximumSize(dimensionMaximum);
		this.jTableDatosConsignatario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConsignatario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConsignatario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConsignatario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConsignatario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConsignatario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConsignatario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsignatario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConsignatario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConsignatario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConsignatario();
		
		this.inicializarActualizarBindingBotonesManualConsignatario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConsignatario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsignatario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConsignatario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConsignatario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConsignatario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConsignatario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConsignatario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConsignatario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConsignatario.jCheckBoxPostAccionNuevoConsignatario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConsignatario.jCheckBoxPostAccionSinCerrarConsignatario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConsignatario.jCheckBoxPostAccionSinMensajeConsignatario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConsignatario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConsignatario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConsignatario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConsignatario!=null) {
				this.jInternalFrameDetalleFormConsignatario.jCheckBoxPostAccionNuevoConsignatario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConsignatario.jCheckBoxPostAccionSinCerrarConsignatario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConsignatario.jCheckBoxPostAccionSinMensajeConsignatario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConsignatario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConsignatario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConsignatario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConsignatario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConsignatario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConsignatario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConsignatario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConsignatario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConsignatario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConsignatario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConsignatario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConsignatario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConsignatario(Boolean esInicializar) throws Exception {
		try	{	
			if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConsignatario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConsignatario() throws Exception {
		try	{
			if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConsignatario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsignatario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConsignatario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConsignatario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConsignatario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConsignatario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConsignatario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConsignatario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConsignatario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConsignatario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConsignatario.addItem(reporte);
			}
			
			
			if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConsignatario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConsignatario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConsignatario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConsignatario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConsignatario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConsignatario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConsignatario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConsignatario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConsignatario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsignatario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsignatario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsignatario!=null) {
				this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsignatario!=null) {
				this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsignatario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConsignatario!=null) {
				
				if(this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsignatario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConsignatario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsignatario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsignatario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConsignatario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteConsignatario.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteConsignatario.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConsignatario(Boolean esInicializar) throws Exception {				
		if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConsignatario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConsignatario() throws Exception {
		this.inicializarActualizarBindingTablaConsignatario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConsignatario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConsignatarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConsignatario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=consignatarioLogic.getConsignatarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=consignatarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConsignatario.setModel(new ConsignatarioModel(this.consignatarioLogic.getConsignatarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConsignatario.setModel(new ConsignatarioModel(this.consignatarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConsignatario!=null && this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConsignatario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO,consignatarioConstantesFunciones.resaltarSeleccionarConsignatario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO,consignatarioConstantesFunciones.resaltarSeleccionarConsignatario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,ConsignatarioConstantesFunciones.LABEL_ID));

		if(this.consignatarioConstantesFunciones.mostraridConsignatario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsignatarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consignatarioConstantesFunciones.resaltaridConsignatario,this.consignatarioConstantesFunciones.activaridConsignatario,this,true,"idConsignatario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consignatarioConstantesFunciones.resaltaridConsignatario,this.consignatarioConstantesFunciones.activaridConsignatario,this,true,"idConsignatario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,ConsignatarioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.consignatarioConstantesFunciones.mostrarid_empresaConsignatario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsignatarioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.consignatarioConstantesFunciones.resaltarid_empresaConsignatario,this,this.consignatarioConstantesFunciones.activarid_empresaConsignatario));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.consignatarioConstantesFunciones.resaltarid_empresaConsignatario,this,this.consignatarioConstantesFunciones.activarid_empresaConsignatario,false,"id_empresaConsignatario","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.consignatarioConstantesFunciones.mostrarid_sucursalConsignatario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.consignatarioConstantesFunciones.resaltarid_sucursalConsignatario,this,this.consignatarioConstantesFunciones.activarid_sucursalConsignatario));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.consignatarioConstantesFunciones.resaltarid_sucursalConsignatario,this,this.consignatarioConstantesFunciones.activarid_sucursalConsignatario,false,"id_sucursalConsignatario","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,ConsignatarioConstantesFunciones.LABEL_IDCLIENTE));

		if(this.consignatarioConstantesFunciones.mostrarid_clienteConsignatario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsignatarioConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.consignatarioConstantesFunciones.resaltarid_clienteConsignatario,this,this.consignatarioConstantesFunciones.activarid_clienteConsignatario));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.consignatarioConstantesFunciones.resaltarid_clienteConsignatario,this,this.consignatarioConstantesFunciones.activarid_clienteConsignatario,true,"id_clienteConsignatario","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,ConsignatarioConstantesFunciones.LABEL_IDUSUARIO));

		if(this.consignatarioConstantesFunciones.mostrarid_usuarioConsignatario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsignatarioConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.consignatarioConstantesFunciones.resaltarid_usuarioConsignatario,this,this.consignatarioConstantesFunciones.activarid_usuarioConsignatario));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.consignatarioConstantesFunciones.resaltarid_usuarioConsignatario,this,this.consignatarioConstantesFunciones.activarid_usuarioConsignatario,false,"id_usuarioConsignatario","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.consignatarioConstantesFunciones.mostrarnombre_completoConsignatario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consignatarioConstantesFunciones.resaltarnombre_completoConsignatario,this.consignatarioConstantesFunciones.activarnombre_completoConsignatario,this,true,"nombre_completoConsignatario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consignatarioConstantesFunciones.resaltarnombre_completoConsignatario,this.consignatarioConstantesFunciones.activarnombre_completoConsignatario,this,true,"nombre_completoConsignatario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,ConsignatarioConstantesFunciones.LABEL_NOMBRE));

		if(this.consignatarioConstantesFunciones.mostrarnombreConsignatario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsignatarioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consignatarioConstantesFunciones.resaltarnombreConsignatario,this.consignatarioConstantesFunciones.activarnombreConsignatario,this,true,"nombreConsignatario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consignatarioConstantesFunciones.resaltarnombreConsignatario,this.consignatarioConstantesFunciones.activarnombreConsignatario,this,true,"nombreConsignatario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,ConsignatarioConstantesFunciones.LABEL_APELLIDO));

		if(this.consignatarioConstantesFunciones.mostrarapellidoConsignatario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsignatarioConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consignatarioConstantesFunciones.resaltarapellidoConsignatario,this.consignatarioConstantesFunciones.activarapellidoConsignatario,this,true,"apellidoConsignatario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consignatarioConstantesFunciones.resaltarapellidoConsignatario,this.consignatarioConstantesFunciones.activarapellidoConsignatario,this,true,"apellidoConsignatario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsignatarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProforma && this.consignatarioConstantesFunciones.mostrarProformaConsignatario && !ConsignatarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Proformas");
				tableColumn.setHeaderValue("Proformas");
				tableColumn.setCellRenderer(new ProformaTableCell(consignatarioConstantesFunciones.resaltarProformaConsignatario,this,this.consignatarioConstantesFunciones.activarProformaConsignatario));
				tableColumn.setCellEditor(new ProformaTableCell(consignatarioConstantesFunciones.resaltarProformaConsignatario,this,this.consignatarioConstantesFunciones.activarProformaConsignatario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConsignatario.addColumn(tableColumn);
			}

			if(this.isTienePermisosConsignacion && this.consignatarioConstantesFunciones.mostrarConsignacionConsignatario && !ConsignatarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Consignacions");
				tableColumn.setHeaderValue("Consignacions");
				tableColumn.setCellRenderer(new ConsignacionTableCell(consignatarioConstantesFunciones.resaltarConsignacionConsignatario,this,this.consignatarioConstantesFunciones.activarConsignacionConsignatario));
				tableColumn.setCellEditor(new ConsignacionTableCell(consignatarioConstantesFunciones.resaltarConsignacionConsignatario,this,this.consignatarioConstantesFunciones.activarConsignacionConsignatario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConsignatario.addColumn(tableColumn);
			}

			if(this.isTienePermisosPedidoExpor && this.consignatarioConstantesFunciones.mostrarPedidoExporConsignatario && !ConsignatarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Exportacions");
				tableColumn.setHeaderValue("Pedido Exportacions");
				tableColumn.setCellRenderer(new PedidoExporTableCell(consignatarioConstantesFunciones.resaltarPedidoExporConsignatario,this,this.consignatarioConstantesFunciones.activarPedidoExporConsignatario));
				tableColumn.setCellEditor(new PedidoExporTableCell(consignatarioConstantesFunciones.resaltarPedidoExporConsignatario,this,this.consignatarioConstantesFunciones.activarPedidoExporConsignatario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConsignatario.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consignatarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consignatarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsignatario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consignatarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consignatarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsignatario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConsignatario && this.isPermisoGuardarCambiosConsignatario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.consignatarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.consignatarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConsignatario.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.consignatarioSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosConsignatario.addColumn(tableColumn);
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
			
			this.jTableDatosConsignatario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsignatario && this.isPermisoGuardarCambiosConsignatario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.consignatarioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsignatario && this.isPermisoGuardarCambiosConsignatario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConsignatario.moveColumn(this.jTableDatosConsignatario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConsignatario.moveColumn(this.jTableDatosConsignatario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.consignatarioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosConsignatario.moveColumn(this.jTableDatosConsignatario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConsignatario.moveColumn(this.jTableDatosConsignatario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConsignatario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConsignatario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConsignatario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConsignatario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConsignatario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConsignatario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConsignatario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConsignatario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=consignatarioLogic.getConsignatarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=consignatarios.size()-1;
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
		//this.jTableDatosConsignatario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConsignatario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConsignatario();
			
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
				
				//this.isEsNuevoConsignatario=false;
					
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
				if(this.consignatarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConsignatario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsignatario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsignatario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.consignatario.getsType().equals("DUPLICADO")
				   || this.consignatario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConsignatario=true;
				
				} else {
					this.isEsNuevoConsignatario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
					if(this.consignatario.getId()>=0 && !this.consignatario.getIsNew()) {						
						this.isEsNuevoConsignatario=false;
						
					} else {
						this.isEsNuevoConsignatario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConsignatario(esRelaciones);						
				
				this.seleccionarConsignatario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.consignatario.getId()<0) {
					this.isEsNuevoConsignatario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConsignatario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConsignatario(evt,rowIndex);
				}	
				
				if(this.consignatarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Consignatario: " + this.dDif); 
					}
				}								
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConsignatario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.consignatario)) {
					if(this.consignatario.getId()>0) {
						this.consignatario.setIsDeleted(true);
						
						this.consignatariosEliminados.add(this.consignatario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consignatarioLogic.getConsignatarios().remove(this.consignatario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consignatarios.remove(this.consignatario);				
					}
					
					
					((ConsignatarioModel) this.jTableDatosConsignatario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConsignatario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConsignatario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConsignatario) {
			
			if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsignatario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsignatario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConsignatario(this.consignatario);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.consignatarioConstantesFunciones.cargarid_empresaConsignatario || this.consignatarioConstantesFunciones.event_dependid_empresaConsignatario) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.consignatario.getid_empresa());
									//this.inicializarActualizarBindingConsignatario(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(consignatario.getEmpresa()!=null) {
							this.empresasForeignKey.add(consignatario.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.consignatario.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.consignatarioConstantesFunciones.cargarid_sucursalConsignatario || this.consignatarioConstantesFunciones.event_dependid_sucursalConsignatario) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.consignatario.getid_sucursal());
									//this.inicializarActualizarBindingConsignatario(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(consignatario.getSucursal()!=null) {
							this.sucursalsForeignKey.add(consignatario.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.consignatario.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.consignatarioConstantesFunciones.cargarid_clienteConsignatario || this.consignatarioConstantesFunciones.event_dependid_clienteConsignatario) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.consignatario.getid_cliente());
									//this.inicializarActualizarBindingConsignatario(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(consignatario.getCliente()!=null) {
							this.clientesForeignKey.add(consignatario.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.consignatario.getid_cliente(),false,"Formulario");

					//Usuario
					if(!this.consignatarioConstantesFunciones.cargarid_usuarioConsignatario || this.consignatarioConstantesFunciones.event_dependid_usuarioConsignatario) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.consignatario.getid_usuario());
									//this.inicializarActualizarBindingConsignatario(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(consignatario.getUsuario()!=null) {
							this.usuariosForeignKey.add(consignatario.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.consignatario.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConsignatario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConsignatario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsignatario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsignatario(Consignatario consignatario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConsignatario(consignatario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsignatario(Consignatario consignatario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConsignatario(consignatario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConsignatario(consignatario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConsignatario(consignatario);
	}
	
	public void setVariablesObjetoActualToFormularioConsignatario(Consignatario consignatario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.setText(consignatario.getId().toString());
			this.jInternalFrameDetalleFormConsignatario.jTextFieldnombre_completoConsignatario.setText(consignatario.getnombre_completo());
			this.jInternalFrameDetalleFormConsignatario.jTextAreanombreConsignatario.setText(consignatario.getnombre());
			this.jInternalFrameDetalleFormConsignatario.jTextAreaapellidoConsignatario.setText(consignatario.getapellido());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Consignatario consignatarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,consignatarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Consignatario consignatarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				consignatarioLocal=this.consignatario;
			} else {
				consignatarioLocal=this.consignatarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(consignatarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConsignatario(consignatarioLocal,true);
					
					if(consignatarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(consignatarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(consignatarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConsignatario(Consignatario consignatario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsignatario(consignatario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(consignatario);
	}
	
	public void setVariablesFormularioToObjetoActualConsignatario(Consignatario consignatario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsignatario(consignatario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConsignatario(Consignatario consignatario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.getText()==null || this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.getText()=="" || this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.getText()=="Id") {
				this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.setText("0");
			}

			if(conColumnasBase) {consignatario.setId(Long.parseLong(this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsignatarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelIdConsignatario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consignatario.setnombre_completo(this.jInternalFrameDetalleFormConsignatario.jTextFieldnombre_completoConsignatario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelnombre_completoConsignatario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consignatario.setnombre(this.jInternalFrameDetalleFormConsignatario.jTextAreanombreConsignatario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsignatarioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelnombreConsignatario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consignatario.setapellido(this.jInternalFrameDetalleFormConsignatario.jTextAreaapellidoConsignatario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsignatarioConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsignatario.jLabelapellidoConsignatario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsignatario(Consignatario consignatarioBean,Consignatario consignatario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && consignatarioBean.getid_cliente()!=null && !consignatarioBean.getid_cliente().equals(-1L))) {consignatario.setid_cliente(consignatarioBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConsignatario(Consignatario consignatarioOrigen,Consignatario consignatario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consignatarioOrigen.getId()!=null && !consignatarioOrigen.getId().equals(0L))) {consignatario.setId(consignatarioOrigen.getId());}}
			if(conDefault || (!conDefault && consignatarioOrigen.getid_cliente()!=null && !consignatarioOrigen.getid_cliente().equals(-1L))) {consignatario.setid_cliente(consignatarioOrigen.getid_cliente());}
			if(conDefault || (!conDefault && consignatarioOrigen.getnombre_completo()!=null && !consignatarioOrigen.getnombre_completo().equals(""))) {consignatario.setnombre_completo(consignatarioOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && consignatarioOrigen.getnombre()!=null && !consignatarioOrigen.getnombre().equals(""))) {consignatario.setnombre(consignatarioOrigen.getnombre());}
			if(conDefault || (!conDefault && consignatarioOrigen.getapellido()!=null && !consignatarioOrigen.getapellido().equals(""))) {consignatario.setapellido(consignatarioOrigen.getapellido());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsignatario(Consignatario consignatario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.setText(consignatario.getId().toString());
			this.jInternalFrameDetalleFormConsignatario.jTextFieldnombre_completoConsignatario.setText(consignatario.getnombre_completo());
			this.jInternalFrameDetalleFormConsignatario.jTextAreanombreConsignatario.setText(consignatario.getnombre());
			this.jInternalFrameDetalleFormConsignatario.jTextAreaapellidoConsignatario.setText(consignatario.getapellido());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsignatario(ConsignatarioBean consignatarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.setText(consignatarioBean.getId().toString());
			this.jInternalFrameDetalleFormConsignatario.jTextFieldnombre_completoConsignatario.setText(consignatarioBean.getnombre_completo());
			this.jInternalFrameDetalleFormConsignatario.jTextAreanombreConsignatario.setText(consignatarioBean.getnombre());
			this.jInternalFrameDetalleFormConsignatario.jTextAreaapellidoConsignatario.setText(consignatarioBean.getapellido());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConsignatario(ConsignatarioParameterReturnGeneral consignatarioReturnGeneral,ConsignatarioBean consignatarioBean,Boolean conDefault) throws Exception { 
		try {
			Consignatario consignatarioLocal=new Consignatario();
			
			consignatarioLocal=consignatarioReturnGeneral.getConsignatario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consignatarioLocal.getId()!=null && !consignatarioLocal.getId().equals(0L))) {consignatarioBean.setId(consignatarioLocal.getId());}}
			if(conDefault || (!conDefault && consignatarioLocal.getid_cliente()!=null && !consignatarioLocal.getid_cliente().equals(-1L))) {consignatarioBean.setid_cliente(consignatarioLocal.getid_cliente());}
			if(conDefault || (!conDefault && consignatarioLocal.getnombre_completo()!=null && !consignatarioLocal.getnombre_completo().equals(""))) {consignatarioBean.setnombre_completo(consignatarioLocal.getnombre_completo());}
			if(conDefault || (!conDefault && consignatarioLocal.getnombre()!=null && !consignatarioLocal.getnombre().equals(""))) {consignatarioBean.setnombre(consignatarioLocal.getnombre());}
			if(conDefault || (!conDefault && consignatarioLocal.getapellido()!=null && !consignatarioLocal.getapellido().equals(""))) {consignatarioBean.setapellido(consignatarioLocal.getapellido());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConsignatarioGenerico(Long idConsignatarioSeleccionado,JComboBox jComboBoxConsignatario,List<Consignatario> consignatariosLocal)throws Exception {
		try {
			Consignatario  consignatarioTemp=null;

			for(Consignatario consignatarioAux:consignatariosLocal) {
				if(consignatarioAux.getId()!=null && consignatarioAux.getId().equals(idConsignatarioSeleccionado)) {
					consignatarioTemp=consignatarioAux;
					break;
				}
			}

			jComboBoxConsignatario.setSelectedItem(consignatarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConsignatarioGenerico(JComboBox jComboBoxConsignatario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsignatario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConsignatario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsignatario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConsignatario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Proforma")) {
			jButtonProformaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Consignacion")) {
			jButtonConsignacionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PedidoExpor")) {
			jButtonPedidoExporActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consignatario=(Consignatario) consignatarioLogic.getConsignatarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consignatario =(Consignatario) consignatarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!consignatario.getIsNew() && !consignatario.getIsChanged() && !consignatario.getIsDeleted()) {
				sDescripcion=consignatario.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=consignatario.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!consignatario.getIsNew() && !consignatario.getIsChanged() && !consignatario.getIsDeleted()) {
				sDescripcion=consignatario.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=consignatario.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!consignatario.getIsNew() && !consignatario.getIsChanged() && !consignatario.getIsDeleted()) {
				sDescripcion=consignatario.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=consignatario.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!consignatario.getIsNew() && !consignatario.getIsChanged() && !consignatario.getIsDeleted()) {
				sDescripcion=consignatario.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=consignatario.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Consignatario consignatarioRow=new Consignatario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consignatarioRow=(Consignatario) consignatarioLogic.getConsignatarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consignatarioRow=(Consignatario) consignatarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProformaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Consignatario consignatario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConsignatario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario = (Consignatario)this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.consignatario = (Consignatario)this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(consignatario!=null) {
						this.consignatario = consignatario;
					} else {
						this.consignatario = new Consignatario();
					}
				}

				if(this.isTienePermisosProforma && this.permiteMantenimiento(this.consignatario)) {
					ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFramePopup=new ProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						proformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFramePopup;
					} else {
						proformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame;
					}

					List<Consignatario> consignatarios=new ArrayList<Consignatario>();
					consignatarios.add(this.consignatario);
					if(!esRelacionado) {
						//proformaBeanSwingJInternalFrame.proformaSessionBean.setConGuardarRelaciones(false);
						//proformaBeanSwingJInternalFrame.proformaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					proformaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConsignatario.cargarProformaBeanSwingJInternalFrame(consignatarios,this.consignatario,proformaBeanSwingJInternalFrame,/*conInicializar,*/proformaBeanSwingJInternalFrame.proformaSessionBean.getConGuardarRelaciones(),proformaBeanSwingJInternalFrame.proformaSessionBean.getEsGuardarRelacionado());
					proformaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("no_relacionado");

						proformaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProformaConstantesFunciones.ITAMANIOFILATABLA + (ProformaConstantesFunciones.ITAMANIOFILATABLA/2));

						proformaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConsignatario=(TitledBorder)this.jScrollPanelDatosConsignatario.getBorder();
						TitledBorder titledBorderProforma=(TitledBorder)proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.getBorder();

						titledBorderProforma.setTitle(titledBorderConsignatario.getTitle() + " -> Proforma");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,proformaBeanSwingJInternalFrame);
						}

						proformaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(proformaBeanSwingJInternalFrame);

						proformaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.consignatarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Proforma",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonConsignacionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Consignatario consignatario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConsignatario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario = (Consignatario)this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.consignatario = (Consignatario)this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(consignatario!=null) {
						this.consignatario = consignatario;
					} else {
						this.consignatario = new Consignatario();
					}
				}

				if(this.isTienePermisosConsignacion && this.permiteMantenimiento(this.consignatario)) {
					ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFramePopup=new ConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						consignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFramePopup;
					} else {
						consignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame;
					}

					List<Consignatario> consignatarios=new ArrayList<Consignatario>();
					consignatarios.add(this.consignatario);
					if(!esRelacionado) {
						//consignacionBeanSwingJInternalFrame.consignacionSessionBean.setConGuardarRelaciones(false);
						//consignacionBeanSwingJInternalFrame.consignacionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					consignacionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConsignatario.cargarConsignacionBeanSwingJInternalFrame(consignatarios,this.consignatario,consignacionBeanSwingJInternalFrame,/*conInicializar,*/consignacionBeanSwingJInternalFrame.consignacionSessionBean.getConGuardarRelaciones(),consignacionBeanSwingJInternalFrame.consignacionSessionBean.getEsGuardarRelacionado());
					consignacionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("no_relacionado");

						consignacionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ConsignacionConstantesFunciones.ITAMANIOFILATABLA + (ConsignacionConstantesFunciones.ITAMANIOFILATABLA/2));

						consignacionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConsignatario=(TitledBorder)this.jScrollPanelDatosConsignatario.getBorder();
						TitledBorder titledBorderConsignacion=(TitledBorder)consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.getBorder();

						titledBorderConsignacion.setTitle(titledBorderConsignatario.getTitle() + " -> Consignacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,consignacionBeanSwingJInternalFrame);
						}

						consignacionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(consignacionBeanSwingJInternalFrame);

						consignacionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.consignatarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Consignacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPedidoExporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Consignatario consignatario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConsignatario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario = (Consignatario)this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.consignatario = (Consignatario)this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(consignatario!=null) {
						this.consignatario = consignatario;
					} else {
						this.consignatario = new Consignatario();
					}
				}

				if(this.isTienePermisosPedidoExpor && this.permiteMantenimiento(this.consignatario)) {
					PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFramePopup;
					} else {
						pedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame;
					}

					List<Consignatario> consignatarios=new ArrayList<Consignatario>();
					consignatarios.add(this.consignatario);
					if(!esRelacionado) {
						//pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setConGuardarRelaciones(false);
						//pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConsignatario.cargarPedidoExporBeanSwingJInternalFrame(consignatarios,this.consignatario,pedidoexporBeanSwingJInternalFrame,/*conInicializar,*/pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getConGuardarRelaciones(),pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado());
					pedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");

						pedidoexporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoExporConstantesFunciones.ITAMANIOFILATABLA + (PedidoExporConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidoexporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConsignatario=(TitledBorder)this.jScrollPanelDatosConsignatario.getBorder();
						TitledBorder titledBorderPedidoExpor=(TitledBorder)pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.getBorder();

						titledBorderPedidoExpor.setTitle(titledBorderConsignatario.getTitle() + " -> Pedido Exportacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidoexporBeanSwingJInternalFrame);
						}

						pedidoexporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidoexporBeanSwingJInternalFrame);

						pedidoexporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.consignatarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Exportacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConsignatario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConsignatario.setVisible((this.isVisibilidadCeldaNuevoConsignatario && this.isPermisoNuevoConsignatario));			
			this.jButtonDuplicarConsignatario.setVisible((this.isVisibilidadCeldaDuplicarConsignatario && this.isPermisoDuplicarConsignatario));			
			this.jButtonCopiarConsignatario.setVisible((this.isVisibilidadCeldaCopiarConsignatario && this.isPermisoCopiarConsignatario));
			this.jButtonVerFormConsignatario.setVisible((this.isVisibilidadCeldaVerFormConsignatario && this.isPermisoVerFormConsignatario));
			
			this.jButtonAbrirOrderByConsignatario.setVisible((this.isVisibilidadCeldaOrdenConsignatario && this.isPermisoOrdenConsignatario));			
			
			this.jButtonNuevoRelacionesConsignatario.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsignatario && this.isPermisoNuevoConsignatario));			
			this.jButtonNuevoGuardarCambiosConsignatario.setVisible((this.isVisibilidadCeldaNuevoConsignatario && this.isPermisoNuevoConsignatario && this.isPermisoGuardarCambiosConsignatario));
			
			if(this.jInternalFrameDetalleFormConsignatario!=null) {
			this.jInternalFrameDetalleFormConsignatario.jButtonModificarConsignatario.setVisible((this.isVisibilidadCeldaModificarConsignatario && this.isPermisoActualizarConsignatario));	
			this.jInternalFrameDetalleFormConsignatario.jButtonActualizarConsignatario.setVisible((this.isVisibilidadCeldaActualizarConsignatario && this.isPermisoActualizarConsignatario));	
			this.jInternalFrameDetalleFormConsignatario.jButtonEliminarConsignatario.setVisible((this.isVisibilidadCeldaEliminarConsignatario && this.isPermisoEliminarConsignatario));
			this.jInternalFrameDetalleFormConsignatario.jButtonCancelarConsignatario.setVisible(this.isVisibilidadCeldaCancelarConsignatario);							
			this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosConsignatario.setVisible((this.isVisibilidadCeldaGuardarConsignatario && this.isPermisoGuardarCambiosConsignatario));			
			
			}
						
			this.jButtonGuardarCambiosTablaConsignatario.setVisible((this.isVisibilidadCeldaGuardarCambiosConsignatario && this.isPermisoGuardarCambiosConsignatario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConsignatario.setVisible((this.isVisibilidadCeldaNuevoConsignatario && this.isPermisoNuevoConsignatario));						
			this.jButtonDuplicarToolBarConsignatario.setVisible((this.isVisibilidadCeldaDuplicarConsignatario && this.isPermisoDuplicarConsignatario));						
			this.jButtonCopiarToolBarConsignatario.setVisible((this.isVisibilidadCeldaCopiarConsignatario && this.isPermisoCopiarConsignatario));			
			this.jButtonVerFormToolBarConsignatario.setVisible((this.isVisibilidadCeldaVerFormConsignatario && this.isPermisoVerFormConsignatario));			
			this.jButtonAbrirOrderByToolBarConsignatario.setVisible((this.isVisibilidadCeldaOrdenConsignatario && this.isPermisoOrdenConsignatario));
			this.jButtonNuevoRelacionesToolBarConsignatario.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsignatario && this.isPermisoNuevoConsignatario));			
			this.jButtonNuevoGuardarCambiosToolBarConsignatario.setVisible((this.isVisibilidadCeldaNuevoConsignatario && this.isPermisoNuevoConsignatario && this.isPermisoGuardarCambiosConsignatario));			
			
			if(this.jInternalFrameDetalleFormConsignatario!=null) {
			this.jInternalFrameDetalleFormConsignatario.jButtonModificarToolBarConsignatario.setVisible((this.isVisibilidadCeldaModificarConsignatario && this.isPermisoActualizarConsignatario));	
			this.jInternalFrameDetalleFormConsignatario.jButtonActualizarToolBarConsignatario.setVisible((this.isVisibilidadCeldaActualizarConsignatario  && this.isPermisoActualizarConsignatario));	
			this.jInternalFrameDetalleFormConsignatario.jButtonEliminarToolBarConsignatario.setVisible((this.isVisibilidadCeldaEliminarConsignatario && this.isPermisoEliminarConsignatario));
			this.jInternalFrameDetalleFormConsignatario.jButtonCancelarToolBarConsignatario.setVisible(this.isVisibilidadCeldaCancelarConsignatario);				
			this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosToolBarConsignatario.setVisible((this.isVisibilidadCeldaGuardarConsignatario && this.isPermisoGuardarCambiosConsignatario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConsignatario.setVisible((this.isVisibilidadCeldaGuardarCambiosConsignatario && this.isPermisoGuardarCambiosConsignatario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConsignatario.setVisible((this.isVisibilidadCeldaNuevoConsignatario && this.isPermisoNuevoConsignatario));			
			this.jMenuItemDuplicarConsignatario.setVisible((this.isVisibilidadCeldaDuplicarConsignatario && this.isPermisoDuplicarConsignatario));			
			this.jMenuItemCopiarConsignatario.setVisible((this.isVisibilidadCeldaCopiarConsignatario && this.isPermisoCopiarConsignatario));			
			this.jMenuItemVerFormConsignatario.setVisible((this.isVisibilidadCeldaVerFormConsignatario && this.isPermisoVerFormConsignatario));			
			this.jMenuItemAbrirOrderByConsignatario.setVisible((this.isVisibilidadCeldaOrdenConsignatario && this.isPermisoOrdenConsignatario));			
			//this.jMenuItemMostrarOcultarConsignatario.setVisible((this.isVisibilidadCeldaOrdenConsignatario && this.isPermisoOrdenConsignatario));
			this.jMenuItemDetalleAbrirOrderByConsignatario.setVisible((this.isVisibilidadCeldaOrdenConsignatario && this.isPermisoOrdenConsignatario));			
			//this.jMenuItemDetalleMostrarOcultarConsignatario.setVisible((this.isVisibilidadCeldaOrdenConsignatario && this.isPermisoOrdenConsignatario));			
			this.jMenuItemNuevoRelacionesConsignatario.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsignatario && this.isPermisoNuevoConsignatario));			
			this.jMenuItemNuevoGuardarCambiosConsignatario.setVisible((this.isVisibilidadCeldaNuevoConsignatario && this.isPermisoNuevoConsignatario && this.isPermisoGuardarCambiosConsignatario));									
			
			if(this.jInternalFrameDetalleFormConsignatario!=null) {
			this.jInternalFrameDetalleFormConsignatario.jMenuItemModificarConsignatario.setVisible((this.isVisibilidadCeldaModificarConsignatario && this.isPermisoActualizarConsignatario));	
			this.jInternalFrameDetalleFormConsignatario.jMenuItemActualizarConsignatario.setVisible((this.isVisibilidadCeldaActualizarConsignatario && this.isPermisoActualizarConsignatario));	
			this.jInternalFrameDetalleFormConsignatario.jMenuItemEliminarConsignatario.setVisible((this.isVisibilidadCeldaEliminarConsignatario && this.isPermisoEliminarConsignatario));
			this.jInternalFrameDetalleFormConsignatario.jMenuItemCancelarConsignatario.setVisible(this.isVisibilidadCeldaCancelarConsignatario);				
			}
			
			this.jMenuItemGuardarCambiosConsignatario.setVisible((this.isVisibilidadCeldaGuardarConsignatario && this.isPermisoGuardarCambiosConsignatario));						
			this.jMenuItemGuardarCambiosTablaConsignatario.setVisible((this.isVisibilidadCeldaGuardarCambiosConsignatario && this.isPermisoGuardarCambiosConsignatario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConsignatario=this.jButtonNuevoConsignatario.isVisible();
			this.isVisibilidadCeldaDuplicarConsignatario=this.jButtonDuplicarConsignatario.isVisible();
			this.isVisibilidadCeldaCopiarConsignatario=this.jButtonCopiarConsignatario.isVisible();
			this.isVisibilidadCeldaVerFormConsignatario=this.jButtonVerFormConsignatario.isVisible();
			
			this.isVisibilidadCeldaOrdenConsignatario=this.jButtonAbrirOrderByConsignatario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=this.jButtonNuevoRelacionesConsignatario.isVisible();
			this.isVisibilidadCeldaModificarConsignatario=this.jButtonModificarConsignatario.isVisible();
			
			if(this.jInternalFrameDetalleFormConsignatario!=null) {
			this.isVisibilidadCeldaActualizarConsignatario=this.jInternalFrameDetalleFormConsignatario.jButtonActualizarConsignatario.isVisible();
			this.isVisibilidadCeldaEliminarConsignatario=this.jInternalFrameDetalleFormConsignatario.jButtonEliminarConsignatario.isVisible();
			this.isVisibilidadCeldaCancelarConsignatario=this.jInternalFrameDetalleFormConsignatario.jButtonCancelarConsignatario.isVisible();
			this.isVisibilidadCeldaGuardarConsignatario=this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosConsignatario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConsignatario=this.jButtonGuardarCambiosTablaConsignatario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConsignatario=this.jButtonNuevoToolBarConsignatario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=this.jButtonNuevoRelacionesToolBarConsignatario.isVisible();
			
			if(this.jInternalFrameDetalleFormConsignatario!=null) {
			this.isVisibilidadCeldaModificarConsignatario=this.jInternalFrameDetalleFormConsignatario.jButtonModificarToolBarConsignatario.isVisible();
			this.isVisibilidadCeldaActualizarConsignatario=this.jInternalFrameDetalleFormConsignatario.jButtonActualizarToolBarConsignatario.isVisible();
			this.isVisibilidadCeldaEliminarConsignatario=this.jInternalFrameDetalleFormConsignatario.jButtonEliminarToolBarConsignatario.isVisible();
			this.isVisibilidadCeldaCancelarConsignatario=this.jInternalFrameDetalleFormConsignatario.jButtonCancelarToolBarConsignatario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsignatario=this.jButtonGuardarCambiosToolBarConsignatario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsignatario=this.jButtonGuardarCambiosTablaToolBarConsignatario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConsignatario=this.jMenuItemNuevoConsignatario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=this.jMenuItemNuevoRelacionesConsignatario.isVisible();
			
			if(this.jInternalFrameDetalleFormConsignatario!=null) {
			this.isVisibilidadCeldaModificarConsignatario=this.jInternalFrameDetalleFormConsignatario.jMenuItemModificarConsignatario.isVisible();
			this.isVisibilidadCeldaActualizarConsignatario=this.jInternalFrameDetalleFormConsignatario.jMenuItemActualizarConsignatario.isVisible();
			this.isVisibilidadCeldaEliminarConsignatario=this.jInternalFrameDetalleFormConsignatario.jMenuItemEliminarConsignatario.isVisible();
			this.isVisibilidadCeldaCancelarConsignatario=this.jInternalFrameDetalleFormConsignatario.jMenuItemCancelarConsignatario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsignatario=this.jMenuItemGuardarCambiosConsignatario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsignatario=this.jMenuItemGuardarCambiosTablaConsignatario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConsignatario(Boolean esInicializar) {
		if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.consignatarioSessionBean.getConGuardarRelaciones()) {
				//if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConsignatario();
			}
			
			this.inicializarActualizarBindingBotonesManualConsignatario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConsignatario() {
		this.jButtonNuevoConsignatario.setVisible(this.isPermisoNuevoConsignatario);			
		this.jButtonDuplicarConsignatario.setVisible(this.isPermisoDuplicarConsignatario);			
		this.jButtonCopiarConsignatario.setVisible(this.isPermisoCopiarConsignatario);			
		this.jButtonVerFormConsignatario.setVisible(this.isPermisoVerFormConsignatario);			
		
		this.jButtonAbrirOrderByConsignatario.setVisible(this.isPermisoOrdenConsignatario);					
		
		this.jButtonNuevoRelacionesConsignatario.setVisible(this.isPermisoNuevoConsignatario);			
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonModificarConsignatario.setVisible(this.isPermisoActualizarConsignatario);	
			this.jInternalFrameDetalleFormConsignatario.jButtonActualizarConsignatario.setVisible(this.isPermisoActualizarConsignatario);	
			this.jInternalFrameDetalleFormConsignatario.jButtonEliminarConsignatario.setVisible(this.isPermisoEliminarConsignatario);
			this.jInternalFrameDetalleFormConsignatario.jButtonCancelarConsignatario.setVisible(this.isVisibilidadCeldaCancelarConsignatario);						
			this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosConsignatario.setVisible(this.isPermisoGuardarCambiosConsignatario);							
		}
		
		this.jButtonGuardarCambiosTablaConsignatario.setVisible(this.isPermisoActualizarConsignatario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConsignatario() {
		this.jInternalFrameDetalleFormConsignatario.jButtonModificarConsignatario.setVisible(this.isPermisoActualizarConsignatario);	
		this.jInternalFrameDetalleFormConsignatario.jButtonActualizarConsignatario.setVisible(this.isPermisoActualizarConsignatario);	
		this.jInternalFrameDetalleFormConsignatario.jButtonEliminarConsignatario.setVisible(this.isPermisoEliminarConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jButtonCancelarConsignatario.setVisible(this.isVisibilidadCeldaCancelarConsignatario);							
		this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosConsignatario.setVisible((this.isVisibilidadCeldaGuardarConsignatario && this.isPermisoGuardarCambiosConsignatario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConsignatario() {
		if(ConsignatarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConsignatario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConsignatario() {
	}
	
	public void jTableDatosConsignatarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConsignatario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConsignatarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consignatario==null) {
						this.consignatario = new Consignatario();
					}

					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				}

				if(this.consignatario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.consignatario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsignatario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConsignatarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConsignatario(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsignatario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsignatario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.consignatarioLogic.getConnexion());

				if(this.consignatario.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.consignatario.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsignatario=(TitledBorder)this.jScrollPanelDatosConsignatario.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConsignatario.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConsignatarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consignatario==null) {
						this.consignatario = new Consignatario();
					}

					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				}

				if(this.consignatario.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.consignatario.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsignatario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalConsignatarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebConsignatario(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsignatario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsignatario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.consignatarioLogic.getConnexion());

				if(this.consignatario.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.consignatario.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsignatario=(TitledBorder)this.jScrollPanelDatosConsignatario.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderConsignatario.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalConsignatarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consignatario==null) {
						this.consignatario = new Consignatario();
					}

					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				}

				if(this.consignatario.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.consignatario.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsignatario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteConsignatarioActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderConsignatario=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosConsignatario.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderConsignatario=(TitledBorder)this.jScrollPanelDatosConsignatario.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderConsignatario.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteConsignatarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebConsignatario(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsignatario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsignatario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.consignatarioLogic.getConnexion());

				if(this.consignatario.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.consignatario.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsignatario=(TitledBorder)this.jScrollPanelDatosConsignatario.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderConsignatario.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteConsignatarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consignatario==null) {
						this.consignatario = new Consignatario();
					}

					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				}

				if(this.consignatario.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.consignatario.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsignatario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioConsignatarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebConsignatario(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsignatario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsignatario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.consignatarioLogic.getConnexion());

				if(this.consignatario.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.consignatario.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsignatario=(TitledBorder)this.jScrollPanelDatosConsignatario.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderConsignatario.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioConsignatarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consignatario==null) {
						this.consignatario = new Consignatario();
					}

					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				}

				if(this.consignatario.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.consignatario.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsignatario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoConsignatarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consignatario==null) {
						this.consignatario = new Consignatario();
					}

					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				}

				if(this.consignatario.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.consignatario.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsignatario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreConsignatarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consignatario==null) {
						this.consignatario = new Consignatario();
					}

					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				}

				if(this.consignatario.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.consignatario.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsignatario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoConsignatarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsignatario(this.getconsignatario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consignatario==null) {
						this.consignatario = new Consignatario();
					}

					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);
				}

				if(this.consignatario.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.consignatario.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsignatario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteConsignatarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsignatario(false,false);

			this.getConsignatariosFK_IdCliente();

			this.inicializarActualizarBindingConsignatario(false);

			//if(ConsignatarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsignatario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaConsignatarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsignatario(false,false);

			this.getConsignatariosFK_IdEmpresa();

			this.inicializarActualizarBindingConsignatario(false);

			//if(ConsignatarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsignatario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalConsignatarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsignatario(false,false);

			this.getConsignatariosFK_IdSucursal();

			this.inicializarActualizarBindingConsignatario(false);

			//if(ConsignatarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsignatario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioConsignatarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsignatario(false,false);

			this.getConsignatariosFK_IdUsuario();

			this.inicializarActualizarBindingConsignatario(false);

			//if(ConsignatarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsignatario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consignatarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConsignatario() {
		if(this.jInternalFrameDetalleFormConsignatario!=null) {
		

		if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) {
			this.jInternalFrameDetalleFormConsignatario.setVisible(false);	    			
			this.jInternalFrameDetalleFormConsignatario.dispose();
			this.jInternalFrameDetalleFormConsignatario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConsignatario!=null) {
			this.jInternalFrameReporteDinamicoConsignatario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConsignatario.dispose();
			this.jInternalFrameReporteDinamicoConsignatario=null;
		}
		
		if(this.jInternalFrameImportacionConsignatario!=null) {
			this.jInternalFrameImportacionConsignatario.setVisible(false);	    			
			this.jInternalFrameImportacionConsignatario.dispose();
			this.jInternalFrameImportacionConsignatario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConsignatario();
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoConsignatario")) {
				jButtonNuevoConsignatarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConsignatario")) {
				jButtonDuplicarConsignatarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConsignatario")) {
				jButtonCopiarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormConsignatario")) {
				jButtonVerFormConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConsignatario")) {
				jButtonNuevoConsignatarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConsignatario")) {
				jButtonDuplicarConsignatarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConsignatario")) {
				jButtonNuevoConsignatarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConsignatario")) {
				jButtonDuplicarConsignatarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConsignatario")) {
				jButtonNuevoConsignatarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConsignatario")) {
				jButtonNuevoConsignatarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConsignatario")) {
				jButtonNuevoConsignatarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConsignatario")) {
				jButtonModificarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConsignatario")) {
				jButtonModificarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConsignatario")) {
				jButtonModificarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConsignatario")) {
				jButtonActualizarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConsignatario")) {
				jButtonActualizarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConsignatario")) {
				jButtonActualizarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarConsignatario")) {
				jButtonEliminarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConsignatario")) {
				jButtonEliminarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConsignatario")) {
				jButtonEliminarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarConsignatario")) {
				jButtonCancelarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConsignatario")) {
				jButtonCancelarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConsignatario")) {
				jButtonCancelarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarConsignatario")) {
				jButtonCerrarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConsignatario")) {
				jButtonCerrarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConsignatario")) {
				jButtonCerrarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConsignatario")) {
				jButtonMostrarOcultarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConsignatario")) {
				jButtonCancelarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConsignatario")) {
				jButtonGuardarCambiosConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConsignatario")) {
				jButtonGuardarCambiosConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConsignatario")) {
				jButtonCopiarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConsignatario")) {
				jButtonVerFormConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConsignatario")) {
				jButtonGuardarCambiosConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConsignatario")) {
				jButtonCopiarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConsignatario")) {
				jButtonVerFormConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConsignatario")) {
				jButtonGuardarCambiosConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConsignatario")) {
				jButtonGuardarCambiosConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConsignatario")) {
				jButtonGuardarCambiosConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConsignatario")) {
				jButtonRecargarInformacionConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConsignatario")) {
				jButtonRecargarInformacionConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConsignatario")) {
				jButtonRecargarInformacionConsignatarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConsignatario")) {
				jButtonAnterioresConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConsignatario")) {
				jButtonAnterioresConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConsignatario")) {
				jButtonAnterioresConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConsignatario")) {
				jButtonSiguientesConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConsignatario")) {
				jButtonSiguientesConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConsignatario")) {
				jButtonSiguientesConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConsignatario") || sTipo.equals("MenuItemDetalleAbrirOrderByConsignatario")) {
				jButtonAbrirOrderByConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConsignatario") || sTipo.equals("MenuItemDetalleMostrarOcultarConsignatario")) {
				jButtonMostrarOcultarConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConsignatario")) {
				jButtonNuevoGuardarCambiosConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConsignatario")) {
				jButtonNuevoGuardarCambiosConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConsignatario")) {
				jButtonNuevoGuardarCambiosConsignatarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConsignatario")) {
				jButtonCerrarReporteDinamicoConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConsignatario")) {
				jButtonGenerarReporteDinamicoConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConsignatario")) {
				
				jButtonGenerarExcelReporteDinamicoConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConsignatario")) {
				jButtonCerrarImportacionConsignatarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConsignatario")) {
				
				jButtonGenerarImportacionConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConsignatario")) {
				
				jButtonAbrirImportacionConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConsignatario")) {
				jComboBoxTiposAccionesConsignatarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConsignatario")) {
				jComboBoxTiposRelacionesConsignatarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConsignatario")) {
				jComboBoxTiposAccionesConsignatarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConsignatario")) {
				
				jComboBoxTiposSeleccionarConsignatarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConsignatario")) {
				jTextFieldValorCampoGeneralConsignatarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConsignatario")) {
				jButtonAbrirOrderByConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConsignatario")) {
				jButtonAbrirOrderByConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConsignatario")) {
				jButtonCerrarOrderByConsignatarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsignatarioBusqueda")) {
				this.jButtonidConsignatarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsignatarioUpdate")) {
				this.jButtonid_empresaConsignatarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsignatarioBusqueda")) {
				this.jButtonid_empresaConsignatarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalConsignatarioUpdate")) {
				this.jButtonid_sucursalConsignatarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalConsignatarioBusqueda")) {
				this.jButtonid_sucursalConsignatarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteConsignatario")) {
				this.jButtonid_clienteConsignatarioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteConsignatarioUpdate")) {
				this.jButtonid_clienteConsignatarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteConsignatarioBusqueda")) {
				this.jButtonid_clienteConsignatarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioConsignatarioUpdate")) {
				this.jButtonid_usuarioConsignatarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioConsignatarioBusqueda")) {
				this.jButtonid_usuarioConsignatarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoConsignatarioBusqueda")) {
				this.jButtonnombre_completoConsignatarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConsignatarioBusqueda")) {
				this.jButtonnombreConsignatarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoConsignatarioBusqueda")) {
				this.jButtonapellidoConsignatarioBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteConsignatario")) {
				this.jButtonid_clienteConsignatarioActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteConsignatario")) {
				this.jButtonFK_IdClienteConsignatarioActionPerformed(evt);
			}
			
			;
			
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConsignatario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsignatarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				


				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Consignatario consignatarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				consignatarioLocal=this.consignatario;
			} else {
				consignatarioLocal=this.consignatarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
							
				
				


				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsignatarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioAnterior =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consignatarioAnterior =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
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
			
			


			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsignatarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
								
						
				


				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
								
				
				


				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsignatarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioAnterior =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consignatarioAnterior =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsignatarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioAnterior =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consignatarioAnterior =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsignatarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
							
				
				


				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsignatarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatarioAnterior =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consignatarioAnterior =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
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
			
			


			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsignatarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
								
				
				


				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsignatarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioAnterior =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consignatarioAnterior =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsignatarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsignatarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConsignatario")) {
					jCheckBoxSeleccionarTodosConsignatarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConsignatario")) {
					jCheckBoxSeleccionadosConsignatarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConsignatario")) {
					
				}
				
				


				
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
												
				
				


				
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsignatarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consignatarioAnterior =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consignatarioAnterior =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsignatarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
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
			
			


			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsignatarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consignatario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consignatario);
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
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
				
				


				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consignatario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consignatario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsignatarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consignatarioAnterior =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consignatarioAnterior =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConsignatario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConsignatarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConsignatario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.consignatario =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.consignatario =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.consignatario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConsignatario")) {
				
				}
				
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConsignatario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConsignatario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConsignatario")) {
			
			}
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConsignatario();
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
			if(sTipo.equals("NuevoConsignatario")) {
				jButtonNuevoConsignatarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConsignatario")) {
				jButtonDuplicarConsignatarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConsignatario")) {
				jButtonCopiarConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConsignatario")) {
				jButtonVerFormConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConsignatario")) {
				jButtonNuevoConsignatarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConsignatario")) {
				jButtonModificarConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConsignatario")) {
				jButtonActualizarConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConsignatario")) {
				jButtonEliminarConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConsignatario")) {
				jButtonGuardarCambiosConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConsignatario")) {
				jButtonCancelarConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConsignatario")) {
				jButtonCerrarConsignatarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConsignatario")) {
				jButtonGuardarCambiosConsignatarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConsignatario")) {
				jButtonNuevoGuardarCambiosConsignatarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConsignatario")) {
				jButtonAbrirOrderByConsignatarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConsignatario")) {
				jButtonRecargarInformacionConsignatarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConsignatario")) {
				jButtonAnterioresConsignatarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConsignatario")) {
				jButtonSiguientesConsignatarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsignatarioBusqueda")) {
				this.jButtonidConsignatarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsignatarioUpdate")) {
				this.jButtonid_empresaConsignatarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsignatarioBusqueda")) {
				this.jButtonid_empresaConsignatarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalConsignatarioUpdate")) {
				this.jButtonid_sucursalConsignatarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalConsignatarioBusqueda")) {
				this.jButtonid_sucursalConsignatarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteConsignatario")) {
				this.jButtonid_clienteConsignatarioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteConsignatarioUpdate")) {
				this.jButtonid_clienteConsignatarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteConsignatarioBusqueda")) {
				this.jButtonid_clienteConsignatarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioConsignatarioUpdate")) {
				this.jButtonid_usuarioConsignatarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioConsignatarioBusqueda")) {
				this.jButtonid_usuarioConsignatarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoConsignatarioBusqueda")) {
				this.jButtonnombre_completoConsignatarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConsignatarioBusqueda")) {
				this.jButtonnombreConsignatarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoConsignatarioBusqueda")) {
				this.jButtonapellidoConsignatarioBusquedaActionPerformed(evt);
			}
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConsignatario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConsignatario")) {
				closingInternalFrameConsignatario();
				
			} else if(sTipo.equals("jButtonCancelarConsignatario")) {
				JInternalFrameBase jInternalFrameDetalleFormConsignatario = (JInternalFrameBase)evt.getSource();
	            	
	            ConsignatarioBeanSwingJInternalFrame jInternalFrameParent=(ConsignatarioBeanSwingJInternalFrame)jInternalFrameDetalleFormConsignatario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConsignatarioActionPerformed(null);
			}
			
			ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consignatario,new Object(),this.consignatarioParameterGeneral,this.consignatarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConsignatario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConsignatario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConsignatario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.consignatario)) {
			if(!esControlTabla) {
				if(ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);			
				}
				
				if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConsignatario(this.consignatario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.consignatarioReturnGeneral=consignatarioLogic.procesarEventosConsignatariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consignatarioLogic.getConsignatarios(),this.consignatario,this.consignatarioParameterGeneral,this.isEsNuevoConsignatario,classes);//this.consignatarioLogic.getConsignatario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConsignatario(this.consignatarioReturnGeneral,this.consignatarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConsignatario(classes,this.consignatarioReturnGeneral,this.consignatarioBean,false);
					}
						
					if(this.consignatarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConsignatario(this.consignatarioReturnGeneral.getConsignatario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConsignatario(this.consignatarioReturnGeneral.getConsignatario());	
					}
						
					if(this.consignatarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConsignatario(this.consignatarioReturnGeneral.getConsignatario(),classes);//this.consignatarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConsignatario(this.consignatario,classes);//this.consignatarioBean);									
				}
			
				if(ConsignatarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConsignatario(this.consignatario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsignatario(this.consignatario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.consignatarioAnterior!=null) {
						this.consignatario=this.consignatarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.consignatarioReturnGeneral=consignatarioLogic.procesarEventosConsignatariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consignatarioLogic.getConsignatarios(),this.consignatario,this.consignatarioParameterGeneral,this.isEsNuevoConsignatario,classes);//this.consignatarioLogic.getConsignatario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.consignatarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.consignatarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.consignatarioReturnGeneral.getConsignatario(),consignatarioLogic.getConsignatarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.consignatarioReturnGeneral.getConsignatario(),this.consignatarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConsignatario.repaint();
				
				//((AbstractTableModel) this.jTableDatosConsignatario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConsignatario();
			}
		}
	}
	
	public void actualizarVisualTableDatosConsignatario() throws Exception {
		
		ConsignatarioModel consignatarioModel=(ConsignatarioModel)this.jTableDatosConsignatario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consignatarioModel.consignatarios=this.consignatarioLogic.getConsignatarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			consignatarioModel.consignatarios=this.consignatarios;
		}
		
		
		((ConsignatarioModel) this.jTableDatosConsignatario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConsignatario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconsignatarioAnterior(),this.consignatarioLogic.getConsignatarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconsignatarioAnterior(),this.consignatarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConsignatario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConsignatario(Consignatario consignatario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Proforma.class)) {
					this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(consignatario.getProformas());
					this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Consignacion.class)) {
					this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(consignatario.getConsignacions());
					this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(consignatario.getPedidoExpors());
					this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
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
										
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consignatario,new Object(),generalEntityParameterGeneral,this.consignatarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.consignatarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConsignatarioConstantesFunciones.getClassesRelationshipsOfConsignatario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConsignatarioConstantesFunciones.getClassesRelationshipsFromStringsOfConsignatario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConsignatario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConsignatarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consignatario,new Object(),generalEntityParameterGeneral,this.consignatarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConsignatario(ConsignatarioBean consignatarioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Proforma.class)) {
					this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(consignatario.getProformas());
					this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Consignacion.class)) {
					this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(consignatario.getConsignacions());
					this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(consignatario.getPedidoExpors());
					this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConsignatario(ArrayList<Classe> classes,ConsignatarioReturnGeneral consignatarioReturnGeneral,ConsignatarioBean consignatarioBean,Boolean conDefault) throws Exception {
		
			this.consignatarioBean.setProformas(consignatarioReturnGeneral.getConsignatario().getProformas());
			this.consignatarioBean.setConsignacions(consignatarioReturnGeneral.getConsignatario().getConsignacions());
			this.consignatarioBean.setPedidoExpors(consignatarioReturnGeneral.getConsignatario().getPedidoExpors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConsignatario(Consignatario consignatario,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Proforma.class)) {
					consignatario.setProformas(this.jInternalFrameDetalleFormConsignatario.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Consignacion.class)) {
					consignatario.setConsignacions(this.jInternalFrameDetalleFormConsignatario.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					consignatario.setPedidoExpors(this.jInternalFrameDetalleFormConsignatario.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
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
		if(!paraTabla && !this.permiteMantenimiento(this.consignatario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConsignatario = new ConsignatarioDetalleFormJInternalFrame(jDesktopPane,this.consignatarioSessionBean.getConGuardarRelaciones(),this.consignatarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConsignatario);
		this.jInternalFrameDetalleFormConsignatario.setVisible(false);
		this.jInternalFrameDetalleFormConsignatario.setSelected(false);						
		
		this.jInternalFrameDetalleFormConsignatario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConsignatario.consignatarioLogic=this.consignatarioLogic;
		
		this.cargarCombosFrameForeignKeyConsignatario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConsignatario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsignatario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConsignatario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConsignatario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConsignatario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsignatario"));
		
		this.jInternalFrameDetalleFormConsignatario.jButtonModificarConsignatario.addActionListener(new ButtonActionListener(this,"ModificarConsignatario"));

		
		this.jInternalFrameDetalleFormConsignatario.jButtonModificarToolBarConsignatario.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsignatario"));
					
		this.jInternalFrameDetalleFormConsignatario.jMenuItemModificarConsignatario.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsignatario"));		
		
		
		
		this.jInternalFrameDetalleFormConsignatario.jButtonActualizarConsignatario.addActionListener (new ButtonActionListener(this,"ActualizarConsignatario"));
		
		
		this.jInternalFrameDetalleFormConsignatario.jButtonActualizarToolBarConsignatario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsignatario"));
						
		this.jInternalFrameDetalleFormConsignatario.jMenuItemActualizarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsignatario"));		
		
		
		
		this.jInternalFrameDetalleFormConsignatario.jButtonEliminarConsignatario.addActionListener (new ButtonActionListener(this,"EliminarConsignatario"));
		
		
		this.jInternalFrameDetalleFormConsignatario.jButtonEliminarToolBarConsignatario.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsignatario"));
								
		this.jInternalFrameDetalleFormConsignatario.jMenuItemEliminarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsignatario"));		
		
		
		
		this.jInternalFrameDetalleFormConsignatario.jButtonCancelarConsignatario.addActionListener (new ButtonActionListener(this,"CancelarConsignatario"));
		
		
		this.jInternalFrameDetalleFormConsignatario.jButtonCancelarToolBarConsignatario.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsignatario"));
					
		this.jInternalFrameDetalleFormConsignatario.jMenuItemCancelarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsignatario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConsignatario.jMenuItemDetalleCerrarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsignatario"));		
		
		
		
		this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosToolBarConsignatario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsignatario"));
		
		
		
		this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosToolBarConsignatario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsignatario"));
		
		
		
		this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsignatario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonidConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"idConsignatarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_empresaConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_empresaConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsignatarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_sucursalConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_sucursalConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalConsignatarioBusqueda"));
		//jButtonid_clienteConsignatario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteConsignatarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatario.addActionListener(new ButtonActionListener(this,"id_clienteConsignatario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_clienteConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteConsignatarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_usuarioConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_usuarioConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioConsignatarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonnombre_completoConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoConsignatarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonnombreConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsignatarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonapellidoConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"apellidoConsignatarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsignatario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConsignatario"));
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsignatario"));
		}
		
		this.jTableDatosConsignatario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConsignatario"));
		
		this.jTableDatosConsignatario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConsignatario"));
		
		this.jButtonNuevoConsignatario.addActionListener(new ButtonActionListener(this,"NuevoConsignatario"));
		
		this.jButtonDuplicarConsignatario.addActionListener(new ButtonActionListener(this,"DuplicarConsignatario"));
		
		this.jButtonCopiarConsignatario.addActionListener(new ButtonActionListener(this,"CopiarConsignatario"));
		
		this.jButtonVerFormConsignatario.addActionListener(new ButtonActionListener(this,"VerFormConsignatario"));
		
		
		this.jButtonNuevoToolBarConsignatario.addActionListener(new ButtonActionListener(this,"NuevoToolBarConsignatario"));
			
		this.jButtonDuplicarToolBarConsignatario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConsignatario"));
			
		this.jMenuItemNuevoConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConsignatario"));
			
		this.jMenuItemDuplicarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConsignatario"));		
		
		
		this.jButtonNuevoRelacionesConsignatario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConsignatario"));
		
		
		this.jButtonNuevoRelacionesToolBarConsignatario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConsignatario"));
			
		this.jMenuItemNuevoRelacionesConsignatario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConsignatario"));		
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonModificarConsignatario.addActionListener(new ButtonActionListener(this,"ModificarConsignatario"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonModificarToolBarConsignatario.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsignatario"));
			
			this.jInternalFrameDetalleFormConsignatario.jMenuItemModificarConsignatario.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsignatario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConsignatario.jButtonActualizarConsignatario.addActionListener (new ButtonActionListener(this,"ActualizarConsignatario"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonActualizarToolBarConsignatario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsignatario"));
				
			this.jInternalFrameDetalleFormConsignatario.jMenuItemActualizarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsignatario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonEliminarConsignatario.addActionListener (new ButtonActionListener(this,"EliminarConsignatario"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonEliminarToolBarConsignatario.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsignatario"));
						
			this.jInternalFrameDetalleFormConsignatario.jMenuItemEliminarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsignatario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonCancelarConsignatario.addActionListener (new ButtonActionListener(this,"CancelarConsignatario"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonCancelarToolBarConsignatario.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsignatario"));
			
			this.jInternalFrameDetalleFormConsignatario.jMenuItemCancelarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsignatario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConsignatario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConsignatario"));		
		
		
		this.jButtonCerrarConsignatario.addActionListener (new ButtonActionListener(this,"CerrarConsignatario"));
		
		
		this.jButtonCerrarToolBarConsignatario.addActionListener (new ButtonActionListener(this,"CerrarToolBarConsignatario"));
			
		this.jMenuItemCerrarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConsignatario"));
			
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jMenuItemDetalleCerrarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsignatario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosConsignatario.addActionListener (new ButtonActionListener(this,"GuardarCambiosConsignatario"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosToolBarConsignatario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsignatario"));
		}
		
		this.jButtonCopiarToolBarConsignatario.addActionListener (new ButtonActionListener(this,"CopiarToolBarConsignatario"));
			
		this.jButtonVerFormToolBarConsignatario.addActionListener (new ButtonActionListener(this,"VerFormToolBarConsignatario"));
		
		this.jMenuItemGuardarCambiosConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConsignatario"));
			
		this.jMenuItemCopiarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConsignatario"));		
		
		this.jMenuItemVerFormConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConsignatario"));		
		
		
		this.jButtonGuardarCambiosTablaConsignatario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsignatario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConsignatario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConsignatario"));
			
		this.jMenuItemGuardarCambiosTablaConsignatario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsignatario"));		
		
		
		
		this.jButtonRecargarInformacionConsignatario.addActionListener (new ButtonActionListener(this,"RecargarInformacionConsignatario"));
					
		this.jButtonRecargarInformacionToolBarConsignatario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConsignatario"));
		
		this.jMenuItemRecargarInformacionConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConsignatario"));		
		
		
		
		this.jButtonAnterioresConsignatario.addActionListener (new ButtonActionListener(this,"AnterioresConsignatario"));
		
		
		this.jButtonAnterioresToolBarConsignatario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConsignatario"));
		
		this.jMenuItemAnterioresConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConsignatario"));		
		
		
		this.jButtonSiguientesConsignatario.addActionListener (new ButtonActionListener(this,"SiguientesConsignatario"));
		
		
		this.jButtonSiguientesToolBarConsignatario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConsignatario"));
			
		this.jMenuItemSiguientesConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConsignatario"));
			
		this.jMenuItemAbrirOrderByConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConsignatario"));
			
		this.jMenuItemMostrarOcultarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConsignatario"));
			
		this.jMenuItemDetalleAbrirOrderByConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConsignatario"));
			
		this.jMenuItemDetalleMostarOcultarConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConsignatario"));		
		
		
		this.jButtonNuevoGuardarCambiosConsignatario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConsignatario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsignatario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConsignatario"));
			
		this.jMenuItemNuevoGuardarCambiosConsignatario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConsignatario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConsignatario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConsignatario"));

		this.jCheckBoxSeleccionadosConsignatario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConsignatario"));
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsignatario"));
		}
		
		
		this.jComboBoxTiposRelacionesConsignatario.addActionListener (new ButtonActionListener(this,"TiposRelacionesConsignatario"));
			
		this.jComboBoxTiposAccionesConsignatario.addActionListener (new ButtonActionListener(this,"TiposAccionesConsignatario"));
					
		this.jComboBoxTiposSeleccionarConsignatario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConsignatario"));
			
		this.jTextFieldValorCampoGeneralConsignatario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConsignatario"));		
		
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonidConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"idConsignatarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_empresaConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_empresaConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsignatarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_sucursalConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_sucursalConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalConsignatarioBusqueda"));
		//jButtonid_clienteConsignatario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteConsignatarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatario.addActionListener(new ButtonActionListener(this,"id_clienteConsignatario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_clienteConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteConsignatarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_usuarioConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_usuarioConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioConsignatarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonnombre_completoConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoConsignatarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonnombreConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsignatarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonapellidoConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"apellidoConsignatarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteConsignatario.addActionListener(new ButtonActionListener(this,"FK_IdClienteConsignatario"));

			this.jButtonBuscarFK_IdClienteid_clienteConsignatario.addActionListener(new ButtonActionListener(this,"id_clienteConsignatario"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConsignatario!=null) {
				this.jInternalFrameReporteDinamicoConsignatario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsignatario"));
				this.jInternalFrameReporteDinamicoConsignatario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsignatario"));
				this.jInternalFrameReporteDinamicoConsignatario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsignatario"));
			}
			
			//this.jButtonCerrarReporteDinamicoConsignatario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsignatario"));				
			//this.jButtonGenerarReporteDinamicoConsignatario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsignatario"));
			//this.jButtonGenerarExcelReporteDinamicoConsignatario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsignatario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConsignatario!=null) {
				this.jInternalFrameImportacionConsignatario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsignatario"));
				this.jInternalFrameImportacionConsignatario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsignatario"));
				this.jInternalFrameImportacionConsignatario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsignatario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConsignatario.addActionListener (new ButtonActionListener(this,"AbrirOrderByConsignatario"));
			
			this.jButtonAbrirOrderByToolBarConsignatario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConsignatario"));			
			
			if(this.jInternalFrameOrderByConsignatario!=null) {
				this.jInternalFrameOrderByConsignatario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsignatario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConsignatario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsignatario.jTabbedPaneRelacionesConsignatario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsignatario"));
		
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
            		closingInternalFrameConsignatario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConsignatario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConsignatario = (JInternalFrameBase)event.getSource();
	            	
	            ConsignatarioBeanSwingJInternalFrame jInternalFrameParent=(ConsignatarioBeanSwingJInternalFrame)jInternalFrameDetalleFormConsignatario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConsignatarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConsignatario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConsignatarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConsignatario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConsignatario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsignatarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsignatarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsignatarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConsignatario";
		inputMap = this.jButtonNuevoConsignatario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConsignatario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsignatarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsignatarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsignatarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsignatarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConsignatario";
		inputMap = this.jButtonNuevoRelacionesConsignatario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConsignatario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsignatarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConsignatario";
		inputMap = this.jButtonModificarConsignatario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConsignatario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConsignatarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConsignatario";
		inputMap = this.jButtonActualizarConsignatario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConsignatario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConsignatarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConsignatario";
		inputMap = this.jButtonEliminarConsignatario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConsignatario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConsignatarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConsignatario";
		inputMap = this.jButtonCancelarConsignatario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConsignatario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConsignatarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConsignatario";
		inputMap = this.jButtonCerrarConsignatario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConsignatario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConsignatarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConsignatario";
		inputMap = this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosConsignatario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConsignatario.jButtonGuardarCambiosConsignatario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConsignatarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConsignatario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConsignatarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConsignatario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConsignatarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConsignatario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConsignatarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConsignatario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConsignatarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonidConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"idConsignatarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_empresaConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_empresaConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsignatarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_sucursalConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_sucursalConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalConsignatarioBusqueda"));
		//jButtonid_clienteConsignatario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteConsignatarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatario.addActionListener(new ButtonActionListener(this,"id_clienteConsignatario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_clienteConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteConsignatarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsignatario.jButtonid_usuarioConsignatarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioConsignatarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonid_usuarioConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioConsignatarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonnombre_completoConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoConsignatarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonnombreConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsignatarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsignatario.jButtonapellidoConsignatarioBusqueda.addActionListener(new ButtonActionListener(this,"apellidoConsignatarioBusqueda"));
		
		
		this.jButtonFK_IdClienteConsignatario.addActionListener(new ButtonActionListener(this,"FK_IdClienteConsignatario"));

		this.jButtonBuscarFK_IdClienteid_clienteConsignatario.addActionListener(new ButtonActionListener(this,"id_clienteConsignatario"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConsignatario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConsignatarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConsignatarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConsignatario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConsignatario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Consignatario consignatarioAux:this.consignatarioLogic.getConsignatarios()) {
					consignatarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Consignatario consignatarioAux:consignatarios) {
					consignatarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConsignatarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsignatario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Consignatario consignatarioAux:this.consignatarioLogic.getConsignatarios()) {
						consignatarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Consignatario consignatarioAux:consignatarios) {
						consignatarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Consignatario consignatarioAux:this.consignatarioLogic.getConsignatarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Consignatario consignatarioAux:consignatarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConsignatario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsignatario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsignatario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConsignatarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsignatario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConsignatario.getSelectedRows();
			
			Consignatario consignatarioLocal=new Consignatario();
			
			//this.seleccionarTodosConsignatario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consignatarioLocal =(Consignatario) this.consignatarioLogic.getConsignatarios().toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					consignatarioLocal =(Consignatario) this.consignatarios.toArray()[this.jTableDatosConsignatario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				consignatarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Consignatario consignatarioAux:this.consignatarioLogic.getConsignatarios()) {
						consignatarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Consignatario consignatarioAux:consignatarios) {
						consignatarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConsignatario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsignatario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsignatario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsignatario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConsignatarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConsignatarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConsignatarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConsignatario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConsignatario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Consignatario consignatarioAux:this.consignatarioLogic.getConsignatarios()) {
				
						if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							consignatarioAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							consignatarioAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							consignatarioAux.setapellido(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Consignatario consignatarioAux:consignatarios) {
					
						if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							consignatarioAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							consignatarioAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							consignatarioAux.setapellido(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConsignatario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConsignatarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConsignatario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConsignatario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConsignatario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConsignatario) {				
					conSplash=true;//false;										
					
					//this.startProcessConsignatario(conSplash);
				
					this.generarReporteConsignatariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConsignatariosSeleccionados();
				//this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsignatariosSeleccionados(false);
				//this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsignatariosSeleccionados(true);
				//this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsignatario();
				
				this.exportarConsignatariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConsignatarios();
				//this.importarConsignatarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsignatario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConsignatariosSeleccionados();
				//this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Consignatario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConsignatario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConsignatario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConsignatario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.setSelectedIndex(0);					
				}	
			} 			
			else if(ConsignatarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConsignatario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConsignatario(conSplash);
					
						//this.actualizarParametrosGeneralConsignatario();
						
						this.generarReporteProcesoAccionConsignatariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConsignatarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ConsignatarioS SELECCIONADOS?", "MANTENIMIENTO DE Consignatario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConsignatario();
				
						this.actualizarParametrosGeneralConsignatario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.consignatarioReturnGeneral=consignatarioLogic.procesarAccionConsignatariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.consignatarioLogic.getConsignatarios(),this.consignatarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConsignatarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConsignatario();
					
					ConsignatarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConsignatarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsignatario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsignatario.jComboBoxTiposAccionesFormularioConsignatario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConsignatario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConsignatarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConsignatario();
			
			if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();		
			Consignatario consignatario=new Consignatario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConsignatario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConsignatario.getSelectedItem();
			
			
			
			
			consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(consignatariosSeleccionados.size()==1) {
				for(Consignatario consignatarioAux:consignatariosSeleccionados) {
					consignatario=consignatarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Proforma")) {
					jButtonProformaActionPerformed(null,rowIndex,true,false,consignatario);
				}
				else if(this.sTipoRelacion.equals("Consignacion")) {
					jButtonConsignacionActionPerformed(null,rowIndex,true,false,consignatario);
				}
				else if(this.sTipoRelacion.equals("Pedido Exportacion")) {
					jButtonPedidoExporActionPerformed(null,rowIndex,true,false,consignatario);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConsignatario();
			
      		//this.finishProcessConsignatario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConsignatarioReturnGeneral() throws Exception {
		if(this.consignatarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.consignatarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.consignatarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.consignatarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.consignatarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.consignatarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConsignatario(false);
		}
		
		if(this.consignatarioReturnGeneral.getConRetornoLista() || this.consignatarioReturnGeneral.getConRetornoObjeto()) {
			if(this.consignatarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.consignatarioLogic.setConsignatarios(this.consignatarioReturnGeneral.getConsignatarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.consignatarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.consignatarioLogic.setConsignatario(this.consignatarioReturnGeneral.getConsignatario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingConsignatario(false);
		}
	}
	
	public void actualizarParametrosGeneralConsignatario() throws Exception {
		
		
	}
	
	public ArrayList<Consignatario> getConsignatariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConsignatario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Consignatario consignatarioAux:consignatarioLogic.getConsignatarios()) {
					if(consignatarioAux.getIsSelected()) {
						consignatariosSeleccionados.add(consignatarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Consignatario consignatarioAux:this.consignatarios) {
					if(consignatarioAux.getIsSelected()) {
						consignatariosSeleccionados.add(consignatarioAux);				
					}
				}
			}
			
			if(consignatariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						consignatariosSeleccionados.addAll(this.consignatarioLogic.getConsignatarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						consignatariosSeleccionados.addAll(this.consignatarios);				
					}
				}
			}
		} else {
			consignatariosSeleccionados.add(this.consignatario);
		}
		
		return consignatariosSeleccionados;
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
	
	public void generarReporteConsignatariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConsignatariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConsignatariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsignatariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsignatariosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesConsignatariosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Consignatario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConsignatariosSeleccionados() throws Exception {
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();		
		
		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConsignatarios("Todos",consignatariosSeleccionados);
		
	}	
	
	public void generarReporteNormalConsignatariosSeleccionados() throws Exception {
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();		
		
		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConsignatarios("Todos",consignatariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConsignatariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();
		
		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConsignatarios("Todos",consignatariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConsignatariosSeleccionados() throws Exception {
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConsignatario();
		
		
		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConsignatario();
		
		
		//this.generarReporteConsignatarios("Todos",consignatariosSeleccionados ,consignatarioImplementable,consignatarioImplementableHome);
	}
	
	public void mostrarImportacionConsignatarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConsignatario();
		
		this.abrirFrameImportacionConsignatario();		
		
			
		//this.generarReporteConsignatarios("Todos",consignatariosSeleccionados ,consignatarioImplementable,consignatarioImplementableHome);
	}
	
	public void importarConsignatarios() throws Exception {		
	
	}
	
	public void exportarConsignatariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConsignatariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConsignatariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConsignatariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Consignatario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConsignatariosSeleccionados() throws Exception {
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();		
		
		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consignatario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConsignatario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Consignatario consignatarioAux:consignatariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConsignatario(consignatarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//consignatarioAux.setsDetalleGeneralEntityReporte(consignatarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConsignatario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConsignatarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsignatarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsignatarioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsignatarioConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsignatarioConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsignatarioConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsignatarioConstantesFunciones.LABEL_APELLIDO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConsignatario(Consignatario consignatario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=consignatario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=consignatario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=consignatario.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consignatario.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consignatario.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consignatario.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consignatario.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consignatario.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consignatario.getapellido();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConsignatariosSeleccionados() throws Exception {
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();		
		
		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consignatario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Consignatarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConsignatario(row);				
				iRow++;
			}				
			
			for(Consignatario consignatarioAux:consignatariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConsignatario(consignatarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConsignatariosSeleccionados() throws Exception {
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();		
		
		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consignatario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("consignatarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("consignatario");
			//elementRoot.appendChild(element);
		
			for(Consignatario consignatarioAux:consignatariosSeleccionados) {
				element = document.createElement("consignatario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConsignatario(consignatarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consignatario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConsignatario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsignatarioConstantesFunciones.LABEL_APELLIDO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConsignatario(Consignatario consignatario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(consignatario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(consignatario.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consignatario.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consignatario.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consignatario.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consignatario.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(consignatario.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(consignatario.getapellido());				
	}
	
	public void setFilaDatosExportarXmlConsignatario(Consignatario consignatario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConsignatarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(consignatario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConsignatarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(consignatario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConsignatarioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(consignatario.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ConsignatarioConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(consignatario.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(ConsignatarioConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(consignatario.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementusuario_descripcion = document.createElement(ConsignatarioConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(consignatario.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementnombre_completo = document.createElement(ConsignatarioConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(consignatario.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementnombre = document.createElement(ConsignatarioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(consignatario.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementapellido = document.createElement(ConsignatarioConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(consignatario.getapellido().trim()));
		element.appendChild(elementapellido);
	}
	
	public void generarReporteGroupGenericoConsignatariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Consignatario> consignatariosSeleccionados=new ArrayList<Consignatario>();
		
		consignatariosSeleccionados=this.getConsignatariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConsignatario(consignatariosSeleccionados);
		
		this.generarReporteConsignatarios("Todos",consignatariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConsignatario(ArrayList<Consignatario> consignatariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Consignatario consignatarioAux:consignatariosSeleccionados) {
				consignatarioAux.setsDetalleGeneralEntityReporte(consignatarioAux.toString());
			
				if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					consignatarioAux.setsDescripcionGeneralEntityReporte1(consignatarioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					consignatarioAux.setsDescripcionGeneralEntityReporte1(consignatarioAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					consignatarioAux.setsDescripcionGeneralEntityReporte1(consignatarioAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					consignatarioAux.setsDescripcionGeneralEntityReporte1(consignatarioAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					consignatarioAux.setsDescripcionGeneralEntityReporte1(consignatarioAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					consignatarioAux.setsDescripcionGeneralEntityReporte1(consignatarioAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ConsignatarioConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					consignatarioAux.setsDescripcionGeneralEntityReporte1(consignatarioAux.getapellido());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsignatarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConsignatario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConsignatario=true;
				this.isVisibilidadCeldaNuevoRelacionesConsignatario=true;
				this.isVisibilidadCeldaGuardarCambiosConsignatario=true;
			}
			
			this.isVisibilidadCeldaModificarConsignatario=false;
			this.isVisibilidadCeldaActualizarConsignatario=false;
			this.isVisibilidadCeldaEliminarConsignatario=false;
			this.isVisibilidadCeldaCancelarConsignatario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsignatario=true;
				} else {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConsignatario=false;
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=false;
			this.isVisibilidadCeldaGuardarCambiosConsignatario=false;
			this.isVisibilidadCeldaModificarConsignatario=false;
			this.isVisibilidadCeldaActualizarConsignatario=true;
			this.isVisibilidadCeldaEliminarConsignatario=false;
			this.isVisibilidadCeldaCancelarConsignatario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsignatario=true;
				} else {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConsignatario=false;
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=false;
			this.isVisibilidadCeldaGuardarCambiosConsignatario=false;
			this.isVisibilidadCeldaModificarConsignatario=false;
			this.isVisibilidadCeldaActualizarConsignatario=true;
			this.isVisibilidadCeldaEliminarConsignatario=true;
			this.isVisibilidadCeldaCancelarConsignatario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsignatario=true;
				} else {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConsignatario=false;
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=false;
			this.isVisibilidadCeldaGuardarCambiosConsignatario=false;
			this.isVisibilidadCeldaModificarConsignatario=false;
			this.isVisibilidadCeldaActualizarConsignatario=true;
			this.isVisibilidadCeldaEliminarConsignatario=false;
			this.isVisibilidadCeldaCancelarConsignatario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				} else {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConsignatario=true;
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=true;
			this.isVisibilidadCeldaGuardarCambiosConsignatario=true;
			this.isVisibilidadCeldaModificarConsignatario=false;
			this.isVisibilidadCeldaActualizarConsignatario=false;
			this.isVisibilidadCeldaEliminarConsignatario=false;
			this.isVisibilidadCeldaCancelarConsignatario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsignatario=true;
				} else {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConsignatario=false;
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=false;
			this.isVisibilidadCeldaGuardarCambiosConsignatario=false;
			this.isVisibilidadCeldaActualizarConsignatario=false;
			this.isVisibilidadCeldaEliminarConsignatario=false;
			this.isVisibilidadCeldaCancelarConsignatario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				} else {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConsignatario=false;
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=false;
			this.isVisibilidadCeldaGuardarCambiosConsignatario=false;
			this.isVisibilidadCeldaModificarConsignatario=true;
			this.isVisibilidadCeldaActualizarConsignatario=false;
			this.isVisibilidadCeldaEliminarConsignatario=false;
			this.isVisibilidadCeldaCancelarConsignatario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				} else {
					this.isVisibilidadCeldaGuardarConsignatario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConsignatarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConsignatario=true;
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=true;
			this.isVisibilidadCeldaGuardarCambiosConsignatario=true;
		} else {
			this.actualizarEstadoPanelsConsignatario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConsignatario=false;
			//this.isVisibilidadCeldaVerFormConsignatario=false;
			this.isVisibilidadCeldaDuplicarConsignatario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!consignatarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=false;
		} else {
			this.isVisibilidadCeldaNuevoConsignatario=false;
			this.isVisibilidadCeldaGuardarCambiosConsignatario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(consignatarioSessionBean.getEsGuardarRelacionado()) {
			if(!consignatarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConsignatario=false;												
			}
			
			this.jButtonCerrarConsignatario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConsignatario=false;
		}
		
		if(!this.permiteMantenimiento(this.consignatario)) {
			this.isVisibilidadCeldaActualizarConsignatario=false;
			this.isVisibilidadCeldaEliminarConsignatario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConsignatario() {
		this.isVisibilidadCeldaNuevoConsignatario=false;
		this.isVisibilidadCeldaGuardarCambiosConsignatario=false;
	}
	
	public void actualizarEstadoPanelsConsignatario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConsignatario!=null) {
				this.jScrollPanelDatosEdicionConsignatario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsignatario!=null) {
				this.jTabbedPaneBusquedasConsignatario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsignatario!=null) {
				this.jScrollPanelDatosConsignatario.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsignatario!=null) {
				this.jPanelPaginacionConsignatario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsignatario!=null) {
				this.jPanelParametrosReportesConsignatario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConsignatario!=null) {
				this.jScrollPanelDatosEdicionConsignatario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsignatario!=null) {
				this.jTabbedPaneBusquedasConsignatario.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConsignatario!=null) {
				this.jScrollPanelDatosConsignatario.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsignatario!=null) {
				this.jPanelPaginacionConsignatario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsignatario!=null) {
				this.jPanelParametrosReportesConsignatario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConsignatario!=null) {
				this.jScrollPanelDatosEdicionConsignatario.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsignatario!=null) {
				this.jTabbedPaneBusquedasConsignatario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsignatario!=null) {
				this.jScrollPanelDatosConsignatario.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsignatario!=null) {
				this.jPanelPaginacionConsignatario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsignatario!=null) {
				this.jPanelParametrosReportesConsignatario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConsignatario!=null) {
				this.jScrollPanelDatosEdicionConsignatario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsignatario!=null) {
				this.jTabbedPaneBusquedasConsignatario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsignatario!=null) {
				this.jScrollPanelDatosConsignatario.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsignatario!=null) {
				this.jPanelPaginacionConsignatario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsignatario!=null) {
				this.jPanelParametrosReportesConsignatario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConsignatario!=null) {
				this.jScrollPanelDatosEdicionConsignatario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsignatario!=null) {
				this.jTabbedPaneBusquedasConsignatario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsignatario!=null) {
				this.jScrollPanelDatosConsignatario.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsignatario!=null) {
				this.jPanelPaginacionConsignatario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsignatario!=null) {
				this.jPanelParametrosReportesConsignatario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConsignatario!=null) {
				this.jScrollPanelDatosEdicionConsignatario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsignatario!=null) {
				this.jTabbedPaneBusquedasConsignatario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsignatario!=null) {
				this.jScrollPanelDatosConsignatario.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsignatario!=null) {
				this.jPanelPaginacionConsignatario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsignatario!=null) {
				this.jPanelParametrosReportesConsignatario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConsignatario!=null) {
				this.jScrollPanelDatosEdicionConsignatario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsignatario!=null) {
				this.jTabbedPaneBusquedasConsignatario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsignatario!=null) {
				this.jScrollPanelDatosConsignatario.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsignatario!=null) {
				this.jPanelPaginacionConsignatario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsignatario!=null) {
				this.jPanelParametrosReportesConsignatario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConsignatario!=null) {
					this.jTabbedPaneBusquedasConsignatario.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConsignatario!=null) {
				this.jPanelParametrosReportesConsignatario.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsignatario!=null) {
				this.jTabbedPaneBusquedasConsignatario.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConsignatario!=null) {
				this.jPanelParametrosReportesConsignatario.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasConsignatario.remove(jPanelFK_IdClienteConsignatario);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasConsignatario.remove(jPanelFK_IdClienteConsignatario);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasConsignatario.remove(jPanelFK_IdClienteConsignatario);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdCliente=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasConsignatario.remove(jPanelFK_IdClienteConsignatario);}
		}
		
	}
	
	

	public String registrarSesionConsignatarioParaProformas() throws Exception {
		Boolean isPaginaPopupProforma=false;

		try {

			if(this.consignatarioSessionBean==null) {
				this.consignatarioSessionBean=new ConsignatarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormConsignatario.proformaSessionBean==null) {
				this.jInternalFrameDetalleFormConsignatario.proformaSessionBean=new ProformaSessionBean();
			}

			this.jInternalFrameDetalleFormConsignatario.proformaSessionBean.setsPathNavegacionActual(consignatarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProformaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConsignatario.proformaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProforma=this.jInternalFrameDetalleFormConsignatario.proformaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConsignatario.proformaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProforma(true);
			this.jInternalFrameDetalleFormConsignatario.proformaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProforma(ConsignatarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConsignatario.proformaSessionBean.setisBusquedaDesdeForeignKeySesionConsignatario(true);
			this.jInternalFrameDetalleFormConsignatario.proformaSessionBean.setlidConsignatarioActual(this.idConsignatarioActual);

			consignatarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConsignatario(true);
			consignatarioSessionBean.setlIdConsignatarioActualForeignKey(this.idConsignatarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionConsignatarioParaConsignacions() throws Exception {
		Boolean isPaginaPopupConsignacion=false;

		try {

			if(this.consignatarioSessionBean==null) {
				this.consignatarioSessionBean=new ConsignatarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormConsignatario.consignacionSessionBean==null) {
				this.jInternalFrameDetalleFormConsignatario.consignacionSessionBean=new ConsignacionSessionBean();
			}

			this.jInternalFrameDetalleFormConsignatario.consignacionSessionBean.setsPathNavegacionActual(consignatarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConsignatario.consignacionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupConsignacion=this.jInternalFrameDetalleFormConsignatario.consignacionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConsignatario.consignacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeConsignacion(true);
			this.jInternalFrameDetalleFormConsignatario.consignacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeConsignacion(ConsignatarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConsignatario.consignacionSessionBean.setisBusquedaDesdeForeignKeySesionConsignatario(true);
			this.jInternalFrameDetalleFormConsignatario.consignacionSessionBean.setlidConsignatarioActual(this.idConsignatarioActual);

			consignatarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConsignatario(true);
			consignatarioSessionBean.setlIdConsignatarioActualForeignKey(this.idConsignatarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionConsignatarioParaPedidoExpors() throws Exception {
		Boolean isPaginaPopupPedidoExpor=false;

		try {

			if(this.consignatarioSessionBean==null) {
				this.consignatarioSessionBean=new ConsignatarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormConsignatario.pedidoexporSessionBean==null) {
				this.jInternalFrameDetalleFormConsignatario.pedidoexporSessionBean=new PedidoExporSessionBean();
			}

			this.jInternalFrameDetalleFormConsignatario.pedidoexporSessionBean.setsPathNavegacionActual(consignatarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConsignatario.pedidoexporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoExpor=this.jInternalFrameDetalleFormConsignatario.pedidoexporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConsignatario.pedidoexporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoExpor(true);
			this.jInternalFrameDetalleFormConsignatario.pedidoexporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoExpor(ConsignatarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConsignatario.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionConsignatario(true);
			this.jInternalFrameDetalleFormConsignatario.pedidoexporSessionBean.setlidConsignatarioActual(this.idConsignatarioActual);

			consignatarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConsignatario(true);
			consignatarioSessionBean.setlIdConsignatarioActualForeignKey(this.idConsignatarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionConsignatarioParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(consignatarioSessionBean==null) {
				consignatarioSessionBean=new ConsignatarioSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(consignatarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.consignatarioFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ConsignatarioConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionConsignatario(true);
			//clienteSessionBean.setlidConsignatarioActual(this.idConsignatarioActual);

			consignatarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConsignatario(true);
			consignatarioSessionBean.setlIdConsignatarioActualForeignKey(this.idConsignatarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ConsignatarioSessionBean consignatarioSessionBean=new ConsignatarioSessionBean();
		
		if(this.consignatarioSessionBean==null) {
			this.consignatarioSessionBean=new ConsignatarioSessionBean();
		}
		
		this.consignatarioSessionBean.setsUltimaBusquedaConsignatario(this.getsAccionBusqueda());
		this.consignatarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.consignatarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			consignatarioSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			consignatarioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			consignatarioSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			consignatarioSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ConsignatarioSessionBean consignatarioSessionBean=new ConsignatarioSessionBean();
		
		if(this.consignatarioSessionBean==null) {
			this.consignatarioSessionBean=new ConsignatarioSessionBean();
		}
		
		if(this.consignatarioSessionBean.getsUltimaBusquedaConsignatario()!=null&&!this.consignatarioSessionBean.getsUltimaBusquedaConsignatario().equals("")) {
			this.setsAccionBusqueda(consignatarioSessionBean.getsUltimaBusquedaConsignatario());
			this.setiNumeroPaginacion(consignatarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(consignatarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(consignatarioSessionBean.getid_cliente());
				consignatarioSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(consignatarioSessionBean.getid_empresa());
				consignatarioSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(consignatarioSessionBean.getid_sucursal());
				consignatarioSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(consignatarioSessionBean.getid_usuario());
				consignatarioSessionBean.setid_usuario(-1L);
			}
		}
		
		this.consignatarioSessionBean.setsUltimaBusquedaConsignatario("");
		this.consignatarioSessionBean.setiNumeroPaginacion(ConsignatarioConstantesFunciones.INUMEROPAGINACION);
		this.consignatarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaConsignatario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConsignatario() {
		this.updateBorderResaltarBusquedasFormularioConsignatario();
		this.updateVisibilidadBusquedasFormularioConsignatario();
		this.updateHabilitarBusquedasFormularioConsignatario();
	}
	
	public void updateBorderResaltarBusquedasFormularioConsignatario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConsignatario.getComponents().length>0) {
	

		if(this.consignatarioConstantesFunciones.resaltarFK_IdClienteConsignatario!=null) {
			index= this.jTabbedPaneBusquedasConsignatario.indexOfComponent(this.jPanelFK_IdClienteConsignatario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsignatario.getComponent(index);
				jPanel.setBorder(this.consignatarioConstantesFunciones.resaltarFK_IdClienteConsignatario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConsignatario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConsignatario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsignatario.indexOfComponent(this.jPanelFK_IdClienteConsignatario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConsignatario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.consignatarioConstantesFunciones.mostrarFK_IdClienteConsignatario);
			if(!this.consignatarioConstantesFunciones.mostrarFK_IdClienteConsignatario && index>-1) {
				this.jTabbedPaneBusquedasConsignatario.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConsignatario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConsignatario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsignatario.indexOfComponent(this.jPanelFK_IdClienteConsignatario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConsignatario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.consignatarioConstantesFunciones.activarFK_IdClienteConsignatario);
				this.jTabbedPaneBusquedasConsignatario.setEnabledAt(index,this.consignatarioConstantesFunciones.activarFK_IdClienteConsignatario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConsignatario(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasConsignatario.indexOfComponent(this.jPanelFK_IdClienteConsignatario);

			this.jTabbedPaneBusquedasConsignatario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsignatario.getComponent(index);

			this.consignatarioConstantesFunciones.setResaltarFK_IdClienteConsignatario(resaltar);

			jPanel.setBorder(this.consignatarioConstantesFunciones.resaltarFK_IdClienteConsignatario);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConsignatario.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConsignatario() throws Exception {

		if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConsignatario();
		this.updateVisibilidadResaltarControlesFormularioConsignatario();
		this.updateHabilitarResaltarControlesFormularioConsignatario();
		
	}
	
	public void updateBorderResaltarControlesFormularioConsignatario() throws Exception {
		if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.consignatarioConstantesFunciones.resaltaridConsignatario!=null && this.jInternalFrameDetalleFormConsignatario!=null) {this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.setBorder(this.consignatarioConstantesFunciones.resaltaridConsignatario);}
		if(this.consignatarioConstantesFunciones.resaltarid_empresaConsignatario!=null && this.jInternalFrameDetalleFormConsignatario!=null) {this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.setBorder(this.consignatarioConstantesFunciones.resaltarid_empresaConsignatario);}
		if(this.consignatarioConstantesFunciones.resaltarid_sucursalConsignatario!=null && this.jInternalFrameDetalleFormConsignatario!=null) {this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.setBorder(this.consignatarioConstantesFunciones.resaltarid_sucursalConsignatario);}
		if(this.consignatarioConstantesFunciones.resaltarid_clienteConsignatario!=null && this.jInternalFrameDetalleFormConsignatario!=null) {this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.setBorder(this.consignatarioConstantesFunciones.resaltarid_clienteConsignatario);}
		if(this.consignatarioConstantesFunciones.resaltarid_usuarioConsignatario!=null && this.jInternalFrameDetalleFormConsignatario!=null) {this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.setBorder(this.consignatarioConstantesFunciones.resaltarid_usuarioConsignatario);}
		if(this.consignatarioConstantesFunciones.resaltarnombre_completoConsignatario!=null && this.jInternalFrameDetalleFormConsignatario!=null) {this.jInternalFrameDetalleFormConsignatario.jTextFieldnombre_completoConsignatario.setBorder(this.consignatarioConstantesFunciones.resaltarnombre_completoConsignatario);}
		if(this.consignatarioConstantesFunciones.resaltarnombreConsignatario!=null && this.jInternalFrameDetalleFormConsignatario!=null) {this.jInternalFrameDetalleFormConsignatario.jTextAreanombreConsignatario.setBorder(this.consignatarioConstantesFunciones.resaltarnombreConsignatario);}
		if(this.consignatarioConstantesFunciones.resaltarapellidoConsignatario!=null && this.jInternalFrameDetalleFormConsignatario!=null) {this.jInternalFrameDetalleFormConsignatario.jTextAreaapellidoConsignatario.setBorder(this.consignatarioConstantesFunciones.resaltarapellidoConsignatario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConsignatario() throws Exception {		
		if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) {
	
		//this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.setVisible(this.consignatarioConstantesFunciones.mostraridConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jPanelidConsignatario.setVisible(this.consignatarioConstantesFunciones.mostraridConsignatario);
		//this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarid_empresaConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jPanelid_empresaConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarid_empresaConsignatario);
		//this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarid_sucursalConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jPanelid_sucursalConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarid_sucursalConsignatario);
		//this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarid_clienteConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jPanelid_clienteConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarid_clienteConsignatario);
			this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarid_clienteConsignatario);
		//this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarid_usuarioConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jPanelid_usuarioConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarid_usuarioConsignatario);
		//this.jInternalFrameDetalleFormConsignatario.jTextFieldnombre_completoConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarnombre_completoConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jPanelnombre_completoConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarnombre_completoConsignatario);
		//this.jInternalFrameDetalleFormConsignatario.jTextAreanombreConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarnombreConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jPanelnombreConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarnombreConsignatario);
		//this.jInternalFrameDetalleFormConsignatario.jTextAreaapellidoConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarapellidoConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jPanelapellidoConsignatario.setVisible(this.consignatarioConstantesFunciones.mostrarapellidoConsignatario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConsignatario() throws Exception {
		if(this.jInternalFrameDetalleFormConsignatario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsignatario!=null) {
	
		this.jInternalFrameDetalleFormConsignatario.jLabelidConsignatario.setEnabled(this.consignatarioConstantesFunciones.activaridConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jComboBoxid_empresaConsignatario.setEnabled(this.consignatarioConstantesFunciones.activarid_empresaConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jComboBoxid_sucursalConsignatario.setEnabled(this.consignatarioConstantesFunciones.activarid_sucursalConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jComboBoxid_clienteConsignatario.setEnabled(this.consignatarioConstantesFunciones.activarid_clienteConsignatario);
			this.jInternalFrameDetalleFormConsignatario.jButtonid_clienteConsignatario.setEnabled(this.consignatarioConstantesFunciones.activarid_clienteConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jComboBoxid_usuarioConsignatario.setEnabled(this.consignatarioConstantesFunciones.activarid_usuarioConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jTextFieldnombre_completoConsignatario.setEnabled(this.consignatarioConstantesFunciones.activarnombre_completoConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jTextAreanombreConsignatario.setEnabled(this.consignatarioConstantesFunciones.activarnombreConsignatario);
		this.jInternalFrameDetalleFormConsignatario.jTextAreaapellidoConsignatario.setEnabled(this.consignatarioConstantesFunciones.activarapellidoConsignatario);
		}
	}
	
		
}