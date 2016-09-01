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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.ChequePostFechadoConstantesFunciones;
import com.bydan.erp.tesoreria.util.ChequePostFechadoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.ChequePostFechadoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.ChequePostFechadoBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ChequePostFechadoBeanSwingJInternalFrame extends ChequePostFechadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ChequePostFechadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ChequePostFechado> chequepostfechadoValidator = new ClassValidator<ChequePostFechado>(ChequePostFechado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ChequePostFechado chequepostfechado;	
	public ChequePostFechado chequepostfechadoAux;
	public ChequePostFechado chequepostfechadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ChequePostFechado chequepostfechadoTotales;
	public Long idChequePostFechadoActual;
	public Long iIdNuevoChequePostFechado=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
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
	
	public Boolean isPermisoTodoChequePostFechado;
	public Boolean isPermisoNuevoChequePostFechado;
	public Boolean isPermisoActualizarChequePostFechado;
	public Boolean isPermisoActualizarOriginalChequePostFechado;
	public Boolean isPermisoEliminarChequePostFechado;
	public Boolean isPermisoGuardarCambiosChequePostFechado;
	public Boolean isPermisoConsultaChequePostFechado;
	public Boolean isPermisoBusquedaChequePostFechado;
	public Boolean isPermisoReporteChequePostFechado;
	public Boolean isPermisoPaginacionMedioChequePostFechado;
	public Boolean isPermisoPaginacionAltoChequePostFechado;
	public Boolean isPermisoPaginacionTodoChequePostFechado;
	public Boolean isPermisoCopiarChequePostFechado;
	public Boolean isPermisoVerFormChequePostFechado;
	public Boolean isPermisoDuplicarChequePostFechado;
	public Boolean isPermisoOrdenChequePostFechado;
	
	
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
	
	public ChequePostFechadoParameterReturnGeneral chequepostfechadoReturnGeneral;
	public ChequePostFechadoParameterReturnGeneral chequepostfechadoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoChequePostFechado=false;
	public Boolean esParaAccionDesdeFormularioChequePostFechado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ChequePostFechadoSessionBeanAdditional chequepostfechadoSessionBeanAdditional=null;
	
	public ChequePostFechadoSessionBeanAdditional getChequePostFechadoSessionBeanAdditional() {
		return this.chequepostfechadoSessionBeanAdditional;
	}
	
	public void setChequePostFechadoSessionBeanAdditional(ChequePostFechadoSessionBeanAdditional chequepostfechadoSessionBeanAdditional) {
		try {
			this.chequepostfechadoSessionBeanAdditional=chequepostfechadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ChequePostFechadoBeanSwingJInternalFrameAdditional chequepostfechadoBeanSwingJInternalFrameAdditional=null;
	//public class ChequePostFechadoBeanSwingJInternalFrame
	
	public ChequePostFechadoBeanSwingJInternalFrameAdditional getChequePostFechadoBeanSwingJInternalFrameAdditional() {
		return this.chequepostfechadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setChequePostFechadoBeanSwingJInternalFrameAdditional(ChequePostFechadoBeanSwingJInternalFrameAdditional chequepostfechadoBeanSwingJInternalFrameAdditional) {
		try {
			this.chequepostfechadoBeanSwingJInternalFrameAdditional=chequepostfechadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ChequePostFechadoLogic chequepostfechadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ChequePostFechado chequepostfechadoBean;
	public ChequePostFechadoConstantesFunciones chequepostfechadoConstantesFunciones;
	//public ChequePostFechadoParameterReturnGeneral chequepostfechadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public AsientoContableLogic asientocontableLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public TipoFormaPagoLogic tipoformapagoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<ChequePostFechado> chequepostfechados;	
	//public List<ChequePostFechado> chequepostfechadosEliminados;
	//public List<ChequePostFechado> chequepostfechadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoChequePostFechado=false;
	public Boolean isVisibilidadCeldaDuplicarChequePostFechado=true;
	public Boolean isVisibilidadCeldaCopiarChequePostFechado=true;
	public Boolean isVisibilidadCeldaVerFormChequePostFechado=true;
	public Boolean isVisibilidadCeldaOrdenChequePostFechado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;
	public Boolean isVisibilidadCeldaModificarChequePostFechado=false;
	public Boolean isVisibilidadCeldaActualizarChequePostFechado=false;
	public Boolean isVisibilidadCeldaEliminarChequePostFechado=false;
	public Boolean isVisibilidadCeldaCancelarChequePostFechado=false;
	public Boolean isVisibilidadCeldaGuardarChequePostFechado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosChequePostFechado=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdAsientoContable=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoFormaPago=false;
	
	public Long getiIdNuevoChequePostFechado() {
		return this.iIdNuevoChequePostFechado;
	}

	public void setiIdNuevoChequePostFechado(Long iIdNuevoChequePostFechado) {
		this.iIdNuevoChequePostFechado = iIdNuevoChequePostFechado;
	}
	
	public Long getidChequePostFechadoActual() {
		return this.idChequePostFechadoActual;
	}

	public void setidChequePostFechadoActual(Long idChequePostFechadoActual) {
		this.idChequePostFechadoActual = idChequePostFechadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ChequePostFechado getchequepostfechado() {
		return this.chequepostfechado;
	}

	public void setchequepostfechado(ChequePostFechado chequepostfechado) {
		this.chequepostfechado = chequepostfechado;
	}
	
	public ChequePostFechado getchequepostfechadoAux() {
		return this.chequepostfechadoAux;
	}

	public void setchequepostfechadoAux(ChequePostFechado chequepostfechadoAux) {
		this.chequepostfechadoAux = chequepostfechadoAux;
	}				
	
	public ChequePostFechado getchequepostfechadoAnterior() {
		return this.chequepostfechadoAnterior;
	}

	public void setchequepostfechadoAnterior(ChequePostFechado chequepostfechadoAnterior) {
		this.chequepostfechadoAnterior = chequepostfechadoAnterior;
	}	
	
	public ChequePostFechado getchequepostfechadoTotales() {
		return this.chequepostfechadoTotales;
	}

	public void setchequepostfechadoTotales(ChequePostFechado chequepostfechadoTotales) {
		this.chequepostfechadoTotales = chequepostfechadoTotales;
	}	
	
	public ChequePostFechado getchequepostfechadoBean() {
		return this.chequepostfechadoBean;
	}

	public void setchequepostfechadoBean(ChequePostFechado chequepostfechadoBean) {
		this.chequepostfechadoBean = chequepostfechadoBean;
	}	
	
	public ChequePostFechadoParameterReturnGeneral getchequepostfechadoReturnGeneral() {
		return this.chequepostfechadoReturnGeneral;
	}

	public void setchequepostfechadoReturnGeneral(ChequePostFechadoParameterReturnGeneral chequepostfechadoReturnGeneral) {
		this.chequepostfechadoReturnGeneral = chequepostfechadoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_asiento_contableFK_IdAsientoContable=-1L;

	public Long getid_asiento_contableFK_IdAsientoContable() {
		return this.id_asiento_contableFK_IdAsientoContable;
	}

	public void setid_asiento_contableFK_IdAsientoContable(Long id_asiento_contableFK_IdAsientoContable) {
		this.id_asiento_contableFK_IdAsientoContable = id_asiento_contableFK_IdAsientoContable;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ChequePostFechadoLogic getChequePostFechadoLogic()	{		
		return chequepostfechadoLogic;
	}

	public void setChequePostFechadoLogic(ChequePostFechadoLogic chequepostfechadoLogic) {
		this.chequepostfechadoLogic = chequepostfechadoLogic;
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
	
	public Boolean getIsEsNuevoChequePostFechado() {
		return isEsNuevoChequePostFechado;
	}

	public void setIsEsNuevoChequePostFechado(Boolean isEsNuevoChequePostFechado) {
		this.isEsNuevoChequePostFechado = isEsNuevoChequePostFechado;
	}

	public Boolean getEsParaAccionDesdeFormularioChequePostFechado() {
		return esParaAccionDesdeFormularioChequePostFechado;
	}
	
	public void setEsParaAccionDesdeFormularioChequePostFechado(Boolean esParaAccionDesdeFormularioChequePostFechado) {
		this.esParaAccionDesdeFormularioChequePostFechado = esParaAccionDesdeFormularioChequePostFechado;
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

			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(chequepostfechadoSessionBean.getlidEmpresaActual());
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

			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(chequepostfechadoSessionBean.getlidSucursalActual());
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

			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(chequepostfechadoSessionBean.getlidClienteActual());
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

	public void cargarCombosAsientoContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AsientoContableLogic asientocontableLogic=new AsientoContableLogic();

			//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

					asientocontableLogic.getTodosAsientoContablesWithConnection(sFinalQuery,new Pagination());

					this.asientocontablesForeignKey=asientocontableLogic.getAsientoContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAsientoContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(chequepostfechadoSessionBean.getlidAsientoContableActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(chequepostfechadoSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(chequepostfechadoSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
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
					tipoformapagoLogic.getEntityWithConnection(chequepostfechadoSessionBean.getlidTipoFormaPagoActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(chequepostfechadoSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(chequepostfechadoSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.chequepostfechado!=null) {
						this.chequepostfechado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaChequePostFechado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaChequePostFechadoGenerico)throws Exception
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
				jComboBoxid_empresaChequePostFechadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaChequePostFechadoGenerico!=null && jComboBoxid_empresaChequePostFechadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaChequePostFechadoGenerico.setSelectedIndex(0);
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

					if(this.chequepostfechado!=null) {
						this.chequepostfechado.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalChequePostFechado.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalChequePostFechadoGenerico)throws Exception
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
				jComboBoxid_sucursalChequePostFechadoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalChequePostFechadoGenerico!=null && jComboBoxid_sucursalChequePostFechadoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalChequePostFechadoGenerico.setSelectedIndex(0);
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

					if(this.chequepostfechado!=null) {
						this.chequepostfechado.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteChequePostFechado.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteChequePostFechado!=null) {
						jComboBoxid_clienteFK_IdClienteChequePostFechado.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteChequePostFechado!=null) {
							//jComboBoxid_clienteFK_IdClienteChequePostFechado.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteChequePostFechado.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteChequePostFechado.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteChequePostFechadoGenerico)throws Exception
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
				jComboBoxid_clienteChequePostFechadoGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteChequePostFechadoGenerico!=null && jComboBoxid_clienteChequePostFechadoGenerico.getItemCount()>0) {
					jComboBoxid_clienteChequePostFechadoGenerico.setSelectedIndex(0);
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

					if(this.chequepostfechado!=null) {
						this.chequepostfechado.setAsientoContable(asientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.setSelectedItem(asientocontableTemp);
					}
				} else {
					//jComboBoxid_asiento_contableChequePostFechado.setSelectedItem(asientocontableTemp);
					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(asientocontableTemp!=null && jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado!=null) {
						jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.setSelectedItem(asientocontableTemp);
					} else {
						if(jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado!=null) {
							//jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.setSelectedItem(asientocontableTemp);
							if(jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.getItemCount()>0) {
								jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.setSelectedIndex(0);
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
	public void setActualAsientoContableForeignKeyGenerico(Long idAsientoContableSeleccionado,JComboBox jComboBoxid_asiento_contableChequePostFechadoGenerico)throws Exception
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
				jComboBoxid_asiento_contableChequePostFechadoGenerico.setSelectedItem(asientocontableTemp);
			} else {
				if(jComboBoxid_asiento_contableChequePostFechadoGenerico!=null && jComboBoxid_asiento_contableChequePostFechadoGenerico.getItemCount()>0) {
					jComboBoxid_asiento_contableChequePostFechadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.chequepostfechado!=null) {
						this.chequepostfechado.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioChequePostFechado.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioChequePostFechadoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioChequePostFechadoGenerico!=null && jComboBoxid_ejercicioChequePostFechadoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioChequePostFechadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.chequepostfechado!=null) {
						this.chequepostfechado.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoChequePostFechado.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoChequePostFechadoGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoChequePostFechadoGenerico!=null && jComboBoxid_periodoChequePostFechadoGenerico.getItemCount()>0) {
					jComboBoxid_periodoChequePostFechadoGenerico.setSelectedIndex(0);
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

					if(this.chequepostfechado!=null) {
						this.chequepostfechado.setTipoFormaPago(tipoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.setSelectedItem(tipoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_forma_pagoChequePostFechado.setSelectedItem(tipoformapagoTemp);
					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoformapagoTemp!=null && jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado!=null) {
						jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setSelectedItem(tipoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado!=null) {
							//jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setSelectedItem(tipoformapagoTemp);
							if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.getItemCount()>0) {
								jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setSelectedIndex(0);
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
	public void setActualTipoFormaPagoForeignKeyGenerico(Long idTipoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_forma_pagoChequePostFechadoGenerico)throws Exception
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
				jComboBoxid_tipo_forma_pagoChequePostFechadoGenerico.setSelectedItem(tipoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_forma_pagoChequePostFechadoGenerico!=null && jComboBoxid_tipo_forma_pagoChequePostFechadoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_forma_pagoChequePostFechadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.chequepostfechado!=null) {
						this.chequepostfechado.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioChequePostFechado.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioChequePostFechadoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioChequePostFechadoGenerico!=null && jComboBoxid_anioChequePostFechadoGenerico.getItemCount()>0) {
					jComboBoxid_anioChequePostFechadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.chequepostfechado!=null) {
						this.chequepostfechado.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesChequePostFechado.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
						if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesChequePostFechadoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesChequePostFechadoGenerico!=null && jComboBoxid_mesChequePostFechadoGenerico.getItemCount()>0) {
					jComboBoxid_mesChequePostFechadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ChequePostFechado chequepostfechado,JComboBox jComboBoxid_empresaChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaChequePostFechadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaChequePostFechadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				chequepostfechado.setid_empresa(empresaAux.getId());
				chequepostfechado.setempresa_descripcion(ChequePostFechadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				chequepostfechado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ChequePostFechado chequepostfechado,JComboBox jComboBoxid_sucursalChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalChequePostFechadoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalChequePostFechadoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				chequepostfechado.setid_sucursal(sucursalAux.getId());
				chequepostfechado.setsucursal_descripcion(ChequePostFechadoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				chequepostfechado.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ChequePostFechado chequepostfechado,JComboBox jComboBoxid_clienteChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteChequePostFechadoGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteChequePostFechadoGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				chequepostfechado.setid_cliente(clienteAux.getId());
				chequepostfechado.setcliente_descripcion(ChequePostFechadoConstantesFunciones.getClienteDescripcion(clienteAux));
				chequepostfechado.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAsientoContableForeignKey(ChequePostFechado chequepostfechado,JComboBox jComboBoxid_asiento_contableChequePostFechadoGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableAux=new AsientoContable();

			if(jComboBoxid_asiento_contableChequePostFechadoGenerico==null) {
				asientocontableAux=(AsientoContable)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.getSelectedItem();
			} else {
				asientocontableAux=(AsientoContable)jComboBoxid_asiento_contableChequePostFechadoGenerico.getSelectedItem();
			}

			if(asientocontableAux!=null && asientocontableAux.getId()!=null) {
				chequepostfechado.setid_asiento_contable(asientocontableAux.getId());
				chequepostfechado.setasientocontable_descripcion(ChequePostFechadoConstantesFunciones.getAsientoContableDescripcion(asientocontableAux));
				chequepostfechado.setAsientoContable(asientocontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ChequePostFechado chequepostfechado,JComboBox jComboBoxid_ejercicioChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioChequePostFechadoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioChequePostFechadoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				chequepostfechado.setid_ejercicio(ejercicioAux.getId());
				chequepostfechado.setejercicio_descripcion(ChequePostFechadoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				chequepostfechado.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(ChequePostFechado chequepostfechado,JComboBox jComboBoxid_periodoChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoChequePostFechadoGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoChequePostFechadoGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				chequepostfechado.setid_periodo(periodoAux.getId());
				chequepostfechado.setperiodo_descripcion(ChequePostFechadoConstantesFunciones.getPeriodoDescripcion(periodoAux));
				chequepostfechado.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFormaPagoForeignKey(ChequePostFechado chequepostfechado,JComboBox jComboBoxid_tipo_forma_pagoChequePostFechadoGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoAux=new TipoFormaPago();

			if(jComboBoxid_tipo_forma_pagoChequePostFechadoGenerico==null) {
				tipoformapagoAux=(TipoFormaPago)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.getSelectedItem();
			} else {
				tipoformapagoAux=(TipoFormaPago)jComboBoxid_tipo_forma_pagoChequePostFechadoGenerico.getSelectedItem();
			}

			if(tipoformapagoAux!=null && tipoformapagoAux.getId()!=null) {
				chequepostfechado.setid_tipo_forma_pago(tipoformapagoAux.getId());
				chequepostfechado.settipoformapago_descripcion(ChequePostFechadoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoAux));
				chequepostfechado.setTipoFormaPago(tipoformapagoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ChequePostFechado chequepostfechado,JComboBox jComboBoxid_anioChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioChequePostFechadoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioChequePostFechadoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				chequepostfechado.setid_anio(anioAux.getId());
				chequepostfechado.setanio_descripcion(ChequePostFechadoConstantesFunciones.getAnioDescripcion(anioAux));
				chequepostfechado.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(ChequePostFechado chequepostfechado,JComboBox jComboBoxid_mesChequePostFechadoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesChequePostFechadoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesChequePostFechadoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				chequepostfechado.setid_mes(mesAux.getId());
				chequepostfechado.setmes_descripcion(ChequePostFechadoConstantesFunciones.getMesDescripcion(mesAux));
				chequepostfechado.setMes(mesAux);			}
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

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
					}

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
					}

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
					}

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteChequePostFechado.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteChequePostFechado.addItem(cliente);
							}
						}

						if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.addItem(asientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
					}

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.addItem(asientocontable);
							}
						}

						if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
					}

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
					}

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.addItem(tipoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
					}

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.addItem(tipoformapago);
							}
						}

						if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
					}

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequePostFechado!=null) { 
					}

					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteChequePostFechado.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteChequePostFechado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.setSelectedItem(asientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.setSelectedItem(asientocontable);
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.setSelectedItem(tipoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setSelectedItem(tipoformapago);
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesChequePostFechado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ChequePostFechadoConstantesFunciones.refrescarForeignKeysDescripcionesChequePostFechado(this.chequepostfechadoLogic.getChequePostFechados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ChequePostFechadoConstantesFunciones.refrescarForeignKeysDescripcionesChequePostFechado(this.chequepostfechados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(AsientoContable.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(TipoFormaPago.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//chequepostfechadoLogic.setChequePostFechados(this.chequepostfechados);
			chequepostfechadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ChequePostFechadoParameterReturnGeneral getChequePostFechadoParameterGeneral() {
		return this.chequepostfechadoParameterGeneral;
	}
	
	public void setChequePostFechadoParameterGeneral(ChequePostFechadoParameterReturnGeneral chequepostfechadoParameterGeneral) {
		this.chequepostfechadoParameterGeneral = chequepostfechadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoChequePostFechado() {
		return isPermisoTodoChequePostFechado;
	}

	public void setIsPermisoTodoChequePostFechado(Boolean isPermisoTodoChequePostFechado) {
		this.isPermisoTodoChequePostFechado = isPermisoTodoChequePostFechado;
	}

	public Boolean getIsPermisoNuevoChequePostFechado() {
		return isPermisoNuevoChequePostFechado;
	}

	public void setIsPermisoNuevoChequePostFechado(Boolean isPermisoNuevoChequePostFechado) {
		this.isPermisoNuevoChequePostFechado = isPermisoNuevoChequePostFechado;
	}

	public Boolean getIsPermisoActualizarChequePostFechado() {
		return isPermisoActualizarChequePostFechado;
	}

	public void setIsPermisoActualizarChequePostFechado(Boolean isPermisoActualizarChequePostFechado) {
		this.isPermisoActualizarChequePostFechado = isPermisoActualizarChequePostFechado;
	}

	public Boolean getIsPermisoEliminarChequePostFechado() {
		return isPermisoEliminarChequePostFechado;
	}

	public void setIsPermisoEliminarChequePostFechado(Boolean isPermisoEliminarChequePostFechado) {
		this.isPermisoEliminarChequePostFechado = isPermisoEliminarChequePostFechado;
	}

	public Boolean getIsPermisoGuardarCambiosChequePostFechado() {
		return isPermisoGuardarCambiosChequePostFechado;
	}

	public void setIsPermisoGuardarCambiosChequePostFechado(Boolean isPermisoGuardarCambiosChequePostFechado) {
		this.isPermisoGuardarCambiosChequePostFechado = isPermisoGuardarCambiosChequePostFechado;
	}
	
	public Boolean getIsPermisoConsultaChequePostFechado() {
		return isPermisoConsultaChequePostFechado;
	}

	public void setIsPermisoConsultaChequePostFechado(Boolean isPermisoConsultaChequePostFechado) {
		this.isPermisoConsultaChequePostFechado = isPermisoConsultaChequePostFechado;
	}

	public Boolean getIsPermisoBusquedaChequePostFechado() {
		return isPermisoBusquedaChequePostFechado;
	}

	public void setIsPermisoBusquedaChequePostFechado(Boolean isPermisoBusquedaChequePostFechado) {
		this.isPermisoBusquedaChequePostFechado = isPermisoBusquedaChequePostFechado;
	}

	public Boolean getIsPermisoReporteChequePostFechado() {
		return isPermisoReporteChequePostFechado;
	}

	public void setIsPermisoReporteChequePostFechado(Boolean isPermisoReporteChequePostFechado) {
		this.isPermisoReporteChequePostFechado = isPermisoReporteChequePostFechado;
	}
	
	public Boolean getIsPermisoPaginacionMedioChequePostFechado() {
		return isPermisoPaginacionMedioChequePostFechado;
	}

	public void setIsPermisoPaginacionMedioChequePostFechado(Boolean isPermisoPaginacionMedioChequePostFechado) {
		this.isPermisoPaginacionMedioChequePostFechado = isPermisoPaginacionMedioChequePostFechado;
	}
	
	public Boolean getIsPermisoPaginacionTodoChequePostFechado() {
		return isPermisoPaginacionTodoChequePostFechado;
	}

	public void setIsPermisoPaginacionTodoChequePostFechado(Boolean isPermisoPaginacionTodoChequePostFechado) {
		this.isPermisoPaginacionTodoChequePostFechado = isPermisoPaginacionTodoChequePostFechado;
	}
	
	public Boolean getIsPermisoPaginacionAltoChequePostFechado() {
		return isPermisoPaginacionAltoChequePostFechado;
	}

	public void setIsPermisoPaginacionAltoChequePostFechado(Boolean isPermisoPaginacionAltoChequePostFechado) {
		this.isPermisoPaginacionAltoChequePostFechado = isPermisoPaginacionAltoChequePostFechado;
	}
	
	public Boolean getIsPermisoCopiarChequePostFechado() {
		return isPermisoCopiarChequePostFechado;
	}

	public void setIsPermisoCopiarChequePostFechado(Boolean isPermisoCopiarChequePostFechado) {
		this.isPermisoCopiarChequePostFechado = isPermisoCopiarChequePostFechado;
	}
	
	public Boolean getIsPermisoVerFormChequePostFechado() {
		return isPermisoVerFormChequePostFechado;
	}

	public void setIsPermisoVerFormChequePostFechado(Boolean isPermisoVerFormChequePostFechado) {
		this.isPermisoVerFormChequePostFechado = isPermisoVerFormChequePostFechado;
	}
	
	public Boolean getIsPermisoDuplicarChequePostFechado() {
		return isPermisoDuplicarChequePostFechado;
	}

	public void setIsPermisoDuplicarChequePostFechado(Boolean isPermisoDuplicarChequePostFechado) {
		this.isPermisoDuplicarChequePostFechado = isPermisoDuplicarChequePostFechado;
	}
	
	public Boolean getIsPermisoOrdenChequePostFechado() {
		return isPermisoOrdenChequePostFechado;
	}

	public void setIsPermisoOrdenChequePostFechado(Boolean isPermisoOrdenChequePostFechado) {
		this.isPermisoOrdenChequePostFechado = isPermisoOrdenChequePostFechado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoChequePostFechado() {
		return isVisibilidadCeldaNuevoChequePostFechado;
	}

	public void setIsVisibilidadCeldaNuevoChequePostFechado(Boolean isVisibilidadCeldaNuevoChequePostFechado) {
		this.isVisibilidadCeldaNuevoChequePostFechado = isVisibilidadCeldaNuevoChequePostFechado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarChequePostFechado() {
		return isVisibilidadCeldaDuplicarChequePostFechado;
	}

	public void setIsVisibilidadCeldaDuplicarChequePostFechado(Boolean isVisibilidadCeldaDuplicarChequePostFechado) {
		this.isVisibilidadCeldaDuplicarChequePostFechado = isVisibilidadCeldaDuplicarChequePostFechado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarChequePostFechado() {
		return isVisibilidadCeldaCopiarChequePostFechado;
	}

	public void setIsVisibilidadCeldaCopiarChequePostFechado(Boolean isVisibilidadCeldaCopiarChequePostFechado) {
		this.isVisibilidadCeldaCopiarChequePostFechado = isVisibilidadCeldaCopiarChequePostFechado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormChequePostFechado() {
		return isVisibilidadCeldaVerFormChequePostFechado;
	}

	public void setIsVisibilidadCeldaVerFormChequePostFechado(Boolean isVisibilidadCeldaVerFormChequePostFechado) {
		this.isVisibilidadCeldaVerFormChequePostFechado = isVisibilidadCeldaVerFormChequePostFechado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenChequePostFechado() {
		return isVisibilidadCeldaOrdenChequePostFechado;
	}

	public void setIsVisibilidadCeldaOrdenChequePostFechado(Boolean isVisibilidadCeldaOrdenChequePostFechado) {
		this.isVisibilidadCeldaOrdenChequePostFechado = isVisibilidadCeldaOrdenChequePostFechado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesChequePostFechado() {
		return isVisibilidadCeldaNuevoRelacionesChequePostFechado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesChequePostFechado(Boolean isVisibilidadCeldaNuevoRelacionesChequePostFechado) {
		this.isVisibilidadCeldaNuevoRelacionesChequePostFechado = isVisibilidadCeldaNuevoRelacionesChequePostFechado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarChequePostFechado() {
		return isVisibilidadCeldaModificarChequePostFechado;
	}

	public void setIsVisibilidadCeldaModificarChequePostFechado(Boolean isVisibilidadCeldaModificarChequePostFechado) {
		this.isVisibilidadCeldaModificarChequePostFechado = isVisibilidadCeldaModificarChequePostFechado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarChequePostFechado() {
		return isVisibilidadCeldaActualizarChequePostFechado;
	}

	public void setIsVisibilidadCeldaActualizarChequePostFechado(Boolean isVisibilidadCeldaActualizarChequePostFechado) {
		this.isVisibilidadCeldaActualizarChequePostFechado = isVisibilidadCeldaActualizarChequePostFechado;
	}

	public Boolean getIsVisibilidadCeldaEliminarChequePostFechado() {
		return isVisibilidadCeldaEliminarChequePostFechado;
	}

	public void setIsVisibilidadCeldaEliminarChequePostFechado(Boolean isVisibilidadCeldaEliminarChequePostFechado) {
		this.isVisibilidadCeldaEliminarChequePostFechado = isVisibilidadCeldaEliminarChequePostFechado;
	}

	public Boolean getIsVisibilidadCeldaCancelarChequePostFechado() {
		return isVisibilidadCeldaCancelarChequePostFechado;
	}

	public void setIsVisibilidadCeldaCancelarChequePostFechado(Boolean isVisibilidadCeldaCancelarChequePostFechado) {
		this.isVisibilidadCeldaCancelarChequePostFechado = isVisibilidadCeldaCancelarChequePostFechado;
	}

	public Boolean getIsVisibilidadCeldaGuardarChequePostFechado() {
		return isVisibilidadCeldaGuardarChequePostFechado;
	}

	public void setIsVisibilidadCeldaGuardarChequePostFechado(Boolean isVisibilidadCeldaGuardarChequePostFechado) {
		this.isVisibilidadCeldaGuardarChequePostFechado = isVisibilidadCeldaGuardarChequePostFechado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosChequePostFechado() {
		return isVisibilidadCeldaGuardarCambiosChequePostFechado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosChequePostFechado(Boolean isVisibilidadCeldaGuardarCambiosChequePostFechado) {
		this.isVisibilidadCeldaGuardarCambiosChequePostFechado = isVisibilidadCeldaGuardarCambiosChequePostFechado;
	}
		
	public ChequePostFechadoSessionBean getchequepostfechadoSessionBean() {
		return this.chequepostfechadoSessionBean;
	}
	
	public void setchequepostfechadoSessionBean(ChequePostFechadoSessionBean chequepostfechadoSessionBean) {
		this.chequepostfechadoSessionBean=chequepostfechadoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdAsientoContable() {
		return this.isVisibilidadFK_IdAsientoContable;
	}

	public void setisVisibilidadFK_IdAsientoContable(Boolean isVisibilidadFK_IdAsientoContable) {
		this.isVisibilidadFK_IdAsientoContable=isVisibilidadFK_IdAsientoContable;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(ChequePostFechado chequepostfechado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(chequepostfechado,null);
				this.setActualParaGuardarSucursalForeignKey(chequepostfechado,null);
				this.setActualParaGuardarClienteForeignKey(chequepostfechado,null);
				this.setActualParaGuardarAsientoContableForeignKey(chequepostfechado,null);
				this.setActualParaGuardarEjercicioForeignKey(chequepostfechado,null);
				this.setActualParaGuardarPeriodoForeignKey(chequepostfechado,null);
				this.setActualParaGuardarTipoFormaPagoForeignKey(chequepostfechado,null);
				this.setActualParaGuardarAnioForeignKey(chequepostfechado,null);
				this.setActualParaGuardarMesForeignKey(chequepostfechado,null);
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
	
	public void bugActualizarReferenciaActual(ChequePostFechado chequepostfechado,ChequePostFechado chequepostfechadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalChequePostFechado(chequepostfechado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		chequepostfechadoAux.setId(chequepostfechado.getId());
		chequepostfechadoAux.setVersionRow(chequepostfechado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessChequePostFechado();
		
			int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = chequepostfechadoValidator.getInvalidValues(this.chequepostfechado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			chequepostfechadoLogic.setDatosCliente(datosCliente);
			chequepostfechadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				chequepostfechadoAux=new  ChequePostFechado();
				
				chequepostfechadoAux.setIsNew(true);
				chequepostfechadoAux.setIsChanged(true);
				
				chequepostfechadoAux.setChequePostFechadoOriginal(this.chequepostfechado);
				
				chequepostfechadoAux.setId(this.chequepostfechado.getId());	
				chequepostfechadoAux.setVersionRow(this.chequepostfechado.getVersionRow());	
				chequepostfechadoAux.setid_empresa(this.chequepostfechado.getid_empresa());	
				chequepostfechadoAux.setid_sucursal(this.chequepostfechado.getid_sucursal());	
				chequepostfechadoAux.setid_cliente(this.chequepostfechado.getid_cliente());	
				chequepostfechadoAux.setid_asiento_contable(this.chequepostfechado.getid_asiento_contable());	
				chequepostfechadoAux.setid_ejercicio(this.chequepostfechado.getid_ejercicio());	
				chequepostfechadoAux.setid_periodo(this.chequepostfechado.getid_periodo());	
				chequepostfechadoAux.setid_tipo_forma_pago(this.chequepostfechado.getid_tipo_forma_pago());	
				chequepostfechadoAux.setnombre_gira(this.chequepostfechado.getnombre_gira());	
				chequepostfechadoAux.setfecha_vencimiento(this.chequepostfechado.getfecha_vencimiento());	
				chequepostfechadoAux.setfecha_vencimiento_original(this.chequepostfechado.getfecha_vencimiento_original());	
				chequepostfechadoAux.setnumero(this.chequepostfechado.getnumero());	
				chequepostfechadoAux.setnumero_cheque(this.chequepostfechado.getnumero_cheque());	
				chequepostfechadoAux.setdescripcion(this.chequepostfechado.getdescripcion());	
				chequepostfechadoAux.setid_anio(this.chequepostfechado.getid_anio());	
				chequepostfechadoAux.setid_mes(this.chequepostfechado.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.chequepostfechadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(chequepostfechadoAux,chequepostfechadoLogic.getChequePostFechados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(chequepostfechadoAux,chequepostfechados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.chequepostfechadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.saveChequePostFechados();//WithConnection
						//chequepostfechadoLogic.getSetVersionRowChequePostFechados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.chequepostfechado,chequepostfechadoAux);
					
					this.refrescarForeignKeysDescripcionesChequePostFechado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								chequepostfechadoLogic.saveChequePostFechadoRelaciones(chequepostfechadoAux);//WithConnection
								//chequepostfechadoLogic.getSetVersionRowChequePostFechados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.chequepostfechado,chequepostfechadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.chequepostfechadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(chequepostfechadoAux,chequepostfechadoLogic.getChequePostFechados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(chequepostfechadoAux,chequepostfechados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.chequepostfechado,chequepostfechadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				chequepostfechadoAux=new  ChequePostFechado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado() 
					|| (this.chequepostfechadoSessionBean.getEsGuardarRelacionado() && this.chequepostfechado.getId()>=0)) {
						
					chequepostfechadoAux.setIsNew(false);
				}
				
				chequepostfechadoAux.setIsDeleted(false);
			
				chequepostfechadoAux.setId(this.chequepostfechado.getId());	
				chequepostfechadoAux.setVersionRow(this.chequepostfechado.getVersionRow());	
				chequepostfechadoAux.setid_empresa(this.chequepostfechado.getid_empresa());	
				chequepostfechadoAux.setid_sucursal(this.chequepostfechado.getid_sucursal());	
				chequepostfechadoAux.setid_cliente(this.chequepostfechado.getid_cliente());	
				chequepostfechadoAux.setid_asiento_contable(this.chequepostfechado.getid_asiento_contable());	
				chequepostfechadoAux.setid_ejercicio(this.chequepostfechado.getid_ejercicio());	
				chequepostfechadoAux.setid_periodo(this.chequepostfechado.getid_periodo());	
				chequepostfechadoAux.setid_tipo_forma_pago(this.chequepostfechado.getid_tipo_forma_pago());	
				chequepostfechadoAux.setnombre_gira(this.chequepostfechado.getnombre_gira());	
				chequepostfechadoAux.setfecha_vencimiento(this.chequepostfechado.getfecha_vencimiento());	
				chequepostfechadoAux.setfecha_vencimiento_original(this.chequepostfechado.getfecha_vencimiento_original());	
				chequepostfechadoAux.setnumero(this.chequepostfechado.getnumero());	
				chequepostfechadoAux.setnumero_cheque(this.chequepostfechado.getnumero_cheque());	
				chequepostfechadoAux.setdescripcion(this.chequepostfechado.getdescripcion());	
				chequepostfechadoAux.setid_anio(this.chequepostfechado.getid_anio());	
				chequepostfechadoAux.setid_mes(this.chequepostfechado.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(chequepostfechadoAux,chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(chequepostfechadoAux,chequepostfechados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.chequepostfechadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.saveChequePostFechados();//WithConnection
						//chequepostfechadoLogic.getSetVersionRowChequePostFechados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.chequepostfechado,chequepostfechadoAux);
					
					this.refrescarForeignKeysDescripcionesChequePostFechado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								chequepostfechadoLogic.saveChequePostFechadoRelaciones(chequepostfechadoAux);//WithConnection
								//chequepostfechadoLogic.getSetVersionRowChequePostFechados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.chequepostfechado,chequepostfechadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.chequepostfechadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(chequepostfechadoAux,chequepostfechadoLogic.getChequePostFechados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(chequepostfechadoAux,chequepostfechados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.chequepostfechado,chequepostfechadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				chequepostfechadoAux=new  ChequePostFechado();
				
				chequepostfechadoAux.setIsNew(false);
				chequepostfechadoAux.setIsChanged(false);
				
				chequepostfechadoAux.setIsDeleted(true);
				
				chequepostfechadoAux.setId(this.chequepostfechado.getId());	
				chequepostfechadoAux.setVersionRow(this.chequepostfechado.getVersionRow());	
				chequepostfechadoAux.setid_empresa(this.chequepostfechado.getid_empresa());	
				chequepostfechadoAux.setid_sucursal(this.chequepostfechado.getid_sucursal());	
				chequepostfechadoAux.setid_cliente(this.chequepostfechado.getid_cliente());	
				chequepostfechadoAux.setid_asiento_contable(this.chequepostfechado.getid_asiento_contable());	
				chequepostfechadoAux.setid_ejercicio(this.chequepostfechado.getid_ejercicio());	
				chequepostfechadoAux.setid_periodo(this.chequepostfechado.getid_periodo());	
				chequepostfechadoAux.setid_tipo_forma_pago(this.chequepostfechado.getid_tipo_forma_pago());	
				chequepostfechadoAux.setnombre_gira(this.chequepostfechado.getnombre_gira());	
				chequepostfechadoAux.setfecha_vencimiento(this.chequepostfechado.getfecha_vencimiento());	
				chequepostfechadoAux.setfecha_vencimiento_original(this.chequepostfechado.getfecha_vencimiento_original());	
				chequepostfechadoAux.setnumero(this.chequepostfechado.getnumero());	
				chequepostfechadoAux.setnumero_cheque(this.chequepostfechado.getnumero_cheque());	
				chequepostfechadoAux.setdescripcion(this.chequepostfechado.getdescripcion());	
				chequepostfechadoAux.setid_anio(this.chequepostfechado.getid_anio());	
				chequepostfechadoAux.setid_mes(this.chequepostfechado.getid_mes());	
				
				if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.chequepostfechadoAux.getId()>=0) {	
						this.chequepostfechadosEliminados.add(chequepostfechadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(chequepostfechadoAux,chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(chequepostfechadoAux,chequepostfechados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.chequepostfechadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.saveChequePostFechados();//WithConnection
						//chequepostfechadoLogic.getSetVersionRowChequePostFechados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								chequepostfechadoLogic.saveChequePostFechadoRelaciones(chequepostfechadoAux);//WithConnection
								//chequepostfechadoLogic.getSetVersionRowChequePostFechados();//WithConnection
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
							if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.chequepostfechadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(chequepostfechadoAux,chequepostfechadoLogic.getChequePostFechados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(chequepostfechadoAux,chequepostfechados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getChequePostFechados().addAll(this.chequepostfechadosEliminados);
					
					chequepostfechadoLogic.saveChequePostFechados();//WithConnection
					//chequepostfechadoLogic.getSetVersionRowChequePostFechados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesChequePostFechado();
				
				this.chequepostfechadosEliminados= new ArrayList<ChequePostFechado>();		
			}
			
			if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cheque Post Fechado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.chequepostfechado=chequepostfechadoAux;
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
      		//this.finishProcessChequePostFechado();
      	}
		
	}	
	
	public void actualizarRelaciones(ChequePostFechado chequepostfechadoLocal) throws Exception {
		
		if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ChequePostFechado chequepostfechadoLocal) throws Exception {	
		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				chequepostfechadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				chequepostfechadoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				chequepostfechadoLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AsientoContableDetalleFormJInternalFrame.class)) {
				AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrameLocal=(AsientoContableBeanSwingJInternalFrame) ((AsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				asientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAsientoContable(asientocontableBeanSwingJInternalFrameLocal.getasientocontable(),true);
				asientocontableBeanSwingJInternalFrameLocal.actualizarLista(asientocontableBeanSwingJInternalFrameLocal.asientocontable,this.asientocontablesForeignKey);

				asientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				chequepostfechadoLocal.setAsientoContable(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey("Formulario");
				this.setActualAsientoContableForeignKey(asientocontableBeanSwingJInternalFrameLocal.asientocontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				chequepostfechadoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				chequepostfechadoLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrameLocal=(TipoFormaPagoBeanSwingJInternalFrame) ((TipoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.gettipoformapago(),true);
				tipoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago,this.tipoformapagosForeignKey);

				tipoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				chequepostfechadoLocal.setTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey("Formulario");
				this.setActualTipoFormaPagoForeignKey(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				chequepostfechadoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				chequepostfechadoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarChequePostFechadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = chequepostfechadoValidator.getInvalidValues(this.chequepostfechado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ChequePostFechado chequepostfechado,List<ChequePostFechado> chequepostfechados) throws Exception {
		try	{		
			ChequePostFechadoConstantesFunciones.actualizarLista(chequepostfechado,chequepostfechados,this.chequepostfechadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ChequePostFechado chequepostfechado,List<ChequePostFechado> chequepostfechados) throws Exception {
		try	{			
			ChequePostFechadoConstantesFunciones.actualizarSelectedLista(chequepostfechado,chequepostfechados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ChequePostFechado> chequepostfechadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				chequepostfechadosLocal=this.chequepostfechadoLogic.getChequePostFechados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				chequepostfechadosLocal=this.chequepostfechados;
			}
			//ARCHITECTURE
		
			for(ChequePostFechado chequepostfechadoLocal:chequepostfechadosLocal) {
				if(this.permiteMantenimiento(chequepostfechadoLocal) && chequepostfechadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ChequePostFechadoConstantesFunciones.getChequePostFechadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_empresaChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_sucursalChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_clienteChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.IDASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_asiento_contableChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_ejercicioChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_periodoChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.IDTIPOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_tipo_forma_pagoChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.NOMBREGIRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelnombre_giraChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelfecha_vencimientoChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.FECHAVENCIMIENTOORIGINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelfecha_vencimiento_originalChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelnumeroChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelnumero_chequeChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabeldescripcionChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_anioChequePostFechado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequePostFechadoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_mesChequePostFechado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_empresaChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_sucursalChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_clienteChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_asiento_contableChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_ejercicioChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_periodoChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_tipo_forma_pagoChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelnombre_giraChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelfecha_vencimientoChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelfecha_vencimiento_originalChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelnumeroChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelnumero_chequeChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabeldescripcionChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_anioChequePostFechado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequePostFechado.jLabelid_mesChequePostFechado,"");
		
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
		this.iIdNuevoChequePostFechado--;	
		
		
		this.chequepostfechadoAux=new ChequePostFechado();
		
		this.chequepostfechadoAux.setId(this.iIdNuevoChequePostFechado);
		this.chequepostfechadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.chequepostfechadoLogic.getChequePostFechados().add(this.chequepostfechadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.chequepostfechados.add(this.chequepostfechadoAux);
		}
		//ARCHITECTURE
		
		this.chequepostfechado=this.chequepostfechadoAux;
		
		if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioChequePostFechado(this.chequepostfechado);
			this.setVariablesObjetoActualToFormularioForeignKeyChequePostFechado(this.chequepostfechado);
		}
				
		//this.setDefaultControlesChequePostFechado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyChequePostFechado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyChequePostFechado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyChequePostFechado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualChequePostFechado(this.chequepostfechadoBean,this.chequepostfechado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ChequePostFechadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {
			classes=ChequePostFechadoConstantesFunciones.getClassesRelationshipsOfChequePostFechado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.chequepostfechadoReturnGeneral=chequepostfechadoLogic.procesarEventosChequePostFechadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.chequepostfechadoLogic.getChequePostFechados(),this.chequepostfechado,this.chequepostfechadoParameterGeneral,this.isEsNuevoChequePostFechado,classes);//this.chequepostfechadoLogic.getChequePostFechado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanChequePostFechado(this.chequepostfechadoReturnGeneral,this.chequepostfechadoBean,false);
		
		if(this.chequepostfechadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyChequePostFechado(this.chequepostfechadoReturnGeneral.getChequePostFechado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioChequePostFechado(this.chequepostfechadoReturnGeneral.getChequePostFechado());
		}
		
		if(this.chequepostfechadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioChequePostFechado(this.chequepostfechadoReturnGeneral.getChequePostFechado(),classes);//this.chequepostfechadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyChequePostFechado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyChequePostFechado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.RecargarFormChequePostFechado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingChequePostFechado(false);
						
			if(chequepostfechadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualChequePostFechado();
			}
			
			this.actualizarVisualTableDatosChequePostFechado();
			
			this.jTableDatosChequePostFechado.setRowSelectionInterval(this.getIndiceNuevoChequePostFechado(), this.getIndiceNuevoChequePostFechado());
			
			this.seleccionarFilaTablaChequePostFechadoActual();
						
			this.actualizarEstadoCeldasBotonesChequePostFechado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesChequePostFechado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormChequePostFechado.jTextAreanombre_giraChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarnombre_giraChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimientoChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarfecha_vencimientoChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimiento_originalChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarfecha_vencimiento_originalChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumeroChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarnumeroChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumero_chequeChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarnumero_chequeChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jTextAreadescripcionChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activardescripcionChequePostFechado);	
		//
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarid_empresaChequePostFechado);//
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarid_sucursalChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarid_clienteChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarid_asiento_contableChequePostFechado);//
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarid_ejercicioChequePostFechado);//
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarid_periodoChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarid_tipo_forma_pagoChequePostFechado);//
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarid_anioChequePostFechado);//
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.setEnabled(isHabilitar && this.chequepostfechadoConstantesFunciones.activarid_mesChequePostFechado);
	};
	
	public void setDefaultControlesChequePostFechado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoChequePostFechado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.chequepostfechadoSessionBean.setConGuardarRelaciones(true);			
			this.chequepostfechadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormChequePostFechado.jTabbedPaneRelacionesChequePostFechado.setVisible(true);
			
					
		} else {
			//this.chequepostfechadoSessionBean.setConGuardarRelaciones(false);			
			this.chequepostfechadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormChequePostFechado.jTabbedPaneRelacionesChequePostFechado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoChequePostFechado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequePostFechado chequepostfechadoAux:this.chequepostfechadoLogic.getChequePostFechados()) {
				if(chequepostfechadoAux.getId().equals(this.iIdNuevoChequePostFechado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequePostFechado chequepostfechadoAux:this.chequepostfechados) {
				if(chequepostfechadoAux.getId().equals(this.iIdNuevoChequePostFechado)) {
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
	
	public int getIndiceActualChequePostFechado(ChequePostFechado chequepostfechado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequePostFechado chequepostfechadoAux:this.chequepostfechadoLogic.getChequePostFechados()) {
				if(chequepostfechadoAux.getId().equals(chequepostfechado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequePostFechado chequepostfechadoAux:this.chequepostfechados) {
				if(chequepostfechadoAux.getId().equals(chequepostfechado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalChequePostFechado(ChequePostFechado chequepostfechadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequePostFechado chequepostfechadoAux:this.chequepostfechadoLogic.getChequePostFechados()) {
				if(chequepostfechadoAux.getChequePostFechadoOriginal().getId().equals(chequepostfechadoOriginal.getId())) {
					existe=true;
					chequepostfechadoOriginal.setId(chequepostfechadoAux.getId());
					chequepostfechadoOriginal.setVersionRow(chequepostfechadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequePostFechado chequepostfechadoAux:this.chequepostfechados) {
				if(chequepostfechadoAux.getChequePostFechadoOriginal().getId().equals(chequepostfechadoOriginal.getId())) {
					existe=true;
					chequepostfechadoOriginal.setId(chequepostfechadoAux.getId());
					chequepostfechadoOriginal.setVersionRow(chequepostfechadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosChequePostFechado(Boolean esParaCancelar) throws Exception {
		chequepostfechadosAux=new ArrayList<ChequePostFechado>();
		chequepostfechadoAux=new ChequePostFechado();
		
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ChequePostFechado chequepostfechadoAux:this.chequepostfechadoLogic.getChequePostFechados()) {
					if(chequepostfechadoAux.getId()<0) {
						chequepostfechadosAux.add(chequepostfechadoAux);
					}		
				}
				this.iIdNuevoChequePostFechado=0L;
				this.chequepostfechadoLogic.getChequePostFechados().removeAll(chequepostfechadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ChequePostFechado chequepostfechadoAux:this.chequepostfechados) {
					if(chequepostfechadoAux.getId()<0) {
						chequepostfechadosAux.add(chequepostfechadoAux);
					}		
				}
				this.iIdNuevoChequePostFechado=0L;
				this.chequepostfechados.removeAll(chequepostfechadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoChequePostFechado 
					&& this.chequepostfechadoLogic.getChequePostFechados().size()>0
					) {
					chequepostfechadoAux=this.chequepostfechadoLogic.getChequePostFechados().get(this.chequepostfechadoLogic.getChequePostFechados().size() - 1);
				
					if(chequepostfechadoAux.getId()<0) {
						this.chequepostfechadoLogic.getChequePostFechados().remove(chequepostfechadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoChequePostFechado && this.chequepostfechados.size()>0) {
					chequepostfechadoAux=this.chequepostfechados.get(this.chequepostfechados.size() - 1);
				
					if(chequepostfechadoAux.getId()<0) {
						this.chequepostfechados.remove(chequepostfechadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoChequePostFechado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(chequepostfechado.getId()<0) {
				this.chequepostfechadoLogic.getChequePostFechados().remove(this.chequepostfechado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(chequepostfechado.getId()<0) {
				this.chequepostfechados.remove(this.chequepostfechado);
			}
		}			
	}
	
	public void setEstadosInicialesChequePostFechado(List<ChequePostFechado> chequepostfechadosAux) throws Exception {
		ChequePostFechadoConstantesFunciones.setEstadosInicialesChequePostFechado(chequepostfechadosAux);
	}
	
	public void setEstadosInicialesChequePostFechado(ChequePostFechado chequepostfechadoAux) throws Exception {
		ChequePostFechadoConstantesFunciones.setEstadosInicialesChequePostFechado(chequepostfechadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarChequePostFechadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesChequePostFechado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarChequePostFechadoActual()) {
				if(!this.isEsNuevoChequePostFechado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesChequePostFechado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoChequePostFechado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarChequePostFechadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cheque Post Fechado ?", "MANTENIMIENTO DE Cheque Post Fechado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesChequePostFechado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ChequePostFechado chequepostfechado) throws Exception {
		ChequePostFechadoConstantesFunciones.seleccionarAsignar(this.chequepostfechado,chequepostfechado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarChequePostFechado=this.isPermisoActualizarOriginalChequePostFechado;
			
			
			this.seleccionarAsignar(chequepostfechado);
			
			

			idClienteActual=chequepostfechado.getid_cliente();
			this.seleccionarClienteActual();

			idAsientoContableActual=chequepostfechado.getid_asiento_contable();
			this.seleccionarAsientoContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ChequePostFechadoConstantesFunciones.quitarEspaciosChequePostFechado(this.chequepostfechado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesChequePostFechado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.chequepostfechadoSessionBean.setsFuncionBusquedaRapida(this.chequepostfechadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoChequePostFechado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosChequePostFechado(esParaCancelar);				
				this.cancelarNuevoChequePostFechado(esParaCancelar);								
			}
			
			this.chequepostfechado=new ChequePostFechado();
			
			this.inicializarChequePostFechado();
			
			this.actualizarEstadoCeldasBotonesChequePostFechado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarChequePostFechado() throws Exception {
		try {
			ChequePostFechadoConstantesFunciones.inicializarChequePostFechado(this.chequepostfechado);
			
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
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.chequepostfechadoLogic.getChequePostFechados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteChequePostFechados(String sAccionBusqueda,List<ChequePostFechado> chequepostfechadosParaReportes) throws Exception {
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
					sPathReporteFinal="ChequePostFechado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ChequePostFechadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ChequePostFechadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ChequePostFechado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cheque Post Fechados");		
		parameters.put("busquedapor", ChequePostFechadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceChequePostFechado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ChequePostFechadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ChequePostFechadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceChequePostFechado=new JRBeanArrayDataSource(ChequePostFechadoJInternalFrame.TraerChequePostFechadoBeans(chequepostfechadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceChequePostFechado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ChequePostFechadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ChequePostFechadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ChequePostFechadoBean.TraerChequePostFechadoBeans(chequepostfechadosParaReportes).toArray()));
							
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
				this.generarExcelReporteChequePostFechados(sAccionBusqueda,sTipoArchivoReporte,chequepostfechadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalChequePostFechados(sAccionBusqueda,sTipoArchivoReporte,chequepostfechadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoChequePostFechadoActionPerformed(null);
					//this.generarExcelReporteChequePostFechados(sAccionBusqueda,sTipoArchivoReporte,chequepostfechadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalChequePostFechados(sAccionBusqueda,sTipoArchivoReporte,chequepostfechadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesChequePostFechados(sAccionBusqueda,sTipoArchivoReporte,chequepostfechadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesChequePostFechados(sAccionBusqueda,sTipoArchivoReporte,chequepostfechadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteChequePostFechados(String sAccionBusqueda,String sTipoArchivoReporte,List<ChequePostFechado> chequepostfechadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequepostfechado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ChequePostFechados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderChequePostFechado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ChequePostFechado chequepostfechado : chequepostfechadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ChequePostFechadoConstantesFunciones.generarExcelReporteDataChequePostFechado("NORMAL",row,workbook,chequepostfechado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderChequePostFechado(String sTipo,Row row,Workbook workbook) {
		
		ChequePostFechadoConstantesFunciones.generarExcelReporteHeaderChequePostFechado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalChequePostFechados(String sAccionBusqueda,String sTipoArchivoReporte,List<ChequePostFechado> chequepostfechadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequepostfechado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ChequePostFechados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ChequePostFechado chequepostfechado : chequepostfechadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ChequePostFechadoConstantesFunciones.getChequePostFechadoDescripcion(chequepostfechado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getasientocontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.gettipoformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getnombre_gira());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getfecha_vencimiento_original());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequePostFechadoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequepostfechado.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesChequePostFechados(String sAccionBusqueda,String sTipoArchivoReporte,List<ChequePostFechado> chequepostfechadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ChequePostFechado> chequepostfechadosRespaldo=null;
		
		classes=ChequePostFechadoConstantesFunciones.getClassesRelationshipsOfChequePostFechado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.chequepostfechadoLogic.setDatosCliente(this.datosCliente);
		this.chequepostfechadoLogic.setDatosDeep(this.datosDeep);
		this.chequepostfechadoLogic.setIsConDeep(true);
		
		chequepostfechadosRespaldo=this.chequepostfechadoLogic.getChequePostFechados();
		
		this.chequepostfechadoLogic.setChequePostFechados(chequepostfechadosParaReportes);	
		this.chequepostfechadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		chequepostfechadosParaReportes=this.chequepostfechadoLogic.getChequePostFechados();
		this.chequepostfechadoLogic.setChequePostFechados(chequepostfechadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequepostfechado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ChequePostFechados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderChequePostFechado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ChequePostFechado chequepostfechado : chequepostfechadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderChequePostFechado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ChequePostFechadoConstantesFunciones.generarExcelReporteDataChequePostFechado("NORMAL",row,workbook,chequepostfechado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ChequePostFechadoConstantesFunciones.getChequePostFechadoDescripcion(chequepostfechado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoChequePostFechado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessChequePostFechado() throws Exception {		
		this.startProcessChequePostFechado(true);
	}
	
	public void startProcessChequePostFechado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasChequePostFechado ,this.jPanelParametrosReportesChequePostFechado, this.jScrollPanelDatosChequePostFechado,this.jPanelPaginacionChequePostFechado, this.jScrollPanelDatosEdicionChequePostFechado, this.jPanelAccionesChequePostFechado,this.jPanelAccionesFormularioChequePostFechado,this.jmenuBarChequePostFechado,this.jmenuBarDetalleChequePostFechado,this.jTtoolBarChequePostFechado,this.jTtoolBarDetalleChequePostFechado);		
		
		final JTabbedPane jTabbedPaneBusquedasChequePostFechado=this.jTabbedPaneBusquedasChequePostFechado; 
		
		final JPanel jPanelParametrosReportesChequePostFechado=this.jPanelParametrosReportesChequePostFechado;
		//final JScrollPane jScrollPanelDatosChequePostFechado=this.jScrollPanelDatosChequePostFechado;
		final JTable jTableDatosChequePostFechado=this.jTableDatosChequePostFechado;		
		final JPanel jPanelPaginacionChequePostFechado=this.jPanelPaginacionChequePostFechado;
		//final JScrollPane jScrollPanelDatosEdicionChequePostFechado=this.jScrollPanelDatosEdicionChequePostFechado;
		final JPanel jPanelAccionesChequePostFechado=this.jPanelAccionesChequePostFechado;
		
		JPanel jPanelCamposAuxiliarChequePostFechado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarChequePostFechado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			jPanelCamposAuxiliarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jPanelCamposChequePostFechado;
			jPanelAccionesFormularioAuxiliarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jPanelAccionesFormularioChequePostFechado;
		}
		
		final JPanel jPanelCamposChequePostFechado=jPanelCamposAuxiliarChequePostFechado;
		final JPanel jPanelAccionesFormularioChequePostFechado=jPanelAccionesFormularioAuxiliarChequePostFechado;
		
		
		final JMenuBar jmenuBarChequePostFechado=this.jmenuBarChequePostFechado;
		final JToolBar jTtoolBarChequePostFechado=this.jTtoolBarChequePostFechado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarChequePostFechado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarChequePostFechado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			jmenuBarDetalleAuxiliarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jmenuBarDetalleChequePostFechado;
			jTtoolBarDetalleAuxiliarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jTtoolBarDetalleChequePostFechado;
		}
		
		final JMenuBar jmenuBarDetalleChequePostFechado=jmenuBarDetalleAuxiliarChequePostFechado;
		final JToolBar jTtoolBarDetalleChequePostFechado=jTtoolBarDetalleAuxiliarChequePostFechado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasChequePostFechado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesChequePostFechado;
			processRunnable.jTableDatos=jTableDatosChequePostFechado;
			processRunnable.jPanelCampos=jPanelCamposChequePostFechado;
			processRunnable.jPanelPaginacion=jPanelPaginacionChequePostFechado;
			processRunnable.jPanelAcciones=jPanelAccionesChequePostFechado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioChequePostFechado;
			
			
			processRunnable.jmenuBar=jmenuBarChequePostFechado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleChequePostFechado;
			processRunnable.jTtoolBar=jTtoolBarChequePostFechado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleChequePostFechado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasChequePostFechado ,jPanelParametrosReportesChequePostFechado,jTableDatosChequePostFechado, /*jScrollPanelDatosChequePostFechado,*/jPanelCamposChequePostFechado,jPanelPaginacionChequePostFechado, /*jScrollPanelDatosEdicionChequePostFechado,*/ jPanelAccionesChequePostFechado,jPanelAccionesFormularioChequePostFechado,jmenuBarChequePostFechado,jmenuBarDetalleChequePostFechado,jTtoolBarChequePostFechado,jTtoolBarDetalleChequePostFechado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasChequePostFechado ,jPanelParametrosReportesChequePostFechado, jScrollPanelDatosChequePostFechado,jPanelPaginacionChequePostFechado, jScrollPanelDatosEdicionChequePostFechado, jPanelAccionesChequePostFechado,jPanelAccionesFormularioChequePostFechado,jmenuBarChequePostFechado,jmenuBarDetalleChequePostFechado,jTtoolBarChequePostFechado,jTtoolBarDetalleChequePostFechado);
						
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
	
	public void finishProcessChequePostFechado() {// throws Exception 
		this.finishProcessChequePostFechado(true);
	}
	
	public void finishProcessChequePostFechado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasChequePostFechado ,this.jPanelParametrosReportesChequePostFechado, this.jScrollPanelDatosChequePostFechado,this.jPanelPaginacionChequePostFechado, this.jScrollPanelDatosEdicionChequePostFechado, this.jPanelAccionesChequePostFechado,this.jPanelAccionesFormularioChequePostFechado,this.jmenuBarChequePostFechado,this.jmenuBarDetalleChequePostFechado,this.jTtoolBarChequePostFechado,this.jTtoolBarDetalleChequePostFechado);		
		
		final JTabbedPane jTabbedPaneBusquedasChequePostFechado=this.jTabbedPaneBusquedasChequePostFechado; 
		
		final JPanel jPanelParametrosReportesChequePostFechado=this.jPanelParametrosReportesChequePostFechado;
		//final JScrollPane jScrollPanelDatosChequePostFechado=this.jScrollPanelDatosChequePostFechado;
		final JTable jTableDatosChequePostFechado=this.jTableDatosChequePostFechado;		
		final JPanel jPanelPaginacionChequePostFechado=this.jPanelPaginacionChequePostFechado;
		//final JScrollPane jScrollPanelDatosEdicionChequePostFechado=this.jScrollPanelDatosEdicionChequePostFechado;
		final JPanel jPanelAccionesChequePostFechado=this.jPanelAccionesChequePostFechado;
		
		JPanel jPanelCamposAuxiliarChequePostFechado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarChequePostFechado=new JPanel();
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			jPanelCamposAuxiliarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jPanelCamposChequePostFechado;
			jPanelAccionesFormularioAuxiliarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jPanelAccionesFormularioChequePostFechado;
		}
		
		final JPanel jPanelCamposChequePostFechado=jPanelCamposAuxiliarChequePostFechado;
		final JPanel jPanelAccionesFormularioChequePostFechado=jPanelAccionesFormularioAuxiliarChequePostFechado;
		
		
		final JMenuBar jmenuBarChequePostFechado=this.jmenuBarChequePostFechado;		
		final JToolBar jTtoolBarChequePostFechado=this.jTtoolBarChequePostFechado;
				
		JMenuBar jmenuBarDetalleAuxiliarChequePostFechado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarChequePostFechado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			jmenuBarDetalleAuxiliarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jmenuBarDetalleChequePostFechado;
			jTtoolBarDetalleAuxiliarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jTtoolBarDetalleChequePostFechado;		
		}
		
		final JMenuBar jmenuBarDetalleChequePostFechado=jmenuBarDetalleAuxiliarChequePostFechado;
		final JToolBar jTtoolBarDetalleChequePostFechado=jTtoolBarDetalleAuxiliarChequePostFechado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasChequePostFechado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesChequePostFechado;
			processRunnable.jTableDatos=jTableDatosChequePostFechado;
			processRunnable.jPanelCampos=jPanelCamposChequePostFechado;
			processRunnable.jPanelPaginacion=jPanelPaginacionChequePostFechado;
			processRunnable.jPanelAcciones=jPanelAccionesChequePostFechado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioChequePostFechado;
			
			
			processRunnable.jmenuBar=jmenuBarChequePostFechado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleChequePostFechado;
			processRunnable.jTtoolBar=jTtoolBarChequePostFechado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleChequePostFechado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasChequePostFechado ,jPanelParametrosReportesChequePostFechado, jTableDatosChequePostFechado,/*jScrollPanelDatosChequePostFechado,*/jPanelCamposChequePostFechado,jPanelPaginacionChequePostFechado, /*jScrollPanelDatosEdicionChequePostFechado,*/ jPanelAccionesChequePostFechado,jPanelAccionesFormularioChequePostFechado,jmenuBarChequePostFechado,jmenuBarDetalleChequePostFechado,jTtoolBarChequePostFechado,jTtoolBarDetalleChequePostFechado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesChequePostFechado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarChequePostFechado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuChequePostFechado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarChequePostFechado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarChequePostFechado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleChequePostFechado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuChequePostFechado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarChequePostFechado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleChequePostFechado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.chequepostfechadoConstantesFunciones.getsFinalQueryChequePostFechado();
		String  finalQueryPaginacionTodos=this.chequepostfechadoConstantesFunciones.getsFinalQueryChequePostFechado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ChequePostFechadoConstantesFunciones.getArrayColumnasGlobalesNoChequePostFechado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ChequePostFechadoConstantesFunciones.getArrayColumnasGlobalesChequePostFechado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ChequePostFechadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.chequepostfechadosEliminados= new ArrayList<ChequePostFechado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessChequePostFechado();
		
				///*ChequePostFechadoSessionBean*/this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			
			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
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
					this.iNumeroPaginacion=ChequePostFechadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ChequePostFechadoConstantesFunciones.getClassesForeignKeysOfChequePostFechado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/chequepostfechado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			chequepostfechadosAux= new ArrayList<ChequePostFechado>();
			
				
			chequepostfechadoLogic.setDatosCliente(this.datosCliente);
			chequepostfechadoLogic.setDatosDeep(this.datosDeep);
			chequepostfechadoLogic.setIsConDeep(true);
			
			
			chequepostfechadoLogic.getChequePostFechadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					chequepostfechadoLogic.getTodosChequePostFechados(finalQueryGlobal,pagination);
					
					//chequepostfechadoLogic.getTodosChequePostFechadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(chequepostfechadoLogic.getChequePostFechados()==null|| chequepostfechadoLogic.getChequePostFechados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							chequepostfechadosAux= new ArrayList<ChequePostFechado>();
							chequepostfechadosAux.addAll(chequepostfechadoLogic.getChequePostFechados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechadosAux= new ArrayList<ChequePostFechado>();
							chequepostfechadosAux.addAll(chequepostfechados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							chequepostfechadoLogic.getTodosChequePostFechados(finalQueryGlobal+"",this.pagination);												
							
							//chequepostfechadoLogic.getTodosChequePostFechadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteChequePostFechados("Todos",chequepostfechadoLogic.getChequePostFechados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							chequepostfechadoLogic.setChequePostFechados(new ArrayList<ChequePostFechado>());					
							chequepostfechadoLogic.getChequePostFechados().addAll(chequepostfechadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechados=new ArrayList<ChequePostFechado>();
							chequepostfechados.addAll(chequepostfechadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idChequePostFechado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idChequePostFechado=this.idActual;
				
				} else if(this.idChequePostFechadoActual!=null && this.idChequePostFechadoActual!=0L) {
					idChequePostFechado=idChequePostFechadoActual;
				}
				
					
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndicePorId(idChequePostFechado);
				
				this.chequepostfechados=new ArrayList<ChequePostFechado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					chequepostfechadoLogic.getEntity(idChequePostFechado);
					
					//chequepostfechadoLogic.getEntityWithConnection(idChequePostFechado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.setChequePostFechados(new ArrayList<ChequePostFechado>());
					chequepostfechadoLogic.getChequePostFechados().add(chequepostfechadoLogic.getChequePostFechado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechados=new ArrayList<ChequePostFechado>();
					this.chequepostfechados.add(chequepostfechado);
				}
				
				if(chequepostfechadoLogic.getChequePostFechado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAsientoContable")) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					chequepostfechadoLogic.getChequePostFechadosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=chequepostfechadoLogic.getChequePostFechados()==null||chequepostfechadoLogic.getChequePostFechados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=chequepostfechados==null|| chequepostfechados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadosAux=new ArrayList<ChequePostFechado>();
						chequepostfechadosAux.addAll(chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechadosAux=new ArrayList<ChequePostFechado>();
							chequepostfechadosAux.addAll(chequepostfechados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							chequepostfechadoLogic.getChequePostFechadosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteChequePostFechados("FK_IdAsientoContable",chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteChequePostFechados("FK_IdAsientoContable",chequepostfechados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.setChequePostFechados(new ArrayList<ChequePostFechado>());
						chequepostfechadoLogic.getChequePostFechados().addAll(chequepostfechadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechados=new ArrayList<ChequePostFechado>();
							chequepostfechados.addAll(chequepostfechadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					chequepostfechadoLogic.getChequePostFechadosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=chequepostfechadoLogic.getChequePostFechados()==null||chequepostfechadoLogic.getChequePostFechados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=chequepostfechados==null|| chequepostfechados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadosAux=new ArrayList<ChequePostFechado>();
						chequepostfechadosAux.addAll(chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechadosAux=new ArrayList<ChequePostFechado>();
							chequepostfechadosAux.addAll(chequepostfechados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							chequepostfechadoLogic.getChequePostFechadosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteChequePostFechados("FK_IdCliente",chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteChequePostFechados("FK_IdCliente",chequepostfechados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.setChequePostFechados(new ArrayList<ChequePostFechado>());
						chequepostfechadoLogic.getChequePostFechados().addAll(chequepostfechadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechados=new ArrayList<ChequePostFechado>();
							chequepostfechados.addAll(chequepostfechadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					chequepostfechadoLogic.getChequePostFechadosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=chequepostfechadoLogic.getChequePostFechados()==null||chequepostfechadoLogic.getChequePostFechados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=chequepostfechados==null|| chequepostfechados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadosAux=new ArrayList<ChequePostFechado>();
						chequepostfechadosAux.addAll(chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechadosAux=new ArrayList<ChequePostFechado>();
							chequepostfechadosAux.addAll(chequepostfechados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							chequepostfechadoLogic.getChequePostFechadosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteChequePostFechados("FK_IdEjercicio",chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteChequePostFechados("FK_IdEjercicio",chequepostfechados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.setChequePostFechados(new ArrayList<ChequePostFechado>());
						chequepostfechadoLogic.getChequePostFechados().addAll(chequepostfechadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechados=new ArrayList<ChequePostFechado>();
							chequepostfechados.addAll(chequepostfechadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					chequepostfechadoLogic.getChequePostFechadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=chequepostfechadoLogic.getChequePostFechados()==null||chequepostfechadoLogic.getChequePostFechados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=chequepostfechados==null|| chequepostfechados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadosAux=new ArrayList<ChequePostFechado>();
						chequepostfechadosAux.addAll(chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechadosAux=new ArrayList<ChequePostFechado>();
							chequepostfechadosAux.addAll(chequepostfechados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							chequepostfechadoLogic.getChequePostFechadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteChequePostFechados("FK_IdEmpresa",chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteChequePostFechados("FK_IdEmpresa",chequepostfechados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.setChequePostFechados(new ArrayList<ChequePostFechado>());
						chequepostfechadoLogic.getChequePostFechados().addAll(chequepostfechadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechados=new ArrayList<ChequePostFechado>();
							chequepostfechados.addAll(chequepostfechadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					chequepostfechadoLogic.getChequePostFechadosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=chequepostfechadoLogic.getChequePostFechados()==null||chequepostfechadoLogic.getChequePostFechados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=chequepostfechados==null|| chequepostfechados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadosAux=new ArrayList<ChequePostFechado>();
						chequepostfechadosAux.addAll(chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechadosAux=new ArrayList<ChequePostFechado>();
							chequepostfechadosAux.addAll(chequepostfechados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							chequepostfechadoLogic.getChequePostFechadosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteChequePostFechados("FK_IdPeriodo",chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteChequePostFechados("FK_IdPeriodo",chequepostfechados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.setChequePostFechados(new ArrayList<ChequePostFechado>());
						chequepostfechadoLogic.getChequePostFechados().addAll(chequepostfechadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechados=new ArrayList<ChequePostFechado>();
							chequepostfechados.addAll(chequepostfechadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					chequepostfechadoLogic.getChequePostFechadosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=chequepostfechadoLogic.getChequePostFechados()==null||chequepostfechadoLogic.getChequePostFechados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=chequepostfechados==null|| chequepostfechados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadosAux=new ArrayList<ChequePostFechado>();
						chequepostfechadosAux.addAll(chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechadosAux=new ArrayList<ChequePostFechado>();
							chequepostfechadosAux.addAll(chequepostfechados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							chequepostfechadoLogic.getChequePostFechadosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteChequePostFechados("FK_IdSucursal",chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteChequePostFechados("FK_IdSucursal",chequepostfechados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.setChequePostFechados(new ArrayList<ChequePostFechado>());
						chequepostfechadoLogic.getChequePostFechados().addAll(chequepostfechadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechados=new ArrayList<ChequePostFechado>();
							chequepostfechados.addAll(chequepostfechadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFormaPago")) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					chequepostfechadoLogic.getChequePostFechadosFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=chequepostfechadoLogic.getChequePostFechados()==null||chequepostfechadoLogic.getChequePostFechados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=chequepostfechados==null|| chequepostfechados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadosAux=new ArrayList<ChequePostFechado>();
						chequepostfechadosAux.addAll(chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechadosAux=new ArrayList<ChequePostFechado>();
							chequepostfechadosAux.addAll(chequepostfechados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							chequepostfechadoLogic.getChequePostFechadosFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequePostFechadoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteChequePostFechados("FK_IdTipoFormaPago",chequepostfechadoLogic.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteChequePostFechados("FK_IdTipoFormaPago",chequepostfechados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoLogic.setChequePostFechados(new ArrayList<ChequePostFechado>());
						chequepostfechadoLogic.getChequePostFechados().addAll(chequepostfechadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechados=new ArrayList<ChequePostFechado>();
							chequepostfechados.addAll(chequepostfechadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesChequePostFechado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessChequePostFechado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=chequepostfechadoLogic.getChequePostFechados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=chequepostfechados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=chequepostfechadoLogic.getChequePostFechados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=chequepostfechados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ChequePostFechado chequepostfechado) {
		Boolean permite=true;
		
		if(this.chequepostfechado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ChequePostFechadoConstantesFunciones.getOrderByListaChequePostFechado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ChequePostFechadoConstantesFunciones.getOrderByListaChequePostFechado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequePostFechado chequepostfechado:chequepostfechadoLogic.getChequePostFechados()) {
				if(chequepostfechado.getsType().equals(Constantes2.S_TOTALES)) {
					chequepostfechadoTotales=chequepostfechado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequePostFechado chequepostfechado:this.chequepostfechados) {
				if(chequepostfechado.getsType().equals(Constantes2.S_TOTALES)) {
					chequepostfechadoTotales=chequepostfechado;
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
			this.chequepostfechadoAux=new ChequePostFechado();
			this.chequepostfechadoAux.setsType(Constantes2.S_TOTALES);
			this.chequepostfechadoAux.setIsNew(false);
			this.chequepostfechadoAux.setIsChanged(false);
			this.chequepostfechadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ChequePostFechadoConstantesFunciones.TotalizarValoresFilaChequePostFechado(this.chequepostfechadoLogic.getChequePostFechados(),this.chequepostfechadoAux);
				
				this.chequepostfechadoLogic.getChequePostFechados().add(this.chequepostfechadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ChequePostFechadoConstantesFunciones.TotalizarValoresFilaChequePostFechado(this.chequepostfechados,this.chequepostfechadoAux);
				
				this.chequepostfechados.add(this.chequepostfechadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		chequepostfechadoTotales=new ChequePostFechado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.chequepostfechadoLogic.getChequePostFechados().remove(chequepostfechadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.chequepostfechados.remove(chequepostfechadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		chequepostfechadoTotales=new ChequePostFechado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequePostFechado chequepostfechado:chequepostfechadoLogic.getChequePostFechados()) {
				if(chequepostfechado.getsType().equals(Constantes2.S_TOTALES)) {
					chequepostfechadoTotales=chequepostfechado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ChequePostFechadoConstantesFunciones.TotalizarValoresFilaChequePostFechado(this.chequepostfechadoLogic.getChequePostFechados(),chequepostfechadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequePostFechado chequepostfechado:this.chequepostfechados) {
				if(chequepostfechado.getsType().equals(Constantes2.S_TOTALES)) {
					chequepostfechadoTotales=chequepostfechado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ChequePostFechadoConstantesFunciones.TotalizarValoresFilaChequePostFechado(this.chequepostfechados,chequepostfechadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getChequePostFechadosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getChequePostFechadosFK_IdAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getChequePostFechadosFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getChequePostFechadosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getChequePostFechadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getChequePostFechadosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getChequePostFechadosFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getChequePostFechadosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getChequePostFechadosFK_IdTipoFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getChequePostFechadosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.getChequePostFechadosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getChequePostFechadosFK_IdAsientoContable(String sFinalQuery,Long id_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.getChequePostFechadosFK_IdAsientoContable(sFinalQuery,this.pagination,id_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getChequePostFechadosFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.getChequePostFechadosFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getChequePostFechadosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.getChequePostFechadosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getChequePostFechadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.getChequePostFechadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getChequePostFechadosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.getChequePostFechadosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getChequePostFechadosFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.getChequePostFechadosFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getChequePostFechadosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.getChequePostFechadosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getChequePostFechadosFK_IdTipoFormaPago(String sFinalQuery,Long id_tipo_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLogic.getChequePostFechadosFK_IdTipoFormaPago(sFinalQuery,this.pagination,id_tipo_forma_pago);
				
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
	
	public void inicializarPermisosChequePostFechado() {
		this.isPermisoTodoChequePostFechado=false;
		this.isPermisoNuevoChequePostFechado=false;
		this.isPermisoActualizarChequePostFechado=false;
		this.isPermisoActualizarOriginalChequePostFechado=false;
		this.isPermisoEliminarChequePostFechado=false;
		this.isPermisoGuardarCambiosChequePostFechado=false;
		this.isPermisoConsultaChequePostFechado=false;
		this.isPermisoBusquedaChequePostFechado=false;
		this.isPermisoReporteChequePostFechado=false;		
		this.isPermisoOrdenChequePostFechado=false;		
		this.isPermisoPaginacionMedioChequePostFechado=false;		
		this.isPermisoPaginacionAltoChequePostFechado=false;
		this.isPermisoPaginacionTodoChequePostFechado=false;
		this.isPermisoCopiarChequePostFechado=false;		
		this.isPermisoVerFormChequePostFechado=false;		
		this.isPermisoDuplicarChequePostFechado=false;		
		this.isPermisoOrdenChequePostFechado=false;		
	}
	
	public void setPermisosUsuarioChequePostFechado(Boolean isPermiso) {
		this.isPermisoTodoChequePostFechado=isPermiso;
		this.isPermisoNuevoChequePostFechado=isPermiso;
		this.isPermisoActualizarChequePostFechado=isPermiso;
		this.isPermisoActualizarOriginalChequePostFechado=isPermiso;
		this.isPermisoEliminarChequePostFechado=isPermiso;
		this.isPermisoGuardarCambiosChequePostFechado=isPermiso;
		this.isPermisoConsultaChequePostFechado=isPermiso;
		this.isPermisoBusquedaChequePostFechado=isPermiso;
		this.isPermisoReporteChequePostFechado=isPermiso;
		this.isPermisoOrdenChequePostFechado=isPermiso;		
		this.isPermisoPaginacionMedioChequePostFechado=isPermiso;		
		this.isPermisoPaginacionAltoChequePostFechado=isPermiso;		
		this.isPermisoPaginacionTodoChequePostFechado=isPermiso;		
		this.isPermisoCopiarChequePostFechado=isPermiso;		
		this.isPermisoVerFormChequePostFechado=isPermiso;		
		this.isPermisoDuplicarChequePostFechado=isPermiso;
		this.isPermisoOrdenChequePostFechado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioChequePostFechado(Boolean isPermiso) {
		//this.isPermisoTodoChequePostFechado=isPermiso;
		this.isPermisoNuevoChequePostFechado=isPermiso;
		this.isPermisoActualizarChequePostFechado=isPermiso;
		this.isPermisoActualizarOriginalChequePostFechado=isPermiso;
		this.isPermisoEliminarChequePostFechado=isPermiso;
		this.isPermisoGuardarCambiosChequePostFechado=isPermiso;
		//this.isPermisoConsultaChequePostFechado=isPermiso;
		//this.isPermisoBusquedaChequePostFechado=isPermiso;
		//this.isPermisoReporteChequePostFechado=isPermiso;
		//this.isPermisoOrdenChequePostFechado=isPermiso;		
		//this.isPermisoPaginacionMedioChequePostFechado=isPermiso;		
		//this.isPermisoPaginacionAltoChequePostFechado=isPermiso;		
		//this.isPermisoPaginacionTodoChequePostFechado=isPermiso;		
		//this.isPermisoCopiarChequePostFechado=isPermiso;		
		//this.isPermisoDuplicarChequePostFechado=isPermiso;
		//this.isPermisoOrdenChequePostFechado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioChequePostFechadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ChequePostFechadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebChequePostFechado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioChequePostFechadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioChequePostFechadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionChequePostFechadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioChequePostFechadoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioChequePostFechado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ChequePostFechadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ChequePostFechadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoChequePostFechado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarChequePostFechado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalChequePostFechado=this.isPermisoActualizarChequePostFechado;
			this.isPermisoEliminarChequePostFechado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosChequePostFechado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaChequePostFechado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaChequePostFechado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoChequePostFechado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteChequePostFechado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenChequePostFechado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioChequePostFechado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoChequePostFechado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoChequePostFechado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarChequePostFechado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormChequePostFechado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarChequePostFechado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenChequePostFechado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosChequePostFechado.setToolTipText(this.jTableDatosChequePostFechado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioChequePostFechado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioChequePostFechado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ChequePostFechadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ChequePostFechadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioChequePostFechado() throws Exception {
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
	public void inicializarCombosForeignKeyChequePostFechadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.asientocontablesForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.tipoformapagosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyChequePostFechadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ChequePostFechadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyChequePostFechadoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyChequePostFechadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ChequePostFechadoParameterReturnGeneral chequepostfechadoReturnGeneral=new ChequePostFechadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.chequepostfechadoConstantesFunciones.cargarid_empresaChequePostFechado)
					 || (this.esRecargarFks && this.chequepostfechadoConstantesFunciones.cargarid_empresaChequePostFechado)) {

					if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+chequepostfechadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.chequepostfechadoConstantesFunciones.cargarid_sucursalChequePostFechado)
					 || (this.esRecargarFks && this.chequepostfechadoConstantesFunciones.cargarid_sucursalChequePostFechado)) {

					if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+chequepostfechadoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.chequepostfechadoConstantesFunciones.cargarid_clienteChequePostFechado)
					 || (this.esRecargarFks && this.chequepostfechadoConstantesFunciones.cargarid_clienteChequePostFechado)) {

					if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+chequepostfechadoSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalAsientoContable="";

				if(((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0) && this.chequepostfechadoConstantesFunciones.cargarid_asiento_contableChequePostFechado)
					 || (this.esRecargarFks && this.chequepostfechadoConstantesFunciones.cargarid_asiento_contableChequePostFechado)) {

					if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAsientoContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

						finalQueryGlobalAsientoContable=Funciones.GetFinalQueryAppend(finalQueryGlobalAsientoContable, "");
						finalQueryGlobalAsientoContable+=AsientoContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAsientoContable=" WHERE " + ConstantesSql.ID + "="+chequepostfechadoSessionBean.getlidAsientoContableActual();
					}
				} else {
					finalQueryGlobalAsientoContable="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.chequepostfechadoConstantesFunciones.cargarid_ejercicioChequePostFechado)
					 || (this.esRecargarFks && this.chequepostfechadoConstantesFunciones.cargarid_ejercicioChequePostFechado)) {

					if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+chequepostfechadoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.chequepostfechadoConstantesFunciones.cargarid_periodoChequePostFechado)
					 || (this.esRecargarFks && this.chequepostfechadoConstantesFunciones.cargarid_periodoChequePostFechado)) {

					if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+chequepostfechadoSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalTipoFormaPago="";

				if(((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0) && this.chequepostfechadoConstantesFunciones.cargarid_tipo_forma_pagoChequePostFechado)
					 || (this.esRecargarFks && this.chequepostfechadoConstantesFunciones.cargarid_tipo_forma_pagoChequePostFechado)) {

					if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFormaPago, "");
						finalQueryGlobalTipoFormaPago+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFormaPago=" WHERE " + ConstantesSql.ID + "="+chequepostfechadoSessionBean.getlidTipoFormaPagoActual();
					}
				} else {
					finalQueryGlobalTipoFormaPago="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.chequepostfechadoConstantesFunciones.cargarid_anioChequePostFechado)
					 || (this.esRecargarFks && this.chequepostfechadoConstantesFunciones.cargarid_anioChequePostFechado)) {

					if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+chequepostfechadoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.chequepostfechadoConstantesFunciones.cargarid_mesChequePostFechado)
					 || (this.esRecargarFks && this.chequepostfechadoConstantesFunciones.cargarid_mesChequePostFechado)) {

					if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+chequepostfechadoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				chequepostfechadoReturnGeneral=chequepostfechadoLogic.cargarCombosLoteForeignKeyChequePostFechado(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente,finalQueryGlobalAsientoContable,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalTipoFormaPago,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=chequepostfechadoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=chequepostfechadoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=chequepostfechadoReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalAsientoContable.equals("NONE")) {
				this.asientocontablesForeignKey=chequepostfechadoReturnGeneral.getasientocontablesForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=chequepostfechadoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=chequepostfechadoReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalTipoFormaPago.equals("NONE")) {
				this.tipoformapagosForeignKey=chequepostfechadoReturnGeneral.gettipoformapagosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=chequepostfechadoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=chequepostfechadoReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyChequePostFechado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyAsientoContable();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyTipoFormaPago();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.chequepostfechadoSessionBean==null) {
				this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyAsientoContable()throws Exception {
		try {

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoFormaPago()throws Exception {
		try {

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.chequepostfechadoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyChequePostFechado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyChequePostFechado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyChequePostFechado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.chequepostfechado.setfecha_vencimiento(this.parametroGeneralUsuario.getfecha_sistema());
				this.chequepostfechado.setfecha_vencimiento_original(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyChequePostFechado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyChequePostFechado(ChequePostFechado chequepostfechado)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(chequepostfechado.getid_cliente(),false,"Formulario");
			this.setActualAsientoContableForeignKey(chequepostfechado.getid_asiento_contable(),false,"Formulario");
			this.setActualTipoFormaPagoForeignKey(chequepostfechado.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyChequePostFechado(ChequePostFechado chequepostfechado,String sTipoEvento)throws Exception {	
		try {
			
			

				if(chequepostfechado.getCliente()!=null && !sTipoEvento.equals("id_clienteChequePostFechado")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(chequepostfechado.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				if(chequepostfechado.getAsientoContable()!=null && !sTipoEvento.equals("id_asiento_contableChequePostFechado")) { //sTipoEvento Evita Bucle Infinito

					this.asientocontablesForeignKey=new ArrayList<AsientoContable>();
					this.asientocontablesForeignKey.add(chequepostfechado.getAsientoContable());

					this.addItemDefectoCombosForeignKeyAsientoContable();
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyChequePostFechado()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.chequepostfechadoConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualAsientoContableForeignKey(this.chequepostfechadoConstantesFunciones.getid_asiento_contable(),false,"Formulario");
			this.setActualTipoFormaPagoForeignKey(this.chequepostfechadoConstantesFunciones.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyChequePostFechado()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyChequePostFechado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyChequePostFechado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroChequePostFechado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyChequePostFechado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameAsientoContablesForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyChequePostFechado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyChequePostFechado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public ChequePostFechadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ChequePostFechadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ChequePostFechadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean(); 
		this.chequepostfechadoConstantesFunciones=new ChequePostFechadoConstantesFunciones(); 
		this.chequepostfechadoBean=new ChequePostFechado();//(this.chequepostfechadoConstantesFunciones); 		
		this.chequepostfechadoReturnGeneral=new ChequePostFechadoParameterReturnGeneral(); 
		
		this.chequepostfechadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.chequepostfechadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ChequePostFechadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ChequePostFechadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ChequePostFechadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessChequePostFechado(true);
			
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
			
			this.chequepostfechadoConstantesFunciones=new ChequePostFechadoConstantesFunciones(); 
			this.chequepostfechadoBean=new ChequePostFechado();//this.chequepostfechadoConstantesFunciones); 			
			this.chequepostfechadoReturnGeneral=new ChequePostFechadoParameterReturnGeneral(); 
		
			ChequePostFechadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cheque Post Fechado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.chequepostfechado=new ChequePostFechado();
			this.chequepostfechados = new ArrayList<ChequePostFechado>();
			this.chequepostfechadosAux = new ArrayList<ChequePostFechado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic=new ChequePostFechadoLogic();
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}
			
			//this.chequepostfechadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.chequepostfechadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormChequePostFechado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoChequePostFechado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoChequePostFechado);	
					}
					
					if(this.jInternalFrameImportacionChequePostFechado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionChequePostFechado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByChequePostFechado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByChequePostFechado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormChequePostFechado);
				this.jInternalFrameDetalleFormChequePostFechado.setVisible(false);
				this.jInternalFrameDetalleFormChequePostFechado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoChequePostFechado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoChequePostFechado);
					this.jInternalFrameReporteDinamicoChequePostFechado.setVisible(false);
					this.jInternalFrameReporteDinamicoChequePostFechado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionChequePostFechado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionChequePostFechado);
					this.jInternalFrameImportacionChequePostFechado.setVisible(false);
					this.jInternalFrameImportacionChequePostFechado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByChequePostFechado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByChequePostFechado);
					this.jInternalFrameOrderByChequePostFechado.setVisible(false);
					this.jInternalFrameOrderByChequePostFechado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idChequePostFechadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ChequePostFechadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.chequepostfechadoReturnGeneral=new ChequePostFechadoParameterReturnGeneral();
			
			this.chequepostfechadoParameterGeneral=new ChequePostFechadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.chequepostfechadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ChequePostFechadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ChequePostFechadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.chequepostfechadoSessionBean.getEsGuardarRelacionado(),this.chequepostfechadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ChequePostFechadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.chequepostfechadoSessionBean.getEsGuardarRelacionado(),this.chequepostfechadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoChequePostFechado=false;
			this.isVisibilidadCeldaDuplicarChequePostFechado=true;
			this.isVisibilidadCeldaCopiarChequePostFechado=true;
			this.isVisibilidadCeldaVerFormChequePostFechado=true;
			this.isVisibilidadCeldaOrdenChequePostFechado=true;
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;
			this.isVisibilidadCeldaModificarChequePostFechado=false;
			this.isVisibilidadCeldaActualizarChequePostFechado=false;
			this.isVisibilidadCeldaEliminarChequePostFechado=false;
			this.isVisibilidadCeldaCancelarChequePostFechado=false;
			this.isVisibilidadCeldaGuardarChequePostFechado=false;
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdAsientoContable=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoFormaPago=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesChequePostFechado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosChequePostFechado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioChequePostFechado(false);
			
			this.setPermisosUsuarioChequePostFechado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado() 
				|| (this.chequepostfechadoSessionBean.getEsGuardarRelacionado() && this.chequepostfechadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioChequePostFechadoClasesRelacionadas();
			}
			
			if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioChequePostFechadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosChequePostFechado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualChequePostFechado();
			}
			
			if(!this.isPermisoBusquedaChequePostFechado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasChequePostFechado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioChequePostFechado,this.isPermisoPaginacionMedioChequePostFechado,this.isPermisoPaginacionTodoChequePostFechado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ChequePostFechadoConstantesFunciones.getTiposSeleccionarChequePostFechado());
				
				this.tiposColumnasSelect=ChequePostFechadoConstantesFunciones.getTiposSeleccionarChequePostFechado(true);
				
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
			//if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioChequePostFechado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioChequePostFechado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioChequePostFechado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesChequePostFechado() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.asientocontableLogic=new AsientoContableLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.tipoformapagoLogic=new TipoFormaPagoLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				chequepostfechadoImplementable= (ChequePostFechadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ChequePostFechadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				chequepostfechadoImplementableHome= (ChequePostFechadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ChequePostFechadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.chequepostfechados= new ArrayList<ChequePostFechado>();
			this.chequepostfechadosEliminados= new ArrayList<ChequePostFechado>();
						
			this.isEsNuevoChequePostFechado=false;
			this.esParaAccionDesdeFormularioChequePostFechado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			this.idAsientoContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyChequePostFechado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroChequePostFechado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ChequePostFechadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ChequePostFechadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesChequePostFechado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingChequePostFechado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioChequePostFechado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioChequePostFechado();
			}
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasChequePostFechado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasChequePostFechado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasChequePostFechado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessChequePostFechado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ChequePostFechado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectChequePostFechado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesChequePostFechado")) {
				iIndex=this.jInternalFrameDetalleFormChequePostFechado.jTabbedPaneRelacionesChequePostFechado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormChequePostFechado.jTabbedPaneRelacionesChequePostFechado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessChequePostFechado();	
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
	
	public void cargarCombosForeignKeyChequePostFechado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyChequePostFechado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyChequePostFechado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyChequePostFechadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyChequePostFechado();
		
		this.cargarCombosFrameForeignKeyChequePostFechado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyChequePostFechado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyChequePostFechado();
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

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoChequePostFechadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
			
			if(jTableDatosChequePostFechado.getRowCount()>=1) {
				jTableDatosChequePostFechado.removeRowSelectionInterval(0, jTableDatosChequePostFechado.getRowCount()-1);						
			}
			
			this.isEsNuevoChequePostFechado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoChequePostFechado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesChequePostFechado(true);			
			//this.chequepostfechado=new ChequePostFechado();
			//this.chequepostfechado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesChequePostFechado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualChequePostFechado() ;
			
			if(ChequePostFechadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleChequePostFechado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.chequepostfechado);	
			this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);				
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
			if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ChequePostFechado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarChequePostFechadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosChequePostFechado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosChequePostFechado.getSelectedRows().length;			
			}
			
			chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoChequePostFechado--;			
				//ChequePostFechado chequepostfechadoAux= new ChequePostFechado();			
				//chequepostfechadoAux.setId(this.iIdNuevoChequePostFechado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ChequePostFechado chequepostfechadoOrigen=new ChequePostFechado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ChequePostFechado chequepostfechadoOrigen : chequepostfechadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							chequepostfechadoOrigen =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequepostfechadoOrigen =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaChequePostFechado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.chequepostfechado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosChequePostFechado(chequepostfechadoOrigen,this.chequepostfechado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.chequepostfechadoLogic.getChequePostFechados().add(this.chequepostfechadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.chequepostfechados.add(this.chequepostfechadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaChequePostFechado(false);
				
				this.jTableDatosChequePostFechado.setRowSelectionInterval(this.getIndiceNuevoChequePostFechado(), this.getIndiceNuevoChequePostFechado());
				
				int iLastRow =  this.jTableDatosChequePostFechado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosChequePostFechado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosChequePostFechado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaChequePostFechado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();									
		
			ChequePostFechado chequepostfechadoOrigen=new ChequePostFechado();
			ChequePostFechado chequepostfechadoDestino=new ChequePostFechado();
				
			chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosChequePostFechado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || chequepostfechadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosChequePostFechado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoOrigen =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						chequepostfechadoOrigen =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						chequepostfechadoDestino =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						chequepostfechadoDestino =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				chequepostfechadoOrigen =chequepostfechadosSeleccionados.get(0);
				chequepostfechadoDestino =chequepostfechadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosChequePostFechado(chequepostfechadoOrigen,chequepostfechadoDestino,true,false);
				
				chequepostfechadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(chequepostfechadoDestino,chequepostfechadoLogic.getChequePostFechados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(chequepostfechadoDestino,chequepostfechados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaChequePostFechado(false);
				
				//this.jTableDatosChequePostFechado.setRowSelectionInterval(this.getIndiceNuevoChequePostFechado(), this.getIndiceNuevoChequePostFechado());
				
				int iLastRow =  this.jTableDatosChequePostFechado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosChequePostFechado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosChequePostFechado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaChequePostFechado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormChequePostFechado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesChequePostFechado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasChequePostFechado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesChequePostFechado.setVisible(!isVisible);
			this.jPanelPaginacionChequePostFechado.setVisible(!isVisible);
			this.jPanelAccionesChequePostFechado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameChequePostFechado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoChequePostFechado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionChequePostFechado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByChequePostFechado();
			
			this.abrirFrameOrderByChequePostFechado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByChequePostFechado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleChequePostFechado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormChequePostFechado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormChequePostFechado.isMaximum()) {
					this.jInternalFrameDetalleFormChequePostFechado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormChequePostFechado.setSize(this.jInternalFrameDetalleFormChequePostFechado.iWidthFormulario,this.jInternalFrameDetalleFormChequePostFechado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormChequePostFechado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormChequePostFechado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormChequePostFechado.isMaximum()) {
						this.jInternalFrameDetalleFormChequePostFechado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormChequePostFechado.jContentPaneDetalleChequePostFechado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormChequePostFechado.jTabbedPaneRelacionesChequePostFechado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormChequePostFechado.jContentPaneDetalleChequePostFechado.getWidth(),ChequePostFechadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormChequePostFechado.jTabbedPaneRelacionesChequePostFechado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormChequePostFechado.jContentPaneDetalleChequePostFechado.getWidth(),ChequePostFechadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormChequePostFechado.jTabbedPaneRelacionesChequePostFechado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormChequePostFechado.jContentPaneDetalleChequePostFechado.getWidth(),ChequePostFechadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormChequePostFechado.setVisible(true);
	        this.jInternalFrameDetalleFormChequePostFechado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByChequePostFechado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByChequePostFechado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByChequePostFechado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByChequePostFechado,false,this);
				} else {
					this.jInternalFrameOrderByChequePostFechado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByChequePostFechado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByChequePostFechado);
				this.jInternalFrameOrderByChequePostFechado.setVisible(false);
				this.jInternalFrameOrderByChequePostFechado.setSelected(false);
				
				this.jInternalFrameOrderByChequePostFechado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByChequePostFechado"));
				
				this.inicializarActualizarBindingTablaOrderByChequePostFechado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionChequePostFechado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionChequePostFechado==null) {
				
				this.jInternalFrameImportacionChequePostFechado=new ImportacionJInternalFrame(ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionChequePostFechado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionChequePostFechado);
				this.jInternalFrameImportacionChequePostFechado.setVisible(false);
				this.jInternalFrameImportacionChequePostFechado.setSelected(false);


				this.jInternalFrameImportacionChequePostFechado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionChequePostFechado"));
				this.jInternalFrameImportacionChequePostFechado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionChequePostFechado"));
				this.jInternalFrameImportacionChequePostFechado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionChequePostFechado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoChequePostFechado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoChequePostFechado==null) {
				this.jInternalFrameReporteDinamicoChequePostFechado=new ReporteDinamicoJInternalFrame(ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoChequePostFechado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoChequePostFechado);
				this.jInternalFrameReporteDinamicoChequePostFechado.setVisible(false);
				this.jInternalFrameReporteDinamicoChequePostFechado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoChequePostFechado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoChequePostFechado"));
				this.jInternalFrameReporteDinamicoChequePostFechado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoChequePostFechado"));
				this.jInternalFrameReporteDinamicoChequePostFechado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoChequePostFechado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualChequePostFechado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleChequePostFechado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormChequePostFechado);
			
	       	this.jInternalFrameDetalleFormChequePostFechado.setVisible(false);
	        this.jInternalFrameDetalleFormChequePostFechado.setSelected(false);
			
			//this.jInternalFrameDetalleFormChequePostFechado.dispose();
			//this.jInternalFrameDetalleFormChequePostFechado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoChequePostFechado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoChequePostFechado.setVisible(true);
	        this.jInternalFrameReporteDinamicoChequePostFechado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionChequePostFechado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionChequePostFechado.setVisible(true);
	        this.jInternalFrameImportacionChequePostFechado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByChequePostFechado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByChequePostFechado.setVisible(true);
	        this.jInternalFrameOrderByChequePostFechado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByChequePostFechado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByChequePostFechado.setVisible(false);
	        this.jInternalFrameOrderByChequePostFechado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoChequePostFechado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoChequePostFechado.setVisible(false);
	        this.jInternalFrameReporteDinamicoChequePostFechado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionChequePostFechado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionChequePostFechado.setVisible(false);
	        this.jInternalFrameImportacionChequePostFechado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarChequePostFechado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarChequePostFechado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesChequePostFechado(true);
			//this.isEsNuevoChequePostFechado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesChequePostFechado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesChequePostFechado(false) ;
			
			if(chequepostfechadoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ChequePostFechadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleChequePostFechado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualChequePostFechado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaChequePostFechadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarChequePostFechado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesChequePostFechado(true);
			//this.isEsNuevoChequePostFechado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.chequepostfechado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesChequePostFechado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesChequePostFechado(false) ;
			
			if(ChequePostFechadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleChequePostFechado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualChequePostFechado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.chequepostfechadoConstantesFunciones.cargarid_clienteChequePostFechado) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingChequePostFechado(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
			
			if(sType.equals("AsientoContable")) {
				if(!this.chequepostfechadoConstantesFunciones.cargarid_asiento_contableChequePostFechado) {
					this.cargarCombosAsientoContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingChequePostFechado(false,false);
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_asiento_contable (id);

				this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosChequePostFechado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAsientoContable(List<AsientoContable> asientocontablesForeignKey)throws Exception{
		TableColumn tableColumnAsientoContable=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE));
		TableCellEditor tableCellEditorAsientoContable =tableColumnAsientoContable.getCellEditor();

		AsientoContableTableCell asientocontableTableCellFk=(AsientoContableTableCell)tableCellEditorAsientoContable;

		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.setasientocontablesForeignKey(asientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosChequePostFechado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//asientocontableTableCellFk.setRowActual(intSelectedRow);
			//asientocontableTableCellFk.setasientocontablesForeignKeyActual(asientocontablesForeignKey);
		//}


		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.RecargarAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaTipoFormaPago(List<TipoFormaPago> tipoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoFormaPago=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO));
		TableCellEditor tableCellEditorTipoFormaPago =tableColumnTipoFormaPago.getCellEditor();

		TipoFormaPagoTableCell tipoformapagoTableCellFk=(TipoFormaPagoTableCell)tableCellEditorTipoFormaPago;

		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.settipoformapagosForeignKey(tipoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosChequePostFechado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipoformapagoTableCellFk.settipoformapagosForeignKeyActual(tipoformapagosForeignKey);
		//}


		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.RecargarTipoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosChequePostFechado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosChequePostFechado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_asiento_contable (Long id) throws Exception {
		this.setActualAsientoContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesChequePostFechado(false);
			
			//if(!this.isEsNuevoChequePostFechado) {								
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				
			}
			
			if(this.permiteMantenimiento(this.chequepostfechado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoChequePostFechado=true;
					this.inicializarActualizarBindingTablaChequePostFechado(false);
					this.isEsNuevoChequePostFechado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoChequePostFechado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoChequePostFechado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesChequePostFechado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualChequePostFechado(false);
				
				this.habilitarDeshabilitarControlesChequePostFechado(false);
			
												
				
				if(ChequePostFechadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleChequePostFechado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoChequePostFechadoActionPerformed(evt,chequepostfechadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualChequePostFechado(this.chequepostfechado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,chequepostfechadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.chequepostfechado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				this.chequepostfechado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				this.chequepostfechado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.chequepostfechado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ChequePostFechadoModel) this.jTableDatosChequePostFechado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoChequePostFechado=true;
				this.inicializarActualizarBindingTablaChequePostFechado(false);
				this.isEsNuevoChequePostFechado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesChequePostFechado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualChequePostFechado(false);
				
				this.habilitarDeshabilitarControlesChequePostFechado(false);
				
				
				
				if(ChequePostFechadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleChequePostFechado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosChequePostFechado.getRowCount()>=1) {
				jTableDatosChequePostFechado.removeRowSelectionInterval(0, jTableDatosChequePostFechado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesChequePostFechado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaChequePostFechado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesChequePostFechado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualChequePostFechado(false) ;
			
			this.isEsNuevoChequePostFechado=false;
			
			if(ChequePostFechadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleChequePostFechado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingChequePostFechado(false);
				
				//SI ES MANUAL
				if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualChequePostFechado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoChequePostFechado--;			
			//ChequePostFechado chequepostfechadoAux= new ChequePostFechado();			
			//chequepostfechadoAux.setId(this.iIdNuevoChequePostFechado);
			
			if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaChequePostFechado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
			
			this.chequepostfechado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.chequepostfechadoLogic.getChequePostFechados().add(this.chequepostfechadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.chequepostfechados.add(this.chequepostfechadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaChequePostFechado(false);
			
			this.jTableDatosChequePostFechado.setRowSelectionInterval(this.getIndiceNuevoChequePostFechado(), this.getIndiceNuevoChequePostFechado());
			
			int iLastRow =  this.jTableDatosChequePostFechado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosChequePostFechado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosChequePostFechado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaChequePostFechado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingChequePostFechado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingChequePostFechado(false);
			
			//SI ES MANUAL
			if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualChequePostFechado();
			}
			
			//this.abrirFrameTreeChequePostFechado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cheque Post FechadoS ?", "MANTENIMIENTO DE Cheque Post Fechado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionChequePostFechado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralChequePostFechado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.chequepostfechadoReturnGeneral=chequepostfechadoLogic.procesarImportacionChequePostFechadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.chequepostfechadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarChequePostFechadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionChequePostFechado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionChequePostFechado.setFileImportacion(this.jInternalFrameImportacionChequePostFechado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionChequePostFechado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionChequePostFechado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionChequePostFechado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionChequePostFechado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();		

		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ChequePostFechadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ChequePostFechadoBaseDesign.jrxml";
			
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
			
			this.generarReporteChequePostFechados("Todos",chequepostfechadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGira_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGira_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGira_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGira_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimientoOriginal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimientoOriginal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimientoOriginal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimientoOriginal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoChequePostFechado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoria="id_asiento_contable";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoria="id_tipo_forma_pago";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA:
					sNombreCampoCategoria="nombre_gira";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					sNombreCampoCategoria="fecha_vencimiento_original";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_asiento_contable";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoriaValor="id_tipo_forma_pago";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA:
					sNombreCampoCategoriaValor="nombre_gira";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					sNombreCampoCategoriaValor="fecha_vencimiento_original";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_asiento_contable");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_forma_pago");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Gira",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_gira");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento Original",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento_original");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();		
		
		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequepostfechado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ChequePostFechados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getasientocontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.gettipoformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getnombre_gira());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getfecha_vencimiento_original());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequePostFechadoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(ChequePostFechado chequepostfechado:chequepostfechadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequepostfechado.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelChequePostFechado(row);				
			//	iRow++;
			//}				
			
			//for(ChequePostFechado chequepostfechadoAux:chequepostfechadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelChequePostFechado(chequepostfechadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
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
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingChequePostFechado(false);
			
			//SI ES MANUAL
			if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualChequePostFechado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingChequePostFechado(false);
			
			//SI ES MANUAL
			if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualChequePostFechado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingChequePostFechado(false);
			
			//SI ES MANUAL
			if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualChequePostFechado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaChequePostFechado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosChequePostFechado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosChequePostFechado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosChequePostFechado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosChequePostFechado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosChequePostFechado.setMinimumSize(dimensionMinimum);
		this.jTableDatosChequePostFechado.setMaximumSize(dimensionMaximum);
		this.jTableDatosChequePostFechado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingChequePostFechado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingChequePostFechado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingChequePostFechado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaChequePostFechado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesChequePostFechado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasChequePostFechado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesChequePostFechado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesChequePostFechado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualChequePostFechado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaChequePostFechado();
		
		this.inicializarActualizarBindingBotonesManualChequePostFechado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualChequePostFechado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesChequePostFechado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualChequePostFechado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualChequePostFechado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosChequePostFechado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosChequePostFechado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteChequePostFechado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormChequePostFechado.jCheckBoxPostAccionNuevoChequePostFechado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormChequePostFechado.jCheckBoxPostAccionSinCerrarChequePostFechado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormChequePostFechado.jCheckBoxPostAccionSinMensajeChequePostFechado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosChequePostFechado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosChequePostFechado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteChequePostFechado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
				this.jInternalFrameDetalleFormChequePostFechado.jCheckBoxPostAccionNuevoChequePostFechado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormChequePostFechado.jCheckBoxPostAccionSinCerrarChequePostFechado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormChequePostFechado.jCheckBoxPostAccionSinMensajeChequePostFechado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionChequePostFechado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionChequePostFechado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesChequePostFechado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoChequePostFechado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesChequePostFechado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesChequePostFechado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarChequePostFechado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesChequePostFechado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoChequePostFechado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesChequePostFechado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralChequePostFechado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesChequePostFechado(Boolean esInicializar) throws Exception {
		try	{	
			if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualChequePostFechado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesChequePostFechado() throws Exception {
		try	{
			if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualChequePostFechado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleChequePostFechado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualChequePostFechado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesChequePostFechado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesChequePostFechado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesChequePostFechado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesChequePostFechado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesChequePostFechado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesChequePostFechado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionChequePostFechado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionChequePostFechado.addItem(reporte);
			}
			
			
			if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionChequePostFechado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionChequePostFechado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesChequePostFechado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesChequePostFechado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesChequePostFechado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesChequePostFechado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarChequePostFechado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarChequePostFechado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarChequePostFechado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualChequePostFechado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualChequePostFechado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoChequePostFechado!=null) {
				this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoChequePostFechado!=null) {
				this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoChequePostFechado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoChequePostFechado!=null) {
				
				if(this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoChequePostFechado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoChequePostFechado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoChequePostFechado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoChequePostFechado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualChequePostFechado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.getSelectedItem()!=null){this.id_asiento_contableFK_IdAsientoContable=((AsientoContable)this.jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteChequePostFechado.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteChequePostFechado.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.getSelectedItem()!=null){this.id_tipo_forma_pagoFK_IdTipoFormaPago=((TipoFormaPago)this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasChequePostFechado(Boolean esInicializar) throws Exception {				
		if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualChequePostFechado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaChequePostFechado() throws Exception {
		this.inicializarActualizarBindingTablaChequePostFechado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByChequePostFechado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosChequePostFechadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaChequePostFechado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=chequepostfechadoLogic.getChequePostFechados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=chequepostfechados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosChequePostFechado.setModel(new ChequePostFechadoModel(this.chequepostfechadoLogic.getChequePostFechados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosChequePostFechado.setModel(new ChequePostFechadoModel(this.chequepostfechados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByChequePostFechado!=null && this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByChequePostFechado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO,chequepostfechadoConstantesFunciones.resaltarSeleccionarChequePostFechado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO,chequepostfechadoConstantesFunciones.resaltarSeleccionarChequePostFechado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_ID));

		if(this.chequepostfechadoConstantesFunciones.mostraridChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.chequepostfechadoConstantesFunciones.resaltaridChequePostFechado,this.chequepostfechadoConstantesFunciones.activaridChequePostFechado,this,true,"idChequePostFechado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequepostfechadoConstantesFunciones.resaltaridChequePostFechado,this.chequepostfechadoConstantesFunciones.activaridChequePostFechado,this,true,"idChequePostFechado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.chequepostfechadoConstantesFunciones.mostrarid_empresaChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_empresaChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_empresaChequePostFechado));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_empresaChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_empresaChequePostFechado,false,"id_empresaChequePostFechado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.chequepostfechadoConstantesFunciones.mostrarid_sucursalChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_sucursalChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_sucursalChequePostFechado));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_sucursalChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_sucursalChequePostFechado,false,"id_sucursalChequePostFechado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE));

		if(this.chequepostfechadoConstantesFunciones.mostrarid_clienteChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_clienteChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_clienteChequePostFechado));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_clienteChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_clienteChequePostFechado,true,"id_clienteChequePostFechado","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE));

		if(this.chequepostfechadoConstantesFunciones.mostrarid_asiento_contableChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AsientoContableTableCell(this.asientocontablesForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_asiento_contableChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_asiento_contableChequePostFechado));
			tableColumn.setCellEditor(new AsientoContableTableCell(this.asientocontablesForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_asiento_contableChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_asiento_contableChequePostFechado,true,"id_asiento_contableChequePostFechado","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.chequepostfechadoConstantesFunciones.mostrarid_ejercicioChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_ejercicioChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_ejercicioChequePostFechado));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_ejercicioChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_ejercicioChequePostFechado,false,"id_ejercicioChequePostFechado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO));

		if(this.chequepostfechadoConstantesFunciones.mostrarid_periodoChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_periodoChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_periodoChequePostFechado));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_periodoChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_periodoChequePostFechado,false,"id_periodoChequePostFechado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO));

		if(this.chequepostfechadoConstantesFunciones.mostrarid_tipo_forma_pagoChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_tipo_forma_pagoChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_tipo_forma_pagoChequePostFechado));
			tableColumn.setCellEditor(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_tipo_forma_pagoChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_tipo_forma_pagoChequePostFechado,true,"id_tipo_forma_pagoChequePostFechado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA));

		if(this.chequepostfechadoConstantesFunciones.mostrarnombre_giraChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.chequepostfechadoConstantesFunciones.resaltarnombre_giraChequePostFechado,this.chequepostfechadoConstantesFunciones.activarnombre_giraChequePostFechado,this,true,"nombre_giraChequePostFechado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequepostfechadoConstantesFunciones.resaltarnombre_giraChequePostFechado,this.chequepostfechadoConstantesFunciones.activarnombre_giraChequePostFechado,this,true,"nombre_giraChequePostFechado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.chequepostfechadoConstantesFunciones.mostrarfecha_vencimientoChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.chequepostfechadoConstantesFunciones.resaltarfecha_vencimientoChequePostFechado,this.chequepostfechadoConstantesFunciones.activarfecha_vencimientoChequePostFechado,this,true,"fecha_vencimientoChequePostFechado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.chequepostfechadoConstantesFunciones.resaltarfecha_vencimientoChequePostFechado,this.chequepostfechadoConstantesFunciones.activarfecha_vencimientoChequePostFechado,this,true,"fecha_vencimientoChequePostFechado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL));

		if(this.chequepostfechadoConstantesFunciones.mostrarfecha_vencimiento_originalChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.chequepostfechadoConstantesFunciones.resaltarfecha_vencimiento_originalChequePostFechado,this.chequepostfechadoConstantesFunciones.activarfecha_vencimiento_originalChequePostFechado,this,true,"fecha_vencimiento_originalChequePostFechado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.chequepostfechadoConstantesFunciones.resaltarfecha_vencimiento_originalChequePostFechado,this.chequepostfechadoConstantesFunciones.activarfecha_vencimiento_originalChequePostFechado,this,true,"fecha_vencimiento_originalChequePostFechado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_NUMERO));

		if(this.chequepostfechadoConstantesFunciones.mostrarnumeroChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.chequepostfechadoConstantesFunciones.resaltarnumeroChequePostFechado,this.chequepostfechadoConstantesFunciones.activarnumeroChequePostFechado,this,true,"numeroChequePostFechado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequepostfechadoConstantesFunciones.resaltarnumeroChequePostFechado,this.chequepostfechadoConstantesFunciones.activarnumeroChequePostFechado,this,true,"numeroChequePostFechado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.chequepostfechadoConstantesFunciones.mostrarnumero_chequeChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.chequepostfechadoConstantesFunciones.resaltarnumero_chequeChequePostFechado,this.chequepostfechadoConstantesFunciones.activarnumero_chequeChequePostFechado,this,true,"numero_chequeChequePostFechado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequepostfechadoConstantesFunciones.resaltarnumero_chequeChequePostFechado,this.chequepostfechadoConstantesFunciones.activarnumero_chequeChequePostFechado,this,true,"numero_chequeChequePostFechado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.chequepostfechadoConstantesFunciones.mostrardescripcionChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.chequepostfechadoConstantesFunciones.resaltardescripcionChequePostFechado,this.chequepostfechadoConstantesFunciones.activardescripcionChequePostFechado,this,true,"descripcionChequePostFechado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequepostfechadoConstantesFunciones.resaltardescripcionChequePostFechado,this.chequepostfechadoConstantesFunciones.activardescripcionChequePostFechado,this,true,"descripcionChequePostFechado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDANIO));

		if(this.chequepostfechadoConstantesFunciones.mostrarid_anioChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_anioChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_anioChequePostFechado));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_anioChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_anioChequePostFechado,true,"id_anioChequePostFechado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,ChequePostFechadoConstantesFunciones.LABEL_IDMES));

		if(this.chequepostfechadoConstantesFunciones.mostrarid_mesChequePostFechado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequePostFechadoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_mesChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_mesChequePostFechado));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.chequepostfechadoConstantesFunciones.resaltarid_mesChequePostFechado,this,this.chequepostfechadoConstantesFunciones.activarid_mesChequePostFechado,true,"id_mesChequePostFechado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequePostFechadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.chequepostfechadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.chequepostfechadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosChequePostFechado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.chequepostfechadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.chequepostfechadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosChequePostFechado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.chequepostfechadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.chequepostfechadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosChequePostFechado.addColumn(tableColumn);
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
			
			this.jTableDatosChequePostFechado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosChequePostFechado.moveColumn(this.jTableDatosChequePostFechado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosChequePostFechado.moveColumn(this.jTableDatosChequePostFechado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosChequePostFechado.moveColumn(this.jTableDatosChequePostFechado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosChequePostFechado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosChequePostFechado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosChequePostFechado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosChequePostFechado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosChequePostFechado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosChequePostFechado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosChequePostFechado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosChequePostFechado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=chequepostfechadoLogic.getChequePostFechados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=chequepostfechados.size()-1;
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
		//this.jTableDatosChequePostFechado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosChequePostFechado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosChequePostFechado();
			
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
				
				//this.isEsNuevoChequePostFechado=false;
					
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
				if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormChequePostFechado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosChequePostFechado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosChequePostFechado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.chequepostfechado.getsType().equals("DUPLICADO")
				   || this.chequepostfechado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoChequePostFechado=true;
				
				} else {
					this.isEsNuevoChequePostFechado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
					if(this.chequepostfechado.getId()>=0 && !this.chequepostfechado.getIsNew()) {						
						this.isEsNuevoChequePostFechado=false;
						
					} else {
						this.isEsNuevoChequePostFechado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoChequePostFechado(esRelaciones);						
				
				this.seleccionarChequePostFechado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.chequepostfechado.getId()<0) {
					this.isEsNuevoChequePostFechado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarChequePostFechado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarChequePostFechado(evt,rowIndex);
				}	
				
				if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ChequePostFechado: " + this.dDif); 
					}
				}								
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarChequePostFechado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.chequepostfechado)) {
					if(this.chequepostfechado.getId()>0) {
						this.chequepostfechado.setIsDeleted(true);
						
						this.chequepostfechadosEliminados.add(this.chequepostfechado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.chequepostfechadoLogic.getChequePostFechados().remove(this.chequepostfechado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.chequepostfechados.remove(this.chequepostfechado);				
					}
					
					
					((ChequePostFechadoModel) this.jTableDatosChequePostFechado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaChequePostFechado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarChequePostFechado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoChequePostFechado) {
			
			if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosChequePostFechado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosChequePostFechado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioChequePostFechado(this.chequepostfechado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.chequepostfechadoConstantesFunciones.cargarid_empresaChequePostFechado || this.chequepostfechadoConstantesFunciones.event_dependid_empresaChequePostFechado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.chequepostfechado.getid_empresa());
									//this.inicializarActualizarBindingChequePostFechado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(chequepostfechado.getEmpresa()!=null) {
							this.empresasForeignKey.add(chequepostfechado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.chequepostfechado.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.chequepostfechadoConstantesFunciones.cargarid_sucursalChequePostFechado || this.chequepostfechadoConstantesFunciones.event_dependid_sucursalChequePostFechado) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.chequepostfechado.getid_sucursal());
									//this.inicializarActualizarBindingChequePostFechado(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(chequepostfechado.getSucursal()!=null) {
							this.sucursalsForeignKey.add(chequepostfechado.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.chequepostfechado.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.chequepostfechadoConstantesFunciones.cargarid_clienteChequePostFechado || this.chequepostfechadoConstantesFunciones.event_dependid_clienteChequePostFechado) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.chequepostfechado.getid_cliente());
									//this.inicializarActualizarBindingChequePostFechado(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(chequepostfechado.getCliente()!=null) {
							this.clientesForeignKey.add(chequepostfechado.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.chequepostfechado.getid_cliente(),false,"Formulario");

					//AsientoContable
					if(!this.chequepostfechadoConstantesFunciones.cargarid_asiento_contableChequePostFechado || this.chequepostfechadoConstantesFunciones.event_dependid_asiento_contableChequePostFechado) {
						//this.cargarCombosAsientoContablesForeignKeyLista(" where id="+this.chequepostfechado.getid_asiento_contable());
									//this.inicializarActualizarBindingChequePostFechado(false,false);
						this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

						if(chequepostfechado.getAsientoContable()!=null) {
							this.asientocontablesForeignKey.add(chequepostfechado.getAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyAsientoContable();
						this.cargarCombosFrameAsientoContablesForeignKey("Todos");
					}
					this.setActualAsientoContableForeignKey(this.chequepostfechado.getid_asiento_contable(),false,"Formulario");

					//Ejercicio
					if(!this.chequepostfechadoConstantesFunciones.cargarid_ejercicioChequePostFechado || this.chequepostfechadoConstantesFunciones.event_dependid_ejercicioChequePostFechado) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.chequepostfechado.getid_ejercicio());
									//this.inicializarActualizarBindingChequePostFechado(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(chequepostfechado.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(chequepostfechado.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.chequepostfechado.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.chequepostfechadoConstantesFunciones.cargarid_periodoChequePostFechado || this.chequepostfechadoConstantesFunciones.event_dependid_periodoChequePostFechado) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.chequepostfechado.getid_periodo());
									//this.inicializarActualizarBindingChequePostFechado(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(chequepostfechado.getPeriodo()!=null) {
							this.periodosForeignKey.add(chequepostfechado.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.chequepostfechado.getid_periodo(),false,"Formulario");

					//TipoFormaPago
					if(!this.chequepostfechadoConstantesFunciones.cargarid_tipo_forma_pagoChequePostFechado || this.chequepostfechadoConstantesFunciones.event_dependid_tipo_forma_pagoChequePostFechado) {
						//this.cargarCombosTipoFormaPagosForeignKeyLista(" where id="+this.chequepostfechado.getid_tipo_forma_pago());
									//this.inicializarActualizarBindingChequePostFechado(false,false);
						this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

						if(chequepostfechado.getTipoFormaPago()!=null) {
							this.tipoformapagosForeignKey.add(chequepostfechado.getTipoFormaPago());
						}

						this.addItemDefectoCombosForeignKeyTipoFormaPago();
						this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
					}
					this.setActualTipoFormaPagoForeignKey(this.chequepostfechado.getid_tipo_forma_pago(),false,"Formulario");

					//Anio
					if(!this.chequepostfechadoConstantesFunciones.cargarid_anioChequePostFechado || this.chequepostfechadoConstantesFunciones.event_dependid_anioChequePostFechado) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.chequepostfechado.getid_anio());
									//this.inicializarActualizarBindingChequePostFechado(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(chequepostfechado.getAnio()!=null) {
							this.aniosForeignKey.add(chequepostfechado.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.chequepostfechado.getid_anio(),false,"Formulario");

					//Mes
					if(!this.chequepostfechadoConstantesFunciones.cargarid_mesChequePostFechado || this.chequepostfechadoConstantesFunciones.event_dependid_mesChequePostFechado) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.chequepostfechado.getid_mes());
									//this.inicializarActualizarBindingChequePostFechado(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(chequepostfechado.getMes()!=null) {
							this.messForeignKey.add(chequepostfechado.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.chequepostfechado.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesChequePostFechado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesChequePostFechado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualChequePostFechado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoChequePostFechado(ChequePostFechado chequepostfechado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoChequePostFechado(chequepostfechado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoChequePostFechado(ChequePostFechado chequepostfechado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioChequePostFechado(chequepostfechado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyChequePostFechado(chequepostfechado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyChequePostFechado(chequepostfechado);
	}
	
	public void setVariablesObjetoActualToFormularioChequePostFechado(ChequePostFechado chequepostfechado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.setText(chequepostfechado.getId().toString());
			this.jInternalFrameDetalleFormChequePostFechado.jTextAreanombre_giraChequePostFechado.setText(chequepostfechado.getnombre_gira());
			this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimientoChequePostFechado.setDate(chequepostfechado.getfecha_vencimiento());
			this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimiento_originalChequePostFechado.setDate(chequepostfechado.getfecha_vencimiento_original());
			this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumeroChequePostFechado.setText(chequepostfechado.getnumero());
			this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumero_chequeChequePostFechado.setText(chequepostfechado.getnumero_cheque());
			this.jInternalFrameDetalleFormChequePostFechado.jTextAreadescripcionChequePostFechado.setText(chequepostfechado.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ChequePostFechado chequepostfechadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,chequepostfechadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ChequePostFechado chequepostfechadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				chequepostfechadoLocal=this.chequepostfechado;
			} else {
				chequepostfechadoLocal=this.chequepostfechadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(chequepostfechadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoChequePostFechado(chequepostfechadoLocal,true);
					
					if(chequepostfechadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(chequepostfechadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(chequepostfechadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoChequePostFechado(ChequePostFechado chequepostfechado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualChequePostFechado(chequepostfechado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(chequepostfechado);
	}
	
	public void setVariablesFormularioToObjetoActualChequePostFechado(ChequePostFechado chequepostfechado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualChequePostFechado(chequepostfechado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualChequePostFechado(ChequePostFechado chequepostfechado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.getText()==null || this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.getText()=="" || this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.getText()=="Id") {
				this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.setText("0");
			}

			if(conColumnasBase) {chequepostfechado.setId(Long.parseLong(this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequePostFechadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelIdChequePostFechado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequepostfechado.setnombre_gira(this.jInternalFrameDetalleFormChequePostFechado.jTextAreanombre_giraChequePostFechado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelnombre_giraChequePostFechado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequepostfechado.setfecha_vencimiento(this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimientoChequePostFechado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelfecha_vencimientoChequePostFechado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequepostfechado.setfecha_vencimiento_original(this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimiento_originalChequePostFechado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelfecha_vencimiento_originalChequePostFechado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequepostfechado.setnumero(this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumeroChequePostFechado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequePostFechadoConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelnumeroChequePostFechado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequepostfechado.setnumero_cheque(this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumero_chequeChequePostFechado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabelnumero_chequeChequePostFechado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequepostfechado.setdescripcion(this.jInternalFrameDetalleFormChequePostFechado.jTextAreadescripcionChequePostFechado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequePostFechado.jLabeldescripcionChequePostFechado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualChequePostFechado(ChequePostFechado chequepostfechadoBean,ChequePostFechado chequepostfechado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosChequePostFechado(ChequePostFechado chequepostfechadoOrigen,ChequePostFechado chequepostfechado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && chequepostfechadoOrigen.getId()!=null && !chequepostfechadoOrigen.getId().equals(0L))) {chequepostfechado.setId(chequepostfechadoOrigen.getId());}}
			if(conDefault || (!conDefault && chequepostfechadoOrigen.getnombre_gira()!=null && !chequepostfechadoOrigen.getnombre_gira().equals(""))) {chequepostfechado.setnombre_gira(chequepostfechadoOrigen.getnombre_gira());}
			if(conDefault || (!conDefault && chequepostfechadoOrigen.getfecha_vencimiento()!=null && !chequepostfechadoOrigen.getfecha_vencimiento().equals(new Date()))) {chequepostfechado.setfecha_vencimiento(chequepostfechadoOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && chequepostfechadoOrigen.getfecha_vencimiento_original()!=null && !chequepostfechadoOrigen.getfecha_vencimiento_original().equals(new Date()))) {chequepostfechado.setfecha_vencimiento_original(chequepostfechadoOrigen.getfecha_vencimiento_original());}
			if(conDefault || (!conDefault && chequepostfechadoOrigen.getnumero()!=null && !chequepostfechadoOrigen.getnumero().equals(""))) {chequepostfechado.setnumero(chequepostfechadoOrigen.getnumero());}
			if(conDefault || (!conDefault && chequepostfechadoOrigen.getnumero_cheque()!=null && !chequepostfechadoOrigen.getnumero_cheque().equals(""))) {chequepostfechado.setnumero_cheque(chequepostfechadoOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && chequepostfechadoOrigen.getdescripcion()!=null && !chequepostfechadoOrigen.getdescripcion().equals(""))) {chequepostfechado.setdescripcion(chequepostfechadoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioChequePostFechado(ChequePostFechado chequepostfechado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.setText(chequepostfechado.getId().toString());
			this.jInternalFrameDetalleFormChequePostFechado.jTextAreanombre_giraChequePostFechado.setText(chequepostfechado.getnombre_gira());
			this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimientoChequePostFechado.setDate(chequepostfechado.getfecha_vencimiento());
			this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimiento_originalChequePostFechado.setDate(chequepostfechado.getfecha_vencimiento_original());
			this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumeroChequePostFechado.setText(chequepostfechado.getnumero());
			this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumero_chequeChequePostFechado.setText(chequepostfechado.getnumero_cheque());
			this.jInternalFrameDetalleFormChequePostFechado.jTextAreadescripcionChequePostFechado.setText(chequepostfechado.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioChequePostFechado(ChequePostFechadoBean chequepostfechadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.setText(chequepostfechadoBean.getId().toString());
			this.jInternalFrameDetalleFormChequePostFechado.jTextAreanombre_giraChequePostFechado.setText(chequepostfechadoBean.getnombre_gira());
			this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimientoChequePostFechado.setDate(chequepostfechadoBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimiento_originalChequePostFechado.setDate(chequepostfechadoBean.getfecha_vencimiento_original());
			this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumeroChequePostFechado.setText(chequepostfechadoBean.getnumero());
			this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumero_chequeChequePostFechado.setText(chequepostfechadoBean.getnumero_cheque());
			this.jInternalFrameDetalleFormChequePostFechado.jTextAreadescripcionChequePostFechado.setText(chequepostfechadoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanChequePostFechado(ChequePostFechadoParameterReturnGeneral chequepostfechadoReturnGeneral,ChequePostFechadoBean chequepostfechadoBean,Boolean conDefault) throws Exception { 
		try {
			ChequePostFechado chequepostfechadoLocal=new ChequePostFechado();
			
			chequepostfechadoLocal=chequepostfechadoReturnGeneral.getChequePostFechado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && chequepostfechadoLocal.getId()!=null && !chequepostfechadoLocal.getId().equals(0L))) {chequepostfechadoBean.setId(chequepostfechadoLocal.getId());}}
			if(conDefault || (!conDefault && chequepostfechadoLocal.getnombre_gira()!=null && !chequepostfechadoLocal.getnombre_gira().equals(""))) {chequepostfechadoBean.setnombre_gira(chequepostfechadoLocal.getnombre_gira());}
			if(conDefault || (!conDefault && chequepostfechadoLocal.getfecha_vencimiento()!=null && !chequepostfechadoLocal.getfecha_vencimiento().equals(new Date()))) {chequepostfechadoBean.setfecha_vencimiento(chequepostfechadoLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && chequepostfechadoLocal.getfecha_vencimiento_original()!=null && !chequepostfechadoLocal.getfecha_vencimiento_original().equals(new Date()))) {chequepostfechadoBean.setfecha_vencimiento_original(chequepostfechadoLocal.getfecha_vencimiento_original());}
			if(conDefault || (!conDefault && chequepostfechadoLocal.getnumero()!=null && !chequepostfechadoLocal.getnumero().equals(""))) {chequepostfechadoBean.setnumero(chequepostfechadoLocal.getnumero());}
			if(conDefault || (!conDefault && chequepostfechadoLocal.getnumero_cheque()!=null && !chequepostfechadoLocal.getnumero_cheque().equals(""))) {chequepostfechadoBean.setnumero_cheque(chequepostfechadoLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && chequepostfechadoLocal.getdescripcion()!=null && !chequepostfechadoLocal.getdescripcion().equals(""))) {chequepostfechadoBean.setdescripcion(chequepostfechadoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxChequePostFechadoGenerico(Long idChequePostFechadoSeleccionado,JComboBox jComboBoxChequePostFechado,List<ChequePostFechado> chequepostfechadosLocal)throws Exception {
		try {
			ChequePostFechado  chequepostfechadoTemp=null;

			for(ChequePostFechado chequepostfechadoAux:chequepostfechadosLocal) {
				if(chequepostfechadoAux.getId()!=null && chequepostfechadoAux.getId().equals(idChequePostFechadoSeleccionado)) {
					chequepostfechadoTemp=chequepostfechadoAux;
					break;
				}
			}

			jComboBoxChequePostFechado.setSelectedItem(chequepostfechadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxChequePostFechadoGenerico(JComboBox jComboBoxChequePostFechado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxChequePostFechado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxChequePostFechado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxChequePostFechado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxChequePostFechado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			chequepostfechado=(ChequePostFechado) chequepostfechadoLogic.getChequePostFechados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			chequepostfechado =(ChequePostFechado) chequepostfechados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!chequepostfechado.getIsNew() && !chequepostfechado.getIsChanged() && !chequepostfechado.getIsDeleted()) {
				sDescripcion=chequepostfechado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=chequepostfechado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!chequepostfechado.getIsNew() && !chequepostfechado.getIsChanged() && !chequepostfechado.getIsDeleted()) {
				sDescripcion=chequepostfechado.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=chequepostfechado.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!chequepostfechado.getIsNew() && !chequepostfechado.getIsChanged() && !chequepostfechado.getIsDeleted()) {
				sDescripcion=chequepostfechado.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=chequepostfechado.getcliente_descripcion();
			}
		}

		if(sTipo.equals("AsientoContable")) {
			//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
			if(!chequepostfechado.getIsNew() && !chequepostfechado.getIsChanged() && !chequepostfechado.getIsDeleted()) {
				sDescripcion=chequepostfechado.getasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=chequepostfechado.getasientocontable_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!chequepostfechado.getIsNew() && !chequepostfechado.getIsChanged() && !chequepostfechado.getIsDeleted()) {
				sDescripcion=chequepostfechado.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=chequepostfechado.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!chequepostfechado.getIsNew() && !chequepostfechado.getIsChanged() && !chequepostfechado.getIsDeleted()) {
				sDescripcion=chequepostfechado.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=chequepostfechado.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("TipoFormaPago")) {
			//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
			if(!chequepostfechado.getIsNew() && !chequepostfechado.getIsChanged() && !chequepostfechado.getIsDeleted()) {
				sDescripcion=chequepostfechado.gettipoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=chequepostfechado.gettipoformapago_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!chequepostfechado.getIsNew() && !chequepostfechado.getIsChanged() && !chequepostfechado.getIsDeleted()) {
				sDescripcion=chequepostfechado.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=chequepostfechado.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!chequepostfechado.getIsNew() && !chequepostfechado.getIsChanged() && !chequepostfechado.getIsDeleted()) {
				sDescripcion=chequepostfechado.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=chequepostfechado.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ChequePostFechado chequepostfechadoRow=new ChequePostFechado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			chequepostfechadoRow=(ChequePostFechado) chequepostfechadoLogic.getChequePostFechados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			chequepostfechadoRow=(ChequePostFechado) chequepostfechados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualChequePostFechado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoChequePostFechado.setVisible((this.isVisibilidadCeldaNuevoChequePostFechado && this.isPermisoNuevoChequePostFechado));			
			this.jButtonDuplicarChequePostFechado.setVisible((this.isVisibilidadCeldaDuplicarChequePostFechado && this.isPermisoDuplicarChequePostFechado));			
			this.jButtonCopiarChequePostFechado.setVisible((this.isVisibilidadCeldaCopiarChequePostFechado && this.isPermisoCopiarChequePostFechado));
			this.jButtonVerFormChequePostFechado.setVisible((this.isVisibilidadCeldaVerFormChequePostFechado && this.isPermisoVerFormChequePostFechado));
			
			this.jButtonAbrirOrderByChequePostFechado.setVisible((this.isVisibilidadCeldaOrdenChequePostFechado && this.isPermisoOrdenChequePostFechado));			
			
			this.jButtonNuevoRelacionesChequePostFechado.setVisible((this.isVisibilidadCeldaNuevoRelacionesChequePostFechado && this.isPermisoNuevoChequePostFechado));			
			this.jButtonNuevoGuardarCambiosChequePostFechado.setVisible((this.isVisibilidadCeldaNuevoChequePostFechado && this.isPermisoNuevoChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));
			
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonModificarChequePostFechado.setVisible((this.isVisibilidadCeldaModificarChequePostFechado && this.isPermisoActualizarChequePostFechado));	
			this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarChequePostFechado.setVisible((this.isVisibilidadCeldaActualizarChequePostFechado && this.isPermisoActualizarChequePostFechado));	
			this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarChequePostFechado.setVisible((this.isVisibilidadCeldaEliminarChequePostFechado && this.isPermisoEliminarChequePostFechado));
			this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarChequePostFechado.setVisible(this.isVisibilidadCeldaCancelarChequePostFechado);							
			this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosChequePostFechado.setVisible((this.isVisibilidadCeldaGuardarChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));			
			
			}
						
			this.jButtonGuardarCambiosTablaChequePostFechado.setVisible((this.isVisibilidadCeldaGuardarCambiosChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaNuevoChequePostFechado && this.isPermisoNuevoChequePostFechado));						
			this.jButtonDuplicarToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaDuplicarChequePostFechado && this.isPermisoDuplicarChequePostFechado));						
			this.jButtonCopiarToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaCopiarChequePostFechado && this.isPermisoCopiarChequePostFechado));			
			this.jButtonVerFormToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaVerFormChequePostFechado && this.isPermisoVerFormChequePostFechado));			
			this.jButtonAbrirOrderByToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaOrdenChequePostFechado && this.isPermisoOrdenChequePostFechado));
			this.jButtonNuevoRelacionesToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaNuevoRelacionesChequePostFechado && this.isPermisoNuevoChequePostFechado));			
			this.jButtonNuevoGuardarCambiosToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaNuevoChequePostFechado && this.isPermisoNuevoChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));			
			
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonModificarToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaModificarChequePostFechado && this.isPermisoActualizarChequePostFechado));	
			this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaActualizarChequePostFechado  && this.isPermisoActualizarChequePostFechado));	
			this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaEliminarChequePostFechado && this.isPermisoEliminarChequePostFechado));
			this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarToolBarChequePostFechado.setVisible(this.isVisibilidadCeldaCancelarChequePostFechado);				
			this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaGuardarChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarChequePostFechado.setVisible((this.isVisibilidadCeldaGuardarCambiosChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoChequePostFechado.setVisible((this.isVisibilidadCeldaNuevoChequePostFechado && this.isPermisoNuevoChequePostFechado));			
			this.jMenuItemDuplicarChequePostFechado.setVisible((this.isVisibilidadCeldaDuplicarChequePostFechado && this.isPermisoDuplicarChequePostFechado));			
			this.jMenuItemCopiarChequePostFechado.setVisible((this.isVisibilidadCeldaCopiarChequePostFechado && this.isPermisoCopiarChequePostFechado));			
			this.jMenuItemVerFormChequePostFechado.setVisible((this.isVisibilidadCeldaVerFormChequePostFechado && this.isPermisoVerFormChequePostFechado));			
			this.jMenuItemAbrirOrderByChequePostFechado.setVisible((this.isVisibilidadCeldaOrdenChequePostFechado && this.isPermisoOrdenChequePostFechado));			
			//this.jMenuItemMostrarOcultarChequePostFechado.setVisible((this.isVisibilidadCeldaOrdenChequePostFechado && this.isPermisoOrdenChequePostFechado));
			this.jMenuItemDetalleAbrirOrderByChequePostFechado.setVisible((this.isVisibilidadCeldaOrdenChequePostFechado && this.isPermisoOrdenChequePostFechado));			
			//this.jMenuItemDetalleMostrarOcultarChequePostFechado.setVisible((this.isVisibilidadCeldaOrdenChequePostFechado && this.isPermisoOrdenChequePostFechado));			
			this.jMenuItemNuevoRelacionesChequePostFechado.setVisible((this.isVisibilidadCeldaNuevoRelacionesChequePostFechado && this.isPermisoNuevoChequePostFechado));			
			this.jMenuItemNuevoGuardarCambiosChequePostFechado.setVisible((this.isVisibilidadCeldaNuevoChequePostFechado && this.isPermisoNuevoChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));									
			
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			this.jInternalFrameDetalleFormChequePostFechado.jMenuItemModificarChequePostFechado.setVisible((this.isVisibilidadCeldaModificarChequePostFechado && this.isPermisoActualizarChequePostFechado));	
			this.jInternalFrameDetalleFormChequePostFechado.jMenuItemActualizarChequePostFechado.setVisible((this.isVisibilidadCeldaActualizarChequePostFechado && this.isPermisoActualizarChequePostFechado));	
			this.jInternalFrameDetalleFormChequePostFechado.jMenuItemEliminarChequePostFechado.setVisible((this.isVisibilidadCeldaEliminarChequePostFechado && this.isPermisoEliminarChequePostFechado));
			this.jInternalFrameDetalleFormChequePostFechado.jMenuItemCancelarChequePostFechado.setVisible(this.isVisibilidadCeldaCancelarChequePostFechado);				
			}
			
			this.jMenuItemGuardarCambiosChequePostFechado.setVisible((this.isVisibilidadCeldaGuardarChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));						
			this.jMenuItemGuardarCambiosTablaChequePostFechado.setVisible((this.isVisibilidadCeldaGuardarCambiosChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoChequePostFechado=this.jButtonNuevoChequePostFechado.isVisible();
			this.isVisibilidadCeldaDuplicarChequePostFechado=this.jButtonDuplicarChequePostFechado.isVisible();
			this.isVisibilidadCeldaCopiarChequePostFechado=this.jButtonCopiarChequePostFechado.isVisible();
			this.isVisibilidadCeldaVerFormChequePostFechado=this.jButtonVerFormChequePostFechado.isVisible();
			
			this.isVisibilidadCeldaOrdenChequePostFechado=this.jButtonAbrirOrderByChequePostFechado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=this.jButtonNuevoRelacionesChequePostFechado.isVisible();
			this.isVisibilidadCeldaModificarChequePostFechado=this.jButtonModificarChequePostFechado.isVisible();
			
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			this.isVisibilidadCeldaActualizarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarChequePostFechado.isVisible();
			this.isVisibilidadCeldaEliminarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarChequePostFechado.isVisible();
			this.isVisibilidadCeldaCancelarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarChequePostFechado.isVisible();
			this.isVisibilidadCeldaGuardarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosChequePostFechado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=this.jButtonGuardarCambiosTablaChequePostFechado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoChequePostFechado=this.jButtonNuevoToolBarChequePostFechado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=this.jButtonNuevoRelacionesToolBarChequePostFechado.isVisible();
			
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			this.isVisibilidadCeldaModificarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jButtonModificarToolBarChequePostFechado.isVisible();
			this.isVisibilidadCeldaActualizarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarToolBarChequePostFechado.isVisible();
			this.isVisibilidadCeldaEliminarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarToolBarChequePostFechado.isVisible();
			this.isVisibilidadCeldaCancelarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarToolBarChequePostFechado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarChequePostFechado=this.jButtonGuardarCambiosToolBarChequePostFechado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=this.jButtonGuardarCambiosTablaToolBarChequePostFechado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoChequePostFechado=this.jMenuItemNuevoChequePostFechado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=this.jMenuItemNuevoRelacionesChequePostFechado.isVisible();
			
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			this.isVisibilidadCeldaModificarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jMenuItemModificarChequePostFechado.isVisible();
			this.isVisibilidadCeldaActualizarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jMenuItemActualizarChequePostFechado.isVisible();
			this.isVisibilidadCeldaEliminarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jMenuItemEliminarChequePostFechado.isVisible();
			this.isVisibilidadCeldaCancelarChequePostFechado=this.jInternalFrameDetalleFormChequePostFechado.jMenuItemCancelarChequePostFechado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarChequePostFechado=this.jMenuItemGuardarCambiosChequePostFechado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=this.jMenuItemGuardarCambiosTablaChequePostFechado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesChequePostFechado(Boolean esInicializar) {
		if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {
				//if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesChequePostFechado();
			}
			
			this.inicializarActualizarBindingBotonesManualChequePostFechado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualChequePostFechado() {
		this.jButtonNuevoChequePostFechado.setVisible(this.isPermisoNuevoChequePostFechado);			
		this.jButtonDuplicarChequePostFechado.setVisible(this.isPermisoDuplicarChequePostFechado);			
		this.jButtonCopiarChequePostFechado.setVisible(this.isPermisoCopiarChequePostFechado);			
		this.jButtonVerFormChequePostFechado.setVisible(this.isPermisoVerFormChequePostFechado);			
		
		this.jButtonAbrirOrderByChequePostFechado.setVisible(this.isPermisoOrdenChequePostFechado);					
		
		this.jButtonNuevoRelacionesChequePostFechado.setVisible(this.isPermisoNuevoChequePostFechado);			
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonModificarChequePostFechado.setVisible(this.isPermisoActualizarChequePostFechado);	
			this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarChequePostFechado.setVisible(this.isPermisoActualizarChequePostFechado);	
			this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarChequePostFechado.setVisible(this.isPermisoEliminarChequePostFechado);
			this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarChequePostFechado.setVisible(this.isVisibilidadCeldaCancelarChequePostFechado);						
			this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosChequePostFechado.setVisible(this.isPermisoGuardarCambiosChequePostFechado);							
		}
		
		this.jButtonGuardarCambiosTablaChequePostFechado.setVisible(this.isPermisoActualizarChequePostFechado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleChequePostFechado() {
		this.jInternalFrameDetalleFormChequePostFechado.jButtonModificarChequePostFechado.setVisible(this.isPermisoActualizarChequePostFechado);	
		this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarChequePostFechado.setVisible(this.isPermisoActualizarChequePostFechado);	
		this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarChequePostFechado.setVisible(this.isPermisoEliminarChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarChequePostFechado.setVisible(this.isVisibilidadCeldaCancelarChequePostFechado);							
		this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosChequePostFechado.setVisible((this.isVisibilidadCeldaGuardarChequePostFechado && this.isPermisoGuardarCambiosChequePostFechado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosChequePostFechado() {
		if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualChequePostFechado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesChequePostFechado() {
	}
	
	public void jTableDatosChequePostFechadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarChequePostFechado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.chequepostfechado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaChequePostFechadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebChequePostFechado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequePostFechado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.chequepostfechadoLogic.getConnexion());

				if(this.chequepostfechado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.chequepostfechado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderChequePostFechado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.chequepostfechado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalChequePostFechadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebChequePostFechado(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequePostFechado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.chequepostfechadoLogic.getConnexion());

				if(this.chequepostfechado.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.chequepostfechado.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderChequePostFechado.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.chequepostfechado.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteChequePostFechadoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderChequePostFechado=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosChequePostFechado.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderChequePostFechado.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteChequePostFechadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebChequePostFechado(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequePostFechado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.chequepostfechadoLogic.getConnexion());

				if(this.chequepostfechado.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.chequepostfechado.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderChequePostFechado.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.chequepostfechado.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_asiento_contableChequePostFechadoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderChequePostFechado=null;
			TitledBorder titledBorderasientocontable=null;

			if(!this.jScrollPanelDatosChequePostFechado.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderChequePostFechado.getTitle() + " -> Asiento Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_asiento_contableChequePostFechadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoasientocontable=true;

			idTienePermisoasientocontable=this.tienePermisosUsuarioEnPaginaWebChequePostFechado(AsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequePostFechado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);

				this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.asientocontableBeanSwingJInternalFrame.getAsientoContableLogic().setConnexion(this.chequepostfechadoLogic.getConnexion());

				if(this.chequepostfechado.getid_asiento_contable()!=null) {
					this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.asientocontableBeanSwingJInternalFrame.setIdActual(this.chequepostfechado.getid_asiento_contable());
					this.asientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				TitledBorder titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderChequePostFechado.getTitle() + " -> Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_asiento_contableChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getid_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_asiento_contable = "+this.chequepostfechado.getid_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioChequePostFechadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebChequePostFechado(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequePostFechado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.chequepostfechadoLogic.getConnexion());

				if(this.chequepostfechado.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.chequepostfechado.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderChequePostFechado.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.chequepostfechado.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoChequePostFechadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebChequePostFechado(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequePostFechado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.chequepostfechadoLogic.getConnexion());

				if(this.chequepostfechado.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.chequepostfechado.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderChequePostFechado.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.chequepostfechado.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_forma_pagoChequePostFechadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoformapago=true;

			idTienePermisotipoformapago=this.tienePermisosUsuarioEnPaginaWebChequePostFechado(TipoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequePostFechado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);

				this.tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoformapagoBeanSwingJInternalFrame.getTipoFormaPagoLogic().setConnexion(this.chequepostfechadoLogic.getConnexion());

				if(this.chequepostfechado.getid_tipo_forma_pago()!=null) {
					this.tipoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoformapagoBeanSwingJInternalFrame.setIdActual(this.chequepostfechado.getid_tipo_forma_pago());
					this.tipoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				TitledBorder titledBordertipoformapago=(TitledBorder)this.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.getBorder();

				titledBordertipoformapago.setTitle(titledBorderChequePostFechado.getTitle() + " -> Tipo Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_forma_pagoChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getid_tipo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_forma_pago = "+this.chequepostfechado.getid_tipo_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_giraChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getnombre_gira()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_gira like '%"+this.chequepostfechado.getnombre_gira()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.chequepostfechado.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimiento_originalChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getfecha_vencimiento_original()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento_original = '"+Funciones2.getStringPostgresDate(this.chequepostfechado.getfecha_vencimiento_original())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.chequepostfechado.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.chequepostfechado.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.chequepostfechado.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioChequePostFechadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebChequePostFechado(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequePostFechado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.chequepostfechadoLogic.getConnexion());

				if(this.chequepostfechado.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.chequepostfechado.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderChequePostFechado.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.chequepostfechado.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesChequePostFechadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebChequePostFechado(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequePostFechado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequePostFechado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.chequepostfechadoLogic.getConnexion());

				if(this.chequepostfechado.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.chequepostfechado.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequePostFechado=(TitledBorder)this.jScrollPanelDatosChequePostFechado.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderChequePostFechado.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesChequePostFechadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.getchequepostfechado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequepostfechado==null) {
						this.chequepostfechado = new ChequePostFechado();
					}

					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);
				}

				if(this.chequepostfechado.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.chequepostfechado.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequePostFechado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequePostFechado(false,false);

			this.getChequePostFechadosFK_IdAnio();

			this.inicializarActualizarBindingChequePostFechado(false);

			//if(ChequePostFechadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequePostFechado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAsientoContableChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequePostFechado(false,false);

			this.getChequePostFechadosFK_IdAsientoContable();

			this.inicializarActualizarBindingChequePostFechado(false);

			//if(ChequePostFechadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequePostFechado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequePostFechado(false,false);

			this.getChequePostFechadosFK_IdCliente();

			this.inicializarActualizarBindingChequePostFechado(false);

			//if(ChequePostFechadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequePostFechado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequePostFechado(false,false);

			this.getChequePostFechadosFK_IdEjercicio();

			this.inicializarActualizarBindingChequePostFechado(false);

			//if(ChequePostFechadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequePostFechado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequePostFechado(false,false);

			this.getChequePostFechadosFK_IdEmpresa();

			this.inicializarActualizarBindingChequePostFechado(false);

			//if(ChequePostFechadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequePostFechado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequePostFechado(false,false);

			this.getChequePostFechadosFK_IdMes();

			this.inicializarActualizarBindingChequePostFechado(false);

			//if(ChequePostFechadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequePostFechado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequePostFechado(false,false);

			this.getChequePostFechadosFK_IdPeriodo();

			this.inicializarActualizarBindingChequePostFechado(false);

			//if(ChequePostFechadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequePostFechado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequePostFechado(false,false);

			this.getChequePostFechadosFK_IdSucursal();

			this.inicializarActualizarBindingChequePostFechado(false);

			//if(ChequePostFechadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequePostFechado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFormaPagoChequePostFechadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequePostFechado(false,false);

			this.getChequePostFechadosFK_IdTipoFormaPago();

			this.inicializarActualizarBindingChequePostFechado(false);

			//if(ChequePostFechadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequePostFechado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequepostfechadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameChequePostFechado() {
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
			this.jInternalFrameDetalleFormChequePostFechado.setVisible(false);	    			
			this.jInternalFrameDetalleFormChequePostFechado.dispose();
			this.jInternalFrameDetalleFormChequePostFechado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoChequePostFechado!=null) {
			this.jInternalFrameReporteDinamicoChequePostFechado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoChequePostFechado.dispose();
			this.jInternalFrameReporteDinamicoChequePostFechado=null;
		}
		
		if(this.jInternalFrameImportacionChequePostFechado!=null) {
			this.jInternalFrameImportacionChequePostFechado.setVisible(false);	    			
			this.jInternalFrameImportacionChequePostFechado.dispose();
			this.jInternalFrameImportacionChequePostFechado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessChequePostFechado();
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoChequePostFechado")) {
				jButtonNuevoChequePostFechadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarChequePostFechado")) {
				jButtonDuplicarChequePostFechadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarChequePostFechado")) {
				jButtonCopiarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormChequePostFechado")) {
				jButtonVerFormChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarChequePostFechado")) {
				jButtonNuevoChequePostFechadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarChequePostFechado")) {
				jButtonDuplicarChequePostFechadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoChequePostFechado")) {
				jButtonNuevoChequePostFechadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarChequePostFechado")) {
				jButtonDuplicarChequePostFechadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesChequePostFechado")) {
				jButtonNuevoChequePostFechadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarChequePostFechado")) {
				jButtonNuevoChequePostFechadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesChequePostFechado")) {
				jButtonNuevoChequePostFechadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarChequePostFechado")) {
				jButtonModificarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarChequePostFechado")) {
				jButtonModificarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarChequePostFechado")) {
				jButtonModificarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarChequePostFechado")) {
				jButtonActualizarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarChequePostFechado")) {
				jButtonActualizarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarChequePostFechado")) {
				jButtonActualizarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarChequePostFechado")) {
				jButtonEliminarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarChequePostFechado")) {
				jButtonEliminarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarChequePostFechado")) {
				jButtonEliminarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarChequePostFechado")) {
				jButtonCancelarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarChequePostFechado")) {
				jButtonCancelarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarChequePostFechado")) {
				jButtonCancelarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarChequePostFechado")) {
				jButtonCerrarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarChequePostFechado")) {
				jButtonCerrarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarChequePostFechado")) {
				jButtonCerrarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarChequePostFechado")) {
				jButtonMostrarOcultarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarChequePostFechado")) {
				jButtonCancelarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosChequePostFechado")) {
				jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarChequePostFechado")) {
				jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarChequePostFechado")) {
				jButtonCopiarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarChequePostFechado")) {
				jButtonVerFormChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosChequePostFechado")) {
				jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarChequePostFechado")) {
				jButtonCopiarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormChequePostFechado")) {
				jButtonVerFormChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaChequePostFechado")) {
				jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarChequePostFechado")) {
				jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaChequePostFechado")) {
				jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionChequePostFechado")) {
				jButtonRecargarInformacionChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarChequePostFechado")) {
				jButtonRecargarInformacionChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionChequePostFechado")) {
				jButtonRecargarInformacionChequePostFechadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresChequePostFechado")) {
				jButtonAnterioresChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarChequePostFechado")) {
				jButtonAnterioresChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreChequePostFechado")) {
				jButtonAnterioresChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesChequePostFechado")) {
				jButtonSiguientesChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarChequePostFechado")) {
				jButtonSiguientesChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesChequePostFechado")) {
				jButtonSiguientesChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByChequePostFechado") || sTipo.equals("MenuItemDetalleAbrirOrderByChequePostFechado")) {
				jButtonAbrirOrderByChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarChequePostFechado") || sTipo.equals("MenuItemDetalleMostrarOcultarChequePostFechado")) {
				jButtonMostrarOcultarChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosChequePostFechado")) {
				jButtonNuevoGuardarCambiosChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarChequePostFechado")) {
				jButtonNuevoGuardarCambiosChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosChequePostFechado")) {
				jButtonNuevoGuardarCambiosChequePostFechadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoChequePostFechado")) {
				jButtonCerrarReporteDinamicoChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoChequePostFechado")) {
				jButtonGenerarReporteDinamicoChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoChequePostFechado")) {
				
				jButtonGenerarExcelReporteDinamicoChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionChequePostFechado")) {
				jButtonCerrarImportacionChequePostFechadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionChequePostFechado")) {
				
				jButtonGenerarImportacionChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionChequePostFechado")) {
				
				jButtonAbrirImportacionChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesChequePostFechado")) {
				jComboBoxTiposAccionesChequePostFechadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesChequePostFechado")) {
				jComboBoxTiposRelacionesChequePostFechadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioChequePostFechado")) {
				jComboBoxTiposAccionesChequePostFechadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarChequePostFechado")) {
				
				jComboBoxTiposSeleccionarChequePostFechadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralChequePostFechado")) {
				jTextFieldValorCampoGeneralChequePostFechadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByChequePostFechado")) {
				jButtonAbrirOrderByChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarChequePostFechado")) {
				jButtonAbrirOrderByChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByChequePostFechado")) {
				jButtonCerrarOrderByChequePostFechadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idChequePostFechadoBusqueda")) {
				this.jButtonidChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaChequePostFechadoUpdate")) {
				this.jButtonid_empresaChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaChequePostFechadoBusqueda")) {
				this.jButtonid_empresaChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalChequePostFechadoUpdate")) {
				this.jButtonid_sucursalChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalChequePostFechadoBusqueda")) {
				this.jButtonid_sucursalChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteChequePostFechado")) {
				this.jButtonid_clienteChequePostFechadoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteChequePostFechadoUpdate")) {
				this.jButtonid_clienteChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteChequePostFechadoBusqueda")) {
				this.jButtonid_clienteChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableChequePostFechado")) {
				this.jButtonid_asiento_contableChequePostFechadoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableChequePostFechadoUpdate")) {
				this.jButtonid_asiento_contableChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableChequePostFechadoBusqueda")) {
				this.jButtonid_asiento_contableChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioChequePostFechadoUpdate")) {
				this.jButtonid_ejercicioChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioChequePostFechadoBusqueda")) {
				this.jButtonid_ejercicioChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoChequePostFechadoUpdate")) {
				this.jButtonid_periodoChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoChequePostFechadoBusqueda")) {
				this.jButtonid_periodoChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoChequePostFechadoUpdate")) {
				this.jButtonid_tipo_forma_pagoChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoChequePostFechadoBusqueda")) {
				this.jButtonid_tipo_forma_pagoChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_giraChequePostFechadoBusqueda")) {
				this.jButtonnombre_giraChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoChequePostFechadoBusqueda")) {
				this.jButtonfecha_vencimientoChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_originalChequePostFechadoBusqueda")) {
				this.jButtonfecha_vencimiento_originalChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroChequePostFechadoBusqueda")) {
				this.jButtonnumeroChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeChequePostFechadoBusqueda")) {
				this.jButtonnumero_chequeChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionChequePostFechadoBusqueda")) {
				this.jButtondescripcionChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioChequePostFechadoUpdate")) {
				this.jButtonid_anioChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioChequePostFechadoBusqueda")) {
				this.jButtonid_anioChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesChequePostFechadoUpdate")) {
				this.jButtonid_mesChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesChequePostFechadoBusqueda")) {
				this.jButtonid_mesChequePostFechadoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_asiento_contableChequePostFechado")) {
				this.jButtonid_asiento_contableChequePostFechadoActionPerformed(evt);
			}
			else if(sTipo.equals("id_clienteChequePostFechado")) {
				this.jButtonid_clienteChequePostFechadoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAsientoContableChequePostFechado")) {
				this.jButtonFK_IdAsientoContableChequePostFechadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteChequePostFechado")) {
				this.jButtonFK_IdClienteChequePostFechadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoFormaPagoChequePostFechado")) {
				this.jButtonFK_IdTipoFormaPagoChequePostFechadoActionPerformed(evt);
			}
			
			;
			
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessChequePostFechado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequePostFechadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				


				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ChequePostFechado chequepostfechadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				chequepostfechadoLocal=this.chequepostfechado;
			} else {
				chequepostfechadoLocal=this.chequepostfechadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
							
				
				


				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequePostFechadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
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
			
			


			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequePostFechadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
								
						
				


				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
								
				
				


				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequePostFechadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequePostFechadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequePostFechadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
							
				
				


				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequePostFechadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
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
			
			


			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequePostFechadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
								
				
				


				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequePostFechadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequePostFechadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequePostFechadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosChequePostFechado")) {
					jCheckBoxSeleccionarTodosChequePostFechadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosChequePostFechado")) {
					jCheckBoxSeleccionadosChequePostFechadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarChequePostFechado")) {
					
				}
				
				


				
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
												
				
				


				
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequePostFechadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequePostFechadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
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
			
			


			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequePostFechadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequepostfechado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequepostfechado);
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
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
				
				


				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequePostFechado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequePostFechado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequePostFechadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequepostfechadoAnterior =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarChequePostFechado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosChequePostFechadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosChequePostFechado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.chequepostfechado =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.chequepostfechado =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.chequepostfechado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarChequePostFechado")) {
				
				}
				
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarChequePostFechado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosChequePostFechado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarChequePostFechado")) {
			
			}
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessChequePostFechado();
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
			if(sTipo.equals("NuevoChequePostFechado")) {
				jButtonNuevoChequePostFechadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarChequePostFechado")) {
				jButtonDuplicarChequePostFechadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarChequePostFechado")) {
				jButtonCopiarChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormChequePostFechado")) {
				jButtonVerFormChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesChequePostFechado")) {
				jButtonNuevoChequePostFechadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarChequePostFechado")) {
				jButtonModificarChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarChequePostFechado")) {
				jButtonActualizarChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarChequePostFechado")) {
				jButtonEliminarChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaChequePostFechado")) {
				jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarChequePostFechado")) {
				jButtonCancelarChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarChequePostFechado")) {
				jButtonCerrarChequePostFechadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosChequePostFechado")) {
				jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosChequePostFechado")) {
				jButtonNuevoGuardarCambiosChequePostFechadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByChequePostFechado")) {
				jButtonAbrirOrderByChequePostFechadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionChequePostFechado")) {
				jButtonRecargarInformacionChequePostFechadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresChequePostFechado")) {
				jButtonAnterioresChequePostFechadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesChequePostFechado")) {
				jButtonSiguientesChequePostFechadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idChequePostFechadoBusqueda")) {
				this.jButtonidChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaChequePostFechadoUpdate")) {
				this.jButtonid_empresaChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaChequePostFechadoBusqueda")) {
				this.jButtonid_empresaChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalChequePostFechadoUpdate")) {
				this.jButtonid_sucursalChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalChequePostFechadoBusqueda")) {
				this.jButtonid_sucursalChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteChequePostFechado")) {
				this.jButtonid_clienteChequePostFechadoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteChequePostFechadoUpdate")) {
				this.jButtonid_clienteChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteChequePostFechadoBusqueda")) {
				this.jButtonid_clienteChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableChequePostFechado")) {
				this.jButtonid_asiento_contableChequePostFechadoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableChequePostFechadoUpdate")) {
				this.jButtonid_asiento_contableChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableChequePostFechadoBusqueda")) {
				this.jButtonid_asiento_contableChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioChequePostFechadoUpdate")) {
				this.jButtonid_ejercicioChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioChequePostFechadoBusqueda")) {
				this.jButtonid_ejercicioChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoChequePostFechadoUpdate")) {
				this.jButtonid_periodoChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoChequePostFechadoBusqueda")) {
				this.jButtonid_periodoChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoChequePostFechadoUpdate")) {
				this.jButtonid_tipo_forma_pagoChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoChequePostFechadoBusqueda")) {
				this.jButtonid_tipo_forma_pagoChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_giraChequePostFechadoBusqueda")) {
				this.jButtonnombre_giraChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoChequePostFechadoBusqueda")) {
				this.jButtonfecha_vencimientoChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_originalChequePostFechadoBusqueda")) {
				this.jButtonfecha_vencimiento_originalChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroChequePostFechadoBusqueda")) {
				this.jButtonnumeroChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeChequePostFechadoBusqueda")) {
				this.jButtonnumero_chequeChequePostFechadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionChequePostFechadoBusqueda")) {
				this.jButtondescripcionChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioChequePostFechadoUpdate")) {
				this.jButtonid_anioChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioChequePostFechadoBusqueda")) {
				this.jButtonid_anioChequePostFechadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesChequePostFechadoUpdate")) {
				this.jButtonid_mesChequePostFechadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesChequePostFechadoBusqueda")) {
				this.jButtonid_mesChequePostFechadoBusquedaActionPerformed(evt);
			}
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessChequePostFechado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameChequePostFechado")) {
				closingInternalFrameChequePostFechado();
				
			} else if(sTipo.equals("jButtonCancelarChequePostFechado")) {
				JInternalFrameBase jInternalFrameDetalleFormChequePostFechado = (JInternalFrameBase)evt.getSource();
	            	
	            ChequePostFechadoBeanSwingJInternalFrame jInternalFrameParent=(ChequePostFechadoBeanSwingJInternalFrame)jInternalFrameDetalleFormChequePostFechado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarChequePostFechadoActionPerformed(null);
			}
			
			ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.chequepostfechado,new Object(),this.chequepostfechadoParameterGeneral,this.chequepostfechadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormChequePostFechado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormChequePostFechado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormChequePostFechado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.chequepostfechado)) {
			if(!esControlTabla) {
				if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);			
				}
				
				if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualChequePostFechado(this.chequepostfechado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.chequepostfechadoReturnGeneral=chequepostfechadoLogic.procesarEventosChequePostFechadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.chequepostfechadoLogic.getChequePostFechados(),this.chequepostfechado,this.chequepostfechadoParameterGeneral,this.isEsNuevoChequePostFechado,classes);//this.chequepostfechadoLogic.getChequePostFechado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanChequePostFechado(this.chequepostfechadoReturnGeneral,this.chequepostfechadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanChequePostFechado(classes,this.chequepostfechadoReturnGeneral,this.chequepostfechadoBean,false);
					}
						
					if(this.chequepostfechadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyChequePostFechado(this.chequepostfechadoReturnGeneral.getChequePostFechado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioChequePostFechado(this.chequepostfechadoReturnGeneral.getChequePostFechado());	
					}
						
					if(this.chequepostfechadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioChequePostFechado(this.chequepostfechadoReturnGeneral.getChequePostFechado(),classes);//this.chequepostfechadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioChequePostFechado(this.chequepostfechado,classes);//this.chequepostfechadoBean);									
				}
			
				if(ChequePostFechadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualChequePostFechado(this.chequepostfechado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysChequePostFechado(this.chequepostfechado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.chequepostfechadoAnterior!=null) {
						this.chequepostfechado=this.chequepostfechadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.chequepostfechadoReturnGeneral=chequepostfechadoLogic.procesarEventosChequePostFechadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.chequepostfechadoLogic.getChequePostFechados(),this.chequepostfechado,this.chequepostfechadoParameterGeneral,this.isEsNuevoChequePostFechado,classes);//this.chequepostfechadoLogic.getChequePostFechado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.chequepostfechadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.chequepostfechadoReturnGeneral.getChequePostFechado(),chequepostfechadoLogic.getChequePostFechados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.chequepostfechadoReturnGeneral.getChequePostFechado(),this.chequepostfechados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosChequePostFechado.repaint();
				
				//((AbstractTableModel) this.jTableDatosChequePostFechado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosChequePostFechado();
			}
		}
	}
	
	public void actualizarVisualTableDatosChequePostFechado() throws Exception {
		
		ChequePostFechadoModel chequepostfechadoModel=(ChequePostFechadoModel)this.jTableDatosChequePostFechado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			chequepostfechadoModel.chequepostfechados=this.chequepostfechadoLogic.getChequePostFechados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			chequepostfechadoModel.chequepostfechados=this.chequepostfechados;
		}
		
		
		((ChequePostFechadoModel) this.jTableDatosChequePostFechado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaChequePostFechado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getchequepostfechadoAnterior(),this.chequepostfechadoLogic.getChequePostFechados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getchequepostfechadoAnterior(),this.chequepostfechados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosChequePostFechado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioChequePostFechado(ChequePostFechado chequepostfechado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
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
										
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.chequepostfechado,new Object(),generalEntityParameterGeneral,this.chequepostfechadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ChequePostFechadoConstantesFunciones.getClassesRelationshipsOfChequePostFechado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ChequePostFechadoConstantesFunciones.getClassesRelationshipsFromStringsOfChequePostFechado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormChequePostFechado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ChequePostFechadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.chequepostfechado,new Object(),generalEntityParameterGeneral,this.chequepostfechadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioChequePostFechado(ChequePostFechadoBean chequepostfechadoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanChequePostFechado(ArrayList<Classe> classes,ChequePostFechadoReturnGeneral chequepostfechadoReturnGeneral,ChequePostFechadoBean chequepostfechadoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualChequePostFechado(ChequePostFechado chequepostfechado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.chequepostfechado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormChequePostFechado = new ChequePostFechadoDetalleFormJInternalFrame(jDesktopPane,this.chequepostfechadoSessionBean.getConGuardarRelaciones(),this.chequepostfechadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.setVisible(false);
		this.jInternalFrameDetalleFormChequePostFechado.setSelected(false);						
		
		this.jInternalFrameDetalleFormChequePostFechado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormChequePostFechado.chequepostfechadoLogic=this.chequepostfechadoLogic;
		
		this.cargarCombosFrameForeignKeyChequePostFechado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleChequePostFechado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleChequePostFechado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyChequePostFechado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyChequePostFechado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormChequePostFechado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarChequePostFechado"));
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonModificarChequePostFechado.addActionListener(new ButtonActionListener(this,"ModificarChequePostFechado"));

		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonModificarToolBarChequePostFechado.addActionListener(new ButtonActionListener(this,"ModificarToolBarChequePostFechado"));
					
		this.jInternalFrameDetalleFormChequePostFechado.jMenuItemModificarChequePostFechado.addActionListener(new ButtonActionListener(this,"MenuItemModificarChequePostFechado"));		
		
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarChequePostFechado.addActionListener (new ButtonActionListener(this,"ActualizarChequePostFechado"));
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarToolBarChequePostFechado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarChequePostFechado"));
						
		this.jInternalFrameDetalleFormChequePostFechado.jMenuItemActualizarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarChequePostFechado"));		
		
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarChequePostFechado.addActionListener (new ButtonActionListener(this,"EliminarChequePostFechado"));
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"EliminarToolBarChequePostFechado"));
								
		this.jInternalFrameDetalleFormChequePostFechado.jMenuItemEliminarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarChequePostFechado"));		
		
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarChequePostFechado.addActionListener (new ButtonActionListener(this,"CancelarChequePostFechado"));
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"CancelarToolBarChequePostFechado"));
					
		this.jInternalFrameDetalleFormChequePostFechado.jMenuItemCancelarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarChequePostFechado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jMenuItemDetalleCerrarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarChequePostFechado"));		
		
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarChequePostFechado"));
		
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarChequePostFechado"));
		
		
		
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioChequePostFechado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonidChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"idChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_empresaChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_empresaChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_sucursalChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_sucursalChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalChequePostFechadoBusqueda"));
		//jButtonid_clienteChequePostFechado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteChequePostFechadoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechado.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechadoBusqueda"));
		//jButtonid_asiento_contableChequePostFechado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableChequePostFechadoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechado.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_ejercicioChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_ejercicioChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_periodoChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_periodoChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_tipo_forma_pagoChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonnombre_giraChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_giraChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonfecha_vencimientoChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_originalChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonnumeroChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"numeroChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonnumero_chequeChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtondescripcionChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_anioChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_anioChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_mesChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_mesChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_mesChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesChequePostFechadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormChequePostFechado.jTabbedPaneRelacionesChequePostFechado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesChequePostFechado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameChequePostFechado"));
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarChequePostFechado"));
		}
		
		this.jTableDatosChequePostFechado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarChequePostFechado"));
		
		this.jTableDatosChequePostFechado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarChequePostFechado"));
		
		this.jButtonNuevoChequePostFechado.addActionListener(new ButtonActionListener(this,"NuevoChequePostFechado"));
		
		this.jButtonDuplicarChequePostFechado.addActionListener(new ButtonActionListener(this,"DuplicarChequePostFechado"));
		
		this.jButtonCopiarChequePostFechado.addActionListener(new ButtonActionListener(this,"CopiarChequePostFechado"));
		
		this.jButtonVerFormChequePostFechado.addActionListener(new ButtonActionListener(this,"VerFormChequePostFechado"));
		
		
		this.jButtonNuevoToolBarChequePostFechado.addActionListener(new ButtonActionListener(this,"NuevoToolBarChequePostFechado"));
			
		this.jButtonDuplicarToolBarChequePostFechado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarChequePostFechado"));
			
		this.jMenuItemNuevoChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoChequePostFechado"));
			
		this.jMenuItemDuplicarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarChequePostFechado"));		
		
		
		this.jButtonNuevoRelacionesChequePostFechado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesChequePostFechado"));
		
		
		this.jButtonNuevoRelacionesToolBarChequePostFechado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarChequePostFechado"));
			
		this.jMenuItemNuevoRelacionesChequePostFechado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesChequePostFechado"));		
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonModificarChequePostFechado.addActionListener(new ButtonActionListener(this,"ModificarChequePostFechado"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonModificarToolBarChequePostFechado.addActionListener(new ButtonActionListener(this,"ModificarToolBarChequePostFechado"));
			
			this.jInternalFrameDetalleFormChequePostFechado.jMenuItemModificarChequePostFechado.addActionListener(new ButtonActionListener(this,"MenuItemModificarChequePostFechado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarChequePostFechado.addActionListener (new ButtonActionListener(this,"ActualizarChequePostFechado"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonActualizarToolBarChequePostFechado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarChequePostFechado"));
				
			this.jInternalFrameDetalleFormChequePostFechado.jMenuItemActualizarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarChequePostFechado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarChequePostFechado.addActionListener (new ButtonActionListener(this,"EliminarChequePostFechado"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonEliminarToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"EliminarToolBarChequePostFechado"));
						
			this.jInternalFrameDetalleFormChequePostFechado.jMenuItemEliminarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarChequePostFechado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarChequePostFechado.addActionListener (new ButtonActionListener(this,"CancelarChequePostFechado"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonCancelarToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"CancelarToolBarChequePostFechado"));
			
			this.jInternalFrameDetalleFormChequePostFechado.jMenuItemCancelarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarChequePostFechado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarChequePostFechado"));		
		
		
		this.jButtonCerrarChequePostFechado.addActionListener (new ButtonActionListener(this,"CerrarChequePostFechado"));
		
		
		this.jButtonCerrarToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"CerrarToolBarChequePostFechado"));
			
		this.jMenuItemCerrarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarChequePostFechado"));
			
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jMenuItemDetalleCerrarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarChequePostFechado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosChequePostFechado.addActionListener (new ButtonActionListener(this,"GuardarCambiosChequePostFechado"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarChequePostFechado"));
		}
		
		this.jButtonCopiarToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"CopiarToolBarChequePostFechado"));
			
		this.jButtonVerFormToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"VerFormToolBarChequePostFechado"));
		
		this.jMenuItemGuardarCambiosChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosChequePostFechado"));
			
		this.jMenuItemCopiarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarChequePostFechado"));		
		
		this.jMenuItemVerFormChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormChequePostFechado"));		
		
		
		this.jButtonGuardarCambiosTablaChequePostFechado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaChequePostFechado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarChequePostFechado"));
			
		this.jMenuItemGuardarCambiosTablaChequePostFechado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaChequePostFechado"));		
		
		
		
		this.jButtonRecargarInformacionChequePostFechado.addActionListener (new ButtonActionListener(this,"RecargarInformacionChequePostFechado"));
					
		this.jButtonRecargarInformacionToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarChequePostFechado"));
		
		this.jMenuItemRecargarInformacionChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionChequePostFechado"));		
		
		
		
		this.jButtonAnterioresChequePostFechado.addActionListener (new ButtonActionListener(this,"AnterioresChequePostFechado"));
		
		
		this.jButtonAnterioresToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarChequePostFechado"));
		
		this.jMenuItemAnterioresChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresChequePostFechado"));		
		
		
		this.jButtonSiguientesChequePostFechado.addActionListener (new ButtonActionListener(this,"SiguientesChequePostFechado"));
		
		
		this.jButtonSiguientesToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarChequePostFechado"));
			
		this.jMenuItemSiguientesChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesChequePostFechado"));
			
		this.jMenuItemAbrirOrderByChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByChequePostFechado"));
			
		this.jMenuItemMostrarOcultarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarChequePostFechado"));
			
		this.jMenuItemDetalleAbrirOrderByChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByChequePostFechado"));
			
		this.jMenuItemDetalleMostarOcultarChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarChequePostFechado"));		
		
		
		this.jButtonNuevoGuardarCambiosChequePostFechado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosChequePostFechado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarChequePostFechado"));
			
		this.jMenuItemNuevoGuardarCambiosChequePostFechado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosChequePostFechado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosChequePostFechado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosChequePostFechado"));

		this.jCheckBoxSeleccionadosChequePostFechado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosChequePostFechado"));
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioChequePostFechado"));
		}
		
		
		this.jComboBoxTiposRelacionesChequePostFechado.addActionListener (new ButtonActionListener(this,"TiposRelacionesChequePostFechado"));
			
		this.jComboBoxTiposAccionesChequePostFechado.addActionListener (new ButtonActionListener(this,"TiposAccionesChequePostFechado"));
					
		this.jComboBoxTiposSeleccionarChequePostFechado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarChequePostFechado"));
			
		this.jTextFieldValorCampoGeneralChequePostFechado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralChequePostFechado"));		
		
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonidChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"idChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_empresaChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_empresaChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_sucursalChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_sucursalChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalChequePostFechadoBusqueda"));
		//jButtonid_clienteChequePostFechado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteChequePostFechadoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechado.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechadoBusqueda"));
		//jButtonid_asiento_contableChequePostFechado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableChequePostFechadoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechado.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_ejercicioChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_ejercicioChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_periodoChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_periodoChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_tipo_forma_pagoChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonnombre_giraChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_giraChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonfecha_vencimientoChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_originalChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonnumeroChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"numeroChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonnumero_chequeChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtondescripcionChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_anioChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_anioChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_mesChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_mesChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_mesChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesChequePostFechadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAsientoContableChequePostFechado.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableChequePostFechado"));

			this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechado"));

			this.jButtonFK_IdClienteChequePostFechado.addActionListener(new ButtonActionListener(this,"FK_IdClienteChequePostFechado"));

			this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechado"));

			this.jButtonFK_IdTipoFormaPagoChequePostFechado.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoChequePostFechado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoChequePostFechado!=null) {
				this.jInternalFrameReporteDinamicoChequePostFechado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoChequePostFechado"));
				this.jInternalFrameReporteDinamicoChequePostFechado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoChequePostFechado"));
				this.jInternalFrameReporteDinamicoChequePostFechado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoChequePostFechado"));
			}
			
			//this.jButtonCerrarReporteDinamicoChequePostFechado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoChequePostFechado"));				
			//this.jButtonGenerarReporteDinamicoChequePostFechado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoChequePostFechado"));
			//this.jButtonGenerarExcelReporteDinamicoChequePostFechado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoChequePostFechado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionChequePostFechado!=null) {
				this.jInternalFrameImportacionChequePostFechado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionChequePostFechado"));
				this.jInternalFrameImportacionChequePostFechado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionChequePostFechado"));
				this.jInternalFrameImportacionChequePostFechado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionChequePostFechado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByChequePostFechado.addActionListener (new ButtonActionListener(this,"AbrirOrderByChequePostFechado"));
			
			this.jButtonAbrirOrderByToolBarChequePostFechado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarChequePostFechado"));			
			
			if(this.jInternalFrameOrderByChequePostFechado!=null) {
				this.jInternalFrameOrderByChequePostFechado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByChequePostFechado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequePostFechado.jTabbedPaneRelacionesChequePostFechado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesChequePostFechado"));
		
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
            		closingInternalFrameChequePostFechado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormChequePostFechado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormChequePostFechado = (JInternalFrameBase)event.getSource();
	            	
	            ChequePostFechadoBeanSwingJInternalFrame jInternalFrameParent=(ChequePostFechadoBeanSwingJInternalFrame)jInternalFrameDetalleFormChequePostFechado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarChequePostFechadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosChequePostFechado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosChequePostFechadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosChequePostFechado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosChequePostFechado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequePostFechadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequePostFechadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequePostFechadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoChequePostFechado";
		inputMap = this.jButtonNuevoChequePostFechado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoChequePostFechado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoChequePostFechadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequePostFechadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequePostFechadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequePostFechadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesChequePostFechado";
		inputMap = this.jButtonNuevoRelacionesChequePostFechado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesChequePostFechado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoChequePostFechadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarChequePostFechado";
		inputMap = this.jButtonModificarChequePostFechado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarChequePostFechado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarChequePostFechadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarChequePostFechado";
		inputMap = this.jButtonActualizarChequePostFechado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarChequePostFechado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarChequePostFechadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarChequePostFechado";
		inputMap = this.jButtonEliminarChequePostFechado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarChequePostFechado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarChequePostFechadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarChequePostFechado";
		inputMap = this.jButtonCancelarChequePostFechado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarChequePostFechado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarChequePostFechadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarChequePostFechado";
		inputMap = this.jButtonCerrarChequePostFechado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarChequePostFechado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarChequePostFechadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosChequePostFechado";
		inputMap = this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosChequePostFechado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormChequePostFechado.jButtonGuardarCambiosChequePostFechado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosChequePostFechadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosChequePostFechado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosChequePostFechadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesChequePostFechado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesChequePostFechadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarChequePostFechado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarChequePostFechadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralChequePostFechado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralChequePostFechadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonidChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"idChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_empresaChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_empresaChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_sucursalChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_sucursalChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalChequePostFechadoBusqueda"));
		//jButtonid_clienteChequePostFechado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteChequePostFechadoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechado.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechadoBusqueda"));
		//jButtonid_asiento_contableChequePostFechado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableChequePostFechadoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechado.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_ejercicioChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_ejercicioChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_periodoChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_periodoChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_tipo_forma_pagoChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonnombre_giraChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_giraChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonfecha_vencimientoChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_originalChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonnumeroChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"numeroChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonnumero_chequeChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeChequePostFechadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtondescripcionChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_anioChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_anioChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioChequePostFechadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_mesChequePostFechadoUpdate.addActionListener(new ButtonActionListener(this,"id_mesChequePostFechadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequePostFechado.jButtonid_mesChequePostFechadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesChequePostFechadoBusqueda"));
		
		
		this.jButtonFK_IdAsientoContableChequePostFechado.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableChequePostFechado"));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado.addActionListener(new ButtonActionListener(this,"id_asiento_contableChequePostFechado"));

		this.jButtonFK_IdClienteChequePostFechado.addActionListener(new ButtonActionListener(this,"FK_IdClienteChequePostFechado"));

		this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado.addActionListener(new ButtonActionListener(this,"id_clienteChequePostFechado"));

		this.jButtonFK_IdTipoFormaPagoChequePostFechado.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoChequePostFechado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionChequePostFechado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionChequePostFechadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarChequePostFechadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarChequePostFechado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosChequePostFechado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ChequePostFechado chequepostfechadoAux:this.chequepostfechadoLogic.getChequePostFechados()) {
					chequepostfechadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ChequePostFechado chequepostfechadoAux:chequepostfechados) {
					chequepostfechadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosChequePostFechadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingChequePostFechado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ChequePostFechado chequepostfechadoAux:this.chequepostfechadoLogic.getChequePostFechados()) {
						chequepostfechadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ChequePostFechado chequepostfechadoAux:chequepostfechados) {
						chequepostfechadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ChequePostFechado chequepostfechadoAux:this.chequepostfechadoLogic.getChequePostFechados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ChequePostFechado chequepostfechadoAux:chequepostfechados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaChequePostFechado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosChequePostFechado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosChequePostFechado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosChequePostFechadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingChequePostFechado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosChequePostFechado.getSelectedRows();
			
			ChequePostFechado chequepostfechadoLocal=new ChequePostFechado();
			
			//this.seleccionarTodosChequePostFechado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequepostfechadoLocal =(ChequePostFechado) this.chequepostfechadoLogic.getChequePostFechados().toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					chequepostfechadoLocal =(ChequePostFechado) this.chequepostfechados.toArray()[this.jTableDatosChequePostFechado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				chequepostfechadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ChequePostFechado chequepostfechadoAux:this.chequepostfechadoLogic.getChequePostFechados()) {
						chequepostfechadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ChequePostFechado chequepostfechadoAux:chequepostfechados) {
						chequepostfechadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaChequePostFechado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosChequePostFechado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosChequePostFechado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosChequePostFechado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualChequePostFechadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarChequePostFechadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralChequePostFechadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingChequePostFechado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralChequePostFechado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ChequePostFechado chequepostfechadoAux:this.chequepostfechadoLogic.getChequePostFechados()) {
				
						if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA)) {
							existe=true;
							chequepostfechadoAux.setnombre_gira(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							chequepostfechadoAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL)) {
							existe=true;
							chequepostfechadoAux.setfecha_vencimiento_original(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							chequepostfechadoAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							chequepostfechadoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							chequepostfechadoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ChequePostFechado chequepostfechadoAux:chequepostfechados) {
					
						if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA)) {
							existe=true;
							chequepostfechadoAux.setnombre_gira(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							chequepostfechadoAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL)) {
							existe=true;
							chequepostfechadoAux.setfecha_vencimiento_original(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							chequepostfechadoAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							chequepostfechadoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							chequepostfechadoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaChequePostFechado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesChequePostFechadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingChequePostFechado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioChequePostFechado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesChequePostFechado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteChequePostFechado) {				
					conSplash=true;//false;										
					
					//this.startProcessChequePostFechado(conSplash);
				
					this.generarReporteChequePostFechadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoChequePostFechadosSeleccionados();
				//this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoChequePostFechadosSeleccionados(false);
				//this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoChequePostFechadosSeleccionados(true);
				//this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessChequePostFechado();
				
				this.exportarChequePostFechadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionChequePostFechados();
				//this.importarChequePostFechados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessChequePostFechado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelChequePostFechadosSeleccionados();
				//this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cheque Post Fechado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessChequePostFechado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoChequePostFechado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyChequePostFechado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.setSelectedIndex(0);					
				}	
			} 			
			else if(ChequePostFechadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteChequePostFechado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessChequePostFechado(conSplash);
					
						//this.actualizarParametrosGeneralChequePostFechado();
						
						this.generarReporteProcesoAccionChequePostFechadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ChequePostFechadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cheque Post FechadoS SELECCIONADOS?", "MANTENIMIENTO DE Cheque Post Fechado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessChequePostFechado();
				
						this.actualizarParametrosGeneralChequePostFechado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.chequepostfechadoReturnGeneral=chequepostfechadoLogic.procesarAccionChequePostFechadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.chequepostfechadoLogic.getChequePostFechados(),this.chequepostfechadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarChequePostFechadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralChequePostFechado();
					
					ChequePostFechadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarChequePostFechadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesChequePostFechado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormChequePostFechado.jComboBoxTiposAccionesFormularioChequePostFechado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessChequePostFechado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesChequePostFechadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessChequePostFechado();
			
			if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();		
			ChequePostFechado chequepostfechado=new ChequePostFechado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingChequePostFechado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesChequePostFechado.getSelectedItem();
			
			
			
			
			chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(chequepostfechadosSeleccionados.size()==1) {
				for(ChequePostFechado chequepostfechadoAux:chequepostfechadosSeleccionados) {
					chequepostfechado=chequepostfechadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessChequePostFechado();
			
      		//this.finishProcessChequePostFechado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarChequePostFechadoReturnGeneral() throws Exception {
		if(this.chequepostfechadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.chequepostfechadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.chequepostfechadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.chequepostfechadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.chequepostfechadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.chequepostfechadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingChequePostFechado(false);
		}
		
		if(this.chequepostfechadoReturnGeneral.getConRetornoLista() || this.chequepostfechadoReturnGeneral.getConRetornoObjeto()) {
			if(this.chequepostfechadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.chequepostfechadoLogic.setChequePostFechados(this.chequepostfechadoReturnGeneral.getChequePostFechados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.chequepostfechadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.chequepostfechadoLogic.setChequePostFechado(this.chequepostfechadoReturnGeneral.getChequePostFechado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingChequePostFechado(false);
		}
	}
	
	public void actualizarParametrosGeneralChequePostFechado() throws Exception {
		
		
	}
	
	public ArrayList<ChequePostFechado> getChequePostFechadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioChequePostFechado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ChequePostFechado chequepostfechadoAux:chequepostfechadoLogic.getChequePostFechados()) {
					if(chequepostfechadoAux.getIsSelected()) {
						chequepostfechadosSeleccionados.add(chequepostfechadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ChequePostFechado chequepostfechadoAux:this.chequepostfechados) {
					if(chequepostfechadoAux.getIsSelected()) {
						chequepostfechadosSeleccionados.add(chequepostfechadoAux);				
					}
				}
			}
			
			if(chequepostfechadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						chequepostfechadosSeleccionados.addAll(this.chequepostfechadoLogic.getChequePostFechados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						chequepostfechadosSeleccionados.addAll(this.chequepostfechados);				
					}
				}
			}
		} else {
			chequepostfechadosSeleccionados.add(this.chequepostfechado);
		}
		
		return chequepostfechadosSeleccionados;
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
	
	public void generarReporteChequePostFechadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalChequePostFechadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoChequePostFechadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoChequePostFechadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoChequePostFechadosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cheque Post Fechado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesChequePostFechadosSeleccionados() throws Exception {
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();		
		
		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteChequePostFechados("Todos",chequepostfechadosSeleccionados);
		
	}	
	
	public void generarReporteNormalChequePostFechadosSeleccionados() throws Exception {
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();		
		
		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteChequePostFechados("Todos",chequepostfechadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionChequePostFechadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();
		
		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteChequePostFechados("Todos",chequepostfechadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoChequePostFechadosSeleccionados() throws Exception {
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoChequePostFechado();
		
		
		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoChequePostFechado();
		
		
		//this.generarReporteChequePostFechados("Todos",chequepostfechadosSeleccionados ,chequepostfechadoImplementable,chequepostfechadoImplementableHome);
	}
	
	public void mostrarImportacionChequePostFechados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionChequePostFechado();
		
		this.abrirFrameImportacionChequePostFechado();		
		
			
		//this.generarReporteChequePostFechados("Todos",chequepostfechadosSeleccionados ,chequepostfechadoImplementable,chequepostfechadoImplementableHome);
	}
	
	public void importarChequePostFechados() throws Exception {		
	
	}
	
	public void exportarChequePostFechadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelChequePostFechadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoChequePostFechadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlChequePostFechadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cheque Post Fechado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoChequePostFechadosSeleccionados() throws Exception {
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();		
		
		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequepostfechado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarChequePostFechado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ChequePostFechado chequepostfechadoAux:chequepostfechadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarChequePostFechado(chequepostfechadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//chequepostfechadoAux.setsDetalleGeneralEntityReporte(chequepostfechadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarChequePostFechado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequePostFechadoConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarChequePostFechado(ChequePostFechado chequepostfechado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=chequepostfechado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getasientocontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.gettipoformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getnombre_gira();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getfecha_vencimiento_original().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequepostfechado.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelChequePostFechadosSeleccionados() throws Exception {
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();		
		
		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequepostfechado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ChequePostFechados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelChequePostFechado(row);				
				iRow++;
			}				
			
			for(ChequePostFechado chequepostfechadoAux:chequepostfechadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelChequePostFechado(chequepostfechadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlChequePostFechadosSeleccionados() throws Exception {
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();		
		
		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequepostfechado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("chequepostfechados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("chequepostfechado");
			//elementRoot.appendChild(element);
		
			for(ChequePostFechado chequepostfechadoAux:chequepostfechadosSeleccionados) {
				element = document.createElement("chequepostfechado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlChequePostFechado(chequepostfechadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheque Post Fechado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelChequePostFechado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequePostFechadoConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelChequePostFechado(ChequePostFechado chequepostfechado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getasientocontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.gettipoformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getnombre_gira());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getfecha_vencimiento_original());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequepostfechado.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlChequePostFechado(ChequePostFechado chequepostfechado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ChequePostFechadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(chequepostfechado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ChequePostFechadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(chequepostfechado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ChequePostFechadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(chequepostfechado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ChequePostFechadoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(chequepostfechado.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(ChequePostFechadoConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(chequepostfechado.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementasientocontable_descripcion = document.createElement(ChequePostFechadoConstantesFunciones.IDASIENTOCONTABLE);
		elementasientocontable_descripcion.appendChild(document.createTextNode(chequepostfechado.getasientocontable_descripcion()));
		element.appendChild(elementasientocontable_descripcion);

		Element elementejercicio_descripcion = document.createElement(ChequePostFechadoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(chequepostfechado.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(ChequePostFechadoConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(chequepostfechado.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementtipoformapago_descripcion = document.createElement(ChequePostFechadoConstantesFunciones.IDTIPOFORMAPAGO);
		elementtipoformapago_descripcion.appendChild(document.createTextNode(chequepostfechado.gettipoformapago_descripcion()));
		element.appendChild(elementtipoformapago_descripcion);

		Element elementnombre_gira = document.createElement(ChequePostFechadoConstantesFunciones.NOMBREGIRA);
		elementnombre_gira.appendChild(document.createTextNode(chequepostfechado.getnombre_gira().trim()));
		element.appendChild(elementnombre_gira);

		Element elementfecha_vencimiento = document.createElement(ChequePostFechadoConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(chequepostfechado.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementfecha_vencimiento_original = document.createElement(ChequePostFechadoConstantesFunciones.FECHAVENCIMIENTOORIGINAL);
		elementfecha_vencimiento_original.appendChild(document.createTextNode(chequepostfechado.getfecha_vencimiento_original().toString().trim()));
		element.appendChild(elementfecha_vencimiento_original);

		Element elementnumero = document.createElement(ChequePostFechadoConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(chequepostfechado.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementnumero_cheque = document.createElement(ChequePostFechadoConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(chequepostfechado.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementdescripcion = document.createElement(ChequePostFechadoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(chequepostfechado.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementanio_descripcion = document.createElement(ChequePostFechadoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(chequepostfechado.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(ChequePostFechadoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(chequepostfechado.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoChequePostFechadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ChequePostFechado> chequepostfechadosSeleccionados=new ArrayList<ChequePostFechado>();
		
		chequepostfechadosSeleccionados=this.getChequePostFechadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoChequePostFechado(chequepostfechadosSeleccionados);
		
		this.generarReporteChequePostFechados("Todos",chequepostfechadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoChequePostFechado(ArrayList<ChequePostFechado> chequepostfechadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ChequePostFechado chequepostfechadoAux:chequepostfechadosSeleccionados) {
				chequepostfechadoAux.setsDetalleGeneralEntityReporte(chequepostfechadoAux.toString());
			
				if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getasientocontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.gettipoformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getnombre_gira());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(chequepostfechadoAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(chequepostfechadoAux.getfecha_vencimiento_original()));
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequePostFechadoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					chequepostfechadoAux.setsDescripcionGeneralEntityReporte1(chequepostfechadoAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequePostFechadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesChequePostFechado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoChequePostFechado=true;
				this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=true;
				this.isVisibilidadCeldaGuardarCambiosChequePostFechado=true;
			}
			
			this.isVisibilidadCeldaModificarChequePostFechado=false;
			this.isVisibilidadCeldaActualizarChequePostFechado=false;
			this.isVisibilidadCeldaEliminarChequePostFechado=false;
			this.isVisibilidadCeldaCancelarChequePostFechado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequePostFechado=true;
				} else {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoChequePostFechado=false;
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=false;
			this.isVisibilidadCeldaModificarChequePostFechado=false;
			this.isVisibilidadCeldaActualizarChequePostFechado=true;
			this.isVisibilidadCeldaEliminarChequePostFechado=false;
			this.isVisibilidadCeldaCancelarChequePostFechado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequePostFechado=true;
				} else {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoChequePostFechado=false;
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=false;
			this.isVisibilidadCeldaModificarChequePostFechado=false;
			this.isVisibilidadCeldaActualizarChequePostFechado=true;
			this.isVisibilidadCeldaEliminarChequePostFechado=true;
			this.isVisibilidadCeldaCancelarChequePostFechado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequePostFechado=true;
				} else {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoChequePostFechado=false;
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=false;
			this.isVisibilidadCeldaModificarChequePostFechado=false;
			this.isVisibilidadCeldaActualizarChequePostFechado=true;
			this.isVisibilidadCeldaEliminarChequePostFechado=false;
			this.isVisibilidadCeldaCancelarChequePostFechado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				} else {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoChequePostFechado=true;
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=true;
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=true;
			this.isVisibilidadCeldaModificarChequePostFechado=false;
			this.isVisibilidadCeldaActualizarChequePostFechado=false;
			this.isVisibilidadCeldaEliminarChequePostFechado=false;
			this.isVisibilidadCeldaCancelarChequePostFechado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequePostFechado=true;
				} else {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoChequePostFechado=false;
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=false;
			this.isVisibilidadCeldaActualizarChequePostFechado=false;
			this.isVisibilidadCeldaEliminarChequePostFechado=false;
			this.isVisibilidadCeldaCancelarChequePostFechado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				} else {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoChequePostFechado=false;
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=false;
			this.isVisibilidadCeldaModificarChequePostFechado=true;
			this.isVisibilidadCeldaActualizarChequePostFechado=false;
			this.isVisibilidadCeldaEliminarChequePostFechado=false;
			this.isVisibilidadCeldaCancelarChequePostFechado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				} else {
					this.isVisibilidadCeldaGuardarChequePostFechado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ChequePostFechadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoChequePostFechado=true;
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=true;
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=true;
		} else {
			this.actualizarEstadoPanelsChequePostFechado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarChequePostFechado=false;
			//this.isVisibilidadCeldaVerFormChequePostFechado=false;
			this.isVisibilidadCeldaDuplicarChequePostFechado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!chequepostfechadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;
		} else {
			this.isVisibilidadCeldaNuevoChequePostFechado=false;
			this.isVisibilidadCeldaGuardarCambiosChequePostFechado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			if(!chequepostfechadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;												
			}
			
			this.jButtonCerrarChequePostFechado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesChequePostFechado=false;
		}
		
		if(!this.permiteMantenimiento(this.chequepostfechado)) {
			this.isVisibilidadCeldaActualizarChequePostFechado=false;
			this.isVisibilidadCeldaEliminarChequePostFechado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesChequePostFechado() {
	}
	
	public void actualizarEstadoPanelsChequePostFechado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionChequePostFechado!=null) {
				this.jScrollPanelDatosEdicionChequePostFechado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequePostFechado!=null) {
				this.jTabbedPaneBusquedasChequePostFechado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosChequePostFechado!=null) {
				this.jScrollPanelDatosChequePostFechado.setVisible(true);
			}
			
			if(this.jPanelPaginacionChequePostFechado!=null) {
				this.jPanelPaginacionChequePostFechado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesChequePostFechado!=null) {
				this.jPanelParametrosReportesChequePostFechado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionChequePostFechado!=null) {
				this.jScrollPanelDatosEdicionChequePostFechado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequePostFechado!=null) {
				this.jTabbedPaneBusquedasChequePostFechado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosChequePostFechado!=null) {
				this.jScrollPanelDatosChequePostFechado.setVisible(false);
			}
			
			if(this.jPanelPaginacionChequePostFechado!=null) {
				this.jPanelPaginacionChequePostFechado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesChequePostFechado!=null) {
				this.jPanelParametrosReportesChequePostFechado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionChequePostFechado!=null) {
				this.jScrollPanelDatosEdicionChequePostFechado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequePostFechado!=null) {
				this.jTabbedPaneBusquedasChequePostFechado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosChequePostFechado!=null) {
				this.jScrollPanelDatosChequePostFechado.setVisible(false);
			}
			
			if(this.jPanelPaginacionChequePostFechado!=null) {
				this.jPanelPaginacionChequePostFechado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesChequePostFechado!=null) {
				this.jPanelParametrosReportesChequePostFechado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionChequePostFechado!=null) {
				this.jScrollPanelDatosEdicionChequePostFechado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequePostFechado!=null) {
				this.jTabbedPaneBusquedasChequePostFechado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosChequePostFechado!=null) {
				this.jScrollPanelDatosChequePostFechado.setVisible(false);
			}
			
			if(this.jPanelPaginacionChequePostFechado!=null) {
				this.jPanelPaginacionChequePostFechado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesChequePostFechado!=null) {
				this.jPanelParametrosReportesChequePostFechado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionChequePostFechado!=null) {
				this.jScrollPanelDatosEdicionChequePostFechado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequePostFechado!=null) {
				this.jTabbedPaneBusquedasChequePostFechado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosChequePostFechado!=null) {
				this.jScrollPanelDatosChequePostFechado.setVisible(true);
			}
			
			if(this.jPanelPaginacionChequePostFechado!=null) {
				this.jPanelPaginacionChequePostFechado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesChequePostFechado!=null) {
				this.jPanelParametrosReportesChequePostFechado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionChequePostFechado!=null) {
				this.jScrollPanelDatosEdicionChequePostFechado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequePostFechado!=null) {
				this.jTabbedPaneBusquedasChequePostFechado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosChequePostFechado!=null) {
				this.jScrollPanelDatosChequePostFechado.setVisible(true);
			}
			
			if(this.jPanelPaginacionChequePostFechado!=null) {
				this.jPanelPaginacionChequePostFechado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesChequePostFechado!=null) {
				this.jPanelParametrosReportesChequePostFechado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionChequePostFechado!=null) {
				this.jScrollPanelDatosEdicionChequePostFechado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequePostFechado!=null) {
				this.jTabbedPaneBusquedasChequePostFechado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosChequePostFechado!=null) {
				this.jScrollPanelDatosChequePostFechado.setVisible(true);
			}
			
			if(this.jPanelPaginacionChequePostFechado!=null) {
				this.jPanelPaginacionChequePostFechado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesChequePostFechado!=null) {
				this.jPanelParametrosReportesChequePostFechado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasChequePostFechado!=null) {
					this.jTabbedPaneBusquedasChequePostFechado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesChequePostFechado!=null) {
				this.jPanelParametrosReportesChequePostFechado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequePostFechado!=null) {
				this.jTabbedPaneBusquedasChequePostFechado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesChequePostFechado!=null) {
				this.jPanelParametrosReportesChequePostFechado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdAsientoContableChequePostFechado);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdClienteChequePostFechado);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdTipoFormaPagoChequePostFechado);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAsientoContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdAsientoContableChequePostFechado);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdClienteChequePostFechado);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdTipoFormaPagoChequePostFechado);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdAsientoContable=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdAsientoContableChequePostFechado);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdClienteChequePostFechado);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdTipoFormaPagoChequePostFechado);}
		}
		
	}

	public void setVisibilidadBusquedasParaAsientoContable(Boolean isParaAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAsientoContableNegation=!isParaAsientoContable;

			this.isVisibilidadFK_IdAsientoContable=isParaAsientoContable;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdAsientoContableChequePostFechado);}

			this.isVisibilidadFK_IdCliente=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdClienteChequePostFechado);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdTipoFormaPagoChequePostFechado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdAsientoContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdAsientoContableChequePostFechado);}

			this.isVisibilidadFK_IdCliente=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdClienteChequePostFechado);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdTipoFormaPagoChequePostFechado);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdAsientoContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdAsientoContableChequePostFechado);}

			this.isVisibilidadFK_IdCliente=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdClienteChequePostFechado);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdTipoFormaPagoChequePostFechado);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFormaPago(Boolean isParaTipoFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFormaPagoNegation=!isParaTipoFormaPago;

			this.isVisibilidadFK_IdAsientoContable=isParaTipoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdAsientoContableChequePostFechado);}

			this.isVisibilidadFK_IdCliente=isParaTipoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdClienteChequePostFechado);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaTipoFormaPago;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdTipoFormaPagoChequePostFechado);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAsientoContable=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdAsientoContableChequePostFechado);}

			this.isVisibilidadFK_IdCliente=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdClienteChequePostFechado);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdTipoFormaPagoChequePostFechado);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAsientoContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdAsientoContableChequePostFechado);}

			this.isVisibilidadFK_IdCliente=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdClienteChequePostFechado);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasChequePostFechado.remove(jPanelFK_IdTipoFormaPagoChequePostFechado);}
		}
		
	}
	
	
	
	

	public String registrarSesionChequePostFechadoParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(chequepostfechadoSessionBean==null) {
				chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(chequepostfechadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.chequepostfechadoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ChequePostFechadoConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionChequePostFechado(true);
			//clienteSessionBean.setlidChequePostFechadoActual(this.idChequePostFechadoActual);

			chequepostfechadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyChequePostFechado(true);
			chequepostfechadoSessionBean.setlIdChequePostFechadoActualForeignKey(this.idChequePostFechadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionChequePostFechadoParaBusquedaAsientoContables() throws Exception {
		Boolean isPaginaPopupAsientoContable=false;

		try {

			if(chequepostfechadoSessionBean==null) {
				chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
			}

			if(asientocontableSessionBean==null) {
				asientocontableSessionBean=new AsientoContableSessionBean();
			}

			asientocontableSessionBean.setsPathNavegacionActual(chequepostfechadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
			asientocontableSessionBean.setisPermiteRecargarInformacion(false);
			asientocontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupAsientoContable=asientocontableSessionBean.getisPaginaPopup();
			asientocontableSessionBean.setisPaginaPopup(false);
			asientocontableSessionBean.setEstaModoBusqueda(true);
			asientocontableSessionBean.setsFuncionBusquedaRapida("window.opener.chequepostfechadoFuncionGeneral.setCombosCodigoDesdeBusquedaid_asiento_contable(TO_REPLACE);");
			asientocontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable(true);
			asientocontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable(ChequePostFechadoConstantesFunciones.SNOMBREOPCION);
			//asientocontableSessionBean.setisBusquedaDesdeForeignKeySesionChequePostFechado(true);
			//asientocontableSessionBean.setlidChequePostFechadoActual(this.idChequePostFechadoActual);

			chequepostfechadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyChequePostFechado(true);
			chequepostfechadoSessionBean.setlIdChequePostFechadoActualForeignKey(this.idChequePostFechadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ChequePostFechadoSessionBean chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
		
		if(this.chequepostfechadoSessionBean==null) {
			this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
		}
		
		this.chequepostfechadoSessionBean.setsUltimaBusquedaChequePostFechado(this.getsAccionBusqueda());
		this.chequepostfechadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.chequepostfechadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
			chequepostfechadoSessionBean.setid_asiento_contable(this.getid_asiento_contableFK_IdAsientoContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			chequepostfechadoSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			chequepostfechadoSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			chequepostfechadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			chequepostfechadoSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			chequepostfechadoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
			chequepostfechadoSessionBean.setid_tipo_forma_pago(this.getid_tipo_forma_pagoFK_IdTipoFormaPago());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ChequePostFechadoSessionBean chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
		
		if(this.chequepostfechadoSessionBean==null) {
			this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
		}
		
		if(this.chequepostfechadoSessionBean.getsUltimaBusquedaChequePostFechado()!=null&&!this.chequepostfechadoSessionBean.getsUltimaBusquedaChequePostFechado().equals("")) {
			this.setsAccionBusqueda(chequepostfechadoSessionBean.getsUltimaBusquedaChequePostFechado());
			this.setiNumeroPaginacion(chequepostfechadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(chequepostfechadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
				this.setid_asiento_contableFK_IdAsientoContable(chequepostfechadoSessionBean.getid_asiento_contable());
				chequepostfechadoSessionBean.setid_asiento_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(chequepostfechadoSessionBean.getid_cliente());
				chequepostfechadoSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(chequepostfechadoSessionBean.getid_ejercicio());
				chequepostfechadoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(chequepostfechadoSessionBean.getid_empresa());
				chequepostfechadoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(chequepostfechadoSessionBean.getid_periodo());
				chequepostfechadoSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(chequepostfechadoSessionBean.getid_sucursal());
				chequepostfechadoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
				this.setid_tipo_forma_pagoFK_IdTipoFormaPago(chequepostfechadoSessionBean.getid_tipo_forma_pago());
				chequepostfechadoSessionBean.setid_tipo_forma_pago(-1L);
			}
		}
		
		this.chequepostfechadoSessionBean.setsUltimaBusquedaChequePostFechado("");
		this.chequepostfechadoSessionBean.setiNumeroPaginacion(ChequePostFechadoConstantesFunciones.INUMEROPAGINACION);
		this.chequepostfechadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaChequePostFechado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioChequePostFechado() {
		this.updateBorderResaltarBusquedasFormularioChequePostFechado();
		this.updateVisibilidadBusquedasFormularioChequePostFechado();
		this.updateHabilitarBusquedasFormularioChequePostFechado();
	}
	
	public void updateBorderResaltarBusquedasFormularioChequePostFechado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasChequePostFechado.getComponents().length>0) {
	

		if(this.chequepostfechadoConstantesFunciones.resaltarFK_IdAsientoContableChequePostFechado!=null) {
			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdAsientoContableChequePostFechado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);
				jPanel.setBorder(this.chequepostfechadoConstantesFunciones.resaltarFK_IdAsientoContableChequePostFechado);
			}
		}

		if(this.chequepostfechadoConstantesFunciones.resaltarFK_IdClienteChequePostFechado!=null) {
			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdClienteChequePostFechado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);
				jPanel.setBorder(this.chequepostfechadoConstantesFunciones.resaltarFK_IdClienteChequePostFechado);
			}
		}

		if(this.chequepostfechadoConstantesFunciones.resaltarFK_IdTipoFormaPagoChequePostFechado!=null) {
			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdTipoFormaPagoChequePostFechado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);
				jPanel.setBorder(this.chequepostfechadoConstantesFunciones.resaltarFK_IdTipoFormaPagoChequePostFechado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioChequePostFechado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasChequePostFechado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdAsientoContableChequePostFechado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.chequepostfechadoConstantesFunciones.mostrarFK_IdAsientoContableChequePostFechado);
			if(!this.chequepostfechadoConstantesFunciones.mostrarFK_IdAsientoContableChequePostFechado && index>-1) {
				this.jTabbedPaneBusquedasChequePostFechado.remove(index);
			}

			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdClienteChequePostFechado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.chequepostfechadoConstantesFunciones.mostrarFK_IdClienteChequePostFechado);
			if(!this.chequepostfechadoConstantesFunciones.mostrarFK_IdClienteChequePostFechado && index>-1) {
				this.jTabbedPaneBusquedasChequePostFechado.remove(index);
			}

			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdTipoFormaPagoChequePostFechado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.chequepostfechadoConstantesFunciones.mostrarFK_IdTipoFormaPagoChequePostFechado);
			if(!this.chequepostfechadoConstantesFunciones.mostrarFK_IdTipoFormaPagoChequePostFechado && index>-1) {
				this.jTabbedPaneBusquedasChequePostFechado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioChequePostFechado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasChequePostFechado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdAsientoContableChequePostFechado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.chequepostfechadoConstantesFunciones.activarFK_IdAsientoContableChequePostFechado);
				this.jTabbedPaneBusquedasChequePostFechado.setEnabledAt(index,this.chequepostfechadoConstantesFunciones.activarFK_IdAsientoContableChequePostFechado);
			}

			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdClienteChequePostFechado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.chequepostfechadoConstantesFunciones.activarFK_IdClienteChequePostFechado);
				this.jTabbedPaneBusquedasChequePostFechado.setEnabledAt(index,this.chequepostfechadoConstantesFunciones.activarFK_IdClienteChequePostFechado);
			}

			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdTipoFormaPagoChequePostFechado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.chequepostfechadoConstantesFunciones.activarFK_IdTipoFormaPagoChequePostFechado);
				this.jTabbedPaneBusquedasChequePostFechado.setEnabledAt(index,this.chequepostfechadoConstantesFunciones.activarFK_IdTipoFormaPagoChequePostFechado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaChequePostFechado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAsientoContable")) {
			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdAsientoContableChequePostFechado);

			this.jTabbedPaneBusquedasChequePostFechado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);

			this.chequepostfechadoConstantesFunciones.setResaltarFK_IdAsientoContableChequePostFechado(resaltar);

			jPanel.setBorder(this.chequepostfechadoConstantesFunciones.resaltarFK_IdAsientoContableChequePostFechado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdClienteChequePostFechado);

			this.jTabbedPaneBusquedasChequePostFechado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);

			this.chequepostfechadoConstantesFunciones.setResaltarFK_IdClienteChequePostFechado(resaltar);

			jPanel.setBorder(this.chequepostfechadoConstantesFunciones.resaltarFK_IdClienteChequePostFechado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoFormaPago")) {
			index= this.jTabbedPaneBusquedasChequePostFechado.indexOfComponent(this.jPanelFK_IdTipoFormaPagoChequePostFechado);

			this.jTabbedPaneBusquedasChequePostFechado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasChequePostFechado.getComponent(index);

			this.chequepostfechadoConstantesFunciones.setResaltarFK_IdTipoFormaPagoChequePostFechado(resaltar);

			jPanel.setBorder(this.chequepostfechadoConstantesFunciones.resaltarFK_IdTipoFormaPagoChequePostFechado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarChequePostFechado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioChequePostFechado() throws Exception {

		if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioChequePostFechado();
		this.updateVisibilidadResaltarControlesFormularioChequePostFechado();
		this.updateHabilitarResaltarControlesFormularioChequePostFechado();
		
	}
	
	public void updateBorderResaltarControlesFormularioChequePostFechado() throws Exception {
		if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.chequepostfechadoConstantesFunciones.resaltaridChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltaridChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarid_empresaChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarid_empresaChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarid_sucursalChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarid_sucursalChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarid_clienteChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarid_clienteChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarid_asiento_contableChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarid_asiento_contableChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarid_ejercicioChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarid_ejercicioChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarid_periodoChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarid_periodoChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarid_tipo_forma_pagoChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarid_tipo_forma_pagoChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarnombre_giraChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jTextAreanombre_giraChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarnombre_giraChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarfecha_vencimientoChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimientoChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarfecha_vencimientoChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarfecha_vencimiento_originalChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimiento_originalChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarfecha_vencimiento_originalChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarnumeroChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumeroChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarnumeroChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarnumero_chequeChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumero_chequeChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarnumero_chequeChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltardescripcionChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jTextAreadescripcionChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltardescripcionChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarid_anioChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarid_anioChequePostFechado);}
		if(this.chequepostfechadoConstantesFunciones.resaltarid_mesChequePostFechado!=null && this.jInternalFrameDetalleFormChequePostFechado!=null) {this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.setBorder(this.chequepostfechadoConstantesFunciones.resaltarid_mesChequePostFechado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioChequePostFechado() throws Exception {		
		if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
	
		//this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostraridChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelidChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostraridChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_empresaChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelid_empresaChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_empresaChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_sucursalChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelid_sucursalChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_sucursalChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_clienteChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelid_clienteChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_clienteChequePostFechado);
			this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_clienteChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_asiento_contableChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelid_asiento_contableChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_asiento_contableChequePostFechado);
			this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_asiento_contableChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_ejercicioChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelid_ejercicioChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_ejercicioChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_periodoChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelid_periodoChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_periodoChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_tipo_forma_pagoChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelid_tipo_forma_pagoChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_tipo_forma_pagoChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jTextAreanombre_giraChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarnombre_giraChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelnombre_giraChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarnombre_giraChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimientoChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarfecha_vencimientoChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelfecha_vencimientoChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarfecha_vencimientoChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimiento_originalChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarfecha_vencimiento_originalChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelfecha_vencimiento_originalChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarfecha_vencimiento_originalChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumeroChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarnumeroChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelnumeroChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarnumeroChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumero_chequeChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarnumero_chequeChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelnumero_chequeChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarnumero_chequeChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jTextAreadescripcionChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrardescripcionChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPaneldescripcionChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrardescripcionChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_anioChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelid_anioChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_anioChequePostFechado);
		//this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_mesChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jPanelid_mesChequePostFechado.setVisible(this.chequepostfechadoConstantesFunciones.mostrarid_mesChequePostFechado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioChequePostFechado() throws Exception {
		if(this.jInternalFrameDetalleFormChequePostFechado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormChequePostFechado!=null) {
	
		this.jInternalFrameDetalleFormChequePostFechado.jLabelidChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activaridChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_empresaChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_empresaChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_sucursalChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_sucursalChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_clienteChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_clienteChequePostFechado);
			this.jInternalFrameDetalleFormChequePostFechado.jButtonid_clienteChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_clienteChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_asiento_contableChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_asiento_contableChequePostFechado);
			this.jInternalFrameDetalleFormChequePostFechado.jButtonid_asiento_contableChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_asiento_contableChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_ejercicioChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_ejercicioChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_periodoChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_periodoChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_tipo_forma_pagoChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_tipo_forma_pagoChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jTextAreanombre_giraChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarnombre_giraChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimientoChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarfecha_vencimientoChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jDateChooserfecha_vencimiento_originalChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarfecha_vencimiento_originalChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumeroChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarnumeroChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jTextFieldnumero_chequeChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarnumero_chequeChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jTextAreadescripcionChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activardescripcionChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_anioChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_anioChequePostFechado);
		this.jInternalFrameDetalleFormChequePostFechado.jComboBoxid_mesChequePostFechado.setEnabled(this.chequepostfechadoConstantesFunciones.activarid_mesChequePostFechado);
		}
	}
	
		
}