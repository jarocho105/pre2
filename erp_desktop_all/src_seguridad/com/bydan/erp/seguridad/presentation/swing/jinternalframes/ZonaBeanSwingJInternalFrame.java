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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.ZonaConstantesFunciones;
import com.bydan.erp.seguridad.util.ZonaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ZonaParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.ZonaBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ZonaBeanSwingJInternalFrame extends ZonaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ZonaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Zona> zonaValidator = new ClassValidator<Zona>(Zona.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Zona zona;	
	public Zona zonaAux;
	public Zona zonaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Zona zonaTotales;
	public Long idZonaActual;
	public Long iIdNuevoZona=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosSubCliente=false;

	public Boolean getIsTienePermisosSubCliente() {
		return isTienePermisosSubCliente;
	}

	public void setIsTienePermisosSubCliente(Boolean isTienePermisosSubCliente) {
		this.isTienePermisosSubCliente= isTienePermisosSubCliente;
	}


	public Boolean isTienePermisosVendedor=false;

	public Boolean getIsTienePermisosVendedor() {
		return isTienePermisosVendedor;
	}

	public void setIsTienePermisosVendedor(Boolean isTienePermisosVendedor) {
		this.isTienePermisosVendedor= isTienePermisosVendedor;
	}


	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosVendedorZona=false;

	public Boolean getIsTienePermisosVendedorZona() {
		return isTienePermisosVendedorZona;
	}

	public void setIsTienePermisosVendedorZona(Boolean isTienePermisosVendedorZona) {
		this.isTienePermisosVendedorZona= isTienePermisosVendedorZona;
	}


	public Boolean isTienePermisosPresupuestoVentas=false;

	public Boolean getIsTienePermisosPresupuestoVentas() {
		return isTienePermisosPresupuestoVentas;
	}

	public void setIsTienePermisosPresupuestoVentas(Boolean isTienePermisosPresupuestoVentas) {
		this.isTienePermisosPresupuestoVentas= isTienePermisosPresupuestoVentas;
	}


	public Boolean isTienePermisosPresupuestoVentasLineas=false;

	public Boolean getIsTienePermisosPresupuestoVentasLineas() {
		return isTienePermisosPresupuestoVentasLineas;
	}

	public void setIsTienePermisosPresupuestoVentasLineas(Boolean isTienePermisosPresupuestoVentasLineas) {
		this.isTienePermisosPresupuestoVentasLineas= isTienePermisosPresupuestoVentasLineas;
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
	
	public Boolean isPermisoTodoZona;
	public Boolean isPermisoNuevoZona;
	public Boolean isPermisoActualizarZona;
	public Boolean isPermisoActualizarOriginalZona;
	public Boolean isPermisoEliminarZona;
	public Boolean isPermisoGuardarCambiosZona;
	public Boolean isPermisoConsultaZona;
	public Boolean isPermisoBusquedaZona;
	public Boolean isPermisoReporteZona;
	public Boolean isPermisoPaginacionMedioZona;
	public Boolean isPermisoPaginacionAltoZona;
	public Boolean isPermisoPaginacionTodoZona;
	public Boolean isPermisoCopiarZona;
	public Boolean isPermisoVerFormZona;
	public Boolean isPermisoDuplicarZona;
	public Boolean isPermisoOrdenZona;
	
	
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
	
	public ZonaParameterReturnGeneral zonaReturnGeneral;
	public ZonaParameterReturnGeneral zonaParameterGeneral;
	
	

	public PresupuestoVentasLineasLogic presupuestoventaslineasLogic=null;

	public PresupuestoVentasLineasLogic getPresupuestoVentasLineasLogic() {
		return presupuestoventaslineasLogic;
	}

	public void setPresupuestoVentasLineasLogic(PresupuestoVentasLineasLogic presupuestoventaslineasLogic) {
		this.presupuestoventaslineasLogic = presupuestoventaslineasLogic;
	}


	public VendedorLogic vendedorLogic=null;

	public VendedorLogic getVendedorLogic() {
		return vendedorLogic;
	}

	public void setVendedorLogic(VendedorLogic vendedorLogic) {
		this.vendedorLogic = vendedorLogic;
	}


	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public SubClienteLogic subclienteLogic=null;

	public SubClienteLogic getSubClienteLogic() {
		return subclienteLogic;
	}

	public void setSubClienteLogic(SubClienteLogic subclienteLogic) {
		this.subclienteLogic = subclienteLogic;
	}


	public PresupuestoVentasLogic presupuestoventasLogic=null;

	public PresupuestoVentasLogic getPresupuestoVentasLogic() {
		return presupuestoventasLogic;
	}

	public void setPresupuestoVentasLogic(PresupuestoVentasLogic presupuestoventasLogic) {
		this.presupuestoventasLogic = presupuestoventasLogic;
	}


	public VendedorZonaLogic vendedorzonaLogic=null;

	public VendedorZonaLogic getVendedorZonaLogic() {
		return vendedorzonaLogic;
	}

	public void setVendedorZonaLogic(VendedorZonaLogic vendedorzonaLogic) {
		this.vendedorzonaLogic = vendedorzonaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoZona=false;
	public Boolean esParaAccionDesdeFormularioZona=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ZonaSessionBeanAdditional zonaSessionBeanAdditional=null;
	
	public ZonaSessionBeanAdditional getZonaSessionBeanAdditional() {
		return this.zonaSessionBeanAdditional;
	}
	
	public void setZonaSessionBeanAdditional(ZonaSessionBeanAdditional zonaSessionBeanAdditional) {
		try {
			this.zonaSessionBeanAdditional=zonaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ZonaBeanSwingJInternalFrameAdditional zonaBeanSwingJInternalFrameAdditional=null;
	//public class ZonaBeanSwingJInternalFrame
	
	public ZonaBeanSwingJInternalFrameAdditional getZonaBeanSwingJInternalFrameAdditional() {
		return this.zonaBeanSwingJInternalFrameAdditional;
	}
	
	public void setZonaBeanSwingJInternalFrameAdditional(ZonaBeanSwingJInternalFrameAdditional zonaBeanSwingJInternalFrameAdditional) {
		try {
			this.zonaBeanSwingJInternalFrameAdditional=zonaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ZonaLogic zonaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Zona zonaBean;
	public ZonaConstantesFunciones zonaConstantesFunciones;
	//public ZonaParameterReturnGeneral zonaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<Zona> zonas;	
	//public List<Zona> zonasEliminados;
	//public List<Zona> zonasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoZona=false;
	public Boolean isVisibilidadCeldaDuplicarZona=true;
	public Boolean isVisibilidadCeldaCopiarZona=true;
	public Boolean isVisibilidadCeldaVerFormZona=true;
	public Boolean isVisibilidadCeldaOrdenZona=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesZona=false;
	public Boolean isVisibilidadCeldaModificarZona=false;
	public Boolean isVisibilidadCeldaActualizarZona=false;
	public Boolean isVisibilidadCeldaEliminarZona=false;
	public Boolean isVisibilidadCeldaCancelarZona=false;
	public Boolean isVisibilidadCeldaGuardarZona=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosZona=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoZona() {
		return this.iIdNuevoZona;
	}

	public void setiIdNuevoZona(Long iIdNuevoZona) {
		this.iIdNuevoZona = iIdNuevoZona;
	}
	
	public Long getidZonaActual() {
		return this.idZonaActual;
	}

	public void setidZonaActual(Long idZonaActual) {
		this.idZonaActual = idZonaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Zona getzona() {
		return this.zona;
	}

	public void setzona(Zona zona) {
		this.zona = zona;
	}
	
	public Zona getzonaAux() {
		return this.zonaAux;
	}

	public void setzonaAux(Zona zonaAux) {
		this.zonaAux = zonaAux;
	}				
	
	public Zona getzonaAnterior() {
		return this.zonaAnterior;
	}

	public void setzonaAnterior(Zona zonaAnterior) {
		this.zonaAnterior = zonaAnterior;
	}	
	
	public Zona getzonaTotales() {
		return this.zonaTotales;
	}

	public void setzonaTotales(Zona zonaTotales) {
		this.zonaTotales = zonaTotales;
	}	
	
	public Zona getzonaBean() {
		return this.zonaBean;
	}

	public void setzonaBean(Zona zonaBean) {
		this.zonaBean = zonaBean;
	}	
	
	public ZonaParameterReturnGeneral getzonaReturnGeneral() {
		return this.zonaReturnGeneral;
	}

	public void setzonaReturnGeneral(ZonaParameterReturnGeneral zonaReturnGeneral) {
		this.zonaReturnGeneral = zonaReturnGeneral;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ZonaLogic getZonaLogic()	{		
		return zonaLogic;
	}

	public void setZonaLogic(ZonaLogic zonaLogic) {
		this.zonaLogic = zonaLogic;
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
	
	public Boolean getIsEsNuevoZona() {
		return isEsNuevoZona;
	}

	public void setIsEsNuevoZona(Boolean isEsNuevoZona) {
		this.isEsNuevoZona = isEsNuevoZona;
	}

	public Boolean getEsParaAccionDesdeFormularioZona() {
		return esParaAccionDesdeFormularioZona;
	}
	
	public void setEsParaAccionDesdeFormularioZona(Boolean esParaAccionDesdeFormularioZona) {
		this.esParaAccionDesdeFormularioZona = esParaAccionDesdeFormularioZona;
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

			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
			}

			if(!this.zonaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(zonaSessionBean.getlidEmpresaActual());
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

			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
			}

			if(!this.zonaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(zonaSessionBean.getlidSucursalActual());
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

					if(this.zona!=null) {
						this.zona.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormZona!=null) {
						this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaZona.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormZona!=null) {
						if(this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.getItemCount()>0) {
							this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaZonaGenerico)throws Exception
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
				jComboBoxid_empresaZonaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaZonaGenerico!=null && jComboBoxid_empresaZonaGenerico.getItemCount()>0) {
					jComboBoxid_empresaZonaGenerico.setSelectedIndex(0);
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

					if(this.zona!=null) {
						this.zona.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormZona!=null) {
						this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalZona.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormZona!=null) {
						if(this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.getItemCount()>0) {
							this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalZonaGenerico)throws Exception
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
				jComboBoxid_sucursalZonaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalZonaGenerico!=null && jComboBoxid_sucursalZonaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalZonaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Zona zona,JComboBox jComboBoxid_empresaZonaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaZonaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaZonaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				zona.setid_empresa(empresaAux.getId());
				zona.setempresa_descripcion(ZonaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				zona.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Zona zona,JComboBox jComboBoxid_sucursalZonaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalZonaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalZonaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				zona.setid_sucursal(sucursalAux.getId());
				zona.setsucursal_descripcion(ZonaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				zona.setSucursal(sucursalAux);			}
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

					if(!ZonaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormZona!=null) { 
							this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormZona!=null) { 
					}

					if(!ZonaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ZonaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormZona!=null) { 
							this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormZona!=null) { 
					}

					if(!ZonaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormZona!=null) {
							this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormZona!=null) {
							this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormZona!=null) {
							this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormZona!=null) {
							this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesZona() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ZonaConstantesFunciones.refrescarForeignKeysDescripcionesZona(this.zonaLogic.getZonas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ZonaConstantesFunciones.refrescarForeignKeysDescripcionesZona(this.zonas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//zonaLogic.setZonas(this.zonas);
			zonaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ZonaParameterReturnGeneral getZonaParameterGeneral() {
		return this.zonaParameterGeneral;
	}
	
	public void setZonaParameterGeneral(ZonaParameterReturnGeneral zonaParameterGeneral) {
		this.zonaParameterGeneral = zonaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoZona() {
		return isPermisoTodoZona;
	}

	public void setIsPermisoTodoZona(Boolean isPermisoTodoZona) {
		this.isPermisoTodoZona = isPermisoTodoZona;
	}

	public Boolean getIsPermisoNuevoZona() {
		return isPermisoNuevoZona;
	}

	public void setIsPermisoNuevoZona(Boolean isPermisoNuevoZona) {
		this.isPermisoNuevoZona = isPermisoNuevoZona;
	}

	public Boolean getIsPermisoActualizarZona() {
		return isPermisoActualizarZona;
	}

	public void setIsPermisoActualizarZona(Boolean isPermisoActualizarZona) {
		this.isPermisoActualizarZona = isPermisoActualizarZona;
	}

	public Boolean getIsPermisoEliminarZona() {
		return isPermisoEliminarZona;
	}

	public void setIsPermisoEliminarZona(Boolean isPermisoEliminarZona) {
		this.isPermisoEliminarZona = isPermisoEliminarZona;
	}

	public Boolean getIsPermisoGuardarCambiosZona() {
		return isPermisoGuardarCambiosZona;
	}

	public void setIsPermisoGuardarCambiosZona(Boolean isPermisoGuardarCambiosZona) {
		this.isPermisoGuardarCambiosZona = isPermisoGuardarCambiosZona;
	}
	
	public Boolean getIsPermisoConsultaZona() {
		return isPermisoConsultaZona;
	}

	public void setIsPermisoConsultaZona(Boolean isPermisoConsultaZona) {
		this.isPermisoConsultaZona = isPermisoConsultaZona;
	}

	public Boolean getIsPermisoBusquedaZona() {
		return isPermisoBusquedaZona;
	}

	public void setIsPermisoBusquedaZona(Boolean isPermisoBusquedaZona) {
		this.isPermisoBusquedaZona = isPermisoBusquedaZona;
	}

	public Boolean getIsPermisoReporteZona() {
		return isPermisoReporteZona;
	}

	public void setIsPermisoReporteZona(Boolean isPermisoReporteZona) {
		this.isPermisoReporteZona = isPermisoReporteZona;
	}
	
	public Boolean getIsPermisoPaginacionMedioZona() {
		return isPermisoPaginacionMedioZona;
	}

	public void setIsPermisoPaginacionMedioZona(Boolean isPermisoPaginacionMedioZona) {
		this.isPermisoPaginacionMedioZona = isPermisoPaginacionMedioZona;
	}
	
	public Boolean getIsPermisoPaginacionTodoZona() {
		return isPermisoPaginacionTodoZona;
	}

	public void setIsPermisoPaginacionTodoZona(Boolean isPermisoPaginacionTodoZona) {
		this.isPermisoPaginacionTodoZona = isPermisoPaginacionTodoZona;
	}
	
	public Boolean getIsPermisoPaginacionAltoZona() {
		return isPermisoPaginacionAltoZona;
	}

	public void setIsPermisoPaginacionAltoZona(Boolean isPermisoPaginacionAltoZona) {
		this.isPermisoPaginacionAltoZona = isPermisoPaginacionAltoZona;
	}
	
	public Boolean getIsPermisoCopiarZona() {
		return isPermisoCopiarZona;
	}

	public void setIsPermisoCopiarZona(Boolean isPermisoCopiarZona) {
		this.isPermisoCopiarZona = isPermisoCopiarZona;
	}
	
	public Boolean getIsPermisoVerFormZona() {
		return isPermisoVerFormZona;
	}

	public void setIsPermisoVerFormZona(Boolean isPermisoVerFormZona) {
		this.isPermisoVerFormZona = isPermisoVerFormZona;
	}
	
	public Boolean getIsPermisoDuplicarZona() {
		return isPermisoDuplicarZona;
	}

	public void setIsPermisoDuplicarZona(Boolean isPermisoDuplicarZona) {
		this.isPermisoDuplicarZona = isPermisoDuplicarZona;
	}
	
	public Boolean getIsPermisoOrdenZona() {
		return isPermisoOrdenZona;
	}

	public void setIsPermisoOrdenZona(Boolean isPermisoOrdenZona) {
		this.isPermisoOrdenZona = isPermisoOrdenZona;
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
	
	public Boolean getIsVisibilidadCeldaNuevoZona() {
		return isVisibilidadCeldaNuevoZona;
	}

	public void setIsVisibilidadCeldaNuevoZona(Boolean isVisibilidadCeldaNuevoZona) {
		this.isVisibilidadCeldaNuevoZona = isVisibilidadCeldaNuevoZona;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarZona() {
		return isVisibilidadCeldaDuplicarZona;
	}

	public void setIsVisibilidadCeldaDuplicarZona(Boolean isVisibilidadCeldaDuplicarZona) {
		this.isVisibilidadCeldaDuplicarZona = isVisibilidadCeldaDuplicarZona;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarZona() {
		return isVisibilidadCeldaCopiarZona;
	}

	public void setIsVisibilidadCeldaCopiarZona(Boolean isVisibilidadCeldaCopiarZona) {
		this.isVisibilidadCeldaCopiarZona = isVisibilidadCeldaCopiarZona;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormZona() {
		return isVisibilidadCeldaVerFormZona;
	}

	public void setIsVisibilidadCeldaVerFormZona(Boolean isVisibilidadCeldaVerFormZona) {
		this.isVisibilidadCeldaVerFormZona = isVisibilidadCeldaVerFormZona;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenZona() {
		return isVisibilidadCeldaOrdenZona;
	}

	public void setIsVisibilidadCeldaOrdenZona(Boolean isVisibilidadCeldaOrdenZona) {
		this.isVisibilidadCeldaOrdenZona = isVisibilidadCeldaOrdenZona;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesZona() {
		return isVisibilidadCeldaNuevoRelacionesZona;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesZona(Boolean isVisibilidadCeldaNuevoRelacionesZona) {
		this.isVisibilidadCeldaNuevoRelacionesZona = isVisibilidadCeldaNuevoRelacionesZona;
	}
	
	public Boolean getIsVisibilidadCeldaModificarZona() {
		return isVisibilidadCeldaModificarZona;
	}

	public void setIsVisibilidadCeldaModificarZona(Boolean isVisibilidadCeldaModificarZona) {
		this.isVisibilidadCeldaModificarZona = isVisibilidadCeldaModificarZona;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarZona() {
		return isVisibilidadCeldaActualizarZona;
	}

	public void setIsVisibilidadCeldaActualizarZona(Boolean isVisibilidadCeldaActualizarZona) {
		this.isVisibilidadCeldaActualizarZona = isVisibilidadCeldaActualizarZona;
	}

	public Boolean getIsVisibilidadCeldaEliminarZona() {
		return isVisibilidadCeldaEliminarZona;
	}

	public void setIsVisibilidadCeldaEliminarZona(Boolean isVisibilidadCeldaEliminarZona) {
		this.isVisibilidadCeldaEliminarZona = isVisibilidadCeldaEliminarZona;
	}

	public Boolean getIsVisibilidadCeldaCancelarZona() {
		return isVisibilidadCeldaCancelarZona;
	}

	public void setIsVisibilidadCeldaCancelarZona(Boolean isVisibilidadCeldaCancelarZona) {
		this.isVisibilidadCeldaCancelarZona = isVisibilidadCeldaCancelarZona;
	}

	public Boolean getIsVisibilidadCeldaGuardarZona() {
		return isVisibilidadCeldaGuardarZona;
	}

	public void setIsVisibilidadCeldaGuardarZona(Boolean isVisibilidadCeldaGuardarZona) {
		this.isVisibilidadCeldaGuardarZona = isVisibilidadCeldaGuardarZona;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosZona() {
		return isVisibilidadCeldaGuardarCambiosZona;
	}

	public void setIsVisibilidadCeldaGuardarCambiosZona(Boolean isVisibilidadCeldaGuardarCambiosZona) {
		this.isVisibilidadCeldaGuardarCambiosZona = isVisibilidadCeldaGuardarCambiosZona;
	}
		
	public ZonaSessionBean getzonaSessionBean() {
		return this.zonaSessionBean;
	}
	
	public void setzonaSessionBean(ZonaSessionBean zonaSessionBean) {
		this.zonaSessionBean=zonaSessionBean;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysZona(Zona zona)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(zona,null);
				this.setActualParaGuardarSucursalForeignKey(zona,null);
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
	
	public void bugActualizarReferenciaActual(Zona zona,Zona zonaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalZona(zona);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		zonaAux.setId(zona.getId());
		zonaAux.setVersionRow(zona.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessZona();
		
			int intSelectedRow = this.jTableDatosZona.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualZona(this.zona,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = zonaValidator.getInvalidValues(this.zona);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			zonaLogic.setDatosCliente(datosCliente);
			zonaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				zonaAux=new  Zona();
				
				zonaAux.setIsNew(true);
				zonaAux.setIsChanged(true);
				
				zonaAux.setZonaOriginal(this.zona);
				
				zonaAux.setId(this.zona.getId());	
				zonaAux.setVersionRow(this.zona.getVersionRow());	
				zonaAux.setid_empresa(this.zona.getid_empresa());	
				zonaAux.setid_sucursal(this.zona.getid_sucursal());	
				zonaAux.setnombre(this.zona.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.zonaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.zonaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(zonaAux,zonaLogic.getZonas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(zonaAux,zonas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.zonaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.zonaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						zonaLogic.saveZonas();//WithConnection
						//zonaLogic.getSetVersionRowZonas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.zona,zonaAux);
					
					this.refrescarForeignKeysDescripcionesZona();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.zonaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors().addAll(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorsEliminados);
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas().addAll(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonasEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass().addAll(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventassEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass().addAll(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedors.addAll(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorsEliminados);
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonas.addAll(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonasEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventass.addAll(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventassEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass.addAll(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								zonaLogic.saveZonaRelaciones(zonaAux,this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass(),this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors(),this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass(),this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas());//WithConnection
								//zonaLogic.getSetVersionRowZonas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.zona,zonaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.setVendedors(new ArrayList<Vendedor>());
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.setVendedorZonas(new ArrayList<VendedorZona>());
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(new ArrayList<PresupuestoVentasLineas>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedors= new ArrayList<Vendedor>();
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonas= new ArrayList<VendedorZona>();
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventass= new ArrayList<PresupuestoVentas>();
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass= new ArrayList<PresupuestoVentasLineas>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setPresupuestoVentasLineass(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());

							if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setVendedors(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors());

							if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setClientes(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setSubClientes(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setPresupuestoVentass(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass());

							if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setVendedorZonas(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.zonaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.zonaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(zonaAux,zonaLogic.getZonas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(zonaAux,zonas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.zona,zonaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				zonaAux=new  Zona();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.zonaSessionBean.getEsGuardarRelacionado() 
					|| (this.zonaSessionBean.getEsGuardarRelacionado() && this.zona.getId()>=0)) {
						
					zonaAux.setIsNew(false);
				}
				
				zonaAux.setIsDeleted(false);
			
				zonaAux.setId(this.zona.getId());	
				zonaAux.setVersionRow(this.zona.getVersionRow());	
				zonaAux.setid_empresa(this.zona.getid_empresa());	
				zonaAux.setid_sucursal(this.zona.getid_sucursal());	
				zonaAux.setnombre(this.zona.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(zonaAux,zonaLogic.getZonas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(zonaAux,zonas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.zonaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.zonaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						zonaLogic.saveZonas();//WithConnection
						//zonaLogic.getSetVersionRowZonas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.zona,zonaAux);
					
					this.refrescarForeignKeysDescripcionesZona();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.zonaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors().addAll(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorsEliminados);
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas().addAll(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonasEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass().addAll(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventassEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass().addAll(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedors.addAll(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorsEliminados);
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonas.addAll(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonasEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventass.addAll(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventassEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass.addAll(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
						}
						//ARCHITECTURE
						
						if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								zonaLogic.saveZonaRelaciones(zonaAux,this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass(),this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors(),this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass(),this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas());//WithConnection
								//zonaLogic.getSetVersionRowZonas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.zona,zonaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.setVendedors(new ArrayList<Vendedor>());
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.setVendedorZonas(new ArrayList<VendedorZona>());
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(new ArrayList<PresupuestoVentasLineas>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedors= new ArrayList<Vendedor>();
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonas= new ArrayList<VendedorZona>();
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventass= new ArrayList<PresupuestoVentas>();
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass= new ArrayList<PresupuestoVentasLineas>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setPresupuestoVentasLineass(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());

							if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setVendedors(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors());

							if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setClientes(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setSubClientes(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setPresupuestoVentass(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass());

							if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setVendedorZonas(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.zonaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.zonaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(zonaAux,zonaLogic.getZonas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(zonaAux,zonas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.zona,zonaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				zonaAux=new  Zona();
				
				zonaAux.setIsNew(false);
				zonaAux.setIsChanged(false);
				
				zonaAux.setIsDeleted(true);
				
				zonaAux.setId(this.zona.getId());	
				zonaAux.setVersionRow(this.zona.getVersionRow());	
				zonaAux.setid_empresa(this.zona.getid_empresa());	
				zonaAux.setid_sucursal(this.zona.getid_sucursal());	
				zonaAux.setnombre(this.zona.getnombre());	
				
				if(this.zonaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.zonaAux.getId()>=0) {	
						this.zonasEliminados.add(zonaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(zonaAux,zonaLogic.getZonas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(zonaAux,zonas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.zonaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.zonaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						zonaLogic.saveZonas();//WithConnection
						//zonaLogic.getSetVersionRowZonas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.zonaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors().addAll(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorsEliminados);
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas().addAll(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonasEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass().addAll(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventassEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass().addAll(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedors.addAll(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorsEliminados);
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonas.addAll(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonasEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventass.addAll(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventassEliminados);
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass.addAll(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								zonaLogic.saveZonaRelaciones(zonaAux,this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass(),this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors(),this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass(),this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas());//WithConnection
								//zonaLogic.getSetVersionRowZonas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.setVendedors(new ArrayList<Vendedor>());
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.setVendedorZonas(new ArrayList<VendedorZona>());
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(new ArrayList<PresupuestoVentasLineas>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedors= new ArrayList<Vendedor>();
							this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonas= new ArrayList<VendedorZona>();
							this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventass= new ArrayList<PresupuestoVentas>();
							this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass= new ArrayList<PresupuestoVentasLineas>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setPresupuestoVentasLineass(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());

							if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setVendedors(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors());

							if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setClientes(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setSubClientes(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setPresupuestoVentass(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass());

							if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.quitarFilaTotales();}
							zonaAux.setVendedorZonas(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.zonaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.zonaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(zonaAux,zonaLogic.getZonas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(zonaAux,zonas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getZonas().addAll(this.zonasEliminados);
					
					zonaLogic.saveZonas();//WithConnection
					//zonaLogic.getSetVersionRowZonas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesZona();
				
				this.zonasEliminados= new ArrayList<Zona>();		
			}
			
			if(this.zonaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.zonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Zona GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.zona=zonaAux;
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
      		//this.finishProcessZona();
      	}
		
	}	
	
	public void actualizarRelaciones(Zona zonaLocal) throws Exception {
		
		if(this.zonaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				zonaLocal.setPresupuestoVentasLineass(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());
				zonaLocal.setVendedors(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors());
				zonaLocal.setClientes(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				zonaLocal.setSubClientes(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
				zonaLocal.setPresupuestoVentass(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass());
				zonaLocal.setVendedorZonas(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas());
			
			} else {
			
				zonaLocal.setPresupuestoVentasLineass(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass);
				zonaLocal.setVendedors(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedors);
				zonaLocal.setClientes(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clientes);
				zonaLocal.setSubClientes(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclientes);
				zonaLocal.setPresupuestoVentass(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventass);
				zonaLocal.setVendedorZonas(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Zona zonaLocal) throws Exception {	
		if(this.zonaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				zonaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				zonaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarZonaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosZona.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = zonaValidator.getInvalidValues(this.zona);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Zona zona,List<Zona> zonas) throws Exception {
		try	{		
			ZonaConstantesFunciones.actualizarLista(zona,zonas,this.zonaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Zona zona,List<Zona> zonas) throws Exception {
		try	{			
			ZonaConstantesFunciones.actualizarSelectedLista(zona,zonas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Zona> zonasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				zonasLocal=this.zonaLogic.getZonas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				zonasLocal=this.zonas;
			}
			//ARCHITECTURE
		
			for(Zona zonaLocal:zonasLocal) {
				if(this.permiteMantenimiento(zonaLocal) && zonaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ZonaConstantesFunciones.getZonaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ZonaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormZona.jLabelid_empresaZona,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ZonaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormZona.jLabelid_sucursalZona,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ZonaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormZona.jLabelnombreZona,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormZona!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormZona.jLabelid_empresaZona,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormZona.jLabelid_sucursalZona,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormZona.jLabelnombreZona,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PresupuestoVentasLineas")) {
			if(this.zona==null) {
				this.zona= new Zona();
			}

			if(this.zonaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoZona
				this.setVariablesFormularioToObjetoActualZona(this.zona,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);

				this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.getpresupuestoventaslineas().setZona(this.zona);
			}

			return;
		}
		 else  if(sTipo.equals("Vendedor")) {
			if(this.zona==null) {
				this.zona= new Zona();
			}

			if(this.zonaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoZona
				this.setVariablesFormularioToObjetoActualZona(this.zona,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);

				this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.getvendedor().setZona(this.zona);
			}

			return;
		}
		 else  if(sTipo.equals("Cliente")) {
			if(this.zona==null) {
				this.zona= new Zona();
			}

			if(this.zonaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoZona
				this.setVariablesFormularioToObjetoActualZona(this.zona,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);

				this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.getcliente().setZona(this.zona);
			}

			return;
		}
		 else  if(sTipo.equals("SubCliente")) {
			if(this.zona==null) {
				this.zona= new Zona();
			}

			if(this.zonaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoZona
				this.setVariablesFormularioToObjetoActualZona(this.zona,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);

				this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.getsubcliente().setZona(this.zona);
			}

			return;
		}
		 else  if(sTipo.equals("PresupuestoVentas")) {
			if(this.zona==null) {
				this.zona= new Zona();
			}

			if(this.zonaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoZona
				this.setVariablesFormularioToObjetoActualZona(this.zona,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);

				this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.getpresupuestoventas().setZona(this.zona);
			}

			return;
		}
		 else  if(sTipo.equals("VendedorZona")) {
			if(this.zona==null) {
				this.zona= new Zona();
			}

			if(this.zonaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoZona
				this.setVariablesFormularioToObjetoActualZona(this.zona,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);

				this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.getvendedorzona().setZona(this.zona);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoZona--;	
		
		
		this.zonaAux=new Zona();
		
		this.zonaAux.setId(this.iIdNuevoZona);
		this.zonaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.zonaLogic.getZonas().add(this.zonaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.zonas.add(this.zonaAux);
		}
		//ARCHITECTURE
		
		this.zona=this.zonaAux;
		
		if(ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioZona(this.zona);
			this.setVariablesObjetoActualToFormularioForeignKeyZona(this.zona);
		}
				
		//this.setDefaultControlesZona();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyZona();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyZona();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyZona();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualZona(this.zonaBean,this.zona,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ZonaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.zonaSessionBean.getConGuardarRelaciones()) {
			classes=ZonaConstantesFunciones.getClassesRelationshipsOfZona(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.zonaReturnGeneral=zonaLogic.procesarEventosZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.zonaLogic.getZonas(),this.zona,this.zonaParameterGeneral,this.isEsNuevoZona,classes);//this.zonaLogic.getZona()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanZona(this.zonaReturnGeneral,this.zonaBean,false);
		
		if(this.zonaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyZona(this.zonaReturnGeneral.getZona());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioZona(this.zonaReturnGeneral.getZona());
		}
		
		if(this.zonaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioZona(this.zonaReturnGeneral.getZona(),classes);//this.zonaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualZona(this.zona,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyZona();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyZona();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ZonaBeanSwingJInternalFrameAdditional.RecargarFormZona(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingZona(false);
						
			if(zonaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorSessionBean.getEsGuardarRelacionado() && VendedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVendedorActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.getEsGuardarRelacionado() && VendedorZonaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVendedorZonaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.getEsGuardarRelacionado() && PresupuestoVentasJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresupuestoVentasActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() && PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresupuestoVentasLineasActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ZonaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualZona();
			}
			
			this.actualizarVisualTableDatosZona();
			
			this.jTableDatosZona.setRowSelectionInterval(this.getIndiceNuevoZona(), this.getIndiceNuevoZona());
			
			this.seleccionarFilaTablaZonaActual();
						
			this.actualizarEstadoCeldasBotonesZona("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesZona(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormZona.jTextFieldnombreZona.setEnabled(isHabilitar && this.zonaConstantesFunciones.activarnombreZona);	
		//
		this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.setEnabled(isHabilitar && this.zonaConstantesFunciones.activarid_empresaZona);//
		this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.setEnabled(isHabilitar && this.zonaConstantesFunciones.activarid_sucursalZona);
	};
	
	public void setDefaultControlesZona() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoZona(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.zonaSessionBean.setConGuardarRelaciones(true);			
			this.zonaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.zonaSessionBean.setConGuardarRelaciones(false);			
			this.zonaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoZona() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Zona zonaAux:this.zonaLogic.getZonas()) {
				if(zonaAux.getId().equals(this.iIdNuevoZona)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Zona zonaAux:this.zonas) {
				if(zonaAux.getId().equals(this.iIdNuevoZona)) {
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
	
	public int getIndiceActualZona(Zona zona,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Zona zonaAux:this.zonaLogic.getZonas()) {
				if(zonaAux.getId().equals(zona.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Zona zonaAux:this.zonas) {
				if(zonaAux.getId().equals(zona.getId())) {
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
	
	public void setCamposBaseDesdeOriginalZona(Zona zonaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Zona zonaAux:this.zonaLogic.getZonas()) {
				if(zonaAux.getZonaOriginal().getId().equals(zonaOriginal.getId())) {
					existe=true;
					zonaOriginal.setId(zonaAux.getId());
					zonaOriginal.setVersionRow(zonaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Zona zonaAux:this.zonas) {
				if(zonaAux.getZonaOriginal().getId().equals(zonaOriginal.getId())) {
					existe=true;
					zonaOriginal.setId(zonaAux.getId());
					zonaOriginal.setVersionRow(zonaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosZona(Boolean esParaCancelar) throws Exception {
		zonasAux=new ArrayList<Zona>();
		zonaAux=new Zona();
		
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Zona zonaAux:this.zonaLogic.getZonas()) {
					if(zonaAux.getId()<0) {
						zonasAux.add(zonaAux);
					}		
				}
				this.iIdNuevoZona=0L;
				this.zonaLogic.getZonas().removeAll(zonasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Zona zonaAux:this.zonas) {
					if(zonaAux.getId()<0) {
						zonasAux.add(zonaAux);
					}		
				}
				this.iIdNuevoZona=0L;
				this.zonas.removeAll(zonasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoZona 
					&& this.zonaLogic.getZonas().size()>0
					) {
					zonaAux=this.zonaLogic.getZonas().get(this.zonaLogic.getZonas().size() - 1);
				
					if(zonaAux.getId()<0) {
						this.zonaLogic.getZonas().remove(zonaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoZona && this.zonas.size()>0) {
					zonaAux=this.zonas.get(this.zonas.size() - 1);
				
					if(zonaAux.getId()<0) {
						this.zonas.remove(zonaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoZona(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(zona.getId()<0) {
				this.zonaLogic.getZonas().remove(this.zona);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(zona.getId()<0) {
				this.zonas.remove(this.zona);
			}
		}			
	}
	
	public void setEstadosInicialesZona(List<Zona> zonasAux) throws Exception {
		ZonaConstantesFunciones.setEstadosInicialesZona(zonasAux);
	}
	
	public void setEstadosInicialesZona(Zona zonaAux) throws Exception {
		ZonaConstantesFunciones.setEstadosInicialesZona(zonaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarZonaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarZonaActual()) {
				if(!this.isEsNuevoZona) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoZona=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarZonaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Zona ?", "MANTENIMIENTO DE Zona", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Zona zona) throws Exception {
		ZonaConstantesFunciones.seleccionarAsignar(this.zona,zona);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarZona=this.isPermisoActualizarOriginalZona;
			
			
			this.seleccionarAsignar(zona);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ZonaConstantesFunciones.quitarEspaciosZona(this.zona,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesZona("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.zonaSessionBean.setsFuncionBusquedaRapida(this.zonaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoZona) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosZona(esParaCancelar);				
				this.cancelarNuevoZona(esParaCancelar);								
			}
			
			this.zona=new Zona();
			
			this.inicializarZona();
			
			this.actualizarEstadoCeldasBotonesZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarZona() throws Exception {
		try {
			ZonaConstantesFunciones.inicializarZona(this.zona);
			
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
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.zonaLogic.getZonas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteZonas(String sAccionBusqueda,List<Zona> zonasParaReportes) throws Exception {
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
					sPathReporteFinal="Zona"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ZonaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ZonaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Zona"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Zonas");		
		parameters.put("busquedapor", ZonaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(SubCliente.class));
			classes.add(new Classe(Vendedor.class));
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(VendedorZona.class));
			classes.add(new Classe(PresupuestoVentas.class));
			classes.add(new Classe(PresupuestoVentasLineas.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ZonaLogic zonaLogicAuxiliar=new ZonaLogic();
					zonaLogicAuxiliar.setDatosCliente(zonaLogic.getDatosCliente());				
					zonaLogicAuxiliar.setZonas(zonasParaReportes);
					
					zonaLogicAuxiliar.cargarRelacionesLoteForeignKeyZonaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					zonasParaReportes=zonaLogicAuxiliar.getZonas();
					
					//zonaLogic.getNewConnexionToDeep();
					
					//for (Zona zona:zonasParaReportes) {
					//	zonaLogic.deepLoad(zona, false, DeepLoadType.INCLUDE, classes);
					//}						
					//zonaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//zonaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileSubCliente = AuxiliarReportes.class.getResourceAsStream("SubClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_subcliente", reportFileSubCliente);

			InputStream reportFileVendedor = AuxiliarReportes.class.getResourceAsStream("VendedorDetalleRelacionesDesign.jasper");
			parameters.put("subreport_vendedor", reportFileVendedor);

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileVendedorZona = AuxiliarReportes.class.getResourceAsStream("VendedorZonaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_vendedorzona", reportFileVendedorZona);

			InputStream reportFilePresupuestoVentas = AuxiliarReportes.class.getResourceAsStream("PresupuestoVentasDetalleRelacionesDesign.jasper");
			parameters.put("subreport_presupuestoventas", reportFilePresupuestoVentas);

			InputStream reportFilePresupuestoVentasLineas = AuxiliarReportes.class.getResourceAsStream("PresupuestoVentasLineasDetalleRelacionesDesign.jasper");
			parameters.put("subreport_presupuestoventaslineas", reportFilePresupuestoVentasLineas);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceZona=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ZonaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ZonaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceZona=new JRBeanArrayDataSource(ZonaJInternalFrame.TraerZonaBeans(zonasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceZona);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ZonaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ZonaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ZonaBean.TraerZonaBeans(zonasParaReportes).toArray()));
							
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
				this.generarExcelReporteZonas(sAccionBusqueda,sTipoArchivoReporte,zonasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalZonas(sAccionBusqueda,sTipoArchivoReporte,zonasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoZonaActionPerformed(null);
					//this.generarExcelReporteZonas(sAccionBusqueda,sTipoArchivoReporte,zonasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalZonas(sAccionBusqueda,sTipoArchivoReporte,zonasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesZonas(sAccionBusqueda,sTipoArchivoReporte,zonasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesZonas(sAccionBusqueda,sTipoArchivoReporte,zonasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteZonas(String sAccionBusqueda,String sTipoArchivoReporte,List<Zona> zonasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"zona";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Zonas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderZona("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Zona zona : zonasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ZonaConstantesFunciones.generarExcelReporteDataZona("NORMAL",row,workbook,zona,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.zonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderZona(String sTipo,Row row,Workbook workbook) {
		
		ZonaConstantesFunciones.generarExcelReporteHeaderZona(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalZonas(String sAccionBusqueda,String sTipoArchivoReporte,List<Zona> zonasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"zona_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Zonas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Zona zona : zonasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ZonaConstantesFunciones.getZonaDescripcion(zona));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ZonaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ZonaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(zona.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ZonaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ZonaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(zona.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ZonaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ZonaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(zona.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.zonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesZonas(String sAccionBusqueda,String sTipoArchivoReporte,List<Zona> zonasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Zona> zonasRespaldo=null;
		
		classes=ZonaConstantesFunciones.getClassesRelationshipsOfZona(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.zonaLogic.setDatosCliente(this.datosCliente);
		this.zonaLogic.setDatosDeep(this.datosDeep);
		this.zonaLogic.setIsConDeep(true);
		
		zonasRespaldo=this.zonaLogic.getZonas();
		
		this.zonaLogic.setZonas(zonasParaReportes);	
		this.zonaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		zonasParaReportes=this.zonaLogic.getZonas();
		this.zonaLogic.setZonas(zonasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"zona_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Zonas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderZona("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Zona zona : zonasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderZona("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ZonaConstantesFunciones.generarExcelReporteDataZona("NORMAL",row,workbook,zona,cellStyleDataAux);
		
			
			


				//PresupuestoVentasLineas
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO))) {

				if(zona.getPresupuestoVentasLineass()!=null && zona.getPresupuestoVentasLineass().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PresupuestoVentasLineasConstantesFunciones.generarExcelReporteHeaderPresupuestoVentasLineas("RELACIONADO",row,workbook);
				}

				if(zona.getPresupuestoVentasLineass()!=null) {
					i2=0;
					for(PresupuestoVentasLineas presupuestoventaslineas : zona.getPresupuestoVentasLineass()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PresupuestoVentasLineasConstantesFunciones.generarExcelReporteDataPresupuestoVentasLineas("RELACIONADO",row,workbook,presupuestoventaslineas,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Vendedor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(VendedorConstantesFunciones.SCLASSWEBTITULO))) {

				if(zona.getVendedors()!=null && zona.getVendedors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(VendedorConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					VendedorConstantesFunciones.generarExcelReporteHeaderVendedor("RELACIONADO",row,workbook);
				}

				if(zona.getVendedors()!=null) {
					i2=0;
					for(Vendedor vendedor : zona.getVendedors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						VendedorConstantesFunciones.generarExcelReporteDataVendedor("RELACIONADO",row,workbook,vendedor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(zona.getClientes()!=null && zona.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(zona.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : zona.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SubCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SubClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(zona.getSubClientes()!=null && zona.getSubClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SubClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SubClienteConstantesFunciones.generarExcelReporteHeaderSubCliente("RELACIONADO",row,workbook);
				}

				if(zona.getSubClientes()!=null) {
					i2=0;
					for(SubCliente subcliente : zona.getSubClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SubClienteConstantesFunciones.generarExcelReporteDataSubCliente("RELACIONADO",row,workbook,subcliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PresupuestoVentas
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO))) {

				if(zona.getPresupuestoVentass()!=null && zona.getPresupuestoVentass().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PresupuestoVentasConstantesFunciones.generarExcelReporteHeaderPresupuestoVentas("RELACIONADO",row,workbook);
				}

				if(zona.getPresupuestoVentass()!=null) {
					i2=0;
					for(PresupuestoVentas presupuestoventas : zona.getPresupuestoVentass()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PresupuestoVentasConstantesFunciones.generarExcelReporteDataPresupuestoVentas("RELACIONADO",row,workbook,presupuestoventas,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//VendedorZona
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(VendedorZonaConstantesFunciones.SCLASSWEBTITULO))) {

				if(zona.getVendedorZonas()!=null && zona.getVendedorZonas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(VendedorZonaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					VendedorZonaConstantesFunciones.generarExcelReporteHeaderVendedorZona("RELACIONADO",row,workbook);
				}

				if(zona.getVendedorZonas()!=null) {
					i2=0;
					for(VendedorZona vendedorzona : zona.getVendedorZonas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						VendedorZonaConstantesFunciones.generarExcelReporteDataVendedorZona("RELACIONADO",row,workbook,vendedorzona,cellStyleDataAuxHijo);
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
		cell.setCellValue(ZonaConstantesFunciones.getZonaDescripcion(zona));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.zonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoZona.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoZona.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoZona.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoZona.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessZona() throws Exception {		
		this.startProcessZona(true);
	}
	
	public void startProcessZona(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasZona ,this.jPanelParametrosReportesZona, this.jScrollPanelDatosZona,this.jPanelPaginacionZona, this.jScrollPanelDatosEdicionZona, this.jPanelAccionesZona,this.jPanelAccionesFormularioZona,this.jmenuBarZona,this.jmenuBarDetalleZona,this.jTtoolBarZona,this.jTtoolBarDetalleZona);		
		
		final JTabbedPane jTabbedPaneBusquedasZona=this.jTabbedPaneBusquedasZona; 
		
		final JPanel jPanelParametrosReportesZona=this.jPanelParametrosReportesZona;
		//final JScrollPane jScrollPanelDatosZona=this.jScrollPanelDatosZona;
		final JTable jTableDatosZona=this.jTableDatosZona;		
		final JPanel jPanelPaginacionZona=this.jPanelPaginacionZona;
		//final JScrollPane jScrollPanelDatosEdicionZona=this.jScrollPanelDatosEdicionZona;
		final JPanel jPanelAccionesZona=this.jPanelAccionesZona;
		
		JPanel jPanelCamposAuxiliarZona=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarZona=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormZona!=null) {
			jPanelCamposAuxiliarZona=this.jInternalFrameDetalleFormZona.jPanelCamposZona;
			jPanelAccionesFormularioAuxiliarZona=this.jInternalFrameDetalleFormZona.jPanelAccionesFormularioZona;
		}
		
		final JPanel jPanelCamposZona=jPanelCamposAuxiliarZona;
		final JPanel jPanelAccionesFormularioZona=jPanelAccionesFormularioAuxiliarZona;
		
		
		final JMenuBar jmenuBarZona=this.jmenuBarZona;
		final JToolBar jTtoolBarZona=this.jTtoolBarZona;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarZona=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarZona=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormZona!=null) {
			jmenuBarDetalleAuxiliarZona=this.jInternalFrameDetalleFormZona.jmenuBarDetalleZona;
			jTtoolBarDetalleAuxiliarZona=this.jInternalFrameDetalleFormZona.jTtoolBarDetalleZona;
		}
		
		final JMenuBar jmenuBarDetalleZona=jmenuBarDetalleAuxiliarZona;
		final JToolBar jTtoolBarDetalleZona=jTtoolBarDetalleAuxiliarZona;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasZona;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesZona;
			processRunnable.jTableDatos=jTableDatosZona;
			processRunnable.jPanelCampos=jPanelCamposZona;
			processRunnable.jPanelPaginacion=jPanelPaginacionZona;
			processRunnable.jPanelAcciones=jPanelAccionesZona;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioZona;
			
			
			processRunnable.jmenuBar=jmenuBarZona;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleZona;
			processRunnable.jTtoolBar=jTtoolBarZona;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleZona;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasZona ,jPanelParametrosReportesZona,jTableDatosZona, /*jScrollPanelDatosZona,*/jPanelCamposZona,jPanelPaginacionZona, /*jScrollPanelDatosEdicionZona,*/ jPanelAccionesZona,jPanelAccionesFormularioZona,jmenuBarZona,jmenuBarDetalleZona,jTtoolBarZona,jTtoolBarDetalleZona);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasZona ,jPanelParametrosReportesZona, jScrollPanelDatosZona,jPanelPaginacionZona, jScrollPanelDatosEdicionZona, jPanelAccionesZona,jPanelAccionesFormularioZona,jmenuBarZona,jmenuBarDetalleZona,jTtoolBarZona,jTtoolBarDetalleZona);
						
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
	
	public void finishProcessZona() {// throws Exception 
		this.finishProcessZona(true);
	}
	
	public void finishProcessZona(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasZona ,this.jPanelParametrosReportesZona, this.jScrollPanelDatosZona,this.jPanelPaginacionZona, this.jScrollPanelDatosEdicionZona, this.jPanelAccionesZona,this.jPanelAccionesFormularioZona,this.jmenuBarZona,this.jmenuBarDetalleZona,this.jTtoolBarZona,this.jTtoolBarDetalleZona);		
		
		final JTabbedPane jTabbedPaneBusquedasZona=this.jTabbedPaneBusquedasZona; 
		
		final JPanel jPanelParametrosReportesZona=this.jPanelParametrosReportesZona;
		//final JScrollPane jScrollPanelDatosZona=this.jScrollPanelDatosZona;
		final JTable jTableDatosZona=this.jTableDatosZona;		
		final JPanel jPanelPaginacionZona=this.jPanelPaginacionZona;
		//final JScrollPane jScrollPanelDatosEdicionZona=this.jScrollPanelDatosEdicionZona;
		final JPanel jPanelAccionesZona=this.jPanelAccionesZona;
		
		JPanel jPanelCamposAuxiliarZona=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarZona=new JPanel();
		
		if(this.jInternalFrameDetalleFormZona!=null) {
			jPanelCamposAuxiliarZona=this.jInternalFrameDetalleFormZona.jPanelCamposZona;
			jPanelAccionesFormularioAuxiliarZona=this.jInternalFrameDetalleFormZona.jPanelAccionesFormularioZona;
		}
		
		final JPanel jPanelCamposZona=jPanelCamposAuxiliarZona;
		final JPanel jPanelAccionesFormularioZona=jPanelAccionesFormularioAuxiliarZona;
		
		
		final JMenuBar jmenuBarZona=this.jmenuBarZona;		
		final JToolBar jTtoolBarZona=this.jTtoolBarZona;
				
		JMenuBar jmenuBarDetalleAuxiliarZona=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarZona=new JToolBar();
		
		if(this.jInternalFrameDetalleFormZona!=null) {
			jmenuBarDetalleAuxiliarZona=this.jInternalFrameDetalleFormZona.jmenuBarDetalleZona;
			jTtoolBarDetalleAuxiliarZona=this.jInternalFrameDetalleFormZona.jTtoolBarDetalleZona;		
		}
		
		final JMenuBar jmenuBarDetalleZona=jmenuBarDetalleAuxiliarZona;
		final JToolBar jTtoolBarDetalleZona=jTtoolBarDetalleAuxiliarZona;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasZona;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesZona;
			processRunnable.jTableDatos=jTableDatosZona;
			processRunnable.jPanelCampos=jPanelCamposZona;
			processRunnable.jPanelPaginacion=jPanelPaginacionZona;
			processRunnable.jPanelAcciones=jPanelAccionesZona;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioZona;
			
			
			processRunnable.jmenuBar=jmenuBarZona;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleZona;
			processRunnable.jTtoolBar=jTtoolBarZona;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleZona;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasZona ,jPanelParametrosReportesZona, jTableDatosZona,/*jScrollPanelDatosZona,*/jPanelCamposZona,jPanelPaginacionZona, /*jScrollPanelDatosEdicionZona,*/ jPanelAccionesZona,jPanelAccionesFormularioZona,jmenuBarZona,jmenuBarDetalleZona,jTtoolBarZona,jTtoolBarDetalleZona));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesZona(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarZona(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuZona(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarZona(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarZona,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleZona,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuZona(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarZona,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleZona,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.zonaConstantesFunciones.getsFinalQueryZona();
		String  finalQueryPaginacionTodos=this.zonaConstantesFunciones.getsFinalQueryZona();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ZonaConstantesFunciones.getArrayColumnasGlobalesNoZona(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ZonaConstantesFunciones.getArrayColumnasGlobalesZona(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ZonaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.zonasEliminados= new ArrayList<Zona>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessZona();
		
				///*ZonaSessionBean*/this.zonaSessionBean=new ZonaSessionBean();
			
			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
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
					this.iNumeroPaginacion=ZonaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ZonaConstantesFunciones.getClassesForeignKeysOfZona(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/zona."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			zonasAux= new ArrayList<Zona>();
			
				
			zonaLogic.setDatosCliente(this.datosCliente);
			zonaLogic.setDatosDeep(this.datosDeep);
			zonaLogic.setIsConDeep(true);
			
			
			zonaLogic.getZonaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					zonaLogic.getTodosZonas(finalQueryGlobal,pagination);
					
					//zonaLogic.getTodosZonasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(zonaLogic.getZonas()==null|| zonaLogic.getZonas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							zonasAux= new ArrayList<Zona>();
							zonasAux.addAll(zonaLogic.getZonas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							zonasAux= new ArrayList<Zona>();
							zonasAux.addAll(zonas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							zonaLogic.getTodosZonas(finalQueryGlobal+"",this.pagination);												
							
							//zonaLogic.getTodosZonasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteZonas("Todos",zonaLogic.getZonas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							zonaLogic.setZonas(new ArrayList<Zona>());					
							zonaLogic.getZonas().addAll(zonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							zonas=new ArrayList<Zona>();
							zonas.addAll(zonasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idZona=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idZona=this.idActual;
				
				} else if(this.idZonaActual!=null && this.idZonaActual!=0L) {
					idZona=idZonaActual;
				}
				
					
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndicePorId(idZona);
				
				this.zonas=new ArrayList<Zona>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					zonaLogic.getEntity(idZona);
					
					//zonaLogic.getEntityWithConnection(idZona);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.setZonas(new ArrayList<Zona>());
					zonaLogic.getZonas().add(zonaLogic.getZona());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.zonas=new ArrayList<Zona>();
					this.zonas.add(zona);
				}
				
				if(zonaLogic.getZona()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					zonaLogic.getZonasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=zonaLogic.getZonas()==null||zonaLogic.getZonas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=zonas==null|| zonas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						zonasAux=new ArrayList<Zona>();
						zonasAux.addAll(zonaLogic.getZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							zonasAux=new ArrayList<Zona>();
							zonasAux.addAll(zonas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							zonaLogic.getZonasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteZonas("BusquedaPorNombre",zonaLogic.getZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteZonas("BusquedaPorNombre",zonas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						zonaLogic.setZonas(new ArrayList<Zona>());
						zonaLogic.getZonas().addAll(zonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							zonas=new ArrayList<Zona>();
							zonas.addAll(zonasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					zonaLogic.getZonasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=zonaLogic.getZonas()==null||zonaLogic.getZonas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=zonas==null|| zonas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						zonasAux=new ArrayList<Zona>();
						zonasAux.addAll(zonaLogic.getZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							zonasAux=new ArrayList<Zona>();
							zonasAux.addAll(zonas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							zonaLogic.getZonasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteZonas("FK_IdEmpresa",zonaLogic.getZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteZonas("FK_IdEmpresa",zonas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						zonaLogic.setZonas(new ArrayList<Zona>());
						zonaLogic.getZonas().addAll(zonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							zonas=new ArrayList<Zona>();
							zonas.addAll(zonasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					zonaLogic.getZonasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=zonaLogic.getZonas()==null||zonaLogic.getZonas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=zonas==null|| zonas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						zonasAux=new ArrayList<Zona>();
						zonasAux.addAll(zonaLogic.getZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							zonasAux=new ArrayList<Zona>();
							zonasAux.addAll(zonas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							zonaLogic.getZonasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteZonas("FK_IdSucursal",zonaLogic.getZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteZonas("FK_IdSucursal",zonas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						zonaLogic.setZonas(new ArrayList<Zona>());
						zonaLogic.getZonas().addAll(zonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							zonas=new ArrayList<Zona>();
							zonas.addAll(zonasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesZona();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessZona();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=zonaLogic.getZonas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=zonas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=zonaLogic.getZonas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=zonas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Zona zona) {
		Boolean permite=true;
		
		if(this.zona.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ZonaConstantesFunciones.getOrderByListaZona();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ZonaConstantesFunciones.getOrderByListaZona();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Zona zona:zonaLogic.getZonas()) {
				if(zona.getsType().equals(Constantes2.S_TOTALES)) {
					zonaTotales=zona;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Zona zona:this.zonas) {
				if(zona.getsType().equals(Constantes2.S_TOTALES)) {
					zonaTotales=zona;
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
			this.zonaAux=new Zona();
			this.zonaAux.setsType(Constantes2.S_TOTALES);
			this.zonaAux.setIsNew(false);
			this.zonaAux.setIsChanged(false);
			this.zonaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ZonaConstantesFunciones.TotalizarValoresFilaZona(this.zonaLogic.getZonas(),this.zonaAux);
				
				this.zonaLogic.getZonas().add(this.zonaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ZonaConstantesFunciones.TotalizarValoresFilaZona(this.zonas,this.zonaAux);
				
				this.zonas.add(this.zonaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		zonaTotales=new Zona();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.zonaLogic.getZonas().remove(zonaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.zonas.remove(zonaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		zonaTotales=new Zona();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Zona zona:zonaLogic.getZonas()) {
				if(zona.getsType().equals(Constantes2.S_TOTALES)) {
					zonaTotales=zona;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ZonaConstantesFunciones.TotalizarValoresFilaZona(this.zonaLogic.getZonas(),zonaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Zona zona:this.zonas) {
				if(zona.getsType().equals(Constantes2.S_TOTALES)) {
					zonaTotales=zona;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ZonaConstantesFunciones.TotalizarValoresFilaZona(this.zonas,zonaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getZonasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getZonasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getZonasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getZonaPorIdEmpresaPorIdSucursalPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdEmpresaPorIdSucursalPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getZonaPorIdPorIdEmpresaPorIdSucursal()throws Exception {
		try {
			sAccionBusqueda="PorIdPorIdEmpresaPorIdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getZonasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getZonasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getZonasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getZonasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getZonasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getZonasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getZonaPorIdEmpresaPorIdSucursalPorNombre(Long id_empresa,Long id_sucursal,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getZonaPorIdEmpresaPorIdSucursalPorNombre(id_empresa,id_sucursal,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getZonaPorIdPorIdEmpresaPorIdSucursal(Long id,Long id_empresa,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getZonaPorIdPorIdEmpresaPorIdSucursal(id,id_empresa,id_sucursal);
				
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
	
	public void inicializarPermisosZona() {
		this.isPermisoTodoZona=false;
		this.isPermisoNuevoZona=false;
		this.isPermisoActualizarZona=false;
		this.isPermisoActualizarOriginalZona=false;
		this.isPermisoEliminarZona=false;
		this.isPermisoGuardarCambiosZona=false;
		this.isPermisoConsultaZona=false;
		this.isPermisoBusquedaZona=false;
		this.isPermisoReporteZona=false;		
		this.isPermisoOrdenZona=false;		
		this.isPermisoPaginacionMedioZona=false;		
		this.isPermisoPaginacionAltoZona=false;
		this.isPermisoPaginacionTodoZona=false;
		this.isPermisoCopiarZona=false;		
		this.isPermisoVerFormZona=false;		
		this.isPermisoDuplicarZona=false;		
		this.isPermisoOrdenZona=false;		
	}
	
	public void setPermisosUsuarioZona(Boolean isPermiso) {
		this.isPermisoTodoZona=isPermiso;
		this.isPermisoNuevoZona=isPermiso;
		this.isPermisoActualizarZona=isPermiso;
		this.isPermisoActualizarOriginalZona=isPermiso;
		this.isPermisoEliminarZona=isPermiso;
		this.isPermisoGuardarCambiosZona=isPermiso;
		this.isPermisoConsultaZona=isPermiso;
		this.isPermisoBusquedaZona=isPermiso;
		this.isPermisoReporteZona=isPermiso;
		this.isPermisoOrdenZona=isPermiso;		
		this.isPermisoPaginacionMedioZona=isPermiso;		
		this.isPermisoPaginacionAltoZona=isPermiso;		
		this.isPermisoPaginacionTodoZona=isPermiso;		
		this.isPermisoCopiarZona=isPermiso;		
		this.isPermisoVerFormZona=isPermiso;		
		this.isPermisoDuplicarZona=isPermiso;
		this.isPermisoOrdenZona=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioZona(Boolean isPermiso) {
		//this.isPermisoTodoZona=isPermiso;
		this.isPermisoNuevoZona=isPermiso;
		this.isPermisoActualizarZona=isPermiso;
		this.isPermisoActualizarOriginalZona=isPermiso;
		this.isPermisoEliminarZona=isPermiso;
		this.isPermisoGuardarCambiosZona=isPermiso;
		//this.isPermisoConsultaZona=isPermiso;
		//this.isPermisoBusquedaZona=isPermiso;
		//this.isPermisoReporteZona=isPermiso;
		//this.isPermisoOrdenZona=isPermiso;		
		//this.isPermisoPaginacionMedioZona=isPermiso;		
		//this.isPermisoPaginacionAltoZona=isPermiso;		
		//this.isPermisoPaginacionTodoZona=isPermiso;		
		//this.isPermisoCopiarZona=isPermiso;		
		//this.isPermisoDuplicarZona=isPermiso;
		//this.isPermisoOrdenZona=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioZonaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(VendedorConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(VendedorZonaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PresupuestoVentasConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PresupuestoVentasLineasConstantesFunciones.SNOMBREOPCION);
		
		if(ZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosSubCliente=false;
		this.isTienePermisosSubCliente=this.verificarGetPermisosUsuarioOpcionZonaClaseRelacionada(this.opcionsRelacionadas,SubClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosVendedor=false;
		this.isTienePermisosVendedor=this.verificarGetPermisosUsuarioOpcionZonaClaseRelacionada(this.opcionsRelacionadas,VendedorConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionZonaClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosVendedorZona=false;
		this.isTienePermisosVendedorZona=this.verificarGetPermisosUsuarioOpcionZonaClaseRelacionada(this.opcionsRelacionadas,VendedorZonaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPresupuestoVentas=false;
		this.isTienePermisosPresupuestoVentas=this.verificarGetPermisosUsuarioOpcionZonaClaseRelacionada(this.opcionsRelacionadas,PresupuestoVentasConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPresupuestoVentasLineas=false;
		this.isTienePermisosPresupuestoVentasLineas=this.verificarGetPermisosUsuarioOpcionZonaClaseRelacionada(this.opcionsRelacionadas,PresupuestoVentasLineasConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebZona(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioZonaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosSubCliente=conPermiso;
		this.isTienePermisosVendedor=conPermiso;
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosVendedorZona=conPermiso;
		this.isTienePermisosPresupuestoVentas=conPermiso;
		this.isTienePermisosPresupuestoVentasLineas=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioZonaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionZonaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioZonaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosSubCliente && this.jInternalFrameDetalleFormZona!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.remove(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosVendedor && this.jInternalFrameDetalleFormZona!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.remove(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormZona!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.remove(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosVendedorZona && this.jInternalFrameDetalleFormZona!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.remove(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPresupuestoVentas && this.jInternalFrameDetalleFormZona!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.remove(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPresupuestoVentasLineas && this.jInternalFrameDetalleFormZona!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.remove(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioZona() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.zonaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ZonaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoZona=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarZona=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalZona=this.isPermisoActualizarZona;
			this.isPermisoEliminarZona=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosZona=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaZona=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaZona=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoZona=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteZona=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenZona=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioZona=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoZona=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoZona=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarZona=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormZona=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarZona=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenZona=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.zonaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosZona.setToolTipText(this.jTableDatosZona.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioZona(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioZona(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioZona() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPresupuestoVentasLineas && this.zonaConstantesFunciones.mostrarPresupuestoVentasLineasZona && !ZonaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Presupuesto Ventas_lineas");
			reporte.setsDescripcion("Presupuesto Ventas_lineas");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosVendedor && this.zonaConstantesFunciones.mostrarVendedorZona && !ZonaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Vendedor");
			reporte.setsDescripcion("Vendedor");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCliente && this.zonaConstantesFunciones.mostrarClienteZona && !ZonaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSubCliente && this.zonaConstantesFunciones.mostrarSubClienteZona && !ZonaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sub Cliente");
			reporte.setsDescripcion("Sub Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPresupuestoVentas && this.zonaConstantesFunciones.mostrarPresupuestoVentasZona && !ZonaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Presupuesto Ventas");
			reporte.setsDescripcion("Presupuesto Ventas");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosVendedorZona && this.zonaConstantesFunciones.mostrarVendedorZonaZona && !ZonaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Vendedor Zona");
			reporte.setsDescripcion("Vendedor Zona");
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
	public void inicializarCombosForeignKeyZonaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyZonaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ZonaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyZonaListas(false);
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
	
	public void cargarCombosLoteForeignKeyZonaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ZonaParameterReturnGeneral zonaReturnGeneral=new ZonaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.zonaConstantesFunciones.cargarid_empresaZona)
					 || (this.esRecargarFks && this.zonaConstantesFunciones.cargarid_empresaZona)) {

					if(!this.zonaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+zonaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.zonaConstantesFunciones.cargarid_sucursalZona)
					 || (this.esRecargarFks && this.zonaConstantesFunciones.cargarid_sucursalZona)) {

					if(!this.zonaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+zonaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				zonaReturnGeneral=zonaLogic.cargarCombosLoteForeignKeyZona(finalQueryGlobalEmpresa,finalQueryGlobalSucursal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=zonaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=zonaReturnGeneral.getsucursalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyZona()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
			}

			if(!this.zonaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.zonaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyZona()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyZona(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyZona()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyZona();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyZona(Zona zona)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyZona(Zona zona,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyZona()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyZona()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyZona()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyZona()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroZona()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyZona()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyZona(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyZona()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona!=null && this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.getItemCount()>0) {
				this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona!=null && this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.getItemCount()>0) {
				this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ZonaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ZonaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ZonaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.zonaSessionBean=new ZonaSessionBean(); 
		this.zonaConstantesFunciones=new ZonaConstantesFunciones(); 
		this.zonaBean=new Zona();//(this.zonaConstantesFunciones); 		
		this.zonaReturnGeneral=new ZonaParameterReturnGeneral(); 
		
		this.zonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.zonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ZonaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ZonaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ZonaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessZona(true);
			
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
			
			this.zonaConstantesFunciones=new ZonaConstantesFunciones(); 
			this.zonaBean=new Zona();//this.zonaConstantesFunciones); 			
			this.zonaReturnGeneral=new ZonaParameterReturnGeneral(); 
		
			ZonaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Zona Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.zona=new Zona();
			this.zonas = new ArrayList<Zona>();
			this.zonasAux = new ArrayList<Zona>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic=new ZonaLogic();
				this.zonaLogic.getNewConnexionToDeep("");
			}
			
			//this.zonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.zonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormZona);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoZona!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoZona);	
					}
					
					if(this.jInternalFrameImportacionZona!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionZona);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByZona!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByZona);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormZona!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormZona);
				this.jInternalFrameDetalleFormZona.setVisible(false);
				this.jInternalFrameDetalleFormZona.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoZona!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoZona);
					this.jInternalFrameReporteDinamicoZona.setVisible(false);
					this.jInternalFrameReporteDinamicoZona.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionZona!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionZona);
					this.jInternalFrameImportacionZona.setVisible(false);
					this.jInternalFrameImportacionZona.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByZona!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByZona);
					this.jInternalFrameOrderByZona.setVisible(false);
					this.jInternalFrameOrderByZona.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idZonaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ZonaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.zonaReturnGeneral=new ZonaParameterReturnGeneral();
			
			this.zonaParameterGeneral=new ZonaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.zonaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.zonaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(VendedorConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(VendedorZonaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PresupuestoVentasConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PresupuestoVentasLineasConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ZonaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.zonaSessionBean.getEsGuardarRelacionado(),this.zonaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ZonaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.zonaSessionBean.getEsGuardarRelacionado(),this.zonaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoZona=false;
			this.isVisibilidadCeldaDuplicarZona=true;
			this.isVisibilidadCeldaCopiarZona=true;
			this.isVisibilidadCeldaVerFormZona=true;
			this.isVisibilidadCeldaOrdenZona=true;
			this.isVisibilidadCeldaNuevoRelacionesZona=false;
			this.isVisibilidadCeldaModificarZona=false;
			this.isVisibilidadCeldaActualizarZona=false;
			this.isVisibilidadCeldaEliminarZona=false;
			this.isVisibilidadCeldaCancelarZona=false;
			this.isVisibilidadCeldaGuardarZona=false;
			this.isVisibilidadCeldaGuardarCambiosZona=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosZona();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioZona(false);
			
			this.setPermisosUsuarioZona();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.zonaSessionBean.getEsGuardarRelacionado() 
				|| (this.zonaSessionBean.getEsGuardarRelacionado() && this.zonaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioZonaClasesRelacionadas();
			}
			
			if(this.zonaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioZonaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ZonaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosZona();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualZona();
			}
			
			if(!this.isPermisoBusquedaZona) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasZona.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.zonaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioZona,this.isPermisoPaginacionMedioZona,this.isPermisoPaginacionTodoZona);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ZonaConstantesFunciones.getTiposSeleccionarZona());
				
				this.tiposColumnasSelect=ZonaConstantesFunciones.getTiposSeleccionarZona(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectZona();				
				//this.tiposRelacionesSelect=ZonaConstantesFunciones.getTiposRelacionesZona(true);
				
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
			//if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioZona();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioZona(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioZona(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesZona() ;
			
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
			
			
			this.presupuestoventaslineasLogic=new PresupuestoVentasLineasLogic();
			this.vendedorLogic=new VendedorLogic();
			this.clienteLogic=new ClienteLogic();
			this.subclienteLogic=new SubClienteLogic();
			this.presupuestoventasLogic=new PresupuestoVentasLogic();
			this.vendedorzonaLogic=new VendedorZonaLogic(); 
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
				zonaImplementable= (ZonaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ZonaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				zonaImplementableHome= (ZonaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ZonaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.zonas= new ArrayList<Zona>();
			this.zonasEliminados= new ArrayList<Zona>();
						
			this.isEsNuevoZona=false;
			this.esParaAccionDesdeFormularioZona=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyZona(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroZona();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ZonaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ZonaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingZona(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormZona!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioZona();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioZona();
			}
			
			ZonaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasZona.getTabCount(); i++) {
					this.jTabbedPaneBusquedasZona.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasZona.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessZona(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Zona: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectZona() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(VendedorConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(VendedorConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesZona")) {
				iIndex=this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosZona.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessZona();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Presupuesto Ventases")) {
					if(!PresupuestoVentasJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessZona();

						this.cargarParteTabPanelRelacionadaPresupuestoVentas(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Presupuesto Ventas_lineases")) {
					if(!PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessZona();

						this.cargarParteTabPanelRelacionadaPresupuestoVentasLineas(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sub Clientes")) {
					if(!SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessZona();

						this.cargarParteTabPanelRelacionadaSubCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Vendedores")) {
					if(!VendedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessZona();

						this.cargarParteTabPanelRelacionadaVendedor(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Vendedor Zonas")) {
					if(!VendedorZonaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessZona();

						this.cargarParteTabPanelRelacionadaVendedorZona(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessZona();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormZona.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesZona.updateUI();
		//this.jTabbedPaneRelacionesZona.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesZona.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPresupuestoVentas(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormZona.cargarSessionConBeanSwingJInternalFramePresupuestoVentas(false,true,iIndex);
		this.jButtonPresupuestoVentasActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPresupuestoVentas();

		//this.jTabbedPaneRelacionesZona.updateUI();
		//this.jTabbedPaneRelacionesZona.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesZona.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPresupuestoVentasLineas(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormZona.cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(false,true,iIndex);
		this.jButtonPresupuestoVentasLineasActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPresupuestoVentasLineas();

		//this.jTabbedPaneRelacionesZona.updateUI();
		//this.jTabbedPaneRelacionesZona.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesZona.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormZona.cargarSessionConBeanSwingJInternalFrameSubCliente(false,true,iIndex);
		this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubCliente();

		//this.jTabbedPaneRelacionesZona.updateUI();
		//this.jTabbedPaneRelacionesZona.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesZona.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaVendedor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormZona.cargarSessionConBeanSwingJInternalFrameVendedor(false,true,iIndex);
		this.jButtonVendedorActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaVendedor();

		//this.jTabbedPaneRelacionesZona.updateUI();
		//this.jTabbedPaneRelacionesZona.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesZona.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaVendedorZona(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormZona.cargarSessionConBeanSwingJInternalFrameVendedorZona(false,true,iIndex);
		this.jButtonVendedorZonaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaVendedorZona();

		//this.jTabbedPaneRelacionesZona.updateUI();
		//this.jTabbedPaneRelacionesZona.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesZona.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PresupuestoVentasLineas")) {
				int row=this.jTableDatosZona.getSelectedRow();
				jButtonPresupuestoVentasLineasActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Vendedor")) {
				int row=this.jTableDatosZona.getSelectedRow();
				jButtonVendedorActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosZona.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubCliente")) {
				int row=this.jTableDatosZona.getSelectedRow();
				jButtonSubClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PresupuestoVentas")) {
				int row=this.jTableDatosZona.getSelectedRow();
				jButtonPresupuestoVentasActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("VendedorZona")) {
				int row=this.jTableDatosZona.getSelectedRow();
				jButtonVendedorZonaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Presupuesto Ventas_lineas")) {

					if(this.isTienePermisosPresupuestoVentasLineas && this.zonaConstantesFunciones.mostrarPresupuestoVentasLineasZona && !ZonaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Presupuesto Ventas_lineases"+"("+PresupuestoVentasLineasConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Presupuesto Ventas_lineases");

						if(zonaConstantesFunciones.resaltarPresupuestoVentasLineasZona!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(zonaConstantesFunciones.resaltarPresupuestoVentasLineasZona);
						}

						jmenuItem.setEnabled(this.zonaConstantesFunciones.activarPresupuestoVentasLineasZona);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PresupuestoVentasLineas"));

						

						this.jInternalFrameDetalleFormZona.jmenuDetalleZona.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Vendedor")) {

					if(this.isTienePermisosVendedor && this.zonaConstantesFunciones.mostrarVendedorZona && !ZonaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Vendedores"+"("+VendedorConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Vendedores");

						if(zonaConstantesFunciones.resaltarVendedorZona!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(zonaConstantesFunciones.resaltarVendedorZona);
						}

						jmenuItem.setEnabled(this.zonaConstantesFunciones.activarVendedorZona);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Vendedor"));

						

						this.jInternalFrameDetalleFormZona.jmenuDetalleZona.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.zonaConstantesFunciones.mostrarClienteZona && !ZonaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(zonaConstantesFunciones.resaltarClienteZona!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(zonaConstantesFunciones.resaltarClienteZona);
						}

						jmenuItem.setEnabled(this.zonaConstantesFunciones.activarClienteZona);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormZona.jmenuDetalleZona.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Sub Cliente")) {

					if(this.isTienePermisosSubCliente && this.zonaConstantesFunciones.mostrarSubClienteZona && !ZonaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sub Clientes"+"("+SubClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sub Clientes");

						if(zonaConstantesFunciones.resaltarSubClienteZona!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(zonaConstantesFunciones.resaltarSubClienteZona);
						}

						jmenuItem.setEnabled(this.zonaConstantesFunciones.activarSubClienteZona);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SubCliente"));

						

						this.jInternalFrameDetalleFormZona.jmenuDetalleZona.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Presupuesto Ventas")) {

					if(this.isTienePermisosPresupuestoVentas && this.zonaConstantesFunciones.mostrarPresupuestoVentasZona && !ZonaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Presupuesto Ventases"+"("+PresupuestoVentasConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Presupuesto Ventases");

						if(zonaConstantesFunciones.resaltarPresupuestoVentasZona!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(zonaConstantesFunciones.resaltarPresupuestoVentasZona);
						}

						jmenuItem.setEnabled(this.zonaConstantesFunciones.activarPresupuestoVentasZona);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PresupuestoVentas"));

						

						this.jInternalFrameDetalleFormZona.jmenuDetalleZona.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Vendedor Zona")) {

					if(this.isTienePermisosVendedorZona && this.zonaConstantesFunciones.mostrarVendedorZonaZona && !ZonaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Vendedor Zonas"+"("+VendedorZonaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Vendedor Zonas");

						if(zonaConstantesFunciones.resaltarVendedorZonaZona!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(zonaConstantesFunciones.resaltarVendedorZonaZona);
						}

						jmenuItem.setEnabled(this.zonaConstantesFunciones.activarVendedorZonaZona);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"VendedorZona"));

						

						this.jInternalFrameDetalleFormZona.jmenuDetalleZona.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyZona(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyZona(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyZona(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyZonaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyZona();
		
		this.cargarCombosFrameForeignKeyZona();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyZona();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyZona();
		}
	}
	
	
	
	public void jButtonNuevoZonaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.zonaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
			
			if(jTableDatosZona.getRowCount()>=1) {
				jTableDatosZona.removeRowSelectionInterval(0, jTableDatosZona.getRowCount()-1);						
			}
			
			this.isEsNuevoZona=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoZona(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesZona(true);			
			//this.zona=new Zona();
			//this.zona.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesZona(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualZona() ;
			
			if(ZonaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleZona(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.zona);	
			this.actualizarInformacion("INFO_PADRE",false,this.zona);				
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
			if(this.zonaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Zona: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarZonaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosZona.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosZona.getSelectedRows().length;			
			}
			
			zonasSeleccionados=this.getZonasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoZona--;			
				//Zona zonaAux= new Zona();			
				//zonaAux.setId(this.iIdNuevoZona);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Zona zonaOrigen=new Zona();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Zona zonaOrigen : zonasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosZona.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							zonaOrigen =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							zonaOrigen =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaZona();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.zona.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosZona(zonaOrigen,this.zona,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.zonaLogic.getZonas().add(this.zonaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.zonas.add(this.zonaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaZona(false);
				
				this.jTableDatosZona.setRowSelectionInterval(this.getIndiceNuevoZona(), this.getIndiceNuevoZona());
				
				int iLastRow =  this.jTableDatosZona.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosZona.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosZona.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaZona(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();									
		
			Zona zonaOrigen=new Zona();
			Zona zonaDestino=new Zona();
				
			zonasSeleccionados=this.getZonasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosZona.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || zonasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosZona.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						zonaOrigen =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						zonaOrigen =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						zonaDestino =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						zonaDestino =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				zonaOrigen =zonasSeleccionados.get(0);
				zonaDestino =zonasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosZona(zonaOrigen,zonaDestino,true,false);
				
				zonaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(zonaDestino,zonaLogic.getZonas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(zonaDestino,zonas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaZona(false);
				
				//this.jTableDatosZona.setRowSelectionInterval(this.getIndiceNuevoZona(), this.getIndiceNuevoZona());
				
				int iLastRow =  this.jTableDatosZona.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosZona.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosZona.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaZona(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormZona.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesZona.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasZona.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesZona.setVisible(!isVisible);
			this.jPanelPaginacionZona.setVisible(!isVisible);
			this.jPanelAccionesZona.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameZona();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoZona();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionZona();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByZona();
			
			this.abrirFrameOrderByZona();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByZona();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleZona(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormZona);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormZona.isMaximum()) {
					this.jInternalFrameDetalleFormZona.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormZona.setSize(this.jInternalFrameDetalleFormZona.iWidthFormulario,this.jInternalFrameDetalleFormZona.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormZona.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormZona.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormZona.isMaximum()) {
						this.jInternalFrameDetalleFormZona.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth(),ZonaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth(),ZonaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth(),ZonaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(PresupuestoVentasJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPresupuestoVentas();
					}

					if(PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPresupuestoVentasLineas();
					}

					if(SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSubCliente();
					}

					if(VendedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVendedor();
					}

					if(VendedorZonaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVendedorZona();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormZona.setVisible(true);
	        this.jInternalFrameDetalleFormZona.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByZona() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByZona==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByZona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByZona,false,this);
				} else {
					this.jInternalFrameOrderByZona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByZona,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByZona);
				this.jInternalFrameOrderByZona.setVisible(false);
				this.jInternalFrameOrderByZona.setSelected(false);
				
				this.jInternalFrameOrderByZona.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByZona"));
				
				this.inicializarActualizarBindingTablaOrderByZona();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionZona() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionZona==null) {
				
				this.jInternalFrameImportacionZona=new ImportacionJInternalFrame(ZonaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionZona);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionZona);
				this.jInternalFrameImportacionZona.setVisible(false);
				this.jInternalFrameImportacionZona.setSelected(false);


				this.jInternalFrameImportacionZona.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionZona"));
				this.jInternalFrameImportacionZona.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionZona"));
				this.jInternalFrameImportacionZona.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionZona"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoZona() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoZona==null) {
				this.jInternalFrameReporteDinamicoZona=new ReporteDinamicoJInternalFrame(ZonaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoZona);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoZona);
				this.jInternalFrameReporteDinamicoZona.setVisible(false);
				this.jInternalFrameReporteDinamicoZona.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoZona.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoZona"));
				this.jInternalFrameReporteDinamicoZona.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoZona"));
				this.jInternalFrameReporteDinamicoZona.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoZona"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualZona();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPresupuestoVentas() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentas.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentas.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentas.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentas.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPresupuestoVentasLineas() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSubCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaVendedor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaVendedorZona() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.jScrollPanelDatosVendedorZona.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormZona.jContentPaneDetalleZona.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.jScrollPanelDatosVendedorZona.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.jScrollPanelDatosVendedorZona.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.jScrollPanelDatosVendedorZona.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleZona() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormZona);
			
	       	this.jInternalFrameDetalleFormZona.setVisible(false);
	        this.jInternalFrameDetalleFormZona.setSelected(false);
			
			//this.jInternalFrameDetalleFormZona.dispose();
			//this.jInternalFrameDetalleFormZona=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoZona() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoZona.setVisible(true);
	        this.jInternalFrameReporteDinamicoZona.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionZona() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionZona.setVisible(true);
	        this.jInternalFrameImportacionZona.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByZona() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByZona.setVisible(true);
	        this.jInternalFrameOrderByZona.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByZona() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByZona.setVisible(false);
	        this.jInternalFrameOrderByZona.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoZona() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoZona.setVisible(false);
	        this.jInternalFrameReporteDinamicoZona.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionZona() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionZona.setVisible(false);
	        this.jInternalFrameImportacionZona.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarZona(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarZona(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosZona.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesZona(true);
			//this.isEsNuevoZona=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesZona("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesZona(false) ;
			
			if(zonaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorSessionBean.getEsGuardarRelacionado() && VendedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVendedorActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.getEsGuardarRelacionado() && VendedorZonaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVendedorZonaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.getEsGuardarRelacionado() && PresupuestoVentasJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresupuestoVentasActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() && PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresupuestoVentasLineasActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ZonaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleZona(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualZona(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaZonaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarZona(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosZona.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesZona(true);
			//this.isEsNuevoZona=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.zona.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesZona("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesZona(false) ;
			
			if(ZonaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleZona(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualZona(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarZonaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesZona(false);
			
			//if(!this.isEsNuevoZona) {								
				int intSelectedRow = this.jTableDatosZona.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualZona(this.zona,true);
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
				
			}
			
			if(this.permiteMantenimiento(this.zona)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.zonaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoZona=true;
					this.inicializarActualizarBindingTablaZona(false);
					this.isEsNuevoZona=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoZona=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoZona=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesZona(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualZona(false);
				
				this.habilitarDeshabilitarControlesZona(false);
			
												
				
				if(ZonaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleZona();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoZonaActionPerformed(evt,zonaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualZona(this.zona,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosZona.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,zonaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.zona.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarZonaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosZona.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				this.zona.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				this.zona.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.zona)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.zonaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ZonaModel) this.jTableDatosZona.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoZona=true;
				this.inicializarActualizarBindingTablaZona(false);
				this.isEsNuevoZona=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesZona(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualZona(false);
				
				this.habilitarDeshabilitarControlesZona(false);
				
				
				
				if(ZonaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleZona();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarZonaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosZona.getRowCount()>=1) {
				jTableDatosZona.removeRowSelectionInterval(0, jTableDatosZona.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesZona(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaZona(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesZona(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualZona(false) ;
			
			this.isEsNuevoZona=false;
			
			if(ZonaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleZona();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingZona(false);
				
				//SI ES MANUAL
				if(ZonaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualZona();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoZona--;			
			//Zona zonaAux= new Zona();			
			//zonaAux.setId(this.iIdNuevoZona);
			
			if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaZona();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
			
			this.zona.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.zonaLogic.getZonas().add(this.zonaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.zonas.add(this.zonaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaZona(false);
			
			this.jTableDatosZona.setRowSelectionInterval(this.getIndiceNuevoZona(), this.getIndiceNuevoZona());
			
			int iLastRow =  this.jTableDatosZona.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosZona.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosZona.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaZona(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingZona(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingZona(false);
			
			//SI ES MANUAL
			if(ZonaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualZona();
			}
			
			//this.abrirFrameTreeZona();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionZonaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ZonaS ?", "MANTENIMIENTO DE Zona", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionZona.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralZona();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.zonaReturnGeneral=zonaLogic.procesarImportacionZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.zonaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarZonaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionZonaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionZona.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionZona.setFileImportacion(this.jInternalFrameImportacionZona.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionZona.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionZona.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionZona.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionZona.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoZonaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();		

		zonasSeleccionados=this.getZonasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoZona.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoZona.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ZonaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ZonaBaseDesign.jrxml";
			
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
			
			this.generarReporteZonas("Todos",zonasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.zonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoZona.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoZona.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ZonaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ZonaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ZonaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoZona.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoZona.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoZona.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ZonaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ZonaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ZonaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoZona.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ZonaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ZonaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ZonaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoZona.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoZona.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ZonaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ZonaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ZonaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoZonaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();		
		
		zonasSeleccionados=this.getZonasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"zona";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Zonas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoZona.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoZona.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ZonaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ZonaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Zona zona:zonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(zona.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ZonaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ZonaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Zona zona:zonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(zona.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ZonaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ZonaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Zona zona:zonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(zona.getnombre());
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
			//	this.getFilaCabeceraExportarExcelZona(row);				
			//	iRow++;
			//}				
			
			//for(Zona zonaAux:zonasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelZona(zonaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.zonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
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
				this.zonaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingZona(false);
			
			//SI ES MANUAL
			if(ZonaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualZona();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingZona(false);
			
			//SI ES MANUAL
			if(ZonaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualZona();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingZona(false);
			
			//SI ES MANUAL
			if(ZonaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualZona();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaZona() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosZona.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosZona.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosZona.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosZona.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosZona.setMinimumSize(dimensionMinimum);
		this.jTableDatosZona.setMaximumSize(dimensionMaximum);
		this.jTableDatosZona.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingZona(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingZona(esInicializar,true);
	}
	
	public void inicializarActualizarBindingZona(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaZona(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesZona(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasZona(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesZona(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesZona(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ZonaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ZonaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualZona() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaZona();
		
		this.inicializarActualizarBindingBotonesManualZona(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualZona();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesZona() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualZona(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualZona(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosZona.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosZona.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteZona.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormZona!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormZona.jCheckBoxPostAccionNuevoZona.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormZona.jCheckBoxPostAccionSinCerrarZona.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormZona.jCheckBoxPostAccionSinMensajeZona.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosZona.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosZona.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteZona.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormZona!=null) {
				this.jInternalFrameDetalleFormZona.jCheckBoxPostAccionNuevoZona.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormZona.jCheckBoxPostAccionSinCerrarZona.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormZona.jCheckBoxPostAccionSinMensajeZona.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionZona.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionZona.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormZona!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesZona.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoZona!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoZona.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesZona.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesZona.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarZona.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesZona.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoZona!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoZona.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesZona.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralZona.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesZona(Boolean esInicializar) throws Exception {
		try	{	
			if(ZonaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualZona(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesZona() throws Exception {
		try	{
			if(ZonaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualZona();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleZona() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualZona() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesZona.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesZona.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesZona.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesZona.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesZona.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesZona.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionZona.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionZona.addItem(reporte);
			}
			
			
			if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionZona.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionZona.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesZona.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesZona.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesZona.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesZona.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarZona.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarZona.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarZona.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualZona();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualZona() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoZona!=null) {
				this.jInternalFrameReporteDinamicoZona.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoZona.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoZona!=null) {
				this.jInternalFrameReporteDinamicoZona.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoZona.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoZona!=null) {
				
				if(this.jInternalFrameReporteDinamicoZona.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoZona.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoZona.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoZona.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoZona.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoZona.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualZona()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreZona.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasZona(Boolean esInicializar) throws Exception {				
		if(ZonaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualZona();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaZona() throws Exception {
		this.inicializarActualizarBindingTablaZona(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByZona() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByZona.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByZona.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByZona.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ZonaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByZona.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByZona.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ZonaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosZonaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosZonaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ZonaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByZona.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByZona.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ZonaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByZona.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaZona(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=zonaLogic.getZonas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=zonas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosZona.setModel(new ZonaModel(this.zonaLogic.getZonas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosZona.setModel(new ZonaModel(this.zonas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByZona!=null && this.jInternalFrameOrderByZona.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByZona();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosZona,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ZonaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ZonaConstantesFunciones.SCLASSWEBTITULO,zonaConstantesFunciones.resaltarSeleccionarZona,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ZonaConstantesFunciones.SCLASSWEBTITULO,zonaConstantesFunciones.resaltarSeleccionarZona,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosZona,ZonaConstantesFunciones.LABEL_ID));

		if(this.zonaConstantesFunciones.mostraridZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ZonaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.zonaConstantesFunciones.resaltaridZona,this.zonaConstantesFunciones.activaridZona,this,true,"idZona","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.zonaConstantesFunciones.resaltaridZona,this.zonaConstantesFunciones.activaridZona,this,true,"idZona","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosZona,ZonaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.zonaConstantesFunciones.mostrarid_empresaZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ZonaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.zonaConstantesFunciones.resaltarid_empresaZona,this,this.zonaConstantesFunciones.activarid_empresaZona));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.zonaConstantesFunciones.resaltarid_empresaZona,this,this.zonaConstantesFunciones.activarid_empresaZona,false,"id_empresaZona","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ZonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosZona,ZonaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.zonaConstantesFunciones.mostrarid_sucursalZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ZonaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.zonaConstantesFunciones.resaltarid_sucursalZona,this,this.zonaConstantesFunciones.activarid_sucursalZona));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.zonaConstantesFunciones.resaltarid_sucursalZona,this,this.zonaConstantesFunciones.activarid_sucursalZona,false,"id_sucursalZona","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ZonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosZona,ZonaConstantesFunciones.LABEL_NOMBRE));

		if(this.zonaConstantesFunciones.mostrarnombreZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ZonaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.zonaConstantesFunciones.resaltarnombreZona,this.zonaConstantesFunciones.activarnombreZona,this,true,"nombreZona","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.zonaConstantesFunciones.resaltarnombreZona,this.zonaConstantesFunciones.activarnombreZona,this,true,"nombreZona","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ZonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.zonaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPresupuestoVentasLineas && this.zonaConstantesFunciones.mostrarPresupuestoVentasLineasZona && !ZonaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Presupuesto Ventas_lineases");
				tableColumn.setHeaderValue("Presupuesto Ventas_lineases");
				tableColumn.setCellRenderer(new PresupuestoVentasLineasTableCell(zonaConstantesFunciones.resaltarPresupuestoVentasLineasZona,this,this.zonaConstantesFunciones.activarPresupuestoVentasLineasZona));
				tableColumn.setCellEditor(new PresupuestoVentasLineasTableCell(zonaConstantesFunciones.resaltarPresupuestoVentasLineasZona,this,this.zonaConstantesFunciones.activarPresupuestoVentasLineasZona));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosZona.addColumn(tableColumn);
			}

			if(this.isTienePermisosVendedor && this.zonaConstantesFunciones.mostrarVendedorZona && !ZonaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Vendedores");
				tableColumn.setHeaderValue("Vendedores");
				tableColumn.setCellRenderer(new VendedorTableCell(zonaConstantesFunciones.resaltarVendedorZona,this,this.zonaConstantesFunciones.activarVendedorZona));
				tableColumn.setCellEditor(new VendedorTableCell(zonaConstantesFunciones.resaltarVendedorZona,this,this.zonaConstantesFunciones.activarVendedorZona));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosZona.addColumn(tableColumn);
			}

			if(this.isTienePermisosCliente && this.zonaConstantesFunciones.mostrarClienteZona && !ZonaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(zonaConstantesFunciones.resaltarClienteZona,this,this.zonaConstantesFunciones.activarClienteZona));
				tableColumn.setCellEditor(new ClienteTableCell(zonaConstantesFunciones.resaltarClienteZona,this,this.zonaConstantesFunciones.activarClienteZona));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosZona.addColumn(tableColumn);
			}

			if(this.isTienePermisosSubCliente && this.zonaConstantesFunciones.mostrarSubClienteZona && !ZonaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sub Clientes");
				tableColumn.setHeaderValue("Sub Clientes");
				tableColumn.setCellRenderer(new SubClienteTableCell(zonaConstantesFunciones.resaltarSubClienteZona,this,this.zonaConstantesFunciones.activarSubClienteZona));
				tableColumn.setCellEditor(new SubClienteTableCell(zonaConstantesFunciones.resaltarSubClienteZona,this,this.zonaConstantesFunciones.activarSubClienteZona));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosZona.addColumn(tableColumn);
			}

			if(this.isTienePermisosPresupuestoVentas && this.zonaConstantesFunciones.mostrarPresupuestoVentasZona && !ZonaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Presupuesto Ventases");
				tableColumn.setHeaderValue("Presupuesto Ventases");
				tableColumn.setCellRenderer(new PresupuestoVentasTableCell(zonaConstantesFunciones.resaltarPresupuestoVentasZona,this,this.zonaConstantesFunciones.activarPresupuestoVentasZona));
				tableColumn.setCellEditor(new PresupuestoVentasTableCell(zonaConstantesFunciones.resaltarPresupuestoVentasZona,this,this.zonaConstantesFunciones.activarPresupuestoVentasZona));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosZona.addColumn(tableColumn);
			}

			if(this.isTienePermisosVendedorZona && this.zonaConstantesFunciones.mostrarVendedorZonaZona && !ZonaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Vendedor Zonas");
				tableColumn.setHeaderValue("Vendedor Zonas");
				tableColumn.setCellRenderer(new VendedorZonaTableCell(zonaConstantesFunciones.resaltarVendedorZonaZona,this,this.zonaConstantesFunciones.activarVendedorZonaZona));
				tableColumn.setCellEditor(new VendedorZonaTableCell(zonaConstantesFunciones.resaltarVendedorZonaZona,this,this.zonaConstantesFunciones.activarVendedorZonaZona));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosZona.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.zonaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.zonaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosZona.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.zonaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.zonaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosZona.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarZona && this.isPermisoGuardarCambiosZona) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.zonaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.zonaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosZona.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.zonaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosZona.addColumn(tableColumn);
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
			
			this.jTableDatosZona.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarZona && this.isPermisoGuardarCambiosZona) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.zonaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarZona && this.isPermisoGuardarCambiosZona) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosZona.moveColumn(this.jTableDatosZona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosZona.moveColumn(this.jTableDatosZona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.zonaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosZona.moveColumn(this.jTableDatosZona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosZona.moveColumn(this.jTableDatosZona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosZona.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosZona.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosZona,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosZona.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosZona.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosZona.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosZona.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosZona.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=zonaLogic.getZonas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=zonas.size()-1;
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
		//this.jTableDatosZona.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosZona();
			
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
				
				//this.isEsNuevoZona=false;
					
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
				if(this.zonaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormZona==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosZona.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosZona.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.zona.getsType().equals("DUPLICADO")
				   || this.zona.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoZona=true;
				
				} else {
					this.isEsNuevoZona=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
					if(this.zona.getId()>=0 && !this.zona.getIsNew()) {						
						this.isEsNuevoZona=false;
						
					} else {
						this.isEsNuevoZona=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoZona(esRelaciones);						
				
				this.seleccionarZona(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.zona.getId()<0) {
					this.isEsNuevoZona=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarZona(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarZona(evt,rowIndex);
				}	
				
				if(this.zonaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Zona: " + this.dDif); 
					}
				}								
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarZona(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.zona)) {
					if(this.zona.getId()>0) {
						this.zona.setIsDeleted(true);
						
						this.zonasEliminados.add(this.zona);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.zonaLogic.getZonas().remove(this.zona);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.zonas.remove(this.zona);				
					}
					
					
					((ZonaModel) this.jTableDatosZona.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaZona(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarZona(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoZona) {
			
			if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosZona.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosZona.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioZona(this.zona);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.zonaConstantesFunciones.cargarid_empresaZona || this.zonaConstantesFunciones.event_dependid_empresaZona) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.zona.getid_empresa());
									//this.inicializarActualizarBindingZona(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(zona.getEmpresa()!=null) {
							this.empresasForeignKey.add(zona.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.zona.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.zonaConstantesFunciones.cargarid_sucursalZona || this.zonaConstantesFunciones.event_dependid_sucursalZona) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.zona.getid_sucursal());
									//this.inicializarActualizarBindingZona(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(zona.getSucursal()!=null) {
							this.sucursalsForeignKey.add(zona.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.zona.getid_sucursal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesZona("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesZona(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualZona() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoZona(Zona zona) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoZona(zona,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoZona(Zona zona,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioZona(zona);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyZona(zona,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyZona(zona);
	}
	
	public void setVariablesObjetoActualToFormularioZona(Zona zona) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormZona.jLabelidZona.setText(zona.getId().toString());
			this.jInternalFrameDetalleFormZona.jTextFieldnombreZona.setText(zona.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Zona zonaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,zonaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Zona zonaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				zonaLocal=this.zona;
			} else {
				zonaLocal=this.zonaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(zonaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoZona(zonaLocal,true);
					
					if(zonaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(zonaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.zonaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(zonaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoZona(Zona zona,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualZona(zona,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysZona(zona);
	}
	
	public void setVariablesFormularioToObjetoActualZona(Zona zona,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualZona(zona,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualZona(Zona zona,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormZona.jLabelidZona.getText()==null || this.jInternalFrameDetalleFormZona.jLabelidZona.getText()=="" || this.jInternalFrameDetalleFormZona.jLabelidZona.getText()=="Id") {
				this.jInternalFrameDetalleFormZona.jLabelidZona.setText("0");
			}

			if(conColumnasBase) {zona.setId(Long.parseLong(this.jInternalFrameDetalleFormZona.jLabelidZona.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ZonaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormZona.jLabelIdZona,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			zona.setnombre(this.jInternalFrameDetalleFormZona.jTextFieldnombreZona.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ZonaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormZona.jLabelnombreZona,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualZona(Zona zonaBean,Zona zona,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosZona(Zona zonaOrigen,Zona zona,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && zonaOrigen.getId()!=null && !zonaOrigen.getId().equals(0L))) {zona.setId(zonaOrigen.getId());}}
			if(conDefault || (!conDefault && zonaOrigen.getnombre()!=null && !zonaOrigen.getnombre().equals(""))) {zona.setnombre(zonaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioZona(Zona zona) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormZona.jLabelidZona.setText(zona.getId().toString());
			this.jInternalFrameDetalleFormZona.jTextFieldnombreZona.setText(zona.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioZona(ZonaBean zonaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormZona.jLabelidZona.setText(zonaBean.getId().toString());
			this.jInternalFrameDetalleFormZona.jTextFieldnombreZona.setText(zonaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanZona(ZonaParameterReturnGeneral zonaReturnGeneral,ZonaBean zonaBean,Boolean conDefault) throws Exception { 
		try {
			Zona zonaLocal=new Zona();
			
			zonaLocal=zonaReturnGeneral.getZona();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && zonaLocal.getId()!=null && !zonaLocal.getId().equals(0L))) {zonaBean.setId(zonaLocal.getId());}}
			if(conDefault || (!conDefault && zonaLocal.getnombre()!=null && !zonaLocal.getnombre().equals(""))) {zonaBean.setnombre(zonaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxZonaGenerico(Long idZonaSeleccionado,JComboBox jComboBoxZona,List<Zona> zonasLocal)throws Exception {
		try {
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasLocal) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			jComboBoxZona.setSelectedItem(zonaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxZonaGenerico(JComboBox jComboBoxZona,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxZona.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxZona.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxZona.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxZona.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("SubCliente")) {
			jButtonSubClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Vendedor")) {
			jButtonVendedorActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("VendedorZona")) {
			jButtonVendedorZonaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PresupuestoVentas")) {
			jButtonPresupuestoVentasActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PresupuestoVentasLineas")) {
			jButtonPresupuestoVentasLineasActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			zona=(Zona) zonaLogic.getZonas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			zona =(Zona) zonas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!zona.getIsNew() && !zona.getIsChanged() && !zona.getIsDeleted()) {
				sDescripcion=zona.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=zona.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!zona.getIsNew() && !zona.getIsChanged() && !zona.getIsDeleted()) {
				sDescripcion=zona.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=zona.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Zona zonaRow=new Zona();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			zonaRow=(Zona) zonaLogic.getZonas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			zonaRow=(Zona) zonas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonSubClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Zona zona) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormZona==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona = (Zona)this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.zona = (Zona)this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(zona!=null) {
						this.zona = zona;
					} else {
						this.zona = new Zona();
					}
				}

				if(this.isTienePermisosSubCliente && this.permiteMantenimiento(this.zona)) {
					SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFramePopup;
					} else {
						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame;
					}

					List<Zona> zonas=new ArrayList<Zona>();
					zonas.add(this.zona);
					if(!esRelacionado) {
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setConGuardarRelaciones(false);
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormZona.cargarSubClienteBeanSwingJInternalFrame(zonas,this.zona,subclienteBeanSwingJInternalFrame,/*conInicializar,*/subclienteBeanSwingJInternalFrame.subclienteSessionBean.getConGuardarRelaciones(),subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado());
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");

						subclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SubClienteConstantesFunciones.ITAMANIOFILATABLA + (SubClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						subclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderZona=(TitledBorder)this.jScrollPanelDatosZona.getBorder();
						TitledBorder titledBorderSubCliente=(TitledBorder)subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getBorder();

						titledBorderSubCliente.setTitle(titledBorderZona.getTitle() + " -> Sub Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subclienteBeanSwingJInternalFrame);
						}

						subclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(subclienteBeanSwingJInternalFrame);

						subclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.zonaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sub Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonVendedorActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Zona zona) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormZona==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona = (Zona)this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.zona = (Zona)this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(zona!=null) {
						this.zona = zona;
					} else {
						this.zona = new Zona();
					}
				}

				if(this.isTienePermisosVendedor && this.permiteMantenimiento(this.zona)) {
					VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFramePopup=new VendedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						vendedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFramePopup;
					} else {
						vendedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame;
					}

					List<Zona> zonas=new ArrayList<Zona>();
					zonas.add(this.zona);
					if(!esRelacionado) {
						//vendedorBeanSwingJInternalFrame.vendedorSessionBean.setConGuardarRelaciones(false);
						//vendedorBeanSwingJInternalFrame.vendedorSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					vendedorBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormZona.cargarVendedorBeanSwingJInternalFrame(zonas,this.zona,vendedorBeanSwingJInternalFrame,/*conInicializar,*/vendedorBeanSwingJInternalFrame.vendedorSessionBean.getConGuardarRelaciones(),vendedorBeanSwingJInternalFrame.vendedorSessionBean.getEsGuardarRelacionado());
					vendedorBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						vendedorBeanSwingJInternalFrame.actualizarEstadoPanelsVendedor("no_relacionado");

						vendedorBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(VendedorConstantesFunciones.ITAMANIOFILATABLA + (VendedorConstantesFunciones.ITAMANIOFILATABLA/2));

						vendedorBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderZona=(TitledBorder)this.jScrollPanelDatosZona.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderZona.getTitle() + " -> Vendedor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vendedorBeanSwingJInternalFrame);
						}

						vendedorBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(vendedorBeanSwingJInternalFrame);

						vendedorBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.zonaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Vendedor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Zona zona) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormZona==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona = (Zona)this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.zona = (Zona)this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(zona!=null) {
						this.zona = zona;
					} else {
						this.zona = new Zona();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.zona)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame;
					}

					List<Zona> zonas=new ArrayList<Zona>();
					zonas.add(this.zona);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormZona.cargarClienteBeanSwingJInternalFrame(zonas,this.zona,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderZona=(TitledBorder)this.jScrollPanelDatosZona.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderZona.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.zonaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonVendedorZonaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Zona zona) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormZona==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona = (Zona)this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.zona = (Zona)this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(zona!=null) {
						this.zona = zona;
					} else {
						this.zona = new Zona();
					}
				}

				if(this.isTienePermisosVendedorZona && this.permiteMantenimiento(this.zona)) {
					VendedorZonaBeanSwingJInternalFrame vendedorzonaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFramePopup=new VendedorZonaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						vendedorzonaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFramePopup;
					} else {
						vendedorzonaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame;
					}

					List<Zona> zonas=new ArrayList<Zona>();
					zonas.add(this.zona);
					if(!esRelacionado) {
						//vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.setConGuardarRelaciones(false);
						//vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					vendedorzonaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormZona.cargarVendedorZonaBeanSwingJInternalFrame(zonas,this.zona,vendedorzonaBeanSwingJInternalFrame,/*conInicializar,*/vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.getConGuardarRelaciones(),vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.getEsGuardarRelacionado());
					vendedorzonaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						vendedorzonaBeanSwingJInternalFrame.actualizarEstadoPanelsVendedorZona("no_relacionado");

						vendedorzonaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(VendedorZonaConstantesFunciones.ITAMANIOFILATABLA + (VendedorZonaConstantesFunciones.ITAMANIOFILATABLA/2));

						vendedorzonaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderZona=(TitledBorder)this.jScrollPanelDatosZona.getBorder();
						TitledBorder titledBorderVendedorZona=(TitledBorder)vendedorzonaBeanSwingJInternalFrame.jScrollPanelDatosVendedorZona.getBorder();

						titledBorderVendedorZona.setTitle(titledBorderZona.getTitle() + " -> Vendedor Zona");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vendedorzonaBeanSwingJInternalFrame);
						}

						vendedorzonaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(vendedorzonaBeanSwingJInternalFrame);

						vendedorzonaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.zonaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Vendedor Zona",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPresupuestoVentasActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Zona zona) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormZona==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona = (Zona)this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.zona = (Zona)this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(zona!=null) {
						this.zona = zona;
					} else {
						this.zona = new Zona();
					}
				}

				if(this.isTienePermisosPresupuestoVentas && this.permiteMantenimiento(this.zona)) {
					PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFramePopup=new PresupuestoVentasBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						presupuestoventasBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFramePopup;
					} else {
						presupuestoventasBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame;
					}

					List<Zona> zonas=new ArrayList<Zona>();
					zonas.add(this.zona);
					if(!esRelacionado) {
						//presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setConGuardarRelaciones(false);
						//presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					presupuestoventasBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormZona.cargarPresupuestoVentasBeanSwingJInternalFrame(zonas,this.zona,presupuestoventasBeanSwingJInternalFrame,/*conInicializar,*/presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.getConGuardarRelaciones(),presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.getEsGuardarRelacionado());
					presupuestoventasBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						presupuestoventasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentas("no_relacionado");

						presupuestoventasBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PresupuestoVentasConstantesFunciones.ITAMANIOFILATABLA + (PresupuestoVentasConstantesFunciones.ITAMANIOFILATABLA/2));

						presupuestoventasBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderZona=(TitledBorder)this.jScrollPanelDatosZona.getBorder();
						TitledBorder titledBorderPresupuestoVentas=(TitledBorder)presupuestoventasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentas.getBorder();

						titledBorderPresupuestoVentas.setTitle(titledBorderZona.getTitle() + " -> Presupuesto Ventas");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,presupuestoventasBeanSwingJInternalFrame);
						}

						presupuestoventasBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(presupuestoventasBeanSwingJInternalFrame);

						presupuestoventasBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.zonaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Presupuesto Ventas",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPresupuestoVentasLineasActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Zona zona) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormZona==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona = (Zona)this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.zona = (Zona)this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(zona!=null) {
						this.zona = zona;
					} else {
						this.zona = new Zona();
					}
				}

				if(this.isTienePermisosPresupuestoVentasLineas && this.permiteMantenimiento(this.zona)) {
					PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFramePopup=new PresupuestoVentasLineasBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						presupuestoventaslineasBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFramePopup;
					} else {
						presupuestoventaslineasBeanSwingJInternalFrame=this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame;
					}

					List<Zona> zonas=new ArrayList<Zona>();
					zonas.add(this.zona);
					if(!esRelacionado) {
						//presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setConGuardarRelaciones(false);
						//presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					presupuestoventaslineasBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormZona.cargarPresupuestoVentasLineasBeanSwingJInternalFrame(zonas,this.zona,presupuestoventaslineasBeanSwingJInternalFrame,/*conInicializar,*/presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.getConGuardarRelaciones(),presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
					presupuestoventaslineasBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasLineas("no_relacionado");

						presupuestoventaslineasBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PresupuestoVentasLineasConstantesFunciones.ITAMANIOFILATABLA + (PresupuestoVentasLineasConstantesFunciones.ITAMANIOFILATABLA/2));

						presupuestoventaslineasBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderZona=(TitledBorder)this.jScrollPanelDatosZona.getBorder();
						TitledBorder titledBorderPresupuestoVentasLineas=(TitledBorder)presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.getBorder();

						titledBorderPresupuestoVentasLineas.setTitle(titledBorderZona.getTitle() + " -> Presupuesto Ventas_lineas");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,presupuestoventaslineasBeanSwingJInternalFrame);
						}

						presupuestoventaslineasBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(presupuestoventaslineasBeanSwingJInternalFrame);

						presupuestoventaslineasBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.zonaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Presupuesto Ventas_lineas",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualZona(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoZona.setVisible((this.isVisibilidadCeldaNuevoZona && this.isPermisoNuevoZona));			
			this.jButtonDuplicarZona.setVisible((this.isVisibilidadCeldaDuplicarZona && this.isPermisoDuplicarZona));			
			this.jButtonCopiarZona.setVisible((this.isVisibilidadCeldaCopiarZona && this.isPermisoCopiarZona));
			this.jButtonVerFormZona.setVisible((this.isVisibilidadCeldaVerFormZona && this.isPermisoVerFormZona));
			
			this.jButtonAbrirOrderByZona.setVisible((this.isVisibilidadCeldaOrdenZona && this.isPermisoOrdenZona));			
			
			this.jButtonNuevoRelacionesZona.setVisible((this.isVisibilidadCeldaNuevoRelacionesZona && this.isPermisoNuevoZona));			
			this.jButtonNuevoGuardarCambiosZona.setVisible((this.isVisibilidadCeldaNuevoZona && this.isPermisoNuevoZona && this.isPermisoGuardarCambiosZona));
			
			if(this.jInternalFrameDetalleFormZona!=null) {
			this.jInternalFrameDetalleFormZona.jButtonModificarZona.setVisible((this.isVisibilidadCeldaModificarZona && this.isPermisoActualizarZona));	
			this.jInternalFrameDetalleFormZona.jButtonActualizarZona.setVisible((this.isVisibilidadCeldaActualizarZona && this.isPermisoActualizarZona));	
			this.jInternalFrameDetalleFormZona.jButtonEliminarZona.setVisible((this.isVisibilidadCeldaEliminarZona && this.isPermisoEliminarZona));
			this.jInternalFrameDetalleFormZona.jButtonCancelarZona.setVisible(this.isVisibilidadCeldaCancelarZona);							
			this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosZona.setVisible((this.isVisibilidadCeldaGuardarZona && this.isPermisoGuardarCambiosZona));			
			
			}
						
			this.jButtonGuardarCambiosTablaZona.setVisible((this.isVisibilidadCeldaGuardarCambiosZona && this.isPermisoGuardarCambiosZona));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarZona.setVisible((this.isVisibilidadCeldaNuevoZona && this.isPermisoNuevoZona));						
			this.jButtonDuplicarToolBarZona.setVisible((this.isVisibilidadCeldaDuplicarZona && this.isPermisoDuplicarZona));						
			this.jButtonCopiarToolBarZona.setVisible((this.isVisibilidadCeldaCopiarZona && this.isPermisoCopiarZona));			
			this.jButtonVerFormToolBarZona.setVisible((this.isVisibilidadCeldaVerFormZona && this.isPermisoVerFormZona));			
			this.jButtonAbrirOrderByToolBarZona.setVisible((this.isVisibilidadCeldaOrdenZona && this.isPermisoOrdenZona));
			this.jButtonNuevoRelacionesToolBarZona.setVisible((this.isVisibilidadCeldaNuevoRelacionesZona && this.isPermisoNuevoZona));			
			this.jButtonNuevoGuardarCambiosToolBarZona.setVisible((this.isVisibilidadCeldaNuevoZona && this.isPermisoNuevoZona && this.isPermisoGuardarCambiosZona));			
			
			if(this.jInternalFrameDetalleFormZona!=null) {
			this.jInternalFrameDetalleFormZona.jButtonModificarToolBarZona.setVisible((this.isVisibilidadCeldaModificarZona && this.isPermisoActualizarZona));	
			this.jInternalFrameDetalleFormZona.jButtonActualizarToolBarZona.setVisible((this.isVisibilidadCeldaActualizarZona  && this.isPermisoActualizarZona));	
			this.jInternalFrameDetalleFormZona.jButtonEliminarToolBarZona.setVisible((this.isVisibilidadCeldaEliminarZona && this.isPermisoEliminarZona));
			this.jInternalFrameDetalleFormZona.jButtonCancelarToolBarZona.setVisible(this.isVisibilidadCeldaCancelarZona);				
			this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosToolBarZona.setVisible((this.isVisibilidadCeldaGuardarZona && this.isPermisoGuardarCambiosZona));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarZona.setVisible((this.isVisibilidadCeldaGuardarCambiosZona && this.isPermisoGuardarCambiosZona));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoZona.setVisible((this.isVisibilidadCeldaNuevoZona && this.isPermisoNuevoZona));			
			this.jMenuItemDuplicarZona.setVisible((this.isVisibilidadCeldaDuplicarZona && this.isPermisoDuplicarZona));			
			this.jMenuItemCopiarZona.setVisible((this.isVisibilidadCeldaCopiarZona && this.isPermisoCopiarZona));			
			this.jMenuItemVerFormZona.setVisible((this.isVisibilidadCeldaVerFormZona && this.isPermisoVerFormZona));			
			this.jMenuItemAbrirOrderByZona.setVisible((this.isVisibilidadCeldaOrdenZona && this.isPermisoOrdenZona));			
			//this.jMenuItemMostrarOcultarZona.setVisible((this.isVisibilidadCeldaOrdenZona && this.isPermisoOrdenZona));
			this.jMenuItemDetalleAbrirOrderByZona.setVisible((this.isVisibilidadCeldaOrdenZona && this.isPermisoOrdenZona));			
			//this.jMenuItemDetalleMostrarOcultarZona.setVisible((this.isVisibilidadCeldaOrdenZona && this.isPermisoOrdenZona));			
			this.jMenuItemNuevoRelacionesZona.setVisible((this.isVisibilidadCeldaNuevoRelacionesZona && this.isPermisoNuevoZona));			
			this.jMenuItemNuevoGuardarCambiosZona.setVisible((this.isVisibilidadCeldaNuevoZona && this.isPermisoNuevoZona && this.isPermisoGuardarCambiosZona));									
			
			if(this.jInternalFrameDetalleFormZona!=null) {
			this.jInternalFrameDetalleFormZona.jMenuItemModificarZona.setVisible((this.isVisibilidadCeldaModificarZona && this.isPermisoActualizarZona));	
			this.jInternalFrameDetalleFormZona.jMenuItemActualizarZona.setVisible((this.isVisibilidadCeldaActualizarZona && this.isPermisoActualizarZona));	
			this.jInternalFrameDetalleFormZona.jMenuItemEliminarZona.setVisible((this.isVisibilidadCeldaEliminarZona && this.isPermisoEliminarZona));
			this.jInternalFrameDetalleFormZona.jMenuItemCancelarZona.setVisible(this.isVisibilidadCeldaCancelarZona);				
			}
			
			this.jMenuItemGuardarCambiosZona.setVisible((this.isVisibilidadCeldaGuardarZona && this.isPermisoGuardarCambiosZona));						
			this.jMenuItemGuardarCambiosTablaZona.setVisible((this.isVisibilidadCeldaGuardarCambiosZona && this.isPermisoGuardarCambiosZona));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoZona=this.jButtonNuevoZona.isVisible();
			this.isVisibilidadCeldaDuplicarZona=this.jButtonDuplicarZona.isVisible();
			this.isVisibilidadCeldaCopiarZona=this.jButtonCopiarZona.isVisible();
			this.isVisibilidadCeldaVerFormZona=this.jButtonVerFormZona.isVisible();
			
			this.isVisibilidadCeldaOrdenZona=this.jButtonAbrirOrderByZona.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesZona=this.jButtonNuevoRelacionesZona.isVisible();
			this.isVisibilidadCeldaModificarZona=this.jButtonModificarZona.isVisible();
			
			if(this.jInternalFrameDetalleFormZona!=null) {
			this.isVisibilidadCeldaActualizarZona=this.jInternalFrameDetalleFormZona.jButtonActualizarZona.isVisible();
			this.isVisibilidadCeldaEliminarZona=this.jInternalFrameDetalleFormZona.jButtonEliminarZona.isVisible();
			this.isVisibilidadCeldaCancelarZona=this.jInternalFrameDetalleFormZona.jButtonCancelarZona.isVisible();
			this.isVisibilidadCeldaGuardarZona=this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosZona.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosZona=this.jButtonGuardarCambiosTablaZona.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoZona=this.jButtonNuevoToolBarZona.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesZona=this.jButtonNuevoRelacionesToolBarZona.isVisible();
			
			if(this.jInternalFrameDetalleFormZona!=null) {
			this.isVisibilidadCeldaModificarZona=this.jInternalFrameDetalleFormZona.jButtonModificarToolBarZona.isVisible();
			this.isVisibilidadCeldaActualizarZona=this.jInternalFrameDetalleFormZona.jButtonActualizarToolBarZona.isVisible();
			this.isVisibilidadCeldaEliminarZona=this.jInternalFrameDetalleFormZona.jButtonEliminarToolBarZona.isVisible();
			this.isVisibilidadCeldaCancelarZona=this.jInternalFrameDetalleFormZona.jButtonCancelarToolBarZona.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarZona=this.jButtonGuardarCambiosToolBarZona.isVisible();
			this.isVisibilidadCeldaGuardarCambiosZona=this.jButtonGuardarCambiosTablaToolBarZona.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoZona=this.jMenuItemNuevoZona.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesZona=this.jMenuItemNuevoRelacionesZona.isVisible();
			
			if(this.jInternalFrameDetalleFormZona!=null) {
			this.isVisibilidadCeldaModificarZona=this.jInternalFrameDetalleFormZona.jMenuItemModificarZona.isVisible();
			this.isVisibilidadCeldaActualizarZona=this.jInternalFrameDetalleFormZona.jMenuItemActualizarZona.isVisible();
			this.isVisibilidadCeldaEliminarZona=this.jInternalFrameDetalleFormZona.jMenuItemEliminarZona.isVisible();
			this.isVisibilidadCeldaCancelarZona=this.jInternalFrameDetalleFormZona.jMenuItemCancelarZona.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarZona=this.jMenuItemGuardarCambiosZona.isVisible();
			this.isVisibilidadCeldaGuardarCambiosZona=this.jMenuItemGuardarCambiosTablaZona.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesZona(Boolean esInicializar) {
		if(ZonaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.zonaSessionBean.getConGuardarRelaciones()) {
				//if(this.zonaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesZona();
			}
			
			this.inicializarActualizarBindingBotonesManualZona(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualZona() {
		this.jButtonNuevoZona.setVisible(this.isPermisoNuevoZona);			
		this.jButtonDuplicarZona.setVisible(this.isPermisoDuplicarZona);			
		this.jButtonCopiarZona.setVisible(this.isPermisoCopiarZona);			
		this.jButtonVerFormZona.setVisible(this.isPermisoVerFormZona);			
		
		this.jButtonAbrirOrderByZona.setVisible(this.isPermisoOrdenZona);					
		
		this.jButtonNuevoRelacionesZona.setVisible(this.isPermisoNuevoZona);			
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonModificarZona.setVisible(this.isPermisoActualizarZona);	
			this.jInternalFrameDetalleFormZona.jButtonActualizarZona.setVisible(this.isPermisoActualizarZona);	
			this.jInternalFrameDetalleFormZona.jButtonEliminarZona.setVisible(this.isPermisoEliminarZona);
			this.jInternalFrameDetalleFormZona.jButtonCancelarZona.setVisible(this.isVisibilidadCeldaCancelarZona);						
			this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosZona.setVisible(this.isPermisoGuardarCambiosZona);							
		}
		
		this.jButtonGuardarCambiosTablaZona.setVisible(this.isPermisoActualizarZona);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleZona() {
		this.jInternalFrameDetalleFormZona.jButtonModificarZona.setVisible(this.isPermisoActualizarZona);	
		this.jInternalFrameDetalleFormZona.jButtonActualizarZona.setVisible(this.isPermisoActualizarZona);	
		this.jInternalFrameDetalleFormZona.jButtonEliminarZona.setVisible(this.isPermisoEliminarZona);
		this.jInternalFrameDetalleFormZona.jButtonCancelarZona.setVisible(this.isVisibilidadCeldaCancelarZona);							
		this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosZona.setVisible((this.isVisibilidadCeldaGuardarZona && this.isPermisoGuardarCambiosZona));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosZona() {
		if(ZonaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualZona();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesZona() {
	}
	
	public void jTableDatosZonaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarZona(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualZona(this.getzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.zona==null) {
						this.zona = new Zona();
					}

					this.setVariablesFormularioToObjetoActualZona(this.zona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
				}

				if(this.zona.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.zona.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaZonaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebZona(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosZona.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosZona.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosZona.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualZona(this.getzona(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.zonaLogic.getConnexion());

				if(this.zona.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.zona.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderZona=(TitledBorder)this.jScrollPanelDatosZona.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderZona.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualZona(this.getzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.zona==null) {
						this.zona = new Zona();
					}

					this.setVariablesFormularioToObjetoActualZona(this.zona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
				}

				if(this.zona.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.zona.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalZonaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebZona(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosZona.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosZona.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosZona.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualZona(this.getzona(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.zonaLogic.getConnexion());

				if(this.zona.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.zona.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderZona=(TitledBorder)this.jScrollPanelDatosZona.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderZona.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualZona(this.getzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.zona==null) {
						this.zona = new Zona();
					}

					this.setVariablesFormularioToObjetoActualZona(this.zona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
				}

				if(this.zona.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.zona.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualZona(this.getzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.zona==null) {
						this.zona = new Zona();
					}

					this.setVariablesFormularioToObjetoActualZona(this.zona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);
				}

				if(this.zona.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.zona.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreZonaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingZona(false,false);

			this.getZonasBusquedaPorNombre();

			this.inicializarActualizarBindingZona(false);

			//if(ZonaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingZona(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaZonaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingZona(false,false);

			this.getZonasFK_IdEmpresa();

			this.inicializarActualizarBindingZona(false);

			//if(ZonaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingZona(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalZonaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingZona(false,false);

			this.getZonasFK_IdSucursal();

			this.inicializarActualizarBindingZona(false);

			//if(ZonaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingZona(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.zonaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameZona() {
		if(this.jInternalFrameDetalleFormZona!=null) {
		

		if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormZona!=null) {
			this.jInternalFrameDetalleFormZona.setVisible(false);	    			
			this.jInternalFrameDetalleFormZona.dispose();
			this.jInternalFrameDetalleFormZona=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoZona!=null) {
			this.jInternalFrameReporteDinamicoZona.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoZona.dispose();
			this.jInternalFrameReporteDinamicoZona=null;
		}
		
		if(this.jInternalFrameImportacionZona!=null) {
			this.jInternalFrameImportacionZona.setVisible(false);	    			
			this.jInternalFrameImportacionZona.dispose();
			this.jInternalFrameImportacionZona=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessZona();
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
			
			if(sTipo.equals("NuevoZona")) {
				jButtonNuevoZonaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarZona")) {
				jButtonDuplicarZonaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarZona")) {
				jButtonCopiarZonaActionPerformed(evt);
			} else if(sTipo.equals("VerFormZona")) {
				jButtonVerFormZonaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarZona")) {
				jButtonNuevoZonaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarZona")) {
				jButtonDuplicarZonaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoZona")) {
				jButtonNuevoZonaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarZona")) {
				jButtonDuplicarZonaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesZona")) {
				jButtonNuevoZonaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarZona")) {
				jButtonNuevoZonaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesZona")) {
				jButtonNuevoZonaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarZona")) {
				jButtonModificarZonaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarZona")) {
				jButtonModificarZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarZona")) {
				jButtonModificarZonaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarZona")) {
				jButtonActualizarZonaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarZona")) {
				jButtonActualizarZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarZona")) {
				jButtonActualizarZonaActionPerformed(evt);
			} else if(sTipo.equals("EliminarZona")) {
				jButtonEliminarZonaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarZona")) {
				jButtonEliminarZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarZona")) {
				jButtonEliminarZonaActionPerformed(evt);
			} else if(sTipo.equals("CancelarZona")) {
				jButtonCancelarZonaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarZona")) {
				jButtonCancelarZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarZona")) {
				jButtonCancelarZonaActionPerformed(evt);
			} else if(sTipo.equals("CerrarZona")) {
				jButtonCerrarZonaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarZona")) {
				jButtonCerrarZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarZona")) {
				jButtonCerrarZonaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarZona")) {
				jButtonMostrarOcultarZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarZona")) {
				jButtonCancelarZonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosZona")) {
				jButtonGuardarCambiosZonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarZona")) {
				jButtonGuardarCambiosZonaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarZona")) {
				jButtonCopiarZonaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarZona")) {
				jButtonVerFormZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosZona")) {
				jButtonGuardarCambiosZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarZona")) {
				jButtonCopiarZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormZona")) {
				jButtonVerFormZonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaZona")) {
				jButtonGuardarCambiosZonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarZona")) {
				jButtonGuardarCambiosZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaZona")) {
				jButtonGuardarCambiosZonaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionZona")) {
				jButtonRecargarInformacionZonaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarZona")) {
				jButtonRecargarInformacionZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionZona")) {
				jButtonRecargarInformacionZonaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresZona")) {
				jButtonAnterioresZonaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarZona")) {
				jButtonAnterioresZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreZona")) {
				jButtonAnterioresZonaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesZona")) {
				jButtonSiguientesZonaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarZona")) {
				jButtonSiguientesZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesZona")) {
				jButtonSiguientesZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByZona") || sTipo.equals("MenuItemDetalleAbrirOrderByZona")) {
				jButtonAbrirOrderByZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarZona") || sTipo.equals("MenuItemDetalleMostrarOcultarZona")) {
				jButtonMostrarOcultarZonaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosZona")) {
				jButtonNuevoGuardarCambiosZonaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarZona")) {
				jButtonNuevoGuardarCambiosZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosZona")) {
				jButtonNuevoGuardarCambiosZonaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoZona")) {
				jButtonCerrarReporteDinamicoZonaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoZona")) {
				jButtonGenerarReporteDinamicoZonaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoZona")) {
				
				jButtonGenerarExcelReporteDinamicoZonaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionZona")) {
				jButtonCerrarImportacionZonaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionZona")) {
				
				jButtonGenerarImportacionZonaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionZona")) {
				
				jButtonAbrirImportacionZonaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesZona")) {
				jComboBoxTiposAccionesZonaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesZona")) {
				jComboBoxTiposRelacionesZonaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioZona")) {
				jComboBoxTiposAccionesZonaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarZona")) {
				
				jComboBoxTiposSeleccionarZonaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralZona")) {
				jTextFieldValorCampoGeneralZonaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByZona")) {
				jButtonAbrirOrderByZonaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarZona")) {
				jButtonAbrirOrderByZonaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByZona")) {
				jButtonCerrarOrderByZonaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idZonaBusqueda")) {
				this.jButtonidZonaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaZonaUpdate")) {
				this.jButtonid_empresaZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaZonaBusqueda")) {
				this.jButtonid_empresaZonaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalZonaUpdate")) {
				this.jButtonid_sucursalZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalZonaBusqueda")) {
				this.jButtonid_sucursalZonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreZonaBusqueda")) {
				this.jButtonnombreZonaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreZona")) {
				this.jButtonBusquedaPorNombreZonaActionPerformed(evt);
			}
			
			;
			
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessZona();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaZonaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				


				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Zona zonaLocal=null;
			
			if(!this.getEsControlTabla()) {
				zonaLocal=this.zona;
			} else {
				zonaLocal=this.zonaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
							
				
				


				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaAnterior =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.zonaAnterior =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
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
			
			


			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaZonaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
								
						
				


				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
								
				
				


				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaAnterior =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.zonaAnterior =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaAnterior =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.zonaAnterior =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaZonaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
			
			this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
							
				
				


				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaZonaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosZona.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zonaAnterior =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.zonaAnterior =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
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
			
			


			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaZonaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
			
			this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
								
				
				


				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaAnterior =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.zonaAnterior =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaZonaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
			
			this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaZonaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosZona")) {
					jCheckBoxSeleccionarTodosZonaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosZona")) {
					jCheckBoxSeleccionadosZonaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarZona")) {
					
				}
				
				


				
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
												
				
				


				
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaZonaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosZona.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.zonaAnterior =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.zonaAnterior =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaZonaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
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
			
			


			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaZonaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.zona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.zona);
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
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
				
				


				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Zona.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Zona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.zonaAnterior =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.zonaAnterior =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarZona")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosZonaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosZona.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.zona =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.zona =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.zona);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarZona")) {
				
				}
				
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarZona")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosZona.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarZona")) {
			
			}
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessZona();
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
			if(sTipo.equals("NuevoZona")) {
				jButtonNuevoZonaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarZona")) {
				jButtonDuplicarZonaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarZona")) {
				jButtonCopiarZonaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormZona")) {
				jButtonVerFormZonaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesZona")) {
				jButtonNuevoZonaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarZona")) {
				jButtonModificarZonaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarZona")) {
				jButtonActualizarZonaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarZona")) {
				jButtonEliminarZonaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaZona")) {
				jButtonGuardarCambiosZonaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarZona")) {
				jButtonCancelarZonaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarZona")) {
				jButtonCerrarZonaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosZona")) {
				jButtonGuardarCambiosZonaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosZona")) {
				jButtonNuevoGuardarCambiosZonaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByZona")) {
				jButtonAbrirOrderByZonaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionZona")) {
				jButtonRecargarInformacionZonaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresZona")) {
				jButtonAnterioresZonaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesZona")) {
				jButtonSiguientesZonaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idZonaBusqueda")) {
				this.jButtonidZonaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaZonaUpdate")) {
				this.jButtonid_empresaZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaZonaBusqueda")) {
				this.jButtonid_empresaZonaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalZonaUpdate")) {
				this.jButtonid_sucursalZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalZonaBusqueda")) {
				this.jButtonid_sucursalZonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreZonaBusqueda")) {
				this.jButtonnombreZonaBusquedaActionPerformed(evt);
			}
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessZona();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameZona")) {
				closingInternalFrameZona();
				
			} else if(sTipo.equals("jButtonCancelarZona")) {
				JInternalFrameBase jInternalFrameDetalleFormZona = (JInternalFrameBase)evt.getSource();
	            	
	            ZonaBeanSwingJInternalFrame jInternalFrameParent=(ZonaBeanSwingJInternalFrame)jInternalFrameDetalleFormZona.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarZonaActionPerformed(null);
			}
			
			ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.zona,new Object(),this.zonaParameterGeneral,this.zonaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormZona(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormZona(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormZona(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.zona)) {
			if(!esControlTabla) {
				if(ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualZona(this.zona,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);			
				}
				
				if(this.zonaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualZona(this.zona,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.zonaReturnGeneral=zonaLogic.procesarEventosZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.zonaLogic.getZonas(),this.zona,this.zonaParameterGeneral,this.isEsNuevoZona,classes);//this.zonaLogic.getZona()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanZona(this.zonaReturnGeneral,this.zonaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.zonaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanZona(classes,this.zonaReturnGeneral,this.zonaBean,false);
					}
						
					if(this.zonaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyZona(this.zonaReturnGeneral.getZona());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioZona(this.zonaReturnGeneral.getZona());	
					}
						
					if(this.zonaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioZona(this.zonaReturnGeneral.getZona(),classes);//this.zonaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioZona(this.zona,classes);//this.zonaBean);									
				}
			
				if(ZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualZona(this.zona,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysZona(this.zona);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.zonaAnterior!=null) {
						this.zona=this.zonaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.zonaReturnGeneral=zonaLogic.procesarEventosZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.zonaLogic.getZonas(),this.zona,this.zonaParameterGeneral,this.isEsNuevoZona,classes);//this.zonaLogic.getZona()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.zonaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.zonaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.zonaReturnGeneral.getZona(),zonaLogic.getZonas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.zonaReturnGeneral.getZona(),this.zonas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosZona.repaint();
				
				//((AbstractTableModel) this.jTableDatosZona.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosZona();
			}
		}
	}
	
	public void actualizarVisualTableDatosZona() throws Exception {
		
		ZonaModel zonaModel=(ZonaModel)this.jTableDatosZona.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			zonaModel.zonas=this.zonaLogic.getZonas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			zonaModel.zonas=this.zonas;
		}
		
		
		((ZonaModel) this.jTableDatosZona.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaZona() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getzonaAnterior(),this.zonaLogic.getZonas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getzonaAnterior(),this.zonas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosZona();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioZona(Zona zona,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoVentasLineas.class)) {
					this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(zona.getPresupuestoVentasLineass());
					this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentasLineas(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Vendedor.class)) {
					this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.setVendedors(zona.getVendedors());
					this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(zona.getClientes());
					this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(zona.getSubClientes());
					this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoVentas.class)) {
					this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.setPresupuestoVentass(zona.getPresupuestoVentass());
					this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentas(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VendedorZona.class)) {
					this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.setVendedorZonas(zona.getVendedorZonas());
					this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedorZona(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
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
										
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.zona,new Object(),generalEntityParameterGeneral,this.zonaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.zonaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ZonaConstantesFunciones.getClassesRelationshipsOfZona(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ZonaConstantesFunciones.getClassesRelationshipsFromStringsOfZona(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormZona(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.zona,new Object(),generalEntityParameterGeneral,this.zonaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioZona(ZonaBean zonaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoVentasLineas.class)) {
					this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(zona.getPresupuestoVentasLineass());
					this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentasLineas(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Vendedor.class)) {
					this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.setVendedors(zona.getVendedors());
					this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(zona.getClientes());
					this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(zona.getSubClientes());
					this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoVentas.class)) {
					this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.setPresupuestoVentass(zona.getPresupuestoVentass());
					this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentas(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VendedorZona.class)) {
					this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.setVendedorZonas(zona.getVendedorZonas());
					this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedorZona(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanZona(ArrayList<Classe> classes,ZonaReturnGeneral zonaReturnGeneral,ZonaBean zonaBean,Boolean conDefault) throws Exception {
		
			this.zonaBean.setPresupuestoVentasLineass(zonaReturnGeneral.getZona().getPresupuestoVentasLineass());
			this.zonaBean.setVendedors(zonaReturnGeneral.getZona().getVendedors());
			this.zonaBean.setClientes(zonaReturnGeneral.getZona().getClientes());
			this.zonaBean.setSubClientes(zonaReturnGeneral.getZona().getSubClientes());
			this.zonaBean.setPresupuestoVentass(zonaReturnGeneral.getZona().getPresupuestoVentass());
			this.zonaBean.setVendedorZonas(zonaReturnGeneral.getZona().getVendedorZonas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualZona(Zona zona,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoVentasLineas.class)) {
					zona.setPresupuestoVentasLineass(this.jInternalFrameDetalleFormZona.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Vendedor.class)) {
					zona.setVendedors(this.jInternalFrameDetalleFormZona.vendedorBeanSwingJInternalFrame.vendedorLogic.getVendedors());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					zona.setClientes(this.jInternalFrameDetalleFormZona.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					zona.setSubClientes(this.jInternalFrameDetalleFormZona.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoVentas.class)) {
					zona.setPresupuestoVentass(this.jInternalFrameDetalleFormZona.presupuestoventasBeanSwingJInternalFrame.presupuestoventasLogic.getPresupuestoVentass());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VendedorZona.class)) {
					zona.setVendedorZonas(this.jInternalFrameDetalleFormZona.vendedorzonaBeanSwingJInternalFrame.vendedorzonaLogic.getVendedorZonas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.zona)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormZona = new ZonaDetalleFormJInternalFrame(jDesktopPane,this.zonaSessionBean.getConGuardarRelaciones(),this.zonaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormZona);
		this.jInternalFrameDetalleFormZona.setVisible(false);
		this.jInternalFrameDetalleFormZona.setSelected(false);						
		
		this.jInternalFrameDetalleFormZona.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormZona.zonaLogic=this.zonaLogic;
		
		this.cargarCombosFrameForeignKeyZona("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleZona();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleZona();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyZona("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyZona();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormZona.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarZona"));
		
		this.jInternalFrameDetalleFormZona.jButtonModificarZona.addActionListener(new ButtonActionListener(this,"ModificarZona"));

		
		this.jInternalFrameDetalleFormZona.jButtonModificarToolBarZona.addActionListener(new ButtonActionListener(this,"ModificarToolBarZona"));
					
		this.jInternalFrameDetalleFormZona.jMenuItemModificarZona.addActionListener(new ButtonActionListener(this,"MenuItemModificarZona"));		
		
		
		
		this.jInternalFrameDetalleFormZona.jButtonActualizarZona.addActionListener (new ButtonActionListener(this,"ActualizarZona"));
		
		
		this.jInternalFrameDetalleFormZona.jButtonActualizarToolBarZona.addActionListener(new ButtonActionListener(this,"ActualizarToolBarZona"));
						
		this.jInternalFrameDetalleFormZona.jMenuItemActualizarZona.addActionListener (new ButtonActionListener(this,"MenuItemActualizarZona"));		
		
		
		
		this.jInternalFrameDetalleFormZona.jButtonEliminarZona.addActionListener (new ButtonActionListener(this,"EliminarZona"));
		
		
		this.jInternalFrameDetalleFormZona.jButtonEliminarToolBarZona.addActionListener (new ButtonActionListener(this,"EliminarToolBarZona"));
								
		this.jInternalFrameDetalleFormZona.jMenuItemEliminarZona.addActionListener (new ButtonActionListener(this,"MenuItemEliminarZona"));		
		
		
		
		this.jInternalFrameDetalleFormZona.jButtonCancelarZona.addActionListener (new ButtonActionListener(this,"CancelarZona"));
		
		
		this.jInternalFrameDetalleFormZona.jButtonCancelarToolBarZona.addActionListener (new ButtonActionListener(this,"CancelarToolBarZona"));
					
		this.jInternalFrameDetalleFormZona.jMenuItemCancelarZona.addActionListener (new ButtonActionListener(this,"MenuItemCancelarZona"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormZona.jMenuItemDetalleCerrarZona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarZona"));		
		
		
		
		this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosToolBarZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarZona"));
		
		
		
		this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosToolBarZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarZona"));
		
		
		
		this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioZona"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonidZonaBusqueda.addActionListener(new ButtonActionListener(this,"idZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormZona.jButtonid_empresaZonaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonid_empresaZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormZona.jButtonid_sucursalZonaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonid_sucursalZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalZonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonnombreZonaBusqueda.addActionListener(new ButtonActionListener(this,"nombreZonaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesZona"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameZona"));
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarZona"));
		}
		
		this.jTableDatosZona.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarZona"));
		
		this.jTableDatosZona.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarZona"));
		
		this.jButtonNuevoZona.addActionListener(new ButtonActionListener(this,"NuevoZona"));
		
		this.jButtonDuplicarZona.addActionListener(new ButtonActionListener(this,"DuplicarZona"));
		
		this.jButtonCopiarZona.addActionListener(new ButtonActionListener(this,"CopiarZona"));
		
		this.jButtonVerFormZona.addActionListener(new ButtonActionListener(this,"VerFormZona"));
		
		
		this.jButtonNuevoToolBarZona.addActionListener(new ButtonActionListener(this,"NuevoToolBarZona"));
			
		this.jButtonDuplicarToolBarZona.addActionListener(new ButtonActionListener(this,"DuplicarToolBarZona"));
			
		this.jMenuItemNuevoZona.addActionListener (new ButtonActionListener(this,"MenuItemNuevoZona"));
			
		this.jMenuItemDuplicarZona.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarZona"));		
		
		
		this.jButtonNuevoRelacionesZona.addActionListener (new ButtonActionListener(this,"NuevoRelacionesZona"));
		
		
		this.jButtonNuevoRelacionesToolBarZona.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarZona"));
			
		this.jMenuItemNuevoRelacionesZona.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesZona"));		
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonModificarZona.addActionListener(new ButtonActionListener(this,"ModificarZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonModificarToolBarZona.addActionListener(new ButtonActionListener(this,"ModificarToolBarZona"));
			
			this.jInternalFrameDetalleFormZona.jMenuItemModificarZona.addActionListener(new ButtonActionListener(this,"MenuItemModificarZona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormZona.jButtonActualizarZona.addActionListener (new ButtonActionListener(this,"ActualizarZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonActualizarToolBarZona.addActionListener(new ButtonActionListener(this,"ActualizarToolBarZona"));
				
			this.jInternalFrameDetalleFormZona.jMenuItemActualizarZona.addActionListener (new ButtonActionListener(this,"MenuItemActualizarZona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonEliminarZona.addActionListener (new ButtonActionListener(this,"EliminarZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonEliminarToolBarZona.addActionListener (new ButtonActionListener(this,"EliminarToolBarZona"));
						
			this.jInternalFrameDetalleFormZona.jMenuItemEliminarZona.addActionListener (new ButtonActionListener(this,"MenuItemEliminarZona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonCancelarZona.addActionListener (new ButtonActionListener(this,"CancelarZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonCancelarToolBarZona.addActionListener (new ButtonActionListener(this,"CancelarToolBarZona"));
			
			this.jInternalFrameDetalleFormZona.jMenuItemCancelarZona.addActionListener (new ButtonActionListener(this,"MenuItemCancelarZona"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarZona.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarZona"));		
		
		
		this.jButtonCerrarZona.addActionListener (new ButtonActionListener(this,"CerrarZona"));
		
		
		this.jButtonCerrarToolBarZona.addActionListener (new ButtonActionListener(this,"CerrarToolBarZona"));
			
		this.jMenuItemCerrarZona.addActionListener (new ButtonActionListener(this,"MenuItemCerrarZona"));
			
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jMenuItemDetalleCerrarZona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarZona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosToolBarZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarZona"));
		}
		
		this.jButtonCopiarToolBarZona.addActionListener (new ButtonActionListener(this,"CopiarToolBarZona"));
			
		this.jButtonVerFormToolBarZona.addActionListener (new ButtonActionListener(this,"VerFormToolBarZona"));
		
		this.jMenuItemGuardarCambiosZona.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosZona"));
			
		this.jMenuItemCopiarZona.addActionListener (new ButtonActionListener(this,"MenuItemCopiarZona"));		
		
		this.jMenuItemVerFormZona.addActionListener (new ButtonActionListener(this,"MenuItemVerFormZona"));		
		
		
		this.jButtonGuardarCambiosTablaZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaZona"));
		
		
		this.jButtonGuardarCambiosTablaToolBarZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarZona"));
			
		this.jMenuItemGuardarCambiosTablaZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaZona"));		
		
		
		
		this.jButtonRecargarInformacionZona.addActionListener (new ButtonActionListener(this,"RecargarInformacionZona"));
					
		this.jButtonRecargarInformacionToolBarZona.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarZona"));
		
		this.jMenuItemRecargarInformacionZona.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionZona"));		
		
		
		
		this.jButtonAnterioresZona.addActionListener (new ButtonActionListener(this,"AnterioresZona"));
		
		
		this.jButtonAnterioresToolBarZona.addActionListener (new ButtonActionListener(this,"AnterioresToolBarZona"));
		
		this.jMenuItemAnterioresZona.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresZona"));		
		
		
		this.jButtonSiguientesZona.addActionListener (new ButtonActionListener(this,"SiguientesZona"));
		
		
		this.jButtonSiguientesToolBarZona.addActionListener (new ButtonActionListener(this,"SiguientesToolBarZona"));
			
		this.jMenuItemSiguientesZona.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesZona"));
			
		this.jMenuItemAbrirOrderByZona.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByZona"));
			
		this.jMenuItemMostrarOcultarZona.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarZona"));
			
		this.jMenuItemDetalleAbrirOrderByZona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByZona"));
			
		this.jMenuItemDetalleMostarOcultarZona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarZona"));		
		
		
		this.jButtonNuevoGuardarCambiosZona.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosZona"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarZona.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarZona"));
			
		this.jMenuItemNuevoGuardarCambiosZona.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosZona"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosZona.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosZona"));

		this.jCheckBoxSeleccionadosZona.addItemListener(new CheckBoxItemListener(this,"SeleccionadosZona"));
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioZona"));
		}
		
		
		this.jComboBoxTiposRelacionesZona.addActionListener (new ButtonActionListener(this,"TiposRelacionesZona"));
			
		this.jComboBoxTiposAccionesZona.addActionListener (new ButtonActionListener(this,"TiposAccionesZona"));
					
		this.jComboBoxTiposSeleccionarZona.addActionListener (new ButtonActionListener(this,"TiposSeleccionarZona"));
			
		this.jTextFieldValorCampoGeneralZona.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralZona"));		
		
		
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonidZonaBusqueda.addActionListener(new ButtonActionListener(this,"idZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormZona.jButtonid_empresaZonaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonid_empresaZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormZona.jButtonid_sucursalZonaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonid_sucursalZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalZonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonnombreZonaBusqueda.addActionListener(new ButtonActionListener(this,"nombreZonaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreZona.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreZona"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoZona!=null) {
				this.jInternalFrameReporteDinamicoZona.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoZona"));
				this.jInternalFrameReporteDinamicoZona.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoZona"));
				this.jInternalFrameReporteDinamicoZona.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoZona"));
			}
			
			//this.jButtonCerrarReporteDinamicoZona.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoZona"));				
			//this.jButtonGenerarReporteDinamicoZona.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoZona"));
			//this.jButtonGenerarExcelReporteDinamicoZona.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoZona"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionZona!=null) {
				this.jInternalFrameImportacionZona.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionZona"));
				this.jInternalFrameImportacionZona.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionZona"));
				this.jInternalFrameImportacionZona.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionZona"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByZona.addActionListener (new ButtonActionListener(this,"AbrirOrderByZona"));
			
			this.jButtonAbrirOrderByToolBarZona.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarZona"));			
			
			if(this.jInternalFrameOrderByZona!=null) {
				this.jInternalFrameOrderByZona.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByZona"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormZona.jTabbedPaneRelacionesZona.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesZona"));
		
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
            		closingInternalFrameZona();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormZona.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormZona = (JInternalFrameBase)event.getSource();
	            	
	            ZonaBeanSwingJInternalFrame jInternalFrameParent=(ZonaBeanSwingJInternalFrame)jInternalFrameDetalleFormZona.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarZonaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosZona.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosZonaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosZona.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosZona.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoZonaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoZonaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoZonaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoZona";
		inputMap = this.jButtonNuevoZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoZonaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoZonaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoZonaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoZonaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesZona";
		inputMap = this.jButtonNuevoRelacionesZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoZonaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarZona";
		inputMap = this.jButtonModificarZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarZona";
		inputMap = this.jButtonActualizarZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarZona";
		inputMap = this.jButtonEliminarZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarZona";
		inputMap = this.jButtonCancelarZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarZona";
		inputMap = this.jButtonCerrarZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosZona";
		inputMap = this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormZona.jButtonGuardarCambiosZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosZona.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosZonaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesZona.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesZonaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarZona.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarZonaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralZona.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralZonaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonidZonaBusqueda.addActionListener(new ButtonActionListener(this,"idZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormZona.jButtonid_empresaZonaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonid_empresaZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormZona.jButtonid_sucursalZonaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonid_sucursalZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalZonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormZona.jButtonnombreZonaBusqueda.addActionListener(new ButtonActionListener(this,"nombreZonaBusqueda"));
		
		
		this.jButtonBusquedaPorNombreZona.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreZona"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarZonaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarZona.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosZona(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Zona zonaAux:this.zonaLogic.getZonas()) {
					zonaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Zona zonaAux:zonas) {
					zonaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosZonaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingZona(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Zona zonaAux:this.zonaLogic.getZonas()) {
						zonaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Zona zonaAux:zonas) {
						zonaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Zona zonaAux:this.zonaLogic.getZonas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Zona zonaAux:zonas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaZona(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosZona.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosZona.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosZona,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosZonaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingZona(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosZona.getSelectedRows();
			
			Zona zonaLocal=new Zona();
			
			//this.seleccionarTodosZona(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLocal =(Zona) this.zonaLogic.getZonas().toArray()[this.jTableDatosZona.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					zonaLocal =(Zona) this.zonas.toArray()[this.jTableDatosZona.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				zonaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Zona zonaAux:this.zonaLogic.getZonas()) {
						zonaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Zona zonaAux:zonas) {
						zonaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaZona(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosZona.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosZona.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosZona,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualZonaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarZonaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralZonaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingZona(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralZona.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Zona zonaAux:this.zonaLogic.getZonas()) {
				
						if(sTipoSeleccionar.equals(ZonaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							zonaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Zona zonaAux:zonas) {
					
						if(sTipoSeleccionar.equals(ZonaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							zonaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaZona(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesZonaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingZona(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioZona=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesZona.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteZona) {				
					conSplash=true;//false;										
					
					//this.startProcessZona(conSplash);
				
					this.generarReporteZonasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoZonasSeleccionados();
				//this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoZonasSeleccionados(false);
				//this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoZonasSeleccionados(true);
				//this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessZona();
				
				this.exportarZonasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionZonas();
				//this.importarZonas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessZona();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelZonasSeleccionados();
				//this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Zona", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessZona();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoZona)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyZona(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.setSelectedIndex(0);					
				}	
			} 			
			else if(ZonaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteZona) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessZona(conSplash);
					
						//this.actualizarParametrosGeneralZona();
						
						this.generarReporteProcesoAccionZonasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ZonaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ZonaS SELECCIONADOS?", "MANTENIMIENTO DE Zona", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessZona();
				
						this.actualizarParametrosGeneralZona();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.zonaReturnGeneral=zonaLogic.procesarAccionZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.zonaLogic.getZonas(),this.zonaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarZonaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralZona();
					
					ZonaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarZonaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesZona.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormZona.jComboBoxTiposAccionesFormularioZona.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessZona(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesZonaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessZona();
			
			if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();		
			Zona zona=new Zona();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingZona(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesZona.getSelectedItem();
			
			
			
			
			zonasSeleccionados=this.getZonasSeleccionados(true);
			//this.sTipoAccion;
			
			if(zonasSeleccionados.size()==1) {
				for(Zona zonaAux:zonasSeleccionados) {
					zona=zonaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Presupuesto Ventas_lineas")) {
					jButtonPresupuestoVentasLineasActionPerformed(null,rowIndex,true,false,zona);
				}
				else if(this.sTipoRelacion.equals("Vendedor")) {
					jButtonVendedorActionPerformed(null,rowIndex,true,false,zona);
				}
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,zona);
				}
				else if(this.sTipoRelacion.equals("Sub Cliente")) {
					jButtonSubClienteActionPerformed(null,rowIndex,true,false,zona);
				}
				else if(this.sTipoRelacion.equals("Presupuesto Ventas")) {
					jButtonPresupuestoVentasActionPerformed(null,rowIndex,true,false,zona);
				}
				else if(this.sTipoRelacion.equals("Vendedor Zona")) {
					jButtonVendedorZonaActionPerformed(null,rowIndex,true,false,zona);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessZona();
			
      		//this.finishProcessZona(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarZonaReturnGeneral() throws Exception {
		if(this.zonaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.zonaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.zonaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.zonaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.zonaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.zonaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingZona(false);
		}
		
		if(this.zonaReturnGeneral.getConRetornoLista() || this.zonaReturnGeneral.getConRetornoObjeto()) {
			if(this.zonaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.zonaLogic.setZonas(this.zonaReturnGeneral.getZonas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.zonaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.zonaLogic.setZona(this.zonaReturnGeneral.getZona());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingZona(false);
		}
	}
	
	public void actualizarParametrosGeneralZona() throws Exception {
		
		
	}
	
	public ArrayList<Zona> getZonasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioZona) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Zona zonaAux:zonaLogic.getZonas()) {
					if(zonaAux.getIsSelected()) {
						zonasSeleccionados.add(zonaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Zona zonaAux:this.zonas) {
					if(zonaAux.getIsSelected()) {
						zonasSeleccionados.add(zonaAux);				
					}
				}
			}
			
			if(zonasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						zonasSeleccionados.addAll(this.zonaLogic.getZonas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						zonasSeleccionados.addAll(this.zonas);				
					}
				}
			}
		} else {
			zonasSeleccionados.add(this.zona);
		}
		
		return zonasSeleccionados;
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
	
	public void generarReporteZonasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalZonasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoZonasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoZonasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoZonasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesZonasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Zona",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesZonasSeleccionados() throws Exception {
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();		
		
		zonasSeleccionados=this.getZonasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteZonas("Todos",zonasSeleccionados);
		
	}	
	
	public void generarReporteNormalZonasSeleccionados() throws Exception {
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();		
		
		zonasSeleccionados=this.getZonasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteZonas("Todos",zonasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionZonasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();
		
		zonasSeleccionados=this.getZonasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteZonas("Todos",zonasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoZonasSeleccionados() throws Exception {
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();		
		
		
		this.abrirInicializarFrameReporteDinamicoZona();
		
		
		zonasSeleccionados=this.getZonasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoZona();
		
		
		//this.generarReporteZonas("Todos",zonasSeleccionados ,zonaImplementable,zonaImplementableHome);
	}
	
	public void mostrarImportacionZonas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionZona();
		
		this.abrirFrameImportacionZona();		
		
			
		//this.generarReporteZonas("Todos",zonasSeleccionados ,zonaImplementable,zonaImplementableHome);
	}
	
	public void importarZonas() throws Exception {		
	
	}
	
	public void exportarZonasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelZonasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoZonasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlZonasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Zona",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoZonasSeleccionados() throws Exception {
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();		
		
		zonasSeleccionados=this.getZonasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"zona."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarZona(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Zona zonaAux:zonasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarZona(zonaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//zonaAux.setsDetalleGeneralEntityReporte(zonaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.zonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarZona(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ZonaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ZonaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ZonaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ZonaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ZonaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarZona(Zona zona,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=zona.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=zona.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=zona.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=zona.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=zona.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelZonasSeleccionados() throws Exception {
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();		
		
		zonasSeleccionados=this.getZonasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"zona.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Zonas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelZona(row);				
				iRow++;
			}				
			
			for(Zona zonaAux:zonasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelZona(zonaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.zonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlZonasSeleccionados() throws Exception {
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();		
		
		zonasSeleccionados=this.getZonasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"zona.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("zonas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("zona");
			//elementRoot.appendChild(element);
		
			for(Zona zonaAux:zonasSeleccionados) {
				element = document.createElement("zona");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlZona(zonaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.zonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Zona",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelZona(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ZonaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ZonaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ZonaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ZonaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ZonaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelZona(Zona zona,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(zona.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(zona.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(zona.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(zona.getnombre());				
	}
	
	public void setFilaDatosExportarXmlZona(Zona zona,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ZonaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(zona.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ZonaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(zona.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ZonaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(zona.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ZonaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(zona.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementnombre = document.createElement(ZonaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(zona.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoZonasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Zona> zonasSeleccionados=new ArrayList<Zona>();
		
		zonasSeleccionados=this.getZonasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoZona(zonasSeleccionados);
		
		this.generarReporteZonas("Todos",zonasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoZona(ArrayList<Zona> zonasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Zona zonaAux:zonasSeleccionados) {
				zonaAux.setsDetalleGeneralEntityReporte(zonaAux.toString());
			
				if(sTipoSeleccionar.equals(ZonaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					zonaAux.setsDescripcionGeneralEntityReporte1(zonaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ZonaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					zonaAux.setsDescripcionGeneralEntityReporte1(zonaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ZonaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					zonaAux.setsDescripcionGeneralEntityReporte1(zonaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesZona(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoZona=true;
				this.isVisibilidadCeldaNuevoRelacionesZona=true;
				this.isVisibilidadCeldaGuardarCambiosZona=true;
			}
			
			this.isVisibilidadCeldaModificarZona=false;
			this.isVisibilidadCeldaActualizarZona=false;
			this.isVisibilidadCeldaEliminarZona=false;
			this.isVisibilidadCeldaCancelarZona=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarZona=true;
				} else {
					this.isVisibilidadCeldaGuardarZona=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoZona=false;
			this.isVisibilidadCeldaNuevoRelacionesZona=false;
			this.isVisibilidadCeldaGuardarCambiosZona=false;
			this.isVisibilidadCeldaModificarZona=false;
			this.isVisibilidadCeldaActualizarZona=true;
			this.isVisibilidadCeldaEliminarZona=false;
			this.isVisibilidadCeldaCancelarZona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarZona=true;
				} else {
					this.isVisibilidadCeldaGuardarZona=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoZona=false;
			this.isVisibilidadCeldaNuevoRelacionesZona=false;
			this.isVisibilidadCeldaGuardarCambiosZona=false;
			this.isVisibilidadCeldaModificarZona=false;
			this.isVisibilidadCeldaActualizarZona=true;
			this.isVisibilidadCeldaEliminarZona=true;
			this.isVisibilidadCeldaCancelarZona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarZona=true;
				} else {
					this.isVisibilidadCeldaGuardarZona=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoZona=false;
			this.isVisibilidadCeldaNuevoRelacionesZona=false;
			this.isVisibilidadCeldaGuardarCambiosZona=false;
			this.isVisibilidadCeldaModificarZona=false;
			this.isVisibilidadCeldaActualizarZona=true;
			this.isVisibilidadCeldaEliminarZona=false;
			this.isVisibilidadCeldaCancelarZona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarZona=false;
				} else {
					this.isVisibilidadCeldaGuardarZona=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoZona=true;
			this.isVisibilidadCeldaNuevoRelacionesZona=true;
			this.isVisibilidadCeldaGuardarCambiosZona=true;
			this.isVisibilidadCeldaModificarZona=false;
			this.isVisibilidadCeldaActualizarZona=false;
			this.isVisibilidadCeldaEliminarZona=false;
			this.isVisibilidadCeldaCancelarZona=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarZona=true;
				} else {
					this.isVisibilidadCeldaGuardarZona=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoZona=false;
			this.isVisibilidadCeldaNuevoRelacionesZona=false;
			this.isVisibilidadCeldaGuardarCambiosZona=false;
			this.isVisibilidadCeldaActualizarZona=false;
			this.isVisibilidadCeldaEliminarZona=false;
			this.isVisibilidadCeldaCancelarZona=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarZona=false;
				} else {
					this.isVisibilidadCeldaGuardarZona=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoZona=false;
			this.isVisibilidadCeldaNuevoRelacionesZona=false;
			this.isVisibilidadCeldaGuardarCambiosZona=false;
			this.isVisibilidadCeldaModificarZona=true;
			this.isVisibilidadCeldaActualizarZona=false;
			this.isVisibilidadCeldaEliminarZona=false;
			this.isVisibilidadCeldaCancelarZona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarZona=false;
				} else {
					this.isVisibilidadCeldaGuardarZona=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ZonaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoZona=true;
			this.isVisibilidadCeldaNuevoRelacionesZona=true;
			this.isVisibilidadCeldaGuardarCambiosZona=true;
		} else {
			this.actualizarEstadoPanelsZona(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarZona=false;
			//this.isVisibilidadCeldaVerFormZona=false;
			this.isVisibilidadCeldaDuplicarZona=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!zonaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesZona=false;
		} else {
			this.isVisibilidadCeldaNuevoZona=false;
			this.isVisibilidadCeldaGuardarCambiosZona=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(zonaSessionBean.getEsGuardarRelacionado()) {
			if(!zonaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesZona=false;												
			}
			
			this.jButtonCerrarZona.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesZona=false;
		}
		
		if(!this.permiteMantenimiento(this.zona)) {
			this.isVisibilidadCeldaActualizarZona=false;
			this.isVisibilidadCeldaEliminarZona=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesZona() {
		this.isVisibilidadCeldaNuevoZona=false;
		this.isVisibilidadCeldaGuardarCambiosZona=false;
	}
	
	public void actualizarEstadoPanelsZona(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionZona!=null) {
				this.jScrollPanelDatosEdicionZona.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasZona!=null) {
				this.jTabbedPaneBusquedasZona.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosZona!=null) {
				this.jScrollPanelDatosZona.setVisible(true);
			}
			
			if(this.jPanelPaginacionZona!=null) {
				this.jPanelPaginacionZona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesZona!=null) {
				this.jPanelParametrosReportesZona.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionZona!=null) {
				this.jScrollPanelDatosEdicionZona.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasZona!=null) {
				this.jTabbedPaneBusquedasZona.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosZona!=null) {
				this.jScrollPanelDatosZona.setVisible(false);
			}
			
			if(this.jPanelPaginacionZona!=null) {
				this.jPanelPaginacionZona.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesZona!=null) {
				this.jPanelParametrosReportesZona.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionZona!=null) {
				this.jScrollPanelDatosEdicionZona.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasZona!=null) {
				this.jTabbedPaneBusquedasZona.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosZona!=null) {
				this.jScrollPanelDatosZona.setVisible(false);
			}
			
			if(this.jPanelPaginacionZona!=null) {
				this.jPanelPaginacionZona.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesZona!=null) {
				this.jPanelParametrosReportesZona.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionZona!=null) {
				this.jScrollPanelDatosEdicionZona.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasZona!=null) {
				this.jTabbedPaneBusquedasZona.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosZona!=null) {
				this.jScrollPanelDatosZona.setVisible(false);
			}
			
			if(this.jPanelPaginacionZona!=null) {
				this.jPanelPaginacionZona.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesZona!=null) {
				this.jPanelParametrosReportesZona.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionZona!=null) {
				this.jScrollPanelDatosEdicionZona.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasZona!=null) {
				this.jTabbedPaneBusquedasZona.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosZona!=null) {
				this.jScrollPanelDatosZona.setVisible(true);
			}
			
			if(this.jPanelPaginacionZona!=null) {
				this.jPanelPaginacionZona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesZona!=null) {
				this.jPanelParametrosReportesZona.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionZona!=null) {
				this.jScrollPanelDatosEdicionZona.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasZona!=null) {
				this.jTabbedPaneBusquedasZona.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosZona!=null) {
				this.jScrollPanelDatosZona.setVisible(true);
			}
			
			if(this.jPanelPaginacionZona!=null) {
				this.jPanelPaginacionZona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesZona!=null) {
				this.jPanelParametrosReportesZona.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionZona!=null) {
				this.jScrollPanelDatosEdicionZona.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasZona!=null) {
				this.jTabbedPaneBusquedasZona.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosZona!=null) {
				this.jScrollPanelDatosZona.setVisible(true);
			}
			
			if(this.jPanelPaginacionZona!=null) {
				this.jPanelPaginacionZona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesZona!=null) {
				this.jPanelParametrosReportesZona.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.zonaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasZona!=null) {
					this.jTabbedPaneBusquedasZona.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesZona!=null) {
				this.jPanelParametrosReportesZona.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.zonaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasZona!=null) {
				this.jTabbedPaneBusquedasZona.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesZona!=null) {
				this.jPanelParametrosReportesZona.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasZona.remove(jPanelBusquedaPorNombreZona);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorNombre=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasZona.remove(jPanelBusquedaPorNombreZona);}
		}
		
	}
	
	

	public String registrarSesionZonaParaSubClientes() throws Exception {
		Boolean isPaginaPopupSubCliente=false;

		try {

			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
			}

			if(this.jInternalFrameDetalleFormZona.subclienteSessionBean==null) {
				this.jInternalFrameDetalleFormZona.subclienteSessionBean=new SubClienteSessionBean();
			}

			this.jInternalFrameDetalleFormZona.subclienteSessionBean.setsPathNavegacionActual(zonaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SubClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormZona.subclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubCliente=this.jInternalFrameDetalleFormZona.subclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormZona.subclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSubCliente(true);
			this.jInternalFrameDetalleFormZona.subclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente(ZonaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormZona.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
			this.jInternalFrameDetalleFormZona.subclienteSessionBean.setlidZonaActual(this.idZonaActual);

			zonaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyZona(true);
			zonaSessionBean.setlIdZonaActualForeignKey(this.idZonaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionZonaParaVendedores() throws Exception {
		Boolean isPaginaPopupVendedor=false;

		try {

			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
			}

			if(this.jInternalFrameDetalleFormZona.vendedorSessionBean==null) {
				this.jInternalFrameDetalleFormZona.vendedorSessionBean=new VendedorSessionBean();
			}

			this.jInternalFrameDetalleFormZona.vendedorSessionBean.setsPathNavegacionActual(zonaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VendedorConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormZona.vendedorSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupVendedor=this.jInternalFrameDetalleFormZona.vendedorSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormZona.vendedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVendedor(true);
			this.jInternalFrameDetalleFormZona.vendedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVendedor(ZonaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormZona.vendedorSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
			this.jInternalFrameDetalleFormZona.vendedorSessionBean.setlidZonaActual(this.idZonaActual);

			zonaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyZona(true);
			zonaSessionBean.setlIdZonaActualForeignKey(this.idZonaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionZonaParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
			}

			if(this.jInternalFrameDetalleFormZona.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormZona.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormZona.clienteSessionBean.setsPathNavegacionActual(zonaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormZona.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormZona.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormZona.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormZona.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ZonaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormZona.clienteSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
			this.jInternalFrameDetalleFormZona.clienteSessionBean.setlidZonaActual(this.idZonaActual);

			zonaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyZona(true);
			zonaSessionBean.setlIdZonaActualForeignKey(this.idZonaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionZonaParaVendedorZonas() throws Exception {
		Boolean isPaginaPopupVendedorZona=false;

		try {

			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
			}

			if(this.jInternalFrameDetalleFormZona.vendedorzonaSessionBean==null) {
				this.jInternalFrameDetalleFormZona.vendedorzonaSessionBean=new VendedorZonaSessionBean();
			}

			this.jInternalFrameDetalleFormZona.vendedorzonaSessionBean.setsPathNavegacionActual(zonaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormZona.vendedorzonaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupVendedorZona=this.jInternalFrameDetalleFormZona.vendedorzonaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormZona.vendedorzonaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVendedorZona(true);
			this.jInternalFrameDetalleFormZona.vendedorzonaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVendedorZona(ZonaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormZona.vendedorzonaSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
			this.jInternalFrameDetalleFormZona.vendedorzonaSessionBean.setlidZonaActual(this.idZonaActual);

			zonaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyZona(true);
			zonaSessionBean.setlIdZonaActualForeignKey(this.idZonaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionZonaParaPresupuestoVentases() throws Exception {
		Boolean isPaginaPopupPresupuestoVentas=false;

		try {

			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
			}

			if(this.jInternalFrameDetalleFormZona.presupuestoventasSessionBean==null) {
				this.jInternalFrameDetalleFormZona.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			this.jInternalFrameDetalleFormZona.presupuestoventasSessionBean.setsPathNavegacionActual(zonaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormZona.presupuestoventasSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPresupuestoVentas=this.jInternalFrameDetalleFormZona.presupuestoventasSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormZona.presupuestoventasSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePresupuestoVentas(true);
			this.jInternalFrameDetalleFormZona.presupuestoventasSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePresupuestoVentas(ZonaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormZona.presupuestoventasSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
			this.jInternalFrameDetalleFormZona.presupuestoventasSessionBean.setlidZonaActual(this.idZonaActual);

			zonaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyZona(true);
			zonaSessionBean.setlIdZonaActualForeignKey(this.idZonaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionZonaParaPresupuestoVentasLineases() throws Exception {
		Boolean isPaginaPopupPresupuestoVentasLineas=false;

		try {

			if(this.zonaSessionBean==null) {
				this.zonaSessionBean=new ZonaSessionBean();
			}

			if(this.jInternalFrameDetalleFormZona.presupuestoventaslineasSessionBean==null) {
				this.jInternalFrameDetalleFormZona.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
			}

			this.jInternalFrameDetalleFormZona.presupuestoventaslineasSessionBean.setsPathNavegacionActual(zonaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPresupuestoVentasLineas=this.jInternalFrameDetalleFormZona.presupuestoventaslineasSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePresupuestoVentasLineas(true);
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePresupuestoVentasLineas(ZonaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
			this.jInternalFrameDetalleFormZona.presupuestoventaslineasSessionBean.setlidZonaActual(this.idZonaActual);

			zonaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyZona(true);
			zonaSessionBean.setlIdZonaActualForeignKey(this.idZonaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ZonaSessionBean zonaSessionBean=new ZonaSessionBean();
		
		if(this.zonaSessionBean==null) {
			this.zonaSessionBean=new ZonaSessionBean();
		}
		
		this.zonaSessionBean.setsUltimaBusquedaZona(this.getsAccionBusqueda());
		this.zonaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.zonaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			zonaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			zonaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			zonaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ZonaSessionBean zonaSessionBean=new ZonaSessionBean();
		
		if(this.zonaSessionBean==null) {
			this.zonaSessionBean=new ZonaSessionBean();
		}
		
		if(this.zonaSessionBean.getsUltimaBusquedaZona()!=null&&!this.zonaSessionBean.getsUltimaBusquedaZona().equals("")) {
			this.setsAccionBusqueda(zonaSessionBean.getsUltimaBusquedaZona());
			this.setiNumeroPaginacion(zonaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(zonaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(zonaSessionBean.getnombre());
				zonaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(zonaSessionBean.getid_empresa());
				zonaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(zonaSessionBean.getid_sucursal());
				zonaSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.zonaSessionBean.setsUltimaBusquedaZona("");
		this.zonaSessionBean.setiNumeroPaginacion(ZonaConstantesFunciones.INUMEROPAGINACION);
		this.zonaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaZona(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioZona() {
		this.updateBorderResaltarBusquedasFormularioZona();
		this.updateVisibilidadBusquedasFormularioZona();
		this.updateHabilitarBusquedasFormularioZona();
	}
	
	public void updateBorderResaltarBusquedasFormularioZona() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasZona.getComponents().length>0) {
	

		if(this.zonaConstantesFunciones.resaltarBusquedaPorNombreZona!=null) {
			index= this.jTabbedPaneBusquedasZona.indexOfComponent(this.jPanelBusquedaPorNombreZona);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasZona.getComponent(index);
				jPanel.setBorder(this.zonaConstantesFunciones.resaltarBusquedaPorNombreZona);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioZona() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasZona.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasZona.indexOfComponent(this.jPanelBusquedaPorNombreZona);
			jPanel=(JPanel)this.jTabbedPaneBusquedasZona.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.zonaConstantesFunciones.mostrarBusquedaPorNombreZona);
			if(!this.zonaConstantesFunciones.mostrarBusquedaPorNombreZona && index>-1) {
				this.jTabbedPaneBusquedasZona.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioZona() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasZona.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasZona.indexOfComponent(this.jPanelBusquedaPorNombreZona);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasZona.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.zonaConstantesFunciones.activarBusquedaPorNombreZona);
				this.jTabbedPaneBusquedasZona.setEnabledAt(index,this.zonaConstantesFunciones.activarBusquedaPorNombreZona);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaZona(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasZona.indexOfComponent(this.jPanelBusquedaPorNombreZona);

			this.jTabbedPaneBusquedasZona.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasZona.getComponent(index);

			this.zonaConstantesFunciones.setResaltarBusquedaPorNombreZona(resaltar);

			jPanel.setBorder(this.zonaConstantesFunciones.resaltarBusquedaPorNombreZona);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarZona.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioZona() throws Exception {

		if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioZona();
		this.updateVisibilidadResaltarControlesFormularioZona();
		this.updateHabilitarResaltarControlesFormularioZona();
		
	}
	
	public void updateBorderResaltarControlesFormularioZona() throws Exception {
		if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.zonaConstantesFunciones.resaltaridZona!=null && this.jInternalFrameDetalleFormZona!=null) {this.jInternalFrameDetalleFormZona.jLabelidZona.setBorder(this.zonaConstantesFunciones.resaltaridZona);}
		if(this.zonaConstantesFunciones.resaltarid_empresaZona!=null && this.jInternalFrameDetalleFormZona!=null) {this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.setBorder(this.zonaConstantesFunciones.resaltarid_empresaZona);}
		if(this.zonaConstantesFunciones.resaltarid_sucursalZona!=null && this.jInternalFrameDetalleFormZona!=null) {this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.setBorder(this.zonaConstantesFunciones.resaltarid_sucursalZona);}
		if(this.zonaConstantesFunciones.resaltarnombreZona!=null && this.jInternalFrameDetalleFormZona!=null) {this.jInternalFrameDetalleFormZona.jTextFieldnombreZona.setBorder(this.zonaConstantesFunciones.resaltarnombreZona);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioZona() throws Exception {		
		if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormZona!=null) {
	
		//this.jInternalFrameDetalleFormZona.jLabelidZona.setVisible(this.zonaConstantesFunciones.mostraridZona);
		this.jInternalFrameDetalleFormZona.jPanelidZona.setVisible(this.zonaConstantesFunciones.mostraridZona);
		//this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.setVisible(this.zonaConstantesFunciones.mostrarid_empresaZona);
		this.jInternalFrameDetalleFormZona.jPanelid_empresaZona.setVisible(this.zonaConstantesFunciones.mostrarid_empresaZona);
		//this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.setVisible(this.zonaConstantesFunciones.mostrarid_sucursalZona);
		this.jInternalFrameDetalleFormZona.jPanelid_sucursalZona.setVisible(this.zonaConstantesFunciones.mostrarid_sucursalZona);
		//this.jInternalFrameDetalleFormZona.jTextFieldnombreZona.setVisible(this.zonaConstantesFunciones.mostrarnombreZona);
		this.jInternalFrameDetalleFormZona.jPanelnombreZona.setVisible(this.zonaConstantesFunciones.mostrarnombreZona);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioZona() throws Exception {
		if(this.jInternalFrameDetalleFormZona==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormZona!=null) {
	
		this.jInternalFrameDetalleFormZona.jLabelidZona.setEnabled(this.zonaConstantesFunciones.activaridZona);
		this.jInternalFrameDetalleFormZona.jComboBoxid_empresaZona.setEnabled(this.zonaConstantesFunciones.activarid_empresaZona);
		this.jInternalFrameDetalleFormZona.jComboBoxid_sucursalZona.setEnabled(this.zonaConstantesFunciones.activarid_sucursalZona);
		this.jInternalFrameDetalleFormZona.jTextFieldnombreZona.setEnabled(this.zonaConstantesFunciones.activarnombreZona);
		}
	}
	
		
}