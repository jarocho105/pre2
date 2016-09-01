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

import com.bydan.erp.puntoventa.util.DepositoBancoConstantesFunciones;
import com.bydan.erp.puntoventa.util.DepositoBancoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.DepositoBancoParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.DepositoBancoBean;
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
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DepositoBancoBeanSwingJInternalFrame extends DepositoBancoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DepositoBancoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DepositoBanco> depositobancoValidator = new ClassValidator<DepositoBanco>(DepositoBanco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DepositoBanco depositobanco;	
	public DepositoBanco depositobancoAux;
	public DepositoBanco depositobancoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DepositoBanco depositobancoTotales;
	public Long idDepositoBancoActual;
	public Long iIdNuevoDepositoBanco=0L;
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

	public String sFinalQueryComboBanco="";

	public List<Banco> bancosForeignKey;

	public List<Banco> getbancosForeignKey() {
		return bancosForeignKey;
	}

	public void setbancosForeignKey(List<Banco> bancosForeignKey) {
		this.bancosForeignKey = bancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Banco bancoForeignKey;

	public Banco getbancoForeignKey() {
		return bancoForeignKey;
	}

	public void setbancoForeignKey(Banco bancoForeignKey) {
		this.bancoForeignKey = bancoForeignKey;
	}

	public String sFinalQueryComboAsientoContable="";

	public List<AsientoContable> asientocontablesForeignKey;

	public List<AsientoContable> getasientocontablesForeignKey() {
		return asientocontablesForeignKey;
	}

	public void setasientocontablesForeignKey(List<AsientoContable> asientocontablesForeignKey) {
		this.asientocontablesForeignKey = asientocontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public AsientoContable asientocontableForeignKey;

	public AsientoContable getasientocontableForeignKey() {
		return asientocontableForeignKey;
	}

	public void setasientocontableForeignKey(AsientoContable asientocontableForeignKey) {
		this.asientocontableForeignKey = asientocontableForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idAsientoContableActual=0L;

	public Long getidAsientoContableActual() {
		return idAsientoContableActual;
	}

	public void setidAsientoContableActual(Long idAsientoContableActual) {
		this.idAsientoContableActual= idAsientoContableActual;
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
	
	public Boolean isPermisoTodoDepositoBanco;
	public Boolean isPermisoNuevoDepositoBanco;
	public Boolean isPermisoActualizarDepositoBanco;
	public Boolean isPermisoActualizarOriginalDepositoBanco;
	public Boolean isPermisoEliminarDepositoBanco;
	public Boolean isPermisoGuardarCambiosDepositoBanco;
	public Boolean isPermisoConsultaDepositoBanco;
	public Boolean isPermisoBusquedaDepositoBanco;
	public Boolean isPermisoReporteDepositoBanco;
	public Boolean isPermisoPaginacionMedioDepositoBanco;
	public Boolean isPermisoPaginacionAltoDepositoBanco;
	public Boolean isPermisoPaginacionTodoDepositoBanco;
	public Boolean isPermisoCopiarDepositoBanco;
	public Boolean isPermisoVerFormDepositoBanco;
	public Boolean isPermisoDuplicarDepositoBanco;
	public Boolean isPermisoOrdenDepositoBanco;
	
	
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
	
	public DepositoBancoParameterReturnGeneral depositobancoReturnGeneral;
	public DepositoBancoParameterReturnGeneral depositobancoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDepositoBanco=false;
	public Boolean esParaAccionDesdeFormularioDepositoBanco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DepositoBancoSessionBeanAdditional depositobancoSessionBeanAdditional=null;
	
	public DepositoBancoSessionBeanAdditional getDepositoBancoSessionBeanAdditional() {
		return this.depositobancoSessionBeanAdditional;
	}
	
	public void setDepositoBancoSessionBeanAdditional(DepositoBancoSessionBeanAdditional depositobancoSessionBeanAdditional) {
		try {
			this.depositobancoSessionBeanAdditional=depositobancoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DepositoBancoBeanSwingJInternalFrameAdditional depositobancoBeanSwingJInternalFrameAdditional=null;
	//public class DepositoBancoBeanSwingJInternalFrame
	
	public DepositoBancoBeanSwingJInternalFrameAdditional getDepositoBancoBeanSwingJInternalFrameAdditional() {
		return this.depositobancoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDepositoBancoBeanSwingJInternalFrameAdditional(DepositoBancoBeanSwingJInternalFrameAdditional depositobancoBeanSwingJInternalFrameAdditional) {
		try {
			this.depositobancoBeanSwingJInternalFrameAdditional=depositobancoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DepositoBancoLogic depositobancoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DepositoBanco depositobancoBean;
	public DepositoBancoConstantesFunciones depositobancoConstantesFunciones;
	//public DepositoBancoParameterReturnGeneral depositobancoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public BancoLogic bancoLogic;
	public AsientoContableLogic asientocontableLogic;
	
	//PARAMETROS
	
	
	//public List<DepositoBanco> depositobancos;	
	//public List<DepositoBanco> depositobancosEliminados;
	//public List<DepositoBanco> depositobancosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDepositoBanco=false;
	public Boolean isVisibilidadCeldaDuplicarDepositoBanco=true;
	public Boolean isVisibilidadCeldaCopiarDepositoBanco=true;
	public Boolean isVisibilidadCeldaVerFormDepositoBanco=true;
	public Boolean isVisibilidadCeldaOrdenDepositoBanco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;
	public Boolean isVisibilidadCeldaModificarDepositoBanco=false;
	public Boolean isVisibilidadCeldaActualizarDepositoBanco=false;
	public Boolean isVisibilidadCeldaEliminarDepositoBanco=false;
	public Boolean isVisibilidadCeldaCancelarDepositoBanco=false;
	public Boolean isVisibilidadCeldaGuardarDepositoBanco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDepositoBanco=false;	
	
	
	public Boolean isVisibilidadFK_IdAsientoContable=false;
	public Boolean isVisibilidadFK_IdBanco=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoDepositoBanco() {
		return this.iIdNuevoDepositoBanco;
	}

	public void setiIdNuevoDepositoBanco(Long iIdNuevoDepositoBanco) {
		this.iIdNuevoDepositoBanco = iIdNuevoDepositoBanco;
	}
	
	public Long getidDepositoBancoActual() {
		return this.idDepositoBancoActual;
	}

	public void setidDepositoBancoActual(Long idDepositoBancoActual) {
		this.idDepositoBancoActual = idDepositoBancoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DepositoBanco getdepositobanco() {
		return this.depositobanco;
	}

	public void setdepositobanco(DepositoBanco depositobanco) {
		this.depositobanco = depositobanco;
	}
	
	public DepositoBanco getdepositobancoAux() {
		return this.depositobancoAux;
	}

	public void setdepositobancoAux(DepositoBanco depositobancoAux) {
		this.depositobancoAux = depositobancoAux;
	}				
	
	public DepositoBanco getdepositobancoAnterior() {
		return this.depositobancoAnterior;
	}

	public void setdepositobancoAnterior(DepositoBanco depositobancoAnterior) {
		this.depositobancoAnterior = depositobancoAnterior;
	}	
	
	public DepositoBanco getdepositobancoTotales() {
		return this.depositobancoTotales;
	}

	public void setdepositobancoTotales(DepositoBanco depositobancoTotales) {
		this.depositobancoTotales = depositobancoTotales;
	}	
	
	public DepositoBanco getdepositobancoBean() {
		return this.depositobancoBean;
	}

	public void setdepositobancoBean(DepositoBanco depositobancoBean) {
		this.depositobancoBean = depositobancoBean;
	}	
	
	public DepositoBancoParameterReturnGeneral getdepositobancoReturnGeneral() {
		return this.depositobancoReturnGeneral;
	}

	public void setdepositobancoReturnGeneral(DepositoBancoParameterReturnGeneral depositobancoReturnGeneral) {
		this.depositobancoReturnGeneral = depositobancoReturnGeneral;
	}	
	
	
	public Long id_asiento_contableFK_IdAsientoContable=null;

	public Long getid_asiento_contableFK_IdAsientoContable() {
		return this.id_asiento_contableFK_IdAsientoContable;
	}

	public void setid_asiento_contableFK_IdAsientoContable(Long id_asiento_contableFK_IdAsientoContable) {
		this.id_asiento_contableFK_IdAsientoContable = id_asiento_contableFK_IdAsientoContable;
	}

	public Long id_bancoFK_IdBanco=-1L;

	public Long getid_bancoFK_IdBanco() {
		return this.id_bancoFK_IdBanco;
	}

	public void setid_bancoFK_IdBanco(Long id_bancoFK_IdBanco) {
		this.id_bancoFK_IdBanco = id_bancoFK_IdBanco;
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
	
	
	public DepositoBancoLogic getDepositoBancoLogic()	{		
		return depositobancoLogic;
	}

	public void setDepositoBancoLogic(DepositoBancoLogic depositobancoLogic) {
		this.depositobancoLogic = depositobancoLogic;
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
	
	public Boolean getIsEsNuevoDepositoBanco() {
		return isEsNuevoDepositoBanco;
	}

	public void setIsEsNuevoDepositoBanco(Boolean isEsNuevoDepositoBanco) {
		this.isEsNuevoDepositoBanco = isEsNuevoDepositoBanco;
	}

	public Boolean getEsParaAccionDesdeFormularioDepositoBanco() {
		return esParaAccionDesdeFormularioDepositoBanco;
	}
	
	public void setEsParaAccionDesdeFormularioDepositoBanco(Boolean esParaAccionDesdeFormularioDepositoBanco) {
		this.esParaAccionDesdeFormularioDepositoBanco = esParaAccionDesdeFormularioDepositoBanco;
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

			if(this.depositobancoSessionBean==null) {
				this.depositobancoSessionBean=new DepositoBancoSessionBean();
			}

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(depositobancoSessionBean.getlidEmpresaActual());
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

			if(this.depositobancoSessionBean==null) {
				this.depositobancoSessionBean=new DepositoBancoSessionBean();
			}

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(depositobancoSessionBean.getlidSucursalActual());
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

			if(this.depositobancoSessionBean==null) {
				this.depositobancoSessionBean=new DepositoBancoSessionBean();
			}

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(depositobancoSessionBean.getlidUsuarioActual());
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

	public void cargarCombosBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bancosForeignKey=new ArrayList<Banco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BancoLogic bancoLogic=new BancoLogic();

			//bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

			if(this.depositobancoSessionBean==null) {
				this.depositobancoSessionBean=new DepositoBancoSessionBean();
			}

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

					bancoLogic.getTodosBancosWithConnection(sFinalQuery,new Pagination());

					this.bancosForeignKey=bancoLogic.getBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getEntityWithConnection(depositobancoSessionBean.getlidBancoActual());
					this.bancosForeignKey.add(bancoLogic.getBanco());
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

	public void cargarCombosAsientoContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AsientoContable asientocontableNulo = new AsientoContable();

			AsientoContableLogic asientocontableLogic=new AsientoContableLogic();

			//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

			if(this.depositobancoSessionBean==null) {
				this.depositobancoSessionBean=new DepositoBancoSessionBean();
			}

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

					asientocontableLogic.getTodosAsientoContablesWithConnection(sFinalQuery,new Pagination());

					this.asientocontablesForeignKey=asientocontableLogic.getAsientoContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.asientocontablesForeignKey.add(0, asientocontableNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAsientoContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(depositobancoSessionBean.getlidAsientoContableActual());
					this.asientocontablesForeignKey.add(asientocontableLogic.getAsientoContable());
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

					if(this.depositobanco!=null) {
						this.depositobanco.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDepositoBanco.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDepositoBancoGenerico)throws Exception
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
				jComboBoxid_empresaDepositoBancoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDepositoBancoGenerico!=null && jComboBoxid_empresaDepositoBancoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDepositoBancoGenerico.setSelectedIndex(0);
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

					if(this.depositobanco!=null) {
						this.depositobanco.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDepositoBanco.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDepositoBancoGenerico)throws Exception
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
				jComboBoxid_sucursalDepositoBancoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDepositoBancoGenerico!=null && jComboBoxid_sucursalDepositoBancoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDepositoBancoGenerico.setSelectedIndex(0);
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

					if(this.depositobanco!=null) {
						this.depositobanco.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioDepositoBanco.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioDepositoBancoGenerico)throws Exception
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
				jComboBoxid_usuarioDepositoBancoGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioDepositoBancoGenerico!=null && jComboBoxid_usuarioDepositoBancoGenerico.getItemCount()>0) {
					jComboBoxid_usuarioDepositoBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBancoForeignKey(Long idBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bancoTemp!=null) {

					if(this.depositobanco!=null) {
						this.depositobanco.setBanco(bancoTemp);
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.setSelectedItem(bancoTemp);
					}
				} else {
					//jComboBoxid_bancoDepositoBanco.setSelectedItem(bancoTemp);
					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(bancoTemp!=null && jComboBoxid_bancoFK_IdBancoDepositoBanco!=null) {
						jComboBoxid_bancoFK_IdBancoDepositoBanco.setSelectedItem(bancoTemp);
					} else {
						if(jComboBoxid_bancoFK_IdBancoDepositoBanco!=null) {
							//jComboBoxid_bancoFK_IdBancoDepositoBanco.setSelectedItem(bancoTemp);
							if(jComboBoxid_bancoFK_IdBancoDepositoBanco.getItemCount()>0) {
								jComboBoxid_bancoFK_IdBancoDepositoBanco.setSelectedIndex(0);
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

	public String getActualBancoForeignKeyDescripcion(Long idBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}


			sDescripcion=BancoConstantesFunciones.getBancoDescripcion(bancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBancoForeignKeyGenerico(Long idBancoSeleccionado,JComboBox jComboBoxid_bancoDepositoBancoGenerico)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(bancoTemp!=null) {
				jComboBoxid_bancoDepositoBancoGenerico.setSelectedItem(bancoTemp);
			} else {
				if(jComboBoxid_bancoDepositoBancoGenerico!=null && jComboBoxid_bancoDepositoBancoGenerico.getItemCount()>0) {
					jComboBoxid_bancoDepositoBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAsientoContableForeignKey(Long idAsientoContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(asientocontableTemp!=null) {

					if(this.depositobanco!=null) {
						this.depositobanco.setAsientoContable(asientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.setSelectedItem(asientocontableTemp);
					}
				} else {
					//jComboBoxid_asiento_contableDepositoBanco.setSelectedItem(asientocontableTemp);
					if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
						if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(asientocontableTemp!=null && jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco!=null) {
						jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.setSelectedItem(asientocontableTemp);
					} else {
						if(jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco!=null) {
							//jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.setSelectedItem(asientocontableTemp);
							if(jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.getItemCount()>0) {
								jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.setSelectedIndex(0);
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

	public String getActualAsientoContableForeignKeyDescripcion(Long idAsientoContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}


			sDescripcion=AsientoContableConstantesFunciones.getAsientoContableDescripcion(asientocontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAsientoContableForeignKeyGenerico(Long idAsientoContableSeleccionado,JComboBox jComboBoxid_asiento_contableDepositoBancoGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(asientocontableTemp!=null) {
				jComboBoxid_asiento_contableDepositoBancoGenerico.setSelectedItem(asientocontableTemp);
			} else {
				if(jComboBoxid_asiento_contableDepositoBancoGenerico!=null && jComboBoxid_asiento_contableDepositoBancoGenerico.getItemCount()>0) {
					jComboBoxid_asiento_contableDepositoBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DepositoBanco depositobanco,JComboBox jComboBoxid_empresaDepositoBancoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDepositoBancoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDepositoBancoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				depositobanco.setid_empresa(empresaAux.getId());
				depositobanco.setempresa_descripcion(DepositoBancoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				depositobanco.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DepositoBanco depositobanco,JComboBox jComboBoxid_sucursalDepositoBancoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDepositoBancoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDepositoBancoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				depositobanco.setid_sucursal(sucursalAux.getId());
				depositobanco.setsucursal_descripcion(DepositoBancoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				depositobanco.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(DepositoBanco depositobanco,JComboBox jComboBoxid_usuarioDepositoBancoGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioDepositoBancoGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioDepositoBancoGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				depositobanco.setid_usuario(usuarioAux.getId());
				depositobanco.setusuario_descripcion(DepositoBancoConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				depositobanco.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBancoForeignKey(DepositoBanco depositobanco,JComboBox jComboBoxid_bancoDepositoBancoGenerico)throws Exception
	{
		try
		{
			Banco  bancoAux=new Banco();

			if(jComboBoxid_bancoDepositoBancoGenerico==null) {
				bancoAux=(Banco)this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.getSelectedItem();
			} else {
				bancoAux=(Banco)jComboBoxid_bancoDepositoBancoGenerico.getSelectedItem();
			}

			if(bancoAux!=null && bancoAux.getId()!=null) {
				depositobanco.setid_banco(bancoAux.getId());
				depositobanco.setbanco_descripcion(DepositoBancoConstantesFunciones.getBancoDescripcion(bancoAux));
				depositobanco.setBanco(bancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAsientoContableForeignKey(DepositoBanco depositobanco,JComboBox jComboBoxid_asiento_contableDepositoBancoGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableAux=new AsientoContable();

			if(jComboBoxid_asiento_contableDepositoBancoGenerico==null) {
				asientocontableAux=(AsientoContable)this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.getSelectedItem();
			} else {
				asientocontableAux=(AsientoContable)jComboBoxid_asiento_contableDepositoBancoGenerico.getSelectedItem();
			}

			if(asientocontableAux!=null) {
				depositobanco.setid_asiento_contable(asientocontableAux.getId());
				depositobanco.setasientocontable_descripcion(DepositoBancoConstantesFunciones.getAsientoContableDescripcion(asientocontableAux));
				depositobanco.setAsientoContable(asientocontableAux);			}
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

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
					}

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
					}

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
					}

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.addItem(banco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
					}

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bancoFK_IdBancoDepositoBanco.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jComboBoxid_bancoFK_IdBancoDepositoBanco.addItem(banco);
							}
						}

						if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAsientoContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAsientoContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.addItem(asientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepositoBanco!=null) { 
					}

					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.addItem(asientocontable);
							}
						}

						if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBancoForeignKey(Banco banco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.setSelectedItem(banco);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bancoFK_IdBancoDepositoBanco.setSelectedItem(banco);
						} else {
							this.jComboBoxid_bancoFK_IdBancoDepositoBanco.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAsientoContableForeignKey(AsientoContable asientocontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.setSelectedItem(asientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.setSelectedItem(asientocontable);
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDepositoBanco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DepositoBancoConstantesFunciones.refrescarForeignKeysDescripcionesDepositoBanco(this.depositobancoLogic.getDepositoBancos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DepositoBancoConstantesFunciones.refrescarForeignKeysDescripcionesDepositoBanco(this.depositobancos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Banco.class));
		classes.add(new Classe(AsientoContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//depositobancoLogic.setDepositoBancos(this.depositobancos);
			depositobancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DepositoBancoParameterReturnGeneral getDepositoBancoParameterGeneral() {
		return this.depositobancoParameterGeneral;
	}
	
	public void setDepositoBancoParameterGeneral(DepositoBancoParameterReturnGeneral depositobancoParameterGeneral) {
		this.depositobancoParameterGeneral = depositobancoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDepositoBanco() {
		return isPermisoTodoDepositoBanco;
	}

	public void setIsPermisoTodoDepositoBanco(Boolean isPermisoTodoDepositoBanco) {
		this.isPermisoTodoDepositoBanco = isPermisoTodoDepositoBanco;
	}

	public Boolean getIsPermisoNuevoDepositoBanco() {
		return isPermisoNuevoDepositoBanco;
	}

	public void setIsPermisoNuevoDepositoBanco(Boolean isPermisoNuevoDepositoBanco) {
		this.isPermisoNuevoDepositoBanco = isPermisoNuevoDepositoBanco;
	}

	public Boolean getIsPermisoActualizarDepositoBanco() {
		return isPermisoActualizarDepositoBanco;
	}

	public void setIsPermisoActualizarDepositoBanco(Boolean isPermisoActualizarDepositoBanco) {
		this.isPermisoActualizarDepositoBanco = isPermisoActualizarDepositoBanco;
	}

	public Boolean getIsPermisoEliminarDepositoBanco() {
		return isPermisoEliminarDepositoBanco;
	}

	public void setIsPermisoEliminarDepositoBanco(Boolean isPermisoEliminarDepositoBanco) {
		this.isPermisoEliminarDepositoBanco = isPermisoEliminarDepositoBanco;
	}

	public Boolean getIsPermisoGuardarCambiosDepositoBanco() {
		return isPermisoGuardarCambiosDepositoBanco;
	}

	public void setIsPermisoGuardarCambiosDepositoBanco(Boolean isPermisoGuardarCambiosDepositoBanco) {
		this.isPermisoGuardarCambiosDepositoBanco = isPermisoGuardarCambiosDepositoBanco;
	}
	
	public Boolean getIsPermisoConsultaDepositoBanco() {
		return isPermisoConsultaDepositoBanco;
	}

	public void setIsPermisoConsultaDepositoBanco(Boolean isPermisoConsultaDepositoBanco) {
		this.isPermisoConsultaDepositoBanco = isPermisoConsultaDepositoBanco;
	}

	public Boolean getIsPermisoBusquedaDepositoBanco() {
		return isPermisoBusquedaDepositoBanco;
	}

	public void setIsPermisoBusquedaDepositoBanco(Boolean isPermisoBusquedaDepositoBanco) {
		this.isPermisoBusquedaDepositoBanco = isPermisoBusquedaDepositoBanco;
	}

	public Boolean getIsPermisoReporteDepositoBanco() {
		return isPermisoReporteDepositoBanco;
	}

	public void setIsPermisoReporteDepositoBanco(Boolean isPermisoReporteDepositoBanco) {
		this.isPermisoReporteDepositoBanco = isPermisoReporteDepositoBanco;
	}
	
	public Boolean getIsPermisoPaginacionMedioDepositoBanco() {
		return isPermisoPaginacionMedioDepositoBanco;
	}

	public void setIsPermisoPaginacionMedioDepositoBanco(Boolean isPermisoPaginacionMedioDepositoBanco) {
		this.isPermisoPaginacionMedioDepositoBanco = isPermisoPaginacionMedioDepositoBanco;
	}
	
	public Boolean getIsPermisoPaginacionTodoDepositoBanco() {
		return isPermisoPaginacionTodoDepositoBanco;
	}

	public void setIsPermisoPaginacionTodoDepositoBanco(Boolean isPermisoPaginacionTodoDepositoBanco) {
		this.isPermisoPaginacionTodoDepositoBanco = isPermisoPaginacionTodoDepositoBanco;
	}
	
	public Boolean getIsPermisoPaginacionAltoDepositoBanco() {
		return isPermisoPaginacionAltoDepositoBanco;
	}

	public void setIsPermisoPaginacionAltoDepositoBanco(Boolean isPermisoPaginacionAltoDepositoBanco) {
		this.isPermisoPaginacionAltoDepositoBanco = isPermisoPaginacionAltoDepositoBanco;
	}
	
	public Boolean getIsPermisoCopiarDepositoBanco() {
		return isPermisoCopiarDepositoBanco;
	}

	public void setIsPermisoCopiarDepositoBanco(Boolean isPermisoCopiarDepositoBanco) {
		this.isPermisoCopiarDepositoBanco = isPermisoCopiarDepositoBanco;
	}
	
	public Boolean getIsPermisoVerFormDepositoBanco() {
		return isPermisoVerFormDepositoBanco;
	}

	public void setIsPermisoVerFormDepositoBanco(Boolean isPermisoVerFormDepositoBanco) {
		this.isPermisoVerFormDepositoBanco = isPermisoVerFormDepositoBanco;
	}
	
	public Boolean getIsPermisoDuplicarDepositoBanco() {
		return isPermisoDuplicarDepositoBanco;
	}

	public void setIsPermisoDuplicarDepositoBanco(Boolean isPermisoDuplicarDepositoBanco) {
		this.isPermisoDuplicarDepositoBanco = isPermisoDuplicarDepositoBanco;
	}
	
	public Boolean getIsPermisoOrdenDepositoBanco() {
		return isPermisoOrdenDepositoBanco;
	}

	public void setIsPermisoOrdenDepositoBanco(Boolean isPermisoOrdenDepositoBanco) {
		this.isPermisoOrdenDepositoBanco = isPermisoOrdenDepositoBanco;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDepositoBanco() {
		return isVisibilidadCeldaNuevoDepositoBanco;
	}

	public void setIsVisibilidadCeldaNuevoDepositoBanco(Boolean isVisibilidadCeldaNuevoDepositoBanco) {
		this.isVisibilidadCeldaNuevoDepositoBanco = isVisibilidadCeldaNuevoDepositoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDepositoBanco() {
		return isVisibilidadCeldaDuplicarDepositoBanco;
	}

	public void setIsVisibilidadCeldaDuplicarDepositoBanco(Boolean isVisibilidadCeldaDuplicarDepositoBanco) {
		this.isVisibilidadCeldaDuplicarDepositoBanco = isVisibilidadCeldaDuplicarDepositoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDepositoBanco() {
		return isVisibilidadCeldaCopiarDepositoBanco;
	}

	public void setIsVisibilidadCeldaCopiarDepositoBanco(Boolean isVisibilidadCeldaCopiarDepositoBanco) {
		this.isVisibilidadCeldaCopiarDepositoBanco = isVisibilidadCeldaCopiarDepositoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDepositoBanco() {
		return isVisibilidadCeldaVerFormDepositoBanco;
	}

	public void setIsVisibilidadCeldaVerFormDepositoBanco(Boolean isVisibilidadCeldaVerFormDepositoBanco) {
		this.isVisibilidadCeldaVerFormDepositoBanco = isVisibilidadCeldaVerFormDepositoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDepositoBanco() {
		return isVisibilidadCeldaOrdenDepositoBanco;
	}

	public void setIsVisibilidadCeldaOrdenDepositoBanco(Boolean isVisibilidadCeldaOrdenDepositoBanco) {
		this.isVisibilidadCeldaOrdenDepositoBanco = isVisibilidadCeldaOrdenDepositoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDepositoBanco() {
		return isVisibilidadCeldaNuevoRelacionesDepositoBanco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDepositoBanco(Boolean isVisibilidadCeldaNuevoRelacionesDepositoBanco) {
		this.isVisibilidadCeldaNuevoRelacionesDepositoBanco = isVisibilidadCeldaNuevoRelacionesDepositoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDepositoBanco() {
		return isVisibilidadCeldaModificarDepositoBanco;
	}

	public void setIsVisibilidadCeldaModificarDepositoBanco(Boolean isVisibilidadCeldaModificarDepositoBanco) {
		this.isVisibilidadCeldaModificarDepositoBanco = isVisibilidadCeldaModificarDepositoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDepositoBanco() {
		return isVisibilidadCeldaActualizarDepositoBanco;
	}

	public void setIsVisibilidadCeldaActualizarDepositoBanco(Boolean isVisibilidadCeldaActualizarDepositoBanco) {
		this.isVisibilidadCeldaActualizarDepositoBanco = isVisibilidadCeldaActualizarDepositoBanco;
	}

	public Boolean getIsVisibilidadCeldaEliminarDepositoBanco() {
		return isVisibilidadCeldaEliminarDepositoBanco;
	}

	public void setIsVisibilidadCeldaEliminarDepositoBanco(Boolean isVisibilidadCeldaEliminarDepositoBanco) {
		this.isVisibilidadCeldaEliminarDepositoBanco = isVisibilidadCeldaEliminarDepositoBanco;
	}

	public Boolean getIsVisibilidadCeldaCancelarDepositoBanco() {
		return isVisibilidadCeldaCancelarDepositoBanco;
	}

	public void setIsVisibilidadCeldaCancelarDepositoBanco(Boolean isVisibilidadCeldaCancelarDepositoBanco) {
		this.isVisibilidadCeldaCancelarDepositoBanco = isVisibilidadCeldaCancelarDepositoBanco;
	}

	public Boolean getIsVisibilidadCeldaGuardarDepositoBanco() {
		return isVisibilidadCeldaGuardarDepositoBanco;
	}

	public void setIsVisibilidadCeldaGuardarDepositoBanco(Boolean isVisibilidadCeldaGuardarDepositoBanco) {
		this.isVisibilidadCeldaGuardarDepositoBanco = isVisibilidadCeldaGuardarDepositoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDepositoBanco() {
		return isVisibilidadCeldaGuardarCambiosDepositoBanco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDepositoBanco(Boolean isVisibilidadCeldaGuardarCambiosDepositoBanco) {
		this.isVisibilidadCeldaGuardarCambiosDepositoBanco = isVisibilidadCeldaGuardarCambiosDepositoBanco;
	}
		
	public DepositoBancoSessionBean getdepositobancoSessionBean() {
		return this.depositobancoSessionBean;
	}
	
	public void setdepositobancoSessionBean(DepositoBancoSessionBean depositobancoSessionBean) {
		this.depositobancoSessionBean=depositobancoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAsientoContable() {
		return this.isVisibilidadFK_IdAsientoContable;
	}

	public void setisVisibilidadFK_IdAsientoContable(Boolean isVisibilidadFK_IdAsientoContable) {
		this.isVisibilidadFK_IdAsientoContable=isVisibilidadFK_IdAsientoContable;
	}

	public Boolean getisVisibilidadFK_IdBanco() {
		return this.isVisibilidadFK_IdBanco;
	}

	public void setisVisibilidadFK_IdBanco(Boolean isVisibilidadFK_IdBanco) {
		this.isVisibilidadFK_IdBanco=isVisibilidadFK_IdBanco;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(DepositoBanco depositobanco)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(depositobanco,null);
				this.setActualParaGuardarSucursalForeignKey(depositobanco,null);
				this.setActualParaGuardarUsuarioForeignKey(depositobanco,null);
				this.setActualParaGuardarBancoForeignKey(depositobanco,null);
				this.setActualParaGuardarAsientoContableForeignKey(depositobanco,null);
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
	
	public void bugActualizarReferenciaActual(DepositoBanco depositobanco,DepositoBanco depositobancoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDepositoBanco(depositobanco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		depositobancoAux.setId(depositobanco.getId());
		depositobancoAux.setVersionRow(depositobanco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDepositoBanco();
		
			int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = depositobancoValidator.getInvalidValues(this.depositobanco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			depositobancoLogic.setDatosCliente(datosCliente);
			depositobancoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				depositobancoAux=new  DepositoBanco();
				
				depositobancoAux.setIsNew(true);
				depositobancoAux.setIsChanged(true);
				
				depositobancoAux.setDepositoBancoOriginal(this.depositobanco);
				
				depositobancoAux.setId(this.depositobanco.getId());	
				depositobancoAux.setVersionRow(this.depositobanco.getVersionRow());	
				depositobancoAux.setid_empresa(this.depositobanco.getid_empresa());	
				depositobancoAux.setid_sucursal(this.depositobanco.getid_sucursal());	
				depositobancoAux.setid_usuario(this.depositobanco.getid_usuario());	
				depositobancoAux.setid_banco(this.depositobanco.getid_banco());	
				
				if(this.depositobanco.getid_asiento_contable()!=null && this.depositobanco.getid_asiento_contable()>0L) {
					depositobancoAux.setid_asiento_contable(this.depositobanco.getid_asiento_contable());
				} else {
					depositobancoAux.setid_asiento_contable(null);
				}	
				depositobancoAux.setfecha(this.depositobanco.getfecha());	
				depositobancoAux.setvalor_efectivo(this.depositobanco.getvalor_efectivo());	
				depositobancoAux.setvalor_cheque(this.depositobanco.getvalor_cheque());	
				depositobancoAux.setdescripcion(this.depositobanco.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.depositobancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(depositobancoAux,depositobancoLogic.getDepositoBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(depositobancoAux,depositobancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.depositobancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.depositobancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoLogic.saveDepositoBancos();//WithConnection
						//depositobancoLogic.getSetVersionRowDepositoBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.depositobanco,depositobancoAux);
					
					this.refrescarForeignKeysDescripcionesDepositoBanco();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								depositobancoLogic.saveDepositoBancoRelaciones(depositobancoAux);//WithConnection
								//depositobancoLogic.getSetVersionRowDepositoBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.depositobanco,depositobancoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.depositobancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(depositobancoAux,depositobancoLogic.getDepositoBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(depositobancoAux,depositobancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.depositobanco,depositobancoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				depositobancoAux=new  DepositoBanco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.depositobancoSessionBean.getEsGuardarRelacionado() 
					|| (this.depositobancoSessionBean.getEsGuardarRelacionado() && this.depositobanco.getId()>=0)) {
						
					depositobancoAux.setIsNew(false);
				}
				
				depositobancoAux.setIsDeleted(false);
			
				depositobancoAux.setId(this.depositobanco.getId());	
				depositobancoAux.setVersionRow(this.depositobanco.getVersionRow());	
				depositobancoAux.setid_empresa(this.depositobanco.getid_empresa());	
				depositobancoAux.setid_sucursal(this.depositobanco.getid_sucursal());	
				depositobancoAux.setid_usuario(this.depositobanco.getid_usuario());	
				depositobancoAux.setid_banco(this.depositobanco.getid_banco());	
				
				if(this.depositobanco.getid_asiento_contable()!=null && this.depositobanco.getid_asiento_contable()>0L) {
					depositobancoAux.setid_asiento_contable(this.depositobanco.getid_asiento_contable());
				} else {
					depositobancoAux.setid_asiento_contable(null);
				}	
				depositobancoAux.setfecha(this.depositobanco.getfecha());	
				depositobancoAux.setvalor_efectivo(this.depositobanco.getvalor_efectivo());	
				depositobancoAux.setvalor_cheque(this.depositobanco.getvalor_cheque());	
				depositobancoAux.setdescripcion(this.depositobanco.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(depositobancoAux,depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(depositobancoAux,depositobancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.depositobancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.depositobancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoLogic.saveDepositoBancos();//WithConnection
						//depositobancoLogic.getSetVersionRowDepositoBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.depositobanco,depositobancoAux);
					
					this.refrescarForeignKeysDescripcionesDepositoBanco();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								depositobancoLogic.saveDepositoBancoRelaciones(depositobancoAux);//WithConnection
								//depositobancoLogic.getSetVersionRowDepositoBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.depositobanco,depositobancoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.depositobancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(depositobancoAux,depositobancoLogic.getDepositoBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(depositobancoAux,depositobancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.depositobanco,depositobancoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				depositobancoAux=new  DepositoBanco();
				
				depositobancoAux.setIsNew(false);
				depositobancoAux.setIsChanged(false);
				
				depositobancoAux.setIsDeleted(true);
				
				depositobancoAux.setId(this.depositobanco.getId());	
				depositobancoAux.setVersionRow(this.depositobanco.getVersionRow());	
				depositobancoAux.setid_empresa(this.depositobanco.getid_empresa());	
				depositobancoAux.setid_sucursal(this.depositobanco.getid_sucursal());	
				depositobancoAux.setid_usuario(this.depositobanco.getid_usuario());	
				depositobancoAux.setid_banco(this.depositobanco.getid_banco());	
				
				if(this.depositobanco.getid_asiento_contable()!=null && this.depositobanco.getid_asiento_contable()>0L) {
					depositobancoAux.setid_asiento_contable(this.depositobanco.getid_asiento_contable());
				} else {
					depositobancoAux.setid_asiento_contable(null);
				}	
				depositobancoAux.setfecha(this.depositobanco.getfecha());	
				depositobancoAux.setvalor_efectivo(this.depositobanco.getvalor_efectivo());	
				depositobancoAux.setvalor_cheque(this.depositobanco.getvalor_cheque());	
				depositobancoAux.setdescripcion(this.depositobanco.getdescripcion());	
				
				if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.depositobancoAux.getId()>=0) {	
						this.depositobancosEliminados.add(depositobancoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(depositobancoAux,depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(depositobancoAux,depositobancos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.depositobancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.depositobancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoLogic.saveDepositoBancos();//WithConnection
						//depositobancoLogic.getSetVersionRowDepositoBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								depositobancoLogic.saveDepositoBancoRelaciones(depositobancoAux);//WithConnection
								//depositobancoLogic.getSetVersionRowDepositoBancos();//WithConnection
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
							if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.depositobancoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(depositobancoAux,depositobancoLogic.getDepositoBancos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(depositobancoAux,depositobancos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getDepositoBancos().addAll(this.depositobancosEliminados);
					
					depositobancoLogic.saveDepositoBancos();//WithConnection
					//depositobancoLogic.getSetVersionRowDepositoBancos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDepositoBanco();
				
				this.depositobancosEliminados= new ArrayList<DepositoBanco>();		
			}
			
			if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Deposito Banco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.depositobanco=depositobancoAux;
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
      		//this.finishProcessDepositoBanco();
      	}
		
	}	
	
	public void actualizarRelaciones(DepositoBanco depositobancoLocal) throws Exception {
		
		if(this.depositobancoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DepositoBanco depositobancoLocal) throws Exception {	
		if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				depositobancoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				depositobancoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				depositobancoLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BancoDetalleFormJInternalFrame.class)) {
				BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrameLocal=(BancoBeanSwingJInternalFrame) ((BancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBanco(bancoBeanSwingJInternalFrameLocal.getbanco(),true);
				bancoBeanSwingJInternalFrameLocal.actualizarLista(bancoBeanSwingJInternalFrameLocal.banco,this.bancosForeignKey);

				bancoBeanSwingJInternalFrameLocal.actualizarRelaciones(bancoBeanSwingJInternalFrameLocal.banco);

				depositobancoLocal.setBanco(bancoBeanSwingJInternalFrameLocal.banco);

				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey("Formulario");
				this.setActualBancoForeignKey(bancoBeanSwingJInternalFrameLocal.banco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AsientoContableDetalleFormJInternalFrame.class)) {
				AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrameLocal=(AsientoContableBeanSwingJInternalFrame) ((AsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				asientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAsientoContable(asientocontableBeanSwingJInternalFrameLocal.getasientocontable(),true);
				asientocontableBeanSwingJInternalFrameLocal.actualizarLista(asientocontableBeanSwingJInternalFrameLocal.asientocontable,this.asientocontablesForeignKey);

				asientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				depositobancoLocal.setAsientoContable(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey("Formulario");
				this.setActualAsientoContableForeignKey(asientocontableBeanSwingJInternalFrameLocal.asientocontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDepositoBancoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = depositobancoValidator.getInvalidValues(this.depositobanco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DepositoBanco depositobanco,List<DepositoBanco> depositobancos) throws Exception {
		try	{		
			DepositoBancoConstantesFunciones.actualizarLista(depositobanco,depositobancos,this.depositobancoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DepositoBanco depositobanco,List<DepositoBanco> depositobancos) throws Exception {
		try	{			
			DepositoBancoConstantesFunciones.actualizarSelectedLista(depositobanco,depositobancos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DepositoBanco> depositobancosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				depositobancosLocal=this.depositobancoLogic.getDepositoBancos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				depositobancosLocal=this.depositobancos;
			}
			//ARCHITECTURE
		
			for(DepositoBanco depositobancoLocal:depositobancosLocal) {
				if(this.permiteMantenimiento(depositobancoLocal) && depositobancoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DepositoBancoConstantesFunciones.getDepositoBancoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DepositoBancoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_empresaDepositoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepositoBancoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_sucursalDepositoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepositoBancoConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_usuarioDepositoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepositoBancoConstantesFunciones.IDBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_bancoDepositoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepositoBancoConstantesFunciones.IDASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_asiento_contableDepositoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepositoBancoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelfechaDepositoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepositoBancoConstantesFunciones.VALOREFECTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelvalor_efectivoDepositoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepositoBancoConstantesFunciones.VALORCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelvalor_chequeDepositoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepositoBancoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabeldescripcionDepositoBanco,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_empresaDepositoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_sucursalDepositoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_usuarioDepositoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_bancoDepositoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepositoBanco.jLabelid_asiento_contableDepositoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepositoBanco.jLabelfechaDepositoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepositoBanco.jLabelvalor_efectivoDepositoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepositoBanco.jLabelvalor_chequeDepositoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepositoBanco.jLabeldescripcionDepositoBanco,"");
		
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
		this.iIdNuevoDepositoBanco--;	
		
		
		this.depositobancoAux=new DepositoBanco();
		
		this.depositobancoAux.setId(this.iIdNuevoDepositoBanco);
		this.depositobancoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.depositobancoLogic.getDepositoBancos().add(this.depositobancoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.depositobancos.add(this.depositobancoAux);
		}
		//ARCHITECTURE
		
		this.depositobanco=this.depositobancoAux;
		
		if(DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDepositoBanco(this.depositobanco);
			this.setVariablesObjetoActualToFormularioForeignKeyDepositoBanco(this.depositobanco);
		}
				
		//this.setDefaultControlesDepositoBanco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDepositoBanco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDepositoBanco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDepositoBanco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDepositoBanco(this.depositobancoBean,this.depositobanco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DepositoBancoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.depositobancoSessionBean.getConGuardarRelaciones()) {
			classes=DepositoBancoConstantesFunciones.getClassesRelationshipsOfDepositoBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.depositobancoReturnGeneral=depositobancoLogic.procesarEventosDepositoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.depositobancoLogic.getDepositoBancos(),this.depositobanco,this.depositobancoParameterGeneral,this.isEsNuevoDepositoBanco,classes);//this.depositobancoLogic.getDepositoBanco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDepositoBanco(this.depositobancoReturnGeneral,this.depositobancoBean,false);
		
		if(this.depositobancoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDepositoBanco(this.depositobancoReturnGeneral.getDepositoBanco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDepositoBanco(this.depositobancoReturnGeneral.getDepositoBanco());
		}
		
		if(this.depositobancoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDepositoBanco(this.depositobancoReturnGeneral.getDepositoBanco(),classes);//this.depositobancoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDepositoBanco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDepositoBanco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DepositoBancoBeanSwingJInternalFrameAdditional.RecargarFormDepositoBanco(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDepositoBanco(false);
						
			if(depositobancoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDepositoBanco();
			}
			
			this.actualizarVisualTableDatosDepositoBanco();
			
			this.jTableDatosDepositoBanco.setRowSelectionInterval(this.getIndiceNuevoDepositoBanco(), this.getIndiceNuevoDepositoBanco());
			
			this.seleccionarFilaTablaDepositoBancoActual();
						
			this.actualizarEstadoCeldasBotonesDepositoBanco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDepositoBanco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDepositoBanco.jDateChooserfechaDepositoBanco.setEnabled(isHabilitar && this.depositobancoConstantesFunciones.activarfechaDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_efectivoDepositoBanco.setEnabled(isHabilitar && this.depositobancoConstantesFunciones.activarvalor_efectivoDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_chequeDepositoBanco.setEnabled(isHabilitar && this.depositobancoConstantesFunciones.activarvalor_chequeDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jTextAreadescripcionDepositoBanco.setEnabled(isHabilitar && this.depositobancoConstantesFunciones.activardescripcionDepositoBanco);	
		//
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.setEnabled(isHabilitar && this.depositobancoConstantesFunciones.activarid_empresaDepositoBanco);//
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.setEnabled(isHabilitar && this.depositobancoConstantesFunciones.activarid_sucursalDepositoBanco);//
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.setEnabled(isHabilitar && this.depositobancoConstantesFunciones.activarid_usuarioDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.setEnabled(isHabilitar && this.depositobancoConstantesFunciones.activarid_bancoDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.setEnabled(isHabilitar && this.depositobancoConstantesFunciones.activarid_asiento_contableDepositoBanco);
	};
	
	public void setDefaultControlesDepositoBanco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDepositoBanco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.depositobancoSessionBean.setConGuardarRelaciones(true);			
			this.depositobancoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDepositoBanco.jTabbedPaneRelacionesDepositoBanco.setVisible(true);
			
					
		} else {
			//this.depositobancoSessionBean.setConGuardarRelaciones(false);			
			this.depositobancoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDepositoBanco.jTabbedPaneRelacionesDepositoBanco.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDepositoBanco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepositoBanco depositobancoAux:this.depositobancoLogic.getDepositoBancos()) {
				if(depositobancoAux.getId().equals(this.iIdNuevoDepositoBanco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepositoBanco depositobancoAux:this.depositobancos) {
				if(depositobancoAux.getId().equals(this.iIdNuevoDepositoBanco)) {
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
	
	public int getIndiceActualDepositoBanco(DepositoBanco depositobanco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepositoBanco depositobancoAux:this.depositobancoLogic.getDepositoBancos()) {
				if(depositobancoAux.getId().equals(depositobanco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepositoBanco depositobancoAux:this.depositobancos) {
				if(depositobancoAux.getId().equals(depositobanco.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDepositoBanco(DepositoBanco depositobancoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepositoBanco depositobancoAux:this.depositobancoLogic.getDepositoBancos()) {
				if(depositobancoAux.getDepositoBancoOriginal().getId().equals(depositobancoOriginal.getId())) {
					existe=true;
					depositobancoOriginal.setId(depositobancoAux.getId());
					depositobancoOriginal.setVersionRow(depositobancoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepositoBanco depositobancoAux:this.depositobancos) {
				if(depositobancoAux.getDepositoBancoOriginal().getId().equals(depositobancoOriginal.getId())) {
					existe=true;
					depositobancoOriginal.setId(depositobancoAux.getId());
					depositobancoOriginal.setVersionRow(depositobancoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDepositoBanco(Boolean esParaCancelar) throws Exception {
		depositobancosAux=new ArrayList<DepositoBanco>();
		depositobancoAux=new DepositoBanco();
		
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DepositoBanco depositobancoAux:this.depositobancoLogic.getDepositoBancos()) {
					if(depositobancoAux.getId()<0) {
						depositobancosAux.add(depositobancoAux);
					}		
				}
				this.iIdNuevoDepositoBanco=0L;
				this.depositobancoLogic.getDepositoBancos().removeAll(depositobancosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DepositoBanco depositobancoAux:this.depositobancos) {
					if(depositobancoAux.getId()<0) {
						depositobancosAux.add(depositobancoAux);
					}		
				}
				this.iIdNuevoDepositoBanco=0L;
				this.depositobancos.removeAll(depositobancosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDepositoBanco 
					&& this.depositobancoLogic.getDepositoBancos().size()>0
					) {
					depositobancoAux=this.depositobancoLogic.getDepositoBancos().get(this.depositobancoLogic.getDepositoBancos().size() - 1);
				
					if(depositobancoAux.getId()<0) {
						this.depositobancoLogic.getDepositoBancos().remove(depositobancoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDepositoBanco && this.depositobancos.size()>0) {
					depositobancoAux=this.depositobancos.get(this.depositobancos.size() - 1);
				
					if(depositobancoAux.getId()<0) {
						this.depositobancos.remove(depositobancoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDepositoBanco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(depositobanco.getId()<0) {
				this.depositobancoLogic.getDepositoBancos().remove(this.depositobanco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(depositobanco.getId()<0) {
				this.depositobancos.remove(this.depositobanco);
			}
		}			
	}
	
	public void setEstadosInicialesDepositoBanco(List<DepositoBanco> depositobancosAux) throws Exception {
		DepositoBancoConstantesFunciones.setEstadosInicialesDepositoBanco(depositobancosAux);
	}
	
	public void setEstadosInicialesDepositoBanco(DepositoBanco depositobancoAux) throws Exception {
		DepositoBancoConstantesFunciones.setEstadosInicialesDepositoBanco(depositobancoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDepositoBancoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDepositoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDepositoBancoActual()) {
				if(!this.isEsNuevoDepositoBanco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDepositoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDepositoBanco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDepositoBancoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Deposito Banco ?", "MANTENIMIENTO DE Deposito Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDepositoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DepositoBanco depositobanco) throws Exception {
		DepositoBancoConstantesFunciones.seleccionarAsignar(this.depositobanco,depositobanco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDepositoBanco=this.isPermisoActualizarOriginalDepositoBanco;
			
			
			this.seleccionarAsignar(depositobanco);
			
			

			idAsientoContableActual=depositobanco.getid_asiento_contable();
			this.seleccionarAsientoContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DepositoBancoConstantesFunciones.quitarEspaciosDepositoBanco(this.depositobanco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDepositoBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.depositobancoSessionBean.setsFuncionBusquedaRapida(this.depositobancoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarAsientoContableActual() throws Exception {
		try	{
			AsientoContable asientocontableAux=new AsientoContable();

			if(this.idAsientoContableActual != null && this.idAsientoContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(this.idAsientoContableActual);
					asientocontableAux= asientocontableLogic.getAsientoContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				asientocontablesForeignKey=new ArrayList<AsientoContable>();
				asientocontablesForeignKey.add(asientocontableAux);
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
			if(this.isEsNuevoDepositoBanco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDepositoBanco(esParaCancelar);				
				this.cancelarNuevoDepositoBanco(esParaCancelar);								
			}
			
			this.depositobanco=new DepositoBanco();
			
			this.inicializarDepositoBanco();
			
			this.actualizarEstadoCeldasBotonesDepositoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDepositoBanco() throws Exception {
		try {
			DepositoBancoConstantesFunciones.inicializarDepositoBanco(this.depositobanco);
			
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
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.depositobancoLogic.getDepositoBancos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDepositoBancos(String sAccionBusqueda,List<DepositoBanco> depositobancosParaReportes) throws Exception {
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
					sPathReporteFinal="DepositoBanco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DepositoBancoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DepositoBancoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DepositoBanco"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Deposito Bancos");		
		parameters.put("busquedapor", DepositoBancoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDepositoBanco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DepositoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DepositoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDepositoBanco=new JRBeanArrayDataSource(DepositoBancoJInternalFrame.TraerDepositoBancoBeans(depositobancosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDepositoBanco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DepositoBancoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DepositoBancoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DepositoBancoBean.TraerDepositoBancoBeans(depositobancosParaReportes).toArray()));
							
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
				this.generarExcelReporteDepositoBancos(sAccionBusqueda,sTipoArchivoReporte,depositobancosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDepositoBancos(sAccionBusqueda,sTipoArchivoReporte,depositobancosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDepositoBancoActionPerformed(null);
					//this.generarExcelReporteDepositoBancos(sAccionBusqueda,sTipoArchivoReporte,depositobancosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDepositoBancos(sAccionBusqueda,sTipoArchivoReporte,depositobancosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDepositoBancos(sAccionBusqueda,sTipoArchivoReporte,depositobancosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDepositoBancos(sAccionBusqueda,sTipoArchivoReporte,depositobancosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDepositoBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<DepositoBanco> depositobancosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depositobanco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DepositoBancos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDepositoBanco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DepositoBanco depositobanco : depositobancosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DepositoBancoConstantesFunciones.generarExcelReporteDataDepositoBanco("NORMAL",row,workbook,depositobanco,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDepositoBanco(String sTipo,Row row,Workbook workbook) {
		
		DepositoBancoConstantesFunciones.generarExcelReporteHeaderDepositoBanco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDepositoBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<DepositoBanco> depositobancosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depositobanco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DepositoBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DepositoBanco depositobanco : depositobancosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DepositoBancoConstantesFunciones.getDepositoBancoDescripcion(depositobanco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepositoBancoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depositobanco.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depositobanco.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepositoBancoConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depositobanco.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepositoBancoConstantesFunciones.LABEL_IDBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depositobanco.getbanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depositobanco.getasientocontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepositoBancoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depositobanco.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depositobanco.getvalor_efectivo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depositobanco.getvalor_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepositoBancoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depositobanco.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDepositoBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<DepositoBanco> depositobancosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DepositoBanco> depositobancosRespaldo=null;
		
		classes=DepositoBancoConstantesFunciones.getClassesRelationshipsOfDepositoBanco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.depositobancoLogic.setDatosCliente(this.datosCliente);
		this.depositobancoLogic.setDatosDeep(this.datosDeep);
		this.depositobancoLogic.setIsConDeep(true);
		
		depositobancosRespaldo=this.depositobancoLogic.getDepositoBancos();
		
		this.depositobancoLogic.setDepositoBancos(depositobancosParaReportes);	
		this.depositobancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		depositobancosParaReportes=this.depositobancoLogic.getDepositoBancos();
		this.depositobancoLogic.setDepositoBancos(depositobancosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depositobanco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DepositoBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDepositoBanco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DepositoBanco depositobanco : depositobancosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDepositoBanco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DepositoBancoConstantesFunciones.generarExcelReporteDataDepositoBanco("NORMAL",row,workbook,depositobanco,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DepositoBancoConstantesFunciones.getDepositoBancoDescripcion(depositobanco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDepositoBanco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDepositoBanco() throws Exception {		
		this.startProcessDepositoBanco(true);
	}
	
	public void startProcessDepositoBanco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDepositoBanco ,this.jPanelParametrosReportesDepositoBanco, this.jScrollPanelDatosDepositoBanco,this.jPanelPaginacionDepositoBanco, this.jScrollPanelDatosEdicionDepositoBanco, this.jPanelAccionesDepositoBanco,this.jPanelAccionesFormularioDepositoBanco,this.jmenuBarDepositoBanco,this.jmenuBarDetalleDepositoBanco,this.jTtoolBarDepositoBanco,this.jTtoolBarDetalleDepositoBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasDepositoBanco=this.jTabbedPaneBusquedasDepositoBanco; 
		
		final JPanel jPanelParametrosReportesDepositoBanco=this.jPanelParametrosReportesDepositoBanco;
		//final JScrollPane jScrollPanelDatosDepositoBanco=this.jScrollPanelDatosDepositoBanco;
		final JTable jTableDatosDepositoBanco=this.jTableDatosDepositoBanco;		
		final JPanel jPanelPaginacionDepositoBanco=this.jPanelPaginacionDepositoBanco;
		//final JScrollPane jScrollPanelDatosEdicionDepositoBanco=this.jScrollPanelDatosEdicionDepositoBanco;
		final JPanel jPanelAccionesDepositoBanco=this.jPanelAccionesDepositoBanco;
		
		JPanel jPanelCamposAuxiliarDepositoBanco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDepositoBanco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			jPanelCamposAuxiliarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jPanelCamposDepositoBanco;
			jPanelAccionesFormularioAuxiliarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jPanelAccionesFormularioDepositoBanco;
		}
		
		final JPanel jPanelCamposDepositoBanco=jPanelCamposAuxiliarDepositoBanco;
		final JPanel jPanelAccionesFormularioDepositoBanco=jPanelAccionesFormularioAuxiliarDepositoBanco;
		
		
		final JMenuBar jmenuBarDepositoBanco=this.jmenuBarDepositoBanco;
		final JToolBar jTtoolBarDepositoBanco=this.jTtoolBarDepositoBanco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDepositoBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDepositoBanco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			jmenuBarDetalleAuxiliarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jmenuBarDetalleDepositoBanco;
			jTtoolBarDetalleAuxiliarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jTtoolBarDetalleDepositoBanco;
		}
		
		final JMenuBar jmenuBarDetalleDepositoBanco=jmenuBarDetalleAuxiliarDepositoBanco;
		final JToolBar jTtoolBarDetalleDepositoBanco=jTtoolBarDetalleAuxiliarDepositoBanco;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDepositoBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDepositoBanco;
			processRunnable.jTableDatos=jTableDatosDepositoBanco;
			processRunnable.jPanelCampos=jPanelCamposDepositoBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionDepositoBanco;
			processRunnable.jPanelAcciones=jPanelAccionesDepositoBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDepositoBanco;
			
			
			processRunnable.jmenuBar=jmenuBarDepositoBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDepositoBanco;
			processRunnable.jTtoolBar=jTtoolBarDepositoBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDepositoBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDepositoBanco ,jPanelParametrosReportesDepositoBanco,jTableDatosDepositoBanco, /*jScrollPanelDatosDepositoBanco,*/jPanelCamposDepositoBanco,jPanelPaginacionDepositoBanco, /*jScrollPanelDatosEdicionDepositoBanco,*/ jPanelAccionesDepositoBanco,jPanelAccionesFormularioDepositoBanco,jmenuBarDepositoBanco,jmenuBarDetalleDepositoBanco,jTtoolBarDepositoBanco,jTtoolBarDetalleDepositoBanco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDepositoBanco ,jPanelParametrosReportesDepositoBanco, jScrollPanelDatosDepositoBanco,jPanelPaginacionDepositoBanco, jScrollPanelDatosEdicionDepositoBanco, jPanelAccionesDepositoBanco,jPanelAccionesFormularioDepositoBanco,jmenuBarDepositoBanco,jmenuBarDetalleDepositoBanco,jTtoolBarDepositoBanco,jTtoolBarDetalleDepositoBanco);
						
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
	
	public void finishProcessDepositoBanco() {// throws Exception 
		this.finishProcessDepositoBanco(true);
	}
	
	public void finishProcessDepositoBanco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDepositoBanco ,this.jPanelParametrosReportesDepositoBanco, this.jScrollPanelDatosDepositoBanco,this.jPanelPaginacionDepositoBanco, this.jScrollPanelDatosEdicionDepositoBanco, this.jPanelAccionesDepositoBanco,this.jPanelAccionesFormularioDepositoBanco,this.jmenuBarDepositoBanco,this.jmenuBarDetalleDepositoBanco,this.jTtoolBarDepositoBanco,this.jTtoolBarDetalleDepositoBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasDepositoBanco=this.jTabbedPaneBusquedasDepositoBanco; 
		
		final JPanel jPanelParametrosReportesDepositoBanco=this.jPanelParametrosReportesDepositoBanco;
		//final JScrollPane jScrollPanelDatosDepositoBanco=this.jScrollPanelDatosDepositoBanco;
		final JTable jTableDatosDepositoBanco=this.jTableDatosDepositoBanco;		
		final JPanel jPanelPaginacionDepositoBanco=this.jPanelPaginacionDepositoBanco;
		//final JScrollPane jScrollPanelDatosEdicionDepositoBanco=this.jScrollPanelDatosEdicionDepositoBanco;
		final JPanel jPanelAccionesDepositoBanco=this.jPanelAccionesDepositoBanco;
		
		JPanel jPanelCamposAuxiliarDepositoBanco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDepositoBanco=new JPanel();
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			jPanelCamposAuxiliarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jPanelCamposDepositoBanco;
			jPanelAccionesFormularioAuxiliarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jPanelAccionesFormularioDepositoBanco;
		}
		
		final JPanel jPanelCamposDepositoBanco=jPanelCamposAuxiliarDepositoBanco;
		final JPanel jPanelAccionesFormularioDepositoBanco=jPanelAccionesFormularioAuxiliarDepositoBanco;
		
		
		final JMenuBar jmenuBarDepositoBanco=this.jmenuBarDepositoBanco;		
		final JToolBar jTtoolBarDepositoBanco=this.jTtoolBarDepositoBanco;
				
		JMenuBar jmenuBarDetalleAuxiliarDepositoBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDepositoBanco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			jmenuBarDetalleAuxiliarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jmenuBarDetalleDepositoBanco;
			jTtoolBarDetalleAuxiliarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jTtoolBarDetalleDepositoBanco;		
		}
		
		final JMenuBar jmenuBarDetalleDepositoBanco=jmenuBarDetalleAuxiliarDepositoBanco;
		final JToolBar jTtoolBarDetalleDepositoBanco=jTtoolBarDetalleAuxiliarDepositoBanco;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDepositoBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDepositoBanco;
			processRunnable.jTableDatos=jTableDatosDepositoBanco;
			processRunnable.jPanelCampos=jPanelCamposDepositoBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionDepositoBanco;
			processRunnable.jPanelAcciones=jPanelAccionesDepositoBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDepositoBanco;
			
			
			processRunnable.jmenuBar=jmenuBarDepositoBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDepositoBanco;
			processRunnable.jTtoolBar=jTtoolBarDepositoBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDepositoBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDepositoBanco ,jPanelParametrosReportesDepositoBanco, jTableDatosDepositoBanco,/*jScrollPanelDatosDepositoBanco,*/jPanelCamposDepositoBanco,jPanelPaginacionDepositoBanco, /*jScrollPanelDatosEdicionDepositoBanco,*/ jPanelAccionesDepositoBanco,jPanelAccionesFormularioDepositoBanco,jmenuBarDepositoBanco,jmenuBarDetalleDepositoBanco,jTtoolBarDepositoBanco,jTtoolBarDetalleDepositoBanco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDepositoBanco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDepositoBanco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDepositoBanco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDepositoBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDepositoBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDepositoBanco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDepositoBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDepositoBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDepositoBanco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.depositobancoConstantesFunciones.getsFinalQueryDepositoBanco();
		String  finalQueryPaginacionTodos=this.depositobancoConstantesFunciones.getsFinalQueryDepositoBanco();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DepositoBancoConstantesFunciones.getArrayColumnasGlobalesNoDepositoBanco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DepositoBancoConstantesFunciones.getArrayColumnasGlobalesDepositoBanco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DepositoBancoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.depositobancosEliminados= new ArrayList<DepositoBanco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDepositoBanco();
		
				///*DepositoBancoSessionBean*/this.depositobancoSessionBean=new DepositoBancoSessionBean();
			
			if(this.depositobancoSessionBean==null) {
				this.depositobancoSessionBean=new DepositoBancoSessionBean();
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
					this.iNumeroPaginacion=DepositoBancoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DepositoBancoConstantesFunciones.getClassesForeignKeysOfDepositoBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/depositobanco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			depositobancosAux= new ArrayList<DepositoBanco>();
			
				
			depositobancoLogic.setDatosCliente(this.datosCliente);
			depositobancoLogic.setDatosDeep(this.datosDeep);
			depositobancoLogic.setIsConDeep(true);
			
			
			depositobancoLogic.getDepositoBancoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					depositobancoLogic.getTodosDepositoBancos(finalQueryGlobal,pagination);
					
					//depositobancoLogic.getTodosDepositoBancosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(depositobancoLogic.getDepositoBancos()==null|| depositobancoLogic.getDepositoBancos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							depositobancosAux= new ArrayList<DepositoBanco>();
							depositobancosAux.addAll(depositobancoLogic.getDepositoBancos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancosAux= new ArrayList<DepositoBanco>();
							depositobancosAux.addAll(depositobancos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							depositobancoLogic.getTodosDepositoBancos(finalQueryGlobal+"",this.pagination);												
							
							//depositobancoLogic.getTodosDepositoBancosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDepositoBancos("Todos",depositobancoLogic.getDepositoBancos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							depositobancoLogic.setDepositoBancos(new ArrayList<DepositoBanco>());					
							depositobancoLogic.getDepositoBancos().addAll(depositobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancos=new ArrayList<DepositoBanco>();
							depositobancos.addAll(depositobancosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDepositoBanco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDepositoBanco=this.idActual;
				
				} else if(this.idDepositoBancoActual!=null && this.idDepositoBancoActual!=0L) {
					idDepositoBanco=idDepositoBancoActual;
				}
				
					
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndicePorId(idDepositoBanco);
				
				this.depositobancos=new ArrayList<DepositoBanco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					depositobancoLogic.getEntity(idDepositoBanco);
					
					//depositobancoLogic.getEntityWithConnection(idDepositoBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depositobancoLogic.setDepositoBancos(new ArrayList<DepositoBanco>());
					depositobancoLogic.getDepositoBancos().add(depositobancoLogic.getDepositoBanco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depositobancos=new ArrayList<DepositoBanco>();
					this.depositobancos.add(depositobanco);
				}
				
				if(depositobancoLogic.getDepositoBanco()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAsientoContable")) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depositobancoLogic.getDepositoBancosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depositobancoLogic.getDepositoBancos()==null||depositobancoLogic.getDepositoBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depositobancos==null|| depositobancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancosAux=new ArrayList<DepositoBanco>();
						depositobancosAux.addAll(depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancosAux=new ArrayList<DepositoBanco>();
							depositobancosAux.addAll(depositobancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depositobancoLogic.getDepositoBancosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepositoBancos("FK_IdAsientoContable",depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepositoBancos("FK_IdAsientoContable",depositobancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoLogic.setDepositoBancos(new ArrayList<DepositoBanco>());
						depositobancoLogic.getDepositoBancos().addAll(depositobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancos=new ArrayList<DepositoBanco>();
							depositobancos.addAll(depositobancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBanco")) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depositobancoLogic.getDepositoBancosFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depositobancoLogic.getDepositoBancos()==null||depositobancoLogic.getDepositoBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depositobancos==null|| depositobancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancosAux=new ArrayList<DepositoBanco>();
						depositobancosAux.addAll(depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancosAux=new ArrayList<DepositoBanco>();
							depositobancosAux.addAll(depositobancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depositobancoLogic.getDepositoBancosFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepositoBancos("FK_IdBanco",depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepositoBancos("FK_IdBanco",depositobancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoLogic.setDepositoBancos(new ArrayList<DepositoBanco>());
						depositobancoLogic.getDepositoBancos().addAll(depositobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancos=new ArrayList<DepositoBanco>();
							depositobancos.addAll(depositobancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depositobancoLogic.getDepositoBancosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depositobancoLogic.getDepositoBancos()==null||depositobancoLogic.getDepositoBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depositobancos==null|| depositobancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancosAux=new ArrayList<DepositoBanco>();
						depositobancosAux.addAll(depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancosAux=new ArrayList<DepositoBanco>();
							depositobancosAux.addAll(depositobancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depositobancoLogic.getDepositoBancosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepositoBancos("FK_IdEmpresa",depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepositoBancos("FK_IdEmpresa",depositobancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoLogic.setDepositoBancos(new ArrayList<DepositoBanco>());
						depositobancoLogic.getDepositoBancos().addAll(depositobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancos=new ArrayList<DepositoBanco>();
							depositobancos.addAll(depositobancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depositobancoLogic.getDepositoBancosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depositobancoLogic.getDepositoBancos()==null||depositobancoLogic.getDepositoBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depositobancos==null|| depositobancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancosAux=new ArrayList<DepositoBanco>();
						depositobancosAux.addAll(depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancosAux=new ArrayList<DepositoBanco>();
							depositobancosAux.addAll(depositobancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depositobancoLogic.getDepositoBancosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepositoBancos("FK_IdSucursal",depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepositoBancos("FK_IdSucursal",depositobancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoLogic.setDepositoBancos(new ArrayList<DepositoBanco>());
						depositobancoLogic.getDepositoBancos().addAll(depositobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancos=new ArrayList<DepositoBanco>();
							depositobancos.addAll(depositobancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depositobancoLogic.getDepositoBancosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depositobancoLogic.getDepositoBancos()==null||depositobancoLogic.getDepositoBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depositobancos==null|| depositobancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancosAux=new ArrayList<DepositoBanco>();
						depositobancosAux.addAll(depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancosAux=new ArrayList<DepositoBanco>();
							depositobancosAux.addAll(depositobancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depositobancoLogic.getDepositoBancosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepositoBancoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepositoBancos("FK_IdUsuario",depositobancoLogic.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepositoBancos("FK_IdUsuario",depositobancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoLogic.setDepositoBancos(new ArrayList<DepositoBanco>());
						depositobancoLogic.getDepositoBancos().addAll(depositobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancos=new ArrayList<DepositoBanco>();
							depositobancos.addAll(depositobancosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDepositoBanco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDepositoBanco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=depositobancoLogic.getDepositoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=depositobancos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=depositobancoLogic.getDepositoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=depositobancos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DepositoBanco depositobanco) {
		Boolean permite=true;
		
		if(this.depositobanco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DepositoBancoConstantesFunciones.getOrderByListaDepositoBanco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DepositoBancoConstantesFunciones.getOrderByListaDepositoBanco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepositoBanco depositobanco:depositobancoLogic.getDepositoBancos()) {
				if(depositobanco.getsType().equals(Constantes2.S_TOTALES)) {
					depositobancoTotales=depositobanco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepositoBanco depositobanco:this.depositobancos) {
				if(depositobanco.getsType().equals(Constantes2.S_TOTALES)) {
					depositobancoTotales=depositobanco;
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
			this.depositobancoAux=new DepositoBanco();
			this.depositobancoAux.setsType(Constantes2.S_TOTALES);
			this.depositobancoAux.setIsNew(false);
			this.depositobancoAux.setIsChanged(false);
			this.depositobancoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DepositoBancoConstantesFunciones.TotalizarValoresFilaDepositoBanco(this.depositobancoLogic.getDepositoBancos(),this.depositobancoAux);
				
				this.depositobancoLogic.getDepositoBancos().add(this.depositobancoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DepositoBancoConstantesFunciones.TotalizarValoresFilaDepositoBanco(this.depositobancos,this.depositobancoAux);
				
				this.depositobancos.add(this.depositobancoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		depositobancoTotales=new DepositoBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.depositobancoLogic.getDepositoBancos().remove(depositobancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.depositobancos.remove(depositobancoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		depositobancoTotales=new DepositoBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepositoBanco depositobanco:depositobancoLogic.getDepositoBancos()) {
				if(depositobanco.getsType().equals(Constantes2.S_TOTALES)) {
					depositobancoTotales=depositobanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DepositoBancoConstantesFunciones.TotalizarValoresFilaDepositoBanco(this.depositobancoLogic.getDepositoBancos(),depositobancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepositoBanco depositobanco:this.depositobancos) {
				if(depositobanco.getsType().equals(Constantes2.S_TOTALES)) {
					depositobancoTotales=depositobanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DepositoBancoConstantesFunciones.TotalizarValoresFilaDepositoBanco(this.depositobancos,depositobancoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDepositoBancosFK_IdAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepositoBancosFK_IdBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepositoBancosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepositoBancosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepositoBancosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDepositoBancosFK_IdAsientoContable(String sFinalQuery,Long id_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depositobancoLogic.getDepositoBancosFK_IdAsientoContable(sFinalQuery,this.pagination,id_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepositoBancosFK_IdBanco(String sFinalQuery,Long id_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depositobancoLogic.getDepositoBancosFK_IdBanco(sFinalQuery,this.pagination,id_banco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepositoBancosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depositobancoLogic.getDepositoBancosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepositoBancosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depositobancoLogic.getDepositoBancosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepositoBancosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depositobancoLogic.getDepositoBancosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosDepositoBanco() {
		this.isPermisoTodoDepositoBanco=false;
		this.isPermisoNuevoDepositoBanco=false;
		this.isPermisoActualizarDepositoBanco=false;
		this.isPermisoActualizarOriginalDepositoBanco=false;
		this.isPermisoEliminarDepositoBanco=false;
		this.isPermisoGuardarCambiosDepositoBanco=false;
		this.isPermisoConsultaDepositoBanco=false;
		this.isPermisoBusquedaDepositoBanco=false;
		this.isPermisoReporteDepositoBanco=false;		
		this.isPermisoOrdenDepositoBanco=false;		
		this.isPermisoPaginacionMedioDepositoBanco=false;		
		this.isPermisoPaginacionAltoDepositoBanco=false;
		this.isPermisoPaginacionTodoDepositoBanco=false;
		this.isPermisoCopiarDepositoBanco=false;		
		this.isPermisoVerFormDepositoBanco=false;		
		this.isPermisoDuplicarDepositoBanco=false;		
		this.isPermisoOrdenDepositoBanco=false;		
	}
	
	public void setPermisosUsuarioDepositoBanco(Boolean isPermiso) {
		this.isPermisoTodoDepositoBanco=isPermiso;
		this.isPermisoNuevoDepositoBanco=isPermiso;
		this.isPermisoActualizarDepositoBanco=isPermiso;
		this.isPermisoActualizarOriginalDepositoBanco=isPermiso;
		this.isPermisoEliminarDepositoBanco=isPermiso;
		this.isPermisoGuardarCambiosDepositoBanco=isPermiso;
		this.isPermisoConsultaDepositoBanco=isPermiso;
		this.isPermisoBusquedaDepositoBanco=isPermiso;
		this.isPermisoReporteDepositoBanco=isPermiso;
		this.isPermisoOrdenDepositoBanco=isPermiso;		
		this.isPermisoPaginacionMedioDepositoBanco=isPermiso;		
		this.isPermisoPaginacionAltoDepositoBanco=isPermiso;		
		this.isPermisoPaginacionTodoDepositoBanco=isPermiso;		
		this.isPermisoCopiarDepositoBanco=isPermiso;		
		this.isPermisoVerFormDepositoBanco=isPermiso;		
		this.isPermisoDuplicarDepositoBanco=isPermiso;
		this.isPermisoOrdenDepositoBanco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDepositoBanco(Boolean isPermiso) {
		//this.isPermisoTodoDepositoBanco=isPermiso;
		this.isPermisoNuevoDepositoBanco=isPermiso;
		this.isPermisoActualizarDepositoBanco=isPermiso;
		this.isPermisoActualizarOriginalDepositoBanco=isPermiso;
		this.isPermisoEliminarDepositoBanco=isPermiso;
		this.isPermisoGuardarCambiosDepositoBanco=isPermiso;
		//this.isPermisoConsultaDepositoBanco=isPermiso;
		//this.isPermisoBusquedaDepositoBanco=isPermiso;
		//this.isPermisoReporteDepositoBanco=isPermiso;
		//this.isPermisoOrdenDepositoBanco=isPermiso;		
		//this.isPermisoPaginacionMedioDepositoBanco=isPermiso;		
		//this.isPermisoPaginacionAltoDepositoBanco=isPermiso;		
		//this.isPermisoPaginacionTodoDepositoBanco=isPermiso;		
		//this.isPermisoCopiarDepositoBanco=isPermiso;		
		//this.isPermisoDuplicarDepositoBanco=isPermiso;
		//this.isPermisoOrdenDepositoBanco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDepositoBancoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DepositoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDepositoBanco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDepositoBancoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDepositoBancoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDepositoBancoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDepositoBancoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDepositoBanco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DepositoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DepositoBancoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDepositoBanco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDepositoBanco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDepositoBanco=this.isPermisoActualizarDepositoBanco;
			this.isPermisoEliminarDepositoBanco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDepositoBanco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDepositoBanco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDepositoBanco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDepositoBanco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDepositoBanco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDepositoBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDepositoBanco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDepositoBanco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDepositoBanco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDepositoBanco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDepositoBanco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDepositoBanco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDepositoBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDepositoBanco.setToolTipText(this.jTableDatosDepositoBanco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDepositoBanco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDepositoBanco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DepositoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DepositoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDepositoBanco() throws Exception {
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
	public void inicializarCombosForeignKeyDepositoBancoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.bancosForeignKey=new ArrayList();
				this.asientocontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDepositoBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DepositoBancoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDepositoBancoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAsientoContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AsientoContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDepositoBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DepositoBancoParameterReturnGeneral depositobancoReturnGeneral=new DepositoBancoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.depositobancoConstantesFunciones.cargarid_empresaDepositoBanco)
					 || (this.esRecargarFks && this.depositobancoConstantesFunciones.cargarid_empresaDepositoBanco)) {

					if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+depositobancoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.depositobancoConstantesFunciones.cargarid_sucursalDepositoBanco)
					 || (this.esRecargarFks && this.depositobancoConstantesFunciones.cargarid_sucursalDepositoBanco)) {

					if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+depositobancoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.depositobancoConstantesFunciones.cargarid_usuarioDepositoBanco)
					 || (this.esRecargarFks && this.depositobancoConstantesFunciones.cargarid_usuarioDepositoBanco)) {

					if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+depositobancoSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalBanco="";

				if(((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0) && this.depositobancoConstantesFunciones.cargarid_bancoDepositoBanco)
					 || (this.esRecargarFks && this.depositobancoConstantesFunciones.cargarid_bancoDepositoBanco)) {

					if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

						finalQueryGlobalBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalBanco, "");
						finalQueryGlobalBanco+=BancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBanco=" WHERE " + ConstantesSql.ID + "="+depositobancoSessionBean.getlidBancoActual();
					}
				} else {
					finalQueryGlobalBanco="NONE";
				}


				String finalQueryGlobalAsientoContable="";

				if(((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0) && this.depositobancoConstantesFunciones.cargarid_asiento_contableDepositoBanco)
					 || (this.esRecargarFks && this.depositobancoConstantesFunciones.cargarid_asiento_contableDepositoBanco)) {

					if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAsientoContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

						finalQueryGlobalAsientoContable=Funciones.GetFinalQueryAppend(finalQueryGlobalAsientoContable, "");
						finalQueryGlobalAsientoContable+=AsientoContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAsientoContable=" WHERE " + ConstantesSql.ID + "="+depositobancoSessionBean.getlidAsientoContableActual();
					}
				} else {
					finalQueryGlobalAsientoContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				depositobancoReturnGeneral=depositobancoLogic.cargarCombosLoteForeignKeyDepositoBanco(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalBanco,finalQueryGlobalAsientoContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=depositobancoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=depositobancoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=depositobancoReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalBanco.equals("NONE")) {
				this.bancosForeignKey=depositobancoReturnGeneral.getbancosForeignKey();
			}

			if(!finalQueryGlobalAsientoContable.equals("NONE")) {
				this.asientocontablesForeignKey=depositobancoReturnGeneral.getasientocontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDepositoBanco()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyBanco();
			this.addItemDefectoCombosForeignKeyAsientoContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.depositobancoSessionBean==null) {
				this.depositobancoSessionBean=new DepositoBancoSessionBean();
			}

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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

	public void addItemDefectoCombosForeignKeyBanco()throws Exception {
		try {

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				Banco banco=new Banco();
				BancoConstantesFunciones.setBancoDescripcion(banco,Constantes.SMENSAJE_ESCOJA_OPCION);
				banco.setId(null);

				if(!BancoConstantesFunciones.ExisteEnLista(this.bancosForeignKey,banco,true)) {

					this.bancosForeignKey.add(0,banco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAsientoContable()throws Exception {
		try {

			if(!this.depositobancoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				AsientoContable asientocontable=new AsientoContable();
				AsientoContableConstantesFunciones.setAsientoContableDescripcion(asientocontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				asientocontable.setId(null);

				if(!AsientoContableConstantesFunciones.ExisteEnLista(this.asientocontablesForeignKey,asientocontable,true)) {

					this.asientocontablesForeignKey.add(0,asientocontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDepositoBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDepositoBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDepositoBanco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.depositobanco.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDepositoBanco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDepositoBanco(DepositoBanco depositobanco)throws Exception {	
		try {
			
			this.setActualBancoForeignKey(depositobanco.getid_banco(),false,"Formulario");
			this.setActualAsientoContableForeignKey(depositobanco.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDepositoBanco(DepositoBanco depositobanco,String sTipoEvento)throws Exception {	
		try {
			
			

				if(depositobanco.getAsientoContable()!=null && !sTipoEvento.equals("id_asiento_contableDepositoBanco")) { //sTipoEvento Evita Bucle Infinito

					this.asientocontablesForeignKey=new ArrayList<AsientoContable>();
					this.asientocontablesForeignKey.add(depositobanco.getAsientoContable());

					this.addItemDefectoCombosForeignKeyAsientoContable();
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDepositoBanco()throws Exception {	
		try {
			
			this.setActualBancoForeignKey(this.depositobancoConstantesFunciones.getid_banco(),false,"Formulario");
			this.setActualAsientoContableForeignKey(this.depositobancoConstantesFunciones.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDepositoBanco()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDepositoBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDepositoBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDepositoBanco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDepositoBanco()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameBancosForeignKey("Todos");
			this.cargarCombosFrameAsientoContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDepositoBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDepositoBanco()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public DepositoBancoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DepositoBancoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DepositoBancoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.depositobancoSessionBean=new DepositoBancoSessionBean(); 
		this.depositobancoConstantesFunciones=new DepositoBancoConstantesFunciones(); 
		this.depositobancoBean=new DepositoBanco();//(this.depositobancoConstantesFunciones); 		
		this.depositobancoReturnGeneral=new DepositoBancoParameterReturnGeneral(); 
		
		this.depositobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.depositobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DepositoBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DepositoBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DepositoBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDepositoBanco(true);
			
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
			
			this.depositobancoConstantesFunciones=new DepositoBancoConstantesFunciones(); 
			this.depositobancoBean=new DepositoBanco();//this.depositobancoConstantesFunciones); 			
			this.depositobancoReturnGeneral=new DepositoBancoParameterReturnGeneral(); 
		
			DepositoBancoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Deposito Banco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.depositobanco=new DepositoBanco();
			this.depositobancos = new ArrayList<DepositoBanco>();
			this.depositobancosAux = new ArrayList<DepositoBanco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic=new DepositoBancoLogic();
				this.depositobancoLogic.getNewConnexionToDeep("");
			}
			
			//this.depositobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.depositobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDepositoBanco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDepositoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDepositoBanco);	
					}
					
					if(this.jInternalFrameImportacionDepositoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDepositoBanco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDepositoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDepositoBanco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDepositoBanco);
				this.jInternalFrameDetalleFormDepositoBanco.setVisible(false);
				this.jInternalFrameDetalleFormDepositoBanco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDepositoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDepositoBanco);
					this.jInternalFrameReporteDinamicoDepositoBanco.setVisible(false);
					this.jInternalFrameReporteDinamicoDepositoBanco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDepositoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDepositoBanco);
					this.jInternalFrameImportacionDepositoBanco.setVisible(false);
					this.jInternalFrameImportacionDepositoBanco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDepositoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDepositoBanco);
					this.jInternalFrameOrderByDepositoBanco.setVisible(false);
					this.jInternalFrameOrderByDepositoBanco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDepositoBancoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DepositoBancoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.depositobancoReturnGeneral=new DepositoBancoParameterReturnGeneral();
			
			this.depositobancoParameterGeneral=new DepositoBancoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.depositobancoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DepositoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DepositoBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.depositobancoSessionBean.getEsGuardarRelacionado(),this.depositobancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DepositoBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.depositobancoSessionBean.getEsGuardarRelacionado(),this.depositobancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDepositoBanco=false;
			this.isVisibilidadCeldaDuplicarDepositoBanco=true;
			this.isVisibilidadCeldaCopiarDepositoBanco=true;
			this.isVisibilidadCeldaVerFormDepositoBanco=true;
			this.isVisibilidadCeldaOrdenDepositoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;
			this.isVisibilidadCeldaModificarDepositoBanco=false;
			this.isVisibilidadCeldaActualizarDepositoBanco=false;
			this.isVisibilidadCeldaEliminarDepositoBanco=false;
			this.isVisibilidadCeldaCancelarDepositoBanco=false;
			this.isVisibilidadCeldaGuardarDepositoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=false;
			
			
			this.isVisibilidadFK_IdAsientoContable=true;
			this.isVisibilidadFK_IdBanco=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDepositoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDepositoBanco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDepositoBanco(false);
			
			this.setPermisosUsuarioDepositoBanco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.depositobancoSessionBean.getEsGuardarRelacionado() 
				|| (this.depositobancoSessionBean.getEsGuardarRelacionado() && this.depositobancoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDepositoBancoClasesRelacionadas();
			}
			
			if(this.depositobancoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDepositoBancoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDepositoBanco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDepositoBanco();
			}
			
			if(!this.isPermisoBusquedaDepositoBanco) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDepositoBanco.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDepositoBanco,this.isPermisoPaginacionMedioDepositoBanco,this.isPermisoPaginacionTodoDepositoBanco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DepositoBancoConstantesFunciones.getTiposSeleccionarDepositoBanco());
				
				this.tiposColumnasSelect=DepositoBancoConstantesFunciones.getTiposSeleccionarDepositoBanco(true);
				
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
			//if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDepositoBanco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDepositoBanco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDepositoBanco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDepositoBanco() ;
			
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
			this.bancoLogic=new BancoLogic();
			this.asientocontableLogic=new AsientoContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				depositobancoImplementable= (DepositoBancoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DepositoBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				depositobancoImplementableHome= (DepositoBancoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DepositoBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.depositobancos= new ArrayList<DepositoBanco>();
			this.depositobancosEliminados= new ArrayList<DepositoBanco>();
						
			this.isEsNuevoDepositoBanco=false;
			this.esParaAccionDesdeFormularioDepositoBanco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idAsientoContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.bancosForeignKey=new ArrayList<Banco>() ;
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDepositoBanco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDepositoBanco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DepositoBancoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DepositoBancoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDepositoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDepositoBanco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDepositoBanco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDepositoBanco();
			}
			
			DepositoBancoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDepositoBanco.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDepositoBanco.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDepositoBanco.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDepositoBanco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DepositoBanco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDepositoBanco() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDepositoBanco")) {
				iIndex=this.jInternalFrameDetalleFormDepositoBanco.jTabbedPaneRelacionesDepositoBanco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDepositoBanco.jTabbedPaneRelacionesDepositoBanco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDepositoBanco();	
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
	
	public void cargarCombosForeignKeyDepositoBanco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDepositoBanco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDepositoBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDepositoBancoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDepositoBanco();
		
		this.cargarCombosFrameForeignKeyDepositoBanco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDepositoBanco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDepositoBanco();
		}
	}
	
	

	public void cargarCombosForeignKeyBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBanco(this.bancosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAsientoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDepositoBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.depositobancoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
			
			if(jTableDatosDepositoBanco.getRowCount()>=1) {
				jTableDatosDepositoBanco.removeRowSelectionInterval(0, jTableDatosDepositoBanco.getRowCount()-1);						
			}
			
			this.isEsNuevoDepositoBanco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDepositoBanco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDepositoBanco(true);			
			//this.depositobanco=new DepositoBanco();
			//this.depositobanco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDepositoBanco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepositoBanco() ;
			
			if(DepositoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDepositoBanco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.depositobanco);	
			this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);				
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
			if(this.depositobancoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DepositoBanco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDepositoBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDepositoBanco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDepositoBanco.getSelectedRows().length;			
			}
			
			depositobancosSeleccionados=this.getDepositoBancosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDepositoBanco--;			
				//DepositoBanco depositobancoAux= new DepositoBanco();			
				//depositobancoAux.setId(this.iIdNuevoDepositoBanco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DepositoBanco depositobancoOrigen=new DepositoBanco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DepositoBanco depositobancoOrigen : depositobancosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							depositobancoOrigen =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depositobancoOrigen =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDepositoBanco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.depositobanco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDepositoBanco(depositobancoOrigen,this.depositobanco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.depositobancoLogic.getDepositoBancos().add(this.depositobancoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.depositobancos.add(this.depositobancoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDepositoBanco(false);
				
				this.jTableDatosDepositoBanco.setRowSelectionInterval(this.getIndiceNuevoDepositoBanco(), this.getIndiceNuevoDepositoBanco());
				
				int iLastRow =  this.jTableDatosDepositoBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDepositoBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDepositoBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDepositoBanco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();									
		
			DepositoBanco depositobancoOrigen=new DepositoBanco();
			DepositoBanco depositobancoDestino=new DepositoBanco();
				
			depositobancosSeleccionados=this.getDepositoBancosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDepositoBanco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || depositobancosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDepositoBanco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoOrigen =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						depositobancoOrigen =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depositobancoDestino =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						depositobancoDestino =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				depositobancoOrigen =depositobancosSeleccionados.get(0);
				depositobancoDestino =depositobancosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDepositoBanco(depositobancoOrigen,depositobancoDestino,true,false);
				
				depositobancoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(depositobancoDestino,depositobancoLogic.getDepositoBancos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(depositobancoDestino,depositobancos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDepositoBanco(false);
				
				//this.jTableDatosDepositoBanco.setRowSelectionInterval(this.getIndiceNuevoDepositoBanco(), this.getIndiceNuevoDepositoBanco());
				
				int iLastRow =  this.jTableDatosDepositoBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDepositoBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDepositoBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDepositoBanco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDepositoBanco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDepositoBanco.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDepositoBanco.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDepositoBanco.setVisible(!isVisible);
			this.jPanelPaginacionDepositoBanco.setVisible(!isVisible);
			this.jPanelAccionesDepositoBanco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDepositoBanco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDepositoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDepositoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDepositoBanco();
			
			this.abrirFrameOrderByDepositoBanco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDepositoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDepositoBanco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDepositoBanco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDepositoBanco.isMaximum()) {
					this.jInternalFrameDetalleFormDepositoBanco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDepositoBanco.setSize(this.jInternalFrameDetalleFormDepositoBanco.iWidthFormulario,this.jInternalFrameDetalleFormDepositoBanco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDepositoBanco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDepositoBanco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDepositoBanco.isMaximum()) {
						this.jInternalFrameDetalleFormDepositoBanco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDepositoBanco.jContentPaneDetalleDepositoBanco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDepositoBanco.jTabbedPaneRelacionesDepositoBanco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDepositoBanco.jContentPaneDetalleDepositoBanco.getWidth(),DepositoBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDepositoBanco.jTabbedPaneRelacionesDepositoBanco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDepositoBanco.jContentPaneDetalleDepositoBanco.getWidth(),DepositoBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDepositoBanco.jTabbedPaneRelacionesDepositoBanco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDepositoBanco.jContentPaneDetalleDepositoBanco.getWidth(),DepositoBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDepositoBanco.setVisible(true);
	        this.jInternalFrameDetalleFormDepositoBanco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDepositoBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDepositoBanco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDepositoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepositoBanco,false,this);
				} else {
					this.jInternalFrameOrderByDepositoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepositoBanco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDepositoBanco);
				this.jInternalFrameOrderByDepositoBanco.setVisible(false);
				this.jInternalFrameOrderByDepositoBanco.setSelected(false);
				
				this.jInternalFrameOrderByDepositoBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDepositoBanco"));
				
				this.inicializarActualizarBindingTablaOrderByDepositoBanco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDepositoBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDepositoBanco==null) {
				
				this.jInternalFrameImportacionDepositoBanco=new ImportacionJInternalFrame(DepositoBancoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDepositoBanco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDepositoBanco);
				this.jInternalFrameImportacionDepositoBanco.setVisible(false);
				this.jInternalFrameImportacionDepositoBanco.setSelected(false);


				this.jInternalFrameImportacionDepositoBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDepositoBanco"));
				this.jInternalFrameImportacionDepositoBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDepositoBanco"));
				this.jInternalFrameImportacionDepositoBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDepositoBanco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDepositoBanco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDepositoBanco==null) {
				this.jInternalFrameReporteDinamicoDepositoBanco=new ReporteDinamicoJInternalFrame(DepositoBancoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDepositoBanco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDepositoBanco);
				this.jInternalFrameReporteDinamicoDepositoBanco.setVisible(false);
				this.jInternalFrameReporteDinamicoDepositoBanco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDepositoBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDepositoBanco"));
				this.jInternalFrameReporteDinamicoDepositoBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDepositoBanco"));
				this.jInternalFrameReporteDinamicoDepositoBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDepositoBanco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDepositoBanco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDepositoBanco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDepositoBanco);
			
	       	this.jInternalFrameDetalleFormDepositoBanco.setVisible(false);
	        this.jInternalFrameDetalleFormDepositoBanco.setSelected(false);
			
			//this.jInternalFrameDetalleFormDepositoBanco.dispose();
			//this.jInternalFrameDetalleFormDepositoBanco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDepositoBanco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDepositoBanco.setVisible(true);
	        this.jInternalFrameReporteDinamicoDepositoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDepositoBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDepositoBanco.setVisible(true);
	        this.jInternalFrameImportacionDepositoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDepositoBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDepositoBanco.setVisible(true);
	        this.jInternalFrameOrderByDepositoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDepositoBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDepositoBanco.setVisible(false);
	        this.jInternalFrameOrderByDepositoBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDepositoBanco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDepositoBanco.setVisible(false);
	        this.jInternalFrameReporteDinamicoDepositoBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDepositoBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDepositoBanco.setVisible(false);
	        this.jInternalFrameImportacionDepositoBanco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDepositoBanco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDepositoBanco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDepositoBanco(true);
			//this.isEsNuevoDepositoBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDepositoBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDepositoBanco(false) ;
			
			if(depositobancoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DepositoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDepositoBanco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepositoBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDepositoBancoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDepositoBanco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDepositoBanco(true);
			//this.isEsNuevoDepositoBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.depositobanco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDepositoBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDepositoBanco(false) ;
			
			if(DepositoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDepositoBanco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepositoBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("AsientoContable")) {
				if(!this.depositobancoConstantesFunciones.cargarid_asiento_contableDepositoBanco) {
					this.cargarCombosAsientoContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDepositoBanco(false,false);
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_asiento_contable (id);

				this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaBanco(List<Banco> bancosForeignKey)throws Exception{
		TableColumn tableColumnBanco=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_IDBANCO));
		TableCellEditor tableCellEditorBanco =tableColumnBanco.getCellEditor();

		BancoTableCell bancoTableCellFk=(BancoTableCell)tableCellEditorBanco;

		if(bancoTableCellFk!=null) {
			bancoTableCellFk.setbancosForeignKey(bancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepositoBanco.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bancoTableCellFk.setRowActual(intSelectedRow);
			//bancoTableCellFk.setbancosForeignKeyActual(bancosForeignKey);
		//}


		if(bancoTableCellFk!=null) {
			bancoTableCellFk.RecargarBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAsientoContable(List<AsientoContable> asientocontablesForeignKey)throws Exception{
		TableColumn tableColumnAsientoContable=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE));
		TableCellEditor tableCellEditorAsientoContable =tableColumnAsientoContable.getCellEditor();

		AsientoContableTableCell asientocontableTableCellFk=(AsientoContableTableCell)tableCellEditorAsientoContable;

		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.setasientocontablesForeignKey(asientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepositoBanco.getSelectedRow();

		//if(intSelectedRow<=0) {
			//asientocontableTableCellFk.setRowActual(intSelectedRow);
			//asientocontableTableCellFk.setasientocontablesForeignKeyActual(asientocontablesForeignKey);
		//}


		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.RecargarAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_asiento_contable (Long id) throws Exception {
		this.setActualAsientoContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDepositoBanco(false);
			
			//if(!this.isEsNuevoDepositoBanco) {								
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				
			}
			
			if(this.permiteMantenimiento(this.depositobanco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDepositoBanco=true;
					this.inicializarActualizarBindingTablaDepositoBanco(false);
					this.isEsNuevoDepositoBanco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDepositoBanco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDepositoBanco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDepositoBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDepositoBanco(false);
				
				this.habilitarDeshabilitarControlesDepositoBanco(false);
			
												
				
				if(DepositoBancoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDepositoBanco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDepositoBancoActionPerformed(evt,depositobancoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDepositoBanco(this.depositobanco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDepositoBanco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,depositobancoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.depositobanco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDepositoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				this.depositobanco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				this.depositobanco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.depositobanco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DepositoBancoModel) this.jTableDatosDepositoBanco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDepositoBanco=true;
				this.inicializarActualizarBindingTablaDepositoBanco(false);
				this.isEsNuevoDepositoBanco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDepositoBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDepositoBanco(false);
				
				this.habilitarDeshabilitarControlesDepositoBanco(false);
				
				
				
				if(DepositoBancoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDepositoBanco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDepositoBancoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDepositoBanco.getRowCount()>=1) {
				jTableDatosDepositoBanco.removeRowSelectionInterval(0, jTableDatosDepositoBanco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDepositoBanco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDepositoBanco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDepositoBanco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepositoBanco(false) ;
			
			this.isEsNuevoDepositoBanco=false;
			
			if(DepositoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDepositoBanco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDepositoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDepositoBanco(false);
				
				//SI ES MANUAL
				if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDepositoBanco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDepositoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDepositoBanco--;			
			//DepositoBanco depositobancoAux= new DepositoBanco();			
			//depositobancoAux.setId(this.iIdNuevoDepositoBanco);
			
			if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDepositoBanco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
			
			this.depositobanco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.depositobancoLogic.getDepositoBancos().add(this.depositobancoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.depositobancos.add(this.depositobancoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDepositoBanco(false);
			
			this.jTableDatosDepositoBanco.setRowSelectionInterval(this.getIndiceNuevoDepositoBanco(), this.getIndiceNuevoDepositoBanco());
			
			int iLastRow =  this.jTableDatosDepositoBanco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDepositoBanco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDepositoBanco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDepositoBanco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDepositoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDepositoBanco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepositoBanco(false);
			
			//SI ES MANUAL
			if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDepositoBanco();
			}
			
			//this.abrirFrameTreeDepositoBanco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDepositoBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Deposito BancoS ?", "MANTENIMIENTO DE Deposito Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDepositoBanco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDepositoBanco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.depositobancoReturnGeneral=depositobancoLogic.procesarImportacionDepositoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.depositobancoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDepositoBancoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDepositoBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDepositoBanco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDepositoBanco.setFileImportacion(this.jInternalFrameImportacionDepositoBanco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDepositoBanco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDepositoBanco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDepositoBanco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDepositoBanco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDepositoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();		

		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DepositoBancoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DepositoBancoBaseDesign.jrxml";
			
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
			
			this.generarReporteDepositoBancos("Todos",depositobancosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DepositoBancoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepositoBancoConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepositoBancoConstantesFunciones.LABEL_IDBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Banco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Banco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Banco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Banco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepositoBancoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorEfectivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorEfectivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorEfectivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorEfectivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepositoBancoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoDepositoBanco.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DepositoBancoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoria="id_banco";
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoria="id_asiento_contable";
					break;

				case DepositoBancoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO:
					sNombreCampoCategoria="valor_efectivo";
					break;

				case DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE:
					sNombreCampoCategoria="valor_cheque";
					break;

				case DepositoBancoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DepositoBancoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoriaValor="id_banco";
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_asiento_contable";
					break;

				case DepositoBancoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO:
					sNombreCampoCategoriaValor="valor_efectivo";
					break;

				case DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE:
					sNombreCampoCategoriaValor="valor_cheque";
					break;

				case DepositoBancoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DepositoBancoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_banco");
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_asiento_contable");
					break;

				case DepositoBancoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Efectivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_efectivo");
					break;

				case DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_cheque");
					break;

				case DepositoBancoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoDepositoBancoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();		
		
		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depositobanco";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DepositoBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DepositoBancoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DepositoBanco depositobanco:depositobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depositobanco.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DepositoBanco depositobanco:depositobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depositobanco.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(DepositoBanco depositobanco:depositobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depositobanco.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDBANCO);
					iRow++;

					for(DepositoBanco depositobanco:depositobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depositobanco.getbanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
					iRow++;

					for(DepositoBanco depositobanco:depositobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depositobanco.getasientocontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepositoBancoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(DepositoBanco depositobanco:depositobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depositobanco.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO);
					iRow++;

					for(DepositoBanco depositobanco:depositobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depositobanco.getvalor_efectivo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE);
					iRow++;

					for(DepositoBanco depositobanco:depositobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depositobanco.getvalor_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepositoBancoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DepositoBanco depositobanco:depositobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depositobanco.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDepositoBanco(row);				
			//	iRow++;
			//}				
			
			//for(DepositoBanco depositobancoAux:depositobancosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDepositoBanco(depositobancoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
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
				this.depositobancoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepositoBanco(false);
			
			//SI ES MANUAL
			if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDepositoBanco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDepositoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepositoBanco(false);
			
			//SI ES MANUAL
			if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDepositoBanco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDepositoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepositoBanco(false);
			
			//SI ES MANUAL
			if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDepositoBanco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDepositoBanco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDepositoBanco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDepositoBanco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDepositoBanco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDepositoBanco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDepositoBanco.setMinimumSize(dimensionMinimum);
		this.jTableDatosDepositoBanco.setMaximumSize(dimensionMaximum);
		this.jTableDatosDepositoBanco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDepositoBanco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDepositoBanco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDepositoBanco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDepositoBanco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDepositoBanco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDepositoBanco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDepositoBanco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDepositoBanco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDepositoBanco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDepositoBanco();
		
		this.inicializarActualizarBindingBotonesManualDepositoBanco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDepositoBanco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDepositoBanco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDepositoBanco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDepositoBanco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDepositoBanco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDepositoBanco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDepositoBanco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDepositoBanco.jCheckBoxPostAccionNuevoDepositoBanco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDepositoBanco.jCheckBoxPostAccionSinCerrarDepositoBanco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDepositoBanco.jCheckBoxPostAccionSinMensajeDepositoBanco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDepositoBanco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDepositoBanco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDepositoBanco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
				this.jInternalFrameDetalleFormDepositoBanco.jCheckBoxPostAccionNuevoDepositoBanco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDepositoBanco.jCheckBoxPostAccionSinCerrarDepositoBanco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDepositoBanco.jCheckBoxPostAccionSinMensajeDepositoBanco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDepositoBanco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDepositoBanco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDepositoBanco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDepositoBanco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDepositoBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDepositoBanco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDepositoBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDepositoBanco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDepositoBanco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDepositoBanco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDepositoBanco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDepositoBanco(Boolean esInicializar) throws Exception {
		try	{	
			if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDepositoBanco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDepositoBanco() throws Exception {
		try	{
			if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDepositoBanco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDepositoBanco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDepositoBanco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDepositoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDepositoBanco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDepositoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDepositoBanco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDepositoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDepositoBanco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDepositoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDepositoBanco.addItem(reporte);
			}
			
			
			if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDepositoBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDepositoBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDepositoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDepositoBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDepositoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDepositoBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDepositoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDepositoBanco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDepositoBanco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDepositoBanco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDepositoBanco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDepositoBanco!=null) {
				this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDepositoBanco!=null) {
				this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDepositoBanco!=null) {
				
				if(this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDepositoBanco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDepositoBanco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDepositoBanco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DepositoBancoConstantesFunciones.getTiposSeleccionarDepositoBanco(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DepositoBancoConstantesFunciones.getTiposSeleccionarDepositoBanco(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DepositoBancoConstantesFunciones.getTiposSeleccionarDepositoBanco(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDepositoBanco.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDepositoBanco.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDepositoBanco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.getSelectedItem()!=null){this.id_asiento_contableFK_IdAsientoContable=((AsientoContable)this.jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.getSelectedItem()).getId();}
		if(this.jComboBoxid_bancoFK_IdBancoDepositoBanco.getSelectedItem()!=null){this.id_bancoFK_IdBanco=((Banco)this.jComboBoxid_bancoFK_IdBancoDepositoBanco.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDepositoBanco(Boolean esInicializar) throws Exception {				
		if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDepositoBanco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDepositoBanco() throws Exception {
		this.inicializarActualizarBindingTablaDepositoBanco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDepositoBanco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDepositoBancoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBancoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDepositoBanco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=depositobancoLogic.getDepositoBancos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=depositobancos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDepositoBanco.setModel(new DepositoBancoModel(this.depositobancoLogic.getDepositoBancos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDepositoBanco.setModel(new DepositoBancoModel(this.depositobancos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDepositoBanco!=null && this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDepositoBanco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO,depositobancoConstantesFunciones.resaltarSeleccionarDepositoBanco,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO,depositobancoConstantesFunciones.resaltarSeleccionarDepositoBanco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_ID));

		if(this.depositobancoConstantesFunciones.mostraridDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depositobancoConstantesFunciones.resaltaridDepositoBanco,this.depositobancoConstantesFunciones.activaridDepositoBanco,iSizeTabla,this,true,"idDepositoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depositobancoConstantesFunciones.resaltaridDepositoBanco,this.depositobancoConstantesFunciones.activaridDepositoBanco,this,true,"idDepositoBanco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.depositobancoConstantesFunciones.mostrarid_empresaDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.depositobancoConstantesFunciones.resaltarid_empresaDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_empresaDepositoBanco,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.depositobancoConstantesFunciones.resaltarid_empresaDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_empresaDepositoBanco,false,"id_empresaDepositoBanco","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.depositobancoConstantesFunciones.mostrarid_sucursalDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.depositobancoConstantesFunciones.resaltarid_sucursalDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_sucursalDepositoBanco,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.depositobancoConstantesFunciones.resaltarid_sucursalDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_sucursalDepositoBanco,false,"id_sucursalDepositoBanco","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_IDUSUARIO));

		if(this.depositobancoConstantesFunciones.mostrarid_usuarioDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.depositobancoConstantesFunciones.resaltarid_usuarioDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_usuarioDepositoBanco,iSizeTabla));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.depositobancoConstantesFunciones.resaltarid_usuarioDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_usuarioDepositoBanco,false,"id_usuarioDepositoBanco","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_IDBANCO));

		if(this.depositobancoConstantesFunciones.mostrarid_bancoDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_IDBANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BancoTableCell(this.bancosForeignKey,this.depositobancoConstantesFunciones.resaltarid_bancoDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_bancoDepositoBanco,iSizeTabla));
			tableColumn.setCellEditor(new BancoTableCell(this.bancosForeignKey,this.depositobancoConstantesFunciones.resaltarid_bancoDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_bancoDepositoBanco,true,"id_bancoDepositoBanco","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE));

		if(this.depositobancoConstantesFunciones.mostrarid_asiento_contableDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AsientoContableTableCell(this.asientocontablesForeignKey,this.depositobancoConstantesFunciones.resaltarid_asiento_contableDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_asiento_contableDepositoBanco,iSizeTabla));
			tableColumn.setCellEditor(new AsientoContableTableCell(this.asientocontablesForeignKey,this.depositobancoConstantesFunciones.resaltarid_asiento_contableDepositoBanco,this,this.depositobancoConstantesFunciones.activarid_asiento_contableDepositoBanco,true,"id_asiento_contableDepositoBanco","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_FECHA));

		if(this.depositobancoConstantesFunciones.mostrarfechaDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.depositobancoConstantesFunciones.resaltarfechaDepositoBanco,this.depositobancoConstantesFunciones.activarfechaDepositoBanco,iSizeTabla,this,true,"fechaDepositoBanco","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.depositobancoConstantesFunciones.resaltarfechaDepositoBanco,this.depositobancoConstantesFunciones.activarfechaDepositoBanco,this,true,"fechaDepositoBanco","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO));

		if(this.depositobancoConstantesFunciones.mostrarvalor_efectivoDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depositobancoConstantesFunciones.resaltarvalor_efectivoDepositoBanco,this.depositobancoConstantesFunciones.activarvalor_efectivoDepositoBanco,iSizeTabla,this,true,"valor_efectivoDepositoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depositobancoConstantesFunciones.resaltarvalor_efectivoDepositoBanco,this.depositobancoConstantesFunciones.activarvalor_efectivoDepositoBanco,this,true,"valor_efectivoDepositoBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE));

		if(this.depositobancoConstantesFunciones.mostrarvalor_chequeDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depositobancoConstantesFunciones.resaltarvalor_chequeDepositoBanco,this.depositobancoConstantesFunciones.activarvalor_chequeDepositoBanco,iSizeTabla,this,true,"valor_chequeDepositoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depositobancoConstantesFunciones.resaltarvalor_chequeDepositoBanco,this.depositobancoConstantesFunciones.activarvalor_chequeDepositoBanco,this,true,"valor_chequeDepositoBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,DepositoBancoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.depositobancoConstantesFunciones.mostrardescripcionDepositoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepositoBancoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.depositobancoConstantesFunciones.resaltardescripcionDepositoBanco,this.depositobancoConstantesFunciones.activardescripcionDepositoBanco,iSizeTabla,this,true,"descripcionDepositoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depositobancoConstantesFunciones.resaltardescripcionDepositoBanco,this.depositobancoConstantesFunciones.activardescripcionDepositoBanco,this,true,"descripcionDepositoBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepositoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.depositobancoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.depositobancoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDepositoBanco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.depositobancoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.depositobancoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDepositoBanco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.depositobancoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.depositobancoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDepositoBanco.addColumn(tableColumn);
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
			
			this.jTableDatosDepositoBanco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDepositoBanco.moveColumn(this.jTableDatosDepositoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDepositoBanco.moveColumn(this.jTableDatosDepositoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDepositoBanco.moveColumn(this.jTableDatosDepositoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDepositoBanco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDepositoBanco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDepositoBanco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDepositoBanco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDepositoBanco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDepositoBanco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDepositoBanco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDepositoBanco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=depositobancoLogic.getDepositoBancos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=depositobancos.size()-1;
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
		//this.jTableDatosDepositoBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDepositoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDepositoBanco();
			
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
				
				//this.isEsNuevoDepositoBanco=false;
					
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
				if(this.depositobancoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDepositoBanco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDepositoBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDepositoBanco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.depositobanco.getsType().equals("DUPLICADO")
				   || this.depositobanco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDepositoBanco=true;
				
				} else {
					this.isEsNuevoDepositoBanco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
					if(this.depositobanco.getId()>=0 && !this.depositobanco.getIsNew()) {						
						this.isEsNuevoDepositoBanco=false;
						
					} else {
						this.isEsNuevoDepositoBanco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDepositoBanco(esRelaciones);						
				
				this.seleccionarDepositoBanco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.depositobanco.getId()<0) {
					this.isEsNuevoDepositoBanco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDepositoBanco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDepositoBanco(evt,rowIndex);
				}	
				
				if(this.depositobancoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DepositoBanco: " + this.dDif); 
					}
				}								
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDepositoBanco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.depositobanco)) {
					if(this.depositobanco.getId()>0) {
						this.depositobanco.setIsDeleted(true);
						
						this.depositobancosEliminados.add(this.depositobanco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.depositobancoLogic.getDepositoBancos().remove(this.depositobanco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.depositobancos.remove(this.depositobanco);				
					}
					
					
					((DepositoBancoModel) this.jTableDatosDepositoBanco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDepositoBanco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDepositoBanco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDepositoBanco) {
			
			if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDepositoBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDepositoBanco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDepositoBanco(this.depositobanco);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.depositobancoConstantesFunciones.cargarid_empresaDepositoBanco || this.depositobancoConstantesFunciones.event_dependid_empresaDepositoBanco) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.depositobanco.getid_empresa());
									//this.inicializarActualizarBindingDepositoBanco(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(depositobanco.getEmpresa()!=null) {
							this.empresasForeignKey.add(depositobanco.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.depositobanco.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.depositobancoConstantesFunciones.cargarid_sucursalDepositoBanco || this.depositobancoConstantesFunciones.event_dependid_sucursalDepositoBanco) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.depositobanco.getid_sucursal());
									//this.inicializarActualizarBindingDepositoBanco(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(depositobanco.getSucursal()!=null) {
							this.sucursalsForeignKey.add(depositobanco.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.depositobanco.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.depositobancoConstantesFunciones.cargarid_usuarioDepositoBanco || this.depositobancoConstantesFunciones.event_dependid_usuarioDepositoBanco) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.depositobanco.getid_usuario());
									//this.inicializarActualizarBindingDepositoBanco(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(depositobanco.getUsuario()!=null) {
							this.usuariosForeignKey.add(depositobanco.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.depositobanco.getid_usuario(),false,"Formulario");

					//Banco
					if(!this.depositobancoConstantesFunciones.cargarid_bancoDepositoBanco || this.depositobancoConstantesFunciones.event_dependid_bancoDepositoBanco) {
						//this.cargarCombosBancosForeignKeyLista(" where id="+this.depositobanco.getid_banco());
									//this.inicializarActualizarBindingDepositoBanco(false,false);
						this.bancosForeignKey=new ArrayList<Banco>();

						if(depositobanco.getBanco()!=null) {
							this.bancosForeignKey.add(depositobanco.getBanco());
						}

						this.addItemDefectoCombosForeignKeyBanco();
						this.cargarCombosFrameBancosForeignKey("Todos");
					}
					this.setActualBancoForeignKey(this.depositobanco.getid_banco(),false,"Formulario");

					//AsientoContable
					if(!this.depositobancoConstantesFunciones.cargarid_asiento_contableDepositoBanco || this.depositobancoConstantesFunciones.event_dependid_asiento_contableDepositoBanco) {
						//this.cargarCombosAsientoContablesForeignKeyLista(" where id="+this.depositobanco.getid_asiento_contable());
									//this.inicializarActualizarBindingDepositoBanco(false,false);
						this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

						if(depositobanco.getAsientoContable()!=null) {
							this.asientocontablesForeignKey.add(depositobanco.getAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyAsientoContable();
						this.cargarCombosFrameAsientoContablesForeignKey("Todos");
					}
					this.setActualAsientoContableForeignKey(this.depositobanco.getid_asiento_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDepositoBanco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDepositoBanco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDepositoBanco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDepositoBanco(DepositoBanco depositobanco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDepositoBanco(depositobanco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDepositoBanco(DepositoBanco depositobanco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDepositoBanco(depositobanco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDepositoBanco(depositobanco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDepositoBanco(depositobanco);
	}
	
	public void setVariablesObjetoActualToFormularioDepositoBanco(DepositoBanco depositobanco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.setText(depositobanco.getId().toString());
			this.jInternalFrameDetalleFormDepositoBanco.jDateChooserfechaDepositoBanco.setDate(depositobanco.getfecha());
			this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_efectivoDepositoBanco.setText(depositobanco.getvalor_efectivo().toString());
			this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_chequeDepositoBanco.setText(depositobanco.getvalor_cheque().toString());
			this.jInternalFrameDetalleFormDepositoBanco.jTextAreadescripcionDepositoBanco.setText(depositobanco.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DepositoBanco depositobancoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,depositobancoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DepositoBanco depositobancoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				depositobancoLocal=this.depositobanco;
			} else {
				depositobancoLocal=this.depositobancoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(depositobancoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDepositoBanco(depositobancoLocal,true);
					
					if(depositobancoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(depositobancoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(depositobancoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDepositoBanco(DepositoBanco depositobanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDepositoBanco(depositobanco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(depositobanco);
	}
	
	public void setVariablesFormularioToObjetoActualDepositoBanco(DepositoBanco depositobanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDepositoBanco(depositobanco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDepositoBanco(DepositoBanco depositobanco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.getText()==null || this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.getText()=="" || this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.getText()=="Id") {
				this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.setText("0");
			}

			if(conColumnasBase) {depositobanco.setId(Long.parseLong(this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepositoBancoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelIdDepositoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depositobanco.setfecha(this.jInternalFrameDetalleFormDepositoBanco.jDateChooserfechaDepositoBanco.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepositoBancoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelfechaDepositoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depositobanco.setvalor_efectivo(Double.parseDouble(this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_efectivoDepositoBanco.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelvalor_efectivoDepositoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depositobanco.setvalor_cheque(Double.parseDouble(this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_chequeDepositoBanco.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabelvalor_chequeDepositoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depositobanco.setdescripcion(this.jInternalFrameDetalleFormDepositoBanco.jTextAreadescripcionDepositoBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepositoBancoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepositoBanco.jLabeldescripcionDepositoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDepositoBanco(DepositoBanco depositobancoBean,DepositoBanco depositobanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && depositobancoBean.getid_banco()!=null && !depositobancoBean.getid_banco().equals(-1L))) {depositobanco.setid_banco(depositobancoBean.getid_banco());}
			if(conDefault || (!conDefault && depositobancoBean.getid_asiento_contable()!=null && !depositobancoBean.getid_asiento_contable().equals(null))) {depositobanco.setid_asiento_contable(depositobancoBean.getid_asiento_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDepositoBanco(DepositoBanco depositobancoOrigen,DepositoBanco depositobanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && depositobancoOrigen.getId()!=null && !depositobancoOrigen.getId().equals(0L))) {depositobanco.setId(depositobancoOrigen.getId());}}
			if(conDefault || (!conDefault && depositobancoOrigen.getid_banco()!=null && !depositobancoOrigen.getid_banco().equals(-1L))) {depositobanco.setid_banco(depositobancoOrigen.getid_banco());}
			if(conDefault || (!conDefault && depositobancoOrigen.getid_asiento_contable()!=null && !depositobancoOrigen.getid_asiento_contable().equals(null))) {depositobanco.setid_asiento_contable(depositobancoOrigen.getid_asiento_contable());}
			if(conDefault || (!conDefault && depositobancoOrigen.getfecha()!=null && !depositobancoOrigen.getfecha().equals(new Date()))) {depositobanco.setfecha(depositobancoOrigen.getfecha());}
			if(conDefault || (!conDefault && depositobancoOrigen.getvalor_efectivo()!=null && !depositobancoOrigen.getvalor_efectivo().equals(0.0))) {depositobanco.setvalor_efectivo(depositobancoOrigen.getvalor_efectivo());}
			if(conDefault || (!conDefault && depositobancoOrigen.getvalor_cheque()!=null && !depositobancoOrigen.getvalor_cheque().equals(0.0))) {depositobanco.setvalor_cheque(depositobancoOrigen.getvalor_cheque());}
			if(conDefault || (!conDefault && depositobancoOrigen.getdescripcion()!=null && !depositobancoOrigen.getdescripcion().equals(""))) {depositobanco.setdescripcion(depositobancoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDepositoBanco(DepositoBanco depositobanco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.setText(depositobanco.getId().toString());
			this.jInternalFrameDetalleFormDepositoBanco.jDateChooserfechaDepositoBanco.setDate(depositobanco.getfecha());
			this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_efectivoDepositoBanco.setText(depositobanco.getvalor_efectivo().toString());
			this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_chequeDepositoBanco.setText(depositobanco.getvalor_cheque().toString());
			this.jInternalFrameDetalleFormDepositoBanco.jTextAreadescripcionDepositoBanco.setText(depositobanco.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDepositoBanco(DepositoBancoBean depositobancoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.setText(depositobancoBean.getId().toString());
			this.jInternalFrameDetalleFormDepositoBanco.jDateChooserfechaDepositoBanco.setDate(depositobancoBean.getfecha());
			this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_efectivoDepositoBanco.setText(depositobancoBean.getvalor_efectivo().toString());
			this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_chequeDepositoBanco.setText(depositobancoBean.getvalor_cheque().toString());
			this.jInternalFrameDetalleFormDepositoBanco.jTextAreadescripcionDepositoBanco.setText(depositobancoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDepositoBanco(DepositoBancoParameterReturnGeneral depositobancoReturnGeneral,DepositoBancoBean depositobancoBean,Boolean conDefault) throws Exception { 
		try {
			DepositoBanco depositobancoLocal=new DepositoBanco();
			
			depositobancoLocal=depositobancoReturnGeneral.getDepositoBanco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && depositobancoLocal.getId()!=null && !depositobancoLocal.getId().equals(0L))) {depositobancoBean.setId(depositobancoLocal.getId());}}
			if(conDefault || (!conDefault && depositobancoLocal.getid_banco()!=null && !depositobancoLocal.getid_banco().equals(-1L))) {depositobancoBean.setid_banco(depositobancoLocal.getid_banco());}
			if(conDefault || (!conDefault && depositobancoLocal.getid_asiento_contable()!=null && !depositobancoLocal.getid_asiento_contable().equals(null))) {depositobancoBean.setid_asiento_contable(depositobancoLocal.getid_asiento_contable());}
			if(conDefault || (!conDefault && depositobancoLocal.getfecha()!=null && !depositobancoLocal.getfecha().equals(new Date()))) {depositobancoBean.setfecha(depositobancoLocal.getfecha());}
			if(conDefault || (!conDefault && depositobancoLocal.getvalor_efectivo()!=null && !depositobancoLocal.getvalor_efectivo().equals(0.0))) {depositobancoBean.setvalor_efectivo(depositobancoLocal.getvalor_efectivo());}
			if(conDefault || (!conDefault && depositobancoLocal.getvalor_cheque()!=null && !depositobancoLocal.getvalor_cheque().equals(0.0))) {depositobancoBean.setvalor_cheque(depositobancoLocal.getvalor_cheque());}
			if(conDefault || (!conDefault && depositobancoLocal.getdescripcion()!=null && !depositobancoLocal.getdescripcion().equals(""))) {depositobancoBean.setdescripcion(depositobancoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDepositoBancoGenerico(Long idDepositoBancoSeleccionado,JComboBox jComboBoxDepositoBanco,List<DepositoBanco> depositobancosLocal)throws Exception {
		try {
			DepositoBanco  depositobancoTemp=null;

			for(DepositoBanco depositobancoAux:depositobancosLocal) {
				if(depositobancoAux.getId()!=null && depositobancoAux.getId().equals(idDepositoBancoSeleccionado)) {
					depositobancoTemp=depositobancoAux;
					break;
				}
			}

			jComboBoxDepositoBanco.setSelectedItem(depositobancoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDepositoBancoGenerico(JComboBox jComboBoxDepositoBanco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDepositoBanco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDepositoBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDepositoBanco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDepositoBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			depositobanco=(DepositoBanco) depositobancoLogic.getDepositoBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			depositobanco =(DepositoBanco) depositobancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!depositobanco.getIsNew() && !depositobanco.getIsChanged() && !depositobanco.getIsDeleted()) {
				sDescripcion=depositobanco.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=depositobanco.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!depositobanco.getIsNew() && !depositobanco.getIsChanged() && !depositobanco.getIsDeleted()) {
				sDescripcion=depositobanco.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=depositobanco.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!depositobanco.getIsNew() && !depositobanco.getIsChanged() && !depositobanco.getIsDeleted()) {
				sDescripcion=depositobanco.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=depositobanco.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Banco")) {
			//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
			if(!depositobanco.getIsNew() && !depositobanco.getIsChanged() && !depositobanco.getIsDeleted()) {
				sDescripcion=depositobanco.getbanco_descripcion();
			} else {
				//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
				sDescripcion=depositobanco.getbanco_descripcion();
			}
		}

		if(sTipo.equals("AsientoContable")) {
			//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
			if(!depositobanco.getIsNew() && !depositobanco.getIsChanged() && !depositobanco.getIsDeleted()) {
				sDescripcion=depositobanco.getasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=depositobanco.getasientocontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DepositoBanco depositobancoRow=new DepositoBanco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			depositobancoRow=(DepositoBanco) depositobancoLogic.getDepositoBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			depositobancoRow=(DepositoBanco) depositobancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDepositoBanco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDepositoBanco.setVisible((this.isVisibilidadCeldaNuevoDepositoBanco && this.isPermisoNuevoDepositoBanco));			
			this.jButtonDuplicarDepositoBanco.setVisible((this.isVisibilidadCeldaDuplicarDepositoBanco && this.isPermisoDuplicarDepositoBanco));			
			this.jButtonCopiarDepositoBanco.setVisible((this.isVisibilidadCeldaCopiarDepositoBanco && this.isPermisoCopiarDepositoBanco));
			this.jButtonVerFormDepositoBanco.setVisible((this.isVisibilidadCeldaVerFormDepositoBanco && this.isPermisoVerFormDepositoBanco));
			
			this.jButtonAbrirOrderByDepositoBanco.setVisible((this.isVisibilidadCeldaOrdenDepositoBanco && this.isPermisoOrdenDepositoBanco));			
			
			this.jButtonNuevoRelacionesDepositoBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesDepositoBanco && this.isPermisoNuevoDepositoBanco));			
			this.jButtonNuevoGuardarCambiosDepositoBanco.setVisible((this.isVisibilidadCeldaNuevoDepositoBanco && this.isPermisoNuevoDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));
			
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonModificarDepositoBanco.setVisible((this.isVisibilidadCeldaModificarDepositoBanco && this.isPermisoActualizarDepositoBanco));	
			this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarDepositoBanco.setVisible((this.isVisibilidadCeldaActualizarDepositoBanco && this.isPermisoActualizarDepositoBanco));	
			this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarDepositoBanco.setVisible((this.isVisibilidadCeldaEliminarDepositoBanco && this.isPermisoEliminarDepositoBanco));
			this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarDepositoBanco.setVisible(this.isVisibilidadCeldaCancelarDepositoBanco);							
			this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosDepositoBanco.setVisible((this.isVisibilidadCeldaGuardarDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));			
			
			}
						
			this.jButtonGuardarCambiosTablaDepositoBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaNuevoDepositoBanco && this.isPermisoNuevoDepositoBanco));						
			this.jButtonDuplicarToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaDuplicarDepositoBanco && this.isPermisoDuplicarDepositoBanco));						
			this.jButtonCopiarToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaCopiarDepositoBanco && this.isPermisoCopiarDepositoBanco));			
			this.jButtonVerFormToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaVerFormDepositoBanco && this.isPermisoVerFormDepositoBanco));			
			this.jButtonAbrirOrderByToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaOrdenDepositoBanco && this.isPermisoOrdenDepositoBanco));
			this.jButtonNuevoRelacionesToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesDepositoBanco && this.isPermisoNuevoDepositoBanco));			
			this.jButtonNuevoGuardarCambiosToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaNuevoDepositoBanco && this.isPermisoNuevoDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));			
			
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonModificarToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaModificarDepositoBanco && this.isPermisoActualizarDepositoBanco));	
			this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaActualizarDepositoBanco  && this.isPermisoActualizarDepositoBanco));	
			this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaEliminarDepositoBanco && this.isPermisoEliminarDepositoBanco));
			this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarToolBarDepositoBanco.setVisible(this.isVisibilidadCeldaCancelarDepositoBanco);				
			this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaGuardarDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDepositoBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDepositoBanco.setVisible((this.isVisibilidadCeldaNuevoDepositoBanco && this.isPermisoNuevoDepositoBanco));			
			this.jMenuItemDuplicarDepositoBanco.setVisible((this.isVisibilidadCeldaDuplicarDepositoBanco && this.isPermisoDuplicarDepositoBanco));			
			this.jMenuItemCopiarDepositoBanco.setVisible((this.isVisibilidadCeldaCopiarDepositoBanco && this.isPermisoCopiarDepositoBanco));			
			this.jMenuItemVerFormDepositoBanco.setVisible((this.isVisibilidadCeldaVerFormDepositoBanco && this.isPermisoVerFormDepositoBanco));			
			this.jMenuItemAbrirOrderByDepositoBanco.setVisible((this.isVisibilidadCeldaOrdenDepositoBanco && this.isPermisoOrdenDepositoBanco));			
			//this.jMenuItemMostrarOcultarDepositoBanco.setVisible((this.isVisibilidadCeldaOrdenDepositoBanco && this.isPermisoOrdenDepositoBanco));
			this.jMenuItemDetalleAbrirOrderByDepositoBanco.setVisible((this.isVisibilidadCeldaOrdenDepositoBanco && this.isPermisoOrdenDepositoBanco));			
			//this.jMenuItemDetalleMostrarOcultarDepositoBanco.setVisible((this.isVisibilidadCeldaOrdenDepositoBanco && this.isPermisoOrdenDepositoBanco));			
			this.jMenuItemNuevoRelacionesDepositoBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesDepositoBanco && this.isPermisoNuevoDepositoBanco));			
			this.jMenuItemNuevoGuardarCambiosDepositoBanco.setVisible((this.isVisibilidadCeldaNuevoDepositoBanco && this.isPermisoNuevoDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));									
			
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			this.jInternalFrameDetalleFormDepositoBanco.jMenuItemModificarDepositoBanco.setVisible((this.isVisibilidadCeldaModificarDepositoBanco && this.isPermisoActualizarDepositoBanco));	
			this.jInternalFrameDetalleFormDepositoBanco.jMenuItemActualizarDepositoBanco.setVisible((this.isVisibilidadCeldaActualizarDepositoBanco && this.isPermisoActualizarDepositoBanco));	
			this.jInternalFrameDetalleFormDepositoBanco.jMenuItemEliminarDepositoBanco.setVisible((this.isVisibilidadCeldaEliminarDepositoBanco && this.isPermisoEliminarDepositoBanco));
			this.jInternalFrameDetalleFormDepositoBanco.jMenuItemCancelarDepositoBanco.setVisible(this.isVisibilidadCeldaCancelarDepositoBanco);				
			}
			
			this.jMenuItemGuardarCambiosDepositoBanco.setVisible((this.isVisibilidadCeldaGuardarDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));						
			this.jMenuItemGuardarCambiosTablaDepositoBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDepositoBanco=this.jButtonNuevoDepositoBanco.isVisible();
			this.isVisibilidadCeldaDuplicarDepositoBanco=this.jButtonDuplicarDepositoBanco.isVisible();
			this.isVisibilidadCeldaCopiarDepositoBanco=this.jButtonCopiarDepositoBanco.isVisible();
			this.isVisibilidadCeldaVerFormDepositoBanco=this.jButtonVerFormDepositoBanco.isVisible();
			
			this.isVisibilidadCeldaOrdenDepositoBanco=this.jButtonAbrirOrderByDepositoBanco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=this.jButtonNuevoRelacionesDepositoBanco.isVisible();
			this.isVisibilidadCeldaModificarDepositoBanco=this.jButtonModificarDepositoBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			this.isVisibilidadCeldaActualizarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarDepositoBanco.isVisible();
			this.isVisibilidadCeldaEliminarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarDepositoBanco.isVisible();
			this.isVisibilidadCeldaCancelarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarDepositoBanco.isVisible();
			this.isVisibilidadCeldaGuardarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosDepositoBanco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=this.jButtonGuardarCambiosTablaDepositoBanco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDepositoBanco=this.jButtonNuevoToolBarDepositoBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=this.jButtonNuevoRelacionesToolBarDepositoBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			this.isVisibilidadCeldaModificarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jButtonModificarToolBarDepositoBanco.isVisible();
			this.isVisibilidadCeldaActualizarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarToolBarDepositoBanco.isVisible();
			this.isVisibilidadCeldaEliminarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarToolBarDepositoBanco.isVisible();
			this.isVisibilidadCeldaCancelarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarToolBarDepositoBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDepositoBanco=this.jButtonGuardarCambiosToolBarDepositoBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=this.jButtonGuardarCambiosTablaToolBarDepositoBanco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDepositoBanco=this.jMenuItemNuevoDepositoBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=this.jMenuItemNuevoRelacionesDepositoBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			this.isVisibilidadCeldaModificarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jMenuItemModificarDepositoBanco.isVisible();
			this.isVisibilidadCeldaActualizarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jMenuItemActualizarDepositoBanco.isVisible();
			this.isVisibilidadCeldaEliminarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jMenuItemEliminarDepositoBanco.isVisible();
			this.isVisibilidadCeldaCancelarDepositoBanco=this.jInternalFrameDetalleFormDepositoBanco.jMenuItemCancelarDepositoBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDepositoBanco=this.jMenuItemGuardarCambiosDepositoBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=this.jMenuItemGuardarCambiosTablaDepositoBanco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDepositoBanco(Boolean esInicializar) {
		if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.depositobancoSessionBean.getConGuardarRelaciones()) {
				//if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDepositoBanco();
			}
			
			this.inicializarActualizarBindingBotonesManualDepositoBanco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDepositoBanco() {
		this.jButtonNuevoDepositoBanco.setVisible(this.isPermisoNuevoDepositoBanco);			
		this.jButtonDuplicarDepositoBanco.setVisible(this.isPermisoDuplicarDepositoBanco);			
		this.jButtonCopiarDepositoBanco.setVisible(this.isPermisoCopiarDepositoBanco);			
		this.jButtonVerFormDepositoBanco.setVisible(this.isPermisoVerFormDepositoBanco);			
		
		this.jButtonAbrirOrderByDepositoBanco.setVisible(this.isPermisoOrdenDepositoBanco);					
		
		this.jButtonNuevoRelacionesDepositoBanco.setVisible(this.isPermisoNuevoDepositoBanco);			
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonModificarDepositoBanco.setVisible(this.isPermisoActualizarDepositoBanco);	
			this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarDepositoBanco.setVisible(this.isPermisoActualizarDepositoBanco);	
			this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarDepositoBanco.setVisible(this.isPermisoEliminarDepositoBanco);
			this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarDepositoBanco.setVisible(this.isVisibilidadCeldaCancelarDepositoBanco);						
			this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosDepositoBanco.setVisible(this.isPermisoGuardarCambiosDepositoBanco);							
		}
		
		this.jButtonGuardarCambiosTablaDepositoBanco.setVisible(this.isPermisoActualizarDepositoBanco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDepositoBanco() {
		this.jInternalFrameDetalleFormDepositoBanco.jButtonModificarDepositoBanco.setVisible(this.isPermisoActualizarDepositoBanco);	
		this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarDepositoBanco.setVisible(this.isPermisoActualizarDepositoBanco);	
		this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarDepositoBanco.setVisible(this.isPermisoEliminarDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarDepositoBanco.setVisible(this.isVisibilidadCeldaCancelarDepositoBanco);							
		this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosDepositoBanco.setVisible((this.isVisibilidadCeldaGuardarDepositoBanco && this.isPermisoGuardarCambiosDepositoBanco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDepositoBanco() {
		if(DepositoBancoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDepositoBanco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDepositoBanco() {
	}
	
	public void jTableDatosDepositoBancoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDepositoBanco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.depositobanco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDepositoBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDepositoBanco(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepositoBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepositoBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.depositobancoLogic.getConnexion());

				if(this.depositobanco.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.depositobanco.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepositoBanco=(TitledBorder)this.jScrollPanelDatosDepositoBanco.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDepositoBanco.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.depositobanco.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDepositoBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDepositoBanco(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepositoBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepositoBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.depositobancoLogic.getConnexion());

				if(this.depositobanco.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.depositobanco.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepositoBanco=(TitledBorder)this.jScrollPanelDatosDepositoBanco.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDepositoBanco.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.depositobanco.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioDepositoBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebDepositoBanco(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepositoBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepositoBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.depositobancoLogic.getConnexion());

				if(this.depositobanco.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.depositobanco.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepositoBanco=(TitledBorder)this.jScrollPanelDatosDepositoBanco.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderDepositoBanco.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.depositobanco.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bancoDepositoBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobanco=true;

			idTienePermisobanco=this.tienePermisosUsuarioEnPaginaWebDepositoBanco(BancoConstantesFunciones.CLASSNAME);

			if(idTienePermisobanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepositoBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepositoBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);

				this.bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bancoBeanSwingJInternalFrame.getBancoLogic().setConnexion(this.depositobancoLogic.getConnexion());

				if(this.depositobanco.getid_banco()!=null) {
					this.bancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bancoBeanSwingJInternalFrame.setIdActual(this.depositobanco.getid_banco());
					this.bancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco();
				}

				JInternalFrameBase jinternalFrame =this.bancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepositoBanco=(TitledBorder)this.jScrollPanelDatosDepositoBanco.getBorder();
				TitledBorder titledBorderbanco=(TitledBorder)this.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.getBorder();

				titledBorderbanco.setTitle(titledBorderDepositoBanco.getTitle() + " -> Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bancoDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getid_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_banco = "+this.depositobanco.getid_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_asiento_contableDepositoBancoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="AsientoContable";

			if(!this.sFinalQueryGeneral_asientocontable.equals("")) {
				this.asientocontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_asientocontable);
				this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.asientocontableBeanSwingJInternalFrame.procesarBusqueda(this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingAsientoContable(false);
			}

			if(!this.sFinalQueryComboAsientoContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDepositoBanco=null;
			TitledBorder titledBorderasientocontable=null;

			if(!this.jScrollPanelDatosDepositoBanco.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDepositoBanco=(TitledBorder)this.jScrollPanelDatosDepositoBanco.getBorder();
				titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderDepositoBanco.getTitle() + " -> Asiento Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_asiento_contableDepositoBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoasientocontable=true;

			idTienePermisoasientocontable=this.tienePermisosUsuarioEnPaginaWebDepositoBanco(AsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepositoBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepositoBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);

				this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.asientocontableBeanSwingJInternalFrame.getAsientoContableLogic().setConnexion(this.depositobancoLogic.getConnexion());

				if(this.depositobanco.getid_asiento_contable()!=null) {
					this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.asientocontableBeanSwingJInternalFrame.setIdActual(this.depositobanco.getid_asiento_contable());
					this.asientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepositoBanco=(TitledBorder)this.jScrollPanelDatosDepositoBanco.getBorder();
				TitledBorder titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderDepositoBanco.getTitle() + " -> Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_asiento_contableDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getid_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_asiento_contable = "+this.depositobanco.getid_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.depositobanco.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_efectivoDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getvalor_efectivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_efectivo = "+this.depositobanco.getvalor_efectivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_chequeDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getvalor_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_cheque = "+this.depositobanco.getvalor_cheque().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDepositoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.getdepositobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depositobanco==null) {
						this.depositobanco = new DepositoBanco();
					}

					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);
				}

				if(this.depositobanco.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.depositobanco.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepositoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAsientoContableDepositoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepositoBanco(false,false);

			this.getDepositoBancosFK_IdAsientoContable();

			this.inicializarActualizarBindingDepositoBanco(false);

			//if(DepositoBancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepositoBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBancoDepositoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepositoBanco(false,false);

			this.getDepositoBancosFK_IdBanco();

			this.inicializarActualizarBindingDepositoBanco(false);

			//if(DepositoBancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepositoBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDepositoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepositoBanco(false,false);

			this.getDepositoBancosFK_IdEmpresa();

			this.inicializarActualizarBindingDepositoBanco(false);

			//if(DepositoBancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepositoBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDepositoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepositoBanco(false,false);

			this.getDepositoBancosFK_IdSucursal();

			this.inicializarActualizarBindingDepositoBanco(false);

			//if(DepositoBancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepositoBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioDepositoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepositoBanco(false,false);

			this.getDepositoBancosFK_IdUsuario();

			this.inicializarActualizarBindingDepositoBanco(false);

			//if(DepositoBancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepositoBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depositobancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDepositoBanco() {
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
			this.jInternalFrameDetalleFormDepositoBanco.setVisible(false);	    			
			this.jInternalFrameDetalleFormDepositoBanco.dispose();
			this.jInternalFrameDetalleFormDepositoBanco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDepositoBanco!=null) {
			this.jInternalFrameReporteDinamicoDepositoBanco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDepositoBanco.dispose();
			this.jInternalFrameReporteDinamicoDepositoBanco=null;
		}
		
		if(this.jInternalFrameImportacionDepositoBanco!=null) {
			this.jInternalFrameImportacionDepositoBanco.setVisible(false);	    			
			this.jInternalFrameImportacionDepositoBanco.dispose();
			this.jInternalFrameImportacionDepositoBanco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDepositoBanco();
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDepositoBanco")) {
				jButtonNuevoDepositoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDepositoBanco")) {
				jButtonDuplicarDepositoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDepositoBanco")) {
				jButtonCopiarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDepositoBanco")) {
				jButtonVerFormDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDepositoBanco")) {
				jButtonNuevoDepositoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDepositoBanco")) {
				jButtonDuplicarDepositoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDepositoBanco")) {
				jButtonNuevoDepositoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDepositoBanco")) {
				jButtonDuplicarDepositoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDepositoBanco")) {
				jButtonNuevoDepositoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDepositoBanco")) {
				jButtonNuevoDepositoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDepositoBanco")) {
				jButtonNuevoDepositoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDepositoBanco")) {
				jButtonModificarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDepositoBanco")) {
				jButtonModificarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDepositoBanco")) {
				jButtonModificarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDepositoBanco")) {
				jButtonActualizarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDepositoBanco")) {
				jButtonActualizarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDepositoBanco")) {
				jButtonActualizarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDepositoBanco")) {
				jButtonEliminarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDepositoBanco")) {
				jButtonEliminarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDepositoBanco")) {
				jButtonEliminarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDepositoBanco")) {
				jButtonCancelarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDepositoBanco")) {
				jButtonCancelarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDepositoBanco")) {
				jButtonCancelarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDepositoBanco")) {
				jButtonCerrarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDepositoBanco")) {
				jButtonCerrarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDepositoBanco")) {
				jButtonCerrarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDepositoBanco")) {
				jButtonMostrarOcultarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDepositoBanco")) {
				jButtonCancelarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDepositoBanco")) {
				jButtonGuardarCambiosDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDepositoBanco")) {
				jButtonGuardarCambiosDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDepositoBanco")) {
				jButtonCopiarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDepositoBanco")) {
				jButtonVerFormDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDepositoBanco")) {
				jButtonGuardarCambiosDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDepositoBanco")) {
				jButtonCopiarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDepositoBanco")) {
				jButtonVerFormDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDepositoBanco")) {
				jButtonGuardarCambiosDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDepositoBanco")) {
				jButtonGuardarCambiosDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDepositoBanco")) {
				jButtonGuardarCambiosDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDepositoBanco")) {
				jButtonRecargarInformacionDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDepositoBanco")) {
				jButtonRecargarInformacionDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDepositoBanco")) {
				jButtonRecargarInformacionDepositoBancoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDepositoBanco")) {
				jButtonAnterioresDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDepositoBanco")) {
				jButtonAnterioresDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDepositoBanco")) {
				jButtonAnterioresDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDepositoBanco")) {
				jButtonSiguientesDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDepositoBanco")) {
				jButtonSiguientesDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDepositoBanco")) {
				jButtonSiguientesDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDepositoBanco") || sTipo.equals("MenuItemDetalleAbrirOrderByDepositoBanco")) {
				jButtonAbrirOrderByDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDepositoBanco") || sTipo.equals("MenuItemDetalleMostrarOcultarDepositoBanco")) {
				jButtonMostrarOcultarDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDepositoBanco")) {
				jButtonNuevoGuardarCambiosDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDepositoBanco")) {
				jButtonNuevoGuardarCambiosDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDepositoBanco")) {
				jButtonNuevoGuardarCambiosDepositoBancoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDepositoBanco")) {
				jButtonCerrarReporteDinamicoDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDepositoBanco")) {
				jButtonGenerarReporteDinamicoDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDepositoBanco")) {
				
				jButtonGenerarExcelReporteDinamicoDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDepositoBanco")) {
				jButtonCerrarImportacionDepositoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDepositoBanco")) {
				
				jButtonGenerarImportacionDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDepositoBanco")) {
				
				jButtonAbrirImportacionDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDepositoBanco")) {
				jComboBoxTiposAccionesDepositoBancoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDepositoBanco")) {
				jComboBoxTiposRelacionesDepositoBancoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDepositoBanco")) {
				jComboBoxTiposAccionesDepositoBancoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDepositoBanco")) {
				
				jComboBoxTiposSeleccionarDepositoBancoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDepositoBanco")) {
				jTextFieldValorCampoGeneralDepositoBancoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDepositoBanco")) {
				jButtonAbrirOrderByDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDepositoBanco")) {
				jButtonAbrirOrderByDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDepositoBanco")) {
				jButtonCerrarOrderByDepositoBancoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDepositoBancoBusqueda")) {
				this.jButtonidDepositoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDepositoBancoUpdate")) {
				this.jButtonid_empresaDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDepositoBancoBusqueda")) {
				this.jButtonid_empresaDepositoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDepositoBancoUpdate")) {
				this.jButtonid_sucursalDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDepositoBancoBusqueda")) {
				this.jButtonid_sucursalDepositoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDepositoBancoUpdate")) {
				this.jButtonid_usuarioDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDepositoBancoBusqueda")) {
				this.jButtonid_usuarioDepositoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoDepositoBancoUpdate")) {
				this.jButtonid_bancoDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoDepositoBancoBusqueda")) {
				this.jButtonid_bancoDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableDepositoBanco")) {
				this.jButtonid_asiento_contableDepositoBancoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDepositoBancoUpdate")) {
				this.jButtonid_asiento_contableDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDepositoBancoBusqueda")) {
				this.jButtonid_asiento_contableDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDepositoBancoBusqueda")) {
				this.jButtonfechaDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_efectivoDepositoBancoBusqueda")) {
				this.jButtonvalor_efectivoDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_chequeDepositoBancoBusqueda")) {
				this.jButtonvalor_chequeDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDepositoBancoBusqueda")) {
				this.jButtondescripcionDepositoBancoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_asiento_contableDepositoBanco")) {
				this.jButtonid_asiento_contableDepositoBancoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAsientoContableDepositoBanco")) {
				this.jButtonFK_IdAsientoContableDepositoBancoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBancoDepositoBanco")) {
				this.jButtonFK_IdBancoDepositoBancoActionPerformed(evt);
			}
			
			;
			
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDepositoBanco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepositoBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				


				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DepositoBanco depositobancoLocal=null;
			
			if(!this.getEsControlTabla()) {
				depositobancoLocal=this.depositobanco;
			} else {
				depositobancoLocal=this.depositobancoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
							
				
				


				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepositoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
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
			
			


			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepositoBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
								
						
				


				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
								
				
				


				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepositoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepositoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepositoBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
							
				
				


				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepositoBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobancoAnterior =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.depositobancoAnterior =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
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
			
			


			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepositoBancoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
								
				
				


				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepositoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepositoBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepositoBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDepositoBanco")) {
					jCheckBoxSeleccionarTodosDepositoBancoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDepositoBanco")) {
					jCheckBoxSeleccionadosDepositoBancoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDepositoBanco")) {
					
				}
				
				


				
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
												
				
				


				
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepositoBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depositobancoAnterior =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.depositobancoAnterior =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepositoBancoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
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
			
			


			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepositoBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depositobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depositobanco);
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
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
				
				


				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepositoBanco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepositoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepositoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depositobancoAnterior =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDepositoBanco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDepositoBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDepositoBanco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.depositobanco =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.depositobanco =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.depositobanco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDepositoBanco")) {
				
				}
				
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDepositoBanco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDepositoBanco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDepositoBanco")) {
			
			}
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDepositoBanco();
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
			if(sTipo.equals("NuevoDepositoBanco")) {
				jButtonNuevoDepositoBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDepositoBanco")) {
				jButtonDuplicarDepositoBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDepositoBanco")) {
				jButtonCopiarDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDepositoBanco")) {
				jButtonVerFormDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDepositoBanco")) {
				jButtonNuevoDepositoBancoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDepositoBanco")) {
				jButtonModificarDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDepositoBanco")) {
				jButtonActualizarDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDepositoBanco")) {
				jButtonEliminarDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDepositoBanco")) {
				jButtonGuardarCambiosDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDepositoBanco")) {
				jButtonCancelarDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDepositoBanco")) {
				jButtonCerrarDepositoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDepositoBanco")) {
				jButtonGuardarCambiosDepositoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDepositoBanco")) {
				jButtonNuevoGuardarCambiosDepositoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDepositoBanco")) {
				jButtonAbrirOrderByDepositoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDepositoBanco")) {
				jButtonRecargarInformacionDepositoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDepositoBanco")) {
				jButtonAnterioresDepositoBancoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDepositoBanco")) {
				jButtonSiguientesDepositoBancoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDepositoBancoBusqueda")) {
				this.jButtonidDepositoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDepositoBancoUpdate")) {
				this.jButtonid_empresaDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDepositoBancoBusqueda")) {
				this.jButtonid_empresaDepositoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDepositoBancoUpdate")) {
				this.jButtonid_sucursalDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDepositoBancoBusqueda")) {
				this.jButtonid_sucursalDepositoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDepositoBancoUpdate")) {
				this.jButtonid_usuarioDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDepositoBancoBusqueda")) {
				this.jButtonid_usuarioDepositoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoDepositoBancoUpdate")) {
				this.jButtonid_bancoDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoDepositoBancoBusqueda")) {
				this.jButtonid_bancoDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableDepositoBanco")) {
				this.jButtonid_asiento_contableDepositoBancoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDepositoBancoUpdate")) {
				this.jButtonid_asiento_contableDepositoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDepositoBancoBusqueda")) {
				this.jButtonid_asiento_contableDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDepositoBancoBusqueda")) {
				this.jButtonfechaDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_efectivoDepositoBancoBusqueda")) {
				this.jButtonvalor_efectivoDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_chequeDepositoBancoBusqueda")) {
				this.jButtonvalor_chequeDepositoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDepositoBancoBusqueda")) {
				this.jButtondescripcionDepositoBancoBusquedaActionPerformed(evt);
			}
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDepositoBanco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDepositoBanco")) {
				closingInternalFrameDepositoBanco();
				
			} else if(sTipo.equals("jButtonCancelarDepositoBanco")) {
				JInternalFrameBase jInternalFrameDetalleFormDepositoBanco = (JInternalFrameBase)evt.getSource();
	            	
	            DepositoBancoBeanSwingJInternalFrame jInternalFrameParent=(DepositoBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormDepositoBanco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDepositoBancoActionPerformed(null);
			}
			
			DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.depositobanco,new Object(),this.depositobancoParameterGeneral,this.depositobancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDepositoBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDepositoBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDepositoBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.depositobanco)) {
			if(!esControlTabla) {
				if(DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);			
				}
				
				if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDepositoBanco(this.depositobanco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.depositobancoReturnGeneral=depositobancoLogic.procesarEventosDepositoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depositobancoLogic.getDepositoBancos(),this.depositobanco,this.depositobancoParameterGeneral,this.isEsNuevoDepositoBanco,classes);//this.depositobancoLogic.getDepositoBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDepositoBanco(this.depositobancoReturnGeneral,this.depositobancoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDepositoBanco(classes,this.depositobancoReturnGeneral,this.depositobancoBean,false);
					}
						
					if(this.depositobancoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDepositoBanco(this.depositobancoReturnGeneral.getDepositoBanco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDepositoBanco(this.depositobancoReturnGeneral.getDepositoBanco());	
					}
						
					if(this.depositobancoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDepositoBanco(this.depositobancoReturnGeneral.getDepositoBanco(),classes);//this.depositobancoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDepositoBanco(this.depositobanco,classes);//this.depositobancoBean);									
				}
			
				if(DepositoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDepositoBanco(this.depositobanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDepositoBanco(this.depositobanco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.depositobancoAnterior!=null) {
						this.depositobanco=this.depositobancoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.depositobancoReturnGeneral=depositobancoLogic.procesarEventosDepositoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depositobancoLogic.getDepositoBancos(),this.depositobanco,this.depositobancoParameterGeneral,this.isEsNuevoDepositoBanco,classes);//this.depositobancoLogic.getDepositoBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.depositobancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.depositobancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.depositobancoReturnGeneral.getDepositoBanco(),depositobancoLogic.getDepositoBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.depositobancoReturnGeneral.getDepositoBanco(),this.depositobancos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDepositoBanco.repaint();
				
				//((AbstractTableModel) this.jTableDatosDepositoBanco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDepositoBanco();
			}
		}
	}
	
	public void actualizarVisualTableDatosDepositoBanco() throws Exception {
		
		DepositoBancoModel depositobancoModel=(DepositoBancoModel)this.jTableDatosDepositoBanco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			depositobancoModel.depositobancos=this.depositobancoLogic.getDepositoBancos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			depositobancoModel.depositobancos=this.depositobancos;
		}
		
		
		((DepositoBancoModel) this.jTableDatosDepositoBanco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDepositoBanco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdepositobancoAnterior(),this.depositobancoLogic.getDepositoBancos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdepositobancoAnterior(),this.depositobancos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDepositoBanco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDepositoBanco(DepositoBanco depositobanco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
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
										
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depositobanco,new Object(),generalEntityParameterGeneral,this.depositobancoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.depositobancoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DepositoBancoConstantesFunciones.getClassesRelationshipsOfDepositoBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DepositoBancoConstantesFunciones.getClassesRelationshipsFromStringsOfDepositoBanco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDepositoBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DepositoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depositobanco,new Object(),generalEntityParameterGeneral,this.depositobancoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDepositoBanco(DepositoBancoBean depositobancoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDepositoBanco(ArrayList<Classe> classes,DepositoBancoReturnGeneral depositobancoReturnGeneral,DepositoBancoBean depositobancoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDepositoBanco(DepositoBanco depositobanco,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.depositobanco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDepositoBanco = new DepositoBancoDetalleFormJInternalFrame(jDesktopPane,this.depositobancoSessionBean.getConGuardarRelaciones(),this.depositobancoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.setVisible(false);
		this.jInternalFrameDetalleFormDepositoBanco.setSelected(false);						
		
		this.jInternalFrameDetalleFormDepositoBanco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDepositoBanco.depositobancoLogic=this.depositobancoLogic;
		
		this.cargarCombosFrameForeignKeyDepositoBanco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDepositoBanco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDepositoBanco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDepositoBanco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDepositoBanco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDepositoBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDepositoBanco"));
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonModificarDepositoBanco.addActionListener(new ButtonActionListener(this,"ModificarDepositoBanco"));

		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonModificarToolBarDepositoBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarDepositoBanco"));
					
		this.jInternalFrameDetalleFormDepositoBanco.jMenuItemModificarDepositoBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarDepositoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarDepositoBanco.addActionListener (new ButtonActionListener(this,"ActualizarDepositoBanco"));
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarToolBarDepositoBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDepositoBanco"));
						
		this.jInternalFrameDetalleFormDepositoBanco.jMenuItemActualizarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDepositoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarDepositoBanco.addActionListener (new ButtonActionListener(this,"EliminarDepositoBanco"));
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarDepositoBanco"));
								
		this.jInternalFrameDetalleFormDepositoBanco.jMenuItemEliminarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDepositoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarDepositoBanco.addActionListener (new ButtonActionListener(this,"CancelarDepositoBanco"));
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarDepositoBanco"));
					
		this.jInternalFrameDetalleFormDepositoBanco.jMenuItemCancelarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDepositoBanco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jMenuItemDetalleCerrarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDepositoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDepositoBanco"));
		
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDepositoBanco"));
		
		
		
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDepositoBanco"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonidDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"idDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_empresaDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_empresaDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_sucursalDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_sucursalDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_usuarioDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_usuarioDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_bancoDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_bancoDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_bancoDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoDepositoBancoBusqueda"));
		//jButtonid_asiento_contableDepositoBanco.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDepositoBancoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBanco.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBanco"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonfechaDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonvalor_efectivoDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"valor_efectivoDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonvalor_chequeDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"valor_chequeDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtondescripcionDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDepositoBancoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDepositoBanco.jTabbedPaneRelacionesDepositoBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDepositoBanco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDepositoBanco"));
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDepositoBanco"));
		}
		
		this.jTableDatosDepositoBanco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDepositoBanco"));
		
		this.jTableDatosDepositoBanco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDepositoBanco"));
		
		this.jButtonNuevoDepositoBanco.addActionListener(new ButtonActionListener(this,"NuevoDepositoBanco"));
		
		this.jButtonDuplicarDepositoBanco.addActionListener(new ButtonActionListener(this,"DuplicarDepositoBanco"));
		
		this.jButtonCopiarDepositoBanco.addActionListener(new ButtonActionListener(this,"CopiarDepositoBanco"));
		
		this.jButtonVerFormDepositoBanco.addActionListener(new ButtonActionListener(this,"VerFormDepositoBanco"));
		
		
		this.jButtonNuevoToolBarDepositoBanco.addActionListener(new ButtonActionListener(this,"NuevoToolBarDepositoBanco"));
			
		this.jButtonDuplicarToolBarDepositoBanco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDepositoBanco"));
			
		this.jMenuItemNuevoDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDepositoBanco"));
			
		this.jMenuItemDuplicarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDepositoBanco"));		
		
		
		this.jButtonNuevoRelacionesDepositoBanco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDepositoBanco"));
		
		
		this.jButtonNuevoRelacionesToolBarDepositoBanco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDepositoBanco"));
			
		this.jMenuItemNuevoRelacionesDepositoBanco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDepositoBanco"));		
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonModificarDepositoBanco.addActionListener(new ButtonActionListener(this,"ModificarDepositoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonModificarToolBarDepositoBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarDepositoBanco"));
			
			this.jInternalFrameDetalleFormDepositoBanco.jMenuItemModificarDepositoBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarDepositoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarDepositoBanco.addActionListener (new ButtonActionListener(this,"ActualizarDepositoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonActualizarToolBarDepositoBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDepositoBanco"));
				
			this.jInternalFrameDetalleFormDepositoBanco.jMenuItemActualizarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDepositoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarDepositoBanco.addActionListener (new ButtonActionListener(this,"EliminarDepositoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonEliminarToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarDepositoBanco"));
						
			this.jInternalFrameDetalleFormDepositoBanco.jMenuItemEliminarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDepositoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarDepositoBanco.addActionListener (new ButtonActionListener(this,"CancelarDepositoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonCancelarToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarDepositoBanco"));
			
			this.jInternalFrameDetalleFormDepositoBanco.jMenuItemCancelarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDepositoBanco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDepositoBanco"));		
		
		
		this.jButtonCerrarDepositoBanco.addActionListener (new ButtonActionListener(this,"CerrarDepositoBanco"));
		
		
		this.jButtonCerrarToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"CerrarToolBarDepositoBanco"));
			
		this.jMenuItemCerrarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDepositoBanco"));
			
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jMenuItemDetalleCerrarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDepositoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosDepositoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosDepositoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDepositoBanco"));
		}
		
		this.jButtonCopiarToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"CopiarToolBarDepositoBanco"));
			
		this.jButtonVerFormToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"VerFormToolBarDepositoBanco"));
		
		this.jMenuItemGuardarCambiosDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDepositoBanco"));
			
		this.jMenuItemCopiarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDepositoBanco"));		
		
		this.jMenuItemVerFormDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDepositoBanco"));		
		
		
		this.jButtonGuardarCambiosTablaDepositoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDepositoBanco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDepositoBanco"));
			
		this.jMenuItemGuardarCambiosTablaDepositoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDepositoBanco"));		
		
		
		
		this.jButtonRecargarInformacionDepositoBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionDepositoBanco"));
					
		this.jButtonRecargarInformacionToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDepositoBanco"));
		
		this.jMenuItemRecargarInformacionDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDepositoBanco"));		
		
		
		
		this.jButtonAnterioresDepositoBanco.addActionListener (new ButtonActionListener(this,"AnterioresDepositoBanco"));
		
		
		this.jButtonAnterioresToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDepositoBanco"));
		
		this.jMenuItemAnterioresDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDepositoBanco"));		
		
		
		this.jButtonSiguientesDepositoBanco.addActionListener (new ButtonActionListener(this,"SiguientesDepositoBanco"));
		
		
		this.jButtonSiguientesToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDepositoBanco"));
			
		this.jMenuItemSiguientesDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDepositoBanco"));
			
		this.jMenuItemAbrirOrderByDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDepositoBanco"));
			
		this.jMenuItemMostrarOcultarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDepositoBanco"));
			
		this.jMenuItemDetalleAbrirOrderByDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDepositoBanco"));
			
		this.jMenuItemDetalleMostarOcultarDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDepositoBanco"));		
		
		
		this.jButtonNuevoGuardarCambiosDepositoBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDepositoBanco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDepositoBanco"));
			
		this.jMenuItemNuevoGuardarCambiosDepositoBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDepositoBanco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDepositoBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDepositoBanco"));

		this.jCheckBoxSeleccionadosDepositoBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDepositoBanco"));
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDepositoBanco"));
		}
		
		
		this.jComboBoxTiposRelacionesDepositoBanco.addActionListener (new ButtonActionListener(this,"TiposRelacionesDepositoBanco"));
			
		this.jComboBoxTiposAccionesDepositoBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesDepositoBanco"));
					
		this.jComboBoxTiposSeleccionarDepositoBanco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDepositoBanco"));
			
		this.jTextFieldValorCampoGeneralDepositoBanco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDepositoBanco"));		
		
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonidDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"idDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_empresaDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_empresaDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_sucursalDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_sucursalDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_usuarioDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_usuarioDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_bancoDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_bancoDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_bancoDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoDepositoBancoBusqueda"));
		//jButtonid_asiento_contableDepositoBanco.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDepositoBancoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBanco.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBanco"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonfechaDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonvalor_efectivoDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"valor_efectivoDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonvalor_chequeDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"valor_chequeDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtondescripcionDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDepositoBancoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAsientoContableDepositoBanco.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableDepositoBanco"));

			this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBanco"));

			this.jButtonFK_IdBancoDepositoBanco.addActionListener(new ButtonActionListener(this,"FK_IdBancoDepositoBanco"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDepositoBanco!=null) {
				this.jInternalFrameReporteDinamicoDepositoBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDepositoBanco"));
				this.jInternalFrameReporteDinamicoDepositoBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDepositoBanco"));
				this.jInternalFrameReporteDinamicoDepositoBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDepositoBanco"));
			}
			
			//this.jButtonCerrarReporteDinamicoDepositoBanco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDepositoBanco"));				
			//this.jButtonGenerarReporteDinamicoDepositoBanco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDepositoBanco"));
			//this.jButtonGenerarExcelReporteDinamicoDepositoBanco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDepositoBanco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDepositoBanco!=null) {
				this.jInternalFrameImportacionDepositoBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDepositoBanco"));
				this.jInternalFrameImportacionDepositoBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDepositoBanco"));
				this.jInternalFrameImportacionDepositoBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDepositoBanco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDepositoBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByDepositoBanco"));
			
			this.jButtonAbrirOrderByToolBarDepositoBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDepositoBanco"));			
			
			if(this.jInternalFrameOrderByDepositoBanco!=null) {
				this.jInternalFrameOrderByDepositoBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDepositoBanco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepositoBanco.jTabbedPaneRelacionesDepositoBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDepositoBanco"));
		
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
            		closingInternalFrameDepositoBanco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDepositoBanco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDepositoBanco = (JInternalFrameBase)event.getSource();
	            	
	            DepositoBancoBeanSwingJInternalFrame jInternalFrameParent=(DepositoBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormDepositoBanco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDepositoBancoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDepositoBanco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDepositoBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDepositoBanco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDepositoBanco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepositoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepositoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepositoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDepositoBanco";
		inputMap = this.jButtonNuevoDepositoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDepositoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDepositoBancoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepositoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepositoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepositoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDepositoBanco";
		inputMap = this.jButtonNuevoRelacionesDepositoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDepositoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDepositoBancoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDepositoBanco";
		inputMap = this.jButtonModificarDepositoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDepositoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDepositoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDepositoBanco";
		inputMap = this.jButtonActualizarDepositoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDepositoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDepositoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDepositoBanco";
		inputMap = this.jButtonEliminarDepositoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDepositoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDepositoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDepositoBanco";
		inputMap = this.jButtonCancelarDepositoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDepositoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDepositoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDepositoBanco";
		inputMap = this.jButtonCerrarDepositoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDepositoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDepositoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDepositoBanco";
		inputMap = this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosDepositoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDepositoBanco.jButtonGuardarCambiosDepositoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDepositoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDepositoBanco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDepositoBancoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDepositoBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDepositoBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDepositoBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDepositoBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDepositoBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDepositoBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonidDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"idDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_empresaDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_empresaDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_sucursalDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_sucursalDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_usuarioDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_usuarioDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDepositoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_bancoDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_bancoDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_bancoDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoDepositoBancoBusqueda"));
		//jButtonid_asiento_contableDepositoBanco.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDepositoBancoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBanco.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBanco"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonfechaDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonvalor_efectivoDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"valor_efectivoDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtonvalor_chequeDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"valor_chequeDepositoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepositoBanco.jButtondescripcionDepositoBancoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDepositoBancoBusqueda"));
		
		
		this.jButtonFK_IdAsientoContableDepositoBanco.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableDepositoBanco"));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco.addActionListener(new ButtonActionListener(this,"id_asiento_contableDepositoBanco"));

		this.jButtonFK_IdBancoDepositoBanco.addActionListener(new ButtonActionListener(this,"FK_IdBancoDepositoBanco"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDepositoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDepositoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDepositoBancoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDepositoBanco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDepositoBanco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DepositoBanco depositobancoAux:this.depositobancoLogic.getDepositoBancos()) {
					depositobancoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DepositoBanco depositobancoAux:depositobancos) {
					depositobancoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDepositoBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDepositoBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DepositoBanco depositobancoAux:this.depositobancoLogic.getDepositoBancos()) {
						depositobancoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DepositoBanco depositobancoAux:depositobancos) {
						depositobancoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DepositoBanco depositobancoAux:this.depositobancoLogic.getDepositoBancos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DepositoBanco depositobancoAux:depositobancos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDepositoBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDepositoBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDepositoBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDepositoBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDepositoBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDepositoBanco.getSelectedRows();
			
			DepositoBanco depositobancoLocal=new DepositoBanco();
			
			//this.seleccionarTodosDepositoBanco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depositobancoLocal =(DepositoBanco) this.depositobancoLogic.getDepositoBancos().toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					depositobancoLocal =(DepositoBanco) this.depositobancos.toArray()[this.jTableDatosDepositoBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				depositobancoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DepositoBanco depositobancoAux:this.depositobancoLogic.getDepositoBancos()) {
						depositobancoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DepositoBanco depositobancoAux:depositobancos) {
						depositobancoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDepositoBanco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDepositoBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDepositoBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDepositoBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDepositoBancoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDepositoBancoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDepositoBancoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDepositoBanco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDepositoBanco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DepositoBanco depositobancoAux:this.depositobancoLogic.getDepositoBancos()) {
				
						if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							depositobancoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO)) {
							existe=true;
							depositobancoAux.setvalor_efectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE)) {
							existe=true;
							depositobancoAux.setvalor_cheque(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							depositobancoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DepositoBanco depositobancoAux:depositobancos) {
					
						if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							depositobancoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO)) {
							existe=true;
							depositobancoAux.setvalor_efectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE)) {
							existe=true;
							depositobancoAux.setvalor_cheque(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							depositobancoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDepositoBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDepositoBancoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDepositoBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDepositoBanco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDepositoBanco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDepositoBanco) {				
					conSplash=true;//false;										
					
					//this.startProcessDepositoBanco(conSplash);
				
					this.generarReporteDepositoBancosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDepositoBancosSeleccionados();
				//this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDepositoBancosSeleccionados(false);
				//this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDepositoBancosSeleccionados(true);
				//this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDepositoBanco();
				
				this.exportarDepositoBancosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDepositoBancos();
				//this.importarDepositoBancos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDepositoBanco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDepositoBancosSeleccionados();
				//this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Deposito Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDepositoBanco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDepositoBanco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDepositoBanco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.setSelectedIndex(0);					
				}	
			} 			
			else if(DepositoBancoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDepositoBanco) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDepositoBanco(conSplash);
					
						//this.actualizarParametrosGeneralDepositoBanco();
						
						this.generarReporteProcesoAccionDepositoBancosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DepositoBancoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Deposito BancoS SELECCIONADOS?", "MANTENIMIENTO DE Deposito Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDepositoBanco();
				
						this.actualizarParametrosGeneralDepositoBanco();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.depositobancoReturnGeneral=depositobancoLogic.procesarAccionDepositoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.depositobancoLogic.getDepositoBancos(),this.depositobancoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDepositoBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDepositoBanco();
					
					DepositoBancoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDepositoBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDepositoBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDepositoBanco.jComboBoxTiposAccionesFormularioDepositoBanco.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDepositoBanco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDepositoBancoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDepositoBanco();
			
			if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();		
			DepositoBanco depositobanco=new DepositoBanco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDepositoBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDepositoBanco.getSelectedItem();
			
			
			
			
			depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
			//this.sTipoAccion;
			
			if(depositobancosSeleccionados.size()==1) {
				for(DepositoBanco depositobancoAux:depositobancosSeleccionados) {
					depositobanco=depositobancoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDepositoBanco();
			
      		//this.finishProcessDepositoBanco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDepositoBancoReturnGeneral() throws Exception {
		if(this.depositobancoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.depositobancoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.depositobancoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.depositobancoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.depositobancoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.depositobancoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDepositoBanco(false);
		}
		
		if(this.depositobancoReturnGeneral.getConRetornoLista() || this.depositobancoReturnGeneral.getConRetornoObjeto()) {
			if(this.depositobancoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.depositobancoLogic.setDepositoBancos(this.depositobancoReturnGeneral.getDepositoBancos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.depositobancoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.depositobancoLogic.setDepositoBanco(this.depositobancoReturnGeneral.getDepositoBanco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDepositoBanco(false);
		}
	}
	
	public void actualizarParametrosGeneralDepositoBanco() throws Exception {
		
		
	}
	
	public ArrayList<DepositoBanco> getDepositoBancosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDepositoBanco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DepositoBanco depositobancoAux:depositobancoLogic.getDepositoBancos()) {
					if(depositobancoAux.getIsSelected()) {
						depositobancosSeleccionados.add(depositobancoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DepositoBanco depositobancoAux:this.depositobancos) {
					if(depositobancoAux.getIsSelected()) {
						depositobancosSeleccionados.add(depositobancoAux);				
					}
				}
			}
			
			if(depositobancosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						depositobancosSeleccionados.addAll(this.depositobancoLogic.getDepositoBancos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						depositobancosSeleccionados.addAll(this.depositobancos);				
					}
				}
			}
		} else {
			depositobancosSeleccionados.add(this.depositobanco);
		}
		
		return depositobancosSeleccionados;
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
	
	public void generarReporteDepositoBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDepositoBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDepositoBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDepositoBancosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDepositoBancosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Deposito Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDepositoBancosSeleccionados() throws Exception {
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();		
		
		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDepositoBancos("Todos",depositobancosSeleccionados);
		
	}	
	
	public void generarReporteNormalDepositoBancosSeleccionados() throws Exception {
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();		
		
		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDepositoBancos("Todos",depositobancosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDepositoBancosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();
		
		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDepositoBancos("Todos",depositobancosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDepositoBancosSeleccionados() throws Exception {
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDepositoBanco();
		
		
		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDepositoBanco();
		
		
		//this.generarReporteDepositoBancos("Todos",depositobancosSeleccionados ,depositobancoImplementable,depositobancoImplementableHome);
	}
	
	public void mostrarImportacionDepositoBancos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDepositoBanco();
		
		this.abrirFrameImportacionDepositoBanco();		
		
			
		//this.generarReporteDepositoBancos("Todos",depositobancosSeleccionados ,depositobancoImplementable,depositobancoImplementableHome);
	}
	
	public void importarDepositoBancos() throws Exception {		
	
	}
	
	public void exportarDepositoBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDepositoBancosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDepositoBancosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDepositoBancosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Deposito Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDepositoBancosSeleccionados() throws Exception {
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();		
		
		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depositobanco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDepositoBanco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DepositoBanco depositobancoAux:depositobancosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDepositoBanco(depositobancoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//depositobancoAux.setsDetalleGeneralEntityReporte(depositobancoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDepositoBanco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_IDBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepositoBancoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDepositoBanco(DepositoBanco depositobanco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=depositobanco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getbanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getasientocontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getvalor_efectivo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getvalor_cheque().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depositobanco.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDepositoBancosSeleccionados() throws Exception {
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();		
		
		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depositobanco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DepositoBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDepositoBanco(row);				
				iRow++;
			}				
			
			for(DepositoBanco depositobancoAux:depositobancosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDepositoBanco(depositobancoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDepositoBancosSeleccionados() throws Exception {
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();		
		
		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depositobanco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("depositobancos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("depositobanco");
			//elementRoot.appendChild(element);
		
			for(DepositoBanco depositobancoAux:depositobancosSeleccionados) {
				element = document.createElement("depositobanco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDepositoBanco(depositobancoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deposito Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDepositoBanco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(DepositoBancoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDepositoBanco(DepositoBanco depositobanco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getbanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getasientocontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getvalor_efectivo());
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getvalor_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(depositobanco.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDepositoBanco(DepositoBanco depositobanco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DepositoBancoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(depositobanco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DepositoBancoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(depositobanco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DepositoBancoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(depositobanco.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DepositoBancoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(depositobanco.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(DepositoBancoConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(depositobanco.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementbanco_descripcion = document.createElement(DepositoBancoConstantesFunciones.IDBANCO);
		elementbanco_descripcion.appendChild(document.createTextNode(depositobanco.getbanco_descripcion()));
		element.appendChild(elementbanco_descripcion);

		Element elementasientocontable_descripcion = document.createElement(DepositoBancoConstantesFunciones.IDASIENTOCONTABLE);
		elementasientocontable_descripcion.appendChild(document.createTextNode(depositobanco.getasientocontable_descripcion()));
		element.appendChild(elementasientocontable_descripcion);

		Element elementfecha = document.createElement(DepositoBancoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(depositobanco.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor_efectivo = document.createElement(DepositoBancoConstantesFunciones.VALOREFECTIVO);
		elementvalor_efectivo.appendChild(document.createTextNode(depositobanco.getvalor_efectivo().toString().trim()));
		element.appendChild(elementvalor_efectivo);

		Element elementvalor_cheque = document.createElement(DepositoBancoConstantesFunciones.VALORCHEQUE);
		elementvalor_cheque.appendChild(document.createTextNode(depositobanco.getvalor_cheque().toString().trim()));
		element.appendChild(elementvalor_cheque);

		Element elementdescripcion = document.createElement(DepositoBancoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(depositobanco.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDepositoBancosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DepositoBanco> depositobancosSeleccionados=new ArrayList<DepositoBanco>();
		
		depositobancosSeleccionados=this.getDepositoBancosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDepositoBanco(depositobancosSeleccionados);
		
		this.generarReporteDepositoBancos("Todos",depositobancosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDepositoBanco(ArrayList<DepositoBanco> depositobancosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DepositoBanco depositobancoAux:depositobancosSeleccionados) {
				depositobancoAux.setsDetalleGeneralEntityReporte(depositobancoAux.toString());
			
				if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					depositobancoAux.setsDescripcionGeneralEntityReporte1(depositobancoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					depositobancoAux.setsDescripcionGeneralEntityReporte1(depositobancoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					depositobancoAux.setsDescripcionGeneralEntityReporte1(depositobancoAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_IDBANCO)) {
					existe=true;
					depositobancoAux.setsDescripcionGeneralEntityReporte1(depositobancoAux.getbanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE)) {
					existe=true;
					depositobancoAux.setsDescripcionGeneralEntityReporte1(depositobancoAux.getasientocontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					depositobancoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(depositobancoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(DepositoBancoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					depositobancoAux.setsDescripcionGeneralEntityReporte1(depositobancoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepositoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDepositoBanco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDepositoBanco=true;
				this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=true;
				this.isVisibilidadCeldaGuardarCambiosDepositoBanco=true;
			}
			
			this.isVisibilidadCeldaModificarDepositoBanco=false;
			this.isVisibilidadCeldaActualizarDepositoBanco=false;
			this.isVisibilidadCeldaEliminarDepositoBanco=false;
			this.isVisibilidadCeldaCancelarDepositoBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepositoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDepositoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=false;
			this.isVisibilidadCeldaModificarDepositoBanco=false;
			this.isVisibilidadCeldaActualizarDepositoBanco=true;
			this.isVisibilidadCeldaEliminarDepositoBanco=false;
			this.isVisibilidadCeldaCancelarDepositoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepositoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDepositoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=false;
			this.isVisibilidadCeldaModificarDepositoBanco=false;
			this.isVisibilidadCeldaActualizarDepositoBanco=true;
			this.isVisibilidadCeldaEliminarDepositoBanco=true;
			this.isVisibilidadCeldaCancelarDepositoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepositoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDepositoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=false;
			this.isVisibilidadCeldaModificarDepositoBanco=false;
			this.isVisibilidadCeldaActualizarDepositoBanco=true;
			this.isVisibilidadCeldaEliminarDepositoBanco=false;
			this.isVisibilidadCeldaCancelarDepositoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDepositoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=true;
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=true;
			this.isVisibilidadCeldaModificarDepositoBanco=false;
			this.isVisibilidadCeldaActualizarDepositoBanco=false;
			this.isVisibilidadCeldaEliminarDepositoBanco=false;
			this.isVisibilidadCeldaCancelarDepositoBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepositoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDepositoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=false;
			this.isVisibilidadCeldaActualizarDepositoBanco=false;
			this.isVisibilidadCeldaEliminarDepositoBanco=false;
			this.isVisibilidadCeldaCancelarDepositoBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDepositoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=false;
			this.isVisibilidadCeldaModificarDepositoBanco=true;
			this.isVisibilidadCeldaActualizarDepositoBanco=false;
			this.isVisibilidadCeldaEliminarDepositoBanco=false;
			this.isVisibilidadCeldaCancelarDepositoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarDepositoBanco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DepositoBancoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDepositoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=true;
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=true;
		} else {
			this.actualizarEstadoPanelsDepositoBanco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDepositoBanco=false;
			//this.isVisibilidadCeldaVerFormDepositoBanco=false;
			this.isVisibilidadCeldaDuplicarDepositoBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!depositobancoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;
		} else {
			this.isVisibilidadCeldaNuevoDepositoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosDepositoBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(depositobancoSessionBean.getEsGuardarRelacionado()) {
			if(!depositobancoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;												
			}
			
			this.jButtonCerrarDepositoBanco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDepositoBanco=false;
		}
		
		if(!this.permiteMantenimiento(this.depositobanco)) {
			this.isVisibilidadCeldaActualizarDepositoBanco=false;
			this.isVisibilidadCeldaEliminarDepositoBanco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDepositoBanco() {
	}
	
	public void actualizarEstadoPanelsDepositoBanco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDepositoBanco!=null) {
				this.jScrollPanelDatosEdicionDepositoBanco.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepositoBanco!=null) {
				this.jTabbedPaneBusquedasDepositoBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepositoBanco!=null) {
				this.jScrollPanelDatosDepositoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepositoBanco!=null) {
				this.jPanelPaginacionDepositoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepositoBanco!=null) {
				this.jPanelParametrosReportesDepositoBanco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDepositoBanco!=null) {
				this.jScrollPanelDatosEdicionDepositoBanco.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepositoBanco!=null) {
				this.jTabbedPaneBusquedasDepositoBanco.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDepositoBanco!=null) {
				this.jScrollPanelDatosDepositoBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionDepositoBanco!=null) {
				this.jPanelPaginacionDepositoBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDepositoBanco!=null) {
				this.jPanelParametrosReportesDepositoBanco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDepositoBanco!=null) {
				this.jScrollPanelDatosEdicionDepositoBanco.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepositoBanco!=null) {
				this.jTabbedPaneBusquedasDepositoBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDepositoBanco!=null) {
				this.jScrollPanelDatosDepositoBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionDepositoBanco!=null) {
				this.jPanelPaginacionDepositoBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDepositoBanco!=null) {
				this.jPanelParametrosReportesDepositoBanco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDepositoBanco!=null) {
				this.jScrollPanelDatosEdicionDepositoBanco.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepositoBanco!=null) {
				this.jTabbedPaneBusquedasDepositoBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDepositoBanco!=null) {
				this.jScrollPanelDatosDepositoBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionDepositoBanco!=null) {
				this.jPanelPaginacionDepositoBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDepositoBanco!=null) {
				this.jPanelParametrosReportesDepositoBanco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDepositoBanco!=null) {
				this.jScrollPanelDatosEdicionDepositoBanco.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepositoBanco!=null) {
				this.jTabbedPaneBusquedasDepositoBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepositoBanco!=null) {
				this.jScrollPanelDatosDepositoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepositoBanco!=null) {
				this.jPanelPaginacionDepositoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepositoBanco!=null) {
				this.jPanelParametrosReportesDepositoBanco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDepositoBanco!=null) {
				this.jScrollPanelDatosEdicionDepositoBanco.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepositoBanco!=null) {
				this.jTabbedPaneBusquedasDepositoBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepositoBanco!=null) {
				this.jScrollPanelDatosDepositoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepositoBanco!=null) {
				this.jPanelPaginacionDepositoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepositoBanco!=null) {
				this.jPanelParametrosReportesDepositoBanco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDepositoBanco!=null) {
				this.jScrollPanelDatosEdicionDepositoBanco.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepositoBanco!=null) {
				this.jTabbedPaneBusquedasDepositoBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepositoBanco!=null) {
				this.jScrollPanelDatosDepositoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepositoBanco!=null) {
				this.jPanelPaginacionDepositoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepositoBanco!=null) {
				this.jPanelParametrosReportesDepositoBanco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDepositoBanco!=null) {
					this.jTabbedPaneBusquedasDepositoBanco.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDepositoBanco!=null) {
				this.jPanelParametrosReportesDepositoBanco.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepositoBanco!=null) {
				this.jTabbedPaneBusquedasDepositoBanco.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDepositoBanco!=null) {
				this.jPanelParametrosReportesDepositoBanco.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdAsientoContableDepositoBanco);}

			this.isVisibilidadFK_IdBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdBancoDepositoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAsientoContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdAsientoContableDepositoBanco);}

			this.isVisibilidadFK_IdBanco=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdBancoDepositoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdAsientoContable=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdAsientoContableDepositoBanco);}

			this.isVisibilidadFK_IdBanco=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdBancoDepositoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaBanco(Boolean isParaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBancoNegation=!isParaBanco;

			this.isVisibilidadFK_IdAsientoContable=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdAsientoContableDepositoBanco);}

			this.isVisibilidadFK_IdBanco=isParaBanco;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdBancoDepositoBanco);}
		}
		
	}

	public void setVisibilidadBusquedasParaAsientoContable(Boolean isParaAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAsientoContableNegation=!isParaAsientoContable;

			this.isVisibilidadFK_IdAsientoContable=isParaAsientoContable;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdAsientoContableDepositoBanco);}

			this.isVisibilidadFK_IdBanco=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasDepositoBanco.remove(jPanelFK_IdBancoDepositoBanco);}
		}
		
	}
	
	
	
	

	public String registrarSesionDepositoBancoParaBusquedaAsientoContables() throws Exception {
		Boolean isPaginaPopupAsientoContable=false;

		try {

			if(depositobancoSessionBean==null) {
				depositobancoSessionBean=new DepositoBancoSessionBean();
			}

			if(asientocontableSessionBean==null) {
				asientocontableSessionBean=new AsientoContableSessionBean();
			}

			asientocontableSessionBean.setsPathNavegacionActual(depositobancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
			asientocontableSessionBean.setisPermiteRecargarInformacion(false);
			asientocontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupAsientoContable=asientocontableSessionBean.getisPaginaPopup();
			asientocontableSessionBean.setisPaginaPopup(false);
			asientocontableSessionBean.setEstaModoBusqueda(true);
			asientocontableSessionBean.setsFuncionBusquedaRapida("window.opener.depositobancoFuncionGeneral.setCombosCodigoDesdeBusquedaid_asiento_contable(TO_REPLACE);");
			asientocontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable(true);
			asientocontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable(DepositoBancoConstantesFunciones.SNOMBREOPCION);
			//asientocontableSessionBean.setisBusquedaDesdeForeignKeySesionDepositoBanco(true);
			//asientocontableSessionBean.setlidDepositoBancoActual(this.idDepositoBancoActual);

			depositobancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDepositoBanco(true);
			depositobancoSessionBean.setlIdDepositoBancoActualForeignKey(this.idDepositoBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DepositoBancoSessionBean depositobancoSessionBean=new DepositoBancoSessionBean();
		
		if(this.depositobancoSessionBean==null) {
			this.depositobancoSessionBean=new DepositoBancoSessionBean();
		}
		
		this.depositobancoSessionBean.setsUltimaBusquedaDepositoBanco(this.getsAccionBusqueda());
		this.depositobancoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.depositobancoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
			depositobancoSessionBean.setid_asiento_contable(this.getid_asiento_contableFK_IdAsientoContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
			depositobancoSessionBean.setid_banco(this.getid_bancoFK_IdBanco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			depositobancoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			depositobancoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			depositobancoSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DepositoBancoSessionBean depositobancoSessionBean=new DepositoBancoSessionBean();
		
		if(this.depositobancoSessionBean==null) {
			this.depositobancoSessionBean=new DepositoBancoSessionBean();
		}
		
		if(this.depositobancoSessionBean.getsUltimaBusquedaDepositoBanco()!=null&&!this.depositobancoSessionBean.getsUltimaBusquedaDepositoBanco().equals("")) {
			this.setsAccionBusqueda(depositobancoSessionBean.getsUltimaBusquedaDepositoBanco());
			this.setiNumeroPaginacion(depositobancoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(depositobancoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
				this.setid_asiento_contableFK_IdAsientoContable(depositobancoSessionBean.getid_asiento_contable());
				depositobancoSessionBean.setid_asiento_contable(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
				this.setid_bancoFK_IdBanco(depositobancoSessionBean.getid_banco());
				depositobancoSessionBean.setid_banco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(depositobancoSessionBean.getid_empresa());
				depositobancoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(depositobancoSessionBean.getid_sucursal());
				depositobancoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(depositobancoSessionBean.getid_usuario());
				depositobancoSessionBean.setid_usuario(-1L);
			}
		}
		
		this.depositobancoSessionBean.setsUltimaBusquedaDepositoBanco("");
		this.depositobancoSessionBean.setiNumeroPaginacion(DepositoBancoConstantesFunciones.INUMEROPAGINACION);
		this.depositobancoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDepositoBanco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDepositoBanco() {
		this.updateBorderResaltarBusquedasFormularioDepositoBanco();
		this.updateVisibilidadBusquedasFormularioDepositoBanco();
		this.updateHabilitarBusquedasFormularioDepositoBanco();
	}
	
	public void updateBorderResaltarBusquedasFormularioDepositoBanco() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDepositoBanco.getComponents().length>0) {
	

		if(this.depositobancoConstantesFunciones.resaltarFK_IdAsientoContableDepositoBanco!=null) {
			index= this.jTabbedPaneBusquedasDepositoBanco.indexOfComponent(this.jPanelFK_IdAsientoContableDepositoBanco);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepositoBanco.getComponent(index);
				jPanel.setBorder(this.depositobancoConstantesFunciones.resaltarFK_IdAsientoContableDepositoBanco);
			}
		}

		if(this.depositobancoConstantesFunciones.resaltarFK_IdBancoDepositoBanco!=null) {
			index= this.jTabbedPaneBusquedasDepositoBanco.indexOfComponent(this.jPanelFK_IdBancoDepositoBanco);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepositoBanco.getComponent(index);
				jPanel.setBorder(this.depositobancoConstantesFunciones.resaltarFK_IdBancoDepositoBanco);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDepositoBanco() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDepositoBanco.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDepositoBanco.indexOfComponent(this.jPanelFK_IdAsientoContableDepositoBanco);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDepositoBanco.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.depositobancoConstantesFunciones.mostrarFK_IdAsientoContableDepositoBanco);
			if(!this.depositobancoConstantesFunciones.mostrarFK_IdAsientoContableDepositoBanco && index>-1) {
				this.jTabbedPaneBusquedasDepositoBanco.remove(index);
			}

			index= this.jTabbedPaneBusquedasDepositoBanco.indexOfComponent(this.jPanelFK_IdBancoDepositoBanco);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDepositoBanco.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.depositobancoConstantesFunciones.mostrarFK_IdBancoDepositoBanco);
			if(!this.depositobancoConstantesFunciones.mostrarFK_IdBancoDepositoBanco && index>-1) {
				this.jTabbedPaneBusquedasDepositoBanco.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDepositoBanco() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDepositoBanco.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDepositoBanco.indexOfComponent(this.jPanelFK_IdAsientoContableDepositoBanco);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDepositoBanco.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.depositobancoConstantesFunciones.activarFK_IdAsientoContableDepositoBanco);
				this.jTabbedPaneBusquedasDepositoBanco.setEnabledAt(index,this.depositobancoConstantesFunciones.activarFK_IdAsientoContableDepositoBanco);
			}

			index= this.jTabbedPaneBusquedasDepositoBanco.indexOfComponent(this.jPanelFK_IdBancoDepositoBanco);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDepositoBanco.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.depositobancoConstantesFunciones.activarFK_IdBancoDepositoBanco);
				this.jTabbedPaneBusquedasDepositoBanco.setEnabledAt(index,this.depositobancoConstantesFunciones.activarFK_IdBancoDepositoBanco);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDepositoBanco(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAsientoContable")) {
			index= this.jTabbedPaneBusquedasDepositoBanco.indexOfComponent(this.jPanelFK_IdAsientoContableDepositoBanco);

			this.jTabbedPaneBusquedasDepositoBanco.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepositoBanco.getComponent(index);

			this.depositobancoConstantesFunciones.setResaltarFK_IdAsientoContableDepositoBanco(resaltar);

			jPanel.setBorder(this.depositobancoConstantesFunciones.resaltarFK_IdAsientoContableDepositoBanco);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBanco")) {
			index= this.jTabbedPaneBusquedasDepositoBanco.indexOfComponent(this.jPanelFK_IdBancoDepositoBanco);

			this.jTabbedPaneBusquedasDepositoBanco.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepositoBanco.getComponent(index);

			this.depositobancoConstantesFunciones.setResaltarFK_IdBancoDepositoBanco(resaltar);

			jPanel.setBorder(this.depositobancoConstantesFunciones.resaltarFK_IdBancoDepositoBanco);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDepositoBanco.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDepositoBanco() throws Exception {

		if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDepositoBanco();
		this.updateVisibilidadResaltarControlesFormularioDepositoBanco();
		this.updateHabilitarResaltarControlesFormularioDepositoBanco();
		
	}
	
	public void updateBorderResaltarControlesFormularioDepositoBanco() throws Exception {
		if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.depositobancoConstantesFunciones.resaltaridDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltaridDepositoBanco);}
		if(this.depositobancoConstantesFunciones.resaltarid_empresaDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltarid_empresaDepositoBanco);}
		if(this.depositobancoConstantesFunciones.resaltarid_sucursalDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltarid_sucursalDepositoBanco);}
		if(this.depositobancoConstantesFunciones.resaltarid_usuarioDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltarid_usuarioDepositoBanco);}
		if(this.depositobancoConstantesFunciones.resaltarid_bancoDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltarid_bancoDepositoBanco);}
		if(this.depositobancoConstantesFunciones.resaltarid_asiento_contableDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltarid_asiento_contableDepositoBanco);}
		if(this.depositobancoConstantesFunciones.resaltarfechaDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jDateChooserfechaDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltarfechaDepositoBanco);}
		if(this.depositobancoConstantesFunciones.resaltarvalor_efectivoDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_efectivoDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltarvalor_efectivoDepositoBanco);}
		if(this.depositobancoConstantesFunciones.resaltarvalor_chequeDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_chequeDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltarvalor_chequeDepositoBanco);}
		if(this.depositobancoConstantesFunciones.resaltardescripcionDepositoBanco!=null && this.jInternalFrameDetalleFormDepositoBanco!=null) {this.jInternalFrameDetalleFormDepositoBanco.jTextAreadescripcionDepositoBanco.setBorder(this.depositobancoConstantesFunciones.resaltardescripcionDepositoBanco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDepositoBanco() throws Exception {		
		if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
	
		//this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostraridDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPanelidDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostraridDepositoBanco);
		//this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_empresaDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPanelid_empresaDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_empresaDepositoBanco);
		//this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_sucursalDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPanelid_sucursalDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_sucursalDepositoBanco);
		//this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_usuarioDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPanelid_usuarioDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_usuarioDepositoBanco);
		//this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_bancoDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPanelid_bancoDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_bancoDepositoBanco);
		//this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_asiento_contableDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPanelid_asiento_contableDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_asiento_contableDepositoBanco);
			this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarid_asiento_contableDepositoBanco);
		//this.jInternalFrameDetalleFormDepositoBanco.jDateChooserfechaDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarfechaDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPanelfechaDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarfechaDepositoBanco);
		//this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_efectivoDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarvalor_efectivoDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPanelvalor_efectivoDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarvalor_efectivoDepositoBanco);
		//this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_chequeDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarvalor_chequeDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPanelvalor_chequeDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrarvalor_chequeDepositoBanco);
		//this.jInternalFrameDetalleFormDepositoBanco.jTextAreadescripcionDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrardescripcionDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jPaneldescripcionDepositoBanco.setVisible(this.depositobancoConstantesFunciones.mostrardescripcionDepositoBanco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDepositoBanco() throws Exception {
		if(this.jInternalFrameDetalleFormDepositoBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDepositoBanco!=null) {
	
		this.jInternalFrameDetalleFormDepositoBanco.jLabelidDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activaridDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_empresaDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activarid_empresaDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_sucursalDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activarid_sucursalDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_usuarioDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activarid_usuarioDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_bancoDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activarid_bancoDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jComboBoxid_asiento_contableDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activarid_asiento_contableDepositoBanco);
			this.jInternalFrameDetalleFormDepositoBanco.jButtonid_asiento_contableDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activarid_asiento_contableDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jDateChooserfechaDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activarfechaDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_efectivoDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activarvalor_efectivoDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jTextFieldvalor_chequeDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activarvalor_chequeDepositoBanco);
		this.jInternalFrameDetalleFormDepositoBanco.jTextAreadescripcionDepositoBanco.setEnabled(this.depositobancoConstantesFunciones.activardescripcionDepositoBanco);
		}
	}
	
		
}