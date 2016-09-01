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

import com.bydan.erp.facturacion.util.VendedorZonaConstantesFunciones;
import com.bydan.erp.facturacion.util.VendedorZonaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.VendedorZonaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.VendedorZonaBean;
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
import com.bydan.erp.comisiones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VendedorZonaBeanSwingJInternalFrame extends VendedorZonaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VendedorZonaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VendedorZona> vendedorzonaValidator = new ClassValidator<VendedorZona>(VendedorZona.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VendedorZona vendedorzona;	
	public VendedorZona vendedorzonaAux;
	public VendedorZona vendedorzonaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VendedorZona vendedorzonaTotales;
	public Long idVendedorZonaActual;
	public Long iIdNuevoVendedorZona=0L;
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

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
	}

	public String sFinalQueryComboZona="";

	public List<Zona> zonasForeignKey;

	public List<Zona> getzonasForeignKey() {
		return zonasForeignKey;
	}

	public void setzonasForeignKey(List<Zona> zonasForeignKey) {
		this.zonasForeignKey = zonasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Zona zonaForeignKey;

	public Zona getzonaForeignKey() {
		return zonaForeignKey;
	}

	public void setzonaForeignKey(Zona zonaForeignKey) {
		this.zonaForeignKey = zonaForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idVendedorActual=0L;

	public Long getidVendedorActual() {
		return idVendedorActual;
	}

	public void setidVendedorActual(Long idVendedorActual) {
		this.idVendedorActual= idVendedorActual;
	}
	public Long idZonaActual=0L;

	public Long getidZonaActual() {
		return idZonaActual;
	}

	public void setidZonaActual(Long idZonaActual) {
		this.idZonaActual= idZonaActual;
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
	
	public Boolean isPermisoTodoVendedorZona;
	public Boolean isPermisoNuevoVendedorZona;
	public Boolean isPermisoActualizarVendedorZona;
	public Boolean isPermisoActualizarOriginalVendedorZona;
	public Boolean isPermisoEliminarVendedorZona;
	public Boolean isPermisoGuardarCambiosVendedorZona;
	public Boolean isPermisoConsultaVendedorZona;
	public Boolean isPermisoBusquedaVendedorZona;
	public Boolean isPermisoReporteVendedorZona;
	public Boolean isPermisoPaginacionMedioVendedorZona;
	public Boolean isPermisoPaginacionAltoVendedorZona;
	public Boolean isPermisoPaginacionTodoVendedorZona;
	public Boolean isPermisoCopiarVendedorZona;
	public Boolean isPermisoVerFormVendedorZona;
	public Boolean isPermisoDuplicarVendedorZona;
	public Boolean isPermisoOrdenVendedorZona;
	
	
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
	
	public VendedorZonaParameterReturnGeneral vendedorzonaReturnGeneral;
	public VendedorZonaParameterReturnGeneral vendedorzonaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVendedorZona=false;
	public Boolean esParaAccionDesdeFormularioVendedorZona=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VendedorZonaSessionBeanAdditional vendedorzonaSessionBeanAdditional=null;
	
	public VendedorZonaSessionBeanAdditional getVendedorZonaSessionBeanAdditional() {
		return this.vendedorzonaSessionBeanAdditional;
	}
	
	public void setVendedorZonaSessionBeanAdditional(VendedorZonaSessionBeanAdditional vendedorzonaSessionBeanAdditional) {
		try {
			this.vendedorzonaSessionBeanAdditional=vendedorzonaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VendedorZonaBeanSwingJInternalFrameAdditional vendedorzonaBeanSwingJInternalFrameAdditional=null;
	//public class VendedorZonaBeanSwingJInternalFrame
	
	public VendedorZonaBeanSwingJInternalFrameAdditional getVendedorZonaBeanSwingJInternalFrameAdditional() {
		return this.vendedorzonaBeanSwingJInternalFrameAdditional;
	}
	
	public void setVendedorZonaBeanSwingJInternalFrameAdditional(VendedorZonaBeanSwingJInternalFrameAdditional vendedorzonaBeanSwingJInternalFrameAdditional) {
		try {
			this.vendedorzonaBeanSwingJInternalFrameAdditional=vendedorzonaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VendedorZonaLogic vendedorzonaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VendedorZona vendedorzonaBean;
	public VendedorZonaConstantesFunciones vendedorzonaConstantesFunciones;
	//public VendedorZonaParameterReturnGeneral vendedorzonaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public VendedorLogic vendedorLogic;
	public ZonaLogic zonaLogic;
	
	//PARAMETROS
	
	
	//public List<VendedorZona> vendedorzonas;	
	//public List<VendedorZona> vendedorzonasEliminados;
	//public List<VendedorZona> vendedorzonasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVendedorZona=false;
	public Boolean isVisibilidadCeldaDuplicarVendedorZona=true;
	public Boolean isVisibilidadCeldaCopiarVendedorZona=true;
	public Boolean isVisibilidadCeldaVerFormVendedorZona=true;
	public Boolean isVisibilidadCeldaOrdenVendedorZona=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVendedorZona=false;
	public Boolean isVisibilidadCeldaModificarVendedorZona=false;
	public Boolean isVisibilidadCeldaActualizarVendedorZona=false;
	public Boolean isVisibilidadCeldaEliminarVendedorZona=false;
	public Boolean isVisibilidadCeldaCancelarVendedorZona=false;
	public Boolean isVisibilidadCeldaGuardarVendedorZona=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVendedorZona=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	public Boolean isVisibilidadFK_IdZona=false;
	
	public Long getiIdNuevoVendedorZona() {
		return this.iIdNuevoVendedorZona;
	}

	public void setiIdNuevoVendedorZona(Long iIdNuevoVendedorZona) {
		this.iIdNuevoVendedorZona = iIdNuevoVendedorZona;
	}
	
	public Long getidVendedorZonaActual() {
		return this.idVendedorZonaActual;
	}

	public void setidVendedorZonaActual(Long idVendedorZonaActual) {
		this.idVendedorZonaActual = idVendedorZonaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VendedorZona getvendedorzona() {
		return this.vendedorzona;
	}

	public void setvendedorzona(VendedorZona vendedorzona) {
		this.vendedorzona = vendedorzona;
	}
	
	public VendedorZona getvendedorzonaAux() {
		return this.vendedorzonaAux;
	}

	public void setvendedorzonaAux(VendedorZona vendedorzonaAux) {
		this.vendedorzonaAux = vendedorzonaAux;
	}				
	
	public VendedorZona getvendedorzonaAnterior() {
		return this.vendedorzonaAnterior;
	}

	public void setvendedorzonaAnterior(VendedorZona vendedorzonaAnterior) {
		this.vendedorzonaAnterior = vendedorzonaAnterior;
	}	
	
	public VendedorZona getvendedorzonaTotales() {
		return this.vendedorzonaTotales;
	}

	public void setvendedorzonaTotales(VendedorZona vendedorzonaTotales) {
		this.vendedorzonaTotales = vendedorzonaTotales;
	}	
	
	public VendedorZona getvendedorzonaBean() {
		return this.vendedorzonaBean;
	}

	public void setvendedorzonaBean(VendedorZona vendedorzonaBean) {
		this.vendedorzonaBean = vendedorzonaBean;
	}	
	
	public VendedorZonaParameterReturnGeneral getvendedorzonaReturnGeneral() {
		return this.vendedorzonaReturnGeneral;
	}

	public void setvendedorzonaReturnGeneral(VendedorZonaParameterReturnGeneral vendedorzonaReturnGeneral) {
		this.vendedorzonaReturnGeneral = vendedorzonaReturnGeneral;
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

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

	public Long id_zonaFK_IdZona=-1L;

	public Long getid_zonaFK_IdZona() {
		return this.id_zonaFK_IdZona;
	}

	public void setid_zonaFK_IdZona(Long id_zonaFK_IdZona) {
		this.id_zonaFK_IdZona = id_zonaFK_IdZona;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VendedorZonaLogic getVendedorZonaLogic()	{		
		return vendedorzonaLogic;
	}

	public void setVendedorZonaLogic(VendedorZonaLogic vendedorzonaLogic) {
		this.vendedorzonaLogic = vendedorzonaLogic;
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
	
	public Boolean getIsEsNuevoVendedorZona() {
		return isEsNuevoVendedorZona;
	}

	public void setIsEsNuevoVendedorZona(Boolean isEsNuevoVendedorZona) {
		this.isEsNuevoVendedorZona = isEsNuevoVendedorZona;
	}

	public Boolean getEsParaAccionDesdeFormularioVendedorZona() {
		return esParaAccionDesdeFormularioVendedorZona;
	}
	
	public void setEsParaAccionDesdeFormularioVendedorZona(Boolean esParaAccionDesdeFormularioVendedorZona) {
		this.esParaAccionDesdeFormularioVendedorZona = esParaAccionDesdeFormularioVendedorZona;
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

			if(this.vendedorzonaSessionBean==null) {
				this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
			}

			if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(vendedorzonaSessionBean.getlidEmpresaActual());
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

			if(this.vendedorzonaSessionBean==null) {
				this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
			}

			if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(vendedorzonaSessionBean.getlidSucursalActual());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.vendedorzonaSessionBean==null) {
				this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
			}

			if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(vendedorzonaSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
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

	public void cargarCombosZonasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.zonasForeignKey=new ArrayList<Zona>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ZonaLogic zonaLogic=new ZonaLogic();

			//zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

			if(this.vendedorzonaSessionBean==null) {
				this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
			}

			if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

					zonaLogic.getTodosZonasWithConnection(sFinalQuery,new Pagination());

					this.zonasForeignKey=zonaLogic.getZonas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaZona(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getEntityWithConnection(vendedorzonaSessionBean.getlidZonaActual());
					this.zonasForeignKey.add(zonaLogic.getZona());
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

					if(this.vendedorzona!=null) {
						this.vendedorzona.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorZona!=null) {
						this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVendedorZona.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVendedorZona!=null) {
						if(this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVendedorZonaGenerico)throws Exception
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
				jComboBoxid_empresaVendedorZonaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVendedorZonaGenerico!=null && jComboBoxid_empresaVendedorZonaGenerico.getItemCount()>0) {
					jComboBoxid_empresaVendedorZonaGenerico.setSelectedIndex(0);
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

					if(this.vendedorzona!=null) {
						this.vendedorzona.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorZona!=null) {
						this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalVendedorZona.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormVendedorZona!=null) {
						if(this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalVendedorZonaGenerico)throws Exception
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
				jComboBoxid_sucursalVendedorZonaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalVendedorZonaGenerico!=null && jComboBoxid_sucursalVendedorZonaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalVendedorZonaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.vendedorzona!=null) {
						this.vendedorzona.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorZona!=null) {
						this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorVendedorZona.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormVendedorZona!=null) {
						if(this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdVendedor") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorFK_IdVendedorVendedorZona!=null) {
						jComboBoxid_vendedorFK_IdVendedorVendedorZona.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorFK_IdVendedorVendedorZona!=null) {
							//jComboBoxid_vendedorFK_IdVendedorVendedorZona.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorFK_IdVendedorVendedorZona.getItemCount()>0) {
								jComboBoxid_vendedorFK_IdVendedorVendedorZona.setSelectedIndex(0);
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

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorVendedorZonaGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorVendedorZonaGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorVendedorZonaGenerico!=null && jComboBoxid_vendedorVendedorZonaGenerico.getItemCount()>0) {
					jComboBoxid_vendedorVendedorZonaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualZonaForeignKey(Long idZonaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(zonaTemp!=null) {

					if(this.vendedorzona!=null) {
						this.vendedorzona.setZona(zonaTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorZona!=null) {
						this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.setSelectedItem(zonaTemp);
					}
				} else {
					//jComboBoxid_zonaVendedorZona.setSelectedItem(zonaTemp);
					if(this.jInternalFrameDetalleFormVendedorZona!=null) {
						if(this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdZona") || sFormularioTipoBusqueda.equals("Todos")){
					if(zonaTemp!=null && jComboBoxid_zonaFK_IdZonaVendedorZona!=null) {
						jComboBoxid_zonaFK_IdZonaVendedorZona.setSelectedItem(zonaTemp);
					} else {
						if(jComboBoxid_zonaFK_IdZonaVendedorZona!=null) {
							//jComboBoxid_zonaFK_IdZonaVendedorZona.setSelectedItem(zonaTemp);
							if(jComboBoxid_zonaFK_IdZonaVendedorZona.getItemCount()>0) {
								jComboBoxid_zonaFK_IdZonaVendedorZona.setSelectedIndex(0);
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

	public String getActualZonaForeignKeyDescripcion(Long idZonaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}


			sDescripcion=ZonaConstantesFunciones.getZonaDescripcion(zonaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualZonaForeignKeyGenerico(Long idZonaSeleccionado,JComboBox jComboBoxid_zonaVendedorZonaGenerico)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(zonaTemp!=null) {
				jComboBoxid_zonaVendedorZonaGenerico.setSelectedItem(zonaTemp);
			} else {
				if(jComboBoxid_zonaVendedorZonaGenerico!=null && jComboBoxid_zonaVendedorZonaGenerico.getItemCount()>0) {
					jComboBoxid_zonaVendedorZonaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VendedorZona vendedorzona,JComboBox jComboBoxid_empresaVendedorZonaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVendedorZonaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVendedorZonaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				vendedorzona.setid_empresa(empresaAux.getId());
				vendedorzona.setempresa_descripcion(VendedorZonaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				vendedorzona.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(VendedorZona vendedorzona,JComboBox jComboBoxid_sucursalVendedorZonaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalVendedorZonaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalVendedorZonaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				vendedorzona.setid_sucursal(sucursalAux.getId());
				vendedorzona.setsucursal_descripcion(VendedorZonaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				vendedorzona.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(VendedorZona vendedorzona,JComboBox jComboBoxid_vendedorVendedorZonaGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorVendedorZonaGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorVendedorZonaGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				vendedorzona.setid_vendedor(vendedorAux.getId());
				vendedorzona.setvendedor_descripcion(VendedorZonaConstantesFunciones.getVendedorDescripcion(vendedorAux));
				vendedorzona.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarZonaForeignKey(VendedorZona vendedorzona,JComboBox jComboBoxid_zonaVendedorZonaGenerico)throws Exception
	{
		try
		{
			Zona  zonaAux=new Zona();

			if(jComboBoxid_zonaVendedorZonaGenerico==null) {
				zonaAux=(Zona)this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.getSelectedItem();
			} else {
				zonaAux=(Zona)jComboBoxid_zonaVendedorZonaGenerico.getSelectedItem();
			}

			if(zonaAux!=null && zonaAux.getId()!=null) {
				vendedorzona.setid_zona(zonaAux.getId());
				vendedorzona.setzona_descripcion(VendedorZonaConstantesFunciones.getZonaDescripcion(zonaAux));
				vendedorzona.setZona(zonaAux);			}
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

					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) { 
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorZona!=null) { 
					}

					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) { 
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorZona!=null) { 
					}

					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) { 
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorZona!=null) { 
					}

					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdVendedor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorFK_IdVendedorVendedorZona.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorFK_IdVendedorVendedorZona.addItem(vendedor);
							}
						}

						if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameZonasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingZona=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) { 
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.addItem(zona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorZona!=null) { 
					}

					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdZona") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_zonaFK_IdZonaVendedorZona.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jComboBoxid_zonaFK_IdZonaVendedorZona.addItem(zona);
							}
						}

						if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVendedorZona!=null) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVendedorZona!=null) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorFK_IdVendedorVendedorZona.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorFK_IdVendedorVendedorZona.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameZonaForeignKey(Zona zona,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.setSelectedItem(zona);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorZona!=null) {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_zonaFK_IdZonaVendedorZona.setSelectedItem(zona);
						} else {
							this.jComboBoxid_zonaFK_IdZonaVendedorZona.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVendedorZona() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VendedorZonaConstantesFunciones.refrescarForeignKeysDescripcionesVendedorZona(this.vendedorzonaLogic.getVendedorZonas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VendedorZonaConstantesFunciones.refrescarForeignKeysDescripcionesVendedorZona(this.vendedorzonas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Vendedor.class));
		classes.add(new Classe(Zona.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//vendedorzonaLogic.setVendedorZonas(this.vendedorzonas);
			vendedorzonaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public VendedorZonaParameterReturnGeneral getVendedorZonaParameterGeneral() {
		return this.vendedorzonaParameterGeneral;
	}
	
	public void setVendedorZonaParameterGeneral(VendedorZonaParameterReturnGeneral vendedorzonaParameterGeneral) {
		this.vendedorzonaParameterGeneral = vendedorzonaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVendedorZona() {
		return isPermisoTodoVendedorZona;
	}

	public void setIsPermisoTodoVendedorZona(Boolean isPermisoTodoVendedorZona) {
		this.isPermisoTodoVendedorZona = isPermisoTodoVendedorZona;
	}

	public Boolean getIsPermisoNuevoVendedorZona() {
		return isPermisoNuevoVendedorZona;
	}

	public void setIsPermisoNuevoVendedorZona(Boolean isPermisoNuevoVendedorZona) {
		this.isPermisoNuevoVendedorZona = isPermisoNuevoVendedorZona;
	}

	public Boolean getIsPermisoActualizarVendedorZona() {
		return isPermisoActualizarVendedorZona;
	}

	public void setIsPermisoActualizarVendedorZona(Boolean isPermisoActualizarVendedorZona) {
		this.isPermisoActualizarVendedorZona = isPermisoActualizarVendedorZona;
	}

	public Boolean getIsPermisoEliminarVendedorZona() {
		return isPermisoEliminarVendedorZona;
	}

	public void setIsPermisoEliminarVendedorZona(Boolean isPermisoEliminarVendedorZona) {
		this.isPermisoEliminarVendedorZona = isPermisoEliminarVendedorZona;
	}

	public Boolean getIsPermisoGuardarCambiosVendedorZona() {
		return isPermisoGuardarCambiosVendedorZona;
	}

	public void setIsPermisoGuardarCambiosVendedorZona(Boolean isPermisoGuardarCambiosVendedorZona) {
		this.isPermisoGuardarCambiosVendedorZona = isPermisoGuardarCambiosVendedorZona;
	}
	
	public Boolean getIsPermisoConsultaVendedorZona() {
		return isPermisoConsultaVendedorZona;
	}

	public void setIsPermisoConsultaVendedorZona(Boolean isPermisoConsultaVendedorZona) {
		this.isPermisoConsultaVendedorZona = isPermisoConsultaVendedorZona;
	}

	public Boolean getIsPermisoBusquedaVendedorZona() {
		return isPermisoBusquedaVendedorZona;
	}

	public void setIsPermisoBusquedaVendedorZona(Boolean isPermisoBusquedaVendedorZona) {
		this.isPermisoBusquedaVendedorZona = isPermisoBusquedaVendedorZona;
	}

	public Boolean getIsPermisoReporteVendedorZona() {
		return isPermisoReporteVendedorZona;
	}

	public void setIsPermisoReporteVendedorZona(Boolean isPermisoReporteVendedorZona) {
		this.isPermisoReporteVendedorZona = isPermisoReporteVendedorZona;
	}
	
	public Boolean getIsPermisoPaginacionMedioVendedorZona() {
		return isPermisoPaginacionMedioVendedorZona;
	}

	public void setIsPermisoPaginacionMedioVendedorZona(Boolean isPermisoPaginacionMedioVendedorZona) {
		this.isPermisoPaginacionMedioVendedorZona = isPermisoPaginacionMedioVendedorZona;
	}
	
	public Boolean getIsPermisoPaginacionTodoVendedorZona() {
		return isPermisoPaginacionTodoVendedorZona;
	}

	public void setIsPermisoPaginacionTodoVendedorZona(Boolean isPermisoPaginacionTodoVendedorZona) {
		this.isPermisoPaginacionTodoVendedorZona = isPermisoPaginacionTodoVendedorZona;
	}
	
	public Boolean getIsPermisoPaginacionAltoVendedorZona() {
		return isPermisoPaginacionAltoVendedorZona;
	}

	public void setIsPermisoPaginacionAltoVendedorZona(Boolean isPermisoPaginacionAltoVendedorZona) {
		this.isPermisoPaginacionAltoVendedorZona = isPermisoPaginacionAltoVendedorZona;
	}
	
	public Boolean getIsPermisoCopiarVendedorZona() {
		return isPermisoCopiarVendedorZona;
	}

	public void setIsPermisoCopiarVendedorZona(Boolean isPermisoCopiarVendedorZona) {
		this.isPermisoCopiarVendedorZona = isPermisoCopiarVendedorZona;
	}
	
	public Boolean getIsPermisoVerFormVendedorZona() {
		return isPermisoVerFormVendedorZona;
	}

	public void setIsPermisoVerFormVendedorZona(Boolean isPermisoVerFormVendedorZona) {
		this.isPermisoVerFormVendedorZona = isPermisoVerFormVendedorZona;
	}
	
	public Boolean getIsPermisoDuplicarVendedorZona() {
		return isPermisoDuplicarVendedorZona;
	}

	public void setIsPermisoDuplicarVendedorZona(Boolean isPermisoDuplicarVendedorZona) {
		this.isPermisoDuplicarVendedorZona = isPermisoDuplicarVendedorZona;
	}
	
	public Boolean getIsPermisoOrdenVendedorZona() {
		return isPermisoOrdenVendedorZona;
	}

	public void setIsPermisoOrdenVendedorZona(Boolean isPermisoOrdenVendedorZona) {
		this.isPermisoOrdenVendedorZona = isPermisoOrdenVendedorZona;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVendedorZona() {
		return isVisibilidadCeldaNuevoVendedorZona;
	}

	public void setIsVisibilidadCeldaNuevoVendedorZona(Boolean isVisibilidadCeldaNuevoVendedorZona) {
		this.isVisibilidadCeldaNuevoVendedorZona = isVisibilidadCeldaNuevoVendedorZona;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVendedorZona() {
		return isVisibilidadCeldaDuplicarVendedorZona;
	}

	public void setIsVisibilidadCeldaDuplicarVendedorZona(Boolean isVisibilidadCeldaDuplicarVendedorZona) {
		this.isVisibilidadCeldaDuplicarVendedorZona = isVisibilidadCeldaDuplicarVendedorZona;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVendedorZona() {
		return isVisibilidadCeldaCopiarVendedorZona;
	}

	public void setIsVisibilidadCeldaCopiarVendedorZona(Boolean isVisibilidadCeldaCopiarVendedorZona) {
		this.isVisibilidadCeldaCopiarVendedorZona = isVisibilidadCeldaCopiarVendedorZona;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVendedorZona() {
		return isVisibilidadCeldaVerFormVendedorZona;
	}

	public void setIsVisibilidadCeldaVerFormVendedorZona(Boolean isVisibilidadCeldaVerFormVendedorZona) {
		this.isVisibilidadCeldaVerFormVendedorZona = isVisibilidadCeldaVerFormVendedorZona;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVendedorZona() {
		return isVisibilidadCeldaOrdenVendedorZona;
	}

	public void setIsVisibilidadCeldaOrdenVendedorZona(Boolean isVisibilidadCeldaOrdenVendedorZona) {
		this.isVisibilidadCeldaOrdenVendedorZona = isVisibilidadCeldaOrdenVendedorZona;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVendedorZona() {
		return isVisibilidadCeldaNuevoRelacionesVendedorZona;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVendedorZona(Boolean isVisibilidadCeldaNuevoRelacionesVendedorZona) {
		this.isVisibilidadCeldaNuevoRelacionesVendedorZona = isVisibilidadCeldaNuevoRelacionesVendedorZona;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVendedorZona() {
		return isVisibilidadCeldaModificarVendedorZona;
	}

	public void setIsVisibilidadCeldaModificarVendedorZona(Boolean isVisibilidadCeldaModificarVendedorZona) {
		this.isVisibilidadCeldaModificarVendedorZona = isVisibilidadCeldaModificarVendedorZona;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVendedorZona() {
		return isVisibilidadCeldaActualizarVendedorZona;
	}

	public void setIsVisibilidadCeldaActualizarVendedorZona(Boolean isVisibilidadCeldaActualizarVendedorZona) {
		this.isVisibilidadCeldaActualizarVendedorZona = isVisibilidadCeldaActualizarVendedorZona;
	}

	public Boolean getIsVisibilidadCeldaEliminarVendedorZona() {
		return isVisibilidadCeldaEliminarVendedorZona;
	}

	public void setIsVisibilidadCeldaEliminarVendedorZona(Boolean isVisibilidadCeldaEliminarVendedorZona) {
		this.isVisibilidadCeldaEliminarVendedorZona = isVisibilidadCeldaEliminarVendedorZona;
	}

	public Boolean getIsVisibilidadCeldaCancelarVendedorZona() {
		return isVisibilidadCeldaCancelarVendedorZona;
	}

	public void setIsVisibilidadCeldaCancelarVendedorZona(Boolean isVisibilidadCeldaCancelarVendedorZona) {
		this.isVisibilidadCeldaCancelarVendedorZona = isVisibilidadCeldaCancelarVendedorZona;
	}

	public Boolean getIsVisibilidadCeldaGuardarVendedorZona() {
		return isVisibilidadCeldaGuardarVendedorZona;
	}

	public void setIsVisibilidadCeldaGuardarVendedorZona(Boolean isVisibilidadCeldaGuardarVendedorZona) {
		this.isVisibilidadCeldaGuardarVendedorZona = isVisibilidadCeldaGuardarVendedorZona;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVendedorZona() {
		return isVisibilidadCeldaGuardarCambiosVendedorZona;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVendedorZona(Boolean isVisibilidadCeldaGuardarCambiosVendedorZona) {
		this.isVisibilidadCeldaGuardarCambiosVendedorZona = isVisibilidadCeldaGuardarCambiosVendedorZona;
	}
		
	public VendedorZonaSessionBean getvendedorzonaSessionBean() {
		return this.vendedorzonaSessionBean;
	}
	
	public void setvendedorzonaSessionBean(VendedorZonaSessionBean vendedorzonaSessionBean) {
		this.vendedorzonaSessionBean=vendedorzonaSessionBean;
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

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	public Boolean getisVisibilidadFK_IdZona() {
		return this.isVisibilidadFK_IdZona;
	}

	public void setisVisibilidadFK_IdZona(Boolean isVisibilidadFK_IdZona) {
		this.isVisibilidadFK_IdZona=isVisibilidadFK_IdZona;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVendedorZona(VendedorZona vendedorzona)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(vendedorzona,null);
				this.setActualParaGuardarSucursalForeignKey(vendedorzona,null);
				this.setActualParaGuardarVendedorForeignKey(vendedorzona,null);
				this.setActualParaGuardarZonaForeignKey(vendedorzona,null);
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
	
	public void bugActualizarReferenciaActual(VendedorZona vendedorzona,VendedorZona vendedorzonaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVendedorZona(vendedorzona);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		vendedorzonaAux.setId(vendedorzona.getId());
		vendedorzonaAux.setVersionRow(vendedorzona.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVendedorZona();
		
			int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = vendedorzonaValidator.getInvalidValues(this.vendedorzona);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			vendedorzonaLogic.setDatosCliente(datosCliente);
			vendedorzonaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				vendedorzonaAux=new  VendedorZona();
				
				vendedorzonaAux.setIsNew(true);
				vendedorzonaAux.setIsChanged(true);
				
				vendedorzonaAux.setVendedorZonaOriginal(this.vendedorzona);
				
				vendedorzonaAux.setId(this.vendedorzona.getId());	
				vendedorzonaAux.setVersionRow(this.vendedorzona.getVersionRow());	
				vendedorzonaAux.setid_empresa(this.vendedorzona.getid_empresa());	
				vendedorzonaAux.setid_sucursal(this.vendedorzona.getid_sucursal());	
				vendedorzonaAux.setid_vendedor(this.vendedorzona.getid_vendedor());	
				vendedorzonaAux.setid_zona(this.vendedorzona.getid_zona());	
				vendedorzonaAux.setobservacion(this.vendedorzona.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vendedorzonaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(vendedorzonaAux,vendedorzonaLogic.getVendedorZonas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vendedorzonaAux,vendedorzonas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vendedorzonaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonaLogic.saveVendedorZonas();//WithConnection
						//vendedorzonaLogic.getSetVersionRowVendedorZonas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vendedorzona,vendedorzonaAux);
					
					this.refrescarForeignKeysDescripcionesVendedorZona();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vendedorzonaLogic.saveVendedorZonaRelaciones(vendedorzonaAux);//WithConnection
								//vendedorzonaLogic.getSetVersionRowVendedorZonas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vendedorzona,vendedorzonaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vendedorzonaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vendedorzonaAux,vendedorzonaLogic.getVendedorZonas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vendedorzonaAux,vendedorzonas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vendedorzona,vendedorzonaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				vendedorzonaAux=new  VendedorZona();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado() 
					|| (this.vendedorzonaSessionBean.getEsGuardarRelacionado() && this.vendedorzona.getId()>=0)) {
						
					vendedorzonaAux.setIsNew(false);
				}
				
				vendedorzonaAux.setIsDeleted(false);
			
				vendedorzonaAux.setId(this.vendedorzona.getId());	
				vendedorzonaAux.setVersionRow(this.vendedorzona.getVersionRow());	
				vendedorzonaAux.setid_empresa(this.vendedorzona.getid_empresa());	
				vendedorzonaAux.setid_sucursal(this.vendedorzona.getid_sucursal());	
				vendedorzonaAux.setid_vendedor(this.vendedorzona.getid_vendedor());	
				vendedorzonaAux.setid_zona(this.vendedorzona.getid_zona());	
				vendedorzonaAux.setobservacion(this.vendedorzona.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vendedorzonaAux,vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vendedorzonaAux,vendedorzonas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vendedorzonaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonaLogic.saveVendedorZonas();//WithConnection
						//vendedorzonaLogic.getSetVersionRowVendedorZonas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vendedorzona,vendedorzonaAux);
					
					this.refrescarForeignKeysDescripcionesVendedorZona();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vendedorzonaLogic.saveVendedorZonaRelaciones(vendedorzonaAux);//WithConnection
								//vendedorzonaLogic.getSetVersionRowVendedorZonas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vendedorzona,vendedorzonaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vendedorzonaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vendedorzonaAux,vendedorzonaLogic.getVendedorZonas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vendedorzonaAux,vendedorzonas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vendedorzona,vendedorzonaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				vendedorzonaAux=new  VendedorZona();
				
				vendedorzonaAux.setIsNew(false);
				vendedorzonaAux.setIsChanged(false);
				
				vendedorzonaAux.setIsDeleted(true);
				
				vendedorzonaAux.setId(this.vendedorzona.getId());	
				vendedorzonaAux.setVersionRow(this.vendedorzona.getVersionRow());	
				vendedorzonaAux.setid_empresa(this.vendedorzona.getid_empresa());	
				vendedorzonaAux.setid_sucursal(this.vendedorzona.getid_sucursal());	
				vendedorzonaAux.setid_vendedor(this.vendedorzona.getid_vendedor());	
				vendedorzonaAux.setid_zona(this.vendedorzona.getid_zona());	
				vendedorzonaAux.setobservacion(this.vendedorzona.getobservacion());	
				
				if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.vendedorzonaAux.getId()>=0) {	
						this.vendedorzonasEliminados.add(vendedorzonaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(vendedorzonaAux,vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vendedorzonaAux,vendedorzonas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vendedorzonaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonaLogic.saveVendedorZonas();//WithConnection
						//vendedorzonaLogic.getSetVersionRowVendedorZonas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vendedorzonaLogic.saveVendedorZonaRelaciones(vendedorzonaAux);//WithConnection
								//vendedorzonaLogic.getSetVersionRowVendedorZonas();//WithConnection
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
							if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.vendedorzonaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(vendedorzonaAux,vendedorzonaLogic.getVendedorZonas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(vendedorzonaAux,vendedorzonas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.getVendedorZonas().addAll(this.vendedorzonasEliminados);
					
					vendedorzonaLogic.saveVendedorZonas();//WithConnection
					//vendedorzonaLogic.getSetVersionRowVendedorZonas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVendedorZona();
				
				this.vendedorzonasEliminados= new ArrayList<VendedorZona>();		
			}
			
			if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Vendedor Zona GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.vendedorzona=vendedorzonaAux;
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
      		//this.finishProcessVendedorZona();
      	}
		
	}	
	
	public void actualizarRelaciones(VendedorZona vendedorzonaLocal) throws Exception {
		
		if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VendedorZona vendedorzonaLocal) throws Exception {	
		if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				vendedorzonaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				vendedorzonaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				vendedorzonaLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ZonaDetalleFormJInternalFrame.class)) {
				ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrameLocal=(ZonaBeanSwingJInternalFrame) ((ZonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				zonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoZona(zonaBeanSwingJInternalFrameLocal.getzona(),true);
				zonaBeanSwingJInternalFrameLocal.actualizarLista(zonaBeanSwingJInternalFrameLocal.zona,this.zonasForeignKey);

				zonaBeanSwingJInternalFrameLocal.actualizarRelaciones(zonaBeanSwingJInternalFrameLocal.zona);

				vendedorzonaLocal.setZona(zonaBeanSwingJInternalFrameLocal.zona);

				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey("Formulario");
				this.setActualZonaForeignKey(zonaBeanSwingJInternalFrameLocal.zona.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVendedorZonaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = vendedorzonaValidator.getInvalidValues(this.vendedorzona);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VendedorZona vendedorzona,List<VendedorZona> vendedorzonas) throws Exception {
		try	{		
			VendedorZonaConstantesFunciones.actualizarLista(vendedorzona,vendedorzonas,this.vendedorzonaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(VendedorZona vendedorzona,List<VendedorZona> vendedorzonas) throws Exception {
		try	{			
			VendedorZonaConstantesFunciones.actualizarSelectedLista(vendedorzona,vendedorzonas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VendedorZona> vendedorzonasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				vendedorzonasLocal=this.vendedorzonaLogic.getVendedorZonas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				vendedorzonasLocal=this.vendedorzonas;
			}
			//ARCHITECTURE
		
			for(VendedorZona vendedorzonaLocal:vendedorzonasLocal) {
				if(this.permiteMantenimiento(vendedorzonaLocal) && vendedorzonaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VendedorZonaConstantesFunciones.getVendedorZonaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VendedorZonaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorZona.jLabelid_empresaVendedorZona,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorZonaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorZona.jLabelid_sucursalVendedorZona,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorZonaConstantesFunciones.IDVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorZona.jLabelid_vendedorVendedorZona,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorZonaConstantesFunciones.IDZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorZona.jLabelid_zonaVendedorZona,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorZonaConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorZona.jLabelobservacionVendedorZona,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorZona.jLabelid_empresaVendedorZona,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorZona.jLabelid_sucursalVendedorZona,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorZona.jLabelid_vendedorVendedorZona,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorZona.jLabelid_zonaVendedorZona,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorZona.jLabelobservacionVendedorZona,"");
		
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
		this.iIdNuevoVendedorZona--;	
		
		
		this.vendedorzonaAux=new VendedorZona();
		
		this.vendedorzonaAux.setId(this.iIdNuevoVendedorZona);
		this.vendedorzonaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vendedorzonaLogic.getVendedorZonas().add(this.vendedorzonaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.vendedorzonas.add(this.vendedorzonaAux);
		}
		//ARCHITECTURE
		
		this.vendedorzona=this.vendedorzonaAux;
		
		if(VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVendedorZona(this.vendedorzona);
			this.setVariablesObjetoActualToFormularioForeignKeyVendedorZona(this.vendedorzona);
		}
				
		//this.setDefaultControlesVendedorZona();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVendedorZona();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVendedorZona();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVendedorZona();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVendedorZona(this.vendedorzonaBean,this.vendedorzona,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VendedorZonaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {
			classes=VendedorZonaConstantesFunciones.getClassesRelationshipsOfVendedorZona(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.vendedorzonaReturnGeneral=vendedorzonaLogic.procesarEventosVendedorZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vendedorzonaLogic.getVendedorZonas(),this.vendedorzona,this.vendedorzonaParameterGeneral,this.isEsNuevoVendedorZona,classes);//this.vendedorzonaLogic.getVendedorZona()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVendedorZona(this.vendedorzonaReturnGeneral,this.vendedorzonaBean,false);
		
		if(this.vendedorzonaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVendedorZona(this.vendedorzonaReturnGeneral.getVendedorZona());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVendedorZona(this.vendedorzonaReturnGeneral.getVendedorZona());
		}
		
		if(this.vendedorzonaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVendedorZona(this.vendedorzonaReturnGeneral.getVendedorZona(),classes);//this.vendedorzonaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVendedorZona();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVendedorZona();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VendedorZonaBeanSwingJInternalFrameAdditional.RecargarFormVendedorZona(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVendedorZona(false);
						
			if(vendedorzonaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVendedorZona();
			}
			
			this.actualizarVisualTableDatosVendedorZona();
			
			this.jTableDatosVendedorZona.setRowSelectionInterval(this.getIndiceNuevoVendedorZona(), this.getIndiceNuevoVendedorZona());
			
			this.seleccionarFilaTablaVendedorZonaActual();
						
			this.actualizarEstadoCeldasBotonesVendedorZona("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVendedorZona(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVendedorZona.jTextAreaobservacionVendedorZona.setEnabled(isHabilitar && this.vendedorzonaConstantesFunciones.activarobservacionVendedorZona);	
		//
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.setEnabled(isHabilitar && this.vendedorzonaConstantesFunciones.activarid_empresaVendedorZona);//
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.setEnabled(isHabilitar && this.vendedorzonaConstantesFunciones.activarid_sucursalVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.setEnabled(isHabilitar && this.vendedorzonaConstantesFunciones.activarid_vendedorVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.setEnabled(isHabilitar && this.vendedorzonaConstantesFunciones.activarid_zonaVendedorZona);
	};
	
	public void setDefaultControlesVendedorZona() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVendedorZona(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.vendedorzonaSessionBean.setConGuardarRelaciones(true);			
			this.vendedorzonaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVendedorZona.jTabbedPaneRelacionesVendedorZona.setVisible(true);
			
					
		} else {
			//this.vendedorzonaSessionBean.setConGuardarRelaciones(false);			
			this.vendedorzonaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVendedorZona.jTabbedPaneRelacionesVendedorZona.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVendedorZona() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorZona vendedorzonaAux:this.vendedorzonaLogic.getVendedorZonas()) {
				if(vendedorzonaAux.getId().equals(this.iIdNuevoVendedorZona)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorZona vendedorzonaAux:this.vendedorzonas) {
				if(vendedorzonaAux.getId().equals(this.iIdNuevoVendedorZona)) {
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
	
	public int getIndiceActualVendedorZona(VendedorZona vendedorzona,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorZona vendedorzonaAux:this.vendedorzonaLogic.getVendedorZonas()) {
				if(vendedorzonaAux.getId().equals(vendedorzona.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorZona vendedorzonaAux:this.vendedorzonas) {
				if(vendedorzonaAux.getId().equals(vendedorzona.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVendedorZona(VendedorZona vendedorzonaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorZona vendedorzonaAux:this.vendedorzonaLogic.getVendedorZonas()) {
				if(vendedorzonaAux.getVendedorZonaOriginal().getId().equals(vendedorzonaOriginal.getId())) {
					existe=true;
					vendedorzonaOriginal.setId(vendedorzonaAux.getId());
					vendedorzonaOriginal.setVersionRow(vendedorzonaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorZona vendedorzonaAux:this.vendedorzonas) {
				if(vendedorzonaAux.getVendedorZonaOriginal().getId().equals(vendedorzonaOriginal.getId())) {
					existe=true;
					vendedorzonaOriginal.setId(vendedorzonaAux.getId());
					vendedorzonaOriginal.setVersionRow(vendedorzonaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVendedorZona(Boolean esParaCancelar) throws Exception {
		vendedorzonasAux=new ArrayList<VendedorZona>();
		vendedorzonaAux=new VendedorZona();
		
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VendedorZona vendedorzonaAux:this.vendedorzonaLogic.getVendedorZonas()) {
					if(vendedorzonaAux.getId()<0) {
						vendedorzonasAux.add(vendedorzonaAux);
					}		
				}
				this.iIdNuevoVendedorZona=0L;
				this.vendedorzonaLogic.getVendedorZonas().removeAll(vendedorzonasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VendedorZona vendedorzonaAux:this.vendedorzonas) {
					if(vendedorzonaAux.getId()<0) {
						vendedorzonasAux.add(vendedorzonaAux);
					}		
				}
				this.iIdNuevoVendedorZona=0L;
				this.vendedorzonas.removeAll(vendedorzonasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVendedorZona 
					&& this.vendedorzonaLogic.getVendedorZonas().size()>0
					) {
					vendedorzonaAux=this.vendedorzonaLogic.getVendedorZonas().get(this.vendedorzonaLogic.getVendedorZonas().size() - 1);
				
					if(vendedorzonaAux.getId()<0) {
						this.vendedorzonaLogic.getVendedorZonas().remove(vendedorzonaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVendedorZona && this.vendedorzonas.size()>0) {
					vendedorzonaAux=this.vendedorzonas.get(this.vendedorzonas.size() - 1);
				
					if(vendedorzonaAux.getId()<0) {
						this.vendedorzonas.remove(vendedorzonaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVendedorZona(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(vendedorzona.getId()<0) {
				this.vendedorzonaLogic.getVendedorZonas().remove(this.vendedorzona);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(vendedorzona.getId()<0) {
				this.vendedorzonas.remove(this.vendedorzona);
			}
		}			
	}
	
	public void setEstadosInicialesVendedorZona(List<VendedorZona> vendedorzonasAux) throws Exception {
		VendedorZonaConstantesFunciones.setEstadosInicialesVendedorZona(vendedorzonasAux);
	}
	
	public void setEstadosInicialesVendedorZona(VendedorZona vendedorzonaAux) throws Exception {
		VendedorZonaConstantesFunciones.setEstadosInicialesVendedorZona(vendedorzonaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVendedorZonaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVendedorZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVendedorZonaActual()) {
				if(!this.isEsNuevoVendedorZona) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVendedorZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVendedorZona=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVendedorZonaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Vendedor Zona ?", "MANTENIMIENTO DE Vendedor Zona", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVendedorZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VendedorZona vendedorzona) throws Exception {
		VendedorZonaConstantesFunciones.seleccionarAsignar(this.vendedorzona,vendedorzona);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVendedorZona=this.isPermisoActualizarOriginalVendedorZona;
			
			
			this.seleccionarAsignar(vendedorzona);
			
			

			idVendedorActual=vendedorzona.getid_vendedor();
			this.seleccionarVendedorActual();

			idZonaActual=vendedorzona.getid_zona();
			this.seleccionarZonaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VendedorZonaConstantesFunciones.quitarEspaciosVendedorZona(this.vendedorzona,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVendedorZona("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.vendedorzonaSessionBean.setsFuncionBusquedaRapida(this.vendedorzonaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarVendedorActual() throws Exception {
		try	{
			Vendedor vendedorAux=new Vendedor();

			if(this.idVendedorActual != null && this.idVendedorActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(this.idVendedorActual);
					vendedorAux= vendedorLogic.getVendedor();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				vendedorsForeignKey=new ArrayList<Vendedor>();
				vendedorsForeignKey.add(vendedorAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarZonaActual() throws Exception {
		try	{
			Zona zonaAux=new Zona();

			if(this.idZonaActual != null && this.idZonaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getEntityWithConnection(this.idZonaActual);
					zonaAux= zonaLogic.getZona();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				zonasForeignKey=new ArrayList<Zona>();
				zonasForeignKey.add(zonaAux);
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
			if(this.isEsNuevoVendedorZona) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVendedorZona(esParaCancelar);				
				this.cancelarNuevoVendedorZona(esParaCancelar);								
			}
			
			this.vendedorzona=new VendedorZona();
			
			this.inicializarVendedorZona();
			
			this.actualizarEstadoCeldasBotonesVendedorZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVendedorZona() throws Exception {
		try {
			VendedorZonaConstantesFunciones.inicializarVendedorZona(this.vendedorzona);
			
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
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.vendedorzonaLogic.getVendedorZonas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVendedorZonas(String sAccionBusqueda,List<VendedorZona> vendedorzonasParaReportes) throws Exception {
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
					sPathReporteFinal="VendedorZona"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VendedorZonaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VendedorZonaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VendedorZona"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Vendedor Zonas");		
		parameters.put("busquedapor", VendedorZonaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVendedorZona=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VendedorZonaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VendedorZonaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVendedorZona=new JRBeanArrayDataSource(VendedorZonaJInternalFrame.TraerVendedorZonaBeans(vendedorzonasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVendedorZona);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VendedorZonaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VendedorZonaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VendedorZonaBean.TraerVendedorZonaBeans(vendedorzonasParaReportes).toArray()));
							
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
				this.generarExcelReporteVendedorZonas(sAccionBusqueda,sTipoArchivoReporte,vendedorzonasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVendedorZonas(sAccionBusqueda,sTipoArchivoReporte,vendedorzonasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVendedorZonaActionPerformed(null);
					//this.generarExcelReporteVendedorZonas(sAccionBusqueda,sTipoArchivoReporte,vendedorzonasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVendedorZonas(sAccionBusqueda,sTipoArchivoReporte,vendedorzonasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVendedorZonas(sAccionBusqueda,sTipoArchivoReporte,vendedorzonasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVendedorZonas(sAccionBusqueda,sTipoArchivoReporte,vendedorzonasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVendedorZonas(String sAccionBusqueda,String sTipoArchivoReporte,List<VendedorZona> vendedorzonasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorzona";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VendedorZonas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVendedorZona("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VendedorZona vendedorzona : vendedorzonasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VendedorZonaConstantesFunciones.generarExcelReporteDataVendedorZona("NORMAL",row,workbook,vendedorzona,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVendedorZona(String sTipo,Row row,Workbook workbook) {
		
		VendedorZonaConstantesFunciones.generarExcelReporteHeaderVendedorZona(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVendedorZonas(String sAccionBusqueda,String sTipoArchivoReporte,List<VendedorZona> vendedorzonasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorzona_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VendedorZonas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VendedorZona vendedorzona : vendedorzonasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VendedorZonaConstantesFunciones.getVendedorZonaDescripcion(vendedorzona));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorZonaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorzona.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorzona.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorzona.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorZonaConstantesFunciones.LABEL_IDZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorzona.getzona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorZonaConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorzona.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVendedorZonas(String sAccionBusqueda,String sTipoArchivoReporte,List<VendedorZona> vendedorzonasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VendedorZona> vendedorzonasRespaldo=null;
		
		classes=VendedorZonaConstantesFunciones.getClassesRelationshipsOfVendedorZona(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.vendedorzonaLogic.setDatosCliente(this.datosCliente);
		this.vendedorzonaLogic.setDatosDeep(this.datosDeep);
		this.vendedorzonaLogic.setIsConDeep(true);
		
		vendedorzonasRespaldo=this.vendedorzonaLogic.getVendedorZonas();
		
		this.vendedorzonaLogic.setVendedorZonas(vendedorzonasParaReportes);	
		this.vendedorzonaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		vendedorzonasParaReportes=this.vendedorzonaLogic.getVendedorZonas();
		this.vendedorzonaLogic.setVendedorZonas(vendedorzonasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorzona_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VendedorZonas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVendedorZona("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VendedorZona vendedorzona : vendedorzonasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVendedorZona("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VendedorZonaConstantesFunciones.generarExcelReporteDataVendedorZona("NORMAL",row,workbook,vendedorzona,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VendedorZonaConstantesFunciones.getVendedorZonaDescripcion(vendedorzona));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVendedorZona.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVendedorZona() throws Exception {		
		this.startProcessVendedorZona(true);
	}
	
	public void startProcessVendedorZona(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVendedorZona ,this.jPanelParametrosReportesVendedorZona, this.jScrollPanelDatosVendedorZona,this.jPanelPaginacionVendedorZona, this.jScrollPanelDatosEdicionVendedorZona, this.jPanelAccionesVendedorZona,this.jPanelAccionesFormularioVendedorZona,this.jmenuBarVendedorZona,this.jmenuBarDetalleVendedorZona,this.jTtoolBarVendedorZona,this.jTtoolBarDetalleVendedorZona);		
		
		final JTabbedPane jTabbedPaneBusquedasVendedorZona=this.jTabbedPaneBusquedasVendedorZona; 
		
		final JPanel jPanelParametrosReportesVendedorZona=this.jPanelParametrosReportesVendedorZona;
		//final JScrollPane jScrollPanelDatosVendedorZona=this.jScrollPanelDatosVendedorZona;
		final JTable jTableDatosVendedorZona=this.jTableDatosVendedorZona;		
		final JPanel jPanelPaginacionVendedorZona=this.jPanelPaginacionVendedorZona;
		//final JScrollPane jScrollPanelDatosEdicionVendedorZona=this.jScrollPanelDatosEdicionVendedorZona;
		final JPanel jPanelAccionesVendedorZona=this.jPanelAccionesVendedorZona;
		
		JPanel jPanelCamposAuxiliarVendedorZona=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVendedorZona=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			jPanelCamposAuxiliarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jPanelCamposVendedorZona;
			jPanelAccionesFormularioAuxiliarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jPanelAccionesFormularioVendedorZona;
		}
		
		final JPanel jPanelCamposVendedorZona=jPanelCamposAuxiliarVendedorZona;
		final JPanel jPanelAccionesFormularioVendedorZona=jPanelAccionesFormularioAuxiliarVendedorZona;
		
		
		final JMenuBar jmenuBarVendedorZona=this.jmenuBarVendedorZona;
		final JToolBar jTtoolBarVendedorZona=this.jTtoolBarVendedorZona;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVendedorZona=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVendedorZona=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			jmenuBarDetalleAuxiliarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jmenuBarDetalleVendedorZona;
			jTtoolBarDetalleAuxiliarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jTtoolBarDetalleVendedorZona;
		}
		
		final JMenuBar jmenuBarDetalleVendedorZona=jmenuBarDetalleAuxiliarVendedorZona;
		final JToolBar jTtoolBarDetalleVendedorZona=jTtoolBarDetalleAuxiliarVendedorZona;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVendedorZona;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVendedorZona;
			processRunnable.jTableDatos=jTableDatosVendedorZona;
			processRunnable.jPanelCampos=jPanelCamposVendedorZona;
			processRunnable.jPanelPaginacion=jPanelPaginacionVendedorZona;
			processRunnable.jPanelAcciones=jPanelAccionesVendedorZona;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVendedorZona;
			
			
			processRunnable.jmenuBar=jmenuBarVendedorZona;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVendedorZona;
			processRunnable.jTtoolBar=jTtoolBarVendedorZona;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVendedorZona;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVendedorZona ,jPanelParametrosReportesVendedorZona,jTableDatosVendedorZona, /*jScrollPanelDatosVendedorZona,*/jPanelCamposVendedorZona,jPanelPaginacionVendedorZona, /*jScrollPanelDatosEdicionVendedorZona,*/ jPanelAccionesVendedorZona,jPanelAccionesFormularioVendedorZona,jmenuBarVendedorZona,jmenuBarDetalleVendedorZona,jTtoolBarVendedorZona,jTtoolBarDetalleVendedorZona);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVendedorZona ,jPanelParametrosReportesVendedorZona, jScrollPanelDatosVendedorZona,jPanelPaginacionVendedorZona, jScrollPanelDatosEdicionVendedorZona, jPanelAccionesVendedorZona,jPanelAccionesFormularioVendedorZona,jmenuBarVendedorZona,jmenuBarDetalleVendedorZona,jTtoolBarVendedorZona,jTtoolBarDetalleVendedorZona);
						
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
	
	public void finishProcessVendedorZona() {// throws Exception 
		this.finishProcessVendedorZona(true);
	}
	
	public void finishProcessVendedorZona(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVendedorZona ,this.jPanelParametrosReportesVendedorZona, this.jScrollPanelDatosVendedorZona,this.jPanelPaginacionVendedorZona, this.jScrollPanelDatosEdicionVendedorZona, this.jPanelAccionesVendedorZona,this.jPanelAccionesFormularioVendedorZona,this.jmenuBarVendedorZona,this.jmenuBarDetalleVendedorZona,this.jTtoolBarVendedorZona,this.jTtoolBarDetalleVendedorZona);		
		
		final JTabbedPane jTabbedPaneBusquedasVendedorZona=this.jTabbedPaneBusquedasVendedorZona; 
		
		final JPanel jPanelParametrosReportesVendedorZona=this.jPanelParametrosReportesVendedorZona;
		//final JScrollPane jScrollPanelDatosVendedorZona=this.jScrollPanelDatosVendedorZona;
		final JTable jTableDatosVendedorZona=this.jTableDatosVendedorZona;		
		final JPanel jPanelPaginacionVendedorZona=this.jPanelPaginacionVendedorZona;
		//final JScrollPane jScrollPanelDatosEdicionVendedorZona=this.jScrollPanelDatosEdicionVendedorZona;
		final JPanel jPanelAccionesVendedorZona=this.jPanelAccionesVendedorZona;
		
		JPanel jPanelCamposAuxiliarVendedorZona=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVendedorZona=new JPanel();
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			jPanelCamposAuxiliarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jPanelCamposVendedorZona;
			jPanelAccionesFormularioAuxiliarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jPanelAccionesFormularioVendedorZona;
		}
		
		final JPanel jPanelCamposVendedorZona=jPanelCamposAuxiliarVendedorZona;
		final JPanel jPanelAccionesFormularioVendedorZona=jPanelAccionesFormularioAuxiliarVendedorZona;
		
		
		final JMenuBar jmenuBarVendedorZona=this.jmenuBarVendedorZona;		
		final JToolBar jTtoolBarVendedorZona=this.jTtoolBarVendedorZona;
				
		JMenuBar jmenuBarDetalleAuxiliarVendedorZona=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVendedorZona=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			jmenuBarDetalleAuxiliarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jmenuBarDetalleVendedorZona;
			jTtoolBarDetalleAuxiliarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jTtoolBarDetalleVendedorZona;		
		}
		
		final JMenuBar jmenuBarDetalleVendedorZona=jmenuBarDetalleAuxiliarVendedorZona;
		final JToolBar jTtoolBarDetalleVendedorZona=jTtoolBarDetalleAuxiliarVendedorZona;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVendedorZona;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVendedorZona;
			processRunnable.jTableDatos=jTableDatosVendedorZona;
			processRunnable.jPanelCampos=jPanelCamposVendedorZona;
			processRunnable.jPanelPaginacion=jPanelPaginacionVendedorZona;
			processRunnable.jPanelAcciones=jPanelAccionesVendedorZona;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVendedorZona;
			
			
			processRunnable.jmenuBar=jmenuBarVendedorZona;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVendedorZona;
			processRunnable.jTtoolBar=jTtoolBarVendedorZona;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVendedorZona;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVendedorZona ,jPanelParametrosReportesVendedorZona, jTableDatosVendedorZona,/*jScrollPanelDatosVendedorZona,*/jPanelCamposVendedorZona,jPanelPaginacionVendedorZona, /*jScrollPanelDatosEdicionVendedorZona,*/ jPanelAccionesVendedorZona,jPanelAccionesFormularioVendedorZona,jmenuBarVendedorZona,jmenuBarDetalleVendedorZona,jTtoolBarVendedorZona,jTtoolBarDetalleVendedorZona));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVendedorZona(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVendedorZona(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVendedorZona(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVendedorZona(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVendedorZona,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVendedorZona,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVendedorZona(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVendedorZona,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVendedorZona,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.vendedorzonaConstantesFunciones.getsFinalQueryVendedorZona();
		String  finalQueryPaginacionTodos=this.vendedorzonaConstantesFunciones.getsFinalQueryVendedorZona();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VendedorZonaConstantesFunciones.getArrayColumnasGlobalesNoVendedorZona(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VendedorZonaConstantesFunciones.getArrayColumnasGlobalesVendedorZona(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VendedorZonaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.vendedorzonasEliminados= new ArrayList<VendedorZona>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVendedorZona();
		
				///*VendedorZonaSessionBean*/this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
			
			if(this.vendedorzonaSessionBean==null) {
				this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
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
					this.iNumeroPaginacion=VendedorZonaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VendedorZonaConstantesFunciones.getClassesForeignKeysOfVendedorZona(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/vendedorzona."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			vendedorzonasAux= new ArrayList<VendedorZona>();
			
				
			vendedorzonaLogic.setDatosCliente(this.datosCliente);
			vendedorzonaLogic.setDatosDeep(this.datosDeep);
			vendedorzonaLogic.setIsConDeep(true);
			
			
			vendedorzonaLogic.getVendedorZonaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					vendedorzonaLogic.getTodosVendedorZonas(finalQueryGlobal,pagination);
					
					//vendedorzonaLogic.getTodosVendedorZonasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(vendedorzonaLogic.getVendedorZonas()==null|| vendedorzonaLogic.getVendedorZonas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vendedorzonasAux= new ArrayList<VendedorZona>();
							vendedorzonasAux.addAll(vendedorzonaLogic.getVendedorZonas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonasAux= new ArrayList<VendedorZona>();
							vendedorzonasAux.addAll(vendedorzonas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vendedorzonaLogic.getTodosVendedorZonas(finalQueryGlobal+"",this.pagination);												
							
							//vendedorzonaLogic.getTodosVendedorZonasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVendedorZonas("Todos",vendedorzonaLogic.getVendedorZonas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vendedorzonaLogic.setVendedorZonas(new ArrayList<VendedorZona>());					
							vendedorzonaLogic.getVendedorZonas().addAll(vendedorzonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonas=new ArrayList<VendedorZona>();
							vendedorzonas.addAll(vendedorzonasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVendedorZona=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVendedorZona=this.idActual;
				
				} else if(this.idVendedorZonaActual!=null && this.idVendedorZonaActual!=0L) {
					idVendedorZona=idVendedorZonaActual;
				}
				
					
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndicePorId(idVendedorZona);
				
				this.vendedorzonas=new ArrayList<VendedorZona>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					vendedorzonaLogic.getEntity(idVendedorZona);
					
					//vendedorzonaLogic.getEntityWithConnection(idVendedorZona);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorzonaLogic.setVendedorZonas(new ArrayList<VendedorZona>());
					vendedorzonaLogic.getVendedorZonas().add(vendedorzonaLogic.getVendedorZona());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorzonas=new ArrayList<VendedorZona>();
					this.vendedorzonas.add(vendedorzona);
				}
				
				if(vendedorzonaLogic.getVendedorZona()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vendedorzonaLogic.getVendedorZonasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vendedorzonaLogic.getVendedorZonas()==null||vendedorzonaLogic.getVendedorZonas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vendedorzonas==null|| vendedorzonas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonasAux=new ArrayList<VendedorZona>();
						vendedorzonasAux.addAll(vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonasAux=new ArrayList<VendedorZona>();
							vendedorzonasAux.addAll(vendedorzonas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vendedorzonaLogic.getVendedorZonasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVendedorZonas("FK_IdEmpresa",vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVendedorZonas("FK_IdEmpresa",vendedorzonas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonaLogic.setVendedorZonas(new ArrayList<VendedorZona>());
						vendedorzonaLogic.getVendedorZonas().addAll(vendedorzonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonas=new ArrayList<VendedorZona>();
							vendedorzonas.addAll(vendedorzonasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vendedorzonaLogic.getVendedorZonasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vendedorzonaLogic.getVendedorZonas()==null||vendedorzonaLogic.getVendedorZonas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vendedorzonas==null|| vendedorzonas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonasAux=new ArrayList<VendedorZona>();
						vendedorzonasAux.addAll(vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonasAux=new ArrayList<VendedorZona>();
							vendedorzonasAux.addAll(vendedorzonas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vendedorzonaLogic.getVendedorZonasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVendedorZonas("FK_IdSucursal",vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVendedorZonas("FK_IdSucursal",vendedorzonas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonaLogic.setVendedorZonas(new ArrayList<VendedorZona>());
						vendedorzonaLogic.getVendedorZonas().addAll(vendedorzonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonas=new ArrayList<VendedorZona>();
							vendedorzonas.addAll(vendedorzonasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdVendedor")) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vendedorzonaLogic.getVendedorZonasFK_IdVendedor(finalQueryGlobal,pagination,id_vendedorFK_IdVendedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vendedorzonaLogic.getVendedorZonas()==null||vendedorzonaLogic.getVendedorZonas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vendedorzonas==null|| vendedorzonas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonasAux=new ArrayList<VendedorZona>();
						vendedorzonasAux.addAll(vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonasAux=new ArrayList<VendedorZona>();
							vendedorzonasAux.addAll(vendedorzonas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vendedorzonaLogic.getVendedorZonasFK_IdVendedor(finalQueryGlobal,pagination,id_vendedorFK_IdVendedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVendedorZonas("FK_IdVendedor",vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVendedorZonas("FK_IdVendedor",vendedorzonas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonaLogic.setVendedorZonas(new ArrayList<VendedorZona>());
						vendedorzonaLogic.getVendedorZonas().addAll(vendedorzonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonas=new ArrayList<VendedorZona>();
							vendedorzonas.addAll(vendedorzonasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdZona")) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vendedorzonaLogic.getVendedorZonasFK_IdZona(finalQueryGlobal,pagination,id_zonaFK_IdZona);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vendedorzonaLogic.getVendedorZonas()==null||vendedorzonaLogic.getVendedorZonas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vendedorzonas==null|| vendedorzonas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonasAux=new ArrayList<VendedorZona>();
						vendedorzonasAux.addAll(vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonasAux=new ArrayList<VendedorZona>();
							vendedorzonasAux.addAll(vendedorzonas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vendedorzonaLogic.getVendedorZonasFK_IdZona(finalQueryGlobal,pagination,id_zonaFK_IdZona);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorZonaConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVendedorZonas("FK_IdZona",vendedorzonaLogic.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVendedorZonas("FK_IdZona",vendedorzonas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonaLogic.setVendedorZonas(new ArrayList<VendedorZona>());
						vendedorzonaLogic.getVendedorZonas().addAll(vendedorzonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonas=new ArrayList<VendedorZona>();
							vendedorzonas.addAll(vendedorzonasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVendedorZona();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVendedorZona();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vendedorzonaLogic.getVendedorZonas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vendedorzonas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vendedorzonaLogic.getVendedorZonas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vendedorzonas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VendedorZona vendedorzona) {
		Boolean permite=true;
		
		if(this.vendedorzona.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VendedorZonaConstantesFunciones.getOrderByListaVendedorZona();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VendedorZonaConstantesFunciones.getOrderByListaVendedorZona();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorZona vendedorzona:vendedorzonaLogic.getVendedorZonas()) {
				if(vendedorzona.getsType().equals(Constantes2.S_TOTALES)) {
					vendedorzonaTotales=vendedorzona;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorZona vendedorzona:this.vendedorzonas) {
				if(vendedorzona.getsType().equals(Constantes2.S_TOTALES)) {
					vendedorzonaTotales=vendedorzona;
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
			this.vendedorzonaAux=new VendedorZona();
			this.vendedorzonaAux.setsType(Constantes2.S_TOTALES);
			this.vendedorzonaAux.setIsNew(false);
			this.vendedorzonaAux.setIsChanged(false);
			this.vendedorzonaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VendedorZonaConstantesFunciones.TotalizarValoresFilaVendedorZona(this.vendedorzonaLogic.getVendedorZonas(),this.vendedorzonaAux);
				
				this.vendedorzonaLogic.getVendedorZonas().add(this.vendedorzonaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VendedorZonaConstantesFunciones.TotalizarValoresFilaVendedorZona(this.vendedorzonas,this.vendedorzonaAux);
				
				this.vendedorzonas.add(this.vendedorzonaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		vendedorzonaTotales=new VendedorZona();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vendedorzonaLogic.getVendedorZonas().remove(vendedorzonaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vendedorzonas.remove(vendedorzonaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		vendedorzonaTotales=new VendedorZona();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorZona vendedorzona:vendedorzonaLogic.getVendedorZonas()) {
				if(vendedorzona.getsType().equals(Constantes2.S_TOTALES)) {
					vendedorzonaTotales=vendedorzona;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VendedorZonaConstantesFunciones.TotalizarValoresFilaVendedorZona(this.vendedorzonaLogic.getVendedorZonas(),vendedorzonaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorZona vendedorzona:this.vendedorzonas) {
				if(vendedorzona.getsType().equals(Constantes2.S_TOTALES)) {
					vendedorzonaTotales=vendedorzona;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VendedorZonaConstantesFunciones.TotalizarValoresFilaVendedorZona(this.vendedorzonas,vendedorzonaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVendedorZonasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVendedorZonasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVendedorZonasFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVendedorZonasFK_IdZona()throws Exception {
		try {
			sAccionBusqueda="FK_IdZona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVendedorZonasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorzonaLogic.getVendedorZonasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVendedorZonasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorzonaLogic.getVendedorZonasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVendedorZonasFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorzonaLogic.getVendedorZonasFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVendedorZonasFK_IdZona(String sFinalQuery,Long id_zona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorzonaLogic.getVendedorZonasFK_IdZona(sFinalQuery,this.pagination,id_zona);
				
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
	
	public void inicializarPermisosVendedorZona() {
		this.isPermisoTodoVendedorZona=false;
		this.isPermisoNuevoVendedorZona=false;
		this.isPermisoActualizarVendedorZona=false;
		this.isPermisoActualizarOriginalVendedorZona=false;
		this.isPermisoEliminarVendedorZona=false;
		this.isPermisoGuardarCambiosVendedorZona=false;
		this.isPermisoConsultaVendedorZona=false;
		this.isPermisoBusquedaVendedorZona=false;
		this.isPermisoReporteVendedorZona=false;		
		this.isPermisoOrdenVendedorZona=false;		
		this.isPermisoPaginacionMedioVendedorZona=false;		
		this.isPermisoPaginacionAltoVendedorZona=false;
		this.isPermisoPaginacionTodoVendedorZona=false;
		this.isPermisoCopiarVendedorZona=false;		
		this.isPermisoVerFormVendedorZona=false;		
		this.isPermisoDuplicarVendedorZona=false;		
		this.isPermisoOrdenVendedorZona=false;		
	}
	
	public void setPermisosUsuarioVendedorZona(Boolean isPermiso) {
		this.isPermisoTodoVendedorZona=isPermiso;
		this.isPermisoNuevoVendedorZona=isPermiso;
		this.isPermisoActualizarVendedorZona=isPermiso;
		this.isPermisoActualizarOriginalVendedorZona=isPermiso;
		this.isPermisoEliminarVendedorZona=isPermiso;
		this.isPermisoGuardarCambiosVendedorZona=isPermiso;
		this.isPermisoConsultaVendedorZona=isPermiso;
		this.isPermisoBusquedaVendedorZona=isPermiso;
		this.isPermisoReporteVendedorZona=isPermiso;
		this.isPermisoOrdenVendedorZona=isPermiso;		
		this.isPermisoPaginacionMedioVendedorZona=isPermiso;		
		this.isPermisoPaginacionAltoVendedorZona=isPermiso;		
		this.isPermisoPaginacionTodoVendedorZona=isPermiso;		
		this.isPermisoCopiarVendedorZona=isPermiso;		
		this.isPermisoVerFormVendedorZona=isPermiso;		
		this.isPermisoDuplicarVendedorZona=isPermiso;
		this.isPermisoOrdenVendedorZona=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVendedorZona(Boolean isPermiso) {
		//this.isPermisoTodoVendedorZona=isPermiso;
		this.isPermisoNuevoVendedorZona=isPermiso;
		this.isPermisoActualizarVendedorZona=isPermiso;
		this.isPermisoActualizarOriginalVendedorZona=isPermiso;
		this.isPermisoEliminarVendedorZona=isPermiso;
		this.isPermisoGuardarCambiosVendedorZona=isPermiso;
		//this.isPermisoConsultaVendedorZona=isPermiso;
		//this.isPermisoBusquedaVendedorZona=isPermiso;
		//this.isPermisoReporteVendedorZona=isPermiso;
		//this.isPermisoOrdenVendedorZona=isPermiso;		
		//this.isPermisoPaginacionMedioVendedorZona=isPermiso;		
		//this.isPermisoPaginacionAltoVendedorZona=isPermiso;		
		//this.isPermisoPaginacionTodoVendedorZona=isPermiso;		
		//this.isPermisoCopiarVendedorZona=isPermiso;		
		//this.isPermisoDuplicarVendedorZona=isPermiso;
		//this.isPermisoOrdenVendedorZona=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVendedorZonaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VendedorZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVendedorZona(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVendedorZonaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVendedorZonaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVendedorZonaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVendedorZonaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVendedorZona() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VendedorZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VendedorZonaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVendedorZona=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVendedorZona=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVendedorZona=this.isPermisoActualizarVendedorZona;
			this.isPermisoEliminarVendedorZona=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVendedorZona=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVendedorZona=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVendedorZona=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVendedorZona=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVendedorZona=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVendedorZona=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVendedorZona=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVendedorZona=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVendedorZona=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVendedorZona=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVendedorZona=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVendedorZona=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVendedorZona=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVendedorZona.setToolTipText(this.jTableDatosVendedorZona.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVendedorZona(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVendedorZona(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VendedorZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VendedorZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVendedorZona() throws Exception {
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
	public void inicializarCombosForeignKeyVendedorZonaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.zonasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVendedorZonaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VendedorZonaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVendedorZonaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyZonaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.zonasForeignKey==null||this.zonasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ZonaConstantesFunciones.getArrayColumnasGlobalesZona(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ZonaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ZonaConstantesFunciones.SFINALQUERY;

				this.cargarCombosZonasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyVendedorZonaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VendedorZonaParameterReturnGeneral vendedorzonaReturnGeneral=new VendedorZonaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.vendedorzonaConstantesFunciones.cargarid_empresaVendedorZona)
					 || (this.esRecargarFks && this.vendedorzonaConstantesFunciones.cargarid_empresaVendedorZona)) {

					if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+vendedorzonaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.vendedorzonaConstantesFunciones.cargarid_sucursalVendedorZona)
					 || (this.esRecargarFks && this.vendedorzonaConstantesFunciones.cargarid_sucursalVendedorZona)) {

					if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+vendedorzonaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalVendedor="";

				if(((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0) && this.vendedorzonaConstantesFunciones.cargarid_vendedorVendedorZona)
					 || (this.esRecargarFks && this.vendedorzonaConstantesFunciones.cargarid_vendedorVendedorZona)) {

					if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVendedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

						finalQueryGlobalVendedor=Funciones.GetFinalQueryAppend(finalQueryGlobalVendedor, "");
						finalQueryGlobalVendedor+=VendedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVendedor=" WHERE " + ConstantesSql.ID + "="+vendedorzonaSessionBean.getlidVendedorActual();
					}
				} else {
					finalQueryGlobalVendedor="NONE";
				}


				String finalQueryGlobalZona="";

				if(((this.zonasForeignKey==null||this.zonasForeignKey.size()<=0) && this.vendedorzonaConstantesFunciones.cargarid_zonaVendedorZona)
					 || (this.esRecargarFks && this.vendedorzonaConstantesFunciones.cargarid_zonaVendedorZona)) {

					if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ZonaConstantesFunciones.getArrayColumnasGlobalesZona(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalZona=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ZonaConstantesFunciones.TABLENAME);

						finalQueryGlobalZona=Funciones.GetFinalQueryAppend(finalQueryGlobalZona, "");
						finalQueryGlobalZona+=ZonaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosZonasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalZona=" WHERE " + ConstantesSql.ID + "="+vendedorzonaSessionBean.getlidZonaActual();
					}
				} else {
					finalQueryGlobalZona="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				vendedorzonaReturnGeneral=vendedorzonaLogic.cargarCombosLoteForeignKeyVendedorZona(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalVendedor,finalQueryGlobalZona);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=vendedorzonaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=vendedorzonaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalVendedor.equals("NONE")) {
				this.vendedorsForeignKey=vendedorzonaReturnGeneral.getvendedorsForeignKey();
			}

			if(!finalQueryGlobalZona.equals("NONE")) {
				this.zonasForeignKey=vendedorzonaReturnGeneral.getzonasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVendedorZona()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyZona();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.vendedorzonaSessionBean==null) {
				this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
			}

			if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyZona()throws Exception {
		try {

			if(!this.vendedorzonaSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				Zona zona=new Zona();
				ZonaConstantesFunciones.setZonaDescripcion(zona,Constantes.SMENSAJE_ESCOJA_OPCION);
				zona.setId(null);

				if(!ZonaConstantesFunciones.ExisteEnLista(this.zonasForeignKey,zona,true)) {

					this.zonasForeignKey.add(0,zona);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVendedorZona()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVendedorZona(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVendedorZona()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVendedorZona();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVendedorZona(VendedorZona vendedorzona)throws Exception {	
		try {
			
			this.setActualVendedorForeignKey(vendedorzona.getid_vendedor(),false,"Formulario");
			this.setActualZonaForeignKey(vendedorzona.getid_zona(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVendedorZona(VendedorZona vendedorzona,String sTipoEvento)throws Exception {	
		try {
			
			

				if(vendedorzona.getVendedor()!=null && !sTipoEvento.equals("id_vendedorVendedorZona")) { //sTipoEvento Evita Bucle Infinito

					this.vendedorsForeignKey=new ArrayList<Vendedor>();
					this.vendedorsForeignKey.add(vendedorzona.getVendedor());

					this.addItemDefectoCombosForeignKeyVendedor();
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}

				if(vendedorzona.getZona()!=null && !sTipoEvento.equals("id_zonaVendedorZona")) { //sTipoEvento Evita Bucle Infinito

					this.zonasForeignKey=new ArrayList<Zona>();
					this.zonasForeignKey.add(vendedorzona.getZona());

					this.addItemDefectoCombosForeignKeyZona();
					this.cargarCombosFrameZonasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVendedorZona()throws Exception {	
		try {
			
			this.setActualVendedorForeignKey(this.vendedorzonaConstantesFunciones.getid_vendedor(),false,"Formulario");
			this.setActualZonaForeignKey(this.vendedorzonaConstantesFunciones.getid_zona(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVendedorZona()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVendedorZona()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVendedorZona()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVendedorZona()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVendedorZona()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFrameZonasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVendedorZona(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVendedorZona()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public VendedorZonaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VendedorZonaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VendedorZonaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.vendedorzonaSessionBean=new VendedorZonaSessionBean(); 
		this.vendedorzonaConstantesFunciones=new VendedorZonaConstantesFunciones(); 
		this.vendedorzonaBean=new VendedorZona();//(this.vendedorzonaConstantesFunciones); 		
		this.vendedorzonaReturnGeneral=new VendedorZonaParameterReturnGeneral(); 
		
		this.vendedorzonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vendedorzonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VendedorZonaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VendedorZonaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VendedorZonaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVendedorZona(true);
			
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
			
			this.vendedorzonaConstantesFunciones=new VendedorZonaConstantesFunciones(); 
			this.vendedorzonaBean=new VendedorZona();//this.vendedorzonaConstantesFunciones); 			
			this.vendedorzonaReturnGeneral=new VendedorZonaParameterReturnGeneral(); 
		
			VendedorZonaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vendedor Zona Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.vendedorzona=new VendedorZona();
			this.vendedorzonas = new ArrayList<VendedorZona>();
			this.vendedorzonasAux = new ArrayList<VendedorZona>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic=new VendedorZonaLogic();
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}
			
			//this.vendedorzonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.vendedorzonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVendedorZona);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVendedorZona!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVendedorZona);	
					}
					
					if(this.jInternalFrameImportacionVendedorZona!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVendedorZona);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVendedorZona!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVendedorZona);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVendedorZona!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVendedorZona);
				this.jInternalFrameDetalleFormVendedorZona.setVisible(false);
				this.jInternalFrameDetalleFormVendedorZona.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVendedorZona!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVendedorZona);
					this.jInternalFrameReporteDinamicoVendedorZona.setVisible(false);
					this.jInternalFrameReporteDinamicoVendedorZona.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVendedorZona!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVendedorZona);
					this.jInternalFrameImportacionVendedorZona.setVisible(false);
					this.jInternalFrameImportacionVendedorZona.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVendedorZona!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVendedorZona);
					this.jInternalFrameOrderByVendedorZona.setVisible(false);
					this.jInternalFrameOrderByVendedorZona.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVendedorZonaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VendedorZonaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.vendedorzonaReturnGeneral=new VendedorZonaParameterReturnGeneral();
			
			this.vendedorzonaParameterGeneral=new VendedorZonaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.vendedorzonaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VendedorZonaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VendedorZonaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vendedorzonaSessionBean.getEsGuardarRelacionado(),this.vendedorzonaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VendedorZonaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vendedorzonaSessionBean.getEsGuardarRelacionado(),this.vendedorzonaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVendedorZona=false;
			this.isVisibilidadCeldaDuplicarVendedorZona=true;
			this.isVisibilidadCeldaCopiarVendedorZona=true;
			this.isVisibilidadCeldaVerFormVendedorZona=true;
			this.isVisibilidadCeldaOrdenVendedorZona=true;
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=false;
			this.isVisibilidadCeldaModificarVendedorZona=false;
			this.isVisibilidadCeldaActualizarVendedorZona=false;
			this.isVisibilidadCeldaEliminarVendedorZona=false;
			this.isVisibilidadCeldaCancelarVendedorZona=false;
			this.isVisibilidadCeldaGuardarVendedorZona=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdVendedor=true;
			this.isVisibilidadFK_IdZona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVendedorZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVendedorZona();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVendedorZona(false);
			
			this.setPermisosUsuarioVendedorZona();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado() 
				|| (this.vendedorzonaSessionBean.getEsGuardarRelacionado() && this.vendedorzonaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVendedorZonaClasesRelacionadas();
			}
			
			if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVendedorZonaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVendedorZona();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVendedorZona();
			}
			
			if(!this.isPermisoBusquedaVendedorZona) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVendedorZona.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVendedorZona,this.isPermisoPaginacionMedioVendedorZona,this.isPermisoPaginacionTodoVendedorZona);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VendedorZonaConstantesFunciones.getTiposSeleccionarVendedorZona());
				
				this.tiposColumnasSelect=VendedorZonaConstantesFunciones.getTiposSeleccionarVendedorZona(true);
				
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
			//if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVendedorZona();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioVendedorZona(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioVendedorZona(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVendedorZona() ;
			
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
			this.vendedorLogic=new VendedorLogic();
			this.zonaLogic=new ZonaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				vendedorzonaImplementable= (VendedorZonaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VendedorZonaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				vendedorzonaImplementableHome= (VendedorZonaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VendedorZonaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.vendedorzonas= new ArrayList<VendedorZona>();
			this.vendedorzonasEliminados= new ArrayList<VendedorZona>();
						
			this.isEsNuevoVendedorZona=false;
			this.esParaAccionDesdeFormularioVendedorZona=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idVendedorActual=0L;
			this.idZonaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			this.zonasForeignKey=new ArrayList<Zona>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVendedorZona(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVendedorZona();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VendedorZonaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VendedorZonaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVendedorZona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVendedorZona(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVendedorZona!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVendedorZona();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVendedorZona();
			}
			
			VendedorZonaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVendedorZona.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVendedorZona.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVendedorZona.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVendedorZona(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VendedorZona: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVendedorZona() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVendedorZona")) {
				iIndex=this.jInternalFrameDetalleFormVendedorZona.jTabbedPaneRelacionesVendedorZona.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVendedorZona.jTabbedPaneRelacionesVendedorZona.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVendedorZona();	
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
	
	public void cargarCombosForeignKeyVendedorZona(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVendedorZona(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVendedorZona(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVendedorZonaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVendedorZona();
		
		this.cargarCombosFrameForeignKeyVendedorZona();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVendedorZona();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVendedorZona();
		}
	}
	
	

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyZona(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaZona(this.zonasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVendedorZonaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
			
			if(jTableDatosVendedorZona.getRowCount()>=1) {
				jTableDatosVendedorZona.removeRowSelectionInterval(0, jTableDatosVendedorZona.getRowCount()-1);						
			}
			
			this.isEsNuevoVendedorZona=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVendedorZona(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVendedorZona(true);			
			//this.vendedorzona=new VendedorZona();
			//this.vendedorzona.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVendedorZona(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVendedorZona() ;
			
			if(VendedorZonaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVendedorZona(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.vendedorzona);	
			this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);				
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
			if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VendedorZona: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVendedorZonaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVendedorZona.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVendedorZona.getSelectedRows().length;			
			}
			
			vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVendedorZona--;			
				//VendedorZona vendedorzonaAux= new VendedorZona();			
				//vendedorzonaAux.setId(this.iIdNuevoVendedorZona);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VendedorZona vendedorzonaOrigen=new VendedorZona();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VendedorZona vendedorzonaOrigen : vendedorzonasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							vendedorzonaOrigen =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorzonaOrigen =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVendedorZona();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.vendedorzona.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVendedorZona(vendedorzonaOrigen,this.vendedorzona,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vendedorzonaLogic.getVendedorZonas().add(this.vendedorzonaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vendedorzonas.add(this.vendedorzonaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVendedorZona(false);
				
				this.jTableDatosVendedorZona.setRowSelectionInterval(this.getIndiceNuevoVendedorZona(), this.getIndiceNuevoVendedorZona());
				
				int iLastRow =  this.jTableDatosVendedorZona.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVendedorZona.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVendedorZona.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVendedorZona(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();									
		
			VendedorZona vendedorzonaOrigen=new VendedorZona();
			VendedorZona vendedorzonaDestino=new VendedorZona();
				
			vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVendedorZona.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || vendedorzonasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVendedorZona.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonaOrigen =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vendedorzonaOrigen =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorzonaDestino =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vendedorzonaDestino =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				vendedorzonaOrigen =vendedorzonasSeleccionados.get(0);
				vendedorzonaDestino =vendedorzonasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVendedorZona(vendedorzonaOrigen,vendedorzonaDestino,true,false);
				
				vendedorzonaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vendedorzonaDestino,vendedorzonaLogic.getVendedorZonas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vendedorzonaDestino,vendedorzonas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVendedorZona(false);
				
				//this.jTableDatosVendedorZona.setRowSelectionInterval(this.getIndiceNuevoVendedorZona(), this.getIndiceNuevoVendedorZona());
				
				int iLastRow =  this.jTableDatosVendedorZona.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVendedorZona.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVendedorZona.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVendedorZona(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVendedorZona.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVendedorZona.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVendedorZona.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVendedorZona.setVisible(!isVisible);
			this.jPanelPaginacionVendedorZona.setVisible(!isVisible);
			this.jPanelAccionesVendedorZona.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVendedorZona();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVendedorZona();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVendedorZona();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVendedorZona();
			
			this.abrirFrameOrderByVendedorZona();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVendedorZona();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVendedorZona(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVendedorZona);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVendedorZona.isMaximum()) {
					this.jInternalFrameDetalleFormVendedorZona.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVendedorZona.setSize(this.jInternalFrameDetalleFormVendedorZona.iWidthFormulario,this.jInternalFrameDetalleFormVendedorZona.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVendedorZona.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVendedorZona.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVendedorZona.isMaximum()) {
						this.jInternalFrameDetalleFormVendedorZona.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVendedorZona.jContentPaneDetalleVendedorZona.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVendedorZona.jTabbedPaneRelacionesVendedorZona.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVendedorZona.jContentPaneDetalleVendedorZona.getWidth(),VendedorZonaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVendedorZona.jTabbedPaneRelacionesVendedorZona.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVendedorZona.jContentPaneDetalleVendedorZona.getWidth(),VendedorZonaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVendedorZona.jTabbedPaneRelacionesVendedorZona.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVendedorZona.jContentPaneDetalleVendedorZona.getWidth(),VendedorZonaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVendedorZona.setVisible(true);
	        this.jInternalFrameDetalleFormVendedorZona.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVendedorZona() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVendedorZona==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVendedorZona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedorZona,false,this);
				} else {
					this.jInternalFrameOrderByVendedorZona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedorZona,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVendedorZona);
				this.jInternalFrameOrderByVendedorZona.setVisible(false);
				this.jInternalFrameOrderByVendedorZona.setSelected(false);
				
				this.jInternalFrameOrderByVendedorZona.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVendedorZona"));
				
				this.inicializarActualizarBindingTablaOrderByVendedorZona();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVendedorZona() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVendedorZona==null) {
				
				this.jInternalFrameImportacionVendedorZona=new ImportacionJInternalFrame(VendedorZonaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVendedorZona);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVendedorZona);
				this.jInternalFrameImportacionVendedorZona.setVisible(false);
				this.jInternalFrameImportacionVendedorZona.setSelected(false);


				this.jInternalFrameImportacionVendedorZona.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVendedorZona"));
				this.jInternalFrameImportacionVendedorZona.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVendedorZona"));
				this.jInternalFrameImportacionVendedorZona.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVendedorZona"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVendedorZona() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVendedorZona==null) {
				this.jInternalFrameReporteDinamicoVendedorZona=new ReporteDinamicoJInternalFrame(VendedorZonaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVendedorZona);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVendedorZona);
				this.jInternalFrameReporteDinamicoVendedorZona.setVisible(false);
				this.jInternalFrameReporteDinamicoVendedorZona.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVendedorZona.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVendedorZona"));
				this.jInternalFrameReporteDinamicoVendedorZona.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVendedorZona"));
				this.jInternalFrameReporteDinamicoVendedorZona.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVendedorZona"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVendedorZona();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVendedorZona() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVendedorZona);
			
	       	this.jInternalFrameDetalleFormVendedorZona.setVisible(false);
	        this.jInternalFrameDetalleFormVendedorZona.setSelected(false);
			
			//this.jInternalFrameDetalleFormVendedorZona.dispose();
			//this.jInternalFrameDetalleFormVendedorZona=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVendedorZona() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVendedorZona.setVisible(true);
	        this.jInternalFrameReporteDinamicoVendedorZona.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVendedorZona() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVendedorZona.setVisible(true);
	        this.jInternalFrameImportacionVendedorZona.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVendedorZona() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVendedorZona.setVisible(true);
	        this.jInternalFrameOrderByVendedorZona.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVendedorZona() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVendedorZona.setVisible(false);
	        this.jInternalFrameOrderByVendedorZona.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVendedorZona() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVendedorZona.setVisible(false);
	        this.jInternalFrameReporteDinamicoVendedorZona.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVendedorZona() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVendedorZona.setVisible(false);
	        this.jInternalFrameImportacionVendedorZona.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeVendedor(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeVendedor);
						VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.sTipoBusqueda="Vendedor";
						}

						vendedorBeanSwingJInternalFrame.getTodosVendedorArbol();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVendedors(vendedorBeanSwingJInternalFrame.vendedorsArbol);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.CargarTreeVendedor();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVisible(true);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.jInternalFrameParent=this;
						TitledBorder titledBorderVendedorZona=(TitledBorder)this.jScrollPanelDatosVendedorZona.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderVendedorZona.getTitle() + " -> Vendedor");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vendedorBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(vendedorBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeVendedor(VendedorBeanSwingJInternalFrame jInternalFrameTreeVendedor) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeVendedor);
						jInternalFrameTreeVendedor.setVisible(false);
						jInternalFrameTreeVendedor.setSelected(false);
						//jInternalFrameTreeVendedor.dispose();
						//jInternalFrameTreeVendedor=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVendedorZona(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVendedorZona(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVendedorZona(true);
			//this.isEsNuevoVendedorZona=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVendedorZona("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVendedorZona(false) ;
			
			if(vendedorzonaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VendedorZonaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVendedorZona(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVendedorZona(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVendedorZonaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVendedorZona(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVendedorZona(true);
			//this.isEsNuevoVendedorZona=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.vendedorzona.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVendedorZona("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVendedorZona(false) ;
			
			if(VendedorZonaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVendedorZona(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVendedorZona(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Vendedor")) {
				if(!this.vendedorzonaConstantesFunciones.cargarid_vendedorVendedorZona) {
					this.cargarCombosVendedorsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingVendedorZona(false,false);
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_vendedor (id);

				this.recargarComboTablaVendedor(this.vendedorsForeignKey);

			}
			
			if(sType.equals("Zona")) {
				if(!this.vendedorzonaConstantesFunciones.cargarid_zonaVendedorZona) {
					this.cargarCombosZonasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingVendedorZona(false,false);
					this.cargarCombosFrameZonasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_zona (id);

				this.recargarComboTablaZona(this.zonasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVendedorZona.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaZona(List<Zona> zonasForeignKey)throws Exception{
		TableColumn tableColumnZona=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,VendedorZonaConstantesFunciones.LABEL_IDZONA));
		TableCellEditor tableCellEditorZona =tableColumnZona.getCellEditor();

		ZonaTableCell zonaTableCellFk=(ZonaTableCell)tableCellEditorZona;

		if(zonaTableCellFk!=null) {
			zonaTableCellFk.setzonasForeignKey(zonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVendedorZona.getSelectedRow();

		//if(intSelectedRow<=0) {
			//zonaTableCellFk.setRowActual(intSelectedRow);
			//zonaTableCellFk.setzonasForeignKeyActual(zonasForeignKey);
		//}


		if(zonaTableCellFk!=null) {
			zonaTableCellFk.RecargarZonasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_vendedor (Long id) throws Exception {
		this.setActualVendedorForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_zona (Long id) throws Exception {
		this.setActualZonaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVendedorZona(false);
			
			//if(!this.isEsNuevoVendedorZona) {								
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
				
			}
			
			if(this.permiteMantenimiento(this.vendedorzona)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVendedorZona=true;
					this.inicializarActualizarBindingTablaVendedorZona(false);
					this.isEsNuevoVendedorZona=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVendedorZona=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVendedorZona=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVendedorZona(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVendedorZona(false);
				
				this.habilitarDeshabilitarControlesVendedorZona(false);
			
												
				
				if(VendedorZonaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVendedorZona();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVendedorZonaActionPerformed(evt,vendedorzonaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVendedorZona(this.vendedorzona,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVendedorZona.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,vendedorzonaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.vendedorzona.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVendedorZonaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				this.vendedorzona.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				this.vendedorzona.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.vendedorzona)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VendedorZonaModel) this.jTableDatosVendedorZona.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVendedorZona=true;
				this.inicializarActualizarBindingTablaVendedorZona(false);
				this.isEsNuevoVendedorZona=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVendedorZona(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVendedorZona(false);
				
				this.habilitarDeshabilitarControlesVendedorZona(false);
				
				
				
				if(VendedorZonaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVendedorZona();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVendedorZonaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVendedorZona.getRowCount()>=1) {
				jTableDatosVendedorZona.removeRowSelectionInterval(0, jTableDatosVendedorZona.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVendedorZona(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVendedorZona(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVendedorZona(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVendedorZona(false) ;
			
			this.isEsNuevoVendedorZona=false;
			
			if(VendedorZonaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVendedorZona();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVendedorZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVendedorZona(false);
				
				//SI ES MANUAL
				if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVendedorZona();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVendedorZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVendedorZona--;			
			//VendedorZona vendedorzonaAux= new VendedorZona();			
			//vendedorzonaAux.setId(this.iIdNuevoVendedorZona);
			
			if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVendedorZona();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
			
			this.vendedorzona.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.vendedorzonaLogic.getVendedorZonas().add(this.vendedorzonaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.vendedorzonas.add(this.vendedorzonaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVendedorZona(false);
			
			this.jTableDatosVendedorZona.setRowSelectionInterval(this.getIndiceNuevoVendedorZona(), this.getIndiceNuevoVendedorZona());
			
			int iLastRow =  this.jTableDatosVendedorZona.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVendedorZona.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVendedorZona.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVendedorZona(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVendedorZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVendedorZona(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVendedorZona(false);
			
			//SI ES MANUAL
			if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVendedorZona();
			}
			
			//this.abrirFrameTreeVendedorZona();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVendedorZonaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Vendedor ZonaS ?", "MANTENIMIENTO DE Vendedor Zona", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVendedorZona.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVendedorZona();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.vendedorzonaReturnGeneral=vendedorzonaLogic.procesarImportacionVendedorZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.vendedorzonaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVendedorZonaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVendedorZonaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVendedorZona.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVendedorZona.setFileImportacion(this.jInternalFrameImportacionVendedorZona.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVendedorZona.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVendedorZona.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVendedorZona.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVendedorZona.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVendedorZonaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();		

		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VendedorZonaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VendedorZonaBaseDesign.jrxml";
			
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
			
			this.generarReporteVendedorZonas("Todos",vendedorzonasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VendedorZonaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorZonaConstantesFunciones.LABEL_IDZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Zona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Zona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Zona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Zona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorZonaConstantesFunciones.LABEL_OBSERVACION:
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
		
		if(this.jInternalFrameReporteDinamicoVendedorZona.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VendedorZonaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoria="id_vendedor";
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDZONA:
					sNombreCampoCategoria="id_zona";
					break;

				case VendedorZonaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VendedorZonaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoriaValor="id_vendedor";
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDZONA:
					sNombreCampoCategoriaValor="id_zona";
					break;

				case VendedorZonaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VendedorZonaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vendedor");
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_zona");
					break;

				case VendedorZonaConstantesFunciones.LABEL_OBSERVACION:
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
	
	public void jButtonGenerarExcelReporteDinamicoVendedorZonaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();		
		
		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorzona";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VendedorZonas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VendedorZonaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VendedorZona vendedorzona:vendedorzonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorzona.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(VendedorZona vendedorzona:vendedorzonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorzona.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(VendedorZona vendedorzona:vendedorzonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorzona.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorZonaConstantesFunciones.LABEL_IDZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDZONA);
					iRow++;

					for(VendedorZona vendedorzona:vendedorzonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorzona.getzona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorZonaConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(VendedorZona vendedorzona:vendedorzonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorzona.getobservacion());
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
			//	this.getFilaCabeceraExportarExcelVendedorZona(row);				
			//	iRow++;
			//}				
			
			//for(VendedorZona vendedorzonaAux:vendedorzonasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVendedorZona(vendedorzonaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
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
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVendedorZona(false);
			
			//SI ES MANUAL
			if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVendedorZona();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVendedorZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVendedorZona(false);
			
			//SI ES MANUAL
			if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVendedorZona();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVendedorZonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVendedorZona(false);
			
			//SI ES MANUAL
			if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVendedorZona();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVendedorZona() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVendedorZona.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVendedorZona.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVendedorZona.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVendedorZona.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVendedorZona.setMinimumSize(dimensionMinimum);
		this.jTableDatosVendedorZona.setMaximumSize(dimensionMaximum);
		this.jTableDatosVendedorZona.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVendedorZona(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVendedorZona(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVendedorZona(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVendedorZona(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVendedorZona(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVendedorZona(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVendedorZona(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVendedorZona(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVendedorZona() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVendedorZona();
		
		this.inicializarActualizarBindingBotonesManualVendedorZona(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVendedorZona();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVendedorZona() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVendedorZona(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVendedorZona(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVendedorZona.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVendedorZona.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVendedorZona.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVendedorZona!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVendedorZona.jCheckBoxPostAccionNuevoVendedorZona.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVendedorZona.jCheckBoxPostAccionSinCerrarVendedorZona.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVendedorZona.jCheckBoxPostAccionSinMensajeVendedorZona.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVendedorZona.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVendedorZona.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVendedorZona.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVendedorZona!=null) {
				this.jInternalFrameDetalleFormVendedorZona.jCheckBoxPostAccionNuevoVendedorZona.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVendedorZona.jCheckBoxPostAccionSinCerrarVendedorZona.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVendedorZona.jCheckBoxPostAccionSinMensajeVendedorZona.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVendedorZona.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVendedorZona.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVendedorZona.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVendedorZona!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVendedorZona.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVendedorZona.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVendedorZona.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVendedorZona.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVendedorZona!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVendedorZona.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVendedorZona.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVendedorZona(Boolean esInicializar) throws Exception {
		try	{	
			if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVendedorZona(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVendedorZona() throws Exception {
		try	{
			if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVendedorZona();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVendedorZona() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVendedorZona() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVendedorZona.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVendedorZona.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVendedorZona.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVendedorZona.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVendedorZona.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVendedorZona.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVendedorZona.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVendedorZona.addItem(reporte);
			}
			
			
			if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVendedorZona.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVendedorZona.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVendedorZona.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVendedorZona.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVendedorZona.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVendedorZona.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVendedorZona.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVendedorZona.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVendedorZona.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVendedorZona();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVendedorZona() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVendedorZona!=null) {
				this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVendedorZona!=null) {
				this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVendedorZona.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVendedorZona!=null) {
				
				if(this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVendedorZona.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVendedorZona.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVendedorZona.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVendedorZona.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVendedorZona()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_vendedorFK_IdVendedorVendedorZona.getSelectedItem()!=null){this.id_vendedorFK_IdVendedor=((Vendedor)this.jComboBoxid_vendedorFK_IdVendedorVendedorZona.getSelectedItem()).getId();}
		if(this.jComboBoxid_zonaFK_IdZonaVendedorZona.getSelectedItem()!=null){this.id_zonaFK_IdZona=((Zona)this.jComboBoxid_zonaFK_IdZonaVendedorZona.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVendedorZona(Boolean esInicializar) throws Exception {				
		if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVendedorZona();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVendedorZona() throws Exception {
		this.inicializarActualizarBindingTablaVendedorZona(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVendedorZona() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVendedorZonaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZonaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVendedorZona(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=vendedorzonaLogic.getVendedorZonas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=vendedorzonas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVendedorZona.setModel(new VendedorZonaModel(this.vendedorzonaLogic.getVendedorZonas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVendedorZona.setModel(new VendedorZonaModel(this.vendedorzonas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVendedorZona!=null && this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVendedorZona();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO,vendedorzonaConstantesFunciones.resaltarSeleccionarVendedorZona,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO,vendedorzonaConstantesFunciones.resaltarSeleccionarVendedorZona,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,VendedorZonaConstantesFunciones.LABEL_ID));

		if(this.vendedorzonaConstantesFunciones.mostraridVendedorZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorZonaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vendedorzonaConstantesFunciones.resaltaridVendedorZona,this.vendedorzonaConstantesFunciones.activaridVendedorZona,this,true,"idVendedorZona","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vendedorzonaConstantesFunciones.resaltaridVendedorZona,this.vendedorzonaConstantesFunciones.activaridVendedorZona,this,true,"idVendedorZona","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,VendedorZonaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.vendedorzonaConstantesFunciones.mostrarid_empresaVendedorZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorZonaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.vendedorzonaConstantesFunciones.resaltarid_empresaVendedorZona,this,this.vendedorzonaConstantesFunciones.activarid_empresaVendedorZona));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.vendedorzonaConstantesFunciones.resaltarid_empresaVendedorZona,this,this.vendedorzonaConstantesFunciones.activarid_empresaVendedorZona,false,"id_empresaVendedorZona","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.vendedorzonaConstantesFunciones.mostrarid_sucursalVendedorZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.vendedorzonaConstantesFunciones.resaltarid_sucursalVendedorZona,this,this.vendedorzonaConstantesFunciones.activarid_sucursalVendedorZona));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.vendedorzonaConstantesFunciones.resaltarid_sucursalVendedorZona,this,this.vendedorzonaConstantesFunciones.activarid_sucursalVendedorZona,false,"id_sucursalVendedorZona","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR));

		if(this.vendedorzonaConstantesFunciones.mostrarid_vendedorVendedorZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VendedorTableCell(this.vendedorsForeignKey,this.vendedorzonaConstantesFunciones.resaltarid_vendedorVendedorZona,this,this.vendedorzonaConstantesFunciones.activarid_vendedorVendedorZona));
			tableColumn.setCellEditor(new VendedorTableCell(this.vendedorsForeignKey,this.vendedorzonaConstantesFunciones.resaltarid_vendedorVendedorZona,this,this.vendedorzonaConstantesFunciones.activarid_vendedorVendedorZona,true,"id_vendedorVendedorZona","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,VendedorZonaConstantesFunciones.LABEL_IDZONA));

		if(this.vendedorzonaConstantesFunciones.mostrarid_zonaVendedorZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorZonaConstantesFunciones.LABEL_IDZONA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ZonaTableCell(this.zonasForeignKey,this.vendedorzonaConstantesFunciones.resaltarid_zonaVendedorZona,this,this.vendedorzonaConstantesFunciones.activarid_zonaVendedorZona));
			tableColumn.setCellEditor(new ZonaTableCell(this.zonasForeignKey,this.vendedorzonaConstantesFunciones.resaltarid_zonaVendedorZona,this,this.vendedorzonaConstantesFunciones.activarid_zonaVendedorZona,true,"id_zonaVendedorZona","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,VendedorZonaConstantesFunciones.LABEL_OBSERVACION));

		if(this.vendedorzonaConstantesFunciones.mostrarobservacionVendedorZona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorZonaConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vendedorzonaConstantesFunciones.resaltarobservacionVendedorZona,this.vendedorzonaConstantesFunciones.activarobservacionVendedorZona,this,true,"observacionVendedorZona","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vendedorzonaConstantesFunciones.resaltarobservacionVendedorZona,this.vendedorzonaConstantesFunciones.activarobservacionVendedorZona,this,true,"observacionVendedorZona","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorZonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vendedorzonaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vendedorzonaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVendedorZona.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vendedorzonaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vendedorzonaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVendedorZona.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVendedorZona && this.isPermisoGuardarCambiosVendedorZona) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.vendedorzonaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.vendedorzonaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVendedorZona.addColumn(tableColumn);
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
			
			this.jTableDatosVendedorZona.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVendedorZona && this.isPermisoGuardarCambiosVendedorZona) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVendedorZona && this.isPermisoGuardarCambiosVendedorZona) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVendedorZona.moveColumn(this.jTableDatosVendedorZona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVendedorZona.moveColumn(this.jTableDatosVendedorZona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVendedorZona.moveColumn(this.jTableDatosVendedorZona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVendedorZona.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVendedorZona.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVendedorZona,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVendedorZona.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVendedorZona.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVendedorZona.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVendedorZona.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVendedorZona.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=vendedorzonaLogic.getVendedorZonas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=vendedorzonas.size()-1;
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
		//this.jTableDatosVendedorZona.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVendedorZona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVendedorZona();
			
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
				
				//this.isEsNuevoVendedorZona=false;
					
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
				if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVendedorZona==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVendedorZona.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVendedorZona.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.vendedorzona.getsType().equals("DUPLICADO")
				   || this.vendedorzona.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVendedorZona=true;
				
				} else {
					this.isEsNuevoVendedorZona=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
					if(this.vendedorzona.getId()>=0 && !this.vendedorzona.getIsNew()) {						
						this.isEsNuevoVendedorZona=false;
						
					} else {
						this.isEsNuevoVendedorZona=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVendedorZona(esRelaciones);						
				
				this.seleccionarVendedorZona(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.vendedorzona.getId()<0) {
					this.isEsNuevoVendedorZona=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVendedorZona(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVendedorZona(evt,rowIndex);
				}	
				
				if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VendedorZona: " + this.dDif); 
					}
				}								
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVendedorZona(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.vendedorzona)) {
					if(this.vendedorzona.getId()>0) {
						this.vendedorzona.setIsDeleted(true);
						
						this.vendedorzonasEliminados.add(this.vendedorzona);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vendedorzonaLogic.getVendedorZonas().remove(this.vendedorzona);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vendedorzonas.remove(this.vendedorzona);				
					}
					
					
					((VendedorZonaModel) this.jTableDatosVendedorZona.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVendedorZona(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVendedorZona(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVendedorZona) {
			
			if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVendedorZona.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVendedorZona.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVendedorZona(this.vendedorzona);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.vendedorzonaConstantesFunciones.cargarid_empresaVendedorZona || this.vendedorzonaConstantesFunciones.event_dependid_empresaVendedorZona) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.vendedorzona.getid_empresa());
									//this.inicializarActualizarBindingVendedorZona(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(vendedorzona.getEmpresa()!=null) {
							this.empresasForeignKey.add(vendedorzona.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.vendedorzona.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.vendedorzonaConstantesFunciones.cargarid_sucursalVendedorZona || this.vendedorzonaConstantesFunciones.event_dependid_sucursalVendedorZona) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.vendedorzona.getid_sucursal());
									//this.inicializarActualizarBindingVendedorZona(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(vendedorzona.getSucursal()!=null) {
							this.sucursalsForeignKey.add(vendedorzona.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.vendedorzona.getid_sucursal(),false,"Formulario");

					//Vendedor
					if(!this.vendedorzonaConstantesFunciones.cargarid_vendedorVendedorZona || this.vendedorzonaConstantesFunciones.event_dependid_vendedorVendedorZona) {
						//this.cargarCombosVendedorsForeignKeyLista(" where id="+this.vendedorzona.getid_vendedor());
									//this.inicializarActualizarBindingVendedorZona(false,false);
						this.vendedorsForeignKey=new ArrayList<Vendedor>();

						if(vendedorzona.getVendedor()!=null) {
							this.vendedorsForeignKey.add(vendedorzona.getVendedor());
						}

						this.addItemDefectoCombosForeignKeyVendedor();
						this.cargarCombosFrameVendedorsForeignKey("Todos");
					}
					this.setActualVendedorForeignKey(this.vendedorzona.getid_vendedor(),false,"Formulario");

					//Zona
					if(!this.vendedorzonaConstantesFunciones.cargarid_zonaVendedorZona || this.vendedorzonaConstantesFunciones.event_dependid_zonaVendedorZona) {
						//this.cargarCombosZonasForeignKeyLista(" where id="+this.vendedorzona.getid_zona());
									//this.inicializarActualizarBindingVendedorZona(false,false);
						this.zonasForeignKey=new ArrayList<Zona>();

						if(vendedorzona.getZona()!=null) {
							this.zonasForeignKey.add(vendedorzona.getZona());
						}

						this.addItemDefectoCombosForeignKeyZona();
						this.cargarCombosFrameZonasForeignKey("Todos");
					}
					this.setActualZonaForeignKey(this.vendedorzona.getid_zona(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVendedorZona("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVendedorZona(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVendedorZona() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVendedorZona(VendedorZona vendedorzona) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVendedorZona(vendedorzona,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVendedorZona(VendedorZona vendedorzona,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVendedorZona(vendedorzona);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVendedorZona(vendedorzona,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVendedorZona(vendedorzona);
	}
	
	public void setVariablesObjetoActualToFormularioVendedorZona(VendedorZona vendedorzona) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.setText(vendedorzona.getId().toString());
			this.jInternalFrameDetalleFormVendedorZona.jTextAreaobservacionVendedorZona.setText(vendedorzona.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VendedorZona vendedorzonaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,vendedorzonaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VendedorZona vendedorzonaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				vendedorzonaLocal=this.vendedorzona;
			} else {
				vendedorzonaLocal=this.vendedorzonaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(vendedorzonaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVendedorZona(vendedorzonaLocal,true);
					
					if(vendedorzonaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(vendedorzonaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(vendedorzonaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVendedorZona(VendedorZona vendedorzona,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVendedorZona(vendedorzona,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(vendedorzona);
	}
	
	public void setVariablesFormularioToObjetoActualVendedorZona(VendedorZona vendedorzona,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVendedorZona(vendedorzona,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVendedorZona(VendedorZona vendedorzona,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.getText()==null || this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.getText()=="" || this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.getText()=="Id") {
				this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.setText("0");
			}

			if(conColumnasBase) {vendedorzona.setId(Long.parseLong(this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VendedorZonaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorZona.jLabelIdVendedorZona,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vendedorzona.setobservacion(this.jInternalFrameDetalleFormVendedorZona.jTextAreaobservacionVendedorZona.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VendedorZonaConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorZona.jLabelobservacionVendedorZona,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVendedorZona(VendedorZona vendedorzonaBean,VendedorZona vendedorzona,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && vendedorzonaBean.getid_vendedor()!=null && !vendedorzonaBean.getid_vendedor().equals(-1L))) {vendedorzona.setid_vendedor(vendedorzonaBean.getid_vendedor());}
			if(conDefault || (!conDefault && vendedorzonaBean.getid_zona()!=null && !vendedorzonaBean.getid_zona().equals(-1L))) {vendedorzona.setid_zona(vendedorzonaBean.getid_zona());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVendedorZona(VendedorZona vendedorzonaOrigen,VendedorZona vendedorzona,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vendedorzonaOrigen.getId()!=null && !vendedorzonaOrigen.getId().equals(0L))) {vendedorzona.setId(vendedorzonaOrigen.getId());}}
			if(conDefault || (!conDefault && vendedorzonaOrigen.getid_vendedor()!=null && !vendedorzonaOrigen.getid_vendedor().equals(-1L))) {vendedorzona.setid_vendedor(vendedorzonaOrigen.getid_vendedor());}
			if(conDefault || (!conDefault && vendedorzonaOrigen.getid_zona()!=null && !vendedorzonaOrigen.getid_zona().equals(-1L))) {vendedorzona.setid_zona(vendedorzonaOrigen.getid_zona());}
			if(conDefault || (!conDefault && vendedorzonaOrigen.getobservacion()!=null && !vendedorzonaOrigen.getobservacion().equals(""))) {vendedorzona.setobservacion(vendedorzonaOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVendedorZona(VendedorZona vendedorzona) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.setText(vendedorzona.getId().toString());
			this.jInternalFrameDetalleFormVendedorZona.jTextAreaobservacionVendedorZona.setText(vendedorzona.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVendedorZona(VendedorZonaBean vendedorzonaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.setText(vendedorzonaBean.getId().toString());
			this.jInternalFrameDetalleFormVendedorZona.jTextAreaobservacionVendedorZona.setText(vendedorzonaBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVendedorZona(VendedorZonaParameterReturnGeneral vendedorzonaReturnGeneral,VendedorZonaBean vendedorzonaBean,Boolean conDefault) throws Exception { 
		try {
			VendedorZona vendedorzonaLocal=new VendedorZona();
			
			vendedorzonaLocal=vendedorzonaReturnGeneral.getVendedorZona();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vendedorzonaLocal.getId()!=null && !vendedorzonaLocal.getId().equals(0L))) {vendedorzonaBean.setId(vendedorzonaLocal.getId());}}
			if(conDefault || (!conDefault && vendedorzonaLocal.getid_vendedor()!=null && !vendedorzonaLocal.getid_vendedor().equals(-1L))) {vendedorzonaBean.setid_vendedor(vendedorzonaLocal.getid_vendedor());}
			if(conDefault || (!conDefault && vendedorzonaLocal.getid_zona()!=null && !vendedorzonaLocal.getid_zona().equals(-1L))) {vendedorzonaBean.setid_zona(vendedorzonaLocal.getid_zona());}
			if(conDefault || (!conDefault && vendedorzonaLocal.getobservacion()!=null && !vendedorzonaLocal.getobservacion().equals(""))) {vendedorzonaBean.setobservacion(vendedorzonaLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVendedorZonaGenerico(Long idVendedorZonaSeleccionado,JComboBox jComboBoxVendedorZona,List<VendedorZona> vendedorzonasLocal)throws Exception {
		try {
			VendedorZona  vendedorzonaTemp=null;

			for(VendedorZona vendedorzonaAux:vendedorzonasLocal) {
				if(vendedorzonaAux.getId()!=null && vendedorzonaAux.getId().equals(idVendedorZonaSeleccionado)) {
					vendedorzonaTemp=vendedorzonaAux;
					break;
				}
			}

			jComboBoxVendedorZona.setSelectedItem(vendedorzonaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVendedorZonaGenerico(JComboBox jComboBoxVendedorZona,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVendedorZona.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVendedorZona.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVendedorZona.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVendedorZona.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vendedorzona=(VendedorZona) vendedorzonaLogic.getVendedorZonas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vendedorzona =(VendedorZona) vendedorzonas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!vendedorzona.getIsNew() && !vendedorzona.getIsChanged() && !vendedorzona.getIsDeleted()) {
				sDescripcion=vendedorzona.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorzona.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!vendedorzona.getIsNew() && !vendedorzona.getIsChanged() && !vendedorzona.getIsDeleted()) {
				sDescripcion=vendedorzona.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorzona.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!vendedorzona.getIsNew() && !vendedorzona.getIsChanged() && !vendedorzona.getIsDeleted()) {
				sDescripcion=vendedorzona.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorzona.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Zona")) {
			//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
			if(!vendedorzona.getIsNew() && !vendedorzona.getIsChanged() && !vendedorzona.getIsDeleted()) {
				sDescripcion=vendedorzona.getzona_descripcion();
			} else {
				//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorzona.getzona_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VendedorZona vendedorzonaRow=new VendedorZona();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vendedorzonaRow=(VendedorZona) vendedorzonaLogic.getVendedorZonas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vendedorzonaRow=(VendedorZona) vendedorzonas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVendedorZona(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVendedorZona.setVisible((this.isVisibilidadCeldaNuevoVendedorZona && this.isPermisoNuevoVendedorZona));			
			this.jButtonDuplicarVendedorZona.setVisible((this.isVisibilidadCeldaDuplicarVendedorZona && this.isPermisoDuplicarVendedorZona));			
			this.jButtonCopiarVendedorZona.setVisible((this.isVisibilidadCeldaCopiarVendedorZona && this.isPermisoCopiarVendedorZona));
			this.jButtonVerFormVendedorZona.setVisible((this.isVisibilidadCeldaVerFormVendedorZona && this.isPermisoVerFormVendedorZona));
			
			this.jButtonAbrirOrderByVendedorZona.setVisible((this.isVisibilidadCeldaOrdenVendedorZona && this.isPermisoOrdenVendedorZona));			
			
			this.jButtonNuevoRelacionesVendedorZona.setVisible((this.isVisibilidadCeldaNuevoRelacionesVendedorZona && this.isPermisoNuevoVendedorZona));			
			this.jButtonNuevoGuardarCambiosVendedorZona.setVisible((this.isVisibilidadCeldaNuevoVendedorZona && this.isPermisoNuevoVendedorZona && this.isPermisoGuardarCambiosVendedorZona));
			
			if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonModificarVendedorZona.setVisible((this.isVisibilidadCeldaModificarVendedorZona && this.isPermisoActualizarVendedorZona));	
			this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarVendedorZona.setVisible((this.isVisibilidadCeldaActualizarVendedorZona && this.isPermisoActualizarVendedorZona));	
			this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarVendedorZona.setVisible((this.isVisibilidadCeldaEliminarVendedorZona && this.isPermisoEliminarVendedorZona));
			this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarVendedorZona.setVisible(this.isVisibilidadCeldaCancelarVendedorZona);							
			this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosVendedorZona.setVisible((this.isVisibilidadCeldaGuardarVendedorZona && this.isPermisoGuardarCambiosVendedorZona));			
			
			}
						
			this.jButtonGuardarCambiosTablaVendedorZona.setVisible((this.isVisibilidadCeldaGuardarCambiosVendedorZona && this.isPermisoGuardarCambiosVendedorZona));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVendedorZona.setVisible((this.isVisibilidadCeldaNuevoVendedorZona && this.isPermisoNuevoVendedorZona));						
			this.jButtonDuplicarToolBarVendedorZona.setVisible((this.isVisibilidadCeldaDuplicarVendedorZona && this.isPermisoDuplicarVendedorZona));						
			this.jButtonCopiarToolBarVendedorZona.setVisible((this.isVisibilidadCeldaCopiarVendedorZona && this.isPermisoCopiarVendedorZona));			
			this.jButtonVerFormToolBarVendedorZona.setVisible((this.isVisibilidadCeldaVerFormVendedorZona && this.isPermisoVerFormVendedorZona));			
			this.jButtonAbrirOrderByToolBarVendedorZona.setVisible((this.isVisibilidadCeldaOrdenVendedorZona && this.isPermisoOrdenVendedorZona));
			this.jButtonNuevoRelacionesToolBarVendedorZona.setVisible((this.isVisibilidadCeldaNuevoRelacionesVendedorZona && this.isPermisoNuevoVendedorZona));			
			this.jButtonNuevoGuardarCambiosToolBarVendedorZona.setVisible((this.isVisibilidadCeldaNuevoVendedorZona && this.isPermisoNuevoVendedorZona && this.isPermisoGuardarCambiosVendedorZona));			
			
			if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonModificarToolBarVendedorZona.setVisible((this.isVisibilidadCeldaModificarVendedorZona && this.isPermisoActualizarVendedorZona));	
			this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarToolBarVendedorZona.setVisible((this.isVisibilidadCeldaActualizarVendedorZona  && this.isPermisoActualizarVendedorZona));	
			this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarToolBarVendedorZona.setVisible((this.isVisibilidadCeldaEliminarVendedorZona && this.isPermisoEliminarVendedorZona));
			this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarToolBarVendedorZona.setVisible(this.isVisibilidadCeldaCancelarVendedorZona);				
			this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosToolBarVendedorZona.setVisible((this.isVisibilidadCeldaGuardarVendedorZona && this.isPermisoGuardarCambiosVendedorZona));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVendedorZona.setVisible((this.isVisibilidadCeldaGuardarCambiosVendedorZona && this.isPermisoGuardarCambiosVendedorZona));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVendedorZona.setVisible((this.isVisibilidadCeldaNuevoVendedorZona && this.isPermisoNuevoVendedorZona));			
			this.jMenuItemDuplicarVendedorZona.setVisible((this.isVisibilidadCeldaDuplicarVendedorZona && this.isPermisoDuplicarVendedorZona));			
			this.jMenuItemCopiarVendedorZona.setVisible((this.isVisibilidadCeldaCopiarVendedorZona && this.isPermisoCopiarVendedorZona));			
			this.jMenuItemVerFormVendedorZona.setVisible((this.isVisibilidadCeldaVerFormVendedorZona && this.isPermisoVerFormVendedorZona));			
			this.jMenuItemAbrirOrderByVendedorZona.setVisible((this.isVisibilidadCeldaOrdenVendedorZona && this.isPermisoOrdenVendedorZona));			
			//this.jMenuItemMostrarOcultarVendedorZona.setVisible((this.isVisibilidadCeldaOrdenVendedorZona && this.isPermisoOrdenVendedorZona));
			this.jMenuItemDetalleAbrirOrderByVendedorZona.setVisible((this.isVisibilidadCeldaOrdenVendedorZona && this.isPermisoOrdenVendedorZona));			
			//this.jMenuItemDetalleMostrarOcultarVendedorZona.setVisible((this.isVisibilidadCeldaOrdenVendedorZona && this.isPermisoOrdenVendedorZona));			
			this.jMenuItemNuevoRelacionesVendedorZona.setVisible((this.isVisibilidadCeldaNuevoRelacionesVendedorZona && this.isPermisoNuevoVendedorZona));			
			this.jMenuItemNuevoGuardarCambiosVendedorZona.setVisible((this.isVisibilidadCeldaNuevoVendedorZona && this.isPermisoNuevoVendedorZona && this.isPermisoGuardarCambiosVendedorZona));									
			
			if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			this.jInternalFrameDetalleFormVendedorZona.jMenuItemModificarVendedorZona.setVisible((this.isVisibilidadCeldaModificarVendedorZona && this.isPermisoActualizarVendedorZona));	
			this.jInternalFrameDetalleFormVendedorZona.jMenuItemActualizarVendedorZona.setVisible((this.isVisibilidadCeldaActualizarVendedorZona && this.isPermisoActualizarVendedorZona));	
			this.jInternalFrameDetalleFormVendedorZona.jMenuItemEliminarVendedorZona.setVisible((this.isVisibilidadCeldaEliminarVendedorZona && this.isPermisoEliminarVendedorZona));
			this.jInternalFrameDetalleFormVendedorZona.jMenuItemCancelarVendedorZona.setVisible(this.isVisibilidadCeldaCancelarVendedorZona);				
			}
			
			this.jMenuItemGuardarCambiosVendedorZona.setVisible((this.isVisibilidadCeldaGuardarVendedorZona && this.isPermisoGuardarCambiosVendedorZona));						
			this.jMenuItemGuardarCambiosTablaVendedorZona.setVisible((this.isVisibilidadCeldaGuardarCambiosVendedorZona && this.isPermisoGuardarCambiosVendedorZona));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVendedorZona=this.jButtonNuevoVendedorZona.isVisible();
			this.isVisibilidadCeldaDuplicarVendedorZona=this.jButtonDuplicarVendedorZona.isVisible();
			this.isVisibilidadCeldaCopiarVendedorZona=this.jButtonCopiarVendedorZona.isVisible();
			this.isVisibilidadCeldaVerFormVendedorZona=this.jButtonVerFormVendedorZona.isVisible();
			
			this.isVisibilidadCeldaOrdenVendedorZona=this.jButtonAbrirOrderByVendedorZona.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=this.jButtonNuevoRelacionesVendedorZona.isVisible();
			this.isVisibilidadCeldaModificarVendedorZona=this.jButtonModificarVendedorZona.isVisible();
			
			if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			this.isVisibilidadCeldaActualizarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarVendedorZona.isVisible();
			this.isVisibilidadCeldaEliminarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarVendedorZona.isVisible();
			this.isVisibilidadCeldaCancelarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarVendedorZona.isVisible();
			this.isVisibilidadCeldaGuardarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosVendedorZona.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=this.jButtonGuardarCambiosTablaVendedorZona.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVendedorZona=this.jButtonNuevoToolBarVendedorZona.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=this.jButtonNuevoRelacionesToolBarVendedorZona.isVisible();
			
			if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			this.isVisibilidadCeldaModificarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jButtonModificarToolBarVendedorZona.isVisible();
			this.isVisibilidadCeldaActualizarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarToolBarVendedorZona.isVisible();
			this.isVisibilidadCeldaEliminarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarToolBarVendedorZona.isVisible();
			this.isVisibilidadCeldaCancelarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarToolBarVendedorZona.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVendedorZona=this.jButtonGuardarCambiosToolBarVendedorZona.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=this.jButtonGuardarCambiosTablaToolBarVendedorZona.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVendedorZona=this.jMenuItemNuevoVendedorZona.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=this.jMenuItemNuevoRelacionesVendedorZona.isVisible();
			
			if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			this.isVisibilidadCeldaModificarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jMenuItemModificarVendedorZona.isVisible();
			this.isVisibilidadCeldaActualizarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jMenuItemActualizarVendedorZona.isVisible();
			this.isVisibilidadCeldaEliminarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jMenuItemEliminarVendedorZona.isVisible();
			this.isVisibilidadCeldaCancelarVendedorZona=this.jInternalFrameDetalleFormVendedorZona.jMenuItemCancelarVendedorZona.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVendedorZona=this.jMenuItemGuardarCambiosVendedorZona.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=this.jMenuItemGuardarCambiosTablaVendedorZona.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVendedorZona(Boolean esInicializar) {
		if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {
				//if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVendedorZona();
			}
			
			this.inicializarActualizarBindingBotonesManualVendedorZona(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVendedorZona() {
		this.jButtonNuevoVendedorZona.setVisible(this.isPermisoNuevoVendedorZona);			
		this.jButtonDuplicarVendedorZona.setVisible(this.isPermisoDuplicarVendedorZona);			
		this.jButtonCopiarVendedorZona.setVisible(this.isPermisoCopiarVendedorZona);			
		this.jButtonVerFormVendedorZona.setVisible(this.isPermisoVerFormVendedorZona);			
		
		this.jButtonAbrirOrderByVendedorZona.setVisible(this.isPermisoOrdenVendedorZona);					
		
		this.jButtonNuevoRelacionesVendedorZona.setVisible(this.isPermisoNuevoVendedorZona);			
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonModificarVendedorZona.setVisible(this.isPermisoActualizarVendedorZona);	
			this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarVendedorZona.setVisible(this.isPermisoActualizarVendedorZona);	
			this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarVendedorZona.setVisible(this.isPermisoEliminarVendedorZona);
			this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarVendedorZona.setVisible(this.isVisibilidadCeldaCancelarVendedorZona);						
			this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosVendedorZona.setVisible(this.isPermisoGuardarCambiosVendedorZona);							
		}
		
		this.jButtonGuardarCambiosTablaVendedorZona.setVisible(this.isPermisoActualizarVendedorZona);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVendedorZona() {
		this.jInternalFrameDetalleFormVendedorZona.jButtonModificarVendedorZona.setVisible(this.isPermisoActualizarVendedorZona);	
		this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarVendedorZona.setVisible(this.isPermisoActualizarVendedorZona);	
		this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarVendedorZona.setVisible(this.isPermisoEliminarVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarVendedorZona.setVisible(this.isVisibilidadCeldaCancelarVendedorZona);							
		this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosVendedorZona.setVisible((this.isVisibilidadCeldaGuardarVendedorZona && this.isPermisoGuardarCambiosVendedorZona));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVendedorZona() {
		if(VendedorZonaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVendedorZona();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVendedorZona() {
	}
	
	public void jTableDatosVendedorZonaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVendedorZona(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVendedorZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorzona==null) {
						this.vendedorzona = new VendedorZona();
					}

					this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
				}

				if(this.vendedorzona.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.vendedorzona.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVendedorZonaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVendedorZona(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorZona.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorZona.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.vendedorzonaLogic.getConnexion());

				if(this.vendedorzona.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.vendedorzona.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorZona=(TitledBorder)this.jScrollPanelDatosVendedorZona.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVendedorZona.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVendedorZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorzona==null) {
						this.vendedorzona = new VendedorZona();
					}

					this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
				}

				if(this.vendedorzona.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.vendedorzona.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalVendedorZonaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebVendedorZona(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorZona.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorZona.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.vendedorzonaLogic.getConnexion());

				if(this.vendedorzona.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.vendedorzona.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorZona=(TitledBorder)this.jScrollPanelDatosVendedorZona.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderVendedorZona.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalVendedorZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorzona==null) {
						this.vendedorzona = new VendedorZona();
					}

					this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
				}

				if(this.vendedorzona.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.vendedorzona.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorVendedorZonaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="Vendedor";

			if(!this.sFinalQueryGeneral_vendedor.equals("")) {
				this.vendedorBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_vendedor);
				this.vendedorBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.vendedorBeanSwingJInternalFrame.procesarBusqueda(this.vendedorBeanSwingJInternalFrame.sAccionBusqueda);
				this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingVendedor(false);
			}

			if(!this.sFinalQueryComboVendedor.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderVendedorZona=null;
			TitledBorder titledBordervendedor=null;

			if(!this.jScrollPanelDatosVendedorZona.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderVendedorZona=(TitledBorder)this.jScrollPanelDatosVendedorZona.getBorder();
				titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderVendedorZona.getTitle() + " -> Vendedor");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_vendedorVendedorZonaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebVendedorZona(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorZona.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorZona.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.vendedorzonaLogic.getConnexion());

				if(this.vendedorzona.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.vendedorzona.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorZona=(TitledBorder)this.jScrollPanelDatosVendedorZona.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderVendedorZona.getTitle() + " -> Vendedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorVendedorZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorzona==null) {
						this.vendedorzona = new VendedorZona();
					}

					this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
				}

				if(this.vendedorzona.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.vendedorzona.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_zonaVendedorZonaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.zonaBeanSwingJInternalFrame.sTipoBusqueda="Zona";

			if(!this.sFinalQueryGeneral_zona.equals("")) {
				this.zonaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_zona);
				this.zonaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.zonaBeanSwingJInternalFrame.procesarBusqueda(this.zonaBeanSwingJInternalFrame.sAccionBusqueda);
				this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingZona(false);
			}

			if(!this.sFinalQueryComboZona.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderVendedorZona=null;
			TitledBorder titledBorderzona=null;

			if(!this.jScrollPanelDatosVendedorZona.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderVendedorZona=(TitledBorder)this.jScrollPanelDatosVendedorZona.getBorder();
				titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderVendedorZona.getTitle() + " -> Zona");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_zonaVendedorZonaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisozona=true;

			idTienePermisozona=this.tienePermisosUsuarioEnPaginaWebVendedorZona(ZonaConstantesFunciones.CLASSNAME);

			if(idTienePermisozona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorZona.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorZona.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);

				this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.zonaBeanSwingJInternalFrame.getZonaLogic().setConnexion(this.vendedorzonaLogic.getConnexion());

				if(this.vendedorzona.getid_zona()!=null) {
					this.zonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.zonaBeanSwingJInternalFrame.setIdActual(this.vendedorzona.getid_zona());
					this.zonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaZona();
				}

				JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorZona=(TitledBorder)this.jScrollPanelDatosVendedorZona.getBorder();
				TitledBorder titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderVendedorZona.getTitle() + " -> Zona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_zonaVendedorZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorzona==null) {
						this.vendedorzona = new VendedorZona();
					}

					this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
				}

				if(this.vendedorzona.getid_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_zona = "+this.vendedorzona.getid_zona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionVendedorZonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorZona(this.getvendedorzona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorzona==null) {
						this.vendedorzona = new VendedorZona();
					}

					this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);
				}

				if(this.vendedorzona.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.vendedorzona.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorZona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaVendedorZonaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorZona(false,false);

			this.getVendedorZonasFK_IdEmpresa();

			this.inicializarActualizarBindingVendedorZona(false);

			//if(VendedorZonaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorZona(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalVendedorZonaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorZona(false,false);

			this.getVendedorZonasFK_IdSucursal();

			this.inicializarActualizarBindingVendedorZona(false);

			//if(VendedorZonaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorZona(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorVendedorZonaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorZona(false,false);

			this.getVendedorZonasFK_IdVendedor();

			this.inicializarActualizarBindingVendedorZona(false);

			//if(VendedorZonaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorZona(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdZonaVendedorZonaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorZona(false,false);

			this.getVendedorZonasFK_IdZona();

			this.inicializarActualizarBindingVendedorZona(false);

			//if(VendedorZonaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorZona(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorzonaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVendedorZona() {
		if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) {
			this.jInternalFrameDetalleFormVendedorZona.setVisible(false);	    			
			this.jInternalFrameDetalleFormVendedorZona.dispose();
			this.jInternalFrameDetalleFormVendedorZona=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVendedorZona!=null) {
			this.jInternalFrameReporteDinamicoVendedorZona.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVendedorZona.dispose();
			this.jInternalFrameReporteDinamicoVendedorZona=null;
		}
		
		if(this.jInternalFrameImportacionVendedorZona!=null) {
			this.jInternalFrameImportacionVendedorZona.setVisible(false);	    			
			this.jInternalFrameImportacionVendedorZona.dispose();
			this.jInternalFrameImportacionVendedorZona=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVendedorZona();
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
			
			if(sTipo.equals("NuevoVendedorZona")) {
				jButtonNuevoVendedorZonaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVendedorZona")) {
				jButtonDuplicarVendedorZonaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVendedorZona")) {
				jButtonCopiarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("VerFormVendedorZona")) {
				jButtonVerFormVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVendedorZona")) {
				jButtonNuevoVendedorZonaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVendedorZona")) {
				jButtonDuplicarVendedorZonaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVendedorZona")) {
				jButtonNuevoVendedorZonaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVendedorZona")) {
				jButtonDuplicarVendedorZonaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVendedorZona")) {
				jButtonNuevoVendedorZonaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVendedorZona")) {
				jButtonNuevoVendedorZonaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVendedorZona")) {
				jButtonNuevoVendedorZonaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVendedorZona")) {
				jButtonModificarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVendedorZona")) {
				jButtonModificarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVendedorZona")) {
				jButtonModificarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVendedorZona")) {
				jButtonActualizarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVendedorZona")) {
				jButtonActualizarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVendedorZona")) {
				jButtonActualizarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("EliminarVendedorZona")) {
				jButtonEliminarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVendedorZona")) {
				jButtonEliminarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVendedorZona")) {
				jButtonEliminarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("CancelarVendedorZona")) {
				jButtonCancelarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVendedorZona")) {
				jButtonCancelarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVendedorZona")) {
				jButtonCancelarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("CerrarVendedorZona")) {
				jButtonCerrarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVendedorZona")) {
				jButtonCerrarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVendedorZona")) {
				jButtonCerrarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVendedorZona")) {
				jButtonMostrarOcultarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVendedorZona")) {
				jButtonCancelarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVendedorZona")) {
				jButtonGuardarCambiosVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVendedorZona")) {
				jButtonGuardarCambiosVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVendedorZona")) {
				jButtonCopiarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVendedorZona")) {
				jButtonVerFormVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVendedorZona")) {
				jButtonGuardarCambiosVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVendedorZona")) {
				jButtonCopiarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVendedorZona")) {
				jButtonVerFormVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVendedorZona")) {
				jButtonGuardarCambiosVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVendedorZona")) {
				jButtonGuardarCambiosVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVendedorZona")) {
				jButtonGuardarCambiosVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVendedorZona")) {
				jButtonRecargarInformacionVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVendedorZona")) {
				jButtonRecargarInformacionVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVendedorZona")) {
				jButtonRecargarInformacionVendedorZonaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVendedorZona")) {
				jButtonAnterioresVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVendedorZona")) {
				jButtonAnterioresVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVendedorZona")) {
				jButtonAnterioresVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVendedorZona")) {
				jButtonSiguientesVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVendedorZona")) {
				jButtonSiguientesVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVendedorZona")) {
				jButtonSiguientesVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVendedorZona") || sTipo.equals("MenuItemDetalleAbrirOrderByVendedorZona")) {
				jButtonAbrirOrderByVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVendedorZona") || sTipo.equals("MenuItemDetalleMostrarOcultarVendedorZona")) {
				jButtonMostrarOcultarVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVendedorZona")) {
				jButtonNuevoGuardarCambiosVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVendedorZona")) {
				jButtonNuevoGuardarCambiosVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVendedorZona")) {
				jButtonNuevoGuardarCambiosVendedorZonaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVendedorZona")) {
				jButtonCerrarReporteDinamicoVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVendedorZona")) {
				jButtonGenerarReporteDinamicoVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVendedorZona")) {
				
				jButtonGenerarExcelReporteDinamicoVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVendedorZona")) {
				jButtonCerrarImportacionVendedorZonaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVendedorZona")) {
				
				jButtonGenerarImportacionVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVendedorZona")) {
				
				jButtonAbrirImportacionVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVendedorZona")) {
				jComboBoxTiposAccionesVendedorZonaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVendedorZona")) {
				jComboBoxTiposRelacionesVendedorZonaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVendedorZona")) {
				jComboBoxTiposAccionesVendedorZonaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVendedorZona")) {
				
				jComboBoxTiposSeleccionarVendedorZonaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVendedorZona")) {
				jTextFieldValorCampoGeneralVendedorZonaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVendedorZona")) {
				jButtonAbrirOrderByVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVendedorZona")) {
				jButtonAbrirOrderByVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVendedorZona")) {
				jButtonCerrarOrderByVendedorZonaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVendedorZonaBusqueda")) {
				this.jButtonidVendedorZonaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVendedorZonaUpdate")) {
				this.jButtonid_empresaVendedorZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVendedorZonaBusqueda")) {
				this.jButtonid_empresaVendedorZonaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVendedorZonaUpdate")) {
				this.jButtonid_sucursalVendedorZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVendedorZonaBusqueda")) {
				this.jButtonid_sucursalVendedorZonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorVendedorZona")) {
				this.jButtonid_vendedorVendedorZonaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorVendedorZonaArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorVendedorZonaUpdate")) {
				this.jButtonid_vendedorVendedorZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorVendedorZonaBusqueda")) {
				this.jButtonid_vendedorVendedorZonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_zonaVendedorZona")) {
				this.jButtonid_zonaVendedorZonaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaVendedorZonaUpdate")) {
				this.jButtonid_zonaVendedorZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaVendedorZonaBusqueda")) {
				this.jButtonid_zonaVendedorZonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionVendedorZonaBusqueda")) {
				this.jButtonobservacionVendedorZonaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_vendedorVendedorZona")) {
				this.jButtonid_vendedorVendedorZonaActionPerformed(evt);
			}
			else if(sTipo.equals("id_zonaVendedorZona")) {
				this.jButtonid_zonaVendedorZonaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdVendedorVendedorZona")) {
				this.jButtonFK_IdVendedorVendedorZonaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdZonaVendedorZona")) {
				this.jButtonFK_IdZonaVendedorZonaActionPerformed(evt);
			}
			
			;
			
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVendedorZona();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorZonaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				


				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VendedorZona vendedorzonaLocal=null;
			
			if(!this.getEsControlTabla()) {
				vendedorzonaLocal=this.vendedorzona;
			} else {
				vendedorzonaLocal=this.vendedorzonaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
							
				
				


				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
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
			
			


			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorZonaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
								
						
				


				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
								
				
				


				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorZonaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
							
				
				


				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorZonaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
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
			
			


			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorZonaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
								
				
				


				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorZonaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorZonaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVendedorZona")) {
					jCheckBoxSeleccionarTodosVendedorZonaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVendedorZona")) {
					jCheckBoxSeleccionadosVendedorZonaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVendedorZona")) {
					
				}
				
				


				
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
												
				
				


				
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorZonaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorZonaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
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
			
			


			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorZonaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorzona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorzona);
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
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
				
				


				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorZona.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorZona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorZonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorzonaAnterior =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVendedorZona")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVendedorZonaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVendedorZona.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.vendedorzona =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.vendedorzona =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.vendedorzona);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVendedorZona")) {
				
				}
				
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVendedorZona")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVendedorZona.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVendedorZona")) {
			
			}
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVendedorZona();
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
			if(sTipo.equals("NuevoVendedorZona")) {
				jButtonNuevoVendedorZonaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVendedorZona")) {
				jButtonDuplicarVendedorZonaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVendedorZona")) {
				jButtonCopiarVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVendedorZona")) {
				jButtonVerFormVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVendedorZona")) {
				jButtonNuevoVendedorZonaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVendedorZona")) {
				jButtonModificarVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVendedorZona")) {
				jButtonActualizarVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVendedorZona")) {
				jButtonEliminarVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVendedorZona")) {
				jButtonGuardarCambiosVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVendedorZona")) {
				jButtonCancelarVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVendedorZona")) {
				jButtonCerrarVendedorZonaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVendedorZona")) {
				jButtonGuardarCambiosVendedorZonaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVendedorZona")) {
				jButtonNuevoGuardarCambiosVendedorZonaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVendedorZona")) {
				jButtonAbrirOrderByVendedorZonaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVendedorZona")) {
				jButtonRecargarInformacionVendedorZonaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVendedorZona")) {
				jButtonAnterioresVendedorZonaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVendedorZona")) {
				jButtonSiguientesVendedorZonaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVendedorZonaBusqueda")) {
				this.jButtonidVendedorZonaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVendedorZonaUpdate")) {
				this.jButtonid_empresaVendedorZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVendedorZonaBusqueda")) {
				this.jButtonid_empresaVendedorZonaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVendedorZonaUpdate")) {
				this.jButtonid_sucursalVendedorZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVendedorZonaBusqueda")) {
				this.jButtonid_sucursalVendedorZonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorVendedorZona")) {
				this.jButtonid_vendedorVendedorZonaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorVendedorZonaArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorVendedorZonaUpdate")) {
				this.jButtonid_vendedorVendedorZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorVendedorZonaBusqueda")) {
				this.jButtonid_vendedorVendedorZonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_zonaVendedorZona")) {
				this.jButtonid_zonaVendedorZonaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaVendedorZonaUpdate")) {
				this.jButtonid_zonaVendedorZonaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaVendedorZonaBusqueda")) {
				this.jButtonid_zonaVendedorZonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionVendedorZonaBusqueda")) {
				this.jButtonobservacionVendedorZonaBusquedaActionPerformed(evt);
			}
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVendedorZona();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVendedorZona")) {
				closingInternalFrameVendedorZona();
				
			} else if(sTipo.equals("jButtonCancelarVendedorZona")) {
				JInternalFrameBase jInternalFrameDetalleFormVendedorZona = (JInternalFrameBase)evt.getSource();
	            	
	            VendedorZonaBeanSwingJInternalFrame jInternalFrameParent=(VendedorZonaBeanSwingJInternalFrame)jInternalFrameDetalleFormVendedorZona.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVendedorZonaActionPerformed(null);
			}
			
			VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vendedorzona,new Object(),this.vendedorzonaParameterGeneral,this.vendedorzonaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVendedorZona(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVendedorZona(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVendedorZona(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.vendedorzona)) {
			if(!esControlTabla) {
				if(VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);			
				}
				
				if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVendedorZona(this.vendedorzona,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vendedorzonaReturnGeneral=vendedorzonaLogic.procesarEventosVendedorZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vendedorzonaLogic.getVendedorZonas(),this.vendedorzona,this.vendedorzonaParameterGeneral,this.isEsNuevoVendedorZona,classes);//this.vendedorzonaLogic.getVendedorZona()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVendedorZona(this.vendedorzonaReturnGeneral,this.vendedorzonaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVendedorZona(classes,this.vendedorzonaReturnGeneral,this.vendedorzonaBean,false);
					}
						
					if(this.vendedorzonaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVendedorZona(this.vendedorzonaReturnGeneral.getVendedorZona());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVendedorZona(this.vendedorzonaReturnGeneral.getVendedorZona());	
					}
						
					if(this.vendedorzonaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVendedorZona(this.vendedorzonaReturnGeneral.getVendedorZona(),classes);//this.vendedorzonaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVendedorZona(this.vendedorzona,classes);//this.vendedorzonaBean);									
				}
			
				if(VendedorZonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVendedorZona(this.vendedorzona,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorZona(this.vendedorzona);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.vendedorzonaAnterior!=null) {
						this.vendedorzona=this.vendedorzonaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vendedorzonaReturnGeneral=vendedorzonaLogic.procesarEventosVendedorZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vendedorzonaLogic.getVendedorZonas(),this.vendedorzona,this.vendedorzonaParameterGeneral,this.isEsNuevoVendedorZona,classes);//this.vendedorzonaLogic.getVendedorZona()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vendedorzonaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.vendedorzonaReturnGeneral.getVendedorZona(),vendedorzonaLogic.getVendedorZonas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.vendedorzonaReturnGeneral.getVendedorZona(),this.vendedorzonas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVendedorZona.repaint();
				
				//((AbstractTableModel) this.jTableDatosVendedorZona.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVendedorZona();
			}
		}
	}
	
	public void actualizarVisualTableDatosVendedorZona() throws Exception {
		
		VendedorZonaModel vendedorzonaModel=(VendedorZonaModel)this.jTableDatosVendedorZona.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vendedorzonaModel.vendedorzonas=this.vendedorzonaLogic.getVendedorZonas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			vendedorzonaModel.vendedorzonas=this.vendedorzonas;
		}
		
		
		((VendedorZonaModel) this.jTableDatosVendedorZona.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVendedorZona() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvendedorzonaAnterior(),this.vendedorzonaLogic.getVendedorZonas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvendedorzonaAnterior(),this.vendedorzonas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVendedorZona();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVendedorZona(VendedorZona vendedorzona,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
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
										
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vendedorzona,new Object(),generalEntityParameterGeneral,this.vendedorzonaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VendedorZonaConstantesFunciones.getClassesRelationshipsOfVendedorZona(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VendedorZonaConstantesFunciones.getClassesRelationshipsFromStringsOfVendedorZona(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVendedorZona(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VendedorZonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vendedorzona,new Object(),generalEntityParameterGeneral,this.vendedorzonaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVendedorZona(VendedorZonaBean vendedorzonaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVendedorZona(ArrayList<Classe> classes,VendedorZonaReturnGeneral vendedorzonaReturnGeneral,VendedorZonaBean vendedorzonaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVendedorZona(VendedorZona vendedorzona,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.vendedorzona)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVendedorZona = new VendedorZonaDetalleFormJInternalFrame(jDesktopPane,this.vendedorzonaSessionBean.getConGuardarRelaciones(),this.vendedorzonaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.setVisible(false);
		this.jInternalFrameDetalleFormVendedorZona.setSelected(false);						
		
		this.jInternalFrameDetalleFormVendedorZona.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVendedorZona.vendedorzonaLogic=this.vendedorzonaLogic;
		
		this.cargarCombosFrameForeignKeyVendedorZona("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVendedorZona();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVendedorZona();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVendedorZona("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVendedorZona();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVendedorZona.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVendedorZona"));
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonModificarVendedorZona.addActionListener(new ButtonActionListener(this,"ModificarVendedorZona"));

		
		this.jInternalFrameDetalleFormVendedorZona.jButtonModificarToolBarVendedorZona.addActionListener(new ButtonActionListener(this,"ModificarToolBarVendedorZona"));
					
		this.jInternalFrameDetalleFormVendedorZona.jMenuItemModificarVendedorZona.addActionListener(new ButtonActionListener(this,"MenuItemModificarVendedorZona"));		
		
		
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarVendedorZona.addActionListener (new ButtonActionListener(this,"ActualizarVendedorZona"));
		
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarToolBarVendedorZona.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVendedorZona"));
						
		this.jInternalFrameDetalleFormVendedorZona.jMenuItemActualizarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVendedorZona"));		
		
		
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarVendedorZona.addActionListener (new ButtonActionListener(this,"EliminarVendedorZona"));
		
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"EliminarToolBarVendedorZona"));
								
		this.jInternalFrameDetalleFormVendedorZona.jMenuItemEliminarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVendedorZona"));		
		
		
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarVendedorZona.addActionListener (new ButtonActionListener(this,"CancelarVendedorZona"));
		
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"CancelarToolBarVendedorZona"));
					
		this.jInternalFrameDetalleFormVendedorZona.jMenuItemCancelarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVendedorZona"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVendedorZona.jMenuItemDetalleCerrarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVendedorZona"));		
		
		
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVendedorZona"));
		
		
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVendedorZona"));
		
		
		
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVendedorZona"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonidVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"idVendedorZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_empresaVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_empresaVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVendedorZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_sucursalVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_sucursalVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVendedorZonaBusqueda"));
		//jButtonid_vendedorVendedorZona.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorVendedorZonaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZona.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZona"));
		//jButtonid_vendedorVendedorZonaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZonaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZonaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZonaBusqueda"));
		//jButtonid_zonaVendedorZona.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_zonaVendedorZonaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZona.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZona"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonobservacionVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"observacionVendedorZonaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVendedorZona.jTabbedPaneRelacionesVendedorZona.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVendedorZona"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVendedorZona"));
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVendedorZona"));
		}
		
		this.jTableDatosVendedorZona.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVendedorZona"));
		
		this.jTableDatosVendedorZona.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVendedorZona"));
		
		this.jButtonNuevoVendedorZona.addActionListener(new ButtonActionListener(this,"NuevoVendedorZona"));
		
		this.jButtonDuplicarVendedorZona.addActionListener(new ButtonActionListener(this,"DuplicarVendedorZona"));
		
		this.jButtonCopiarVendedorZona.addActionListener(new ButtonActionListener(this,"CopiarVendedorZona"));
		
		this.jButtonVerFormVendedorZona.addActionListener(new ButtonActionListener(this,"VerFormVendedorZona"));
		
		
		this.jButtonNuevoToolBarVendedorZona.addActionListener(new ButtonActionListener(this,"NuevoToolBarVendedorZona"));
			
		this.jButtonDuplicarToolBarVendedorZona.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVendedorZona"));
			
		this.jMenuItemNuevoVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVendedorZona"));
			
		this.jMenuItemDuplicarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVendedorZona"));		
		
		
		this.jButtonNuevoRelacionesVendedorZona.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVendedorZona"));
		
		
		this.jButtonNuevoRelacionesToolBarVendedorZona.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVendedorZona"));
			
		this.jMenuItemNuevoRelacionesVendedorZona.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVendedorZona"));		
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonModificarVendedorZona.addActionListener(new ButtonActionListener(this,"ModificarVendedorZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonModificarToolBarVendedorZona.addActionListener(new ButtonActionListener(this,"ModificarToolBarVendedorZona"));
			
			this.jInternalFrameDetalleFormVendedorZona.jMenuItemModificarVendedorZona.addActionListener(new ButtonActionListener(this,"MenuItemModificarVendedorZona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarVendedorZona.addActionListener (new ButtonActionListener(this,"ActualizarVendedorZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonActualizarToolBarVendedorZona.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVendedorZona"));
				
			this.jInternalFrameDetalleFormVendedorZona.jMenuItemActualizarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVendedorZona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarVendedorZona.addActionListener (new ButtonActionListener(this,"EliminarVendedorZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonEliminarToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"EliminarToolBarVendedorZona"));
						
			this.jInternalFrameDetalleFormVendedorZona.jMenuItemEliminarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVendedorZona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarVendedorZona.addActionListener (new ButtonActionListener(this,"CancelarVendedorZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonCancelarToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"CancelarToolBarVendedorZona"));
			
			this.jInternalFrameDetalleFormVendedorZona.jMenuItemCancelarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVendedorZona"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVendedorZona"));		
		
		
		this.jButtonCerrarVendedorZona.addActionListener (new ButtonActionListener(this,"CerrarVendedorZona"));
		
		
		this.jButtonCerrarToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"CerrarToolBarVendedorZona"));
			
		this.jMenuItemCerrarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVendedorZona"));
			
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jMenuItemDetalleCerrarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVendedorZona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosVendedorZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosVendedorZona"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVendedorZona"));
		}
		
		this.jButtonCopiarToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"CopiarToolBarVendedorZona"));
			
		this.jButtonVerFormToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"VerFormToolBarVendedorZona"));
		
		this.jMenuItemGuardarCambiosVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVendedorZona"));
			
		this.jMenuItemCopiarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVendedorZona"));		
		
		this.jMenuItemVerFormVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVendedorZona"));		
		
		
		this.jButtonGuardarCambiosTablaVendedorZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVendedorZona"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVendedorZona"));
			
		this.jMenuItemGuardarCambiosTablaVendedorZona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVendedorZona"));		
		
		
		
		this.jButtonRecargarInformacionVendedorZona.addActionListener (new ButtonActionListener(this,"RecargarInformacionVendedorZona"));
					
		this.jButtonRecargarInformacionToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVendedorZona"));
		
		this.jMenuItemRecargarInformacionVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVendedorZona"));		
		
		
		
		this.jButtonAnterioresVendedorZona.addActionListener (new ButtonActionListener(this,"AnterioresVendedorZona"));
		
		
		this.jButtonAnterioresToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVendedorZona"));
		
		this.jMenuItemAnterioresVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVendedorZona"));		
		
		
		this.jButtonSiguientesVendedorZona.addActionListener (new ButtonActionListener(this,"SiguientesVendedorZona"));
		
		
		this.jButtonSiguientesToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVendedorZona"));
			
		this.jMenuItemSiguientesVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVendedorZona"));
			
		this.jMenuItemAbrirOrderByVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVendedorZona"));
			
		this.jMenuItemMostrarOcultarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVendedorZona"));
			
		this.jMenuItemDetalleAbrirOrderByVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVendedorZona"));
			
		this.jMenuItemDetalleMostarOcultarVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVendedorZona"));		
		
		
		this.jButtonNuevoGuardarCambiosVendedorZona.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVendedorZona"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVendedorZona"));
			
		this.jMenuItemNuevoGuardarCambiosVendedorZona.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVendedorZona"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVendedorZona.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVendedorZona"));

		this.jCheckBoxSeleccionadosVendedorZona.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVendedorZona"));
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVendedorZona"));
		}
		
		
		this.jComboBoxTiposRelacionesVendedorZona.addActionListener (new ButtonActionListener(this,"TiposRelacionesVendedorZona"));
			
		this.jComboBoxTiposAccionesVendedorZona.addActionListener (new ButtonActionListener(this,"TiposAccionesVendedorZona"));
					
		this.jComboBoxTiposSeleccionarVendedorZona.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVendedorZona"));
			
		this.jTextFieldValorCampoGeneralVendedorZona.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVendedorZona"));		
		
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonidVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"idVendedorZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_empresaVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_empresaVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVendedorZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_sucursalVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_sucursalVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVendedorZonaBusqueda"));
		//jButtonid_vendedorVendedorZona.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorVendedorZonaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZona.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZona"));
		//jButtonid_vendedorVendedorZonaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZonaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZonaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZonaBusqueda"));
		//jButtonid_zonaVendedorZona.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_zonaVendedorZonaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZona.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZona"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonobservacionVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"observacionVendedorZonaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdVendedorVendedorZona.addActionListener(new ButtonActionListener(this,"FK_IdVendedorVendedorZona"));

			this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZona"));

			this.jButtonFK_IdZonaVendedorZona.addActionListener(new ButtonActionListener(this,"FK_IdZonaVendedorZona"));

			this.jButtonBuscarFK_IdZonaid_zonaVendedorZona.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZona"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVendedorZona!=null) {
				this.jInternalFrameReporteDinamicoVendedorZona.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVendedorZona"));
				this.jInternalFrameReporteDinamicoVendedorZona.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVendedorZona"));
				this.jInternalFrameReporteDinamicoVendedorZona.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVendedorZona"));
			}
			
			//this.jButtonCerrarReporteDinamicoVendedorZona.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVendedorZona"));				
			//this.jButtonGenerarReporteDinamicoVendedorZona.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVendedorZona"));
			//this.jButtonGenerarExcelReporteDinamicoVendedorZona.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVendedorZona"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVendedorZona!=null) {
				this.jInternalFrameImportacionVendedorZona.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVendedorZona"));
				this.jInternalFrameImportacionVendedorZona.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVendedorZona"));
				this.jInternalFrameImportacionVendedorZona.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVendedorZona"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVendedorZona.addActionListener (new ButtonActionListener(this,"AbrirOrderByVendedorZona"));
			
			this.jButtonAbrirOrderByToolBarVendedorZona.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVendedorZona"));			
			
			if(this.jInternalFrameOrderByVendedorZona!=null) {
				this.jInternalFrameOrderByVendedorZona.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVendedorZona"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVendedorZona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorZona.jTabbedPaneRelacionesVendedorZona.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVendedorZona"));
		
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
            		closingInternalFrameVendedorZona();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVendedorZona.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVendedorZona = (JInternalFrameBase)event.getSource();
	            	
	            VendedorZonaBeanSwingJInternalFrame jInternalFrameParent=(VendedorZonaBeanSwingJInternalFrame)jInternalFrameDetalleFormVendedorZona.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVendedorZonaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVendedorZona.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVendedorZonaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVendedorZona.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVendedorZona.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorZonaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorZonaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorZonaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVendedorZona";
		inputMap = this.jButtonNuevoVendedorZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVendedorZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVendedorZonaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorZonaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorZonaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorZonaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVendedorZona";
		inputMap = this.jButtonNuevoRelacionesVendedorZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVendedorZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVendedorZonaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVendedorZona";
		inputMap = this.jButtonModificarVendedorZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVendedorZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVendedorZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVendedorZona";
		inputMap = this.jButtonActualizarVendedorZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVendedorZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVendedorZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVendedorZona";
		inputMap = this.jButtonEliminarVendedorZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVendedorZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVendedorZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVendedorZona";
		inputMap = this.jButtonCancelarVendedorZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVendedorZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVendedorZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVendedorZona";
		inputMap = this.jButtonCerrarVendedorZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVendedorZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVendedorZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVendedorZona";
		inputMap = this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosVendedorZona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVendedorZona.jButtonGuardarCambiosVendedorZona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVendedorZonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVendedorZona.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVendedorZonaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVendedorZona.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVendedorZonaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVendedorZona.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVendedorZonaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVendedorZona.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVendedorZonaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonidVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"idVendedorZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_empresaVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_empresaVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVendedorZonaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_sucursalVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_sucursalVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVendedorZonaBusqueda"));
		//jButtonid_vendedorVendedorZona.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorVendedorZonaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZona.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZona"));
		//jButtonid_vendedorVendedorZonaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZonaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZonaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZonaBusqueda"));
		//jButtonid_zonaVendedorZona.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_zonaVendedorZonaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZona.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZona"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZonaUpdate.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZonaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorZona.jButtonobservacionVendedorZonaBusqueda.addActionListener(new ButtonActionListener(this,"observacionVendedorZonaBusqueda"));
		
		
		this.jButtonFK_IdVendedorVendedorZona.addActionListener(new ButtonActionListener(this,"FK_IdVendedorVendedorZona"));

		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorZona"));

		this.jButtonFK_IdZonaVendedorZona.addActionListener(new ButtonActionListener(this,"FK_IdZonaVendedorZona"));

		this.jButtonBuscarFK_IdZonaid_zonaVendedorZona.addActionListener(new ButtonActionListener(this,"id_zonaVendedorZona"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVendedorZona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVendedorZonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVendedorZonaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVendedorZona.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVendedorZona(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VendedorZona vendedorzonaAux:this.vendedorzonaLogic.getVendedorZonas()) {
					vendedorzonaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VendedorZona vendedorzonaAux:vendedorzonas) {
					vendedorzonaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVendedorZonaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVendedorZona(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VendedorZona vendedorzonaAux:this.vendedorzonaLogic.getVendedorZonas()) {
						vendedorzonaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VendedorZona vendedorzonaAux:vendedorzonas) {
						vendedorzonaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VendedorZona vendedorzonaAux:this.vendedorzonaLogic.getVendedorZonas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VendedorZona vendedorzonaAux:vendedorzonas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVendedorZona(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVendedorZona.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVendedorZona.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVendedorZonaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVendedorZona(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVendedorZona.getSelectedRows();
			
			VendedorZona vendedorzonaLocal=new VendedorZona();
			
			//this.seleccionarTodosVendedorZona(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorzonaLocal =(VendedorZona) this.vendedorzonaLogic.getVendedorZonas().toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					vendedorzonaLocal =(VendedorZona) this.vendedorzonas.toArray()[this.jTableDatosVendedorZona.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				vendedorzonaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VendedorZona vendedorzonaAux:this.vendedorzonaLogic.getVendedorZonas()) {
						vendedorzonaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VendedorZona vendedorzonaAux:vendedorzonas) {
						vendedorzonaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVendedorZona(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVendedorZona.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVendedorZona.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVendedorZona,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVendedorZonaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVendedorZonaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVendedorZonaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVendedorZona(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVendedorZona.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VendedorZona vendedorzonaAux:this.vendedorzonaLogic.getVendedorZonas()) {
				
						if(sTipoSeleccionar.equals(VendedorZonaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							vendedorzonaAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VendedorZona vendedorzonaAux:vendedorzonas) {
					
						if(sTipoSeleccionar.equals(VendedorZonaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							vendedorzonaAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVendedorZona(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVendedorZonaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVendedorZona(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVendedorZona=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVendedorZona.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVendedorZona) {				
					conSplash=true;//false;										
					
					//this.startProcessVendedorZona(conSplash);
				
					this.generarReporteVendedorZonasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVendedorZonasSeleccionados();
				//this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVendedorZonasSeleccionados(false);
				//this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVendedorZonasSeleccionados(true);
				//this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVendedorZona();
				
				this.exportarVendedorZonasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVendedorZonas();
				//this.importarVendedorZonas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVendedorZona();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVendedorZonasSeleccionados();
				//this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Vendedor Zona", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVendedorZona();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVendedorZona)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVendedorZona(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.setSelectedIndex(0);					
				}	
			} 			
			else if(VendedorZonaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVendedorZona) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVendedorZona(conSplash);
					
						//this.actualizarParametrosGeneralVendedorZona();
						
						this.generarReporteProcesoAccionVendedorZonasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VendedorZonaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Vendedor ZonaS SELECCIONADOS?", "MANTENIMIENTO DE Vendedor Zona", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVendedorZona();
				
						this.actualizarParametrosGeneralVendedorZona();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.vendedorzonaReturnGeneral=vendedorzonaLogic.procesarAccionVendedorZonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.vendedorzonaLogic.getVendedorZonas(),this.vendedorzonaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVendedorZonaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVendedorZona();
					
					VendedorZonaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVendedorZonaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVendedorZona.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVendedorZona.jComboBoxTiposAccionesFormularioVendedorZona.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVendedorZona(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVendedorZonaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVendedorZona();
			
			if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();		
			VendedorZona vendedorzona=new VendedorZona();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVendedorZona(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVendedorZona.getSelectedItem();
			
			
			
			
			vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
			//this.sTipoAccion;
			
			if(vendedorzonasSeleccionados.size()==1) {
				for(VendedorZona vendedorzonaAux:vendedorzonasSeleccionados) {
					vendedorzona=vendedorzonaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVendedorZona();
			
      		//this.finishProcessVendedorZona(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVendedorZonaReturnGeneral() throws Exception {
		if(this.vendedorzonaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.vendedorzonaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.vendedorzonaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.vendedorzonaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.vendedorzonaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.vendedorzonaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVendedorZona(false);
		}
		
		if(this.vendedorzonaReturnGeneral.getConRetornoLista() || this.vendedorzonaReturnGeneral.getConRetornoObjeto()) {
			if(this.vendedorzonaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vendedorzonaLogic.setVendedorZonas(this.vendedorzonaReturnGeneral.getVendedorZonas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.vendedorzonaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vendedorzonaLogic.setVendedorZona(this.vendedorzonaReturnGeneral.getVendedorZona());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVendedorZona(false);
		}
	}
	
	public void actualizarParametrosGeneralVendedorZona() throws Exception {
		
		
	}
	
	public ArrayList<VendedorZona> getVendedorZonasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVendedorZona) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VendedorZona vendedorzonaAux:vendedorzonaLogic.getVendedorZonas()) {
					if(vendedorzonaAux.getIsSelected()) {
						vendedorzonasSeleccionados.add(vendedorzonaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VendedorZona vendedorzonaAux:this.vendedorzonas) {
					if(vendedorzonaAux.getIsSelected()) {
						vendedorzonasSeleccionados.add(vendedorzonaAux);				
					}
				}
			}
			
			if(vendedorzonasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						vendedorzonasSeleccionados.addAll(this.vendedorzonaLogic.getVendedorZonas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						vendedorzonasSeleccionados.addAll(this.vendedorzonas);				
					}
				}
			}
		} else {
			vendedorzonasSeleccionados.add(this.vendedorzona);
		}
		
		return vendedorzonasSeleccionados;
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
	
	public void generarReporteVendedorZonasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVendedorZonasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVendedorZonasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVendedorZonasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVendedorZonasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Vendedor Zona",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVendedorZonasSeleccionados() throws Exception {
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();		
		
		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVendedorZonas("Todos",vendedorzonasSeleccionados);
		
	}	
	
	public void generarReporteNormalVendedorZonasSeleccionados() throws Exception {
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();		
		
		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVendedorZonas("Todos",vendedorzonasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVendedorZonasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();
		
		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVendedorZonas("Todos",vendedorzonasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVendedorZonasSeleccionados() throws Exception {
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVendedorZona();
		
		
		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVendedorZona();
		
		
		//this.generarReporteVendedorZonas("Todos",vendedorzonasSeleccionados ,vendedorzonaImplementable,vendedorzonaImplementableHome);
	}
	
	public void mostrarImportacionVendedorZonas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVendedorZona();
		
		this.abrirFrameImportacionVendedorZona();		
		
			
		//this.generarReporteVendedorZonas("Todos",vendedorzonasSeleccionados ,vendedorzonaImplementable,vendedorzonaImplementableHome);
	}
	
	public void importarVendedorZonas() throws Exception {		
	
	}
	
	public void exportarVendedorZonasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVendedorZonasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVendedorZonasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVendedorZonasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Vendedor Zona",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVendedorZonasSeleccionados() throws Exception {
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();		
		
		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorzona."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVendedorZona(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VendedorZona vendedorzonaAux:vendedorzonasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVendedorZona(vendedorzonaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//vendedorzonaAux.setsDetalleGeneralEntityReporte(vendedorzonaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVendedorZona(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VendedorZonaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorZonaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorZonaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorZonaConstantesFunciones.LABEL_IDZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorZonaConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVendedorZona(VendedorZona vendedorzona,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=vendedorzona.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorzona.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorzona.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorzona.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorzona.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorzona.getzona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorzona.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVendedorZonasSeleccionados() throws Exception {
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();		
		
		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorzona.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VendedorZonas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVendedorZona(row);				
				iRow++;
			}				
			
			for(VendedorZona vendedorzonaAux:vendedorzonasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVendedorZona(vendedorzonaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVendedorZonasSeleccionados() throws Exception {
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();		
		
		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorzona.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("vendedorzonas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("vendedorzona");
			//elementRoot.appendChild(element);
		
			for(VendedorZona vendedorzonaAux:vendedorzonasSeleccionados) {
				element = document.createElement("vendedorzona");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVendedorZona(vendedorzonaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Zona",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVendedorZona(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_IDZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorZonaConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVendedorZona(VendedorZona vendedorzona,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorzona.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorzona.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorzona.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorzona.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorzona.getzona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorzona.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlVendedorZona(VendedorZona vendedorzona,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VendedorZonaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(vendedorzona.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VendedorZonaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(vendedorzona.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VendedorZonaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(vendedorzona.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(VendedorZonaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(vendedorzona.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementvendedor_descripcion = document.createElement(VendedorZonaConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(vendedorzona.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementzona_descripcion = document.createElement(VendedorZonaConstantesFunciones.IDZONA);
		elementzona_descripcion.appendChild(document.createTextNode(vendedorzona.getzona_descripcion()));
		element.appendChild(elementzona_descripcion);

		Element elementobservacion = document.createElement(VendedorZonaConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(vendedorzona.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoVendedorZonasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VendedorZona> vendedorzonasSeleccionados=new ArrayList<VendedorZona>();
		
		vendedorzonasSeleccionados=this.getVendedorZonasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVendedorZona(vendedorzonasSeleccionados);
		
		this.generarReporteVendedorZonas("Todos",vendedorzonasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVendedorZona(ArrayList<VendedorZona> vendedorzonasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VendedorZona vendedorzonaAux:vendedorzonasSeleccionados) {
				vendedorzonaAux.setsDetalleGeneralEntityReporte(vendedorzonaAux.toString());
			
				if(sTipoSeleccionar.equals(VendedorZonaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					vendedorzonaAux.setsDescripcionGeneralEntityReporte1(vendedorzonaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					vendedorzonaAux.setsDescripcionGeneralEntityReporte1(vendedorzonaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					vendedorzonaAux.setsDescripcionGeneralEntityReporte1(vendedorzonaAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VendedorZonaConstantesFunciones.LABEL_IDZONA)) {
					existe=true;
					vendedorzonaAux.setsDescripcionGeneralEntityReporte1(vendedorzonaAux.getzona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VendedorZonaConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					vendedorzonaAux.setsDescripcionGeneralEntityReporte1(vendedorzonaAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorZonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVendedorZona(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVendedorZona=true;
				this.isVisibilidadCeldaNuevoRelacionesVendedorZona=true;
				this.isVisibilidadCeldaGuardarCambiosVendedorZona=true;
			}
			
			this.isVisibilidadCeldaModificarVendedorZona=false;
			this.isVisibilidadCeldaActualizarVendedorZona=false;
			this.isVisibilidadCeldaEliminarVendedorZona=false;
			this.isVisibilidadCeldaCancelarVendedorZona=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorZona=true;
				} else {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVendedorZona=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=false;
			this.isVisibilidadCeldaModificarVendedorZona=false;
			this.isVisibilidadCeldaActualizarVendedorZona=true;
			this.isVisibilidadCeldaEliminarVendedorZona=false;
			this.isVisibilidadCeldaCancelarVendedorZona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorZona=true;
				} else {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVendedorZona=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=false;
			this.isVisibilidadCeldaModificarVendedorZona=false;
			this.isVisibilidadCeldaActualizarVendedorZona=true;
			this.isVisibilidadCeldaEliminarVendedorZona=true;
			this.isVisibilidadCeldaCancelarVendedorZona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorZona=true;
				} else {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVendedorZona=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=false;
			this.isVisibilidadCeldaModificarVendedorZona=false;
			this.isVisibilidadCeldaActualizarVendedorZona=true;
			this.isVisibilidadCeldaEliminarVendedorZona=false;
			this.isVisibilidadCeldaCancelarVendedorZona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				} else {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVendedorZona=true;
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=true;
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=true;
			this.isVisibilidadCeldaModificarVendedorZona=false;
			this.isVisibilidadCeldaActualizarVendedorZona=false;
			this.isVisibilidadCeldaEliminarVendedorZona=false;
			this.isVisibilidadCeldaCancelarVendedorZona=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorZona=true;
				} else {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVendedorZona=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=false;
			this.isVisibilidadCeldaActualizarVendedorZona=false;
			this.isVisibilidadCeldaEliminarVendedorZona=false;
			this.isVisibilidadCeldaCancelarVendedorZona=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				} else {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVendedorZona=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=false;
			this.isVisibilidadCeldaModificarVendedorZona=true;
			this.isVisibilidadCeldaActualizarVendedorZona=false;
			this.isVisibilidadCeldaEliminarVendedorZona=false;
			this.isVisibilidadCeldaCancelarVendedorZona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				} else {
					this.isVisibilidadCeldaGuardarVendedorZona=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VendedorZonaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVendedorZona=true;
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=true;
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=true;
		} else {
			this.actualizarEstadoPanelsVendedorZona(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVendedorZona=false;
			//this.isVisibilidadCeldaVerFormVendedorZona=false;
			this.isVisibilidadCeldaDuplicarVendedorZona=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!vendedorzonaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=false;
		} else {
			this.isVisibilidadCeldaNuevoVendedorZona=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorZona=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			if(!vendedorzonaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVendedorZona=false;												
			}
			
			this.jButtonCerrarVendedorZona.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVendedorZona=false;
		}
		
		if(!this.permiteMantenimiento(this.vendedorzona)) {
			this.isVisibilidadCeldaActualizarVendedorZona=false;
			this.isVisibilidadCeldaEliminarVendedorZona=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVendedorZona() {
	}
	
	public void actualizarEstadoPanelsVendedorZona(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVendedorZona!=null) {
				this.jScrollPanelDatosEdicionVendedorZona.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorZona!=null) {
				this.jTabbedPaneBusquedasVendedorZona.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVendedorZona!=null) {
				this.jScrollPanelDatosVendedorZona.setVisible(true);
			}
			
			if(this.jPanelPaginacionVendedorZona!=null) {
				this.jPanelPaginacionVendedorZona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVendedorZona!=null) {
				this.jPanelParametrosReportesVendedorZona.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVendedorZona!=null) {
				this.jScrollPanelDatosEdicionVendedorZona.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorZona!=null) {
				this.jTabbedPaneBusquedasVendedorZona.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVendedorZona!=null) {
				this.jScrollPanelDatosVendedorZona.setVisible(false);
			}
			
			if(this.jPanelPaginacionVendedorZona!=null) {
				this.jPanelPaginacionVendedorZona.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVendedorZona!=null) {
				this.jPanelParametrosReportesVendedorZona.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVendedorZona!=null) {
				this.jScrollPanelDatosEdicionVendedorZona.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorZona!=null) {
				this.jTabbedPaneBusquedasVendedorZona.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVendedorZona!=null) {
				this.jScrollPanelDatosVendedorZona.setVisible(false);
			}
			
			if(this.jPanelPaginacionVendedorZona!=null) {
				this.jPanelPaginacionVendedorZona.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVendedorZona!=null) {
				this.jPanelParametrosReportesVendedorZona.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVendedorZona!=null) {
				this.jScrollPanelDatosEdicionVendedorZona.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorZona!=null) {
				this.jTabbedPaneBusquedasVendedorZona.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVendedorZona!=null) {
				this.jScrollPanelDatosVendedorZona.setVisible(false);
			}
			
			if(this.jPanelPaginacionVendedorZona!=null) {
				this.jPanelPaginacionVendedorZona.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVendedorZona!=null) {
				this.jPanelParametrosReportesVendedorZona.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVendedorZona!=null) {
				this.jScrollPanelDatosEdicionVendedorZona.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorZona!=null) {
				this.jTabbedPaneBusquedasVendedorZona.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVendedorZona!=null) {
				this.jScrollPanelDatosVendedorZona.setVisible(true);
			}
			
			if(this.jPanelPaginacionVendedorZona!=null) {
				this.jPanelPaginacionVendedorZona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVendedorZona!=null) {
				this.jPanelParametrosReportesVendedorZona.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVendedorZona!=null) {
				this.jScrollPanelDatosEdicionVendedorZona.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorZona!=null) {
				this.jTabbedPaneBusquedasVendedorZona.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVendedorZona!=null) {
				this.jScrollPanelDatosVendedorZona.setVisible(true);
			}
			
			if(this.jPanelPaginacionVendedorZona!=null) {
				this.jPanelPaginacionVendedorZona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVendedorZona!=null) {
				this.jPanelParametrosReportesVendedorZona.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVendedorZona!=null) {
				this.jScrollPanelDatosEdicionVendedorZona.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorZona!=null) {
				this.jTabbedPaneBusquedasVendedorZona.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVendedorZona!=null) {
				this.jScrollPanelDatosVendedorZona.setVisible(true);
			}
			
			if(this.jPanelPaginacionVendedorZona!=null) {
				this.jPanelPaginacionVendedorZona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVendedorZona!=null) {
				this.jPanelParametrosReportesVendedorZona.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVendedorZona!=null) {
					this.jTabbedPaneBusquedasVendedorZona.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVendedorZona!=null) {
				this.jPanelParametrosReportesVendedorZona.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorZona!=null) {
				this.jTabbedPaneBusquedasVendedorZona.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVendedorZona!=null) {
				this.jPanelParametrosReportesVendedorZona.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdVendedor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorZona.remove(jPanelFK_IdVendedorVendedorZona);}

			this.isVisibilidadFK_IdZona=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasVendedorZona.remove(jPanelFK_IdZonaVendedorZona);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdVendedor=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorZona.remove(jPanelFK_IdVendedorVendedorZona);}

			this.isVisibilidadFK_IdZona=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasVendedorZona.remove(jPanelFK_IdZonaVendedorZona);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadFK_IdVendedor=isParaVendedor;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorZona.remove(jPanelFK_IdVendedorVendedorZona);}

			this.isVisibilidadFK_IdZona=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasVendedorZona.remove(jPanelFK_IdZonaVendedorZona);}
		}
		
	}

	public void setVisibilidadBusquedasParaZona(Boolean isParaZona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaZonaNegation=!isParaZona;

			this.isVisibilidadFK_IdVendedor=isParaZonaNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorZona.remove(jPanelFK_IdVendedorVendedorZona);}

			this.isVisibilidadFK_IdZona=isParaZona;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasVendedorZona.remove(jPanelFK_IdZonaVendedorZona);}
		}
		
	}
	
	
	
	

	public String registrarSesionVendedorZonaParaBusquedaVendedores() throws Exception {
		Boolean isPaginaPopupVendedor=false;

		try {

			if(vendedorzonaSessionBean==null) {
				vendedorzonaSessionBean=new VendedorZonaSessionBean();
			}

			if(vendedorSessionBean==null) {
				vendedorSessionBean=new VendedorSessionBean();
			}

			vendedorSessionBean.setsPathNavegacionActual(vendedorzonaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VendedorConstantesFunciones.SCLASSWEBTITULO);
			vendedorSessionBean.setisPermiteRecargarInformacion(false);
			vendedorSessionBean.setisPaginaPopup(true);
			isPaginaPopupVendedor=vendedorSessionBean.getisPaginaPopup();
			vendedorSessionBean.setisPaginaPopup(false);
			vendedorSessionBean.setEstaModoBusqueda(true);
			vendedorSessionBean.setsFuncionBusquedaRapida("window.opener.vendedorzonaFuncionGeneral.setCombosCodigoDesdeBusquedaid_vendedor(TO_REPLACE);");
			vendedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVendedor(true);
			vendedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVendedor(VendedorZonaConstantesFunciones.SNOMBREOPCION);
			//vendedorSessionBean.setisBusquedaDesdeForeignKeySesionVendedorZona(true);
			//vendedorSessionBean.setlidVendedorZonaActual(this.idVendedorZonaActual);

			vendedorzonaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyVendedorZona(true);
			vendedorzonaSessionBean.setlIdVendedorZonaActualForeignKey(this.idVendedorZonaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionVendedorZonaParaBusquedaZonas() throws Exception {
		Boolean isPaginaPopupZona=false;

		try {

			if(vendedorzonaSessionBean==null) {
				vendedorzonaSessionBean=new VendedorZonaSessionBean();
			}

			if(zonaSessionBean==null) {
				zonaSessionBean=new ZonaSessionBean();
			}

			zonaSessionBean.setsPathNavegacionActual(vendedorzonaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ZonaConstantesFunciones.SCLASSWEBTITULO);
			zonaSessionBean.setisPermiteRecargarInformacion(false);
			zonaSessionBean.setisPaginaPopup(true);
			isPaginaPopupZona=zonaSessionBean.getisPaginaPopup();
			zonaSessionBean.setisPaginaPopup(false);
			zonaSessionBean.setEstaModoBusqueda(true);
			zonaSessionBean.setsFuncionBusquedaRapida("window.opener.vendedorzonaFuncionGeneral.setCombosCodigoDesdeBusquedaid_zona(TO_REPLACE);");
			zonaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeZona(true);
			zonaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeZona(VendedorZonaConstantesFunciones.SNOMBREOPCION);
			//zonaSessionBean.setisBusquedaDesdeForeignKeySesionVendedorZona(true);
			//zonaSessionBean.setlidVendedorZonaActual(this.idVendedorZonaActual);

			vendedorzonaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyVendedorZona(true);
			vendedorzonaSessionBean.setlIdVendedorZonaActualForeignKey(this.idVendedorZonaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VendedorZonaSessionBean vendedorzonaSessionBean=new VendedorZonaSessionBean();
		
		if(this.vendedorzonaSessionBean==null) {
			this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
		}
		
		this.vendedorzonaSessionBean.setsUltimaBusquedaVendedorZona(this.getsAccionBusqueda());
		this.vendedorzonaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.vendedorzonaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			vendedorzonaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			vendedorzonaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdVendedor")) {
			vendedorzonaSessionBean.setid_vendedor(this.getid_vendedorFK_IdVendedor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdZona")) {
			vendedorzonaSessionBean.setid_zona(this.getid_zonaFK_IdZona());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VendedorZonaSessionBean vendedorzonaSessionBean=new VendedorZonaSessionBean();
		
		if(this.vendedorzonaSessionBean==null) {
			this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
		}
		
		if(this.vendedorzonaSessionBean.getsUltimaBusquedaVendedorZona()!=null&&!this.vendedorzonaSessionBean.getsUltimaBusquedaVendedorZona().equals("")) {
			this.setsAccionBusqueda(vendedorzonaSessionBean.getsUltimaBusquedaVendedorZona());
			this.setiNumeroPaginacion(vendedorzonaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(vendedorzonaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(vendedorzonaSessionBean.getid_empresa());
				vendedorzonaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(vendedorzonaSessionBean.getid_sucursal());
				vendedorzonaSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdVendedor")) {
				this.setid_vendedorFK_IdVendedor(vendedorzonaSessionBean.getid_vendedor());
				vendedorzonaSessionBean.setid_vendedor(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdZona")) {
				this.setid_zonaFK_IdZona(vendedorzonaSessionBean.getid_zona());
				vendedorzonaSessionBean.setid_zona(-1L);
			}
		}
		
		this.vendedorzonaSessionBean.setsUltimaBusquedaVendedorZona("");
		this.vendedorzonaSessionBean.setiNumeroPaginacion(VendedorZonaConstantesFunciones.INUMEROPAGINACION);
		this.vendedorzonaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVendedorZona(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVendedorZona() {
		this.updateBorderResaltarBusquedasFormularioVendedorZona();
		this.updateVisibilidadBusquedasFormularioVendedorZona();
		this.updateHabilitarBusquedasFormularioVendedorZona();
	}
	
	public void updateBorderResaltarBusquedasFormularioVendedorZona() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVendedorZona.getComponents().length>0) {
	

		if(this.vendedorzonaConstantesFunciones.resaltarFK_IdVendedorVendedorZona!=null) {
			index= this.jTabbedPaneBusquedasVendedorZona.indexOfComponent(this.jPanelFK_IdVendedorVendedorZona);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorZona.getComponent(index);
				jPanel.setBorder(this.vendedorzonaConstantesFunciones.resaltarFK_IdVendedorVendedorZona);
			}
		}

		if(this.vendedorzonaConstantesFunciones.resaltarFK_IdZonaVendedorZona!=null) {
			index= this.jTabbedPaneBusquedasVendedorZona.indexOfComponent(this.jPanelFK_IdZonaVendedorZona);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorZona.getComponent(index);
				jPanel.setBorder(this.vendedorzonaConstantesFunciones.resaltarFK_IdZonaVendedorZona);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVendedorZona() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVendedorZona.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVendedorZona.indexOfComponent(this.jPanelFK_IdVendedorVendedorZona);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorZona.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vendedorzonaConstantesFunciones.mostrarFK_IdVendedorVendedorZona);
			if(!this.vendedorzonaConstantesFunciones.mostrarFK_IdVendedorVendedorZona && index>-1) {
				this.jTabbedPaneBusquedasVendedorZona.remove(index);
			}

			index= this.jTabbedPaneBusquedasVendedorZona.indexOfComponent(this.jPanelFK_IdZonaVendedorZona);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorZona.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vendedorzonaConstantesFunciones.mostrarFK_IdZonaVendedorZona);
			if(!this.vendedorzonaConstantesFunciones.mostrarFK_IdZonaVendedorZona && index>-1) {
				this.jTabbedPaneBusquedasVendedorZona.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVendedorZona() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVendedorZona.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVendedorZona.indexOfComponent(this.jPanelFK_IdVendedorVendedorZona);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorZona.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vendedorzonaConstantesFunciones.activarFK_IdVendedorVendedorZona);
				this.jTabbedPaneBusquedasVendedorZona.setEnabledAt(index,this.vendedorzonaConstantesFunciones.activarFK_IdVendedorVendedorZona);
			}

			index= this.jTabbedPaneBusquedasVendedorZona.indexOfComponent(this.jPanelFK_IdZonaVendedorZona);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorZona.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vendedorzonaConstantesFunciones.activarFK_IdZonaVendedorZona);
				this.jTabbedPaneBusquedasVendedorZona.setEnabledAt(index,this.vendedorzonaConstantesFunciones.activarFK_IdZonaVendedorZona);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVendedorZona(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdVendedor")) {
			index= this.jTabbedPaneBusquedasVendedorZona.indexOfComponent(this.jPanelFK_IdVendedorVendedorZona);

			this.jTabbedPaneBusquedasVendedorZona.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorZona.getComponent(index);

			this.vendedorzonaConstantesFunciones.setResaltarFK_IdVendedorVendedorZona(resaltar);

			jPanel.setBorder(this.vendedorzonaConstantesFunciones.resaltarFK_IdVendedorVendedorZona);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdZona")) {
			index= this.jTabbedPaneBusquedasVendedorZona.indexOfComponent(this.jPanelFK_IdZonaVendedorZona);

			this.jTabbedPaneBusquedasVendedorZona.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorZona.getComponent(index);

			this.vendedorzonaConstantesFunciones.setResaltarFK_IdZonaVendedorZona(resaltar);

			jPanel.setBorder(this.vendedorzonaConstantesFunciones.resaltarFK_IdZonaVendedorZona);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVendedorZona.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVendedorZona() throws Exception {

		if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVendedorZona();
		this.updateVisibilidadResaltarControlesFormularioVendedorZona();
		this.updateHabilitarResaltarControlesFormularioVendedorZona();
		
	}
	
	public void updateBorderResaltarControlesFormularioVendedorZona() throws Exception {
		if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.vendedorzonaConstantesFunciones.resaltaridVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona!=null) {this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.setBorder(this.vendedorzonaConstantesFunciones.resaltaridVendedorZona);}
		if(this.vendedorzonaConstantesFunciones.resaltarid_empresaVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona!=null) {this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.setBorder(this.vendedorzonaConstantesFunciones.resaltarid_empresaVendedorZona);}
		if(this.vendedorzonaConstantesFunciones.resaltarid_sucursalVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona!=null) {this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.setBorder(this.vendedorzonaConstantesFunciones.resaltarid_sucursalVendedorZona);}
		if(this.vendedorzonaConstantesFunciones.resaltarid_vendedorVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona!=null) {this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.setBorder(this.vendedorzonaConstantesFunciones.resaltarid_vendedorVendedorZona);}
		if(this.vendedorzonaConstantesFunciones.resaltarid_zonaVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona!=null) {this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.setBorder(this.vendedorzonaConstantesFunciones.resaltarid_zonaVendedorZona);}
		if(this.vendedorzonaConstantesFunciones.resaltarobservacionVendedorZona!=null && this.jInternalFrameDetalleFormVendedorZona!=null) {this.jInternalFrameDetalleFormVendedorZona.jTextAreaobservacionVendedorZona.setBorder(this.vendedorzonaConstantesFunciones.resaltarobservacionVendedorZona);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVendedorZona() throws Exception {		
		if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) {
	
		//this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostraridVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jPanelidVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostraridVendedorZona);
		//this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_empresaVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jPanelid_empresaVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_empresaVendedorZona);
		//this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_sucursalVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jPanelid_sucursalVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_sucursalVendedorZona);
		//this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_vendedorVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jPanelid_vendedorVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_vendedorVendedorZona);
			this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_vendedorVendedorZona);
		//this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_zonaVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jPanelid_zonaVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_zonaVendedorZona);
			this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarid_zonaVendedorZona);
		//this.jInternalFrameDetalleFormVendedorZona.jTextAreaobservacionVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarobservacionVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jPanelobservacionVendedorZona.setVisible(this.vendedorzonaConstantesFunciones.mostrarobservacionVendedorZona);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVendedorZona() throws Exception {
		if(this.jInternalFrameDetalleFormVendedorZona==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVendedorZona!=null) {
	
		this.jInternalFrameDetalleFormVendedorZona.jLabelidVendedorZona.setEnabled(this.vendedorzonaConstantesFunciones.activaridVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_empresaVendedorZona.setEnabled(this.vendedorzonaConstantesFunciones.activarid_empresaVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_sucursalVendedorZona.setEnabled(this.vendedorzonaConstantesFunciones.activarid_sucursalVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_vendedorVendedorZona.setEnabled(this.vendedorzonaConstantesFunciones.activarid_vendedorVendedorZona);
			this.jInternalFrameDetalleFormVendedorZona.jButtonid_vendedorVendedorZona.setEnabled(this.vendedorzonaConstantesFunciones.activarid_vendedorVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jComboBoxid_zonaVendedorZona.setEnabled(this.vendedorzonaConstantesFunciones.activarid_zonaVendedorZona);
			this.jInternalFrameDetalleFormVendedorZona.jButtonid_zonaVendedorZona.setEnabled(this.vendedorzonaConstantesFunciones.activarid_zonaVendedorZona);
		this.jInternalFrameDetalleFormVendedorZona.jTextAreaobservacionVendedorZona.setEnabled(this.vendedorzonaConstantesFunciones.activarobservacionVendedorZona);
		}
	}
	
		
}