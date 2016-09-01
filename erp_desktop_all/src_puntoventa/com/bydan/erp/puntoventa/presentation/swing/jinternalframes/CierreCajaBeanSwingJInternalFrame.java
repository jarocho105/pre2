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

import com.bydan.erp.puntoventa.util.CierreCajaConstantesFunciones;
import com.bydan.erp.puntoventa.util.CierreCajaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CierreCajaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.CierreCajaBean;
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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CierreCajaBeanSwingJInternalFrame extends CierreCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CierreCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CierreCaja> cierrecajaValidator = new ClassValidator<CierreCaja>(CierreCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CierreCaja cierrecaja;	
	public CierreCaja cierrecajaAux;
	public CierreCaja cierrecajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CierreCaja cierrecajaTotales;
	public Long idCierreCajaActual;
	public Long iIdNuevoCierreCaja=0L;
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

	public String sFinalQueryComboTipoFormaPago="";

	public List<TipoFormaPago> tipoformapagosForeignKey;

	public List<TipoFormaPago> gettipoformapagosForeignKey() {
		return tipoformapagosForeignKey;
	}

	public void settipoformapagosForeignKey(List<TipoFormaPago> tipoformapagosForeignKey) {
		this.tipoformapagosForeignKey = tipoformapagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFormaPago tipoformapagoForeignKey;

	public TipoFormaPago gettipoformapagoForeignKey() {
		return tipoformapagoForeignKey;
	}

	public void settipoformapagoForeignKey(TipoFormaPago tipoformapagoForeignKey) {
		this.tipoformapagoForeignKey = tipoformapagoForeignKey;
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
	
	public Boolean isPermisoTodoCierreCaja;
	public Boolean isPermisoNuevoCierreCaja;
	public Boolean isPermisoActualizarCierreCaja;
	public Boolean isPermisoActualizarOriginalCierreCaja;
	public Boolean isPermisoEliminarCierreCaja;
	public Boolean isPermisoGuardarCambiosCierreCaja;
	public Boolean isPermisoConsultaCierreCaja;
	public Boolean isPermisoBusquedaCierreCaja;
	public Boolean isPermisoReporteCierreCaja;
	public Boolean isPermisoPaginacionMedioCierreCaja;
	public Boolean isPermisoPaginacionAltoCierreCaja;
	public Boolean isPermisoPaginacionTodoCierreCaja;
	public Boolean isPermisoCopiarCierreCaja;
	public Boolean isPermisoVerFormCierreCaja;
	public Boolean isPermisoDuplicarCierreCaja;
	public Boolean isPermisoOrdenCierreCaja;
	
	
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
	
	public CierreCajaParameterReturnGeneral cierrecajaReturnGeneral;
	public CierreCajaParameterReturnGeneral cierrecajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCierreCaja=false;
	public Boolean esParaAccionDesdeFormularioCierreCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CierreCajaSessionBeanAdditional cierrecajaSessionBeanAdditional=null;
	
	public CierreCajaSessionBeanAdditional getCierreCajaSessionBeanAdditional() {
		return this.cierrecajaSessionBeanAdditional;
	}
	
	public void setCierreCajaSessionBeanAdditional(CierreCajaSessionBeanAdditional cierrecajaSessionBeanAdditional) {
		try {
			this.cierrecajaSessionBeanAdditional=cierrecajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CierreCajaBeanSwingJInternalFrameAdditional cierrecajaBeanSwingJInternalFrameAdditional=null;
	//public class CierreCajaBeanSwingJInternalFrame
	
	public CierreCajaBeanSwingJInternalFrameAdditional getCierreCajaBeanSwingJInternalFrameAdditional() {
		return this.cierrecajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setCierreCajaBeanSwingJInternalFrameAdditional(CierreCajaBeanSwingJInternalFrameAdditional cierrecajaBeanSwingJInternalFrameAdditional) {
		try {
			this.cierrecajaBeanSwingJInternalFrameAdditional=cierrecajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CierreCajaLogic cierrecajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CierreCaja cierrecajaBean;
	public CierreCajaConstantesFunciones cierrecajaConstantesFunciones;
	//public CierreCajaParameterReturnGeneral cierrecajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public TipoFormaPagoLogic tipoformapagoLogic;
	
	//PARAMETROS
	
	
	//public List<CierreCaja> cierrecajas;	
	//public List<CierreCaja> cierrecajasEliminados;
	//public List<CierreCaja> cierrecajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCierreCaja=false;
	public Boolean isVisibilidadCeldaDuplicarCierreCaja=true;
	public Boolean isVisibilidadCeldaCopiarCierreCaja=true;
	public Boolean isVisibilidadCeldaVerFormCierreCaja=true;
	public Boolean isVisibilidadCeldaOrdenCierreCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCierreCaja=false;
	public Boolean isVisibilidadCeldaModificarCierreCaja=false;
	public Boolean isVisibilidadCeldaActualizarCierreCaja=false;
	public Boolean isVisibilidadCeldaEliminarCierreCaja=false;
	public Boolean isVisibilidadCeldaCancelarCierreCaja=false;
	public Boolean isVisibilidadCeldaGuardarCierreCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCierreCaja=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoFormaPago=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoCierreCaja() {
		return this.iIdNuevoCierreCaja;
	}

	public void setiIdNuevoCierreCaja(Long iIdNuevoCierreCaja) {
		this.iIdNuevoCierreCaja = iIdNuevoCierreCaja;
	}
	
	public Long getidCierreCajaActual() {
		return this.idCierreCajaActual;
	}

	public void setidCierreCajaActual(Long idCierreCajaActual) {
		this.idCierreCajaActual = idCierreCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CierreCaja getcierrecaja() {
		return this.cierrecaja;
	}

	public void setcierrecaja(CierreCaja cierrecaja) {
		this.cierrecaja = cierrecaja;
	}
	
	public CierreCaja getcierrecajaAux() {
		return this.cierrecajaAux;
	}

	public void setcierrecajaAux(CierreCaja cierrecajaAux) {
		this.cierrecajaAux = cierrecajaAux;
	}				
	
	public CierreCaja getcierrecajaAnterior() {
		return this.cierrecajaAnterior;
	}

	public void setcierrecajaAnterior(CierreCaja cierrecajaAnterior) {
		this.cierrecajaAnterior = cierrecajaAnterior;
	}	
	
	public CierreCaja getcierrecajaTotales() {
		return this.cierrecajaTotales;
	}

	public void setcierrecajaTotales(CierreCaja cierrecajaTotales) {
		this.cierrecajaTotales = cierrecajaTotales;
	}	
	
	public CierreCaja getcierrecajaBean() {
		return this.cierrecajaBean;
	}

	public void setcierrecajaBean(CierreCaja cierrecajaBean) {
		this.cierrecajaBean = cierrecajaBean;
	}	
	
	public CierreCajaParameterReturnGeneral getcierrecajaReturnGeneral() {
		return this.cierrecajaReturnGeneral;
	}

	public void setcierrecajaReturnGeneral(CierreCajaParameterReturnGeneral cierrecajaReturnGeneral) {
		this.cierrecajaReturnGeneral = cierrecajaReturnGeneral;
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

	public Long id_tipo_forma_pagoFK_IdTipoFormaPago=-1L;

	public Long getid_tipo_forma_pagoFK_IdTipoFormaPago() {
		return this.id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

	public void setid_tipo_forma_pagoFK_IdTipoFormaPago(Long id_tipo_forma_pagoFK_IdTipoFormaPago) {
		this.id_tipo_forma_pagoFK_IdTipoFormaPago = id_tipo_forma_pagoFK_IdTipoFormaPago;
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
	
	
	public CierreCajaLogic getCierreCajaLogic()	{		
		return cierrecajaLogic;
	}

	public void setCierreCajaLogic(CierreCajaLogic cierrecajaLogic) {
		this.cierrecajaLogic = cierrecajaLogic;
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
	
	public Boolean getIsEsNuevoCierreCaja() {
		return isEsNuevoCierreCaja;
	}

	public void setIsEsNuevoCierreCaja(Boolean isEsNuevoCierreCaja) {
		this.isEsNuevoCierreCaja = isEsNuevoCierreCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioCierreCaja() {
		return esParaAccionDesdeFormularioCierreCaja;
	}
	
	public void setEsParaAccionDesdeFormularioCierreCaja(Boolean esParaAccionDesdeFormularioCierreCaja) {
		this.esParaAccionDesdeFormularioCierreCaja = esParaAccionDesdeFormularioCierreCaja;
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

			if(this.cierrecajaSessionBean==null) {
				this.cierrecajaSessionBean=new CierreCajaSessionBean();
			}

			if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cierrecajaSessionBean.getlidEmpresaActual());
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

			if(this.cierrecajaSessionBean==null) {
				this.cierrecajaSessionBean=new CierreCajaSessionBean();
			}

			if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cierrecajaSessionBean.getlidSucursalActual());
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

			if(this.cierrecajaSessionBean==null) {
				this.cierrecajaSessionBean=new CierreCajaSessionBean();
			}

			if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(cierrecajaSessionBean.getlidUsuarioActual());
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

	public void cargarCombosTipoFormaPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFormaPagoLogic tipoformapagoLogic=new TipoFormaPagoLogic();

			//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

			if(this.cierrecajaSessionBean==null) {
				this.cierrecajaSessionBean=new CierreCajaSessionBean();
			}

			if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

					tipoformapagoLogic.getTodosTipoFormaPagosWithConnection(sFinalQuery,new Pagination());

					this.tipoformapagosForeignKey=tipoformapagoLogic.getTipoFormaPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFormaPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformapagoLogic.getEntityWithConnection(cierrecajaSessionBean.getlidTipoFormaPagoActual());
					this.tipoformapagosForeignKey.add(tipoformapagoLogic.getTipoFormaPago());
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

					if(this.cierrecaja!=null) {
						this.cierrecaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCierreCaja!=null) {
						this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCierreCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCierreCajaGenerico)throws Exception
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
				jComboBoxid_empresaCierreCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCierreCajaGenerico!=null && jComboBoxid_empresaCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaCierreCajaGenerico.setSelectedIndex(0);
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

					if(this.cierrecaja!=null) {
						this.cierrecaja.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCierreCaja!=null) {
						this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCierreCaja.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCierreCajaGenerico)throws Exception
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
				jComboBoxid_sucursalCierreCajaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCierreCajaGenerico!=null && jComboBoxid_sucursalCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCierreCajaGenerico.setSelectedIndex(0);
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

					if(this.cierrecaja!=null) {
						this.cierrecaja.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormCierreCaja!=null) {
						this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioCierreCaja.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioCierreCajaGenerico)throws Exception
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
				jComboBoxid_usuarioCierreCajaGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioCierreCajaGenerico!=null && jComboBoxid_usuarioCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_usuarioCierreCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFormaPagoForeignKey(Long idTipoFormaPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoformapagoTemp!=null) {

					if(this.cierrecaja!=null) {
						this.cierrecaja.setTipoFormaPago(tipoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormCierreCaja!=null) {
						this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.setSelectedItem(tipoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_forma_pagoCierreCaja.setSelectedItem(tipoformapagoTemp);
					if(this.jInternalFrameDetalleFormCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoformapagoTemp!=null && jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja!=null) {
						jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setSelectedItem(tipoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja!=null) {
							//jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setSelectedItem(tipoformapagoTemp);
							if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.getItemCount()>0) {
								jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setSelectedIndex(0);
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

	public String getActualTipoFormaPagoForeignKeyDescripcion(Long idTipoFormaPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}


			sDescripcion=TipoFormaPagoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFormaPagoForeignKeyGenerico(Long idTipoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_forma_pagoCierreCajaGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(tipoformapagoTemp!=null) {
				jComboBoxid_tipo_forma_pagoCierreCajaGenerico.setSelectedItem(tipoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_forma_pagoCierreCajaGenerico!=null && jComboBoxid_tipo_forma_pagoCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_forma_pagoCierreCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CierreCaja cierrecaja,JComboBox jComboBoxid_empresaCierreCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCierreCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCierreCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cierrecaja.setid_empresa(empresaAux.getId());
				cierrecaja.setempresa_descripcion(CierreCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cierrecaja.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CierreCaja cierrecaja,JComboBox jComboBoxid_sucursalCierreCajaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCierreCajaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCierreCajaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cierrecaja.setid_sucursal(sucursalAux.getId());
				cierrecaja.setsucursal_descripcion(CierreCajaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cierrecaja.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(CierreCaja cierrecaja,JComboBox jComboBoxid_usuarioCierreCajaGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioCierreCajaGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioCierreCajaGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				cierrecaja.setid_usuario(usuarioAux.getId());
				cierrecaja.setusuario_descripcion(CierreCajaConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				cierrecaja.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFormaPagoForeignKey(CierreCaja cierrecaja,JComboBox jComboBoxid_tipo_forma_pagoCierreCajaGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoAux=new TipoFormaPago();

			if(jComboBoxid_tipo_forma_pagoCierreCajaGenerico==null) {
				tipoformapagoAux=(TipoFormaPago)this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.getSelectedItem();
			} else {
				tipoformapagoAux=(TipoFormaPago)jComboBoxid_tipo_forma_pagoCierreCajaGenerico.getSelectedItem();
			}

			if(tipoformapagoAux!=null && tipoformapagoAux.getId()!=null) {
				cierrecaja.setid_tipo_forma_pago(tipoformapagoAux.getId());
				cierrecaja.settipoformapago_descripcion(CierreCajaConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoAux));
				cierrecaja.setTipoFormaPago(tipoformapagoAux);			}
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

					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) { 
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreCaja!=null) { 
					}

					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) { 
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreCaja!=null) { 
					}

					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) { 
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreCaja!=null) { 
					}

					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFormaPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFormaPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) { 
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.addItem(tipoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreCaja!=null) { 
					}

					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.addItem(tipoformapago);
							}
						}

						if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCierreCaja!=null) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCierreCaja!=null) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoFormaPagoForeignKey(TipoFormaPago tipoformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.setSelectedItem(tipoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreCaja!=null) {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setSelectedItem(tipoformapago);
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCierreCaja() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CierreCajaConstantesFunciones.refrescarForeignKeysDescripcionesCierreCaja(this.cierrecajaLogic.getCierreCajas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CierreCajaConstantesFunciones.refrescarForeignKeysDescripcionesCierreCaja(this.cierrecajas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(TipoFormaPago.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cierrecajaLogic.setCierreCajas(this.cierrecajas);
			cierrecajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CierreCajaParameterReturnGeneral getCierreCajaParameterGeneral() {
		return this.cierrecajaParameterGeneral;
	}
	
	public void setCierreCajaParameterGeneral(CierreCajaParameterReturnGeneral cierrecajaParameterGeneral) {
		this.cierrecajaParameterGeneral = cierrecajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCierreCaja() {
		return isPermisoTodoCierreCaja;
	}

	public void setIsPermisoTodoCierreCaja(Boolean isPermisoTodoCierreCaja) {
		this.isPermisoTodoCierreCaja = isPermisoTodoCierreCaja;
	}

	public Boolean getIsPermisoNuevoCierreCaja() {
		return isPermisoNuevoCierreCaja;
	}

	public void setIsPermisoNuevoCierreCaja(Boolean isPermisoNuevoCierreCaja) {
		this.isPermisoNuevoCierreCaja = isPermisoNuevoCierreCaja;
	}

	public Boolean getIsPermisoActualizarCierreCaja() {
		return isPermisoActualizarCierreCaja;
	}

	public void setIsPermisoActualizarCierreCaja(Boolean isPermisoActualizarCierreCaja) {
		this.isPermisoActualizarCierreCaja = isPermisoActualizarCierreCaja;
	}

	public Boolean getIsPermisoEliminarCierreCaja() {
		return isPermisoEliminarCierreCaja;
	}

	public void setIsPermisoEliminarCierreCaja(Boolean isPermisoEliminarCierreCaja) {
		this.isPermisoEliminarCierreCaja = isPermisoEliminarCierreCaja;
	}

	public Boolean getIsPermisoGuardarCambiosCierreCaja() {
		return isPermisoGuardarCambiosCierreCaja;
	}

	public void setIsPermisoGuardarCambiosCierreCaja(Boolean isPermisoGuardarCambiosCierreCaja) {
		this.isPermisoGuardarCambiosCierreCaja = isPermisoGuardarCambiosCierreCaja;
	}
	
	public Boolean getIsPermisoConsultaCierreCaja() {
		return isPermisoConsultaCierreCaja;
	}

	public void setIsPermisoConsultaCierreCaja(Boolean isPermisoConsultaCierreCaja) {
		this.isPermisoConsultaCierreCaja = isPermisoConsultaCierreCaja;
	}

	public Boolean getIsPermisoBusquedaCierreCaja() {
		return isPermisoBusquedaCierreCaja;
	}

	public void setIsPermisoBusquedaCierreCaja(Boolean isPermisoBusquedaCierreCaja) {
		this.isPermisoBusquedaCierreCaja = isPermisoBusquedaCierreCaja;
	}

	public Boolean getIsPermisoReporteCierreCaja() {
		return isPermisoReporteCierreCaja;
	}

	public void setIsPermisoReporteCierreCaja(Boolean isPermisoReporteCierreCaja) {
		this.isPermisoReporteCierreCaja = isPermisoReporteCierreCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioCierreCaja() {
		return isPermisoPaginacionMedioCierreCaja;
	}

	public void setIsPermisoPaginacionMedioCierreCaja(Boolean isPermisoPaginacionMedioCierreCaja) {
		this.isPermisoPaginacionMedioCierreCaja = isPermisoPaginacionMedioCierreCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoCierreCaja() {
		return isPermisoPaginacionTodoCierreCaja;
	}

	public void setIsPermisoPaginacionTodoCierreCaja(Boolean isPermisoPaginacionTodoCierreCaja) {
		this.isPermisoPaginacionTodoCierreCaja = isPermisoPaginacionTodoCierreCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoCierreCaja() {
		return isPermisoPaginacionAltoCierreCaja;
	}

	public void setIsPermisoPaginacionAltoCierreCaja(Boolean isPermisoPaginacionAltoCierreCaja) {
		this.isPermisoPaginacionAltoCierreCaja = isPermisoPaginacionAltoCierreCaja;
	}
	
	public Boolean getIsPermisoCopiarCierreCaja() {
		return isPermisoCopiarCierreCaja;
	}

	public void setIsPermisoCopiarCierreCaja(Boolean isPermisoCopiarCierreCaja) {
		this.isPermisoCopiarCierreCaja = isPermisoCopiarCierreCaja;
	}
	
	public Boolean getIsPermisoVerFormCierreCaja() {
		return isPermisoVerFormCierreCaja;
	}

	public void setIsPermisoVerFormCierreCaja(Boolean isPermisoVerFormCierreCaja) {
		this.isPermisoVerFormCierreCaja = isPermisoVerFormCierreCaja;
	}
	
	public Boolean getIsPermisoDuplicarCierreCaja() {
		return isPermisoDuplicarCierreCaja;
	}

	public void setIsPermisoDuplicarCierreCaja(Boolean isPermisoDuplicarCierreCaja) {
		this.isPermisoDuplicarCierreCaja = isPermisoDuplicarCierreCaja;
	}
	
	public Boolean getIsPermisoOrdenCierreCaja() {
		return isPermisoOrdenCierreCaja;
	}

	public void setIsPermisoOrdenCierreCaja(Boolean isPermisoOrdenCierreCaja) {
		this.isPermisoOrdenCierreCaja = isPermisoOrdenCierreCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCierreCaja() {
		return isVisibilidadCeldaNuevoCierreCaja;
	}

	public void setIsVisibilidadCeldaNuevoCierreCaja(Boolean isVisibilidadCeldaNuevoCierreCaja) {
		this.isVisibilidadCeldaNuevoCierreCaja = isVisibilidadCeldaNuevoCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCierreCaja() {
		return isVisibilidadCeldaDuplicarCierreCaja;
	}

	public void setIsVisibilidadCeldaDuplicarCierreCaja(Boolean isVisibilidadCeldaDuplicarCierreCaja) {
		this.isVisibilidadCeldaDuplicarCierreCaja = isVisibilidadCeldaDuplicarCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCierreCaja() {
		return isVisibilidadCeldaCopiarCierreCaja;
	}

	public void setIsVisibilidadCeldaCopiarCierreCaja(Boolean isVisibilidadCeldaCopiarCierreCaja) {
		this.isVisibilidadCeldaCopiarCierreCaja = isVisibilidadCeldaCopiarCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCierreCaja() {
		return isVisibilidadCeldaVerFormCierreCaja;
	}

	public void setIsVisibilidadCeldaVerFormCierreCaja(Boolean isVisibilidadCeldaVerFormCierreCaja) {
		this.isVisibilidadCeldaVerFormCierreCaja = isVisibilidadCeldaVerFormCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCierreCaja() {
		return isVisibilidadCeldaOrdenCierreCaja;
	}

	public void setIsVisibilidadCeldaOrdenCierreCaja(Boolean isVisibilidadCeldaOrdenCierreCaja) {
		this.isVisibilidadCeldaOrdenCierreCaja = isVisibilidadCeldaOrdenCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCierreCaja() {
		return isVisibilidadCeldaNuevoRelacionesCierreCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCierreCaja(Boolean isVisibilidadCeldaNuevoRelacionesCierreCaja) {
		this.isVisibilidadCeldaNuevoRelacionesCierreCaja = isVisibilidadCeldaNuevoRelacionesCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCierreCaja() {
		return isVisibilidadCeldaModificarCierreCaja;
	}

	public void setIsVisibilidadCeldaModificarCierreCaja(Boolean isVisibilidadCeldaModificarCierreCaja) {
		this.isVisibilidadCeldaModificarCierreCaja = isVisibilidadCeldaModificarCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCierreCaja() {
		return isVisibilidadCeldaActualizarCierreCaja;
	}

	public void setIsVisibilidadCeldaActualizarCierreCaja(Boolean isVisibilidadCeldaActualizarCierreCaja) {
		this.isVisibilidadCeldaActualizarCierreCaja = isVisibilidadCeldaActualizarCierreCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarCierreCaja() {
		return isVisibilidadCeldaEliminarCierreCaja;
	}

	public void setIsVisibilidadCeldaEliminarCierreCaja(Boolean isVisibilidadCeldaEliminarCierreCaja) {
		this.isVisibilidadCeldaEliminarCierreCaja = isVisibilidadCeldaEliminarCierreCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarCierreCaja() {
		return isVisibilidadCeldaCancelarCierreCaja;
	}

	public void setIsVisibilidadCeldaCancelarCierreCaja(Boolean isVisibilidadCeldaCancelarCierreCaja) {
		this.isVisibilidadCeldaCancelarCierreCaja = isVisibilidadCeldaCancelarCierreCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarCierreCaja() {
		return isVisibilidadCeldaGuardarCierreCaja;
	}

	public void setIsVisibilidadCeldaGuardarCierreCaja(Boolean isVisibilidadCeldaGuardarCierreCaja) {
		this.isVisibilidadCeldaGuardarCierreCaja = isVisibilidadCeldaGuardarCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCierreCaja() {
		return isVisibilidadCeldaGuardarCambiosCierreCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCierreCaja(Boolean isVisibilidadCeldaGuardarCambiosCierreCaja) {
		this.isVisibilidadCeldaGuardarCambiosCierreCaja = isVisibilidadCeldaGuardarCambiosCierreCaja;
	}
		
	public CierreCajaSessionBean getcierrecajaSessionBean() {
		return this.cierrecajaSessionBean;
	}
	
	public void setcierrecajaSessionBean(CierreCajaSessionBean cierrecajaSessionBean) {
		this.cierrecajaSessionBean=cierrecajaSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoFormaPago() {
		return this.isVisibilidadFK_IdTipoFormaPago;
	}

	public void setisVisibilidadFK_IdTipoFormaPago(Boolean isVisibilidadFK_IdTipoFormaPago) {
		this.isVisibilidadFK_IdTipoFormaPago=isVisibilidadFK_IdTipoFormaPago;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCierreCaja(CierreCaja cierrecaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cierrecaja,null);
				this.setActualParaGuardarSucursalForeignKey(cierrecaja,null);
				this.setActualParaGuardarUsuarioForeignKey(cierrecaja,null);
				this.setActualParaGuardarTipoFormaPagoForeignKey(cierrecaja,null);
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
	
	public void bugActualizarReferenciaActual(CierreCaja cierrecaja,CierreCaja cierrecajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCierreCaja(cierrecaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cierrecajaAux.setId(cierrecaja.getId());
		cierrecajaAux.setVersionRow(cierrecaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCierreCaja();
		
			int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cierrecajaValidator.getInvalidValues(this.cierrecaja);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cierrecajaLogic.setDatosCliente(datosCliente);
			cierrecajaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cierrecajaAux=new  CierreCaja();
				
				cierrecajaAux.setIsNew(true);
				cierrecajaAux.setIsChanged(true);
				
				cierrecajaAux.setCierreCajaOriginal(this.cierrecaja);
				
				cierrecajaAux.setId(this.cierrecaja.getId());	
				cierrecajaAux.setVersionRow(this.cierrecaja.getVersionRow());	
				cierrecajaAux.setid_empresa(this.cierrecaja.getid_empresa());	
				cierrecajaAux.setid_sucursal(this.cierrecaja.getid_sucursal());	
				cierrecajaAux.setid_usuario(this.cierrecaja.getid_usuario());	
				cierrecajaAux.setid_tipo_forma_pago(this.cierrecaja.getid_tipo_forma_pago());	
				cierrecajaAux.setfecha(this.cierrecaja.getfecha());	
				cierrecajaAux.settotal(this.cierrecaja.gettotal());	
				cierrecajaAux.settotal_diferencia(this.cierrecaja.gettotal_diferencia());	
				cierrecajaAux.setesta_activo(this.cierrecaja.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cierrecajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cierrecajaAux,cierrecajaLogic.getCierreCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cierrecajaAux,cierrecajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cierrecajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cierrecajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajaLogic.saveCierreCajas();//WithConnection
						//cierrecajaLogic.getSetVersionRowCierreCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cierrecaja,cierrecajaAux);
					
					this.refrescarForeignKeysDescripcionesCierreCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cierrecajaLogic.saveCierreCajaRelaciones(cierrecajaAux);//WithConnection
								//cierrecajaLogic.getSetVersionRowCierreCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cierrecaja,cierrecajaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cierrecajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cierrecajaAux,cierrecajaLogic.getCierreCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cierrecajaAux,cierrecajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cierrecaja,cierrecajaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cierrecajaAux=new  CierreCaja();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cierrecajaSessionBean.getEsGuardarRelacionado() 
					|| (this.cierrecajaSessionBean.getEsGuardarRelacionado() && this.cierrecaja.getId()>=0)) {
						
					cierrecajaAux.setIsNew(false);
				}
				
				cierrecajaAux.setIsDeleted(false);
			
				cierrecajaAux.setId(this.cierrecaja.getId());	
				cierrecajaAux.setVersionRow(this.cierrecaja.getVersionRow());	
				cierrecajaAux.setid_empresa(this.cierrecaja.getid_empresa());	
				cierrecajaAux.setid_sucursal(this.cierrecaja.getid_sucursal());	
				cierrecajaAux.setid_usuario(this.cierrecaja.getid_usuario());	
				cierrecajaAux.setid_tipo_forma_pago(this.cierrecaja.getid_tipo_forma_pago());	
				cierrecajaAux.setfecha(this.cierrecaja.getfecha());	
				cierrecajaAux.settotal(this.cierrecaja.gettotal());	
				cierrecajaAux.settotal_diferencia(this.cierrecaja.gettotal_diferencia());	
				cierrecajaAux.setesta_activo(this.cierrecaja.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cierrecajaAux,cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cierrecajaAux,cierrecajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cierrecajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cierrecajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajaLogic.saveCierreCajas();//WithConnection
						//cierrecajaLogic.getSetVersionRowCierreCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cierrecaja,cierrecajaAux);
					
					this.refrescarForeignKeysDescripcionesCierreCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cierrecajaLogic.saveCierreCajaRelaciones(cierrecajaAux);//WithConnection
								//cierrecajaLogic.getSetVersionRowCierreCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cierrecaja,cierrecajaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cierrecajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cierrecajaAux,cierrecajaLogic.getCierreCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cierrecajaAux,cierrecajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cierrecaja,cierrecajaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cierrecajaAux=new  CierreCaja();
				
				cierrecajaAux.setIsNew(false);
				cierrecajaAux.setIsChanged(false);
				
				cierrecajaAux.setIsDeleted(true);
				
				cierrecajaAux.setId(this.cierrecaja.getId());	
				cierrecajaAux.setVersionRow(this.cierrecaja.getVersionRow());	
				cierrecajaAux.setid_empresa(this.cierrecaja.getid_empresa());	
				cierrecajaAux.setid_sucursal(this.cierrecaja.getid_sucursal());	
				cierrecajaAux.setid_usuario(this.cierrecaja.getid_usuario());	
				cierrecajaAux.setid_tipo_forma_pago(this.cierrecaja.getid_tipo_forma_pago());	
				cierrecajaAux.setfecha(this.cierrecaja.getfecha());	
				cierrecajaAux.settotal(this.cierrecaja.gettotal());	
				cierrecajaAux.settotal_diferencia(this.cierrecaja.gettotal_diferencia());	
				cierrecajaAux.setesta_activo(this.cierrecaja.getesta_activo());	
				
				if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cierrecajaAux.getId()>=0) {	
						this.cierrecajasEliminados.add(cierrecajaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cierrecajaAux,cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cierrecajaAux,cierrecajas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cierrecajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cierrecajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajaLogic.saveCierreCajas();//WithConnection
						//cierrecajaLogic.getSetVersionRowCierreCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cierrecajaLogic.saveCierreCajaRelaciones(cierrecajaAux);//WithConnection
								//cierrecajaLogic.getSetVersionRowCierreCajas();//WithConnection
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
							if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cierrecajaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cierrecajaAux,cierrecajaLogic.getCierreCajas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cierrecajaAux,cierrecajas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getCierreCajas().addAll(this.cierrecajasEliminados);
					
					cierrecajaLogic.saveCierreCajas();//WithConnection
					//cierrecajaLogic.getSetVersionRowCierreCajas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCierreCaja();
				
				this.cierrecajasEliminados= new ArrayList<CierreCaja>();		
			}
			
			if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cierre Caja GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cierrecaja=cierrecajaAux;
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
      		//this.finishProcessCierreCaja();
      	}
		
	}	
	
	public void actualizarRelaciones(CierreCaja cierrecajaLocal) throws Exception {
		
		if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CierreCaja cierrecajaLocal) throws Exception {	
		if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cierrecajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cierrecajaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				cierrecajaLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrameLocal=(TipoFormaPagoBeanSwingJInternalFrame) ((TipoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.gettipoformapago(),true);
				tipoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago,this.tipoformapagosForeignKey);

				tipoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				cierrecajaLocal.setTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey("Formulario");
				this.setActualTipoFormaPagoForeignKey(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCierreCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cierrecajaValidator.getInvalidValues(this.cierrecaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CierreCaja cierrecaja,List<CierreCaja> cierrecajas) throws Exception {
		try	{		
			CierreCajaConstantesFunciones.actualizarLista(cierrecaja,cierrecajas,this.cierrecajaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CierreCaja cierrecaja,List<CierreCaja> cierrecajas) throws Exception {
		try	{			
			CierreCajaConstantesFunciones.actualizarSelectedLista(cierrecaja,cierrecajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CierreCaja> cierrecajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cierrecajasLocal=this.cierrecajaLogic.getCierreCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cierrecajasLocal=this.cierrecajas;
			}
			//ARCHITECTURE
		
			for(CierreCaja cierrecajaLocal:cierrecajasLocal) {
				if(this.permiteMantenimiento(cierrecajaLocal) && cierrecajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CierreCajaConstantesFunciones.getCierreCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CierreCajaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabelid_empresaCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreCajaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabelid_sucursalCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreCajaConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabelid_usuarioCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreCajaConstantesFunciones.IDTIPOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabelid_tipo_forma_pagoCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreCajaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabelfechaCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreCajaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabeltotalCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreCajaConstantesFunciones.TOTALDIFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabeltotal_diferenciaCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreCajaConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabelesta_activoCierreCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreCaja.jLabelid_empresaCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreCaja.jLabelid_sucursalCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreCaja.jLabelid_usuarioCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreCaja.jLabelid_tipo_forma_pagoCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreCaja.jLabelfechaCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreCaja.jLabeltotalCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreCaja.jLabeltotal_diferenciaCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreCaja.jLabelesta_activoCierreCaja,"");
		
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
		this.iIdNuevoCierreCaja--;	
		
		
		this.cierrecajaAux=new CierreCaja();
		
		this.cierrecajaAux.setId(this.iIdNuevoCierreCaja);
		this.cierrecajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cierrecajaLogic.getCierreCajas().add(this.cierrecajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cierrecajas.add(this.cierrecajaAux);
		}
		//ARCHITECTURE
		
		this.cierrecaja=this.cierrecajaAux;
		
		if(CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCierreCaja(this.cierrecaja);
			this.setVariablesObjetoActualToFormularioForeignKeyCierreCaja(this.cierrecaja);
		}
				
		//this.setDefaultControlesCierreCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCierreCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCierreCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCierreCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCierreCaja(this.cierrecajaBean,this.cierrecaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CierreCajaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {
			classes=CierreCajaConstantesFunciones.getClassesRelationshipsOfCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cierrecajaReturnGeneral=cierrecajaLogic.procesarEventosCierreCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cierrecajaLogic.getCierreCajas(),this.cierrecaja,this.cierrecajaParameterGeneral,this.isEsNuevoCierreCaja,classes);//this.cierrecajaLogic.getCierreCaja()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCierreCaja(this.cierrecajaReturnGeneral,this.cierrecajaBean,false);
		
		if(this.cierrecajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCierreCaja(this.cierrecajaReturnGeneral.getCierreCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCierreCaja(this.cierrecajaReturnGeneral.getCierreCaja());
		}
		
		if(this.cierrecajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCierreCaja(this.cierrecajaReturnGeneral.getCierreCaja(),classes);//this.cierrecajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCierreCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCierreCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CierreCajaBeanSwingJInternalFrameAdditional.RecargarFormCierreCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCierreCaja(false);
						
			if(cierrecajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCierreCaja();
			}
			
			this.actualizarVisualTableDatosCierreCaja();
			
			this.jTableDatosCierreCaja.setRowSelectionInterval(this.getIndiceNuevoCierreCaja(), this.getIndiceNuevoCierreCaja());
			
			this.seleccionarFilaTablaCierreCajaActual();
						
			this.actualizarEstadoCeldasBotonesCierreCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCierreCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCierreCaja.jDateChooserfechaCierreCaja.setEnabled(isHabilitar && this.cierrecajaConstantesFunciones.activarfechaCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotalCierreCaja.setEnabled(isHabilitar && this.cierrecajaConstantesFunciones.activartotalCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotal_diferenciaCierreCaja.setEnabled(isHabilitar && this.cierrecajaConstantesFunciones.activartotal_diferenciaCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jCheckBoxesta_activoCierreCaja.setEnabled(isHabilitar && this.cierrecajaConstantesFunciones.activaresta_activoCierreCaja);	
		//
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.setEnabled(isHabilitar && this.cierrecajaConstantesFunciones.activarid_empresaCierreCaja);//
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.setEnabled(isHabilitar && this.cierrecajaConstantesFunciones.activarid_sucursalCierreCaja);//
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.setEnabled(isHabilitar && this.cierrecajaConstantesFunciones.activarid_usuarioCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.setEnabled(isHabilitar && this.cierrecajaConstantesFunciones.activarid_tipo_forma_pagoCierreCaja);
	};
	
	public void setDefaultControlesCierreCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCierreCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cierrecajaSessionBean.setConGuardarRelaciones(true);			
			this.cierrecajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCierreCaja.jTabbedPaneRelacionesCierreCaja.setVisible(true);
			
					
		} else {
			//this.cierrecajaSessionBean.setConGuardarRelaciones(false);			
			this.cierrecajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCierreCaja.jTabbedPaneRelacionesCierreCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCierreCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreCaja cierrecajaAux:this.cierrecajaLogic.getCierreCajas()) {
				if(cierrecajaAux.getId().equals(this.iIdNuevoCierreCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreCaja cierrecajaAux:this.cierrecajas) {
				if(cierrecajaAux.getId().equals(this.iIdNuevoCierreCaja)) {
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
	
	public int getIndiceActualCierreCaja(CierreCaja cierrecaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreCaja cierrecajaAux:this.cierrecajaLogic.getCierreCajas()) {
				if(cierrecajaAux.getId().equals(cierrecaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreCaja cierrecajaAux:this.cierrecajas) {
				if(cierrecajaAux.getId().equals(cierrecaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCierreCaja(CierreCaja cierrecajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreCaja cierrecajaAux:this.cierrecajaLogic.getCierreCajas()) {
				if(cierrecajaAux.getCierreCajaOriginal().getId().equals(cierrecajaOriginal.getId())) {
					existe=true;
					cierrecajaOriginal.setId(cierrecajaAux.getId());
					cierrecajaOriginal.setVersionRow(cierrecajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreCaja cierrecajaAux:this.cierrecajas) {
				if(cierrecajaAux.getCierreCajaOriginal().getId().equals(cierrecajaOriginal.getId())) {
					existe=true;
					cierrecajaOriginal.setId(cierrecajaAux.getId());
					cierrecajaOriginal.setVersionRow(cierrecajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCierreCaja(Boolean esParaCancelar) throws Exception {
		cierrecajasAux=new ArrayList<CierreCaja>();
		cierrecajaAux=new CierreCaja();
		
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CierreCaja cierrecajaAux:this.cierrecajaLogic.getCierreCajas()) {
					if(cierrecajaAux.getId()<0) {
						cierrecajasAux.add(cierrecajaAux);
					}		
				}
				this.iIdNuevoCierreCaja=0L;
				this.cierrecajaLogic.getCierreCajas().removeAll(cierrecajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CierreCaja cierrecajaAux:this.cierrecajas) {
					if(cierrecajaAux.getId()<0) {
						cierrecajasAux.add(cierrecajaAux);
					}		
				}
				this.iIdNuevoCierreCaja=0L;
				this.cierrecajas.removeAll(cierrecajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCierreCaja 
					&& this.cierrecajaLogic.getCierreCajas().size()>0
					) {
					cierrecajaAux=this.cierrecajaLogic.getCierreCajas().get(this.cierrecajaLogic.getCierreCajas().size() - 1);
				
					if(cierrecajaAux.getId()<0) {
						this.cierrecajaLogic.getCierreCajas().remove(cierrecajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCierreCaja && this.cierrecajas.size()>0) {
					cierrecajaAux=this.cierrecajas.get(this.cierrecajas.size() - 1);
				
					if(cierrecajaAux.getId()<0) {
						this.cierrecajas.remove(cierrecajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCierreCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cierrecaja.getId()<0) {
				this.cierrecajaLogic.getCierreCajas().remove(this.cierrecaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cierrecaja.getId()<0) {
				this.cierrecajas.remove(this.cierrecaja);
			}
		}			
	}
	
	public void setEstadosInicialesCierreCaja(List<CierreCaja> cierrecajasAux) throws Exception {
		CierreCajaConstantesFunciones.setEstadosInicialesCierreCaja(cierrecajasAux);
	}
	
	public void setEstadosInicialesCierreCaja(CierreCaja cierrecajaAux) throws Exception {
		CierreCajaConstantesFunciones.setEstadosInicialesCierreCaja(cierrecajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCierreCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCierreCajaActual()) {
				if(!this.isEsNuevoCierreCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCierreCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCierreCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cierre Caja ?", "MANTENIMIENTO DE Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CierreCaja cierrecaja) throws Exception {
		CierreCajaConstantesFunciones.seleccionarAsignar(this.cierrecaja,cierrecaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCierreCaja=this.isPermisoActualizarOriginalCierreCaja;
			
			
			this.seleccionarAsignar(cierrecaja);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CierreCajaConstantesFunciones.quitarEspaciosCierreCaja(this.cierrecaja,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCierreCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cierrecajaSessionBean.setsFuncionBusquedaRapida(this.cierrecajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCierreCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCierreCaja(esParaCancelar);				
				this.cancelarNuevoCierreCaja(esParaCancelar);								
			}
			
			this.cierrecaja=new CierreCaja();
			
			this.inicializarCierreCaja();
			
			this.actualizarEstadoCeldasBotonesCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCierreCaja() throws Exception {
		try {
			CierreCajaConstantesFunciones.inicializarCierreCaja(this.cierrecaja);
			
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
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cierrecajaLogic.getCierreCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCierreCajas(String sAccionBusqueda,List<CierreCaja> cierrecajasParaReportes) throws Exception {
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
					sPathReporteFinal="CierreCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CierreCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CierreCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CierreCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cierre Cajas");		
		parameters.put("busquedapor", CierreCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCierreCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCierreCaja=new JRBeanArrayDataSource(CierreCajaJInternalFrame.TraerCierreCajaBeans(cierrecajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCierreCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CierreCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CierreCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CierreCajaBean.TraerCierreCajaBeans(cierrecajasParaReportes).toArray()));
							
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
				this.generarExcelReporteCierreCajas(sAccionBusqueda,sTipoArchivoReporte,cierrecajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCierreCajas(sAccionBusqueda,sTipoArchivoReporte,cierrecajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCierreCajaActionPerformed(null);
					//this.generarExcelReporteCierreCajas(sAccionBusqueda,sTipoArchivoReporte,cierrecajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCierreCajas(sAccionBusqueda,sTipoArchivoReporte,cierrecajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCierreCajas(sAccionBusqueda,sTipoArchivoReporte,cierrecajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCierreCajas(sAccionBusqueda,sTipoArchivoReporte,cierrecajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCierreCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<CierreCaja> cierrecajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrecaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CierreCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCierreCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CierreCaja cierrecaja : cierrecajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CierreCajaConstantesFunciones.generarExcelReporteDataCierreCaja("NORMAL",row,workbook,cierrecaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCierreCaja(String sTipo,Row row,Workbook workbook) {
		
		CierreCajaConstantesFunciones.generarExcelReporteHeaderCierreCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCierreCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<CierreCaja> cierrecajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrecaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CierreCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CierreCaja cierrecaja : cierrecajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CierreCajaConstantesFunciones.getCierreCajaDescripcion(cierrecaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrecaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreCajaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrecaja.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreCajaConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrecaja.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrecaja.gettipoformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreCajaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreCajaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrecaja.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreCajaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreCajaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrecaja.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrecaja.gettotal_diferencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreCajaConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreCajaConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cierrecaja.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCierreCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<CierreCaja> cierrecajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CierreCaja> cierrecajasRespaldo=null;
		
		classes=CierreCajaConstantesFunciones.getClassesRelationshipsOfCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cierrecajaLogic.setDatosCliente(this.datosCliente);
		this.cierrecajaLogic.setDatosDeep(this.datosDeep);
		this.cierrecajaLogic.setIsConDeep(true);
		
		cierrecajasRespaldo=this.cierrecajaLogic.getCierreCajas();
		
		this.cierrecajaLogic.setCierreCajas(cierrecajasParaReportes);	
		this.cierrecajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cierrecajasParaReportes=this.cierrecajaLogic.getCierreCajas();
		this.cierrecajaLogic.setCierreCajas(cierrecajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrecaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CierreCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCierreCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CierreCaja cierrecaja : cierrecajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCierreCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CierreCajaConstantesFunciones.generarExcelReporteDataCierreCaja("NORMAL",row,workbook,cierrecaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CierreCajaConstantesFunciones.getCierreCajaDescripcion(cierrecaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCierreCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCierreCaja() throws Exception {		
		this.startProcessCierreCaja(true);
	}
	
	public void startProcessCierreCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCierreCaja ,this.jPanelParametrosReportesCierreCaja, this.jScrollPanelDatosCierreCaja,this.jPanelPaginacionCierreCaja, this.jScrollPanelDatosEdicionCierreCaja, this.jPanelAccionesCierreCaja,this.jPanelAccionesFormularioCierreCaja,this.jmenuBarCierreCaja,this.jmenuBarDetalleCierreCaja,this.jTtoolBarCierreCaja,this.jTtoolBarDetalleCierreCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasCierreCaja=this.jTabbedPaneBusquedasCierreCaja; 
		
		final JPanel jPanelParametrosReportesCierreCaja=this.jPanelParametrosReportesCierreCaja;
		//final JScrollPane jScrollPanelDatosCierreCaja=this.jScrollPanelDatosCierreCaja;
		final JTable jTableDatosCierreCaja=this.jTableDatosCierreCaja;		
		final JPanel jPanelPaginacionCierreCaja=this.jPanelPaginacionCierreCaja;
		//final JScrollPane jScrollPanelDatosEdicionCierreCaja=this.jScrollPanelDatosEdicionCierreCaja;
		final JPanel jPanelAccionesCierreCaja=this.jPanelAccionesCierreCaja;
		
		JPanel jPanelCamposAuxiliarCierreCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCierreCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			jPanelCamposAuxiliarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jPanelCamposCierreCaja;
			jPanelAccionesFormularioAuxiliarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jPanelAccionesFormularioCierreCaja;
		}
		
		final JPanel jPanelCamposCierreCaja=jPanelCamposAuxiliarCierreCaja;
		final JPanel jPanelAccionesFormularioCierreCaja=jPanelAccionesFormularioAuxiliarCierreCaja;
		
		
		final JMenuBar jmenuBarCierreCaja=this.jmenuBarCierreCaja;
		final JToolBar jTtoolBarCierreCaja=this.jTtoolBarCierreCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCierreCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCierreCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			jmenuBarDetalleAuxiliarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jmenuBarDetalleCierreCaja;
			jTtoolBarDetalleAuxiliarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jTtoolBarDetalleCierreCaja;
		}
		
		final JMenuBar jmenuBarDetalleCierreCaja=jmenuBarDetalleAuxiliarCierreCaja;
		final JToolBar jTtoolBarDetalleCierreCaja=jTtoolBarDetalleAuxiliarCierreCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCierreCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCierreCaja;
			processRunnable.jTableDatos=jTableDatosCierreCaja;
			processRunnable.jPanelCampos=jPanelCamposCierreCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionCierreCaja;
			processRunnable.jPanelAcciones=jPanelAccionesCierreCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCierreCaja;
			
			
			processRunnable.jmenuBar=jmenuBarCierreCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCierreCaja;
			processRunnable.jTtoolBar=jTtoolBarCierreCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCierreCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCierreCaja ,jPanelParametrosReportesCierreCaja,jTableDatosCierreCaja, /*jScrollPanelDatosCierreCaja,*/jPanelCamposCierreCaja,jPanelPaginacionCierreCaja, /*jScrollPanelDatosEdicionCierreCaja,*/ jPanelAccionesCierreCaja,jPanelAccionesFormularioCierreCaja,jmenuBarCierreCaja,jmenuBarDetalleCierreCaja,jTtoolBarCierreCaja,jTtoolBarDetalleCierreCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCierreCaja ,jPanelParametrosReportesCierreCaja, jScrollPanelDatosCierreCaja,jPanelPaginacionCierreCaja, jScrollPanelDatosEdicionCierreCaja, jPanelAccionesCierreCaja,jPanelAccionesFormularioCierreCaja,jmenuBarCierreCaja,jmenuBarDetalleCierreCaja,jTtoolBarCierreCaja,jTtoolBarDetalleCierreCaja);
						
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
	
	public void finishProcessCierreCaja() {// throws Exception 
		this.finishProcessCierreCaja(true);
	}
	
	public void finishProcessCierreCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCierreCaja ,this.jPanelParametrosReportesCierreCaja, this.jScrollPanelDatosCierreCaja,this.jPanelPaginacionCierreCaja, this.jScrollPanelDatosEdicionCierreCaja, this.jPanelAccionesCierreCaja,this.jPanelAccionesFormularioCierreCaja,this.jmenuBarCierreCaja,this.jmenuBarDetalleCierreCaja,this.jTtoolBarCierreCaja,this.jTtoolBarDetalleCierreCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasCierreCaja=this.jTabbedPaneBusquedasCierreCaja; 
		
		final JPanel jPanelParametrosReportesCierreCaja=this.jPanelParametrosReportesCierreCaja;
		//final JScrollPane jScrollPanelDatosCierreCaja=this.jScrollPanelDatosCierreCaja;
		final JTable jTableDatosCierreCaja=this.jTableDatosCierreCaja;		
		final JPanel jPanelPaginacionCierreCaja=this.jPanelPaginacionCierreCaja;
		//final JScrollPane jScrollPanelDatosEdicionCierreCaja=this.jScrollPanelDatosEdicionCierreCaja;
		final JPanel jPanelAccionesCierreCaja=this.jPanelAccionesCierreCaja;
		
		JPanel jPanelCamposAuxiliarCierreCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCierreCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			jPanelCamposAuxiliarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jPanelCamposCierreCaja;
			jPanelAccionesFormularioAuxiliarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jPanelAccionesFormularioCierreCaja;
		}
		
		final JPanel jPanelCamposCierreCaja=jPanelCamposAuxiliarCierreCaja;
		final JPanel jPanelAccionesFormularioCierreCaja=jPanelAccionesFormularioAuxiliarCierreCaja;
		
		
		final JMenuBar jmenuBarCierreCaja=this.jmenuBarCierreCaja;		
		final JToolBar jTtoolBarCierreCaja=this.jTtoolBarCierreCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarCierreCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCierreCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			jmenuBarDetalleAuxiliarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jmenuBarDetalleCierreCaja;
			jTtoolBarDetalleAuxiliarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jTtoolBarDetalleCierreCaja;		
		}
		
		final JMenuBar jmenuBarDetalleCierreCaja=jmenuBarDetalleAuxiliarCierreCaja;
		final JToolBar jTtoolBarDetalleCierreCaja=jTtoolBarDetalleAuxiliarCierreCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCierreCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCierreCaja;
			processRunnable.jTableDatos=jTableDatosCierreCaja;
			processRunnable.jPanelCampos=jPanelCamposCierreCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionCierreCaja;
			processRunnable.jPanelAcciones=jPanelAccionesCierreCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCierreCaja;
			
			
			processRunnable.jmenuBar=jmenuBarCierreCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCierreCaja;
			processRunnable.jTtoolBar=jTtoolBarCierreCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCierreCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCierreCaja ,jPanelParametrosReportesCierreCaja, jTableDatosCierreCaja,/*jScrollPanelDatosCierreCaja,*/jPanelCamposCierreCaja,jPanelPaginacionCierreCaja, /*jScrollPanelDatosEdicionCierreCaja,*/ jPanelAccionesCierreCaja,jPanelAccionesFormularioCierreCaja,jmenuBarCierreCaja,jmenuBarDetalleCierreCaja,jTtoolBarCierreCaja,jTtoolBarDetalleCierreCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCierreCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCierreCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCierreCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCierreCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCierreCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCierreCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCierreCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCierreCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCierreCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cierrecajaConstantesFunciones.getsFinalQueryCierreCaja();
		String  finalQueryPaginacionTodos=this.cierrecajaConstantesFunciones.getsFinalQueryCierreCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CierreCajaConstantesFunciones.getArrayColumnasGlobalesNoCierreCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CierreCajaConstantesFunciones.getArrayColumnasGlobalesCierreCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CierreCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cierrecajasEliminados= new ArrayList<CierreCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCierreCaja();
		
				///*CierreCajaSessionBean*/this.cierrecajaSessionBean=new CierreCajaSessionBean();
			
			if(this.cierrecajaSessionBean==null) {
				this.cierrecajaSessionBean=new CierreCajaSessionBean();
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
					this.iNumeroPaginacion=CierreCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CierreCajaConstantesFunciones.getClassesForeignKeysOfCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cierrecaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cierrecajasAux= new ArrayList<CierreCaja>();
			
				
			cierrecajaLogic.setDatosCliente(this.datosCliente);
			cierrecajaLogic.setDatosDeep(this.datosDeep);
			cierrecajaLogic.setIsConDeep(true);
			
			
			cierrecajaLogic.getCierreCajaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cierrecajaLogic.getTodosCierreCajas(finalQueryGlobal,pagination);
					
					//cierrecajaLogic.getTodosCierreCajasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cierrecajaLogic.getCierreCajas()==null|| cierrecajaLogic.getCierreCajas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cierrecajasAux= new ArrayList<CierreCaja>();
							cierrecajasAux.addAll(cierrecajaLogic.getCierreCajas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajasAux= new ArrayList<CierreCaja>();
							cierrecajasAux.addAll(cierrecajas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cierrecajaLogic.getTodosCierreCajas(finalQueryGlobal+"",this.pagination);												
							
							//cierrecajaLogic.getTodosCierreCajasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCierreCajas("Todos",cierrecajaLogic.getCierreCajas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cierrecajaLogic.setCierreCajas(new ArrayList<CierreCaja>());					
							cierrecajaLogic.getCierreCajas().addAll(cierrecajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajas=new ArrayList<CierreCaja>();
							cierrecajas.addAll(cierrecajasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCierreCaja=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCierreCaja=this.idActual;
				
				} else if(this.idCierreCajaActual!=null && this.idCierreCajaActual!=0L) {
					idCierreCaja=idCierreCajaActual;
				}
				
					
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndicePorId(idCierreCaja);
				
				this.cierrecajas=new ArrayList<CierreCaja>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cierrecajaLogic.getEntity(idCierreCaja);
					
					//cierrecajaLogic.getEntityWithConnection(idCierreCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrecajaLogic.setCierreCajas(new ArrayList<CierreCaja>());
					cierrecajaLogic.getCierreCajas().add(cierrecajaLogic.getCierreCaja());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrecajas=new ArrayList<CierreCaja>();
					this.cierrecajas.add(cierrecaja);
				}
				
				if(cierrecajaLogic.getCierreCaja()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrecajaLogic.getCierreCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrecajaLogic.getCierreCajas()==null||cierrecajaLogic.getCierreCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrecajas==null|| cierrecajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajasAux=new ArrayList<CierreCaja>();
						cierrecajasAux.addAll(cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajasAux=new ArrayList<CierreCaja>();
							cierrecajasAux.addAll(cierrecajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrecajaLogic.getCierreCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreCajas("FK_IdEmpresa",cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreCajas("FK_IdEmpresa",cierrecajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajaLogic.setCierreCajas(new ArrayList<CierreCaja>());
						cierrecajaLogic.getCierreCajas().addAll(cierrecajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajas=new ArrayList<CierreCaja>();
							cierrecajas.addAll(cierrecajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrecajaLogic.getCierreCajasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrecajaLogic.getCierreCajas()==null||cierrecajaLogic.getCierreCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrecajas==null|| cierrecajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajasAux=new ArrayList<CierreCaja>();
						cierrecajasAux.addAll(cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajasAux=new ArrayList<CierreCaja>();
							cierrecajasAux.addAll(cierrecajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrecajaLogic.getCierreCajasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreCajas("FK_IdSucursal",cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreCajas("FK_IdSucursal",cierrecajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajaLogic.setCierreCajas(new ArrayList<CierreCaja>());
						cierrecajaLogic.getCierreCajas().addAll(cierrecajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajas=new ArrayList<CierreCaja>();
							cierrecajas.addAll(cierrecajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFormaPago")) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrecajaLogic.getCierreCajasFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrecajaLogic.getCierreCajas()==null||cierrecajaLogic.getCierreCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrecajas==null|| cierrecajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajasAux=new ArrayList<CierreCaja>();
						cierrecajasAux.addAll(cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajasAux=new ArrayList<CierreCaja>();
							cierrecajasAux.addAll(cierrecajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrecajaLogic.getCierreCajasFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreCajas("FK_IdTipoFormaPago",cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreCajas("FK_IdTipoFormaPago",cierrecajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajaLogic.setCierreCajas(new ArrayList<CierreCaja>());
						cierrecajaLogic.getCierreCajas().addAll(cierrecajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajas=new ArrayList<CierreCaja>();
							cierrecajas.addAll(cierrecajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrecajaLogic.getCierreCajasFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrecajaLogic.getCierreCajas()==null||cierrecajaLogic.getCierreCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrecajas==null|| cierrecajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajasAux=new ArrayList<CierreCaja>();
						cierrecajasAux.addAll(cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajasAux=new ArrayList<CierreCaja>();
							cierrecajasAux.addAll(cierrecajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrecajaLogic.getCierreCajasFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreCajaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreCajas("FK_IdUsuario",cierrecajaLogic.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreCajas("FK_IdUsuario",cierrecajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajaLogic.setCierreCajas(new ArrayList<CierreCaja>());
						cierrecajaLogic.getCierreCajas().addAll(cierrecajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajas=new ArrayList<CierreCaja>();
							cierrecajas.addAll(cierrecajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCierreCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCierreCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cierrecajaLogic.getCierreCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cierrecajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cierrecajaLogic.getCierreCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cierrecajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CierreCaja cierrecaja) {
		Boolean permite=true;
		
		if(this.cierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CierreCajaConstantesFunciones.getOrderByListaCierreCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CierreCajaConstantesFunciones.getOrderByListaCierreCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreCaja cierrecaja:cierrecajaLogic.getCierreCajas()) {
				if(cierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					cierrecajaTotales=cierrecaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreCaja cierrecaja:this.cierrecajas) {
				if(cierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					cierrecajaTotales=cierrecaja;
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
			this.cierrecajaAux=new CierreCaja();
			this.cierrecajaAux.setsType(Constantes2.S_TOTALES);
			this.cierrecajaAux.setIsNew(false);
			this.cierrecajaAux.setIsChanged(false);
			this.cierrecajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CierreCajaConstantesFunciones.TotalizarValoresFilaCierreCaja(this.cierrecajaLogic.getCierreCajas(),this.cierrecajaAux);
				
				this.cierrecajaLogic.getCierreCajas().add(this.cierrecajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CierreCajaConstantesFunciones.TotalizarValoresFilaCierreCaja(this.cierrecajas,this.cierrecajaAux);
				
				this.cierrecajas.add(this.cierrecajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cierrecajaTotales=new CierreCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cierrecajaLogic.getCierreCajas().remove(cierrecajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cierrecajas.remove(cierrecajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cierrecajaTotales=new CierreCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreCaja cierrecaja:cierrecajaLogic.getCierreCajas()) {
				if(cierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					cierrecajaTotales=cierrecaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CierreCajaConstantesFunciones.TotalizarValoresFilaCierreCaja(this.cierrecajaLogic.getCierreCajas(),cierrecajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreCaja cierrecaja:this.cierrecajas) {
				if(cierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					cierrecajaTotales=cierrecaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CierreCajaConstantesFunciones.TotalizarValoresFilaCierreCaja(this.cierrecajas,cierrecajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCierreCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCierreCajasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCierreCajasFK_IdTipoFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCierreCajasFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCierreCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrecajaLogic.getCierreCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCierreCajasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrecajaLogic.getCierreCajasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCierreCajasFK_IdTipoFormaPago(String sFinalQuery,Long id_tipo_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrecajaLogic.getCierreCajasFK_IdTipoFormaPago(sFinalQuery,this.pagination,id_tipo_forma_pago);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCierreCajasFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrecajaLogic.getCierreCajasFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosCierreCaja() {
		this.isPermisoTodoCierreCaja=false;
		this.isPermisoNuevoCierreCaja=false;
		this.isPermisoActualizarCierreCaja=false;
		this.isPermisoActualizarOriginalCierreCaja=false;
		this.isPermisoEliminarCierreCaja=false;
		this.isPermisoGuardarCambiosCierreCaja=false;
		this.isPermisoConsultaCierreCaja=false;
		this.isPermisoBusquedaCierreCaja=false;
		this.isPermisoReporteCierreCaja=false;		
		this.isPermisoOrdenCierreCaja=false;		
		this.isPermisoPaginacionMedioCierreCaja=false;		
		this.isPermisoPaginacionAltoCierreCaja=false;
		this.isPermisoPaginacionTodoCierreCaja=false;
		this.isPermisoCopiarCierreCaja=false;		
		this.isPermisoVerFormCierreCaja=false;		
		this.isPermisoDuplicarCierreCaja=false;		
		this.isPermisoOrdenCierreCaja=false;		
	}
	
	public void setPermisosUsuarioCierreCaja(Boolean isPermiso) {
		this.isPermisoTodoCierreCaja=isPermiso;
		this.isPermisoNuevoCierreCaja=isPermiso;
		this.isPermisoActualizarCierreCaja=isPermiso;
		this.isPermisoActualizarOriginalCierreCaja=isPermiso;
		this.isPermisoEliminarCierreCaja=isPermiso;
		this.isPermisoGuardarCambiosCierreCaja=isPermiso;
		this.isPermisoConsultaCierreCaja=isPermiso;
		this.isPermisoBusquedaCierreCaja=isPermiso;
		this.isPermisoReporteCierreCaja=isPermiso;
		this.isPermisoOrdenCierreCaja=isPermiso;		
		this.isPermisoPaginacionMedioCierreCaja=isPermiso;		
		this.isPermisoPaginacionAltoCierreCaja=isPermiso;		
		this.isPermisoPaginacionTodoCierreCaja=isPermiso;		
		this.isPermisoCopiarCierreCaja=isPermiso;		
		this.isPermisoVerFormCierreCaja=isPermiso;		
		this.isPermisoDuplicarCierreCaja=isPermiso;
		this.isPermisoOrdenCierreCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCierreCaja(Boolean isPermiso) {
		//this.isPermisoTodoCierreCaja=isPermiso;
		this.isPermisoNuevoCierreCaja=isPermiso;
		this.isPermisoActualizarCierreCaja=isPermiso;
		this.isPermisoActualizarOriginalCierreCaja=isPermiso;
		this.isPermisoEliminarCierreCaja=isPermiso;
		this.isPermisoGuardarCambiosCierreCaja=isPermiso;
		//this.isPermisoConsultaCierreCaja=isPermiso;
		//this.isPermisoBusquedaCierreCaja=isPermiso;
		//this.isPermisoReporteCierreCaja=isPermiso;
		//this.isPermisoOrdenCierreCaja=isPermiso;		
		//this.isPermisoPaginacionMedioCierreCaja=isPermiso;		
		//this.isPermisoPaginacionAltoCierreCaja=isPermiso;		
		//this.isPermisoPaginacionTodoCierreCaja=isPermiso;		
		//this.isPermisoCopiarCierreCaja=isPermiso;		
		//this.isPermisoDuplicarCierreCaja=isPermiso;
		//this.isPermisoOrdenCierreCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCierreCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCierreCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCierreCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCierreCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCierreCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCierreCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCierreCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CierreCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCierreCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCierreCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCierreCaja=this.isPermisoActualizarCierreCaja;
			this.isPermisoEliminarCierreCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCierreCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCierreCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCierreCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCierreCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCierreCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCierreCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCierreCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCierreCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCierreCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCierreCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCierreCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCierreCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCierreCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCierreCaja.setToolTipText(this.jTableDatosCierreCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCierreCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCierreCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCierreCaja() throws Exception {
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
	public void inicializarCombosForeignKeyCierreCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.tipoformapagosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCierreCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CierreCajaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCierreCajaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoFormaPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCierreCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CierreCajaParameterReturnGeneral cierrecajaReturnGeneral=new CierreCajaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cierrecajaConstantesFunciones.cargarid_empresaCierreCaja)
					 || (this.esRecargarFks && this.cierrecajaConstantesFunciones.cargarid_empresaCierreCaja)) {

					if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cierrecajaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cierrecajaConstantesFunciones.cargarid_sucursalCierreCaja)
					 || (this.esRecargarFks && this.cierrecajaConstantesFunciones.cargarid_sucursalCierreCaja)) {

					if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cierrecajaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.cierrecajaConstantesFunciones.cargarid_usuarioCierreCaja)
					 || (this.esRecargarFks && this.cierrecajaConstantesFunciones.cargarid_usuarioCierreCaja)) {

					if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+cierrecajaSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalTipoFormaPago="";

				if(((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0) && this.cierrecajaConstantesFunciones.cargarid_tipo_forma_pagoCierreCaja)
					 || (this.esRecargarFks && this.cierrecajaConstantesFunciones.cargarid_tipo_forma_pagoCierreCaja)) {

					if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFormaPago, "");
						finalQueryGlobalTipoFormaPago+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFormaPago=" WHERE " + ConstantesSql.ID + "="+cierrecajaSessionBean.getlidTipoFormaPagoActual();
					}
				} else {
					finalQueryGlobalTipoFormaPago="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cierrecajaReturnGeneral=cierrecajaLogic.cargarCombosLoteForeignKeyCierreCaja(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalTipoFormaPago);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cierrecajaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cierrecajaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=cierrecajaReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalTipoFormaPago.equals("NONE")) {
				this.tipoformapagosForeignKey=cierrecajaReturnGeneral.gettipoformapagosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCierreCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyTipoFormaPago();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cierrecajaSessionBean==null) {
				this.cierrecajaSessionBean=new CierreCajaSessionBean();
			}

			if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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

	public void addItemDefectoCombosForeignKeyTipoFormaPago()throws Exception {
		try {

			if(!this.cierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				TipoFormaPago tipoformapago=new TipoFormaPago();
				TipoFormaPagoConstantesFunciones.setTipoFormaPagoDescripcion(tipoformapago,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoformapago.setId(null);

				if(!TipoFormaPagoConstantesFunciones.ExisteEnLista(this.tipoformapagosForeignKey,tipoformapago,true)) {

					this.tipoformapagosForeignKey.add(0,tipoformapago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCierreCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCierreCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCierreCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.cierrecaja.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCierreCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCierreCaja(CierreCaja cierrecaja)throws Exception {	
		try {
			
			this.setActualTipoFormaPagoForeignKey(cierrecaja.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCierreCaja(CierreCaja cierrecaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCierreCaja()throws Exception {	
		try {
			
			this.setActualTipoFormaPagoForeignKey(this.cierrecajaConstantesFunciones.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCierreCaja()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCierreCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCierreCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCierreCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCierreCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCierreCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCierreCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public CierreCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CierreCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CierreCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cierrecajaSessionBean=new CierreCajaSessionBean(); 
		this.cierrecajaConstantesFunciones=new CierreCajaConstantesFunciones(); 
		this.cierrecajaBean=new CierreCaja();//(this.cierrecajaConstantesFunciones); 		
		this.cierrecajaReturnGeneral=new CierreCajaParameterReturnGeneral(); 
		
		this.cierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CierreCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CierreCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CierreCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCierreCaja(true);
			
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
			
			this.cierrecajaConstantesFunciones=new CierreCajaConstantesFunciones(); 
			this.cierrecajaBean=new CierreCaja();//this.cierrecajaConstantesFunciones); 			
			this.cierrecajaReturnGeneral=new CierreCajaParameterReturnGeneral(); 
		
			CierreCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cierre Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cierrecaja=new CierreCaja();
			this.cierrecajas = new ArrayList<CierreCaja>();
			this.cierrecajasAux = new ArrayList<CierreCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic=new CierreCajaLogic();
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}
			
			//this.cierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCierreCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCierreCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCierreCaja);	
					}
					
					if(this.jInternalFrameImportacionCierreCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCierreCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCierreCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCierreCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCierreCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCierreCaja);
				this.jInternalFrameDetalleFormCierreCaja.setVisible(false);
				this.jInternalFrameDetalleFormCierreCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCierreCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCierreCaja);
					this.jInternalFrameReporteDinamicoCierreCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoCierreCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCierreCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCierreCaja);
					this.jInternalFrameImportacionCierreCaja.setVisible(false);
					this.jInternalFrameImportacionCierreCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCierreCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCierreCaja);
					this.jInternalFrameOrderByCierreCaja.setVisible(false);
					this.jInternalFrameOrderByCierreCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCierreCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CierreCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cierrecajaReturnGeneral=new CierreCajaParameterReturnGeneral();
			
			this.cierrecajaParameterGeneral=new CierreCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cierrecajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CierreCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cierrecajaSessionBean.getEsGuardarRelacionado(),this.cierrecajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CierreCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cierrecajaSessionBean.getEsGuardarRelacionado(),this.cierrecajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCierreCaja=false;
			this.isVisibilidadCeldaDuplicarCierreCaja=true;
			this.isVisibilidadCeldaCopiarCierreCaja=true;
			this.isVisibilidadCeldaVerFormCierreCaja=true;
			this.isVisibilidadCeldaOrdenCierreCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=false;
			this.isVisibilidadCeldaModificarCierreCaja=false;
			this.isVisibilidadCeldaActualizarCierreCaja=false;
			this.isVisibilidadCeldaEliminarCierreCaja=false;
			this.isVisibilidadCeldaCancelarCierreCaja=false;
			this.isVisibilidadCeldaGuardarCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoFormaPago=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCierreCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCierreCaja(false);
			
			this.setPermisosUsuarioCierreCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cierrecajaSessionBean.getEsGuardarRelacionado() 
				|| (this.cierrecajaSessionBean.getEsGuardarRelacionado() && this.cierrecajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCierreCajaClasesRelacionadas();
			}
			
			if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCierreCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCierreCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCierreCaja();
			}
			
			if(!this.isPermisoBusquedaCierreCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCierreCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCierreCaja,this.isPermisoPaginacionMedioCierreCaja,this.isPermisoPaginacionTodoCierreCaja);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CierreCajaConstantesFunciones.getTiposSeleccionarCierreCaja());
				
				this.tiposColumnasSelect=CierreCajaConstantesFunciones.getTiposSeleccionarCierreCaja(true);
				
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
			//if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCierreCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCierreCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCierreCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCierreCaja() ;
			
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
			this.usuarioLogic=new UsuarioLogic();
			this.tipoformapagoLogic=new TipoFormaPagoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cierrecajaImplementable= (CierreCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CierreCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cierrecajaImplementableHome= (CierreCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CierreCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cierrecajas= new ArrayList<CierreCaja>();
			this.cierrecajasEliminados= new ArrayList<CierreCaja>();
						
			this.isEsNuevoCierreCaja=false;
			this.esParaAccionDesdeFormularioCierreCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCierreCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCierreCaja();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CierreCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CierreCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCierreCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCierreCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCierreCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCierreCaja();
			}
			
			CierreCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCierreCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCierreCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCierreCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCierreCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CierreCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCierreCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCierreCaja")) {
				iIndex=this.jInternalFrameDetalleFormCierreCaja.jTabbedPaneRelacionesCierreCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCierreCaja.jTabbedPaneRelacionesCierreCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCierreCaja();	
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
	
	public void cargarCombosForeignKeyCierreCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCierreCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCierreCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCierreCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCierreCaja();
		
		this.cargarCombosFrameForeignKeyCierreCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCierreCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCierreCaja();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFormaPago(this.tipoformapagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCierreCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
			
			if(jTableDatosCierreCaja.getRowCount()>=1) {
				jTableDatosCierreCaja.removeRowSelectionInterval(0, jTableDatosCierreCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoCierreCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCierreCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCierreCaja(true);			
			//this.cierrecaja=new CierreCaja();
			//this.cierrecaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCierreCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCierreCaja() ;
			
			if(CierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCierreCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cierrecaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);				
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
			if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CierreCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCierreCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCierreCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCierreCaja.getSelectedRows().length;			
			}
			
			cierrecajasSeleccionados=this.getCierreCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCierreCaja--;			
				//CierreCaja cierrecajaAux= new CierreCaja();			
				//cierrecajaAux.setId(this.iIdNuevoCierreCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CierreCaja cierrecajaOrigen=new CierreCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CierreCaja cierrecajaOrigen : cierrecajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cierrecajaOrigen =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrecajaOrigen =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCierreCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cierrecaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCierreCaja(cierrecajaOrigen,this.cierrecaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cierrecajaLogic.getCierreCajas().add(this.cierrecajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cierrecajas.add(this.cierrecajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCierreCaja(false);
				
				this.jTableDatosCierreCaja.setRowSelectionInterval(this.getIndiceNuevoCierreCaja(), this.getIndiceNuevoCierreCaja());
				
				int iLastRow =  this.jTableDatosCierreCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCierreCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCierreCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCierreCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();									
		
			CierreCaja cierrecajaOrigen=new CierreCaja();
			CierreCaja cierrecajaDestino=new CierreCaja();
				
			cierrecajasSeleccionados=this.getCierreCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCierreCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cierrecajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCierreCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajaOrigen =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cierrecajaOrigen =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrecajaDestino =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cierrecajaDestino =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cierrecajaOrigen =cierrecajasSeleccionados.get(0);
				cierrecajaDestino =cierrecajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCierreCaja(cierrecajaOrigen,cierrecajaDestino,true,false);
				
				cierrecajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cierrecajaDestino,cierrecajaLogic.getCierreCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cierrecajaDestino,cierrecajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCierreCaja(false);
				
				//this.jTableDatosCierreCaja.setRowSelectionInterval(this.getIndiceNuevoCierreCaja(), this.getIndiceNuevoCierreCaja());
				
				int iLastRow =  this.jTableDatosCierreCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCierreCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCierreCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCierreCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCierreCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCierreCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCierreCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCierreCaja.setVisible(!isVisible);
			this.jPanelPaginacionCierreCaja.setVisible(!isVisible);
			this.jPanelAccionesCierreCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCierreCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCierreCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCierreCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCierreCaja();
			
			this.abrirFrameOrderByCierreCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCierreCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCierreCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCierreCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCierreCaja.isMaximum()) {
					this.jInternalFrameDetalleFormCierreCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCierreCaja.setSize(this.jInternalFrameDetalleFormCierreCaja.iWidthFormulario,this.jInternalFrameDetalleFormCierreCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCierreCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCierreCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCierreCaja.isMaximum()) {
						this.jInternalFrameDetalleFormCierreCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCierreCaja.jContentPaneDetalleCierreCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCierreCaja.jTabbedPaneRelacionesCierreCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCierreCaja.jContentPaneDetalleCierreCaja.getWidth(),CierreCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCierreCaja.jTabbedPaneRelacionesCierreCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCierreCaja.jContentPaneDetalleCierreCaja.getWidth(),CierreCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCierreCaja.jTabbedPaneRelacionesCierreCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCierreCaja.jContentPaneDetalleCierreCaja.getWidth(),CierreCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCierreCaja.setVisible(true);
	        this.jInternalFrameDetalleFormCierreCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCierreCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCierreCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCierreCaja,false,this);
				} else {
					this.jInternalFrameOrderByCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCierreCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCierreCaja);
				this.jInternalFrameOrderByCierreCaja.setVisible(false);
				this.jInternalFrameOrderByCierreCaja.setSelected(false);
				
				this.jInternalFrameOrderByCierreCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCierreCaja"));
				
				this.inicializarActualizarBindingTablaOrderByCierreCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCierreCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCierreCaja==null) {
				
				this.jInternalFrameImportacionCierreCaja=new ImportacionJInternalFrame(CierreCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCierreCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCierreCaja);
				this.jInternalFrameImportacionCierreCaja.setVisible(false);
				this.jInternalFrameImportacionCierreCaja.setSelected(false);


				this.jInternalFrameImportacionCierreCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCierreCaja"));
				this.jInternalFrameImportacionCierreCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCierreCaja"));
				this.jInternalFrameImportacionCierreCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCierreCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCierreCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCierreCaja==null) {
				this.jInternalFrameReporteDinamicoCierreCaja=new ReporteDinamicoJInternalFrame(CierreCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCierreCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCierreCaja);
				this.jInternalFrameReporteDinamicoCierreCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoCierreCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCierreCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCierreCaja"));
				this.jInternalFrameReporteDinamicoCierreCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCierreCaja"));
				this.jInternalFrameReporteDinamicoCierreCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCierreCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCierreCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCierreCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCierreCaja);
			
	       	this.jInternalFrameDetalleFormCierreCaja.setVisible(false);
	        this.jInternalFrameDetalleFormCierreCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormCierreCaja.dispose();
			//this.jInternalFrameDetalleFormCierreCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCierreCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCierreCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoCierreCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCierreCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCierreCaja.setVisible(true);
	        this.jInternalFrameImportacionCierreCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCierreCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCierreCaja.setVisible(true);
	        this.jInternalFrameOrderByCierreCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCierreCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCierreCaja.setVisible(false);
	        this.jInternalFrameOrderByCierreCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCierreCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCierreCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoCierreCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCierreCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCierreCaja.setVisible(false);
	        this.jInternalFrameImportacionCierreCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCierreCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCierreCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCierreCaja(true);
			//this.isEsNuevoCierreCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCierreCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCierreCaja(false) ;
			
			if(cierrecajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCierreCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCierreCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCierreCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCierreCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCierreCaja(true);
			//this.isEsNuevoCierreCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cierrecaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCierreCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCierreCaja(false) ;
			
			if(CierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCierreCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCierreCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaTipoFormaPago(List<TipoFormaPago> tipoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoFormaPago=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO));
		TableCellEditor tableCellEditorTipoFormaPago =tableColumnTipoFormaPago.getCellEditor();

		TipoFormaPagoTableCell tipoformapagoTableCellFk=(TipoFormaPagoTableCell)tableCellEditorTipoFormaPago;

		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.settipoformapagosForeignKey(tipoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCierreCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipoformapagoTableCellFk.settipoformapagosForeignKeyActual(tipoformapagosForeignKey);
		//}


		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.RecargarTipoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCierreCaja(false);
			
			//if(!this.isEsNuevoCierreCaja) {								
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				
			}
			
			if(this.permiteMantenimiento(this.cierrecaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCierreCaja=true;
					this.inicializarActualizarBindingTablaCierreCaja(false);
					this.isEsNuevoCierreCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCierreCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCierreCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCierreCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCierreCaja(false);
				
				this.habilitarDeshabilitarControlesCierreCaja(false);
			
												
				
				if(CierreCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCierreCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCierreCajaActionPerformed(evt,cierrecajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCierreCaja(this.cierrecaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCierreCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cierrecajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cierrecaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				this.cierrecaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				this.cierrecaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cierrecaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CierreCajaModel) this.jTableDatosCierreCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCierreCaja=true;
				this.inicializarActualizarBindingTablaCierreCaja(false);
				this.isEsNuevoCierreCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCierreCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCierreCaja(false);
				
				this.habilitarDeshabilitarControlesCierreCaja(false);
				
				
				
				if(CierreCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCierreCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCierreCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCierreCaja.getRowCount()>=1) {
				jTableDatosCierreCaja.removeRowSelectionInterval(0, jTableDatosCierreCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCierreCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCierreCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCierreCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCierreCaja(false) ;
			
			this.isEsNuevoCierreCaja=false;
			
			if(CierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCierreCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCierreCaja(false);
				
				//SI ES MANUAL
				if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCierreCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCierreCaja--;			
			//CierreCaja cierrecajaAux= new CierreCaja();			
			//cierrecajaAux.setId(this.iIdNuevoCierreCaja);
			
			if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCierreCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
			
			this.cierrecaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cierrecajaLogic.getCierreCajas().add(this.cierrecajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cierrecajas.add(this.cierrecajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCierreCaja(false);
			
			this.jTableDatosCierreCaja.setRowSelectionInterval(this.getIndiceNuevoCierreCaja(), this.getIndiceNuevoCierreCaja());
			
			int iLastRow =  this.jTableDatosCierreCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCierreCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCierreCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCierreCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCierreCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCierreCaja(false);
			
			//SI ES MANUAL
			if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCierreCaja();
			}
			
			//this.abrirFrameTreeCierreCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCierreCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cierre CajaS ?", "MANTENIMIENTO DE Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCierreCaja.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCierreCaja();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cierrecajaReturnGeneral=cierrecajaLogic.procesarImportacionCierreCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cierrecajaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCierreCajaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCierreCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCierreCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCierreCaja.setFileImportacion(this.jInternalFrameImportacionCierreCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCierreCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCierreCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCierreCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCierreCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();		

		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CierreCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CierreCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteCierreCajas("Todos",cierrecajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CierreCajaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreCajaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreCajaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreCajaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talDiferencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talDiferencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talDiferencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talDiferencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreCajaConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCierreCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CierreCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CierreCajaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoria="id_tipo_forma_pago";
					break;

				case CierreCajaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case CierreCajaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA:
					sNombreCampoCategoria="total_diferencia";
					break;

				case CierreCajaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CierreCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CierreCajaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoriaValor="id_tipo_forma_pago";
					break;

				case CierreCajaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case CierreCajaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA:
					sNombreCampoCategoriaValor="total_diferencia";
					break;

				case CierreCajaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CierreCajaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CierreCajaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_forma_pago");
					break;

				case CierreCajaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case CierreCajaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Diferencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_diferencia");
					break;

				case CierreCajaConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCierreCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();		
		
		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrecaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CierreCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CierreCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CierreCaja cierrecaja:cierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrecaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreCajaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CierreCaja cierrecaja:cierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrecaja.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(CierreCaja cierrecaja:cierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrecaja.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
					iRow++;

					for(CierreCaja cierrecaja:cierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrecaja.gettipoformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreCajaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreCajaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(CierreCaja cierrecaja:cierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrecaja.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreCajaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreCajaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(CierreCaja cierrecaja:cierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrecaja.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA);
					iRow++;

					for(CierreCaja cierrecaja:cierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrecaja.gettotal_diferencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreCajaConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreCajaConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(CierreCaja cierrecaja:cierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrecaja.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelCierreCaja(row);				
			//	iRow++;
			//}				
			
			//for(CierreCaja cierrecajaAux:cierrecajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCierreCaja(cierrecajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCierreCaja(false);
			
			//SI ES MANUAL
			if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCierreCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCierreCaja(false);
			
			//SI ES MANUAL
			if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCierreCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCierreCaja(false);
			
			//SI ES MANUAL
			if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCierreCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCierreCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCierreCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCierreCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCierreCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCierreCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCierreCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosCierreCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosCierreCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCierreCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCierreCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCierreCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCierreCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCierreCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCierreCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCierreCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCierreCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CierreCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCierreCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCierreCaja();
		
		this.inicializarActualizarBindingBotonesManualCierreCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCierreCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCierreCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCierreCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCierreCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCierreCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCierreCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCierreCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCierreCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCierreCaja.jCheckBoxPostAccionNuevoCierreCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCierreCaja.jCheckBoxPostAccionSinCerrarCierreCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCierreCaja.jCheckBoxPostAccionSinMensajeCierreCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCierreCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCierreCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCierreCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCierreCaja!=null) {
				this.jInternalFrameDetalleFormCierreCaja.jCheckBoxPostAccionNuevoCierreCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCierreCaja.jCheckBoxPostAccionSinCerrarCierreCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCierreCaja.jCheckBoxPostAccionSinMensajeCierreCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCierreCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCierreCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCierreCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCierreCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCierreCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCierreCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCierreCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCierreCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCierreCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCierreCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCierreCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCierreCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCierreCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCierreCaja() throws Exception {
		try	{
			if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCierreCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCierreCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCierreCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCierreCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCierreCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCierreCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCierreCaja.addItem(reporte);
			}
			
			
			if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCierreCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCierreCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCierreCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCierreCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCierreCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCierreCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCierreCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCierreCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCierreCaja!=null) {
				this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCierreCaja!=null) {
				this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCierreCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCierreCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCierreCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCierreCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CierreCajaConstantesFunciones.getTiposSeleccionarCierreCaja(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CierreCajaConstantesFunciones.getTiposSeleccionarCierreCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CierreCajaConstantesFunciones.getTiposSeleccionarCierreCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCierreCaja.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCierreCaja.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCierreCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.getSelectedItem()!=null){this.id_tipo_forma_pagoFK_IdTipoFormaPago=((TipoFormaPago)this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCierreCaja(Boolean esInicializar) throws Exception {				
		if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCierreCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCierreCaja() throws Exception {
		this.inicializarActualizarBindingTablaCierreCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCierreCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCierreCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCierreCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cierrecajaLogic.getCierreCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cierrecajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCierreCaja.setModel(new CierreCajaModel(this.cierrecajaLogic.getCierreCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCierreCaja.setModel(new CierreCajaModel(this.cierrecajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCierreCaja!=null && this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCierreCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CierreCajaConstantesFunciones.SCLASSWEBTITULO,cierrecajaConstantesFunciones.resaltarSeleccionarCierreCaja,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CierreCajaConstantesFunciones.SCLASSWEBTITULO,cierrecajaConstantesFunciones.resaltarSeleccionarCierreCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_ID));

		if(this.cierrecajaConstantesFunciones.mostraridCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cierrecajaConstantesFunciones.resaltaridCierreCaja,this.cierrecajaConstantesFunciones.activaridCierreCaja,iSizeTabla,this,true,"idCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cierrecajaConstantesFunciones.resaltaridCierreCaja,this.cierrecajaConstantesFunciones.activaridCierreCaja,this,true,"idCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cierrecajaConstantesFunciones.mostrarid_empresaCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreCajaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cierrecajaConstantesFunciones.resaltarid_empresaCierreCaja,this,this.cierrecajaConstantesFunciones.activarid_empresaCierreCaja,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cierrecajaConstantesFunciones.resaltarid_empresaCierreCaja,this,this.cierrecajaConstantesFunciones.activarid_empresaCierreCaja,false,"id_empresaCierreCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cierrecajaConstantesFunciones.mostrarid_sucursalCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreCajaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cierrecajaConstantesFunciones.resaltarid_sucursalCierreCaja,this,this.cierrecajaConstantesFunciones.activarid_sucursalCierreCaja,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cierrecajaConstantesFunciones.resaltarid_sucursalCierreCaja,this,this.cierrecajaConstantesFunciones.activarid_sucursalCierreCaja,false,"id_sucursalCierreCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_IDUSUARIO));

		if(this.cierrecajaConstantesFunciones.mostrarid_usuarioCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreCajaConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.cierrecajaConstantesFunciones.resaltarid_usuarioCierreCaja,this,this.cierrecajaConstantesFunciones.activarid_usuarioCierreCaja,iSizeTabla));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.cierrecajaConstantesFunciones.resaltarid_usuarioCierreCaja,this,this.cierrecajaConstantesFunciones.activarid_usuarioCierreCaja,false,"id_usuarioCierreCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO));

		if(this.cierrecajaConstantesFunciones.mostrarid_tipo_forma_pagoCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.cierrecajaConstantesFunciones.resaltarid_tipo_forma_pagoCierreCaja,this,this.cierrecajaConstantesFunciones.activarid_tipo_forma_pagoCierreCaja,iSizeTabla));
			tableColumn.setCellEditor(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.cierrecajaConstantesFunciones.resaltarid_tipo_forma_pagoCierreCaja,this,this.cierrecajaConstantesFunciones.activarid_tipo_forma_pagoCierreCaja,true,"id_tipo_forma_pagoCierreCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_FECHA));

		if(this.cierrecajaConstantesFunciones.mostrarfechaCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreCajaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cierrecajaConstantesFunciones.resaltarfechaCierreCaja,this.cierrecajaConstantesFunciones.activarfechaCierreCaja,iSizeTabla,this,true,"fechaCierreCaja","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cierrecajaConstantesFunciones.resaltarfechaCierreCaja,this.cierrecajaConstantesFunciones.activarfechaCierreCaja,this,true,"fechaCierreCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_TOTAL));

		if(this.cierrecajaConstantesFunciones.mostrartotalCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreCajaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cierrecajaConstantesFunciones.resaltartotalCierreCaja,this.cierrecajaConstantesFunciones.activartotalCierreCaja,iSizeTabla,this,true,"totalCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cierrecajaConstantesFunciones.resaltartotalCierreCaja,this.cierrecajaConstantesFunciones.activartotalCierreCaja,this,true,"totalCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA));

		if(this.cierrecajaConstantesFunciones.mostrartotal_diferenciaCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cierrecajaConstantesFunciones.resaltartotal_diferenciaCierreCaja,this.cierrecajaConstantesFunciones.activartotal_diferenciaCierreCaja,iSizeTabla,this,true,"total_diferenciaCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cierrecajaConstantesFunciones.resaltartotal_diferenciaCierreCaja,this.cierrecajaConstantesFunciones.activartotal_diferenciaCierreCaja,this,true,"total_diferenciaCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,CierreCajaConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.cierrecajaConstantesFunciones.mostraresta_activoCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreCajaConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cierrecajaConstantesFunciones.resaltaresta_activoCierreCaja,this.cierrecajaConstantesFunciones.activaresta_activoCierreCaja,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cierrecajaConstantesFunciones.resaltaresta_activoCierreCaja,this.cierrecajaConstantesFunciones.activaresta_activoCierreCaja,this,true,"esta_activoCierreCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCierreCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCierreCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCierreCaja && this.isPermisoGuardarCambiosCierreCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCierreCaja.addColumn(tableColumn);
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
			
			this.jTableDatosCierreCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCierreCaja && this.isPermisoGuardarCambiosCierreCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCierreCaja && this.isPermisoGuardarCambiosCierreCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCierreCaja.moveColumn(this.jTableDatosCierreCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCierreCaja.moveColumn(this.jTableDatosCierreCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCierreCaja.moveColumn(this.jTableDatosCierreCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCierreCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCierreCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCierreCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCierreCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCierreCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCierreCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCierreCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCierreCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cierrecajaLogic.getCierreCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cierrecajas.size()-1;
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
		//this.jTableDatosCierreCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCierreCaja();
			
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
				
				//this.isEsNuevoCierreCaja=false;
					
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
				if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCierreCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCierreCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCierreCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cierrecaja.getsType().equals("DUPLICADO")
				   || this.cierrecaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCierreCaja=true;
				
				} else {
					this.isEsNuevoCierreCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
					if(this.cierrecaja.getId()>=0 && !this.cierrecaja.getIsNew()) {						
						this.isEsNuevoCierreCaja=false;
						
					} else {
						this.isEsNuevoCierreCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCierreCaja(esRelaciones);						
				
				this.seleccionarCierreCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cierrecaja.getId()<0) {
					this.isEsNuevoCierreCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCierreCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCierreCaja(evt,rowIndex);
				}	
				
				if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CierreCaja: " + this.dDif); 
					}
				}								
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCierreCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cierrecaja)) {
					if(this.cierrecaja.getId()>0) {
						this.cierrecaja.setIsDeleted(true);
						
						this.cierrecajasEliminados.add(this.cierrecaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cierrecajaLogic.getCierreCajas().remove(this.cierrecaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cierrecajas.remove(this.cierrecaja);				
					}
					
					
					((CierreCajaModel) this.jTableDatosCierreCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCierreCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCierreCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCierreCaja) {
			
			if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCierreCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCierreCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCierreCaja(this.cierrecaja);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cierrecajaConstantesFunciones.cargarid_empresaCierreCaja || this.cierrecajaConstantesFunciones.event_dependid_empresaCierreCaja) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cierrecaja.getid_empresa());
									//this.inicializarActualizarBindingCierreCaja(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cierrecaja.getEmpresa()!=null) {
							this.empresasForeignKey.add(cierrecaja.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cierrecaja.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cierrecajaConstantesFunciones.cargarid_sucursalCierreCaja || this.cierrecajaConstantesFunciones.event_dependid_sucursalCierreCaja) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cierrecaja.getid_sucursal());
									//this.inicializarActualizarBindingCierreCaja(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cierrecaja.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cierrecaja.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cierrecaja.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.cierrecajaConstantesFunciones.cargarid_usuarioCierreCaja || this.cierrecajaConstantesFunciones.event_dependid_usuarioCierreCaja) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.cierrecaja.getid_usuario());
									//this.inicializarActualizarBindingCierreCaja(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(cierrecaja.getUsuario()!=null) {
							this.usuariosForeignKey.add(cierrecaja.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.cierrecaja.getid_usuario(),false,"Formulario");

					//TipoFormaPago
					if(!this.cierrecajaConstantesFunciones.cargarid_tipo_forma_pagoCierreCaja || this.cierrecajaConstantesFunciones.event_dependid_tipo_forma_pagoCierreCaja) {
						//this.cargarCombosTipoFormaPagosForeignKeyLista(" where id="+this.cierrecaja.getid_tipo_forma_pago());
									//this.inicializarActualizarBindingCierreCaja(false,false);
						this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

						if(cierrecaja.getTipoFormaPago()!=null) {
							this.tipoformapagosForeignKey.add(cierrecaja.getTipoFormaPago());
						}

						this.addItemDefectoCombosForeignKeyTipoFormaPago();
						this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
					}
					this.setActualTipoFormaPagoForeignKey(this.cierrecaja.getid_tipo_forma_pago(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCierreCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCierreCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCierreCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCierreCaja(CierreCaja cierrecaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCierreCaja(cierrecaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCierreCaja(CierreCaja cierrecaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCierreCaja(cierrecaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCierreCaja(cierrecaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCierreCaja(cierrecaja);
	}
	
	public void setVariablesObjetoActualToFormularioCierreCaja(CierreCaja cierrecaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.setText(cierrecaja.getId().toString());
			this.jInternalFrameDetalleFormCierreCaja.jDateChooserfechaCierreCaja.setDate(cierrecaja.getfecha());
			this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotalCierreCaja.setText(cierrecaja.gettotal().toString());
			this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotal_diferenciaCierreCaja.setText(cierrecaja.gettotal_diferencia().toString());
			this.jInternalFrameDetalleFormCierreCaja.jCheckBoxesta_activoCierreCaja.setSelected(cierrecaja.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CierreCaja cierrecajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cierrecajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CierreCaja cierrecajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cierrecajaLocal=this.cierrecaja;
			} else {
				cierrecajaLocal=this.cierrecajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cierrecajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCierreCaja(cierrecajaLocal,true);
					
					if(cierrecajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cierrecajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cierrecajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCierreCaja(CierreCaja cierrecaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCierreCaja(cierrecaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(cierrecaja);
	}
	
	public void setVariablesFormularioToObjetoActualCierreCaja(CierreCaja cierrecaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCierreCaja(cierrecaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCierreCaja(CierreCaja cierrecaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.getText()==null || this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.getText()=="" || this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.setText("0");
			}

			if(conColumnasBase) {cierrecaja.setId(Long.parseLong(this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CierreCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabelIdCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cierrecaja.setfecha(this.jInternalFrameDetalleFormCierreCaja.jDateChooserfechaCierreCaja.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CierreCajaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabelfechaCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cierrecaja.settotal(Double.parseDouble(this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotalCierreCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CierreCajaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabeltotalCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cierrecaja.settotal_diferencia(Double.parseDouble(this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotal_diferenciaCierreCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabeltotal_diferenciaCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cierrecaja.setesta_activo(this.jInternalFrameDetalleFormCierreCaja.jCheckBoxesta_activoCierreCaja.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CierreCajaConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreCaja.jLabelesta_activoCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCierreCaja(CierreCaja cierrecajaBean,CierreCaja cierrecaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cierrecajaBean.getid_tipo_forma_pago()!=null && !cierrecajaBean.getid_tipo_forma_pago().equals(-1L))) {cierrecaja.setid_tipo_forma_pago(cierrecajaBean.getid_tipo_forma_pago());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCierreCaja(CierreCaja cierrecajaOrigen,CierreCaja cierrecaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cierrecajaOrigen.getId()!=null && !cierrecajaOrigen.getId().equals(0L))) {cierrecaja.setId(cierrecajaOrigen.getId());}}
			if(conDefault || (!conDefault && cierrecajaOrigen.getid_tipo_forma_pago()!=null && !cierrecajaOrigen.getid_tipo_forma_pago().equals(-1L))) {cierrecaja.setid_tipo_forma_pago(cierrecajaOrigen.getid_tipo_forma_pago());}
			if(conDefault || (!conDefault && cierrecajaOrigen.getfecha()!=null && !cierrecajaOrigen.getfecha().equals(new Date()))) {cierrecaja.setfecha(cierrecajaOrigen.getfecha());}
			if(conDefault || (!conDefault && cierrecajaOrigen.gettotal()!=null && !cierrecajaOrigen.gettotal().equals(0.0))) {cierrecaja.settotal(cierrecajaOrigen.gettotal());}
			if(conDefault || (!conDefault && cierrecajaOrigen.gettotal_diferencia()!=null && !cierrecajaOrigen.gettotal_diferencia().equals(0.0))) {cierrecaja.settotal_diferencia(cierrecajaOrigen.gettotal_diferencia());}
			if(conDefault || (!conDefault && cierrecajaOrigen.getesta_activo()!=null && !cierrecajaOrigen.getesta_activo().equals(false))) {cierrecaja.setesta_activo(cierrecajaOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCierreCaja(CierreCaja cierrecaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.setText(cierrecaja.getId().toString());
			this.jInternalFrameDetalleFormCierreCaja.jDateChooserfechaCierreCaja.setDate(cierrecaja.getfecha());
			this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotalCierreCaja.setText(cierrecaja.gettotal().toString());
			this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotal_diferenciaCierreCaja.setText(cierrecaja.gettotal_diferencia().toString());
			this.jInternalFrameDetalleFormCierreCaja.jCheckBoxesta_activoCierreCaja.setSelected(cierrecaja.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCierreCaja(CierreCajaBean cierrecajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.setText(cierrecajaBean.getId().toString());
			this.jInternalFrameDetalleFormCierreCaja.jDateChooserfechaCierreCaja.setDate(cierrecajaBean.getfecha());
			this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotalCierreCaja.setText(cierrecajaBean.gettotal().toString());
			this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotal_diferenciaCierreCaja.setText(cierrecajaBean.gettotal_diferencia().toString());
			this.jInternalFrameDetalleFormCierreCaja.jCheckBoxesta_activoCierreCaja.setSelected(cierrecajaBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCierreCaja(CierreCajaParameterReturnGeneral cierrecajaReturnGeneral,CierreCajaBean cierrecajaBean,Boolean conDefault) throws Exception { 
		try {
			CierreCaja cierrecajaLocal=new CierreCaja();
			
			cierrecajaLocal=cierrecajaReturnGeneral.getCierreCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cierrecajaLocal.getId()!=null && !cierrecajaLocal.getId().equals(0L))) {cierrecajaBean.setId(cierrecajaLocal.getId());}}
			if(conDefault || (!conDefault && cierrecajaLocal.getid_tipo_forma_pago()!=null && !cierrecajaLocal.getid_tipo_forma_pago().equals(-1L))) {cierrecajaBean.setid_tipo_forma_pago(cierrecajaLocal.getid_tipo_forma_pago());}
			if(conDefault || (!conDefault && cierrecajaLocal.getfecha()!=null && !cierrecajaLocal.getfecha().equals(new Date()))) {cierrecajaBean.setfecha(cierrecajaLocal.getfecha());}
			if(conDefault || (!conDefault && cierrecajaLocal.gettotal()!=null && !cierrecajaLocal.gettotal().equals(0.0))) {cierrecajaBean.settotal(cierrecajaLocal.gettotal());}
			if(conDefault || (!conDefault && cierrecajaLocal.gettotal_diferencia()!=null && !cierrecajaLocal.gettotal_diferencia().equals(0.0))) {cierrecajaBean.settotal_diferencia(cierrecajaLocal.gettotal_diferencia());}
			if(conDefault || (!conDefault && cierrecajaLocal.getesta_activo()!=null && !cierrecajaLocal.getesta_activo().equals(false))) {cierrecajaBean.setesta_activo(cierrecajaLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCierreCajaGenerico(Long idCierreCajaSeleccionado,JComboBox jComboBoxCierreCaja,List<CierreCaja> cierrecajasLocal)throws Exception {
		try {
			CierreCaja  cierrecajaTemp=null;

			for(CierreCaja cierrecajaAux:cierrecajasLocal) {
				if(cierrecajaAux.getId()!=null && cierrecajaAux.getId().equals(idCierreCajaSeleccionado)) {
					cierrecajaTemp=cierrecajaAux;
					break;
				}
			}

			jComboBoxCierreCaja.setSelectedItem(cierrecajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCierreCajaGenerico(JComboBox jComboBoxCierreCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCierreCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCierreCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCierreCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCierreCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cierrecaja=(CierreCaja) cierrecajaLogic.getCierreCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cierrecaja =(CierreCaja) cierrecajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cierrecaja.getIsNew() && !cierrecaja.getIsChanged() && !cierrecaja.getIsDeleted()) {
				sDescripcion=cierrecaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cierrecaja.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cierrecaja.getIsNew() && !cierrecaja.getIsChanged() && !cierrecaja.getIsDeleted()) {
				sDescripcion=cierrecaja.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cierrecaja.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!cierrecaja.getIsNew() && !cierrecaja.getIsChanged() && !cierrecaja.getIsDeleted()) {
				sDescripcion=cierrecaja.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=cierrecaja.getusuario_descripcion();
			}
		}

		if(sTipo.equals("TipoFormaPago")) {
			//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
			if(!cierrecaja.getIsNew() && !cierrecaja.getIsChanged() && !cierrecaja.getIsDeleted()) {
				sDescripcion=cierrecaja.gettipoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=cierrecaja.gettipoformapago_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CierreCaja cierrecajaRow=new CierreCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cierrecajaRow=(CierreCaja) cierrecajaLogic.getCierreCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cierrecajaRow=(CierreCaja) cierrecajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCierreCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoCierreCaja && this.isPermisoNuevoCierreCaja));			
			this.jButtonDuplicarCierreCaja.setVisible((this.isVisibilidadCeldaDuplicarCierreCaja && this.isPermisoDuplicarCierreCaja));			
			this.jButtonCopiarCierreCaja.setVisible((this.isVisibilidadCeldaCopiarCierreCaja && this.isPermisoCopiarCierreCaja));
			this.jButtonVerFormCierreCaja.setVisible((this.isVisibilidadCeldaVerFormCierreCaja && this.isPermisoVerFormCierreCaja));
			
			this.jButtonAbrirOrderByCierreCaja.setVisible((this.isVisibilidadCeldaOrdenCierreCaja && this.isPermisoOrdenCierreCaja));			
			
			this.jButtonNuevoRelacionesCierreCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesCierreCaja && this.isPermisoNuevoCierreCaja));			
			this.jButtonNuevoGuardarCambiosCierreCaja.setVisible((this.isVisibilidadCeldaNuevoCierreCaja && this.isPermisoNuevoCierreCaja && this.isPermisoGuardarCambiosCierreCaja));
			
			if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonModificarCierreCaja.setVisible((this.isVisibilidadCeldaModificarCierreCaja && this.isPermisoActualizarCierreCaja));	
			this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarCierreCaja.setVisible((this.isVisibilidadCeldaActualizarCierreCaja && this.isPermisoActualizarCierreCaja));	
			this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarCierreCaja.setVisible((this.isVisibilidadCeldaEliminarCierreCaja && this.isPermisoEliminarCierreCaja));
			this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarCierreCaja.setVisible(this.isVisibilidadCeldaCancelarCierreCaja);							
			this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCierreCaja && this.isPermisoGuardarCambiosCierreCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosCierreCaja && this.isPermisoGuardarCambiosCierreCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCierreCaja.setVisible((this.isVisibilidadCeldaNuevoCierreCaja && this.isPermisoNuevoCierreCaja));						
			this.jButtonDuplicarToolBarCierreCaja.setVisible((this.isVisibilidadCeldaDuplicarCierreCaja && this.isPermisoDuplicarCierreCaja));						
			this.jButtonCopiarToolBarCierreCaja.setVisible((this.isVisibilidadCeldaCopiarCierreCaja && this.isPermisoCopiarCierreCaja));			
			this.jButtonVerFormToolBarCierreCaja.setVisible((this.isVisibilidadCeldaVerFormCierreCaja && this.isPermisoVerFormCierreCaja));			
			this.jButtonAbrirOrderByToolBarCierreCaja.setVisible((this.isVisibilidadCeldaOrdenCierreCaja && this.isPermisoOrdenCierreCaja));
			this.jButtonNuevoRelacionesToolBarCierreCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesCierreCaja && this.isPermisoNuevoCierreCaja));			
			this.jButtonNuevoGuardarCambiosToolBarCierreCaja.setVisible((this.isVisibilidadCeldaNuevoCierreCaja && this.isPermisoNuevoCierreCaja && this.isPermisoGuardarCambiosCierreCaja));			
			
			if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonModificarToolBarCierreCaja.setVisible((this.isVisibilidadCeldaModificarCierreCaja && this.isPermisoActualizarCierreCaja));	
			this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarToolBarCierreCaja.setVisible((this.isVisibilidadCeldaActualizarCierreCaja  && this.isPermisoActualizarCierreCaja));	
			this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarToolBarCierreCaja.setVisible((this.isVisibilidadCeldaEliminarCierreCaja && this.isPermisoEliminarCierreCaja));
			this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarToolBarCierreCaja.setVisible(this.isVisibilidadCeldaCancelarCierreCaja);				
			this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosToolBarCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCierreCaja && this.isPermisoGuardarCambiosCierreCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosCierreCaja && this.isPermisoGuardarCambiosCierreCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoCierreCaja && this.isPermisoNuevoCierreCaja));			
			this.jMenuItemDuplicarCierreCaja.setVisible((this.isVisibilidadCeldaDuplicarCierreCaja && this.isPermisoDuplicarCierreCaja));			
			this.jMenuItemCopiarCierreCaja.setVisible((this.isVisibilidadCeldaCopiarCierreCaja && this.isPermisoCopiarCierreCaja));			
			this.jMenuItemVerFormCierreCaja.setVisible((this.isVisibilidadCeldaVerFormCierreCaja && this.isPermisoVerFormCierreCaja));			
			this.jMenuItemAbrirOrderByCierreCaja.setVisible((this.isVisibilidadCeldaOrdenCierreCaja && this.isPermisoOrdenCierreCaja));			
			//this.jMenuItemMostrarOcultarCierreCaja.setVisible((this.isVisibilidadCeldaOrdenCierreCaja && this.isPermisoOrdenCierreCaja));
			this.jMenuItemDetalleAbrirOrderByCierreCaja.setVisible((this.isVisibilidadCeldaOrdenCierreCaja && this.isPermisoOrdenCierreCaja));			
			//this.jMenuItemDetalleMostrarOcultarCierreCaja.setVisible((this.isVisibilidadCeldaOrdenCierreCaja && this.isPermisoOrdenCierreCaja));			
			this.jMenuItemNuevoRelacionesCierreCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesCierreCaja && this.isPermisoNuevoCierreCaja));			
			this.jMenuItemNuevoGuardarCambiosCierreCaja.setVisible((this.isVisibilidadCeldaNuevoCierreCaja && this.isPermisoNuevoCierreCaja && this.isPermisoGuardarCambiosCierreCaja));									
			
			if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			this.jInternalFrameDetalleFormCierreCaja.jMenuItemModificarCierreCaja.setVisible((this.isVisibilidadCeldaModificarCierreCaja && this.isPermisoActualizarCierreCaja));	
			this.jInternalFrameDetalleFormCierreCaja.jMenuItemActualizarCierreCaja.setVisible((this.isVisibilidadCeldaActualizarCierreCaja && this.isPermisoActualizarCierreCaja));	
			this.jInternalFrameDetalleFormCierreCaja.jMenuItemEliminarCierreCaja.setVisible((this.isVisibilidadCeldaEliminarCierreCaja && this.isPermisoEliminarCierreCaja));
			this.jInternalFrameDetalleFormCierreCaja.jMenuItemCancelarCierreCaja.setVisible(this.isVisibilidadCeldaCancelarCierreCaja);				
			}
			
			this.jMenuItemGuardarCambiosCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCierreCaja && this.isPermisoGuardarCambiosCierreCaja));						
			this.jMenuItemGuardarCambiosTablaCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosCierreCaja && this.isPermisoGuardarCambiosCierreCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCierreCaja=this.jButtonNuevoCierreCaja.isVisible();
			this.isVisibilidadCeldaDuplicarCierreCaja=this.jButtonDuplicarCierreCaja.isVisible();
			this.isVisibilidadCeldaCopiarCierreCaja=this.jButtonCopiarCierreCaja.isVisible();
			this.isVisibilidadCeldaVerFormCierreCaja=this.jButtonVerFormCierreCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenCierreCaja=this.jButtonAbrirOrderByCierreCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=this.jButtonNuevoRelacionesCierreCaja.isVisible();
			this.isVisibilidadCeldaModificarCierreCaja=this.jButtonModificarCierreCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			this.isVisibilidadCeldaActualizarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarCierreCaja.isVisible();
			this.isVisibilidadCeldaEliminarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarCierreCaja.isVisible();
			this.isVisibilidadCeldaCancelarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarCierreCaja.isVisible();
			this.isVisibilidadCeldaGuardarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosCierreCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=this.jButtonGuardarCambiosTablaCierreCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCierreCaja=this.jButtonNuevoToolBarCierreCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=this.jButtonNuevoRelacionesToolBarCierreCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			this.isVisibilidadCeldaModificarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jButtonModificarToolBarCierreCaja.isVisible();
			this.isVisibilidadCeldaActualizarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarToolBarCierreCaja.isVisible();
			this.isVisibilidadCeldaEliminarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarToolBarCierreCaja.isVisible();
			this.isVisibilidadCeldaCancelarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarToolBarCierreCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCierreCaja=this.jButtonGuardarCambiosToolBarCierreCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=this.jButtonGuardarCambiosTablaToolBarCierreCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCierreCaja=this.jMenuItemNuevoCierreCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=this.jMenuItemNuevoRelacionesCierreCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			this.isVisibilidadCeldaModificarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jMenuItemModificarCierreCaja.isVisible();
			this.isVisibilidadCeldaActualizarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jMenuItemActualizarCierreCaja.isVisible();
			this.isVisibilidadCeldaEliminarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jMenuItemEliminarCierreCaja.isVisible();
			this.isVisibilidadCeldaCancelarCierreCaja=this.jInternalFrameDetalleFormCierreCaja.jMenuItemCancelarCierreCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCierreCaja=this.jMenuItemGuardarCambiosCierreCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=this.jMenuItemGuardarCambiosTablaCierreCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCierreCaja(Boolean esInicializar) {
		if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {
				//if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCierreCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualCierreCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCierreCaja() {
		this.jButtonNuevoCierreCaja.setVisible(this.isPermisoNuevoCierreCaja);			
		this.jButtonDuplicarCierreCaja.setVisible(this.isPermisoDuplicarCierreCaja);			
		this.jButtonCopiarCierreCaja.setVisible(this.isPermisoCopiarCierreCaja);			
		this.jButtonVerFormCierreCaja.setVisible(this.isPermisoVerFormCierreCaja);			
		
		this.jButtonAbrirOrderByCierreCaja.setVisible(this.isPermisoOrdenCierreCaja);					
		
		this.jButtonNuevoRelacionesCierreCaja.setVisible(this.isPermisoNuevoCierreCaja);			
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonModificarCierreCaja.setVisible(this.isPermisoActualizarCierreCaja);	
			this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarCierreCaja.setVisible(this.isPermisoActualizarCierreCaja);	
			this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarCierreCaja.setVisible(this.isPermisoEliminarCierreCaja);
			this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarCierreCaja.setVisible(this.isVisibilidadCeldaCancelarCierreCaja);						
			this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosCierreCaja.setVisible(this.isPermisoGuardarCambiosCierreCaja);							
		}
		
		this.jButtonGuardarCambiosTablaCierreCaja.setVisible(this.isPermisoActualizarCierreCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCierreCaja() {
		this.jInternalFrameDetalleFormCierreCaja.jButtonModificarCierreCaja.setVisible(this.isPermisoActualizarCierreCaja);	
		this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarCierreCaja.setVisible(this.isPermisoActualizarCierreCaja);	
		this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarCierreCaja.setVisible(this.isPermisoEliminarCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarCierreCaja.setVisible(this.isVisibilidadCeldaCancelarCierreCaja);							
		this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCierreCaja && this.isPermisoGuardarCambiosCierreCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCierreCaja() {
		if(CierreCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCierreCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCierreCaja() {
	}
	
	public void jTableDatosCierreCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCierreCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrecaja==null) {
						this.cierrecaja = new CierreCaja();
					}

					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				}

				if(this.cierrecaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cierrecaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCierreCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cierrecajaLogic.getConnexion());

				if(this.cierrecaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cierrecaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreCaja=(TitledBorder)this.jScrollPanelDatosCierreCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCierreCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrecaja==null) {
						this.cierrecaja = new CierreCaja();
					}

					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				}

				if(this.cierrecaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cierrecaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCierreCaja(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cierrecajaLogic.getConnexion());

				if(this.cierrecaja.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cierrecaja.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreCaja=(TitledBorder)this.jScrollPanelDatosCierreCaja.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCierreCaja.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrecaja==null) {
						this.cierrecaja = new CierreCaja();
					}

					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				}

				if(this.cierrecaja.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cierrecaja.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebCierreCaja(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.cierrecajaLogic.getConnexion());

				if(this.cierrecaja.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.cierrecaja.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreCaja=(TitledBorder)this.jScrollPanelDatosCierreCaja.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderCierreCaja.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrecaja==null) {
						this.cierrecaja = new CierreCaja();
					}

					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				}

				if(this.cierrecaja.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.cierrecaja.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_forma_pagoCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoformapago=true;

			idTienePermisotipoformapago=this.tienePermisosUsuarioEnPaginaWebCierreCaja(TipoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);

				this.tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoformapagoBeanSwingJInternalFrame.getTipoFormaPagoLogic().setConnexion(this.cierrecajaLogic.getConnexion());

				if(this.cierrecaja.getid_tipo_forma_pago()!=null) {
					this.tipoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoformapagoBeanSwingJInternalFrame.setIdActual(this.cierrecaja.getid_tipo_forma_pago());
					this.tipoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreCaja=(TitledBorder)this.jScrollPanelDatosCierreCaja.getBorder();
				TitledBorder titledBordertipoformapago=(TitledBorder)this.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.getBorder();

				titledBordertipoformapago.setTitle(titledBorderCierreCaja.getTitle() + " -> Tipo Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_forma_pagoCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrecaja==null) {
						this.cierrecaja = new CierreCaja();
					}

					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				}

				if(this.cierrecaja.getid_tipo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_forma_pago = "+this.cierrecaja.getid_tipo_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrecaja==null) {
						this.cierrecaja = new CierreCaja();
					}

					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				}

				if(this.cierrecaja.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.cierrecaja.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrecaja==null) {
						this.cierrecaja = new CierreCaja();
					}

					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				}

				if(this.cierrecaja.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.cierrecaja.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_diferenciaCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrecaja==null) {
						this.cierrecaja = new CierreCaja();
					}

					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				}

				if(this.cierrecaja.gettotal_diferencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_diferencia = "+this.cierrecaja.gettotal_diferencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.getcierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrecaja==null) {
						this.cierrecaja = new CierreCaja();
					}

					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);
				}

				if(this.cierrecaja.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.cierrecaja.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreCaja(false,false);

			this.getCierreCajasFK_IdEmpresa();

			this.inicializarActualizarBindingCierreCaja(false);

			//if(CierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreCaja(false,false);

			this.getCierreCajasFK_IdSucursal();

			this.inicializarActualizarBindingCierreCaja(false);

			//if(CierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFormaPagoCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreCaja(false,false);

			this.getCierreCajasFK_IdTipoFormaPago();

			this.inicializarActualizarBindingCierreCaja(false);

			//if(CierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreCaja(false,false);

			this.getCierreCajasFK_IdUsuario();

			this.inicializarActualizarBindingCierreCaja(false);

			//if(CierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCierreCaja() {
		if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) {
			this.jInternalFrameDetalleFormCierreCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormCierreCaja.dispose();
			this.jInternalFrameDetalleFormCierreCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCierreCaja!=null) {
			this.jInternalFrameReporteDinamicoCierreCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCierreCaja.dispose();
			this.jInternalFrameReporteDinamicoCierreCaja=null;
		}
		
		if(this.jInternalFrameImportacionCierreCaja!=null) {
			this.jInternalFrameImportacionCierreCaja.setVisible(false);	    			
			this.jInternalFrameImportacionCierreCaja.dispose();
			this.jInternalFrameImportacionCierreCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCierreCaja();
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoCierreCaja")) {
				jButtonNuevoCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCierreCaja")) {
				jButtonDuplicarCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCierreCaja")) {
				jButtonCopiarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormCierreCaja")) {
				jButtonVerFormCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCierreCaja")) {
				jButtonNuevoCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCierreCaja")) {
				jButtonDuplicarCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCierreCaja")) {
				jButtonNuevoCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCierreCaja")) {
				jButtonDuplicarCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCierreCaja")) {
				jButtonNuevoCierreCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCierreCaja")) {
				jButtonNuevoCierreCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCierreCaja")) {
				jButtonNuevoCierreCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCierreCaja")) {
				jButtonModificarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCierreCaja")) {
				jButtonModificarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCierreCaja")) {
				jButtonModificarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCierreCaja")) {
				jButtonActualizarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCierreCaja")) {
				jButtonActualizarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCierreCaja")) {
				jButtonActualizarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarCierreCaja")) {
				jButtonEliminarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCierreCaja")) {
				jButtonEliminarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCierreCaja")) {
				jButtonEliminarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarCierreCaja")) {
				jButtonCancelarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCierreCaja")) {
				jButtonCancelarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCierreCaja")) {
				jButtonCancelarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarCierreCaja")) {
				jButtonCerrarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCierreCaja")) {
				jButtonCerrarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCierreCaja")) {
				jButtonCerrarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCierreCaja")) {
				jButtonMostrarOcultarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCierreCaja")) {
				jButtonCancelarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCierreCaja")) {
				jButtonGuardarCambiosCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCierreCaja")) {
				jButtonGuardarCambiosCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCierreCaja")) {
				jButtonCopiarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCierreCaja")) {
				jButtonVerFormCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCierreCaja")) {
				jButtonGuardarCambiosCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCierreCaja")) {
				jButtonCopiarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCierreCaja")) {
				jButtonVerFormCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCierreCaja")) {
				jButtonGuardarCambiosCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCierreCaja")) {
				jButtonGuardarCambiosCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCierreCaja")) {
				jButtonGuardarCambiosCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCierreCaja")) {
				jButtonRecargarInformacionCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCierreCaja")) {
				jButtonRecargarInformacionCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCierreCaja")) {
				jButtonRecargarInformacionCierreCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCierreCaja")) {
				jButtonAnterioresCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCierreCaja")) {
				jButtonAnterioresCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCierreCaja")) {
				jButtonAnterioresCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCierreCaja")) {
				jButtonSiguientesCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCierreCaja")) {
				jButtonSiguientesCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCierreCaja")) {
				jButtonSiguientesCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCierreCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByCierreCaja")) {
				jButtonAbrirOrderByCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCierreCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarCierreCaja")) {
				jButtonMostrarOcultarCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCierreCaja")) {
				jButtonNuevoGuardarCambiosCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCierreCaja")) {
				jButtonNuevoGuardarCambiosCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCierreCaja")) {
				jButtonNuevoGuardarCambiosCierreCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCierreCaja")) {
				jButtonCerrarReporteDinamicoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCierreCaja")) {
				jButtonGenerarReporteDinamicoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCierreCaja")) {
				
				jButtonGenerarExcelReporteDinamicoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCierreCaja")) {
				jButtonCerrarImportacionCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCierreCaja")) {
				
				jButtonGenerarImportacionCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCierreCaja")) {
				
				jButtonAbrirImportacionCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCierreCaja")) {
				jComboBoxTiposAccionesCierreCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCierreCaja")) {
				jComboBoxTiposRelacionesCierreCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCierreCaja")) {
				jComboBoxTiposAccionesCierreCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCierreCaja")) {
				
				jComboBoxTiposSeleccionarCierreCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCierreCaja")) {
				jTextFieldValorCampoGeneralCierreCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCierreCaja")) {
				jButtonAbrirOrderByCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCierreCaja")) {
				jButtonAbrirOrderByCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCierreCaja")) {
				jButtonCerrarOrderByCierreCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCierreCajaBusqueda")) {
				this.jButtonidCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCierreCajaUpdate")) {
				this.jButtonid_empresaCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCierreCajaBusqueda")) {
				this.jButtonid_empresaCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCierreCajaUpdate")) {
				this.jButtonid_sucursalCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCierreCajaBusqueda")) {
				this.jButtonid_sucursalCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCierreCajaUpdate")) {
				this.jButtonid_usuarioCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCierreCajaBusqueda")) {
				this.jButtonid_usuarioCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoCierreCajaUpdate")) {
				this.jButtonid_tipo_forma_pagoCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoCierreCajaBusqueda")) {
				this.jButtonid_tipo_forma_pagoCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCierreCajaBusqueda")) {
				this.jButtonfechaCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCierreCajaBusqueda")) {
				this.jButtontotalCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_diferenciaCierreCajaBusqueda")) {
				this.jButtontotal_diferenciaCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoCierreCajaBusqueda")) {
				this.jButtonesta_activoCierreCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoFormaPagoCierreCaja")) {
				this.jButtonFK_IdTipoFormaPagoCierreCajaActionPerformed(evt);
			}
			
			;
			
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCierreCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				


				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CierreCaja cierrecajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				cierrecajaLocal=this.cierrecaja;
			} else {
				cierrecajaLocal=this.cierrecajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
							
				
				


				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
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
			
			


			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
								
						
				


				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
								
				
				


				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
							
				
				


				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecajaAnterior =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cierrecajaAnterior =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
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
			
			


			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
								
				
				


				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCierreCaja")) {
					jCheckBoxSeleccionarTodosCierreCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCierreCaja")) {
					jCheckBoxSeleccionadosCierreCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCierreCaja")) {
					
				}
				
				


				
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
												
				
				


				
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrecajaAnterior =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cierrecajaAnterior =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
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
			
			


			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrecaja);
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
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
				
				


				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrecajaAnterior =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCierreCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCierreCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCierreCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cierrecaja =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cierrecaja =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cierrecaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCierreCaja")) {
				
				}
				
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCierreCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCierreCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCierreCaja")) {
			
			}
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCierreCaja();
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
			if(sTipo.equals("NuevoCierreCaja")) {
				jButtonNuevoCierreCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCierreCaja")) {
				jButtonDuplicarCierreCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCierreCaja")) {
				jButtonCopiarCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCierreCaja")) {
				jButtonVerFormCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCierreCaja")) {
				jButtonNuevoCierreCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCierreCaja")) {
				jButtonModificarCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCierreCaja")) {
				jButtonActualizarCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCierreCaja")) {
				jButtonEliminarCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCierreCaja")) {
				jButtonGuardarCambiosCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCierreCaja")) {
				jButtonCancelarCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCierreCaja")) {
				jButtonCerrarCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCierreCaja")) {
				jButtonGuardarCambiosCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCierreCaja")) {
				jButtonNuevoGuardarCambiosCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCierreCaja")) {
				jButtonAbrirOrderByCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCierreCaja")) {
				jButtonRecargarInformacionCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCierreCaja")) {
				jButtonAnterioresCierreCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCierreCaja")) {
				jButtonSiguientesCierreCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCierreCajaBusqueda")) {
				this.jButtonidCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCierreCajaUpdate")) {
				this.jButtonid_empresaCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCierreCajaBusqueda")) {
				this.jButtonid_empresaCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCierreCajaUpdate")) {
				this.jButtonid_sucursalCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCierreCajaBusqueda")) {
				this.jButtonid_sucursalCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCierreCajaUpdate")) {
				this.jButtonid_usuarioCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCierreCajaBusqueda")) {
				this.jButtonid_usuarioCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoCierreCajaUpdate")) {
				this.jButtonid_tipo_forma_pagoCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoCierreCajaBusqueda")) {
				this.jButtonid_tipo_forma_pagoCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCierreCajaBusqueda")) {
				this.jButtonfechaCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCierreCajaBusqueda")) {
				this.jButtontotalCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_diferenciaCierreCajaBusqueda")) {
				this.jButtontotal_diferenciaCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoCierreCajaBusqueda")) {
				this.jButtonesta_activoCierreCajaBusquedaActionPerformed(evt);
			}
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCierreCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCierreCaja")) {
				closingInternalFrameCierreCaja();
				
			} else if(sTipo.equals("jButtonCancelarCierreCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormCierreCaja = (JInternalFrameBase)evt.getSource();
	            	
	            CierreCajaBeanSwingJInternalFrame jInternalFrameParent=(CierreCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormCierreCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCierreCajaActionPerformed(null);
			}
			
			CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cierrecaja,new Object(),this.cierrecajaParameterGeneral,this.cierrecajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCierreCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCierreCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCierreCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cierrecaja)) {
			if(!esControlTabla) {
				if(CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);			
				}
				
				if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCierreCaja(this.cierrecaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cierrecajaReturnGeneral=cierrecajaLogic.procesarEventosCierreCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cierrecajaLogic.getCierreCajas(),this.cierrecaja,this.cierrecajaParameterGeneral,this.isEsNuevoCierreCaja,classes);//this.cierrecajaLogic.getCierreCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCierreCaja(this.cierrecajaReturnGeneral,this.cierrecajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCierreCaja(classes,this.cierrecajaReturnGeneral,this.cierrecajaBean,false);
					}
						
					if(this.cierrecajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCierreCaja(this.cierrecajaReturnGeneral.getCierreCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCierreCaja(this.cierrecajaReturnGeneral.getCierreCaja());	
					}
						
					if(this.cierrecajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCierreCaja(this.cierrecajaReturnGeneral.getCierreCaja(),classes);//this.cierrecajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCierreCaja(this.cierrecaja,classes);//this.cierrecajaBean);									
				}
			
				if(CierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCierreCaja(this.cierrecaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreCaja(this.cierrecaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cierrecajaAnterior!=null) {
						this.cierrecaja=this.cierrecajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cierrecajaReturnGeneral=cierrecajaLogic.procesarEventosCierreCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cierrecajaLogic.getCierreCajas(),this.cierrecaja,this.cierrecajaParameterGeneral,this.isEsNuevoCierreCaja,classes);//this.cierrecajaLogic.getCierreCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cierrecajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cierrecajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cierrecajaReturnGeneral.getCierreCaja(),cierrecajaLogic.getCierreCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cierrecajaReturnGeneral.getCierreCaja(),this.cierrecajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCierreCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosCierreCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCierreCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosCierreCaja() throws Exception {
		
		CierreCajaModel cierrecajaModel=(CierreCajaModel)this.jTableDatosCierreCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cierrecajaModel.cierrecajas=this.cierrecajaLogic.getCierreCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cierrecajaModel.cierrecajas=this.cierrecajas;
		}
		
		
		((CierreCajaModel) this.jTableDatosCierreCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCierreCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcierrecajaAnterior(),this.cierrecajaLogic.getCierreCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcierrecajaAnterior(),this.cierrecajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCierreCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCierreCaja(CierreCaja cierrecaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
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
										
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cierrecaja,new Object(),generalEntityParameterGeneral,this.cierrecajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CierreCajaConstantesFunciones.getClassesRelationshipsOfCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CierreCajaConstantesFunciones.getClassesRelationshipsFromStringsOfCierreCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCierreCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cierrecaja,new Object(),generalEntityParameterGeneral,this.cierrecajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCierreCaja(CierreCajaBean cierrecajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCierreCaja(ArrayList<Classe> classes,CierreCajaReturnGeneral cierrecajaReturnGeneral,CierreCajaBean cierrecajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCierreCaja(CierreCaja cierrecaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cierrecaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCierreCaja = new CierreCajaDetalleFormJInternalFrame(jDesktopPane,this.cierrecajaSessionBean.getConGuardarRelaciones(),this.cierrecajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.setVisible(false);
		this.jInternalFrameDetalleFormCierreCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormCierreCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCierreCaja.cierrecajaLogic=this.cierrecajaLogic;
		
		this.cargarCombosFrameForeignKeyCierreCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCierreCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCierreCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCierreCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCierreCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCierreCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCierreCaja"));
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonModificarCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarCierreCaja"));

		
		this.jInternalFrameDetalleFormCierreCaja.jButtonModificarToolBarCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarCierreCaja"));
					
		this.jInternalFrameDetalleFormCierreCaja.jMenuItemModificarCierreCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarCierreCaja.addActionListener (new ButtonActionListener(this,"ActualizarCierreCaja"));
		
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarToolBarCierreCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCierreCaja"));
						
		this.jInternalFrameDetalleFormCierreCaja.jMenuItemActualizarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarCierreCaja"));
		
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarCierreCaja"));
								
		this.jInternalFrameDetalleFormCierreCaja.jMenuItemEliminarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarCierreCaja"));
		
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarCierreCaja"));
					
		this.jInternalFrameDetalleFormCierreCaja.jMenuItemCancelarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCierreCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCierreCaja.jMenuItemDetalleCerrarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCierreCaja"));
		
		
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCierreCaja"));
		
		
		
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCierreCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonidCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"idCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_empresaCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_empresaCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_sucursalCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_sucursalCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_usuarioCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_usuarioCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_tipo_forma_pagoCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_tipo_forma_pagoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonfechaCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"fechaCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtontotalCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtontotal_diferenciaCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"total_diferenciaCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonesta_activoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCierreCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCierreCaja.jTabbedPaneRelacionesCierreCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCierreCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCierreCaja"));
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCierreCaja"));
		}
		
		this.jTableDatosCierreCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCierreCaja"));
		
		this.jTableDatosCierreCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCierreCaja"));
		
		this.jButtonNuevoCierreCaja.addActionListener(new ButtonActionListener(this,"NuevoCierreCaja"));
		
		this.jButtonDuplicarCierreCaja.addActionListener(new ButtonActionListener(this,"DuplicarCierreCaja"));
		
		this.jButtonCopiarCierreCaja.addActionListener(new ButtonActionListener(this,"CopiarCierreCaja"));
		
		this.jButtonVerFormCierreCaja.addActionListener(new ButtonActionListener(this,"VerFormCierreCaja"));
		
		
		this.jButtonNuevoToolBarCierreCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarCierreCaja"));
			
		this.jButtonDuplicarToolBarCierreCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCierreCaja"));
			
		this.jMenuItemNuevoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCierreCaja"));
			
		this.jMenuItemDuplicarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCierreCaja"));		
		
		
		this.jButtonNuevoRelacionesCierreCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCierreCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarCierreCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCierreCaja"));
			
		this.jMenuItemNuevoRelacionesCierreCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCierreCaja"));		
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonModificarCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonModificarToolBarCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarCierreCaja"));
			
			this.jInternalFrameDetalleFormCierreCaja.jMenuItemModificarCierreCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarCierreCaja.addActionListener (new ButtonActionListener(this,"ActualizarCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonActualizarToolBarCierreCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCierreCaja"));
				
			this.jInternalFrameDetalleFormCierreCaja.jMenuItemActualizarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonEliminarToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarCierreCaja"));
						
			this.jInternalFrameDetalleFormCierreCaja.jMenuItemEliminarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonCancelarToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarCierreCaja"));
			
			this.jInternalFrameDetalleFormCierreCaja.jMenuItemCancelarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCierreCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCierreCaja"));		
		
		
		this.jButtonCerrarCierreCaja.addActionListener (new ButtonActionListener(this,"CerrarCierreCaja"));
		
		
		this.jButtonCerrarToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarCierreCaja"));
			
		this.jMenuItemCerrarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCierreCaja"));
			
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jMenuItemDetalleCerrarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCierreCaja"));
		}
		
		this.jButtonCopiarToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarCierreCaja"));
			
		this.jButtonVerFormToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarCierreCaja"));
		
		this.jMenuItemGuardarCambiosCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCierreCaja"));
			
		this.jMenuItemCopiarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCierreCaja"));		
		
		this.jMenuItemVerFormCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCierreCaja"));		
		
		
		this.jButtonGuardarCambiosTablaCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCierreCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCierreCaja"));
			
		this.jMenuItemGuardarCambiosTablaCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCierreCaja"));		
		
		
		
		this.jButtonRecargarInformacionCierreCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionCierreCaja"));
					
		this.jButtonRecargarInformacionToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCierreCaja"));
		
		this.jMenuItemRecargarInformacionCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCierreCaja"));		
		
		
		
		this.jButtonAnterioresCierreCaja.addActionListener (new ButtonActionListener(this,"AnterioresCierreCaja"));
		
		
		this.jButtonAnterioresToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCierreCaja"));
		
		this.jMenuItemAnterioresCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCierreCaja"));		
		
		
		this.jButtonSiguientesCierreCaja.addActionListener (new ButtonActionListener(this,"SiguientesCierreCaja"));
		
		
		this.jButtonSiguientesToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCierreCaja"));
			
		this.jMenuItemSiguientesCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCierreCaja"));
			
		this.jMenuItemAbrirOrderByCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCierreCaja"));
			
		this.jMenuItemMostrarOcultarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCierreCaja"));
			
		this.jMenuItemDetalleAbrirOrderByCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCierreCaja"));
			
		this.jMenuItemDetalleMostarOcultarCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCierreCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosCierreCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCierreCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCierreCaja"));
			
		this.jMenuItemNuevoGuardarCambiosCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCierreCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCierreCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCierreCaja"));

		this.jCheckBoxSeleccionadosCierreCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCierreCaja"));
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCierreCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesCierreCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesCierreCaja"));
			
		this.jComboBoxTiposAccionesCierreCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesCierreCaja"));
					
		this.jComboBoxTiposSeleccionarCierreCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCierreCaja"));
			
		this.jTextFieldValorCampoGeneralCierreCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCierreCaja"));		
		
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonidCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"idCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_empresaCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_empresaCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_sucursalCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_sucursalCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_usuarioCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_usuarioCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_tipo_forma_pagoCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_tipo_forma_pagoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonfechaCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"fechaCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtontotalCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtontotal_diferenciaCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"total_diferenciaCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonesta_activoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCierreCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoFormaPagoCierreCaja.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoCierreCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCierreCaja!=null) {
				this.jInternalFrameReporteDinamicoCierreCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCierreCaja"));
				this.jInternalFrameReporteDinamicoCierreCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCierreCaja"));
				this.jInternalFrameReporteDinamicoCierreCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCierreCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoCierreCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCierreCaja"));				
			//this.jButtonGenerarReporteDinamicoCierreCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCierreCaja"));
			//this.jButtonGenerarExcelReporteDinamicoCierreCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCierreCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCierreCaja!=null) {
				this.jInternalFrameImportacionCierreCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCierreCaja"));
				this.jInternalFrameImportacionCierreCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCierreCaja"));
				this.jInternalFrameImportacionCierreCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCierreCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCierreCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByCierreCaja"));
			
			this.jButtonAbrirOrderByToolBarCierreCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCierreCaja"));			
			
			if(this.jInternalFrameOrderByCierreCaja!=null) {
				this.jInternalFrameOrderByCierreCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCierreCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreCaja.jTabbedPaneRelacionesCierreCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCierreCaja"));
		
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
            		closingInternalFrameCierreCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCierreCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCierreCaja = (JInternalFrameBase)event.getSource();
	            	
	            CierreCajaBeanSwingJInternalFrame jInternalFrameParent=(CierreCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormCierreCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCierreCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCierreCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCierreCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCierreCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCierreCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCierreCaja";
		inputMap = this.jButtonNuevoCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCierreCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCierreCaja";
		inputMap = this.jButtonNuevoRelacionesCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCierreCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCierreCaja";
		inputMap = this.jButtonModificarCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCierreCaja";
		inputMap = this.jButtonActualizarCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCierreCaja";
		inputMap = this.jButtonEliminarCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCierreCaja";
		inputMap = this.jButtonCancelarCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCierreCaja";
		inputMap = this.jButtonCerrarCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCierreCaja";
		inputMap = this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCierreCaja.jButtonGuardarCambiosCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCierreCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCierreCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCierreCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCierreCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCierreCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCierreCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCierreCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCierreCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonidCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"idCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_empresaCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_empresaCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_sucursalCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_sucursalCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_usuarioCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_usuarioCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_tipo_forma_pagoCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonid_tipo_forma_pagoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonfechaCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"fechaCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtontotalCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtontotal_diferenciaCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"total_diferenciaCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreCaja.jButtonesta_activoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCierreCajaBusqueda"));
		
		
		this.jButtonFK_IdTipoFormaPagoCierreCaja.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoCierreCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCierreCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCierreCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCierreCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CierreCaja cierrecajaAux:this.cierrecajaLogic.getCierreCajas()) {
					cierrecajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CierreCaja cierrecajaAux:cierrecajas) {
					cierrecajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCierreCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCierreCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CierreCaja cierrecajaAux:this.cierrecajaLogic.getCierreCajas()) {
						cierrecajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CierreCaja cierrecajaAux:cierrecajas) {
						cierrecajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CierreCaja cierrecajaAux:this.cierrecajaLogic.getCierreCajas()) {
					
						if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							cierrecajaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CierreCaja cierrecajaAux:cierrecajas) {
						
						if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							cierrecajaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCierreCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCierreCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCierreCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCierreCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCierreCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCierreCaja.getSelectedRows();
			
			CierreCaja cierrecajaLocal=new CierreCaja();
			
			//this.seleccionarTodosCierreCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrecajaLocal =(CierreCaja) this.cierrecajaLogic.getCierreCajas().toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cierrecajaLocal =(CierreCaja) this.cierrecajas.toArray()[this.jTableDatosCierreCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cierrecajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CierreCaja cierrecajaAux:this.cierrecajaLogic.getCierreCajas()) {
						cierrecajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CierreCaja cierrecajaAux:cierrecajas) {
						cierrecajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCierreCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCierreCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCierreCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCierreCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCierreCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCierreCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCierreCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCierreCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCierreCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CierreCaja cierrecajaAux:this.cierrecajaLogic.getCierreCajas()) {
				
						if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cierrecajaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cierrecajaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA)) {
							existe=true;
							cierrecajaAux.settotal_diferencia(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CierreCaja cierrecajaAux:cierrecajas) {
					
						if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cierrecajaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cierrecajaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA)) {
							existe=true;
							cierrecajaAux.settotal_diferencia(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCierreCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCierreCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCierreCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCierreCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCierreCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCierreCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessCierreCaja(conSplash);
				
					this.generarReporteCierreCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCierreCajasSeleccionados();
				//this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCierreCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCierreCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCierreCaja();
				
				this.exportarCierreCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCierreCajas();
				//this.importarCierreCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCierreCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCierreCajasSeleccionados();
				//this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCierreCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCierreCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCierreCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(CierreCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCierreCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCierreCaja(conSplash);
					
						//this.actualizarParametrosGeneralCierreCaja();
						
						this.generarReporteProcesoAccionCierreCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CierreCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cierre CajaS SELECCIONADOS?", "MANTENIMIENTO DE Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCierreCaja();
				
						this.actualizarParametrosGeneralCierreCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cierrecajaReturnGeneral=cierrecajaLogic.procesarAccionCierreCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cierrecajaLogic.getCierreCajas(),this.cierrecajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCierreCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCierreCaja();
					
					CierreCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCierreCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCierreCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCierreCaja.jComboBoxTiposAccionesFormularioCierreCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCierreCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCierreCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCierreCaja();
			
			if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();		
			CierreCaja cierrecaja=new CierreCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCierreCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCierreCaja.getSelectedItem();
			
			
			
			
			cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(cierrecajasSeleccionados.size()==1) {
				for(CierreCaja cierrecajaAux:cierrecajasSeleccionados) {
					cierrecaja=cierrecajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCierreCaja();
			
      		//this.finishProcessCierreCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCierreCajaReturnGeneral() throws Exception {
		if(this.cierrecajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cierrecajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cierrecajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cierrecajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cierrecajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cierrecajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCierreCaja(false);
		}
		
		if(this.cierrecajaReturnGeneral.getConRetornoLista() || this.cierrecajaReturnGeneral.getConRetornoObjeto()) {
			if(this.cierrecajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cierrecajaLogic.setCierreCajas(this.cierrecajaReturnGeneral.getCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cierrecajaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cierrecajaLogic.setCierreCaja(this.cierrecajaReturnGeneral.getCierreCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCierreCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralCierreCaja() throws Exception {
		
		
	}
	
	public ArrayList<CierreCaja> getCierreCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCierreCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CierreCaja cierrecajaAux:cierrecajaLogic.getCierreCajas()) {
					if(cierrecajaAux.getIsSelected()) {
						cierrecajasSeleccionados.add(cierrecajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CierreCaja cierrecajaAux:this.cierrecajas) {
					if(cierrecajaAux.getIsSelected()) {
						cierrecajasSeleccionados.add(cierrecajaAux);				
					}
				}
			}
			
			if(cierrecajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cierrecajasSeleccionados.addAll(this.cierrecajaLogic.getCierreCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cierrecajasSeleccionados.addAll(this.cierrecajas);				
					}
				}
			}
		} else {
			cierrecajasSeleccionados.add(this.cierrecaja);
		}
		
		return cierrecajasSeleccionados;
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
	
	public void generarReporteCierreCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCierreCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCierreCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCierreCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCierreCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cierre Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCierreCajasSeleccionados() throws Exception {
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();		
		
		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCierreCajas("Todos",cierrecajasSeleccionados);
		
	}	
	
	public void generarReporteNormalCierreCajasSeleccionados() throws Exception {
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();		
		
		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCierreCajas("Todos",cierrecajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCierreCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();
		
		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCierreCajas("Todos",cierrecajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCierreCajasSeleccionados() throws Exception {
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCierreCaja();
		
		
		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCierreCaja();
		
		
		//this.generarReporteCierreCajas("Todos",cierrecajasSeleccionados ,cierrecajaImplementable,cierrecajaImplementableHome);
	}
	
	public void mostrarImportacionCierreCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCierreCaja();
		
		this.abrirFrameImportacionCierreCaja();		
		
			
		//this.generarReporteCierreCajas("Todos",cierrecajasSeleccionados ,cierrecajaImplementable,cierrecajaImplementableHome);
	}
	
	public void importarCierreCajas() throws Exception {		
	
	}
	
	public void exportarCierreCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCierreCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCierreCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCierreCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cierre Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCierreCajasSeleccionados() throws Exception {
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();		
		
		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrecaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCierreCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CierreCaja cierrecajaAux:cierrecajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCierreCaja(cierrecajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cierrecajaAux.setsDetalleGeneralEntityReporte(cierrecajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCierreCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreCajaConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCierreCaja(CierreCaja cierrecaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cierrecaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrecaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrecaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrecaja.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrecaja.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrecaja.gettipoformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrecaja.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrecaja.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrecaja.gettotal_diferencia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrecaja.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCierreCajasSeleccionados() throws Exception {
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();		
		
		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrecaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CierreCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCierreCaja(row);				
				iRow++;
			}				
			
			for(CierreCaja cierrecajaAux:cierrecajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCierreCaja(cierrecajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCierreCajasSeleccionados() throws Exception {
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();		
		
		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrecaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cierrecajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cierrecaja");
			//elementRoot.appendChild(element);
		
			for(CierreCaja cierrecajaAux:cierrecajasSeleccionados) {
				element = document.createElement("cierrecaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCierreCaja(cierrecajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCierreCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreCajaConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCierreCaja(CierreCaja cierrecaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cierrecaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrecaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrecaja.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrecaja.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrecaja.gettipoformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrecaja.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrecaja.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrecaja.gettotal_diferencia());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrecaja.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlCierreCaja(CierreCaja cierrecaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CierreCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cierrecaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CierreCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cierrecaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CierreCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cierrecaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CierreCajaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cierrecaja.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(CierreCajaConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(cierrecaja.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementtipoformapago_descripcion = document.createElement(CierreCajaConstantesFunciones.IDTIPOFORMAPAGO);
		elementtipoformapago_descripcion.appendChild(document.createTextNode(cierrecaja.gettipoformapago_descripcion()));
		element.appendChild(elementtipoformapago_descripcion);

		Element elementfecha = document.createElement(CierreCajaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(cierrecaja.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementtotal = document.createElement(CierreCajaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(cierrecaja.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementtotal_diferencia = document.createElement(CierreCajaConstantesFunciones.TOTALDIFERENCIA);
		elementtotal_diferencia.appendChild(document.createTextNode(cierrecaja.gettotal_diferencia().toString().trim()));
		element.appendChild(elementtotal_diferencia);

		Element elementesta_activo = document.createElement(CierreCajaConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(cierrecaja.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoCierreCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CierreCaja> cierrecajasSeleccionados=new ArrayList<CierreCaja>();
		
		cierrecajasSeleccionados=this.getCierreCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCierreCaja(cierrecajasSeleccionados);
		
		this.generarReporteCierreCajas("Todos",cierrecajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCierreCaja(ArrayList<CierreCaja> cierrecajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CierreCaja cierrecajaAux:cierrecajasSeleccionados) {
				cierrecajaAux.setsDetalleGeneralEntityReporte(cierrecajaAux.toString());
			
				if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cierrecajaAux.setsDescripcionGeneralEntityReporte1(cierrecajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cierrecajaAux.setsDescripcionGeneralEntityReporte1(cierrecajaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					cierrecajaAux.setsDescripcionGeneralEntityReporte1(cierrecajaAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO)) {
					existe=true;
					cierrecajaAux.setsDescripcionGeneralEntityReporte1(cierrecajaAux.gettipoformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					cierrecajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cierrecajaAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(CierreCajaConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					cierrecajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cierrecajaAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCierreCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCierreCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesCierreCaja=true;
				this.isVisibilidadCeldaGuardarCambiosCierreCaja=true;
			}
			
			this.isVisibilidadCeldaModificarCierreCaja=false;
			this.isVisibilidadCeldaActualizarCierreCaja=false;
			this.isVisibilidadCeldaEliminarCierreCaja=false;
			this.isVisibilidadCeldaCancelarCierreCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=false;
			this.isVisibilidadCeldaModificarCierreCaja=false;
			this.isVisibilidadCeldaActualizarCierreCaja=true;
			this.isVisibilidadCeldaEliminarCierreCaja=false;
			this.isVisibilidadCeldaCancelarCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=false;
			this.isVisibilidadCeldaModificarCierreCaja=false;
			this.isVisibilidadCeldaActualizarCierreCaja=true;
			this.isVisibilidadCeldaEliminarCierreCaja=true;
			this.isVisibilidadCeldaCancelarCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=false;
			this.isVisibilidadCeldaModificarCierreCaja=false;
			this.isVisibilidadCeldaActualizarCierreCaja=true;
			this.isVisibilidadCeldaEliminarCierreCaja=false;
			this.isVisibilidadCeldaCancelarCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCierreCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=true;
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=true;
			this.isVisibilidadCeldaModificarCierreCaja=false;
			this.isVisibilidadCeldaActualizarCierreCaja=false;
			this.isVisibilidadCeldaEliminarCierreCaja=false;
			this.isVisibilidadCeldaCancelarCierreCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=false;
			this.isVisibilidadCeldaActualizarCierreCaja=false;
			this.isVisibilidadCeldaEliminarCierreCaja=false;
			this.isVisibilidadCeldaCancelarCierreCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=false;
			this.isVisibilidadCeldaModificarCierreCaja=true;
			this.isVisibilidadCeldaActualizarCierreCaja=false;
			this.isVisibilidadCeldaEliminarCierreCaja=false;
			this.isVisibilidadCeldaCancelarCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarCierreCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CierreCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCierreCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=true;
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=true;
		} else {
			this.actualizarEstadoPanelsCierreCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCierreCaja=false;
			//this.isVisibilidadCeldaVerFormCierreCaja=false;
			this.isVisibilidadCeldaDuplicarCierreCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cierrecajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCierreCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cierrecajaSessionBean.getEsGuardarRelacionado()) {
			if(!cierrecajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCierreCaja=false;												
			}
			
			this.jButtonCerrarCierreCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCierreCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.cierrecaja)) {
			this.isVisibilidadCeldaActualizarCierreCaja=false;
			this.isVisibilidadCeldaEliminarCierreCaja=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCierreCaja() {
	}
	
	public void actualizarEstadoPanelsCierreCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCierreCaja!=null) {
				this.jScrollPanelDatosEdicionCierreCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreCaja!=null) {
				this.jTabbedPaneBusquedasCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCierreCaja!=null) {
				this.jScrollPanelDatosCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCierreCaja!=null) {
				this.jPanelPaginacionCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCierreCaja!=null) {
				this.jPanelParametrosReportesCierreCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCierreCaja!=null) {
				this.jScrollPanelDatosEdicionCierreCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreCaja!=null) {
				this.jTabbedPaneBusquedasCierreCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCierreCaja!=null) {
				this.jScrollPanelDatosCierreCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionCierreCaja!=null) {
				this.jPanelPaginacionCierreCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCierreCaja!=null) {
				this.jPanelParametrosReportesCierreCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCierreCaja!=null) {
				this.jScrollPanelDatosEdicionCierreCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreCaja!=null) {
				this.jTabbedPaneBusquedasCierreCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCierreCaja!=null) {
				this.jScrollPanelDatosCierreCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionCierreCaja!=null) {
				this.jPanelPaginacionCierreCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCierreCaja!=null) {
				this.jPanelParametrosReportesCierreCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCierreCaja!=null) {
				this.jScrollPanelDatosEdicionCierreCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreCaja!=null) {
				this.jTabbedPaneBusquedasCierreCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCierreCaja!=null) {
				this.jScrollPanelDatosCierreCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionCierreCaja!=null) {
				this.jPanelPaginacionCierreCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCierreCaja!=null) {
				this.jPanelParametrosReportesCierreCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCierreCaja!=null) {
				this.jScrollPanelDatosEdicionCierreCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreCaja!=null) {
				this.jTabbedPaneBusquedasCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCierreCaja!=null) {
				this.jScrollPanelDatosCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCierreCaja!=null) {
				this.jPanelPaginacionCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCierreCaja!=null) {
				this.jPanelParametrosReportesCierreCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCierreCaja!=null) {
				this.jScrollPanelDatosEdicionCierreCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreCaja!=null) {
				this.jTabbedPaneBusquedasCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCierreCaja!=null) {
				this.jScrollPanelDatosCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCierreCaja!=null) {
				this.jPanelPaginacionCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCierreCaja!=null) {
				this.jPanelParametrosReportesCierreCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCierreCaja!=null) {
				this.jScrollPanelDatosEdicionCierreCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreCaja!=null) {
				this.jTabbedPaneBusquedasCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCierreCaja!=null) {
				this.jScrollPanelDatosCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCierreCaja!=null) {
				this.jPanelPaginacionCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCierreCaja!=null) {
				this.jPanelParametrosReportesCierreCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCierreCaja!=null) {
					this.jTabbedPaneBusquedasCierreCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCierreCaja!=null) {
				this.jPanelParametrosReportesCierreCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreCaja!=null) {
				this.jTabbedPaneBusquedasCierreCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCierreCaja!=null) {
				this.jPanelParametrosReportesCierreCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasCierreCaja.remove(jPanelFK_IdTipoFormaPagoCierreCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTipoFormaPago=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasCierreCaja.remove(jPanelFK_IdTipoFormaPagoCierreCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdTipoFormaPago=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasCierreCaja.remove(jPanelFK_IdTipoFormaPagoCierreCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFormaPago(Boolean isParaTipoFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFormaPagoNegation=!isParaTipoFormaPago;

			this.isVisibilidadFK_IdTipoFormaPago=isParaTipoFormaPago;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasCierreCaja.remove(jPanelFK_IdTipoFormaPagoCierreCaja);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CierreCajaSessionBean cierrecajaSessionBean=new CierreCajaSessionBean();
		
		if(this.cierrecajaSessionBean==null) {
			this.cierrecajaSessionBean=new CierreCajaSessionBean();
		}
		
		this.cierrecajaSessionBean.setsUltimaBusquedaCierreCaja(this.getsAccionBusqueda());
		this.cierrecajaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cierrecajaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cierrecajaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cierrecajaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
			cierrecajaSessionBean.setid_tipo_forma_pago(this.getid_tipo_forma_pagoFK_IdTipoFormaPago());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			cierrecajaSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CierreCajaSessionBean cierrecajaSessionBean=new CierreCajaSessionBean();
		
		if(this.cierrecajaSessionBean==null) {
			this.cierrecajaSessionBean=new CierreCajaSessionBean();
		}
		
		if(this.cierrecajaSessionBean.getsUltimaBusquedaCierreCaja()!=null&&!this.cierrecajaSessionBean.getsUltimaBusquedaCierreCaja().equals("")) {
			this.setsAccionBusqueda(cierrecajaSessionBean.getsUltimaBusquedaCierreCaja());
			this.setiNumeroPaginacion(cierrecajaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cierrecajaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cierrecajaSessionBean.getid_empresa());
				cierrecajaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cierrecajaSessionBean.getid_sucursal());
				cierrecajaSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
				this.setid_tipo_forma_pagoFK_IdTipoFormaPago(cierrecajaSessionBean.getid_tipo_forma_pago());
				cierrecajaSessionBean.setid_tipo_forma_pago(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(cierrecajaSessionBean.getid_usuario());
				cierrecajaSessionBean.setid_usuario(-1L);
			}
		}
		
		this.cierrecajaSessionBean.setsUltimaBusquedaCierreCaja("");
		this.cierrecajaSessionBean.setiNumeroPaginacion(CierreCajaConstantesFunciones.INUMEROPAGINACION);
		this.cierrecajaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCierreCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCierreCaja() {
		this.updateBorderResaltarBusquedasFormularioCierreCaja();
		this.updateVisibilidadBusquedasFormularioCierreCaja();
		this.updateHabilitarBusquedasFormularioCierreCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioCierreCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCierreCaja.getComponents().length>0) {
	

		if(this.cierrecajaConstantesFunciones.resaltarFK_IdTipoFormaPagoCierreCaja!=null) {
			index= this.jTabbedPaneBusquedasCierreCaja.indexOfComponent(this.jPanelFK_IdTipoFormaPagoCierreCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreCaja.getComponent(index);
				jPanel.setBorder(this.cierrecajaConstantesFunciones.resaltarFK_IdTipoFormaPagoCierreCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCierreCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCierreCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCierreCaja.indexOfComponent(this.jPanelFK_IdTipoFormaPagoCierreCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCierreCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cierrecajaConstantesFunciones.mostrarFK_IdTipoFormaPagoCierreCaja);
			if(!this.cierrecajaConstantesFunciones.mostrarFK_IdTipoFormaPagoCierreCaja && index>-1) {
				this.jTabbedPaneBusquedasCierreCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCierreCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCierreCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCierreCaja.indexOfComponent(this.jPanelFK_IdTipoFormaPagoCierreCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCierreCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cierrecajaConstantesFunciones.activarFK_IdTipoFormaPagoCierreCaja);
				this.jTabbedPaneBusquedasCierreCaja.setEnabledAt(index,this.cierrecajaConstantesFunciones.activarFK_IdTipoFormaPagoCierreCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCierreCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoFormaPago")) {
			index= this.jTabbedPaneBusquedasCierreCaja.indexOfComponent(this.jPanelFK_IdTipoFormaPagoCierreCaja);

			this.jTabbedPaneBusquedasCierreCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreCaja.getComponent(index);

			this.cierrecajaConstantesFunciones.setResaltarFK_IdTipoFormaPagoCierreCaja(resaltar);

			jPanel.setBorder(this.cierrecajaConstantesFunciones.resaltarFK_IdTipoFormaPagoCierreCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCierreCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCierreCaja() throws Exception {

		if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCierreCaja();
		this.updateVisibilidadResaltarControlesFormularioCierreCaja();
		this.updateHabilitarResaltarControlesFormularioCierreCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioCierreCaja() throws Exception {
		if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cierrecajaConstantesFunciones.resaltaridCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja!=null) {this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.setBorder(this.cierrecajaConstantesFunciones.resaltaridCierreCaja);}
		if(this.cierrecajaConstantesFunciones.resaltarid_empresaCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja!=null) {this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.setBorder(this.cierrecajaConstantesFunciones.resaltarid_empresaCierreCaja);}
		if(this.cierrecajaConstantesFunciones.resaltarid_sucursalCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja!=null) {this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.setBorder(this.cierrecajaConstantesFunciones.resaltarid_sucursalCierreCaja);}
		if(this.cierrecajaConstantesFunciones.resaltarid_usuarioCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja!=null) {this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.setBorder(this.cierrecajaConstantesFunciones.resaltarid_usuarioCierreCaja);}
		if(this.cierrecajaConstantesFunciones.resaltarid_tipo_forma_pagoCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja!=null) {this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.setBorder(this.cierrecajaConstantesFunciones.resaltarid_tipo_forma_pagoCierreCaja);}
		if(this.cierrecajaConstantesFunciones.resaltarfechaCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja!=null) {this.jInternalFrameDetalleFormCierreCaja.jDateChooserfechaCierreCaja.setBorder(this.cierrecajaConstantesFunciones.resaltarfechaCierreCaja);}
		if(this.cierrecajaConstantesFunciones.resaltartotalCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja!=null) {this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotalCierreCaja.setBorder(this.cierrecajaConstantesFunciones.resaltartotalCierreCaja);}
		if(this.cierrecajaConstantesFunciones.resaltartotal_diferenciaCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja!=null) {this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotal_diferenciaCierreCaja.setBorder(this.cierrecajaConstantesFunciones.resaltartotal_diferenciaCierreCaja);}
		if(this.cierrecajaConstantesFunciones.resaltaresta_activoCierreCaja!=null && this.jInternalFrameDetalleFormCierreCaja!=null) {this.jInternalFrameDetalleFormCierreCaja.jCheckBoxesta_activoCierreCaja.setBorderPainted(true);this.jInternalFrameDetalleFormCierreCaja.jCheckBoxesta_activoCierreCaja.setBorder(this.cierrecajaConstantesFunciones.resaltaresta_activoCierreCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCierreCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) {
	
		//this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostraridCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jPanelidCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostraridCierreCaja);
		//this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarid_empresaCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jPanelid_empresaCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarid_empresaCierreCaja);
		//this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarid_sucursalCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jPanelid_sucursalCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarid_sucursalCierreCaja);
		//this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarid_usuarioCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jPanelid_usuarioCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarid_usuarioCierreCaja);
		//this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarid_tipo_forma_pagoCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jPanelid_tipo_forma_pagoCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarid_tipo_forma_pagoCierreCaja);
		//this.jInternalFrameDetalleFormCierreCaja.jDateChooserfechaCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarfechaCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jPanelfechaCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrarfechaCierreCaja);
		//this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotalCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrartotalCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jPaneltotalCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrartotalCierreCaja);
		//this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotal_diferenciaCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrartotal_diferenciaCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jPaneltotal_diferenciaCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostrartotal_diferenciaCierreCaja);
		//this.jInternalFrameDetalleFormCierreCaja.jCheckBoxesta_activoCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostraresta_activoCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jPanelesta_activoCierreCaja.setVisible(this.cierrecajaConstantesFunciones.mostraresta_activoCierreCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCierreCaja() throws Exception {
		if(this.jInternalFrameDetalleFormCierreCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCierreCaja!=null) {
	
		this.jInternalFrameDetalleFormCierreCaja.jLabelidCierreCaja.setEnabled(this.cierrecajaConstantesFunciones.activaridCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_empresaCierreCaja.setEnabled(this.cierrecajaConstantesFunciones.activarid_empresaCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_sucursalCierreCaja.setEnabled(this.cierrecajaConstantesFunciones.activarid_sucursalCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_usuarioCierreCaja.setEnabled(this.cierrecajaConstantesFunciones.activarid_usuarioCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jComboBoxid_tipo_forma_pagoCierreCaja.setEnabled(this.cierrecajaConstantesFunciones.activarid_tipo_forma_pagoCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jDateChooserfechaCierreCaja.setEnabled(this.cierrecajaConstantesFunciones.activarfechaCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotalCierreCaja.setEnabled(this.cierrecajaConstantesFunciones.activartotalCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jTextFieldtotal_diferenciaCierreCaja.setEnabled(this.cierrecajaConstantesFunciones.activartotal_diferenciaCierreCaja);
		this.jInternalFrameDetalleFormCierreCaja.jCheckBoxesta_activoCierreCaja.setEnabled(this.cierrecajaConstantesFunciones.activaresta_activoCierreCaja);
		}
	}
	
		
}