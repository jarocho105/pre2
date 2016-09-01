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

import com.bydan.erp.cartera.util.CargaFamiliarConstantesFunciones;
import com.bydan.erp.cartera.util.CargaFamiliarParameterReturnGeneral;
//import com.bydan.erp.cartera.util.CargaFamiliarParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.CargaFamiliarBean;
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
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CargaFamiliarBeanSwingJInternalFrame extends CargaFamiliarJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CargaFamiliarBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CargaFamiliar> cargafamiliarValidator = new ClassValidator<CargaFamiliar>(CargaFamiliar.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CargaFamiliar cargafamiliar;	
	public CargaFamiliar cargafamiliarAux;
	public CargaFamiliar cargafamiliarAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CargaFamiliar cargafamiliarTotales;
	public Long idCargaFamiliarActual;
	public Long iIdNuevoCargaFamiliar=0L;
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

	public String sFinalQueryComboTipoCargaFami="";

	public List<TipoCargaFami> tipocargafamisForeignKey;

	public List<TipoCargaFami> gettipocargafamisForeignKey() {
		return tipocargafamisForeignKey;
	}

	public void settipocargafamisForeignKey(List<TipoCargaFami> tipocargafamisForeignKey) {
		this.tipocargafamisForeignKey = tipocargafamisForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCargaFami tipocargafamiForeignKey;

	public TipoCargaFami gettipocargafamiForeignKey() {
		return tipocargafamiForeignKey;
	}

	public void settipocargafamiForeignKey(TipoCargaFami tipocargafamiForeignKey) {
		this.tipocargafamiForeignKey = tipocargafamiForeignKey;
	}

	public String sFinalQueryComboTipoGenero="";

	public List<TipoGenero> tipogenerosForeignKey;

	public List<TipoGenero> gettipogenerosForeignKey() {
		return tipogenerosForeignKey;
	}

	public void settipogenerosForeignKey(List<TipoGenero> tipogenerosForeignKey) {
		this.tipogenerosForeignKey = tipogenerosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoGenero tipogeneroForeignKey;

	public TipoGenero gettipogeneroForeignKey() {
		return tipogeneroForeignKey;
	}

	public void settipogeneroForeignKey(TipoGenero tipogeneroForeignKey) {
		this.tipogeneroForeignKey = tipogeneroForeignKey;
	}

	public String sFinalQueryComboEstadoCivil="";

	public List<EstadoCivil> estadocivilsForeignKey;

	public List<EstadoCivil> getestadocivilsForeignKey() {
		return estadocivilsForeignKey;
	}

	public void setestadocivilsForeignKey(List<EstadoCivil> estadocivilsForeignKey) {
		this.estadocivilsForeignKey = estadocivilsForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoCivil estadocivilForeignKey;

	public EstadoCivil getestadocivilForeignKey() {
		return estadocivilForeignKey;
	}

	public void setestadocivilForeignKey(EstadoCivil estadocivilForeignKey) {
		this.estadocivilForeignKey = estadocivilForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoCargaFamiliar;
	public Boolean isPermisoNuevoCargaFamiliar;
	public Boolean isPermisoActualizarCargaFamiliar;
	public Boolean isPermisoActualizarOriginalCargaFamiliar;
	public Boolean isPermisoEliminarCargaFamiliar;
	public Boolean isPermisoGuardarCambiosCargaFamiliar;
	public Boolean isPermisoConsultaCargaFamiliar;
	public Boolean isPermisoBusquedaCargaFamiliar;
	public Boolean isPermisoReporteCargaFamiliar;
	public Boolean isPermisoPaginacionMedioCargaFamiliar;
	public Boolean isPermisoPaginacionAltoCargaFamiliar;
	public Boolean isPermisoPaginacionTodoCargaFamiliar;
	public Boolean isPermisoCopiarCargaFamiliar;
	public Boolean isPermisoVerFormCargaFamiliar;
	public Boolean isPermisoDuplicarCargaFamiliar;
	public Boolean isPermisoOrdenCargaFamiliar;
	
	
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
	
	public CargaFamiliarParameterReturnGeneral cargafamiliarReturnGeneral;
	public CargaFamiliarParameterReturnGeneral cargafamiliarParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCargaFamiliar=false;
	public Boolean esParaAccionDesdeFormularioCargaFamiliar=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CargaFamiliarSessionBeanAdditional cargafamiliarSessionBeanAdditional=null;
	
	public CargaFamiliarSessionBeanAdditional getCargaFamiliarSessionBeanAdditional() {
		return this.cargafamiliarSessionBeanAdditional;
	}
	
	public void setCargaFamiliarSessionBeanAdditional(CargaFamiliarSessionBeanAdditional cargafamiliarSessionBeanAdditional) {
		try {
			this.cargafamiliarSessionBeanAdditional=cargafamiliarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CargaFamiliarBeanSwingJInternalFrameAdditional cargafamiliarBeanSwingJInternalFrameAdditional=null;
	//public class CargaFamiliarBeanSwingJInternalFrame
	
	public CargaFamiliarBeanSwingJInternalFrameAdditional getCargaFamiliarBeanSwingJInternalFrameAdditional() {
		return this.cargafamiliarBeanSwingJInternalFrameAdditional;
	}
	
	public void setCargaFamiliarBeanSwingJInternalFrameAdditional(CargaFamiliarBeanSwingJInternalFrameAdditional cargafamiliarBeanSwingJInternalFrameAdditional) {
		try {
			this.cargafamiliarBeanSwingJInternalFrameAdditional=cargafamiliarBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CargaFamiliarLogic cargafamiliarLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CargaFamiliar cargafamiliarBean;
	public CargaFamiliarConstantesFunciones cargafamiliarConstantesFunciones;
	//public CargaFamiliarParameterReturnGeneral cargafamiliarReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public TipoCargaFamiLogic tipocargafamiLogic;
	public TipoGeneroLogic tipogeneroLogic;
	public EstadoCivilLogic estadocivilLogic;
	
	//PARAMETROS
	
	
	//public List<CargaFamiliar> cargafamiliars;	
	//public List<CargaFamiliar> cargafamiliarsEliminados;
	//public List<CargaFamiliar> cargafamiliarsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCargaFamiliar=false;
	public Boolean isVisibilidadCeldaDuplicarCargaFamiliar=true;
	public Boolean isVisibilidadCeldaCopiarCargaFamiliar=true;
	public Boolean isVisibilidadCeldaVerFormCargaFamiliar=true;
	public Boolean isVisibilidadCeldaOrdenCargaFamiliar=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;
	public Boolean isVisibilidadCeldaModificarCargaFamiliar=false;
	public Boolean isVisibilidadCeldaActualizarCargaFamiliar=false;
	public Boolean isVisibilidadCeldaEliminarCargaFamiliar=false;
	public Boolean isVisibilidadCeldaCancelarCargaFamiliar=false;
	public Boolean isVisibilidadCeldaGuardarCargaFamiliar=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCargaFamiliar=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoCivil=false;
	public Boolean isVisibilidadFK_IdTipoCargaFami=false;
	public Boolean isVisibilidadFK_IdTipoGenero=false;
	
	public Long getiIdNuevoCargaFamiliar() {
		return this.iIdNuevoCargaFamiliar;
	}

	public void setiIdNuevoCargaFamiliar(Long iIdNuevoCargaFamiliar) {
		this.iIdNuevoCargaFamiliar = iIdNuevoCargaFamiliar;
	}
	
	public Long getidCargaFamiliarActual() {
		return this.idCargaFamiliarActual;
	}

	public void setidCargaFamiliarActual(Long idCargaFamiliarActual) {
		this.idCargaFamiliarActual = idCargaFamiliarActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CargaFamiliar getcargafamiliar() {
		return this.cargafamiliar;
	}

	public void setcargafamiliar(CargaFamiliar cargafamiliar) {
		this.cargafamiliar = cargafamiliar;
	}
	
	public CargaFamiliar getcargafamiliarAux() {
		return this.cargafamiliarAux;
	}

	public void setcargafamiliarAux(CargaFamiliar cargafamiliarAux) {
		this.cargafamiliarAux = cargafamiliarAux;
	}				
	
	public CargaFamiliar getcargafamiliarAnterior() {
		return this.cargafamiliarAnterior;
	}

	public void setcargafamiliarAnterior(CargaFamiliar cargafamiliarAnterior) {
		this.cargafamiliarAnterior = cargafamiliarAnterior;
	}	
	
	public CargaFamiliar getcargafamiliarTotales() {
		return this.cargafamiliarTotales;
	}

	public void setcargafamiliarTotales(CargaFamiliar cargafamiliarTotales) {
		this.cargafamiliarTotales = cargafamiliarTotales;
	}	
	
	public CargaFamiliar getcargafamiliarBean() {
		return this.cargafamiliarBean;
	}

	public void setcargafamiliarBean(CargaFamiliar cargafamiliarBean) {
		this.cargafamiliarBean = cargafamiliarBean;
	}	
	
	public CargaFamiliarParameterReturnGeneral getcargafamiliarReturnGeneral() {
		return this.cargafamiliarReturnGeneral;
	}

	public void setcargafamiliarReturnGeneral(CargaFamiliarParameterReturnGeneral cargafamiliarReturnGeneral) {
		this.cargafamiliarReturnGeneral = cargafamiliarReturnGeneral;
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

	public Long id_estado_civilFK_IdEstadoCivil=-1L;

	public Long getid_estado_civilFK_IdEstadoCivil() {
		return this.id_estado_civilFK_IdEstadoCivil;
	}

	public void setid_estado_civilFK_IdEstadoCivil(Long id_estado_civilFK_IdEstadoCivil) {
		this.id_estado_civilFK_IdEstadoCivil = id_estado_civilFK_IdEstadoCivil;
	}

	public Long id_tipo_carga_famiFK_IdTipoCargaFami=-1L;

	public Long getid_tipo_carga_famiFK_IdTipoCargaFami() {
		return this.id_tipo_carga_famiFK_IdTipoCargaFami;
	}

	public void setid_tipo_carga_famiFK_IdTipoCargaFami(Long id_tipo_carga_famiFK_IdTipoCargaFami) {
		this.id_tipo_carga_famiFK_IdTipoCargaFami = id_tipo_carga_famiFK_IdTipoCargaFami;
	}

	public Long id_tipo_generoFK_IdTipoGenero=-1L;

	public Long getid_tipo_generoFK_IdTipoGenero() {
		return this.id_tipo_generoFK_IdTipoGenero;
	}

	public void setid_tipo_generoFK_IdTipoGenero(Long id_tipo_generoFK_IdTipoGenero) {
		this.id_tipo_generoFK_IdTipoGenero = id_tipo_generoFK_IdTipoGenero;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CargaFamiliarLogic getCargaFamiliarLogic()	{		
		return cargafamiliarLogic;
	}

	public void setCargaFamiliarLogic(CargaFamiliarLogic cargafamiliarLogic) {
		this.cargafamiliarLogic = cargafamiliarLogic;
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
	
	public Boolean getIsEsNuevoCargaFamiliar() {
		return isEsNuevoCargaFamiliar;
	}

	public void setIsEsNuevoCargaFamiliar(Boolean isEsNuevoCargaFamiliar) {
		this.isEsNuevoCargaFamiliar = isEsNuevoCargaFamiliar;
	}

	public Boolean getEsParaAccionDesdeFormularioCargaFamiliar() {
		return esParaAccionDesdeFormularioCargaFamiliar;
	}
	
	public void setEsParaAccionDesdeFormularioCargaFamiliar(Boolean esParaAccionDesdeFormularioCargaFamiliar) {
		this.esParaAccionDesdeFormularioCargaFamiliar = esParaAccionDesdeFormularioCargaFamiliar;
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

			if(this.cargafamiliarSessionBean==null) {
				this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cargafamiliarSessionBean.getlidEmpresaActual());
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

			if(this.cargafamiliarSessionBean==null) {
				this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(cargafamiliarSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoCargaFamisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocargafamisForeignKey=new ArrayList<TipoCargaFami>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCargaFamiLogic tipocargafamiLogic=new TipoCargaFamiLogic();

			//tipocargafamiLogic.getTipoCargaFamiDataAccess().setIsForForeingKeyData(true);

			if(this.cargafamiliarSessionBean==null) {
				this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionTipoCargaFami()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocargafamiLogic.getTipoCargaFamiDataAccess().setIsForForeingKeyData(true);

					tipocargafamiLogic.getTodosTipoCargaFamisWithConnection(sFinalQuery,new Pagination());

					this.tipocargafamisForeignKey=tipocargafamiLogic.getTipoCargaFamis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCargaFami(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargafamiLogic.getEntityWithConnection(cargafamiliarSessionBean.getlidTipoCargaFamiActual());
					this.tipocargafamisForeignKey.add(tipocargafamiLogic.getTipoCargaFami());
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

	public void cargarCombosTipoGenerosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipogenerosForeignKey=new ArrayList<TipoGenero>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoGeneroLogic tipogeneroLogic=new TipoGeneroLogic();

			//tipogeneroLogic.getTipoGeneroDataAccess().setIsForForeingKeyData(true);

			if(this.cargafamiliarSessionBean==null) {
				this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionTipoGenero()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipogeneroLogic.getTipoGeneroDataAccess().setIsForForeingKeyData(true);

					tipogeneroLogic.getTodosTipoGenerosWithConnection(sFinalQuery,new Pagination());

					this.tipogenerosForeignKey=tipogeneroLogic.getTipoGeneros();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoGenero(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogeneroLogic.getEntityWithConnection(cargafamiliarSessionBean.getlidTipoGeneroActual());
					this.tipogenerosForeignKey.add(tipogeneroLogic.getTipoGenero());
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

	public void cargarCombosEstadoCivilsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadocivilsForeignKey=new ArrayList<EstadoCivil>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoCivilLogic estadocivilLogic=new EstadoCivilLogic();

			//estadocivilLogic.getEstadoCivilDataAccess().setIsForForeingKeyData(true);

			if(this.cargafamiliarSessionBean==null) {
				this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionEstadoCivil()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadocivilLogic.getEstadoCivilDataAccess().setIsForForeingKeyData(true);

					estadocivilLogic.getTodosEstadoCivilsWithConnection(sFinalQuery,new Pagination());

					this.estadocivilsForeignKey=estadocivilLogic.getEstadoCivils();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoCivil(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocivilLogic.getEntityWithConnection(cargafamiliarSessionBean.getlidEstadoCivilActual());
					this.estadocivilsForeignKey.add(estadocivilLogic.getEstadoCivil());
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

					if(this.cargafamiliar!=null) {
						this.cargafamiliar.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCargaFamiliar.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCargaFamiliarGenerico)throws Exception
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
				jComboBoxid_empresaCargaFamiliarGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCargaFamiliarGenerico!=null && jComboBoxid_empresaCargaFamiliarGenerico.getItemCount()>0) {
					jComboBoxid_empresaCargaFamiliarGenerico.setSelectedIndex(0);
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

					if(this.cargafamiliar!=null) {
						this.cargafamiliar.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteCargaFamiliar.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteCargaFamiliar!=null) {
						jComboBoxid_clienteFK_IdClienteCargaFamiliar.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteCargaFamiliar!=null) {
							//jComboBoxid_clienteFK_IdClienteCargaFamiliar.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteCargaFamiliar.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteCargaFamiliar.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteCargaFamiliarGenerico)throws Exception
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
				jComboBoxid_clienteCargaFamiliarGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteCargaFamiliarGenerico!=null && jComboBoxid_clienteCargaFamiliarGenerico.getItemCount()>0) {
					jComboBoxid_clienteCargaFamiliarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCargaFamiForeignKey(Long idTipoCargaFamiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCargaFami  tipocargafamiTemp=null;

			for(TipoCargaFami tipocargafamiAux:tipocargafamisForeignKey) {
				if(tipocargafamiAux.getId()!=null && tipocargafamiAux.getId().equals(idTipoCargaFamiSeleccionado)) {
					tipocargafamiTemp=tipocargafamiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocargafamiTemp!=null) {

					if(this.cargafamiliar!=null) {
						this.cargafamiliar.setTipoCargaFami(tipocargafamiTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.setSelectedItem(tipocargafamiTemp);
					}
				} else {
					//jComboBoxid_tipo_carga_famiCargaFamiliar.setSelectedItem(tipocargafamiTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCargaFami") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocargafamiTemp!=null && jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar!=null) {
						jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setSelectedItem(tipocargafamiTemp);
					} else {
						if(jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar!=null) {
							//jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setSelectedItem(tipocargafamiTemp);
							if(jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.getItemCount()>0) {
								jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setSelectedIndex(0);
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

	public String getActualTipoCargaFamiForeignKeyDescripcion(Long idTipoCargaFamiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCargaFami  tipocargafamiTemp=null;

			for(TipoCargaFami tipocargafamiAux:tipocargafamisForeignKey) {
				if(tipocargafamiAux.getId()!=null && tipocargafamiAux.getId().equals(idTipoCargaFamiSeleccionado)) {
					tipocargafamiTemp=tipocargafamiAux;
					break;
				}
			}


			sDescripcion=TipoCargaFamiConstantesFunciones.getTipoCargaFamiDescripcion(tipocargafamiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCargaFamiForeignKeyGenerico(Long idTipoCargaFamiSeleccionado,JComboBox jComboBoxid_tipo_carga_famiCargaFamiliarGenerico)throws Exception
	{
		try
		{
			TipoCargaFami  tipocargafamiTemp=null;

			for(TipoCargaFami tipocargafamiAux:tipocargafamisForeignKey) {
				if(tipocargafamiAux.getId()!=null && tipocargafamiAux.getId().equals(idTipoCargaFamiSeleccionado)) {
					tipocargafamiTemp=tipocargafamiAux;
					break;
				}
			}

			if(tipocargafamiTemp!=null) {
				jComboBoxid_tipo_carga_famiCargaFamiliarGenerico.setSelectedItem(tipocargafamiTemp);
			} else {
				if(jComboBoxid_tipo_carga_famiCargaFamiliarGenerico!=null && jComboBoxid_tipo_carga_famiCargaFamiliarGenerico.getItemCount()>0) {
					jComboBoxid_tipo_carga_famiCargaFamiliarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoGeneroForeignKey(Long idTipoGeneroSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoGenero  tipogeneroTemp=null;

			for(TipoGenero tipogeneroAux:tipogenerosForeignKey) {
				if(tipogeneroAux.getId()!=null && tipogeneroAux.getId().equals(idTipoGeneroSeleccionado)) {
					tipogeneroTemp=tipogeneroAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipogeneroTemp!=null) {

					if(this.cargafamiliar!=null) {
						this.cargafamiliar.setTipoGenero(tipogeneroTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.setSelectedItem(tipogeneroTemp);
					}
				} else {
					//jComboBoxid_tipo_generoCargaFamiliar.setSelectedItem(tipogeneroTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoGenero") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipogeneroTemp!=null && jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar!=null) {
						jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setSelectedItem(tipogeneroTemp);
					} else {
						if(jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar!=null) {
							//jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setSelectedItem(tipogeneroTemp);
							if(jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.getItemCount()>0) {
								jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setSelectedIndex(0);
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

	public String getActualTipoGeneroForeignKeyDescripcion(Long idTipoGeneroSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoGenero  tipogeneroTemp=null;

			for(TipoGenero tipogeneroAux:tipogenerosForeignKey) {
				if(tipogeneroAux.getId()!=null && tipogeneroAux.getId().equals(idTipoGeneroSeleccionado)) {
					tipogeneroTemp=tipogeneroAux;
					break;
				}
			}


			sDescripcion=TipoGeneroConstantesFunciones.getTipoGeneroDescripcion(tipogeneroTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoGeneroForeignKeyGenerico(Long idTipoGeneroSeleccionado,JComboBox jComboBoxid_tipo_generoCargaFamiliarGenerico)throws Exception
	{
		try
		{
			TipoGenero  tipogeneroTemp=null;

			for(TipoGenero tipogeneroAux:tipogenerosForeignKey) {
				if(tipogeneroAux.getId()!=null && tipogeneroAux.getId().equals(idTipoGeneroSeleccionado)) {
					tipogeneroTemp=tipogeneroAux;
					break;
				}
			}

			if(tipogeneroTemp!=null) {
				jComboBoxid_tipo_generoCargaFamiliarGenerico.setSelectedItem(tipogeneroTemp);
			} else {
				if(jComboBoxid_tipo_generoCargaFamiliarGenerico!=null && jComboBoxid_tipo_generoCargaFamiliarGenerico.getItemCount()>0) {
					jComboBoxid_tipo_generoCargaFamiliarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoCivilForeignKey(Long idEstadoCivilSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoCivil  estadocivilTemp=null;

			for(EstadoCivil estadocivilAux:estadocivilsForeignKey) {
				if(estadocivilAux.getId()!=null && estadocivilAux.getId().equals(idEstadoCivilSeleccionado)) {
					estadocivilTemp=estadocivilAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadocivilTemp!=null) {

					if(this.cargafamiliar!=null) {
						this.cargafamiliar.setEstadoCivil(estadocivilTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.setSelectedItem(estadocivilTemp);
					}
				} else {
					//jComboBoxid_estado_civilCargaFamiliar.setSelectedItem(estadocivilTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoCivil") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadocivilTemp!=null && jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar!=null) {
						jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.setSelectedItem(estadocivilTemp);
					} else {
						if(jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar!=null) {
							//jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.setSelectedItem(estadocivilTemp);
							if(jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.getItemCount()>0) {
								jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.setSelectedIndex(0);
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

	public String getActualEstadoCivilForeignKeyDescripcion(Long idEstadoCivilSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoCivil  estadocivilTemp=null;

			for(EstadoCivil estadocivilAux:estadocivilsForeignKey) {
				if(estadocivilAux.getId()!=null && estadocivilAux.getId().equals(idEstadoCivilSeleccionado)) {
					estadocivilTemp=estadocivilAux;
					break;
				}
			}


			sDescripcion=EstadoCivilConstantesFunciones.getEstadoCivilDescripcion(estadocivilTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoCivilForeignKeyGenerico(Long idEstadoCivilSeleccionado,JComboBox jComboBoxid_estado_civilCargaFamiliarGenerico)throws Exception
	{
		try
		{
			EstadoCivil  estadocivilTemp=null;

			for(EstadoCivil estadocivilAux:estadocivilsForeignKey) {
				if(estadocivilAux.getId()!=null && estadocivilAux.getId().equals(idEstadoCivilSeleccionado)) {
					estadocivilTemp=estadocivilAux;
					break;
				}
			}

			if(estadocivilTemp!=null) {
				jComboBoxid_estado_civilCargaFamiliarGenerico.setSelectedItem(estadocivilTemp);
			} else {
				if(jComboBoxid_estado_civilCargaFamiliarGenerico!=null && jComboBoxid_estado_civilCargaFamiliarGenerico.getItemCount()>0) {
					jComboBoxid_estado_civilCargaFamiliarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CargaFamiliar cargafamiliar,JComboBox jComboBoxid_empresaCargaFamiliarGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCargaFamiliarGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCargaFamiliarGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cargafamiliar.setid_empresa(empresaAux.getId());
				cargafamiliar.setempresa_descripcion(CargaFamiliarConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cargafamiliar.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(CargaFamiliar cargafamiliar,JComboBox jComboBoxid_clienteCargaFamiliarGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteCargaFamiliarGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteCargaFamiliarGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				cargafamiliar.setid_cliente(clienteAux.getId());
				cargafamiliar.setcliente_descripcion(CargaFamiliarConstantesFunciones.getClienteDescripcion(clienteAux));
				cargafamiliar.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCargaFamiForeignKey(CargaFamiliar cargafamiliar,JComboBox jComboBoxid_tipo_carga_famiCargaFamiliarGenerico)throws Exception
	{
		try
		{
			TipoCargaFami  tipocargafamiAux=new TipoCargaFami();

			if(jComboBoxid_tipo_carga_famiCargaFamiliarGenerico==null) {
				tipocargafamiAux=(TipoCargaFami)this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.getSelectedItem();
			} else {
				tipocargafamiAux=(TipoCargaFami)jComboBoxid_tipo_carga_famiCargaFamiliarGenerico.getSelectedItem();
			}

			if(tipocargafamiAux!=null && tipocargafamiAux.getId()!=null) {
				cargafamiliar.setid_tipo_carga_fami(tipocargafamiAux.getId());
				cargafamiliar.settipocargafami_descripcion(CargaFamiliarConstantesFunciones.getTipoCargaFamiDescripcion(tipocargafamiAux));
				cargafamiliar.setTipoCargaFami(tipocargafamiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoGeneroForeignKey(CargaFamiliar cargafamiliar,JComboBox jComboBoxid_tipo_generoCargaFamiliarGenerico)throws Exception
	{
		try
		{
			TipoGenero  tipogeneroAux=new TipoGenero();

			if(jComboBoxid_tipo_generoCargaFamiliarGenerico==null) {
				tipogeneroAux=(TipoGenero)this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.getSelectedItem();
			} else {
				tipogeneroAux=(TipoGenero)jComboBoxid_tipo_generoCargaFamiliarGenerico.getSelectedItem();
			}

			if(tipogeneroAux!=null && tipogeneroAux.getId()!=null) {
				cargafamiliar.setid_tipo_genero(tipogeneroAux.getId());
				cargafamiliar.settipogenero_descripcion(CargaFamiliarConstantesFunciones.getTipoGeneroDescripcion(tipogeneroAux));
				cargafamiliar.setTipoGenero(tipogeneroAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoCivilForeignKey(CargaFamiliar cargafamiliar,JComboBox jComboBoxid_estado_civilCargaFamiliarGenerico)throws Exception
	{
		try
		{
			EstadoCivil  estadocivilAux=new EstadoCivil();

			if(jComboBoxid_estado_civilCargaFamiliarGenerico==null) {
				estadocivilAux=(EstadoCivil)this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.getSelectedItem();
			} else {
				estadocivilAux=(EstadoCivil)jComboBoxid_estado_civilCargaFamiliarGenerico.getSelectedItem();
			}

			if(estadocivilAux!=null && estadocivilAux.getId()!=null) {
				cargafamiliar.setid_estado_civil(estadocivilAux.getId());
				cargafamiliar.setestadocivil_descripcion(CargaFamiliarConstantesFunciones.getEstadoCivilDescripcion(estadocivilAux));
				cargafamiliar.setEstadoCivil(estadocivilAux);			}
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

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
					}

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
					}

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteCargaFamiliar.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteCargaFamiliar.addItem(cliente);
							}
						}

						if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCargaFamisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCargaFami=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.removeAllItems();

							for(TipoCargaFami tipocargafami:this.tipocargafamisForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.addItem(tipocargafami);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
					}

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCargaFami") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.removeAllItems();

							for(TipoCargaFami tipocargafami:this.tipocargafamisForeignKey) {
								this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.addItem(tipocargafami);
							}
						}

						if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoGenerosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoGenero=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.removeAllItems();

							for(TipoGenero tipogenero:this.tipogenerosForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.addItem(tipogenero);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
					}

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoGenero") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.removeAllItems();

							for(TipoGenero tipogenero:this.tipogenerosForeignKey) {
								this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.addItem(tipogenero);
							}
						}

						if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoCivilsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoCivil=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.removeAllItems();

							for(EstadoCivil estadocivil:this.estadocivilsForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.addItem(estadocivil);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { 
					}

					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoCivil") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.removeAllItems();

							for(EstadoCivil estadocivil:this.estadocivilsForeignKey) {
								this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.addItem(estadocivil);
							}
						}

						if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteCargaFamiliar.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteCargaFamiliar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCargaFamiForeignKey(TipoCargaFami tipocargafami,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.setSelectedItem(tipocargafami);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setSelectedItem(tipocargafami);
						} else {
							this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoGeneroForeignKey(TipoGenero tipogenero,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.setSelectedItem(tipogenero);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setSelectedItem(tipogenero);
						} else {
							this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoCivilForeignKey(EstadoCivil estadocivil,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.setSelectedItem(estadocivil);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.setSelectedItem(estadocivil);
						} else {
							this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCargaFamiliar() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CargaFamiliarConstantesFunciones.refrescarForeignKeysDescripcionesCargaFamiliar(this.cargafamiliarLogic.getCargaFamiliars());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CargaFamiliarConstantesFunciones.refrescarForeignKeysDescripcionesCargaFamiliar(this.cargafamiliars);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoCargaFami.class));
		classes.add(new Classe(TipoGenero.class));
		classes.add(new Classe(EstadoCivil.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cargafamiliarLogic.setCargaFamiliars(this.cargafamiliars);
			cargafamiliarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CargaFamiliarParameterReturnGeneral getCargaFamiliarParameterGeneral() {
		return this.cargafamiliarParameterGeneral;
	}
	
	public void setCargaFamiliarParameterGeneral(CargaFamiliarParameterReturnGeneral cargafamiliarParameterGeneral) {
		this.cargafamiliarParameterGeneral = cargafamiliarParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCargaFamiliar() {
		return isPermisoTodoCargaFamiliar;
	}

	public void setIsPermisoTodoCargaFamiliar(Boolean isPermisoTodoCargaFamiliar) {
		this.isPermisoTodoCargaFamiliar = isPermisoTodoCargaFamiliar;
	}

	public Boolean getIsPermisoNuevoCargaFamiliar() {
		return isPermisoNuevoCargaFamiliar;
	}

	public void setIsPermisoNuevoCargaFamiliar(Boolean isPermisoNuevoCargaFamiliar) {
		this.isPermisoNuevoCargaFamiliar = isPermisoNuevoCargaFamiliar;
	}

	public Boolean getIsPermisoActualizarCargaFamiliar() {
		return isPermisoActualizarCargaFamiliar;
	}

	public void setIsPermisoActualizarCargaFamiliar(Boolean isPermisoActualizarCargaFamiliar) {
		this.isPermisoActualizarCargaFamiliar = isPermisoActualizarCargaFamiliar;
	}

	public Boolean getIsPermisoEliminarCargaFamiliar() {
		return isPermisoEliminarCargaFamiliar;
	}

	public void setIsPermisoEliminarCargaFamiliar(Boolean isPermisoEliminarCargaFamiliar) {
		this.isPermisoEliminarCargaFamiliar = isPermisoEliminarCargaFamiliar;
	}

	public Boolean getIsPermisoGuardarCambiosCargaFamiliar() {
		return isPermisoGuardarCambiosCargaFamiliar;
	}

	public void setIsPermisoGuardarCambiosCargaFamiliar(Boolean isPermisoGuardarCambiosCargaFamiliar) {
		this.isPermisoGuardarCambiosCargaFamiliar = isPermisoGuardarCambiosCargaFamiliar;
	}
	
	public Boolean getIsPermisoConsultaCargaFamiliar() {
		return isPermisoConsultaCargaFamiliar;
	}

	public void setIsPermisoConsultaCargaFamiliar(Boolean isPermisoConsultaCargaFamiliar) {
		this.isPermisoConsultaCargaFamiliar = isPermisoConsultaCargaFamiliar;
	}

	public Boolean getIsPermisoBusquedaCargaFamiliar() {
		return isPermisoBusquedaCargaFamiliar;
	}

	public void setIsPermisoBusquedaCargaFamiliar(Boolean isPermisoBusquedaCargaFamiliar) {
		this.isPermisoBusquedaCargaFamiliar = isPermisoBusquedaCargaFamiliar;
	}

	public Boolean getIsPermisoReporteCargaFamiliar() {
		return isPermisoReporteCargaFamiliar;
	}

	public void setIsPermisoReporteCargaFamiliar(Boolean isPermisoReporteCargaFamiliar) {
		this.isPermisoReporteCargaFamiliar = isPermisoReporteCargaFamiliar;
	}
	
	public Boolean getIsPermisoPaginacionMedioCargaFamiliar() {
		return isPermisoPaginacionMedioCargaFamiliar;
	}

	public void setIsPermisoPaginacionMedioCargaFamiliar(Boolean isPermisoPaginacionMedioCargaFamiliar) {
		this.isPermisoPaginacionMedioCargaFamiliar = isPermisoPaginacionMedioCargaFamiliar;
	}
	
	public Boolean getIsPermisoPaginacionTodoCargaFamiliar() {
		return isPermisoPaginacionTodoCargaFamiliar;
	}

	public void setIsPermisoPaginacionTodoCargaFamiliar(Boolean isPermisoPaginacionTodoCargaFamiliar) {
		this.isPermisoPaginacionTodoCargaFamiliar = isPermisoPaginacionTodoCargaFamiliar;
	}
	
	public Boolean getIsPermisoPaginacionAltoCargaFamiliar() {
		return isPermisoPaginacionAltoCargaFamiliar;
	}

	public void setIsPermisoPaginacionAltoCargaFamiliar(Boolean isPermisoPaginacionAltoCargaFamiliar) {
		this.isPermisoPaginacionAltoCargaFamiliar = isPermisoPaginacionAltoCargaFamiliar;
	}
	
	public Boolean getIsPermisoCopiarCargaFamiliar() {
		return isPermisoCopiarCargaFamiliar;
	}

	public void setIsPermisoCopiarCargaFamiliar(Boolean isPermisoCopiarCargaFamiliar) {
		this.isPermisoCopiarCargaFamiliar = isPermisoCopiarCargaFamiliar;
	}
	
	public Boolean getIsPermisoVerFormCargaFamiliar() {
		return isPermisoVerFormCargaFamiliar;
	}

	public void setIsPermisoVerFormCargaFamiliar(Boolean isPermisoVerFormCargaFamiliar) {
		this.isPermisoVerFormCargaFamiliar = isPermisoVerFormCargaFamiliar;
	}
	
	public Boolean getIsPermisoDuplicarCargaFamiliar() {
		return isPermisoDuplicarCargaFamiliar;
	}

	public void setIsPermisoDuplicarCargaFamiliar(Boolean isPermisoDuplicarCargaFamiliar) {
		this.isPermisoDuplicarCargaFamiliar = isPermisoDuplicarCargaFamiliar;
	}
	
	public Boolean getIsPermisoOrdenCargaFamiliar() {
		return isPermisoOrdenCargaFamiliar;
	}

	public void setIsPermisoOrdenCargaFamiliar(Boolean isPermisoOrdenCargaFamiliar) {
		this.isPermisoOrdenCargaFamiliar = isPermisoOrdenCargaFamiliar;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCargaFamiliar() {
		return isVisibilidadCeldaNuevoCargaFamiliar;
	}

	public void setIsVisibilidadCeldaNuevoCargaFamiliar(Boolean isVisibilidadCeldaNuevoCargaFamiliar) {
		this.isVisibilidadCeldaNuevoCargaFamiliar = isVisibilidadCeldaNuevoCargaFamiliar;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCargaFamiliar() {
		return isVisibilidadCeldaDuplicarCargaFamiliar;
	}

	public void setIsVisibilidadCeldaDuplicarCargaFamiliar(Boolean isVisibilidadCeldaDuplicarCargaFamiliar) {
		this.isVisibilidadCeldaDuplicarCargaFamiliar = isVisibilidadCeldaDuplicarCargaFamiliar;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCargaFamiliar() {
		return isVisibilidadCeldaCopiarCargaFamiliar;
	}

	public void setIsVisibilidadCeldaCopiarCargaFamiliar(Boolean isVisibilidadCeldaCopiarCargaFamiliar) {
		this.isVisibilidadCeldaCopiarCargaFamiliar = isVisibilidadCeldaCopiarCargaFamiliar;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCargaFamiliar() {
		return isVisibilidadCeldaVerFormCargaFamiliar;
	}

	public void setIsVisibilidadCeldaVerFormCargaFamiliar(Boolean isVisibilidadCeldaVerFormCargaFamiliar) {
		this.isVisibilidadCeldaVerFormCargaFamiliar = isVisibilidadCeldaVerFormCargaFamiliar;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCargaFamiliar() {
		return isVisibilidadCeldaOrdenCargaFamiliar;
	}

	public void setIsVisibilidadCeldaOrdenCargaFamiliar(Boolean isVisibilidadCeldaOrdenCargaFamiliar) {
		this.isVisibilidadCeldaOrdenCargaFamiliar = isVisibilidadCeldaOrdenCargaFamiliar;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCargaFamiliar() {
		return isVisibilidadCeldaNuevoRelacionesCargaFamiliar;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCargaFamiliar(Boolean isVisibilidadCeldaNuevoRelacionesCargaFamiliar) {
		this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar = isVisibilidadCeldaNuevoRelacionesCargaFamiliar;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCargaFamiliar() {
		return isVisibilidadCeldaModificarCargaFamiliar;
	}

	public void setIsVisibilidadCeldaModificarCargaFamiliar(Boolean isVisibilidadCeldaModificarCargaFamiliar) {
		this.isVisibilidadCeldaModificarCargaFamiliar = isVisibilidadCeldaModificarCargaFamiliar;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCargaFamiliar() {
		return isVisibilidadCeldaActualizarCargaFamiliar;
	}

	public void setIsVisibilidadCeldaActualizarCargaFamiliar(Boolean isVisibilidadCeldaActualizarCargaFamiliar) {
		this.isVisibilidadCeldaActualizarCargaFamiliar = isVisibilidadCeldaActualizarCargaFamiliar;
	}

	public Boolean getIsVisibilidadCeldaEliminarCargaFamiliar() {
		return isVisibilidadCeldaEliminarCargaFamiliar;
	}

	public void setIsVisibilidadCeldaEliminarCargaFamiliar(Boolean isVisibilidadCeldaEliminarCargaFamiliar) {
		this.isVisibilidadCeldaEliminarCargaFamiliar = isVisibilidadCeldaEliminarCargaFamiliar;
	}

	public Boolean getIsVisibilidadCeldaCancelarCargaFamiliar() {
		return isVisibilidadCeldaCancelarCargaFamiliar;
	}

	public void setIsVisibilidadCeldaCancelarCargaFamiliar(Boolean isVisibilidadCeldaCancelarCargaFamiliar) {
		this.isVisibilidadCeldaCancelarCargaFamiliar = isVisibilidadCeldaCancelarCargaFamiliar;
	}

	public Boolean getIsVisibilidadCeldaGuardarCargaFamiliar() {
		return isVisibilidadCeldaGuardarCargaFamiliar;
	}

	public void setIsVisibilidadCeldaGuardarCargaFamiliar(Boolean isVisibilidadCeldaGuardarCargaFamiliar) {
		this.isVisibilidadCeldaGuardarCargaFamiliar = isVisibilidadCeldaGuardarCargaFamiliar;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCargaFamiliar() {
		return isVisibilidadCeldaGuardarCambiosCargaFamiliar;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCargaFamiliar(Boolean isVisibilidadCeldaGuardarCambiosCargaFamiliar) {
		this.isVisibilidadCeldaGuardarCambiosCargaFamiliar = isVisibilidadCeldaGuardarCambiosCargaFamiliar;
	}
		
	public CargaFamiliarSessionBean getcargafamiliarSessionBean() {
		return this.cargafamiliarSessionBean;
	}
	
	public void setcargafamiliarSessionBean(CargaFamiliarSessionBean cargafamiliarSessionBean) {
		this.cargafamiliarSessionBean=cargafamiliarSessionBean;
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

	public Boolean getisVisibilidadFK_IdEstadoCivil() {
		return this.isVisibilidadFK_IdEstadoCivil;
	}

	public void setisVisibilidadFK_IdEstadoCivil(Boolean isVisibilidadFK_IdEstadoCivil) {
		this.isVisibilidadFK_IdEstadoCivil=isVisibilidadFK_IdEstadoCivil;
	}

	public Boolean getisVisibilidadFK_IdTipoCargaFami() {
		return this.isVisibilidadFK_IdTipoCargaFami;
	}

	public void setisVisibilidadFK_IdTipoCargaFami(Boolean isVisibilidadFK_IdTipoCargaFami) {
		this.isVisibilidadFK_IdTipoCargaFami=isVisibilidadFK_IdTipoCargaFami;
	}

	public Boolean getisVisibilidadFK_IdTipoGenero() {
		return this.isVisibilidadFK_IdTipoGenero;
	}

	public void setisVisibilidadFK_IdTipoGenero(Boolean isVisibilidadFK_IdTipoGenero) {
		this.isVisibilidadFK_IdTipoGenero=isVisibilidadFK_IdTipoGenero;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(CargaFamiliar cargafamiliar)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cargafamiliar,null);
				this.setActualParaGuardarClienteForeignKey(cargafamiliar,null);
				this.setActualParaGuardarTipoCargaFamiForeignKey(cargafamiliar,null);
				this.setActualParaGuardarTipoGeneroForeignKey(cargafamiliar,null);
				this.setActualParaGuardarEstadoCivilForeignKey(cargafamiliar,null);
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
	
	public void bugActualizarReferenciaActual(CargaFamiliar cargafamiliar,CargaFamiliar cargafamiliarAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCargaFamiliar(cargafamiliar);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cargafamiliarAux.setId(cargafamiliar.getId());
		cargafamiliarAux.setVersionRow(cargafamiliar.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCargaFamiliar();
		
			int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cargafamiliarValidator.getInvalidValues(this.cargafamiliar);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cargafamiliarLogic.setDatosCliente(datosCliente);
			cargafamiliarLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cargafamiliarAux=new  CargaFamiliar();
				
				cargafamiliarAux.setIsNew(true);
				cargafamiliarAux.setIsChanged(true);
				
				cargafamiliarAux.setCargaFamiliarOriginal(this.cargafamiliar);
				
				cargafamiliarAux.setId(this.cargafamiliar.getId());	
				cargafamiliarAux.setVersionRow(this.cargafamiliar.getVersionRow());	
				cargafamiliarAux.setid_empresa(this.cargafamiliar.getid_empresa());	
				cargafamiliarAux.setid_cliente(this.cargafamiliar.getid_cliente());	
				cargafamiliarAux.setid_tipo_carga_fami(this.cargafamiliar.getid_tipo_carga_fami());	
				cargafamiliarAux.setid_tipo_genero(this.cargafamiliar.getid_tipo_genero());	
				cargafamiliarAux.setid_estado_civil(this.cargafamiliar.getid_estado_civil());	
				cargafamiliarAux.setcedula(this.cargafamiliar.getcedula());	
				cargafamiliarAux.setapellido(this.cargafamiliar.getapellido());	
				cargafamiliarAux.setnombre(this.cargafamiliar.getnombre());	
				cargafamiliarAux.setdireccion(this.cargafamiliar.getdireccion());	
				cargafamiliarAux.setfecha_nacimiento(this.cargafamiliar.getfecha_nacimiento());	
				cargafamiliarAux.setvalor_cupo(this.cargafamiliar.getvalor_cupo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargafamiliarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cargafamiliarAux,cargafamiliarLogic.getCargaFamiliars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargafamiliarAux,cargafamiliars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargafamiliarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarLogic.saveCargaFamiliars();//WithConnection
						//cargafamiliarLogic.getSetVersionRowCargaFamiliars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargafamiliar,cargafamiliarAux);
					
					this.refrescarForeignKeysDescripcionesCargaFamiliar();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargafamiliarLogic.saveCargaFamiliarRelaciones(cargafamiliarAux);//WithConnection
								//cargafamiliarLogic.getSetVersionRowCargaFamiliars();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargafamiliar,cargafamiliarAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargafamiliarSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargafamiliarAux,cargafamiliarLogic.getCargaFamiliars());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargafamiliarAux,cargafamiliars);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargafamiliar,cargafamiliarAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cargafamiliarAux=new  CargaFamiliar();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado() 
					|| (this.cargafamiliarSessionBean.getEsGuardarRelacionado() && this.cargafamiliar.getId()>=0)) {
						
					cargafamiliarAux.setIsNew(false);
				}
				
				cargafamiliarAux.setIsDeleted(false);
			
				cargafamiliarAux.setId(this.cargafamiliar.getId());	
				cargafamiliarAux.setVersionRow(this.cargafamiliar.getVersionRow());	
				cargafamiliarAux.setid_empresa(this.cargafamiliar.getid_empresa());	
				cargafamiliarAux.setid_cliente(this.cargafamiliar.getid_cliente());	
				cargafamiliarAux.setid_tipo_carga_fami(this.cargafamiliar.getid_tipo_carga_fami());	
				cargafamiliarAux.setid_tipo_genero(this.cargafamiliar.getid_tipo_genero());	
				cargafamiliarAux.setid_estado_civil(this.cargafamiliar.getid_estado_civil());	
				cargafamiliarAux.setcedula(this.cargafamiliar.getcedula());	
				cargafamiliarAux.setapellido(this.cargafamiliar.getapellido());	
				cargafamiliarAux.setnombre(this.cargafamiliar.getnombre());	
				cargafamiliarAux.setdireccion(this.cargafamiliar.getdireccion());	
				cargafamiliarAux.setfecha_nacimiento(this.cargafamiliar.getfecha_nacimiento());	
				cargafamiliarAux.setvalor_cupo(this.cargafamiliar.getvalor_cupo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargafamiliarAux,cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargafamiliarAux,cargafamiliars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargafamiliarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarLogic.saveCargaFamiliars();//WithConnection
						//cargafamiliarLogic.getSetVersionRowCargaFamiliars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargafamiliar,cargafamiliarAux);
					
					this.refrescarForeignKeysDescripcionesCargaFamiliar();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargafamiliarLogic.saveCargaFamiliarRelaciones(cargafamiliarAux);//WithConnection
								//cargafamiliarLogic.getSetVersionRowCargaFamiliars();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargafamiliar,cargafamiliarAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargafamiliarSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargafamiliarAux,cargafamiliarLogic.getCargaFamiliars());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargafamiliarAux,cargafamiliars);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargafamiliar,cargafamiliarAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cargafamiliarAux=new  CargaFamiliar();
				
				cargafamiliarAux.setIsNew(false);
				cargafamiliarAux.setIsChanged(false);
				
				cargafamiliarAux.setIsDeleted(true);
				
				cargafamiliarAux.setId(this.cargafamiliar.getId());	
				cargafamiliarAux.setVersionRow(this.cargafamiliar.getVersionRow());	
				cargafamiliarAux.setid_empresa(this.cargafamiliar.getid_empresa());	
				cargafamiliarAux.setid_cliente(this.cargafamiliar.getid_cliente());	
				cargafamiliarAux.setid_tipo_carga_fami(this.cargafamiliar.getid_tipo_carga_fami());	
				cargafamiliarAux.setid_tipo_genero(this.cargafamiliar.getid_tipo_genero());	
				cargafamiliarAux.setid_estado_civil(this.cargafamiliar.getid_estado_civil());	
				cargafamiliarAux.setcedula(this.cargafamiliar.getcedula());	
				cargafamiliarAux.setapellido(this.cargafamiliar.getapellido());	
				cargafamiliarAux.setnombre(this.cargafamiliar.getnombre());	
				cargafamiliarAux.setdireccion(this.cargafamiliar.getdireccion());	
				cargafamiliarAux.setfecha_nacimiento(this.cargafamiliar.getfecha_nacimiento());	
				cargafamiliarAux.setvalor_cupo(this.cargafamiliar.getvalor_cupo());	
				
				if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cargafamiliarAux.getId()>=0) {	
						this.cargafamiliarsEliminados.add(cargafamiliarAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cargafamiliarAux,cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargafamiliarAux,cargafamiliars);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargafamiliarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarLogic.saveCargaFamiliars();//WithConnection
						//cargafamiliarLogic.getSetVersionRowCargaFamiliars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargafamiliarLogic.saveCargaFamiliarRelaciones(cargafamiliarAux);//WithConnection
								//cargafamiliarLogic.getSetVersionRowCargaFamiliars();//WithConnection
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
							if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cargafamiliarSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cargafamiliarAux,cargafamiliarLogic.getCargaFamiliars());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cargafamiliarAux,cargafamiliars);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getCargaFamiliars().addAll(this.cargafamiliarsEliminados);
					
					cargafamiliarLogic.saveCargaFamiliars();//WithConnection
					//cargafamiliarLogic.getSetVersionRowCargaFamiliars();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCargaFamiliar();
				
				this.cargafamiliarsEliminados= new ArrayList<CargaFamiliar>();		
			}
			
			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Carga Familiar GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cargafamiliar=cargafamiliarAux;
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
      		//this.finishProcessCargaFamiliar();
      	}
		
	}	
	
	public void actualizarRelaciones(CargaFamiliar cargafamiliarLocal) throws Exception {
		
		if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CargaFamiliar cargafamiliarLocal) throws Exception {	
		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cargafamiliarLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				cargafamiliarLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCargaFamiDetalleFormJInternalFrame.class)) {
				TipoCargaFamiBeanSwingJInternalFrame tipocargafamiBeanSwingJInternalFrameLocal=(TipoCargaFamiBeanSwingJInternalFrame) ((TipoCargaFamiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocargafamiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCargaFami(tipocargafamiBeanSwingJInternalFrameLocal.gettipocargafami(),true);
				tipocargafamiBeanSwingJInternalFrameLocal.actualizarLista(tipocargafamiBeanSwingJInternalFrameLocal.tipocargafami,this.tipocargafamisForeignKey);

				tipocargafamiBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocargafamiBeanSwingJInternalFrameLocal.tipocargafami);

				cargafamiliarLocal.setTipoCargaFami(tipocargafamiBeanSwingJInternalFrameLocal.tipocargafami);

				this.addItemDefectoCombosForeignKeyTipoCargaFami();
				this.cargarCombosFrameTipoCargaFamisForeignKey("Formulario");
				this.setActualTipoCargaFamiForeignKey(tipocargafamiBeanSwingJInternalFrameLocal.tipocargafami.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoGeneroDetalleFormJInternalFrame.class)) {
				TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrameLocal=(TipoGeneroBeanSwingJInternalFrame) ((TipoGeneroDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipogeneroBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoGenero(tipogeneroBeanSwingJInternalFrameLocal.gettipogenero(),true);
				tipogeneroBeanSwingJInternalFrameLocal.actualizarLista(tipogeneroBeanSwingJInternalFrameLocal.tipogenero,this.tipogenerosForeignKey);

				tipogeneroBeanSwingJInternalFrameLocal.actualizarRelaciones(tipogeneroBeanSwingJInternalFrameLocal.tipogenero);

				cargafamiliarLocal.setTipoGenero(tipogeneroBeanSwingJInternalFrameLocal.tipogenero);

				this.addItemDefectoCombosForeignKeyTipoGenero();
				this.cargarCombosFrameTipoGenerosForeignKey("Formulario");
				this.setActualTipoGeneroForeignKey(tipogeneroBeanSwingJInternalFrameLocal.tipogenero.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoCivilDetalleFormJInternalFrame.class)) {
				EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrameLocal=(EstadoCivilBeanSwingJInternalFrame) ((EstadoCivilDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadocivilBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoCivil(estadocivilBeanSwingJInternalFrameLocal.getestadocivil(),true);
				estadocivilBeanSwingJInternalFrameLocal.actualizarLista(estadocivilBeanSwingJInternalFrameLocal.estadocivil,this.estadocivilsForeignKey);

				estadocivilBeanSwingJInternalFrameLocal.actualizarRelaciones(estadocivilBeanSwingJInternalFrameLocal.estadocivil);

				cargafamiliarLocal.setEstadoCivil(estadocivilBeanSwingJInternalFrameLocal.estadocivil);

				this.addItemDefectoCombosForeignKeyEstadoCivil();
				this.cargarCombosFrameEstadoCivilsForeignKey("Formulario");
				this.setActualEstadoCivilForeignKey(estadocivilBeanSwingJInternalFrameLocal.estadocivil.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCargaFamiliarActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cargafamiliarValidator.getInvalidValues(this.cargafamiliar);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CargaFamiliar cargafamiliar,List<CargaFamiliar> cargafamiliars) throws Exception {
		try	{		
			CargaFamiliarConstantesFunciones.actualizarLista(cargafamiliar,cargafamiliars,this.cargafamiliarSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CargaFamiliar cargafamiliar,List<CargaFamiliar> cargafamiliars) throws Exception {
		try	{			
			CargaFamiliarConstantesFunciones.actualizarSelectedLista(cargafamiliar,cargafamiliars);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CargaFamiliar> cargafamiliarsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cargafamiliarsLocal=this.cargafamiliarLogic.getCargaFamiliars();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cargafamiliarsLocal=this.cargafamiliars;
			}
			//ARCHITECTURE
		
			for(CargaFamiliar cargafamiliarLocal:cargafamiliarsLocal) {
				if(this.permiteMantenimiento(cargafamiliarLocal) && cargafamiliarLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CargaFamiliarConstantesFunciones.getCargaFamiliarLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_empresaCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_clienteCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.IDTIPOCARGAFAMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_tipo_carga_famiCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.IDTIPOGENERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_tipo_generoCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.IDESTADOCIVIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_estado_civilCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.CEDULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelcedulaCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelapellidoCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelnombreCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabeldireccionCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.FECHANACIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelfecha_nacimientoCargaFamiliar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliarConstantesFunciones.VALORCUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelvalor_cupoCargaFamiliar,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_empresaCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_clienteCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_tipo_carga_famiCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_tipo_generoCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelid_estado_civilCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelcedulaCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelapellidoCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelnombreCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabeldireccionCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelfecha_nacimientoCargaFamiliar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar.jLabelvalor_cupoCargaFamiliar,"");
		
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
		this.iIdNuevoCargaFamiliar--;	
		
		
		this.cargafamiliarAux=new CargaFamiliar();
		
		this.cargafamiliarAux.setId(this.iIdNuevoCargaFamiliar);
		this.cargafamiliarAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargafamiliarLogic.getCargaFamiliars().add(this.cargafamiliarAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cargafamiliars.add(this.cargafamiliarAux);
		}
		//ARCHITECTURE
		
		this.cargafamiliar=this.cargafamiliarAux;
		
		if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCargaFamiliar(this.cargafamiliar);
			this.setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar(this.cargafamiliar);
		}
				
		//this.setDefaultControlesCargaFamiliar();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCargaFamiliar();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCargaFamiliar();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargaFamiliar();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargaFamiliar(this.cargafamiliarBean,this.cargafamiliar,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CargaFamiliarConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {
			classes=CargaFamiliarConstantesFunciones.getClassesRelationshipsOfCargaFamiliar(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cargafamiliarReturnGeneral=cargafamiliarLogic.procesarEventosCargaFamiliarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargafamiliarLogic.getCargaFamiliars(),this.cargafamiliar,this.cargafamiliarParameterGeneral,this.isEsNuevoCargaFamiliar,classes);//this.cargafamiliarLogic.getCargaFamiliar()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCargaFamiliar(this.cargafamiliarReturnGeneral,this.cargafamiliarBean,false);
		
		if(this.cargafamiliarReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar(this.cargafamiliarReturnGeneral.getCargaFamiliar());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCargaFamiliar(this.cargafamiliarReturnGeneral.getCargaFamiliar());
		}
		
		if(this.cargafamiliarReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCargaFamiliar(this.cargafamiliarReturnGeneral.getCargaFamiliar(),classes);//this.cargafamiliarBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCargaFamiliar();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCargaFamiliar();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.RecargarFormCargaFamiliar(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCargaFamiliar(false);
						
			if(cargafamiliarSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargaFamiliar();
			}
			
			this.actualizarVisualTableDatosCargaFamiliar();
			
			this.jTableDatosCargaFamiliar.setRowSelectionInterval(this.getIndiceNuevoCargaFamiliar(), this.getIndiceNuevoCargaFamiliar());
			
			this.seleccionarFilaTablaCargaFamiliarActual();
						
			this.actualizarEstadoCeldasBotonesCargaFamiliar("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCargaFamiliar(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldcedulaCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarcedulaCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jTextAreaapellidoCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarapellidoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jTextAreanombreCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarnombreCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jTextAreadireccionCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activardireccionCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jDateChooserfecha_nacimientoCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarfecha_nacimientoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldvalor_cupoCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarvalor_cupoCargaFamiliar);	
		//
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarid_empresaCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarid_clienteCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarid_tipo_carga_famiCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarid_tipo_generoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.setEnabled(isHabilitar && this.cargafamiliarConstantesFunciones.activarid_estado_civilCargaFamiliar);
	};
	
	public void setDefaultControlesCargaFamiliar() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCargaFamiliar(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cargafamiliarSessionBean.setConGuardarRelaciones(true);			
			this.cargafamiliarSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCargaFamiliar.jTabbedPaneRelacionesCargaFamiliar.setVisible(true);
			
					
		} else {
			//this.cargafamiliarSessionBean.setConGuardarRelaciones(false);			
			this.cargafamiliarSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCargaFamiliar.jTabbedPaneRelacionesCargaFamiliar.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCargaFamiliar() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar cargafamiliarAux:this.cargafamiliarLogic.getCargaFamiliars()) {
				if(cargafamiliarAux.getId().equals(this.iIdNuevoCargaFamiliar)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar cargafamiliarAux:this.cargafamiliars) {
				if(cargafamiliarAux.getId().equals(this.iIdNuevoCargaFamiliar)) {
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
	
	public int getIndiceActualCargaFamiliar(CargaFamiliar cargafamiliar,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar cargafamiliarAux:this.cargafamiliarLogic.getCargaFamiliars()) {
				if(cargafamiliarAux.getId().equals(cargafamiliar.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar cargafamiliarAux:this.cargafamiliars) {
				if(cargafamiliarAux.getId().equals(cargafamiliar.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCargaFamiliar(CargaFamiliar cargafamiliarOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar cargafamiliarAux:this.cargafamiliarLogic.getCargaFamiliars()) {
				if(cargafamiliarAux.getCargaFamiliarOriginal().getId().equals(cargafamiliarOriginal.getId())) {
					existe=true;
					cargafamiliarOriginal.setId(cargafamiliarAux.getId());
					cargafamiliarOriginal.setVersionRow(cargafamiliarAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar cargafamiliarAux:this.cargafamiliars) {
				if(cargafamiliarAux.getCargaFamiliarOriginal().getId().equals(cargafamiliarOriginal.getId())) {
					existe=true;
					cargafamiliarOriginal.setId(cargafamiliarAux.getId());
					cargafamiliarOriginal.setVersionRow(cargafamiliarAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCargaFamiliar(Boolean esParaCancelar) throws Exception {
		cargafamiliarsAux=new ArrayList<CargaFamiliar>();
		cargafamiliarAux=new CargaFamiliar();
		
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CargaFamiliar cargafamiliarAux:this.cargafamiliarLogic.getCargaFamiliars()) {
					if(cargafamiliarAux.getId()<0) {
						cargafamiliarsAux.add(cargafamiliarAux);
					}		
				}
				this.iIdNuevoCargaFamiliar=0L;
				this.cargafamiliarLogic.getCargaFamiliars().removeAll(cargafamiliarsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargaFamiliar cargafamiliarAux:this.cargafamiliars) {
					if(cargafamiliarAux.getId()<0) {
						cargafamiliarsAux.add(cargafamiliarAux);
					}		
				}
				this.iIdNuevoCargaFamiliar=0L;
				this.cargafamiliars.removeAll(cargafamiliarsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCargaFamiliar 
					&& this.cargafamiliarLogic.getCargaFamiliars().size()>0
					) {
					cargafamiliarAux=this.cargafamiliarLogic.getCargaFamiliars().get(this.cargafamiliarLogic.getCargaFamiliars().size() - 1);
				
					if(cargafamiliarAux.getId()<0) {
						this.cargafamiliarLogic.getCargaFamiliars().remove(cargafamiliarAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCargaFamiliar && this.cargafamiliars.size()>0) {
					cargafamiliarAux=this.cargafamiliars.get(this.cargafamiliars.size() - 1);
				
					if(cargafamiliarAux.getId()<0) {
						this.cargafamiliars.remove(cargafamiliarAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCargaFamiliar(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cargafamiliar.getId()<0) {
				this.cargafamiliarLogic.getCargaFamiliars().remove(this.cargafamiliar);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cargafamiliar.getId()<0) {
				this.cargafamiliars.remove(this.cargafamiliar);
			}
		}			
	}
	
	public void setEstadosInicialesCargaFamiliar(List<CargaFamiliar> cargafamiliarsAux) throws Exception {
		CargaFamiliarConstantesFunciones.setEstadosInicialesCargaFamiliar(cargafamiliarsAux);
	}
	
	public void setEstadosInicialesCargaFamiliar(CargaFamiliar cargafamiliarAux) throws Exception {
		CargaFamiliarConstantesFunciones.setEstadosInicialesCargaFamiliar(cargafamiliarAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCargaFamiliarActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCargaFamiliar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCargaFamiliarActual()) {
				if(!this.isEsNuevoCargaFamiliar) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCargaFamiliar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCargaFamiliar=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCargaFamiliarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Carga Familiar ?", "MANTENIMIENTO DE Carga Familiar", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCargaFamiliar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CargaFamiliar cargafamiliar) throws Exception {
		CargaFamiliarConstantesFunciones.seleccionarAsignar(this.cargafamiliar,cargafamiliar);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCargaFamiliar=this.isPermisoActualizarOriginalCargaFamiliar;
			
			
			this.seleccionarAsignar(cargafamiliar);
			
			

			idClienteActual=cargafamiliar.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargaFamiliarConstantesFunciones.quitarEspaciosCargaFamiliar(this.cargafamiliar,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCargaFamiliar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cargafamiliarSessionBean.setsFuncionBusquedaRapida(this.cargafamiliarSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoCargaFamiliar) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCargaFamiliar(esParaCancelar);				
				this.cancelarNuevoCargaFamiliar(esParaCancelar);								
			}
			
			this.cargafamiliar=new CargaFamiliar();
			
			this.inicializarCargaFamiliar();
			
			this.actualizarEstadoCeldasBotonesCargaFamiliar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCargaFamiliar() throws Exception {
		try {
			CargaFamiliarConstantesFunciones.inicializarCargaFamiliar(this.cargafamiliar);
			
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
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cargafamiliarLogic.getCargaFamiliars().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCargaFamiliars(String sAccionBusqueda,List<CargaFamiliar> cargafamiliarsParaReportes) throws Exception {
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
					sPathReporteFinal="CargaFamiliar"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CargaFamiliarMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CargaFamiliarMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CargaFamiliar"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Carga Familiares");		
		parameters.put("busquedapor", CargaFamiliarConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCargaFamiliar=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CargaFamiliarConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CargaFamiliarConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCargaFamiliar=new JRBeanArrayDataSource(CargaFamiliarJInternalFrame.TraerCargaFamiliarBeans(cargafamiliarsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCargaFamiliar);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CargaFamiliarConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CargaFamiliarConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CargaFamiliarBean.TraerCargaFamiliarBeans(cargafamiliarsParaReportes).toArray()));
							
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
				this.generarExcelReporteCargaFamiliars(sAccionBusqueda,sTipoArchivoReporte,cargafamiliarsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCargaFamiliars(sAccionBusqueda,sTipoArchivoReporte,cargafamiliarsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCargaFamiliarActionPerformed(null);
					//this.generarExcelReporteCargaFamiliars(sAccionBusqueda,sTipoArchivoReporte,cargafamiliarsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCargaFamiliars(sAccionBusqueda,sTipoArchivoReporte,cargafamiliarsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCargaFamiliars(sAccionBusqueda,sTipoArchivoReporte,cargafamiliarsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCargaFamiliars(sAccionBusqueda,sTipoArchivoReporte,cargafamiliarsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCargaFamiliars(String sAccionBusqueda,String sTipoArchivoReporte,List<CargaFamiliar> cargafamiliarsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargaFamiliars");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargaFamiliar("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CargaFamiliar cargafamiliar : cargafamiliarsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CargaFamiliarConstantesFunciones.generarExcelReporteDataCargaFamiliar("NORMAL",row,workbook,cargafamiliar,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCargaFamiliar(String sTipo,Row row,Workbook workbook) {
		
		CargaFamiliarConstantesFunciones.generarExcelReporteHeaderCargaFamiliar(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCargaFamiliars(String sAccionBusqueda,String sTipoArchivoReporte,List<CargaFamiliar> cargafamiliarsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargaFamiliars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CargaFamiliar cargafamiliar : cargafamiliarsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CargaFamiliarConstantesFunciones.getCargaFamiliarDescripcion(cargafamiliar));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.gettipocargafami_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.gettipogenero_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.getestadocivil_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_CEDULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_CEDULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.getcedula());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.getfecha_nacimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliarConstantesFunciones.LABEL_VALORCUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_VALORCUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar.getvalor_cupo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCargaFamiliars(String sAccionBusqueda,String sTipoArchivoReporte,List<CargaFamiliar> cargafamiliarsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CargaFamiliar> cargafamiliarsRespaldo=null;
		
		classes=CargaFamiliarConstantesFunciones.getClassesRelationshipsOfCargaFamiliar(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cargafamiliarLogic.setDatosCliente(this.datosCliente);
		this.cargafamiliarLogic.setDatosDeep(this.datosDeep);
		this.cargafamiliarLogic.setIsConDeep(true);
		
		cargafamiliarsRespaldo=this.cargafamiliarLogic.getCargaFamiliars();
		
		this.cargafamiliarLogic.setCargaFamiliars(cargafamiliarsParaReportes);	
		this.cargafamiliarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cargafamiliarsParaReportes=this.cargafamiliarLogic.getCargaFamiliars();
		this.cargafamiliarLogic.setCargaFamiliars(cargafamiliarsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargaFamiliars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargaFamiliar("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CargaFamiliar cargafamiliar : cargafamiliarsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCargaFamiliar("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CargaFamiliarConstantesFunciones.generarExcelReporteDataCargaFamiliar("NORMAL",row,workbook,cargafamiliar,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CargaFamiliarConstantesFunciones.getCargaFamiliarDescripcion(cargafamiliar));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCargaFamiliar() throws Exception {		
		this.startProcessCargaFamiliar(true);
	}
	
	public void startProcessCargaFamiliar(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCargaFamiliar ,this.jPanelParametrosReportesCargaFamiliar, this.jScrollPanelDatosCargaFamiliar,this.jPanelPaginacionCargaFamiliar, this.jScrollPanelDatosEdicionCargaFamiliar, this.jPanelAccionesCargaFamiliar,this.jPanelAccionesFormularioCargaFamiliar,this.jmenuBarCargaFamiliar,this.jmenuBarDetalleCargaFamiliar,this.jTtoolBarCargaFamiliar,this.jTtoolBarDetalleCargaFamiliar);		
		
		final JTabbedPane jTabbedPaneBusquedasCargaFamiliar=this.jTabbedPaneBusquedasCargaFamiliar; 
		
		final JPanel jPanelParametrosReportesCargaFamiliar=this.jPanelParametrosReportesCargaFamiliar;
		//final JScrollPane jScrollPanelDatosCargaFamiliar=this.jScrollPanelDatosCargaFamiliar;
		final JTable jTableDatosCargaFamiliar=this.jTableDatosCargaFamiliar;		
		final JPanel jPanelPaginacionCargaFamiliar=this.jPanelPaginacionCargaFamiliar;
		//final JScrollPane jScrollPanelDatosEdicionCargaFamiliar=this.jScrollPanelDatosEdicionCargaFamiliar;
		final JPanel jPanelAccionesCargaFamiliar=this.jPanelAccionesCargaFamiliar;
		
		JPanel jPanelCamposAuxiliarCargaFamiliar=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCargaFamiliar=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			jPanelCamposAuxiliarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jPanelCamposCargaFamiliar;
			jPanelAccionesFormularioAuxiliarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jPanelAccionesFormularioCargaFamiliar;
		}
		
		final JPanel jPanelCamposCargaFamiliar=jPanelCamposAuxiliarCargaFamiliar;
		final JPanel jPanelAccionesFormularioCargaFamiliar=jPanelAccionesFormularioAuxiliarCargaFamiliar;
		
		
		final JMenuBar jmenuBarCargaFamiliar=this.jmenuBarCargaFamiliar;
		final JToolBar jTtoolBarCargaFamiliar=this.jTtoolBarCargaFamiliar;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCargaFamiliar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargaFamiliar=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			jmenuBarDetalleAuxiliarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jmenuBarDetalleCargaFamiliar;
			jTtoolBarDetalleAuxiliarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jTtoolBarDetalleCargaFamiliar;
		}
		
		final JMenuBar jmenuBarDetalleCargaFamiliar=jmenuBarDetalleAuxiliarCargaFamiliar;
		final JToolBar jTtoolBarDetalleCargaFamiliar=jTtoolBarDetalleAuxiliarCargaFamiliar;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargaFamiliar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargaFamiliar;
			processRunnable.jTableDatos=jTableDatosCargaFamiliar;
			processRunnable.jPanelCampos=jPanelCamposCargaFamiliar;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargaFamiliar;
			processRunnable.jPanelAcciones=jPanelAccionesCargaFamiliar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargaFamiliar;
			
			
			processRunnable.jmenuBar=jmenuBarCargaFamiliar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargaFamiliar;
			processRunnable.jTtoolBar=jTtoolBarCargaFamiliar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargaFamiliar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargaFamiliar ,jPanelParametrosReportesCargaFamiliar,jTableDatosCargaFamiliar, /*jScrollPanelDatosCargaFamiliar,*/jPanelCamposCargaFamiliar,jPanelPaginacionCargaFamiliar, /*jScrollPanelDatosEdicionCargaFamiliar,*/ jPanelAccionesCargaFamiliar,jPanelAccionesFormularioCargaFamiliar,jmenuBarCargaFamiliar,jmenuBarDetalleCargaFamiliar,jTtoolBarCargaFamiliar,jTtoolBarDetalleCargaFamiliar);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargaFamiliar ,jPanelParametrosReportesCargaFamiliar, jScrollPanelDatosCargaFamiliar,jPanelPaginacionCargaFamiliar, jScrollPanelDatosEdicionCargaFamiliar, jPanelAccionesCargaFamiliar,jPanelAccionesFormularioCargaFamiliar,jmenuBarCargaFamiliar,jmenuBarDetalleCargaFamiliar,jTtoolBarCargaFamiliar,jTtoolBarDetalleCargaFamiliar);
						
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
	
	public void finishProcessCargaFamiliar() {// throws Exception 
		this.finishProcessCargaFamiliar(true);
	}
	
	public void finishProcessCargaFamiliar(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCargaFamiliar ,this.jPanelParametrosReportesCargaFamiliar, this.jScrollPanelDatosCargaFamiliar,this.jPanelPaginacionCargaFamiliar, this.jScrollPanelDatosEdicionCargaFamiliar, this.jPanelAccionesCargaFamiliar,this.jPanelAccionesFormularioCargaFamiliar,this.jmenuBarCargaFamiliar,this.jmenuBarDetalleCargaFamiliar,this.jTtoolBarCargaFamiliar,this.jTtoolBarDetalleCargaFamiliar);		
		
		final JTabbedPane jTabbedPaneBusquedasCargaFamiliar=this.jTabbedPaneBusquedasCargaFamiliar; 
		
		final JPanel jPanelParametrosReportesCargaFamiliar=this.jPanelParametrosReportesCargaFamiliar;
		//final JScrollPane jScrollPanelDatosCargaFamiliar=this.jScrollPanelDatosCargaFamiliar;
		final JTable jTableDatosCargaFamiliar=this.jTableDatosCargaFamiliar;		
		final JPanel jPanelPaginacionCargaFamiliar=this.jPanelPaginacionCargaFamiliar;
		//final JScrollPane jScrollPanelDatosEdicionCargaFamiliar=this.jScrollPanelDatosEdicionCargaFamiliar;
		final JPanel jPanelAccionesCargaFamiliar=this.jPanelAccionesCargaFamiliar;
		
		JPanel jPanelCamposAuxiliarCargaFamiliar=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCargaFamiliar=new JPanel();
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			jPanelCamposAuxiliarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jPanelCamposCargaFamiliar;
			jPanelAccionesFormularioAuxiliarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jPanelAccionesFormularioCargaFamiliar;
		}
		
		final JPanel jPanelCamposCargaFamiliar=jPanelCamposAuxiliarCargaFamiliar;
		final JPanel jPanelAccionesFormularioCargaFamiliar=jPanelAccionesFormularioAuxiliarCargaFamiliar;
		
		
		final JMenuBar jmenuBarCargaFamiliar=this.jmenuBarCargaFamiliar;		
		final JToolBar jTtoolBarCargaFamiliar=this.jTtoolBarCargaFamiliar;
				
		JMenuBar jmenuBarDetalleAuxiliarCargaFamiliar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargaFamiliar=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			jmenuBarDetalleAuxiliarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jmenuBarDetalleCargaFamiliar;
			jTtoolBarDetalleAuxiliarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jTtoolBarDetalleCargaFamiliar;		
		}
		
		final JMenuBar jmenuBarDetalleCargaFamiliar=jmenuBarDetalleAuxiliarCargaFamiliar;
		final JToolBar jTtoolBarDetalleCargaFamiliar=jTtoolBarDetalleAuxiliarCargaFamiliar;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargaFamiliar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargaFamiliar;
			processRunnable.jTableDatos=jTableDatosCargaFamiliar;
			processRunnable.jPanelCampos=jPanelCamposCargaFamiliar;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargaFamiliar;
			processRunnable.jPanelAcciones=jPanelAccionesCargaFamiliar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargaFamiliar;
			
			
			processRunnable.jmenuBar=jmenuBarCargaFamiliar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargaFamiliar;
			processRunnable.jTtoolBar=jTtoolBarCargaFamiliar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargaFamiliar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCargaFamiliar ,jPanelParametrosReportesCargaFamiliar, jTableDatosCargaFamiliar,/*jScrollPanelDatosCargaFamiliar,*/jPanelCamposCargaFamiliar,jPanelPaginacionCargaFamiliar, /*jScrollPanelDatosEdicionCargaFamiliar,*/ jPanelAccionesCargaFamiliar,jPanelAccionesFormularioCargaFamiliar,jmenuBarCargaFamiliar,jmenuBarDetalleCargaFamiliar,jTtoolBarCargaFamiliar,jTtoolBarDetalleCargaFamiliar));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCargaFamiliar(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCargaFamiliar(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCargaFamiliar(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCargaFamiliar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCargaFamiliar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCargaFamiliar,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCargaFamiliar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCargaFamiliar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCargaFamiliar,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cargafamiliarConstantesFunciones.getsFinalQueryCargaFamiliar();
		String  finalQueryPaginacionTodos=this.cargafamiliarConstantesFunciones.getsFinalQueryCargaFamiliar();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CargaFamiliarConstantesFunciones.getArrayColumnasGlobalesNoCargaFamiliar(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CargaFamiliarConstantesFunciones.getArrayColumnasGlobalesCargaFamiliar(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CargaFamiliarConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cargafamiliarsEliminados= new ArrayList<CargaFamiliar>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCargaFamiliar();
		
				///*CargaFamiliarSessionBean*/this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			
			if(this.cargafamiliarSessionBean==null) {
				this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
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
					this.iNumeroPaginacion=CargaFamiliarConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CargaFamiliarConstantesFunciones.getClassesForeignKeysOfCargaFamiliar(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cargafamiliar."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cargafamiliarsAux= new ArrayList<CargaFamiliar>();
			
				
			cargafamiliarLogic.setDatosCliente(this.datosCliente);
			cargafamiliarLogic.setDatosDeep(this.datosDeep);
			cargafamiliarLogic.setIsConDeep(true);
			
			
			cargafamiliarLogic.getCargaFamiliarDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cargafamiliarLogic.getTodosCargaFamiliars(finalQueryGlobal,pagination);
					
					//cargafamiliarLogic.getTodosCargaFamiliarsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cargafamiliarLogic.getCargaFamiliars()==null|| cargafamiliarLogic.getCargaFamiliars().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargafamiliarsAux= new ArrayList<CargaFamiliar>();
							cargafamiliarsAux.addAll(cargafamiliarLogic.getCargaFamiliars());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliarsAux= new ArrayList<CargaFamiliar>();
							cargafamiliarsAux.addAll(cargafamiliars);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargafamiliarLogic.getTodosCargaFamiliars(finalQueryGlobal+"",this.pagination);												
							
							//cargafamiliarLogic.getTodosCargaFamiliarsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCargaFamiliars("Todos",cargafamiliarLogic.getCargaFamiliars() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());					
							cargafamiliarLogic.getCargaFamiliars().addAll(cargafamiliarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliars=new ArrayList<CargaFamiliar>();
							cargafamiliars.addAll(cargafamiliarsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCargaFamiliar=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCargaFamiliar=this.idActual;
				
				} else if(this.idCargaFamiliarActual!=null && this.idCargaFamiliarActual!=0L) {
					idCargaFamiliar=idCargaFamiliarActual;
				}
				
					
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndicePorId(idCargaFamiliar);
				
				this.cargafamiliars=new ArrayList<CargaFamiliar>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cargafamiliarLogic.getEntity(idCargaFamiliar);
					
					//cargafamiliarLogic.getEntityWithConnection(idCargaFamiliar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
					cargafamiliarLogic.getCargaFamiliars().add(cargafamiliarLogic.getCargaFamiliar());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliars=new ArrayList<CargaFamiliar>();
					this.cargafamiliars.add(cargafamiliar);
				}
				
				if(cargafamiliarLogic.getCargaFamiliar()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliarLogic.getCargaFamiliarsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliarLogic.getCargaFamiliars()==null||cargafamiliarLogic.getCargaFamiliars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliars==null|| cargafamiliars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarsAux=new ArrayList<CargaFamiliar>();
						cargafamiliarsAux.addAll(cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliarsAux=new ArrayList<CargaFamiliar>();
							cargafamiliarsAux.addAll(cargafamiliars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliarLogic.getCargaFamiliarsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliars("FK_IdCliente",cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliars("FK_IdCliente",cargafamiliars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
						cargafamiliarLogic.getCargaFamiliars().addAll(cargafamiliarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliars=new ArrayList<CargaFamiliar>();
							cargafamiliars.addAll(cargafamiliarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliarLogic.getCargaFamiliarsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliarLogic.getCargaFamiliars()==null||cargafamiliarLogic.getCargaFamiliars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliars==null|| cargafamiliars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarsAux=new ArrayList<CargaFamiliar>();
						cargafamiliarsAux.addAll(cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliarsAux=new ArrayList<CargaFamiliar>();
							cargafamiliarsAux.addAll(cargafamiliars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliarLogic.getCargaFamiliarsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliars("FK_IdEmpresa",cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliars("FK_IdEmpresa",cargafamiliars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
						cargafamiliarLogic.getCargaFamiliars().addAll(cargafamiliarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliars=new ArrayList<CargaFamiliar>();
							cargafamiliars.addAll(cargafamiliarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoCivil")) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliarLogic.getCargaFamiliarsFK_IdEstadoCivil(finalQueryGlobal,pagination,id_estado_civilFK_IdEstadoCivil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliarLogic.getCargaFamiliars()==null||cargafamiliarLogic.getCargaFamiliars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliars==null|| cargafamiliars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarsAux=new ArrayList<CargaFamiliar>();
						cargafamiliarsAux.addAll(cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliarsAux=new ArrayList<CargaFamiliar>();
							cargafamiliarsAux.addAll(cargafamiliars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliarLogic.getCargaFamiliarsFK_IdEstadoCivil(finalQueryGlobal,pagination,id_estado_civilFK_IdEstadoCivil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliars("FK_IdEstadoCivil",cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliars("FK_IdEstadoCivil",cargafamiliars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
						cargafamiliarLogic.getCargaFamiliars().addAll(cargafamiliarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliars=new ArrayList<CargaFamiliar>();
							cargafamiliars.addAll(cargafamiliarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCargaFami")) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliarLogic.getCargaFamiliarsFK_IdTipoCargaFami(finalQueryGlobal,pagination,id_tipo_carga_famiFK_IdTipoCargaFami);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliarLogic.getCargaFamiliars()==null||cargafamiliarLogic.getCargaFamiliars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliars==null|| cargafamiliars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarsAux=new ArrayList<CargaFamiliar>();
						cargafamiliarsAux.addAll(cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliarsAux=new ArrayList<CargaFamiliar>();
							cargafamiliarsAux.addAll(cargafamiliars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliarLogic.getCargaFamiliarsFK_IdTipoCargaFami(finalQueryGlobal,pagination,id_tipo_carga_famiFK_IdTipoCargaFami);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliars("FK_IdTipoCargaFami",cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliars("FK_IdTipoCargaFami",cargafamiliars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
						cargafamiliarLogic.getCargaFamiliars().addAll(cargafamiliarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliars=new ArrayList<CargaFamiliar>();
							cargafamiliars.addAll(cargafamiliarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoGenero")) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliarLogic.getCargaFamiliarsFK_IdTipoGenero(finalQueryGlobal,pagination,id_tipo_generoFK_IdTipoGenero);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliarLogic.getCargaFamiliars()==null||cargafamiliarLogic.getCargaFamiliars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliars==null|| cargafamiliars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarsAux=new ArrayList<CargaFamiliar>();
						cargafamiliarsAux.addAll(cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliarsAux=new ArrayList<CargaFamiliar>();
							cargafamiliarsAux.addAll(cargafamiliars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliarLogic.getCargaFamiliarsFK_IdTipoGenero(finalQueryGlobal,pagination,id_tipo_generoFK_IdTipoGenero);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliarConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliars("FK_IdTipoGenero",cargafamiliarLogic.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliars("FK_IdTipoGenero",cargafamiliars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
						cargafamiliarLogic.getCargaFamiliars().addAll(cargafamiliarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliars=new ArrayList<CargaFamiliar>();
							cargafamiliars.addAll(cargafamiliarsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCargaFamiliar();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCargaFamiliar();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargafamiliarLogic.getCargaFamiliars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargafamiliars.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargafamiliarLogic.getCargaFamiliars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargafamiliars.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CargaFamiliar cargafamiliar) {
		Boolean permite=true;
		
		if(this.cargafamiliar.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CargaFamiliarConstantesFunciones.getOrderByListaCargaFamiliar();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CargaFamiliarConstantesFunciones.getOrderByListaCargaFamiliar();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar cargafamiliar:cargafamiliarLogic.getCargaFamiliars()) {
				if(cargafamiliar.getsType().equals(Constantes2.S_TOTALES)) {
					cargafamiliarTotales=cargafamiliar;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar cargafamiliar:this.cargafamiliars) {
				if(cargafamiliar.getsType().equals(Constantes2.S_TOTALES)) {
					cargafamiliarTotales=cargafamiliar;
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
			this.cargafamiliarAux=new CargaFamiliar();
			this.cargafamiliarAux.setsType(Constantes2.S_TOTALES);
			this.cargafamiliarAux.setIsNew(false);
			this.cargafamiliarAux.setIsChanged(false);
			this.cargafamiliarAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CargaFamiliarConstantesFunciones.TotalizarValoresFilaCargaFamiliar(this.cargafamiliarLogic.getCargaFamiliars(),this.cargafamiliarAux);
				
				this.cargafamiliarLogic.getCargaFamiliars().add(this.cargafamiliarAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CargaFamiliarConstantesFunciones.TotalizarValoresFilaCargaFamiliar(this.cargafamiliars,this.cargafamiliarAux);
				
				this.cargafamiliars.add(this.cargafamiliarAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cargafamiliarTotales=new CargaFamiliar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargafamiliarLogic.getCargaFamiliars().remove(cargafamiliarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargafamiliars.remove(cargafamiliarTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cargafamiliarTotales=new CargaFamiliar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar cargafamiliar:cargafamiliarLogic.getCargaFamiliars()) {
				if(cargafamiliar.getsType().equals(Constantes2.S_TOTALES)) {
					cargafamiliarTotales=cargafamiliar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargaFamiliarConstantesFunciones.TotalizarValoresFilaCargaFamiliar(this.cargafamiliarLogic.getCargaFamiliars(),cargafamiliarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar cargafamiliar:this.cargafamiliars) {
				if(cargafamiliar.getsType().equals(Constantes2.S_TOTALES)) {
					cargafamiliarTotales=cargafamiliar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargaFamiliarConstantesFunciones.TotalizarValoresFilaCargaFamiliar(this.cargafamiliars,cargafamiliarTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCargaFamiliarsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargaFamiliarsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargaFamiliarsFK_IdEstadoCivil()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoCivil";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargaFamiliarsFK_IdTipoCargaFami()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCargaFami";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargaFamiliarsFK_IdTipoGenero()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoGenero";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCargaFamiliarsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliarLogic.getCargaFamiliarsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargaFamiliarsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliarLogic.getCargaFamiliarsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargaFamiliarsFK_IdEstadoCivil(String sFinalQuery,Long id_estado_civil)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliarLogic.getCargaFamiliarsFK_IdEstadoCivil(sFinalQuery,this.pagination,id_estado_civil);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargaFamiliarsFK_IdTipoCargaFami(String sFinalQuery,Long id_tipo_carga_fami)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliarLogic.getCargaFamiliarsFK_IdTipoCargaFami(sFinalQuery,this.pagination,id_tipo_carga_fami);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargaFamiliarsFK_IdTipoGenero(String sFinalQuery,Long id_tipo_genero)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliarLogic.getCargaFamiliarsFK_IdTipoGenero(sFinalQuery,this.pagination,id_tipo_genero);
				
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
	
	public void inicializarPermisosCargaFamiliar() {
		this.isPermisoTodoCargaFamiliar=false;
		this.isPermisoNuevoCargaFamiliar=false;
		this.isPermisoActualizarCargaFamiliar=false;
		this.isPermisoActualizarOriginalCargaFamiliar=false;
		this.isPermisoEliminarCargaFamiliar=false;
		this.isPermisoGuardarCambiosCargaFamiliar=false;
		this.isPermisoConsultaCargaFamiliar=false;
		this.isPermisoBusquedaCargaFamiliar=false;
		this.isPermisoReporteCargaFamiliar=false;		
		this.isPermisoOrdenCargaFamiliar=false;		
		this.isPermisoPaginacionMedioCargaFamiliar=false;		
		this.isPermisoPaginacionAltoCargaFamiliar=false;
		this.isPermisoPaginacionTodoCargaFamiliar=false;
		this.isPermisoCopiarCargaFamiliar=false;		
		this.isPermisoVerFormCargaFamiliar=false;		
		this.isPermisoDuplicarCargaFamiliar=false;		
		this.isPermisoOrdenCargaFamiliar=false;		
	}
	
	public void setPermisosUsuarioCargaFamiliar(Boolean isPermiso) {
		this.isPermisoTodoCargaFamiliar=isPermiso;
		this.isPermisoNuevoCargaFamiliar=isPermiso;
		this.isPermisoActualizarCargaFamiliar=isPermiso;
		this.isPermisoActualizarOriginalCargaFamiliar=isPermiso;
		this.isPermisoEliminarCargaFamiliar=isPermiso;
		this.isPermisoGuardarCambiosCargaFamiliar=isPermiso;
		this.isPermisoConsultaCargaFamiliar=isPermiso;
		this.isPermisoBusquedaCargaFamiliar=isPermiso;
		this.isPermisoReporteCargaFamiliar=isPermiso;
		this.isPermisoOrdenCargaFamiliar=isPermiso;		
		this.isPermisoPaginacionMedioCargaFamiliar=isPermiso;		
		this.isPermisoPaginacionAltoCargaFamiliar=isPermiso;		
		this.isPermisoPaginacionTodoCargaFamiliar=isPermiso;		
		this.isPermisoCopiarCargaFamiliar=isPermiso;		
		this.isPermisoVerFormCargaFamiliar=isPermiso;		
		this.isPermisoDuplicarCargaFamiliar=isPermiso;
		this.isPermisoOrdenCargaFamiliar=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCargaFamiliar(Boolean isPermiso) {
		//this.isPermisoTodoCargaFamiliar=isPermiso;
		this.isPermisoNuevoCargaFamiliar=isPermiso;
		this.isPermisoActualizarCargaFamiliar=isPermiso;
		this.isPermisoActualizarOriginalCargaFamiliar=isPermiso;
		this.isPermisoEliminarCargaFamiliar=isPermiso;
		this.isPermisoGuardarCambiosCargaFamiliar=isPermiso;
		//this.isPermisoConsultaCargaFamiliar=isPermiso;
		//this.isPermisoBusquedaCargaFamiliar=isPermiso;
		//this.isPermisoReporteCargaFamiliar=isPermiso;
		//this.isPermisoOrdenCargaFamiliar=isPermiso;		
		//this.isPermisoPaginacionMedioCargaFamiliar=isPermiso;		
		//this.isPermisoPaginacionAltoCargaFamiliar=isPermiso;		
		//this.isPermisoPaginacionTodoCargaFamiliar=isPermiso;		
		//this.isPermisoCopiarCargaFamiliar=isPermiso;		
		//this.isPermisoDuplicarCargaFamiliar=isPermiso;
		//this.isPermisoOrdenCargaFamiliar=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCargaFamiliarClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CargaFamiliarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCargaFamiliar(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCargaFamiliarClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCargaFamiliarClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCargaFamiliarClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCargaFamiliarClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCargaFamiliar() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CargaFamiliarJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CargaFamiliarConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCargaFamiliar=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCargaFamiliar=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCargaFamiliar=this.isPermisoActualizarCargaFamiliar;
			this.isPermisoEliminarCargaFamiliar=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCargaFamiliar=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCargaFamiliar=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCargaFamiliar=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCargaFamiliar=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCargaFamiliar=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargaFamiliar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCargaFamiliar=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCargaFamiliar=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCargaFamiliar=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCargaFamiliar=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCargaFamiliar=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCargaFamiliar=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargaFamiliar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCargaFamiliar.setToolTipText(this.jTableDatosCargaFamiliar.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCargaFamiliar(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCargaFamiliar(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CargaFamiliarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CargaFamiliarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCargaFamiliar() throws Exception {
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
	public void inicializarCombosForeignKeyCargaFamiliarListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipocargafamisForeignKey=new ArrayList();
				this.tipogenerosForeignKey=new ArrayList();
				this.estadocivilsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCargaFamiliarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CargaFamiliarJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCargaFamiliarListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCargaFamiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoGeneroListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoCivilListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoCargaFamiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocargafamisForeignKey==null||this.tipocargafamisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCargaFamiConstantesFunciones.getArrayColumnasGlobalesTipoCargaFami(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCargaFamiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCargaFamiConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCargaFamisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGeneroListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipogenerosForeignKey==null||this.tipogenerosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoGeneroConstantesFunciones.getArrayColumnasGlobalesTipoGenero(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGeneroConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoGeneroConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoGenerosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoCivilListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadocivilsForeignKey==null||this.estadocivilsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoCivilConstantesFunciones.getArrayColumnasGlobalesEstadoCivil(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoCivilConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoCivilConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoCivilsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCargaFamiliarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CargaFamiliarParameterReturnGeneral cargafamiliarReturnGeneral=new CargaFamiliarParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cargafamiliarConstantesFunciones.cargarid_empresaCargaFamiliar)
					 || (this.esRecargarFks && this.cargafamiliarConstantesFunciones.cargarid_empresaCargaFamiliar)) {

					if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cargafamiliarSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.cargafamiliarConstantesFunciones.cargarid_clienteCargaFamiliar)
					 || (this.esRecargarFks && this.cargafamiliarConstantesFunciones.cargarid_clienteCargaFamiliar)) {

					if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+cargafamiliarSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoCargaFami="";

				if(((this.tipocargafamisForeignKey==null||this.tipocargafamisForeignKey.size()<=0) && this.cargafamiliarConstantesFunciones.cargarid_tipo_carga_famiCargaFamiliar)
					 || (this.esRecargarFks && this.cargafamiliarConstantesFunciones.cargarid_tipo_carga_famiCargaFamiliar)) {

					if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionTipoCargaFami()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCargaFamiConstantesFunciones.getArrayColumnasGlobalesTipoCargaFami(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCargaFami=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCargaFamiConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCargaFami=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCargaFami, "");
						finalQueryGlobalTipoCargaFami+=TipoCargaFamiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCargaFamisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCargaFami=" WHERE " + ConstantesSql.ID + "="+cargafamiliarSessionBean.getlidTipoCargaFamiActual();
					}
				} else {
					finalQueryGlobalTipoCargaFami="NONE";
				}


				String finalQueryGlobalTipoGenero="";

				if(((this.tipogenerosForeignKey==null||this.tipogenerosForeignKey.size()<=0) && this.cargafamiliarConstantesFunciones.cargarid_tipo_generoCargaFamiliar)
					 || (this.esRecargarFks && this.cargafamiliarConstantesFunciones.cargarid_tipo_generoCargaFamiliar)) {

					if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionTipoGenero()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGeneroConstantesFunciones.getArrayColumnasGlobalesTipoGenero(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGenero=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGeneroConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoGenero=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGenero, "");
						finalQueryGlobalTipoGenero+=TipoGeneroConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoGenerosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGenero=" WHERE " + ConstantesSql.ID + "="+cargafamiliarSessionBean.getlidTipoGeneroActual();
					}
				} else {
					finalQueryGlobalTipoGenero="NONE";
				}


				String finalQueryGlobalEstadoCivil="";

				if(((this.estadocivilsForeignKey==null||this.estadocivilsForeignKey.size()<=0) && this.cargafamiliarConstantesFunciones.cargarid_estado_civilCargaFamiliar)
					 || (this.esRecargarFks && this.cargafamiliarConstantesFunciones.cargarid_estado_civilCargaFamiliar)) {

					if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionEstadoCivil()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoCivilConstantesFunciones.getArrayColumnasGlobalesEstadoCivil(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoCivil=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoCivilConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoCivil=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoCivil, "");
						finalQueryGlobalEstadoCivil+=EstadoCivilConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoCivilsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoCivil=" WHERE " + ConstantesSql.ID + "="+cargafamiliarSessionBean.getlidEstadoCivilActual();
					}
				} else {
					finalQueryGlobalEstadoCivil="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cargafamiliarReturnGeneral=cargafamiliarLogic.cargarCombosLoteForeignKeyCargaFamiliar(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalTipoCargaFami,finalQueryGlobalTipoGenero,finalQueryGlobalEstadoCivil);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cargafamiliarReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=cargafamiliarReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoCargaFami.equals("NONE")) {
				this.tipocargafamisForeignKey=cargafamiliarReturnGeneral.gettipocargafamisForeignKey();
			}

			if(!finalQueryGlobalTipoGenero.equals("NONE")) {
				this.tipogenerosForeignKey=cargafamiliarReturnGeneral.gettipogenerosForeignKey();
			}

			if(!finalQueryGlobalEstadoCivil.equals("NONE")) {
				this.estadocivilsForeignKey=cargafamiliarReturnGeneral.getestadocivilsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCargaFamiliar()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoCargaFami();
			this.addItemDefectoCombosForeignKeyTipoGenero();
			this.addItemDefectoCombosForeignKeyEstadoCivil();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cargafamiliarSessionBean==null) {
				this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoCargaFami()throws Exception {
		try {

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionTipoCargaFami()) {
				TipoCargaFami tipocargafami=new TipoCargaFami();
				TipoCargaFamiConstantesFunciones.setTipoCargaFamiDescripcion(tipocargafami,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocargafami.setId(null);

				if(!TipoCargaFamiConstantesFunciones.ExisteEnLista(this.tipocargafamisForeignKey,tipocargafami,true)) {

					this.tipocargafamisForeignKey.add(0,tipocargafami);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoGenero()throws Exception {
		try {

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionTipoGenero()) {
				TipoGenero tipogenero=new TipoGenero();
				TipoGeneroConstantesFunciones.setTipoGeneroDescripcion(tipogenero,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipogenero.setId(null);

				if(!TipoGeneroConstantesFunciones.ExisteEnLista(this.tipogenerosForeignKey,tipogenero,true)) {

					this.tipogenerosForeignKey.add(0,tipogenero);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoCivil()throws Exception {
		try {

			if(!this.cargafamiliarSessionBean.getisBusquedaDesdeForeignKeySesionEstadoCivil()) {
				EstadoCivil estadocivil=new EstadoCivil();
				EstadoCivilConstantesFunciones.setEstadoCivilDescripcion(estadocivil,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadocivil.setId(null);

				if(!EstadoCivilConstantesFunciones.ExisteEnLista(this.estadocivilsForeignKey,estadocivil,true)) {

					this.estadocivilsForeignKey.add(0,estadocivil);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCargaFamiliar()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCargaFamiliar(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCargaFamiliar()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.cargafamiliar.setfecha_nacimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargaFamiliar();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar(CargaFamiliar cargafamiliar)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(cargafamiliar.getid_cliente(),false,"Formulario");
			this.setActualTipoCargaFamiForeignKey(cargafamiliar.getid_tipo_carga_fami(),false,"Formulario");
			this.setActualTipoGeneroForeignKey(cargafamiliar.getid_tipo_genero(),false,"Formulario");
			this.setActualEstadoCivilForeignKey(cargafamiliar.getid_estado_civil(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCargaFamiliar(CargaFamiliar cargafamiliar,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cargafamiliar.getCliente()!=null && !sTipoEvento.equals("id_clienteCargaFamiliar")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(cargafamiliar.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCargaFamiliar()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.cargafamiliarConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoCargaFamiForeignKey(this.cargafamiliarConstantesFunciones.getid_tipo_carga_fami(),false,"Formulario");
			this.setActualTipoGeneroForeignKey(this.cargafamiliarConstantesFunciones.getid_tipo_genero(),false,"Formulario");
			this.setActualEstadoCivilForeignKey(this.cargafamiliarConstantesFunciones.getid_estado_civil(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCargaFamiliar()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCargaFamiliar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCargaFamiliar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCargaFamiliar()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCargaFamiliar()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoCargaFamisForeignKey("Todos");
			this.cargarCombosFrameTipoGenerosForeignKey("Todos");
			this.cargarCombosFrameEstadoCivilsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCargaFamiliar(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCargaFamisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoGenerosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoCivilsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCargaFamiliar()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public CargaFamiliarBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CargaFamiliarBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CargaFamiliarBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cargafamiliarSessionBean=new CargaFamiliarSessionBean(); 
		this.cargafamiliarConstantesFunciones=new CargaFamiliarConstantesFunciones(); 
		this.cargafamiliarBean=new CargaFamiliar();//(this.cargafamiliarConstantesFunciones); 		
		this.cargafamiliarReturnGeneral=new CargaFamiliarParameterReturnGeneral(); 
		
		this.cargafamiliarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargafamiliarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CargaFamiliarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CargaFamiliarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CargaFamiliarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCargaFamiliar(true);
			
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
			
			this.cargafamiliarConstantesFunciones=new CargaFamiliarConstantesFunciones(); 
			this.cargafamiliarBean=new CargaFamiliar();//this.cargafamiliarConstantesFunciones); 			
			this.cargafamiliarReturnGeneral=new CargaFamiliarParameterReturnGeneral(); 
		
			CargaFamiliarBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Carga Familiar Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cargafamiliar=new CargaFamiliar();
			this.cargafamiliars = new ArrayList<CargaFamiliar>();
			this.cargafamiliarsAux = new ArrayList<CargaFamiliar>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic=new CargaFamiliarLogic();
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}
			
			//this.cargafamiliarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cargafamiliarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCargaFamiliar);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCargaFamiliar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargaFamiliar);	
					}
					
					if(this.jInternalFrameImportacionCargaFamiliar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargaFamiliar);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCargaFamiliar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCargaFamiliar);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCargaFamiliar);
				this.jInternalFrameDetalleFormCargaFamiliar.setVisible(false);
				this.jInternalFrameDetalleFormCargaFamiliar.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCargaFamiliar!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargaFamiliar);
					this.jInternalFrameReporteDinamicoCargaFamiliar.setVisible(false);
					this.jInternalFrameReporteDinamicoCargaFamiliar.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCargaFamiliar!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCargaFamiliar);
					this.jInternalFrameImportacionCargaFamiliar.setVisible(false);
					this.jInternalFrameImportacionCargaFamiliar.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCargaFamiliar!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCargaFamiliar);
					this.jInternalFrameOrderByCargaFamiliar.setVisible(false);
					this.jInternalFrameOrderByCargaFamiliar.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCargaFamiliarActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CargaFamiliarConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cargafamiliarReturnGeneral=new CargaFamiliarParameterReturnGeneral();
			
			this.cargafamiliarParameterGeneral=new CargaFamiliarParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cargafamiliarLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CargaFamiliarJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargaFamiliarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargafamiliarSessionBean.getEsGuardarRelacionado(),this.cargafamiliarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargaFamiliarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargafamiliarSessionBean.getEsGuardarRelacionado(),this.cargafamiliarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCargaFamiliar=false;
			this.isVisibilidadCeldaDuplicarCargaFamiliar=true;
			this.isVisibilidadCeldaCopiarCargaFamiliar=true;
			this.isVisibilidadCeldaVerFormCargaFamiliar=true;
			this.isVisibilidadCeldaOrdenCargaFamiliar=true;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;
			this.isVisibilidadCeldaModificarCargaFamiliar=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar=false;
			this.isVisibilidadCeldaGuardarCargaFamiliar=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoCivil=true;
			this.isVisibilidadFK_IdTipoCargaFami=true;
			this.isVisibilidadFK_IdTipoGenero=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCargaFamiliar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCargaFamiliar();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCargaFamiliar(false);
			
			this.setPermisosUsuarioCargaFamiliar();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado() 
				|| (this.cargafamiliarSessionBean.getEsGuardarRelacionado() && this.cargafamiliarSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCargaFamiliarClasesRelacionadas();
			}
			
			if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCargaFamiliarClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCargaFamiliar();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCargaFamiliar();
			}
			
			if(!this.isPermisoBusquedaCargaFamiliar) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCargaFamiliar.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCargaFamiliar,this.isPermisoPaginacionMedioCargaFamiliar,this.isPermisoPaginacionTodoCargaFamiliar);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CargaFamiliarConstantesFunciones.getTiposSeleccionarCargaFamiliar());
				
				this.tiposColumnasSelect=CargaFamiliarConstantesFunciones.getTiposSeleccionarCargaFamiliar(true);
				
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
			//if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCargaFamiliar();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCargaFamiliar(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCargaFamiliar(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCargaFamiliar() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.tipocargafamiLogic=new TipoCargaFamiLogic();
			this.tipogeneroLogic=new TipoGeneroLogic();
			this.estadocivilLogic=new EstadoCivilLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cargafamiliarImplementable= (CargaFamiliarImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargaFamiliarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cargafamiliarImplementableHome= (CargaFamiliarImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargaFamiliarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cargafamiliars= new ArrayList<CargaFamiliar>();
			this.cargafamiliarsEliminados= new ArrayList<CargaFamiliar>();
						
			this.isEsNuevoCargaFamiliar=false;
			this.esParaAccionDesdeFormularioCargaFamiliar=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipocargafamisForeignKey=new ArrayList<TipoCargaFami>() ;
			this.tipogenerosForeignKey=new ArrayList<TipoGenero>() ;
			this.estadocivilsForeignKey=new ArrayList<EstadoCivil>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCargaFamiliar(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCargaFamiliar();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CargaFamiliarBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CargaFamiliarConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCargaFamiliar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCargaFamiliar(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCargaFamiliar();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCargaFamiliar();
			}
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCargaFamiliar.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCargaFamiliar.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCargaFamiliar.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCargaFamiliar(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CargaFamiliar: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCargaFamiliar() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCargaFamiliar")) {
				iIndex=this.jInternalFrameDetalleFormCargaFamiliar.jTabbedPaneRelacionesCargaFamiliar.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCargaFamiliar.jTabbedPaneRelacionesCargaFamiliar.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCargaFamiliar();	
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
	
	public void cargarCombosForeignKeyCargaFamiliar(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCargaFamiliar(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCargaFamiliar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCargaFamiliarListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCargaFamiliar();
		
		this.cargarCombosFrameForeignKeyCargaFamiliar();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCargaFamiliar();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCargaFamiliar();
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

	public void cargarCombosForeignKeyTipoCargaFami(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCargaFamiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCargaFami();
				this.cargarCombosFrameTipoCargaFamisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCargaFami(this.tipocargafamisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGenero(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoGeneroListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoGenero();
				this.cargarCombosFrameTipoGenerosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoGenero(this.tipogenerosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoCivil(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoCivilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoCivil();
				this.cargarCombosFrameEstadoCivilsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoCivil(this.estadocivilsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCargaFamiliarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
			
			if(jTableDatosCargaFamiliar.getRowCount()>=1) {
				jTableDatosCargaFamiliar.removeRowSelectionInterval(0, jTableDatosCargaFamiliar.getRowCount()-1);						
			}
			
			this.isEsNuevoCargaFamiliar=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCargaFamiliar(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCargaFamiliar(true);			
			//this.cargafamiliar=new CargaFamiliar();
			//this.cargafamiliar.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargaFamiliar(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargaFamiliar() ;
			
			if(CargaFamiliarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargaFamiliar(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cargafamiliar);	
			this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);				
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
			if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CargaFamiliar: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCargaFamiliarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCargaFamiliar.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCargaFamiliar.getSelectedRows().length;			
			}
			
			cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCargaFamiliar--;			
				//CargaFamiliar cargafamiliarAux= new CargaFamiliar();			
				//cargafamiliarAux.setId(this.iIdNuevoCargaFamiliar);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CargaFamiliar cargafamiliarOrigen=new CargaFamiliar();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CargaFamiliar cargafamiliarOrigen : cargafamiliarsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cargafamiliarOrigen =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliarOrigen =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCargaFamiliar();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cargafamiliar.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCargaFamiliar(cargafamiliarOrigen,this.cargafamiliar,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargafamiliarLogic.getCargaFamiliars().add(this.cargafamiliarAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargafamiliars.add(this.cargafamiliarAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCargaFamiliar(false);
				
				this.jTableDatosCargaFamiliar.setRowSelectionInterval(this.getIndiceNuevoCargaFamiliar(), this.getIndiceNuevoCargaFamiliar());
				
				int iLastRow =  this.jTableDatosCargaFamiliar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargaFamiliar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargaFamiliar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargaFamiliar(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();									
		
			CargaFamiliar cargafamiliarOrigen=new CargaFamiliar();
			CargaFamiliar cargafamiliarDestino=new CargaFamiliar();
				
			cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCargaFamiliar.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cargafamiliarsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCargaFamiliar.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarOrigen =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargafamiliarOrigen =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliarDestino =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargafamiliarDestino =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cargafamiliarOrigen =cargafamiliarsSeleccionados.get(0);
				cargafamiliarDestino =cargafamiliarsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCargaFamiliar(cargafamiliarOrigen,cargafamiliarDestino,true,false);
				
				cargafamiliarDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargafamiliarDestino,cargafamiliarLogic.getCargaFamiliars());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargafamiliarDestino,cargafamiliars);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCargaFamiliar(false);
				
				//this.jTableDatosCargaFamiliar.setRowSelectionInterval(this.getIndiceNuevoCargaFamiliar(), this.getIndiceNuevoCargaFamiliar());
				
				int iLastRow =  this.jTableDatosCargaFamiliar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargaFamiliar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargaFamiliar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargaFamiliar(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCargaFamiliar.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCargaFamiliar.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCargaFamiliar.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCargaFamiliar.setVisible(!isVisible);
			this.jPanelPaginacionCargaFamiliar.setVisible(!isVisible);
			this.jPanelAccionesCargaFamiliar.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCargaFamiliar();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCargaFamiliar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCargaFamiliar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCargaFamiliar();
			
			this.abrirFrameOrderByCargaFamiliar();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCargaFamiliar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCargaFamiliar(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargaFamiliar);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCargaFamiliar.isMaximum()) {
					this.jInternalFrameDetalleFormCargaFamiliar.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCargaFamiliar.setSize(this.jInternalFrameDetalleFormCargaFamiliar.iWidthFormulario,this.jInternalFrameDetalleFormCargaFamiliar.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCargaFamiliar.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCargaFamiliar.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCargaFamiliar.isMaximum()) {
						this.jInternalFrameDetalleFormCargaFamiliar.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCargaFamiliar.jContentPaneDetalleCargaFamiliar.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCargaFamiliar.jTabbedPaneRelacionesCargaFamiliar.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCargaFamiliar.jContentPaneDetalleCargaFamiliar.getWidth(),CargaFamiliarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargaFamiliar.jTabbedPaneRelacionesCargaFamiliar.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCargaFamiliar.jContentPaneDetalleCargaFamiliar.getWidth(),CargaFamiliarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargaFamiliar.jTabbedPaneRelacionesCargaFamiliar.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCargaFamiliar.jContentPaneDetalleCargaFamiliar.getWidth(),CargaFamiliarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCargaFamiliar.setVisible(true);
	        this.jInternalFrameDetalleFormCargaFamiliar.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCargaFamiliar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCargaFamiliar==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCargaFamiliar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargaFamiliar,false,this);
				} else {
					this.jInternalFrameOrderByCargaFamiliar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargaFamiliar,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCargaFamiliar);
				this.jInternalFrameOrderByCargaFamiliar.setVisible(false);
				this.jInternalFrameOrderByCargaFamiliar.setSelected(false);
				
				this.jInternalFrameOrderByCargaFamiliar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargaFamiliar"));
				
				this.inicializarActualizarBindingTablaOrderByCargaFamiliar();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCargaFamiliar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCargaFamiliar==null) {
				
				this.jInternalFrameImportacionCargaFamiliar=new ImportacionJInternalFrame(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargaFamiliar);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCargaFamiliar);
				this.jInternalFrameImportacionCargaFamiliar.setVisible(false);
				this.jInternalFrameImportacionCargaFamiliar.setSelected(false);


				this.jInternalFrameImportacionCargaFamiliar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargaFamiliar"));
				this.jInternalFrameImportacionCargaFamiliar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargaFamiliar"));
				this.jInternalFrameImportacionCargaFamiliar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargaFamiliar"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCargaFamiliar() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCargaFamiliar==null) {
				this.jInternalFrameReporteDinamicoCargaFamiliar=new ReporteDinamicoJInternalFrame(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargaFamiliar);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargaFamiliar);
				this.jInternalFrameReporteDinamicoCargaFamiliar.setVisible(false);
				this.jInternalFrameReporteDinamicoCargaFamiliar.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCargaFamiliar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargaFamiliar"));
				this.jInternalFrameReporteDinamicoCargaFamiliar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargaFamiliar"));
				this.jInternalFrameReporteDinamicoCargaFamiliar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargaFamiliar"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargaFamiliar();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCargaFamiliar() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargaFamiliar);
			
	       	this.jInternalFrameDetalleFormCargaFamiliar.setVisible(false);
	        this.jInternalFrameDetalleFormCargaFamiliar.setSelected(false);
			
			//this.jInternalFrameDetalleFormCargaFamiliar.dispose();
			//this.jInternalFrameDetalleFormCargaFamiliar=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCargaFamiliar() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCargaFamiliar.setVisible(true);
	        this.jInternalFrameReporteDinamicoCargaFamiliar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCargaFamiliar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCargaFamiliar.setVisible(true);
	        this.jInternalFrameImportacionCargaFamiliar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCargaFamiliar() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCargaFamiliar.setVisible(true);
	        this.jInternalFrameOrderByCargaFamiliar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCargaFamiliar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCargaFamiliar.setVisible(false);
	        this.jInternalFrameOrderByCargaFamiliar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCargaFamiliar() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCargaFamiliar.setVisible(false);
	        this.jInternalFrameReporteDinamicoCargaFamiliar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCargaFamiliar() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCargaFamiliar.setVisible(false);
	        this.jInternalFrameImportacionCargaFamiliar.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCargaFamiliar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCargaFamiliar(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCargaFamiliar(true);
			//this.isEsNuevoCargaFamiliar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCargaFamiliar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargaFamiliar(false) ;
			
			if(cargafamiliarSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CargaFamiliarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargaFamiliar(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargaFamiliar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCargaFamiliarActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCargaFamiliar(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCargaFamiliar(true);
			//this.isEsNuevoCargaFamiliar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cargafamiliar.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCargaFamiliar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCargaFamiliar(false) ;
			
			if(CargaFamiliarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargaFamiliar(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargaFamiliar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.cargafamiliarConstantesFunciones.cargarid_clienteCargaFamiliar) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCargaFamiliar(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargaFamiliar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCargaFami(List<TipoCargaFami> tipocargafamisForeignKey)throws Exception{
		TableColumn tableColumnTipoCargaFami=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI));
		TableCellEditor tableCellEditorTipoCargaFami =tableColumnTipoCargaFami.getCellEditor();

		TipoCargaFamiTableCell tipocargafamiTableCellFk=(TipoCargaFamiTableCell)tableCellEditorTipoCargaFami;

		if(tipocargafamiTableCellFk!=null) {
			tipocargafamiTableCellFk.settipocargafamisForeignKey(tipocargafamisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargaFamiliar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocargafamiTableCellFk.setRowActual(intSelectedRow);
			//tipocargafamiTableCellFk.settipocargafamisForeignKeyActual(tipocargafamisForeignKey);
		//}


		if(tipocargafamiTableCellFk!=null) {
			tipocargafamiTableCellFk.RecargarTipoCargaFamisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoGenero(List<TipoGenero> tipogenerosForeignKey)throws Exception{
		TableColumn tableColumnTipoGenero=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO));
		TableCellEditor tableCellEditorTipoGenero =tableColumnTipoGenero.getCellEditor();

		TipoGeneroTableCell tipogeneroTableCellFk=(TipoGeneroTableCell)tableCellEditorTipoGenero;

		if(tipogeneroTableCellFk!=null) {
			tipogeneroTableCellFk.settipogenerosForeignKey(tipogenerosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargaFamiliar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipogeneroTableCellFk.setRowActual(intSelectedRow);
			//tipogeneroTableCellFk.settipogenerosForeignKeyActual(tipogenerosForeignKey);
		//}


		if(tipogeneroTableCellFk!=null) {
			tipogeneroTableCellFk.RecargarTipoGenerosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoCivil(List<EstadoCivil> estadocivilsForeignKey)throws Exception{
		TableColumn tableColumnEstadoCivil=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL));
		TableCellEditor tableCellEditorEstadoCivil =tableColumnEstadoCivil.getCellEditor();

		EstadoCivilTableCell estadocivilTableCellFk=(EstadoCivilTableCell)tableCellEditorEstadoCivil;

		if(estadocivilTableCellFk!=null) {
			estadocivilTableCellFk.setestadocivilsForeignKey(estadocivilsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargaFamiliar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadocivilTableCellFk.setRowActual(intSelectedRow);
			//estadocivilTableCellFk.setestadocivilsForeignKeyActual(estadocivilsForeignKey);
		//}


		if(estadocivilTableCellFk!=null) {
			estadocivilTableCellFk.RecargarEstadoCivilsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCargaFamiliar(false);
			
			//if(!this.isEsNuevoCargaFamiliar) {								
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				
			}
			
			if(this.permiteMantenimiento(this.cargafamiliar)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCargaFamiliar=true;
					this.inicializarActualizarBindingTablaCargaFamiliar(false);
					this.isEsNuevoCargaFamiliar=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCargaFamiliar=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCargaFamiliar=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargaFamiliar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargaFamiliar(false);
				
				this.habilitarDeshabilitarControlesCargaFamiliar(false);
			
												
				
				if(CargaFamiliarJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCargaFamiliar();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCargaFamiliarActionPerformed(evt,cargafamiliarSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCargaFamiliar(this.cargafamiliar,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCargaFamiliar.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cargafamiliarSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cargafamiliar.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				this.cargafamiliar.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				this.cargafamiliar.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cargafamiliar)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CargaFamiliarModel) this.jTableDatosCargaFamiliar.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCargaFamiliar=true;
				this.inicializarActualizarBindingTablaCargaFamiliar(false);
				this.isEsNuevoCargaFamiliar=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargaFamiliar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargaFamiliar(false);
				
				this.habilitarDeshabilitarControlesCargaFamiliar(false);
				
				
				
				if(CargaFamiliarJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCargaFamiliar();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCargaFamiliar.getRowCount()>=1) {
				jTableDatosCargaFamiliar.removeRowSelectionInterval(0, jTableDatosCargaFamiliar.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCargaFamiliar(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCargaFamiliar(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargaFamiliar(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargaFamiliar(false) ;
			
			this.isEsNuevoCargaFamiliar=false;
			
			if(CargaFamiliarJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCargaFamiliar();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCargaFamiliar(false);
				
				//SI ES MANUAL
				if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCargaFamiliar();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCargaFamiliar--;			
			//CargaFamiliar cargafamiliarAux= new CargaFamiliar();			
			//cargafamiliarAux.setId(this.iIdNuevoCargaFamiliar);
			
			if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCargaFamiliar();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
			
			this.cargafamiliar.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cargafamiliarLogic.getCargaFamiliars().add(this.cargafamiliarAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cargafamiliars.add(this.cargafamiliarAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCargaFamiliar(false);
			
			this.jTableDatosCargaFamiliar.setRowSelectionInterval(this.getIndiceNuevoCargaFamiliar(), this.getIndiceNuevoCargaFamiliar());
			
			int iLastRow =  this.jTableDatosCargaFamiliar.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCargaFamiliar.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCargaFamiliar.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCargaFamiliar(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCargaFamiliar(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargaFamiliar(false);
			
			//SI ES MANUAL
			if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargaFamiliar();
			}
			
			//this.abrirFrameTreeCargaFamiliar();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Carga FamiliarES ?", "MANTENIMIENTO DE Carga Familiar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCargaFamiliar.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCargaFamiliar();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cargafamiliarReturnGeneral=cargafamiliarLogic.procesarImportacionCargaFamiliarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cargafamiliarParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCargaFamiliarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCargaFamiliar.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCargaFamiliar.setFileImportacion(this.jInternalFrameImportacionCargaFamiliar.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCargaFamiliar.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCargaFamiliar.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCargaFamiliar.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCargaFamiliar.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();		

		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CargaFamiliarBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CargaFamiliarBaseDesign.jrxml";
			
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
			
			this.generarReporteCargaFamiliars("Todos",cargafamiliarsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCargaFami_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCargaFami_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCargaFami_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCargaFami_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoGenero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoGenero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoGenero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoGenero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoCivil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoCivil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoCivil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoCivil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_CEDULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_dula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_dula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_dula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_dula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaNacimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaNacimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaNacimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaNacimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliarConstantesFunciones.LABEL_VALORCUPO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCupo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCargaFamiliar.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					sNombreCampoCategoria="id_tipo_carga_fami";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO:
					sNombreCampoCategoria="id_tipo_genero";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL:
					sNombreCampoCategoria="id_estado_civil";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoria="cedula";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO:
					sNombreCampoCategoria="fecha_nacimiento";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_VALORCUPO:
					sNombreCampoCategoria="valor_cupo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					sNombreCampoCategoriaValor="id_tipo_carga_fami";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO:
					sNombreCampoCategoriaValor="id_tipo_genero";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL:
					sNombreCampoCategoriaValor="id_estado_civil";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoriaValor="cedula";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO:
					sNombreCampoCategoriaValor="fecha_nacimiento";
					break;

				case CargaFamiliarConstantesFunciones.LABEL_VALORCUPO:
					sNombreCampoCategoriaValor="valor_cupo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Carga Fami",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_carga_fami");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Genero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_genero");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Civil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_civil");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_CEDULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cedula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cedula");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Nacimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_nacimiento");
					break;

				case CargaFamiliarConstantesFunciones.LABEL_VALORCUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Cupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_cupo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();		
		
		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CargaFamiliars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.gettipocargafami_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.gettipogenero_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.getestadocivil_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_CEDULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_CEDULA);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.getcedula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.getfecha_nacimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliarConstantesFunciones.LABEL_VALORCUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_VALORCUPO);
					iRow++;

					for(CargaFamiliar cargafamiliar:cargafamiliarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar.getvalor_cupo());
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
			//	this.getFilaCabeceraExportarExcelCargaFamiliar(row);				
			//	iRow++;
			//}				
			
			//for(CargaFamiliar cargafamiliarAux:cargafamiliarsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCargaFamiliar(cargafamiliarAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
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
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargaFamiliar(false);
			
			//SI ES MANUAL
			if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargaFamiliar();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargaFamiliar(false);
			
			//SI ES MANUAL
			if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargaFamiliar();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargaFamiliar(false);
			
			//SI ES MANUAL
			if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargaFamiliar();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCargaFamiliar() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCargaFamiliar.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCargaFamiliar.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCargaFamiliar.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCargaFamiliar.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCargaFamiliar.setMinimumSize(dimensionMinimum);
		this.jTableDatosCargaFamiliar.setMaximumSize(dimensionMaximum);
		this.jTableDatosCargaFamiliar.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCargaFamiliar(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCargaFamiliar(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCargaFamiliar(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCargaFamiliar(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCargaFamiliar(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCargaFamiliar(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargaFamiliar(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCargaFamiliar(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCargaFamiliar() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCargaFamiliar();
		
		this.inicializarActualizarBindingBotonesManualCargaFamiliar(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCargaFamiliar();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargaFamiliar() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCargaFamiliar(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCargaFamiliar(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCargaFamiliar.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCargaFamiliar.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCargaFamiliar.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCargaFamiliar.jCheckBoxPostAccionNuevoCargaFamiliar.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCargaFamiliar.jCheckBoxPostAccionSinCerrarCargaFamiliar.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCargaFamiliar.jCheckBoxPostAccionSinMensajeCargaFamiliar.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCargaFamiliar.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCargaFamiliar.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCargaFamiliar.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
				this.jInternalFrameDetalleFormCargaFamiliar.jCheckBoxPostAccionNuevoCargaFamiliar.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCargaFamiliar.jCheckBoxPostAccionSinCerrarCargaFamiliar.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCargaFamiliar.jCheckBoxPostAccionSinMensajeCargaFamiliar.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCargaFamiliar.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCargaFamiliar.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCargaFamiliar.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCargaFamiliar!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCargaFamiliar.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCargaFamiliar.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCargaFamiliar.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCargaFamiliar.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCargaFamiliar!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCargaFamiliar.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCargaFamiliar.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCargaFamiliar(Boolean esInicializar) throws Exception {
		try	{	
			if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCargaFamiliar(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCargaFamiliar() throws Exception {
		try	{
			if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCargaFamiliar();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargaFamiliar() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCargaFamiliar() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCargaFamiliar.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCargaFamiliar.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCargaFamiliar.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCargaFamiliar.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCargaFamiliar.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCargaFamiliar.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCargaFamiliar.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCargaFamiliar.addItem(reporte);
			}
			
			
			if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCargaFamiliar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCargaFamiliar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCargaFamiliar.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCargaFamiliar.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCargaFamiliar.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCargaFamiliar.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCargaFamiliar.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCargaFamiliar.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCargaFamiliar.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargaFamiliar();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargaFamiliar() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargaFamiliar!=null) {
				this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargaFamiliar!=null) {
				this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCargaFamiliar!=null) {
				
				if(this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCargaFamiliar.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CargaFamiliarConstantesFunciones.getTiposSeleccionarCargaFamiliar(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CargaFamiliarConstantesFunciones.getTiposSeleccionarCargaFamiliar(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CargaFamiliarConstantesFunciones.getTiposSeleccionarCargaFamiliar(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCargaFamiliar.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCargaFamiliar()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteCargaFamiliar.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteCargaFamiliar.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.getSelectedItem()!=null){this.id_estado_civilFK_IdEstadoCivil=((EstadoCivil)this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.getSelectedItem()!=null){this.id_tipo_carga_famiFK_IdTipoCargaFami=((TipoCargaFami)this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.getSelectedItem()!=null){this.id_tipo_generoFK_IdTipoGenero=((TipoGenero)this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCargaFamiliar(Boolean esInicializar) throws Exception {				
		if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCargaFamiliar();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCargaFamiliar() throws Exception {
		this.inicializarActualizarBindingTablaCargaFamiliar(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCargaFamiliar() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCargaFamiliarOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliarOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCargaFamiliar(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cargafamiliarLogic.getCargaFamiliars().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cargafamiliars.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCargaFamiliar.setModel(new CargaFamiliarModel(this.cargafamiliarLogic.getCargaFamiliars(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCargaFamiliar.setModel(new CargaFamiliarModel(this.cargafamiliars,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCargaFamiliar!=null && this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCargaFamiliar();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO,cargafamiliarConstantesFunciones.resaltarSeleccionarCargaFamiliar,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO,cargafamiliarConstantesFunciones.resaltarSeleccionarCargaFamiliar,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_ID));

		if(this.cargafamiliarConstantesFunciones.mostraridCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargafamiliarConstantesFunciones.resaltaridCargaFamiliar,this.cargafamiliarConstantesFunciones.activaridCargaFamiliar,iSizeTabla,this,true,"idCargaFamiliar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliarConstantesFunciones.resaltaridCargaFamiliar,this.cargafamiliarConstantesFunciones.activaridCargaFamiliar,this,true,"idCargaFamiliar","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cargafamiliarConstantesFunciones.mostrarid_empresaCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_empresaCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_empresaCargaFamiliar,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_empresaCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_empresaCargaFamiliar,false,"id_empresaCargaFamiliar","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE));

		if(this.cargafamiliarConstantesFunciones.mostrarid_clienteCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_clienteCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_clienteCargaFamiliar,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_clienteCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_clienteCargaFamiliar,true,"id_clienteCargaFamiliar","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI));

		if(this.cargafamiliarConstantesFunciones.mostrarid_tipo_carga_famiCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCargaFamiTableCell(this.tipocargafamisForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_tipo_carga_famiCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_tipo_carga_famiCargaFamiliar,iSizeTabla));
			tableColumn.setCellEditor(new TipoCargaFamiTableCell(this.tipocargafamisForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_tipo_carga_famiCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_tipo_carga_famiCargaFamiliar,true,"id_tipo_carga_famiCargaFamiliar","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO));

		if(this.cargafamiliarConstantesFunciones.mostrarid_tipo_generoCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoGeneroTableCell(this.tipogenerosForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_tipo_generoCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_tipo_generoCargaFamiliar,iSizeTabla));
			tableColumn.setCellEditor(new TipoGeneroTableCell(this.tipogenerosForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_tipo_generoCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_tipo_generoCargaFamiliar,true,"id_tipo_generoCargaFamiliar","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL));

		if(this.cargafamiliarConstantesFunciones.mostrarid_estado_civilCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoCivilTableCell(this.estadocivilsForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_estado_civilCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_estado_civilCargaFamiliar,iSizeTabla));
			tableColumn.setCellEditor(new EstadoCivilTableCell(this.estadocivilsForeignKey,this.cargafamiliarConstantesFunciones.resaltarid_estado_civilCargaFamiliar,this,this.cargafamiliarConstantesFunciones.activarid_estado_civilCargaFamiliar,true,"id_estado_civilCargaFamiliar","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_CEDULA));

		if(this.cargafamiliarConstantesFunciones.mostrarcedulaCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_CEDULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargafamiliarConstantesFunciones.resaltarcedulaCargaFamiliar,this.cargafamiliarConstantesFunciones.activarcedulaCargaFamiliar,iSizeTabla,this,true,"cedulaCargaFamiliar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliarConstantesFunciones.resaltarcedulaCargaFamiliar,this.cargafamiliarConstantesFunciones.activarcedulaCargaFamiliar,this,true,"cedulaCargaFamiliar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_APELLIDO));

		if(this.cargafamiliarConstantesFunciones.mostrarapellidoCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargafamiliarConstantesFunciones.resaltarapellidoCargaFamiliar,this.cargafamiliarConstantesFunciones.activarapellidoCargaFamiliar,iSizeTabla,this,true,"apellidoCargaFamiliar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliarConstantesFunciones.resaltarapellidoCargaFamiliar,this.cargafamiliarConstantesFunciones.activarapellidoCargaFamiliar,this,true,"apellidoCargaFamiliar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_NOMBRE));

		if(this.cargafamiliarConstantesFunciones.mostrarnombreCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargafamiliarConstantesFunciones.resaltarnombreCargaFamiliar,this.cargafamiliarConstantesFunciones.activarnombreCargaFamiliar,iSizeTabla,this,true,"nombreCargaFamiliar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliarConstantesFunciones.resaltarnombreCargaFamiliar,this.cargafamiliarConstantesFunciones.activarnombreCargaFamiliar,this,true,"nombreCargaFamiliar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_DIRECCION));

		if(this.cargafamiliarConstantesFunciones.mostrardireccionCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargafamiliarConstantesFunciones.resaltardireccionCargaFamiliar,this.cargafamiliarConstantesFunciones.activardireccionCargaFamiliar,iSizeTabla,this,true,"direccionCargaFamiliar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliarConstantesFunciones.resaltardireccionCargaFamiliar,this.cargafamiliarConstantesFunciones.activardireccionCargaFamiliar,this,true,"direccionCargaFamiliar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO));

		if(this.cargafamiliarConstantesFunciones.mostrarfecha_nacimientoCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cargafamiliarConstantesFunciones.resaltarfecha_nacimientoCargaFamiliar,this.cargafamiliarConstantesFunciones.activarfecha_nacimientoCargaFamiliar,iSizeTabla,this,true,"fecha_nacimientoCargaFamiliar","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cargafamiliarConstantesFunciones.resaltarfecha_nacimientoCargaFamiliar,this.cargafamiliarConstantesFunciones.activarfecha_nacimientoCargaFamiliar,this,true,"fecha_nacimientoCargaFamiliar","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,CargaFamiliarConstantesFunciones.LABEL_VALORCUPO));

		if(this.cargafamiliarConstantesFunciones.mostrarvalor_cupoCargaFamiliar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliarConstantesFunciones.LABEL_VALORCUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargafamiliarConstantesFunciones.resaltarvalor_cupoCargaFamiliar,this.cargafamiliarConstantesFunciones.activarvalor_cupoCargaFamiliar,iSizeTabla,this,true,"valor_cupoCargaFamiliar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliarConstantesFunciones.resaltarvalor_cupoCargaFamiliar,this.cargafamiliarConstantesFunciones.activarvalor_cupoCargaFamiliar,this,true,"valor_cupoCargaFamiliar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CargaFamiliarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargafamiliarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargafamiliarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargaFamiliar.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargafamiliarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargafamiliarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargaFamiliar.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cargafamiliarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cargafamiliarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCargaFamiliar.addColumn(tableColumn);
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
			
			this.jTableDatosCargaFamiliar.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCargaFamiliar.moveColumn(this.jTableDatosCargaFamiliar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCargaFamiliar.moveColumn(this.jTableDatosCargaFamiliar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCargaFamiliar.moveColumn(this.jTableDatosCargaFamiliar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCargaFamiliar.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCargaFamiliar.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCargaFamiliar,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCargaFamiliar.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCargaFamiliar.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCargaFamiliar.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCargaFamiliar.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCargaFamiliar.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cargafamiliarLogic.getCargaFamiliars().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cargafamiliars.size()-1;
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
		//this.jTableDatosCargaFamiliar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCargaFamiliar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCargaFamiliar();
			
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
				
				//this.isEsNuevoCargaFamiliar=false;
					
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
				if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCargaFamiliar==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargaFamiliar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargaFamiliar.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cargafamiliar.getsType().equals("DUPLICADO")
				   || this.cargafamiliar.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCargaFamiliar=true;
				
				} else {
					this.isEsNuevoCargaFamiliar=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
					if(this.cargafamiliar.getId()>=0 && !this.cargafamiliar.getIsNew()) {						
						this.isEsNuevoCargaFamiliar=false;
						
					} else {
						this.isEsNuevoCargaFamiliar=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCargaFamiliar(esRelaciones);						
				
				this.seleccionarCargaFamiliar(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cargafamiliar.getId()<0) {
					this.isEsNuevoCargaFamiliar=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCargaFamiliar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCargaFamiliar(evt,rowIndex);
				}	
				
				if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CargaFamiliar: " + this.dDif); 
					}
				}								
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCargaFamiliar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cargafamiliar)) {
					if(this.cargafamiliar.getId()>0) {
						this.cargafamiliar.setIsDeleted(true);
						
						this.cargafamiliarsEliminados.add(this.cargafamiliar);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargafamiliarLogic.getCargaFamiliars().remove(this.cargafamiliar);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargafamiliars.remove(this.cargafamiliar);				
					}
					
					
					((CargaFamiliarModel) this.jTableDatosCargaFamiliar.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCargaFamiliar(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCargaFamiliar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCargaFamiliar) {
			
			if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargaFamiliar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargaFamiliar.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCargaFamiliar(this.cargafamiliar);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cargafamiliarConstantesFunciones.cargarid_empresaCargaFamiliar || this.cargafamiliarConstantesFunciones.event_dependid_empresaCargaFamiliar) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cargafamiliar.getid_empresa());
									//this.inicializarActualizarBindingCargaFamiliar(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cargafamiliar.getEmpresa()!=null) {
							this.empresasForeignKey.add(cargafamiliar.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cargafamiliar.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.cargafamiliarConstantesFunciones.cargarid_clienteCargaFamiliar || this.cargafamiliarConstantesFunciones.event_dependid_clienteCargaFamiliar) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.cargafamiliar.getid_cliente());
									//this.inicializarActualizarBindingCargaFamiliar(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(cargafamiliar.getCliente()!=null) {
							this.clientesForeignKey.add(cargafamiliar.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.cargafamiliar.getid_cliente(),false,"Formulario");

					//TipoCargaFami
					if(!this.cargafamiliarConstantesFunciones.cargarid_tipo_carga_famiCargaFamiliar || this.cargafamiliarConstantesFunciones.event_dependid_tipo_carga_famiCargaFamiliar) {
						//this.cargarCombosTipoCargaFamisForeignKeyLista(" where id="+this.cargafamiliar.getid_tipo_carga_fami());
									//this.inicializarActualizarBindingCargaFamiliar(false,false);
						this.tipocargafamisForeignKey=new ArrayList<TipoCargaFami>();

						if(cargafamiliar.getTipoCargaFami()!=null) {
							this.tipocargafamisForeignKey.add(cargafamiliar.getTipoCargaFami());
						}

						this.addItemDefectoCombosForeignKeyTipoCargaFami();
						this.cargarCombosFrameTipoCargaFamisForeignKey("Todos");
					}
					this.setActualTipoCargaFamiForeignKey(this.cargafamiliar.getid_tipo_carga_fami(),false,"Formulario");

					//TipoGenero
					if(!this.cargafamiliarConstantesFunciones.cargarid_tipo_generoCargaFamiliar || this.cargafamiliarConstantesFunciones.event_dependid_tipo_generoCargaFamiliar) {
						//this.cargarCombosTipoGenerosForeignKeyLista(" where id="+this.cargafamiliar.getid_tipo_genero());
									//this.inicializarActualizarBindingCargaFamiliar(false,false);
						this.tipogenerosForeignKey=new ArrayList<TipoGenero>();

						if(cargafamiliar.getTipoGenero()!=null) {
							this.tipogenerosForeignKey.add(cargafamiliar.getTipoGenero());
						}

						this.addItemDefectoCombosForeignKeyTipoGenero();
						this.cargarCombosFrameTipoGenerosForeignKey("Todos");
					}
					this.setActualTipoGeneroForeignKey(this.cargafamiliar.getid_tipo_genero(),false,"Formulario");

					//EstadoCivil
					if(!this.cargafamiliarConstantesFunciones.cargarid_estado_civilCargaFamiliar || this.cargafamiliarConstantesFunciones.event_dependid_estado_civilCargaFamiliar) {
						//this.cargarCombosEstadoCivilsForeignKeyLista(" where id="+this.cargafamiliar.getid_estado_civil());
									//this.inicializarActualizarBindingCargaFamiliar(false,false);
						this.estadocivilsForeignKey=new ArrayList<EstadoCivil>();

						if(cargafamiliar.getEstadoCivil()!=null) {
							this.estadocivilsForeignKey.add(cargafamiliar.getEstadoCivil());
						}

						this.addItemDefectoCombosForeignKeyEstadoCivil();
						this.cargarCombosFrameEstadoCivilsForeignKey("Todos");
					}
					this.setActualEstadoCivilForeignKey(this.cargafamiliar.getid_estado_civil(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCargaFamiliar("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCargaFamiliar(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargaFamiliar() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargaFamiliar(CargaFamiliar cargafamiliar) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCargaFamiliar(cargafamiliar,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargaFamiliar(CargaFamiliar cargafamiliar,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCargaFamiliar(cargafamiliar);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCargaFamiliar(cargafamiliar,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar(cargafamiliar);
	}
	
	public void setVariablesObjetoActualToFormularioCargaFamiliar(CargaFamiliar cargafamiliar) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.setText(cargafamiliar.getId().toString());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldcedulaCargaFamiliar.setText(cargafamiliar.getcedula());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextAreaapellidoCargaFamiliar.setText(cargafamiliar.getapellido());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextAreanombreCargaFamiliar.setText(cargafamiliar.getnombre());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextAreadireccionCargaFamiliar.setText(cargafamiliar.getdireccion());
			this.jInternalFrameDetalleFormCargaFamiliar.jDateChooserfecha_nacimientoCargaFamiliar.setDate(cargafamiliar.getfecha_nacimiento());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldvalor_cupoCargaFamiliar.setText(cargafamiliar.getvalor_cupo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CargaFamiliar cargafamiliarLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cargafamiliarLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CargaFamiliar cargafamiliarLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cargafamiliarLocal=this.cargafamiliar;
			} else {
				cargafamiliarLocal=this.cargafamiliarAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cargafamiliarLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCargaFamiliar(cargafamiliarLocal,true);
					
					if(cargafamiliarSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cargafamiliarLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cargafamiliarLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCargaFamiliar(CargaFamiliar cargafamiliar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargaFamiliar(cargafamiliar,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(cargafamiliar);
	}
	
	public void setVariablesFormularioToObjetoActualCargaFamiliar(CargaFamiliar cargafamiliar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargaFamiliar(cargafamiliar,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCargaFamiliar(CargaFamiliar cargafamiliar,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.getText()==null || this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.getText()=="" || this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.getText()=="Id") {
				this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.setText("0");
			}

			if(conColumnasBase) {cargafamiliar.setId(Long.parseLong(this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliarConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelIdCargaFamiliar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar.setcedula(this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldcedulaCargaFamiliar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliarConstantesFunciones.LABEL_CEDULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelcedulaCargaFamiliar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar.setapellido(this.jInternalFrameDetalleFormCargaFamiliar.jTextAreaapellidoCargaFamiliar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliarConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelapellidoCargaFamiliar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar.setnombre(this.jInternalFrameDetalleFormCargaFamiliar.jTextAreanombreCargaFamiliar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliarConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelnombreCargaFamiliar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar.setdireccion(this.jInternalFrameDetalleFormCargaFamiliar.jTextAreadireccionCargaFamiliar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliarConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabeldireccionCargaFamiliar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar.setfecha_nacimiento(this.jInternalFrameDetalleFormCargaFamiliar.jDateChooserfecha_nacimientoCargaFamiliar.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelfecha_nacimientoCargaFamiliar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar.setvalor_cupo(Double.parseDouble(this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldvalor_cupoCargaFamiliar.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliarConstantesFunciones.LABEL_VALORCUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar.jLabelvalor_cupoCargaFamiliar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargaFamiliar(CargaFamiliar cargafamiliarBean,CargaFamiliar cargafamiliar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cargafamiliarBean.getid_cliente()!=null && !cargafamiliarBean.getid_cliente().equals(-1L))) {cargafamiliar.setid_cliente(cargafamiliarBean.getid_cliente());}
			if(conDefault || (!conDefault && cargafamiliarBean.getid_tipo_carga_fami()!=null && !cargafamiliarBean.getid_tipo_carga_fami().equals(-1L))) {cargafamiliar.setid_tipo_carga_fami(cargafamiliarBean.getid_tipo_carga_fami());}
			if(conDefault || (!conDefault && cargafamiliarBean.getid_tipo_genero()!=null && !cargafamiliarBean.getid_tipo_genero().equals(-1L))) {cargafamiliar.setid_tipo_genero(cargafamiliarBean.getid_tipo_genero());}
			if(conDefault || (!conDefault && cargafamiliarBean.getid_estado_civil()!=null && !cargafamiliarBean.getid_estado_civil().equals(-1L))) {cargafamiliar.setid_estado_civil(cargafamiliarBean.getid_estado_civil());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCargaFamiliar(CargaFamiliar cargafamiliarOrigen,CargaFamiliar cargafamiliar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargafamiliarOrigen.getId()!=null && !cargafamiliarOrigen.getId().equals(0L))) {cargafamiliar.setId(cargafamiliarOrigen.getId());}}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getid_cliente()!=null && !cargafamiliarOrigen.getid_cliente().equals(-1L))) {cargafamiliar.setid_cliente(cargafamiliarOrigen.getid_cliente());}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getid_tipo_carga_fami()!=null && !cargafamiliarOrigen.getid_tipo_carga_fami().equals(-1L))) {cargafamiliar.setid_tipo_carga_fami(cargafamiliarOrigen.getid_tipo_carga_fami());}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getid_tipo_genero()!=null && !cargafamiliarOrigen.getid_tipo_genero().equals(-1L))) {cargafamiliar.setid_tipo_genero(cargafamiliarOrigen.getid_tipo_genero());}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getid_estado_civil()!=null && !cargafamiliarOrigen.getid_estado_civil().equals(-1L))) {cargafamiliar.setid_estado_civil(cargafamiliarOrigen.getid_estado_civil());}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getcedula()!=null && !cargafamiliarOrigen.getcedula().equals(""))) {cargafamiliar.setcedula(cargafamiliarOrigen.getcedula());}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getapellido()!=null && !cargafamiliarOrigen.getapellido().equals(""))) {cargafamiliar.setapellido(cargafamiliarOrigen.getapellido());}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getnombre()!=null && !cargafamiliarOrigen.getnombre().equals(""))) {cargafamiliar.setnombre(cargafamiliarOrigen.getnombre());}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getdireccion()!=null && !cargafamiliarOrigen.getdireccion().equals(""))) {cargafamiliar.setdireccion(cargafamiliarOrigen.getdireccion());}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getfecha_nacimiento()!=null && !cargafamiliarOrigen.getfecha_nacimiento().equals(new Date()))) {cargafamiliar.setfecha_nacimiento(cargafamiliarOrigen.getfecha_nacimiento());}
			if(conDefault || (!conDefault && cargafamiliarOrigen.getvalor_cupo()!=null && !cargafamiliarOrigen.getvalor_cupo().equals(0.0))) {cargafamiliar.setvalor_cupo(cargafamiliarOrigen.getvalor_cupo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargaFamiliar(CargaFamiliar cargafamiliar) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.setText(cargafamiliar.getId().toString());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldcedulaCargaFamiliar.setText(cargafamiliar.getcedula());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextAreaapellidoCargaFamiliar.setText(cargafamiliar.getapellido());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextAreanombreCargaFamiliar.setText(cargafamiliar.getnombre());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextAreadireccionCargaFamiliar.setText(cargafamiliar.getdireccion());
			this.jInternalFrameDetalleFormCargaFamiliar.jDateChooserfecha_nacimientoCargaFamiliar.setDate(cargafamiliar.getfecha_nacimiento());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldvalor_cupoCargaFamiliar.setText(cargafamiliar.getvalor_cupo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargaFamiliar(CargaFamiliarBean cargafamiliarBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.setText(cargafamiliarBean.getId().toString());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldcedulaCargaFamiliar.setText(cargafamiliarBean.getcedula());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextAreaapellidoCargaFamiliar.setText(cargafamiliarBean.getapellido());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextAreanombreCargaFamiliar.setText(cargafamiliarBean.getnombre());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextAreadireccionCargaFamiliar.setText(cargafamiliarBean.getdireccion());
			this.jInternalFrameDetalleFormCargaFamiliar.jDateChooserfecha_nacimientoCargaFamiliar.setDate(cargafamiliarBean.getfecha_nacimiento());
			this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldvalor_cupoCargaFamiliar.setText(cargafamiliarBean.getvalor_cupo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCargaFamiliar(CargaFamiliarParameterReturnGeneral cargafamiliarReturnGeneral,CargaFamiliarBean cargafamiliarBean,Boolean conDefault) throws Exception { 
		try {
			CargaFamiliar cargafamiliarLocal=new CargaFamiliar();
			
			cargafamiliarLocal=cargafamiliarReturnGeneral.getCargaFamiliar();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargafamiliarLocal.getId()!=null && !cargafamiliarLocal.getId().equals(0L))) {cargafamiliarBean.setId(cargafamiliarLocal.getId());}}
			if(conDefault || (!conDefault && cargafamiliarLocal.getid_cliente()!=null && !cargafamiliarLocal.getid_cliente().equals(-1L))) {cargafamiliarBean.setid_cliente(cargafamiliarLocal.getid_cliente());}
			if(conDefault || (!conDefault && cargafamiliarLocal.getid_tipo_carga_fami()!=null && !cargafamiliarLocal.getid_tipo_carga_fami().equals(-1L))) {cargafamiliarBean.setid_tipo_carga_fami(cargafamiliarLocal.getid_tipo_carga_fami());}
			if(conDefault || (!conDefault && cargafamiliarLocal.getid_tipo_genero()!=null && !cargafamiliarLocal.getid_tipo_genero().equals(-1L))) {cargafamiliarBean.setid_tipo_genero(cargafamiliarLocal.getid_tipo_genero());}
			if(conDefault || (!conDefault && cargafamiliarLocal.getid_estado_civil()!=null && !cargafamiliarLocal.getid_estado_civil().equals(-1L))) {cargafamiliarBean.setid_estado_civil(cargafamiliarLocal.getid_estado_civil());}
			if(conDefault || (!conDefault && cargafamiliarLocal.getcedula()!=null && !cargafamiliarLocal.getcedula().equals(""))) {cargafamiliarBean.setcedula(cargafamiliarLocal.getcedula());}
			if(conDefault || (!conDefault && cargafamiliarLocal.getapellido()!=null && !cargafamiliarLocal.getapellido().equals(""))) {cargafamiliarBean.setapellido(cargafamiliarLocal.getapellido());}
			if(conDefault || (!conDefault && cargafamiliarLocal.getnombre()!=null && !cargafamiliarLocal.getnombre().equals(""))) {cargafamiliarBean.setnombre(cargafamiliarLocal.getnombre());}
			if(conDefault || (!conDefault && cargafamiliarLocal.getdireccion()!=null && !cargafamiliarLocal.getdireccion().equals(""))) {cargafamiliarBean.setdireccion(cargafamiliarLocal.getdireccion());}
			if(conDefault || (!conDefault && cargafamiliarLocal.getfecha_nacimiento()!=null && !cargafamiliarLocal.getfecha_nacimiento().equals(new Date()))) {cargafamiliarBean.setfecha_nacimiento(cargafamiliarLocal.getfecha_nacimiento());}
			if(conDefault || (!conDefault && cargafamiliarLocal.getvalor_cupo()!=null && !cargafamiliarLocal.getvalor_cupo().equals(0.0))) {cargafamiliarBean.setvalor_cupo(cargafamiliarLocal.getvalor_cupo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCargaFamiliarGenerico(Long idCargaFamiliarSeleccionado,JComboBox jComboBoxCargaFamiliar,List<CargaFamiliar> cargafamiliarsLocal)throws Exception {
		try {
			CargaFamiliar  cargafamiliarTemp=null;

			for(CargaFamiliar cargafamiliarAux:cargafamiliarsLocal) {
				if(cargafamiliarAux.getId()!=null && cargafamiliarAux.getId().equals(idCargaFamiliarSeleccionado)) {
					cargafamiliarTemp=cargafamiliarAux;
					break;
				}
			}

			jComboBoxCargaFamiliar.setSelectedItem(cargafamiliarTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCargaFamiliarGenerico(JComboBox jComboBoxCargaFamiliar,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargaFamiliar.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCargaFamiliar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargaFamiliar.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCargaFamiliar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargafamiliar=(CargaFamiliar) cargafamiliarLogic.getCargaFamiliars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargafamiliar =(CargaFamiliar) cargafamiliars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cargafamiliar.getIsNew() && !cargafamiliar.getIsChanged() && !cargafamiliar.getIsDeleted()) {
				sDescripcion=cargafamiliar.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!cargafamiliar.getIsNew() && !cargafamiliar.getIsChanged() && !cargafamiliar.getIsDeleted()) {
				sDescripcion=cargafamiliar.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoCargaFami")) {
			//sDescripcion=this.getActualTipoCargaFamiForeignKeyDescripcion((Long)value);
			if(!cargafamiliar.getIsNew() && !cargafamiliar.getIsChanged() && !cargafamiliar.getIsDeleted()) {
				sDescripcion=cargafamiliar.gettipocargafami_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCargaFamiForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar.gettipocargafami_descripcion();
			}
		}

		if(sTipo.equals("TipoGenero")) {
			//sDescripcion=this.getActualTipoGeneroForeignKeyDescripcion((Long)value);
			if(!cargafamiliar.getIsNew() && !cargafamiliar.getIsChanged() && !cargafamiliar.getIsDeleted()) {
				sDescripcion=cargafamiliar.gettipogenero_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGeneroForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar.gettipogenero_descripcion();
			}
		}

		if(sTipo.equals("EstadoCivil")) {
			//sDescripcion=this.getActualEstadoCivilForeignKeyDescripcion((Long)value);
			if(!cargafamiliar.getIsNew() && !cargafamiliar.getIsChanged() && !cargafamiliar.getIsDeleted()) {
				sDescripcion=cargafamiliar.getestadocivil_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoCivilForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar.getestadocivil_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CargaFamiliar cargafamiliarRow=new CargaFamiliar();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargafamiliarRow=(CargaFamiliar) cargafamiliarLogic.getCargaFamiliars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargafamiliarRow=(CargaFamiliar) cargafamiliars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCargaFamiliar(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCargaFamiliar.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar && this.isPermisoNuevoCargaFamiliar));			
			this.jButtonDuplicarCargaFamiliar.setVisible((this.isVisibilidadCeldaDuplicarCargaFamiliar && this.isPermisoDuplicarCargaFamiliar));			
			this.jButtonCopiarCargaFamiliar.setVisible((this.isVisibilidadCeldaCopiarCargaFamiliar && this.isPermisoCopiarCargaFamiliar));
			this.jButtonVerFormCargaFamiliar.setVisible((this.isVisibilidadCeldaVerFormCargaFamiliar && this.isPermisoVerFormCargaFamiliar));
			
			this.jButtonAbrirOrderByCargaFamiliar.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar && this.isPermisoOrdenCargaFamiliar));			
			
			this.jButtonNuevoRelacionesCargaFamiliar.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar && this.isPermisoNuevoCargaFamiliar));			
			this.jButtonNuevoGuardarCambiosCargaFamiliar.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar && this.isPermisoNuevoCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));
			
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonModificarCargaFamiliar.setVisible((this.isVisibilidadCeldaModificarCargaFamiliar && this.isPermisoActualizarCargaFamiliar));	
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarCargaFamiliar.setVisible((this.isVisibilidadCeldaActualizarCargaFamiliar && this.isPermisoActualizarCargaFamiliar));	
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarCargaFamiliar.setVisible((this.isVisibilidadCeldaEliminarCargaFamiliar && this.isPermisoEliminarCargaFamiliar));
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarCargaFamiliar.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar);							
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosCargaFamiliar.setVisible((this.isVisibilidadCeldaGuardarCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));			
			
			}
						
			this.jButtonGuardarCambiosTablaCargaFamiliar.setVisible((this.isVisibilidadCeldaGuardarCambiosCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar && this.isPermisoNuevoCargaFamiliar));						
			this.jButtonDuplicarToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaDuplicarCargaFamiliar && this.isPermisoDuplicarCargaFamiliar));						
			this.jButtonCopiarToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaCopiarCargaFamiliar && this.isPermisoCopiarCargaFamiliar));			
			this.jButtonVerFormToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaVerFormCargaFamiliar && this.isPermisoVerFormCargaFamiliar));			
			this.jButtonAbrirOrderByToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar && this.isPermisoOrdenCargaFamiliar));
			this.jButtonNuevoRelacionesToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar && this.isPermisoNuevoCargaFamiliar));			
			this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar && this.isPermisoNuevoCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));			
			
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonModificarToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaModificarCargaFamiliar && this.isPermisoActualizarCargaFamiliar));	
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaActualizarCargaFamiliar  && this.isPermisoActualizarCargaFamiliar));	
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaEliminarCargaFamiliar && this.isPermisoEliminarCargaFamiliar));
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarToolBarCargaFamiliar.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar);				
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaGuardarCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCargaFamiliar.setVisible((this.isVisibilidadCeldaGuardarCambiosCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCargaFamiliar.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar && this.isPermisoNuevoCargaFamiliar));			
			this.jMenuItemDuplicarCargaFamiliar.setVisible((this.isVisibilidadCeldaDuplicarCargaFamiliar && this.isPermisoDuplicarCargaFamiliar));			
			this.jMenuItemCopiarCargaFamiliar.setVisible((this.isVisibilidadCeldaCopiarCargaFamiliar && this.isPermisoCopiarCargaFamiliar));			
			this.jMenuItemVerFormCargaFamiliar.setVisible((this.isVisibilidadCeldaVerFormCargaFamiliar && this.isPermisoVerFormCargaFamiliar));			
			this.jMenuItemAbrirOrderByCargaFamiliar.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar && this.isPermisoOrdenCargaFamiliar));			
			//this.jMenuItemMostrarOcultarCargaFamiliar.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar && this.isPermisoOrdenCargaFamiliar));
			this.jMenuItemDetalleAbrirOrderByCargaFamiliar.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar && this.isPermisoOrdenCargaFamiliar));			
			//this.jMenuItemDetalleMostrarOcultarCargaFamiliar.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar && this.isPermisoOrdenCargaFamiliar));			
			this.jMenuItemNuevoRelacionesCargaFamiliar.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar && this.isPermisoNuevoCargaFamiliar));			
			this.jMenuItemNuevoGuardarCambiosCargaFamiliar.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar && this.isPermisoNuevoCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));									
			
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemModificarCargaFamiliar.setVisible((this.isVisibilidadCeldaModificarCargaFamiliar && this.isPermisoActualizarCargaFamiliar));	
			this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemActualizarCargaFamiliar.setVisible((this.isVisibilidadCeldaActualizarCargaFamiliar && this.isPermisoActualizarCargaFamiliar));	
			this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemEliminarCargaFamiliar.setVisible((this.isVisibilidadCeldaEliminarCargaFamiliar && this.isPermisoEliminarCargaFamiliar));
			this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemCancelarCargaFamiliar.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar);				
			}
			
			this.jMenuItemGuardarCambiosCargaFamiliar.setVisible((this.isVisibilidadCeldaGuardarCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));						
			this.jMenuItemGuardarCambiosTablaCargaFamiliar.setVisible((this.isVisibilidadCeldaGuardarCambiosCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCargaFamiliar=this.jButtonNuevoCargaFamiliar.isVisible();
			this.isVisibilidadCeldaDuplicarCargaFamiliar=this.jButtonDuplicarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaCopiarCargaFamiliar=this.jButtonCopiarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaVerFormCargaFamiliar=this.jButtonVerFormCargaFamiliar.isVisible();
			
			this.isVisibilidadCeldaOrdenCargaFamiliar=this.jButtonAbrirOrderByCargaFamiliar.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=this.jButtonNuevoRelacionesCargaFamiliar.isVisible();
			this.isVisibilidadCeldaModificarCargaFamiliar=this.jButtonModificarCargaFamiliar.isVisible();
			
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			this.isVisibilidadCeldaActualizarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaEliminarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaCancelarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaGuardarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosCargaFamiliar.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=this.jButtonGuardarCambiosTablaCargaFamiliar.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCargaFamiliar=this.jButtonNuevoToolBarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=this.jButtonNuevoRelacionesToolBarCargaFamiliar.isVisible();
			
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			this.isVisibilidadCeldaModificarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jButtonModificarToolBarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaActualizarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarToolBarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaEliminarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarToolBarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaCancelarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarToolBarCargaFamiliar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargaFamiliar=this.jButtonGuardarCambiosToolBarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=this.jButtonGuardarCambiosTablaToolBarCargaFamiliar.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCargaFamiliar=this.jMenuItemNuevoCargaFamiliar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=this.jMenuItemNuevoRelacionesCargaFamiliar.isVisible();
			
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			this.isVisibilidadCeldaModificarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemModificarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaActualizarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemActualizarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaEliminarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemEliminarCargaFamiliar.isVisible();
			this.isVisibilidadCeldaCancelarCargaFamiliar=this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemCancelarCargaFamiliar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargaFamiliar=this.jMenuItemGuardarCambiosCargaFamiliar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=this.jMenuItemGuardarCambiosTablaCargaFamiliar.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCargaFamiliar(Boolean esInicializar) {
		if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {
				//if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCargaFamiliar();
			}
			
			this.inicializarActualizarBindingBotonesManualCargaFamiliar(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCargaFamiliar() {
		this.jButtonNuevoCargaFamiliar.setVisible(this.isPermisoNuevoCargaFamiliar);			
		this.jButtonDuplicarCargaFamiliar.setVisible(this.isPermisoDuplicarCargaFamiliar);			
		this.jButtonCopiarCargaFamiliar.setVisible(this.isPermisoCopiarCargaFamiliar);			
		this.jButtonVerFormCargaFamiliar.setVisible(this.isPermisoVerFormCargaFamiliar);			
		
		this.jButtonAbrirOrderByCargaFamiliar.setVisible(this.isPermisoOrdenCargaFamiliar);					
		
		this.jButtonNuevoRelacionesCargaFamiliar.setVisible(this.isPermisoNuevoCargaFamiliar);			
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonModificarCargaFamiliar.setVisible(this.isPermisoActualizarCargaFamiliar);	
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarCargaFamiliar.setVisible(this.isPermisoActualizarCargaFamiliar);	
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarCargaFamiliar.setVisible(this.isPermisoEliminarCargaFamiliar);
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarCargaFamiliar.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar);						
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosCargaFamiliar.setVisible(this.isPermisoGuardarCambiosCargaFamiliar);							
		}
		
		this.jButtonGuardarCambiosTablaCargaFamiliar.setVisible(this.isPermisoActualizarCargaFamiliar);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCargaFamiliar() {
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonModificarCargaFamiliar.setVisible(this.isPermisoActualizarCargaFamiliar);	
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarCargaFamiliar.setVisible(this.isPermisoActualizarCargaFamiliar);	
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarCargaFamiliar.setVisible(this.isPermisoEliminarCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarCargaFamiliar.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar);							
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosCargaFamiliar.setVisible((this.isVisibilidadCeldaGuardarCargaFamiliar && this.isPermisoGuardarCambiosCargaFamiliar));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCargaFamiliar() {
		if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCargaFamiliar();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCargaFamiliar() {
	}
	
	public void jTableDatosCargaFamiliarListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCargaFamiliar(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cargafamiliar.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCargaFamiliarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cargafamiliarLogic.getConnexion());

				if(this.cargafamiliar.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cargafamiliar.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar=(TitledBorder)this.jScrollPanelDatosCargaFamiliar.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCargaFamiliar.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cargafamiliar.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteCargaFamiliarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCargaFamiliar=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosCargaFamiliar.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCargaFamiliar=(TitledBorder)this.jScrollPanelDatosCargaFamiliar.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCargaFamiliar.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteCargaFamiliarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.cargafamiliarLogic.getConnexion());

				if(this.cargafamiliar.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.cargafamiliar.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar=(TitledBorder)this.jScrollPanelDatosCargaFamiliar.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCargaFamiliar.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.cargafamiliar.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_carga_famiCargaFamiliarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocargafami=true;

			idTienePermisotipocargafami=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar(TipoCargaFamiConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocargafami) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);

				this.tipocargafamiBeanSwingJInternalFrame=new TipoCargaFamiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocargafamiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocargafamiBeanSwingJInternalFrame.getTipoCargaFamiLogic().setConnexion(this.cargafamiliarLogic.getConnexion());

				if(this.cargafamiliar.getid_tipo_carga_fami()!=null) {
					this.tipocargafamiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocargafamiBeanSwingJInternalFrame.setIdActual(this.cargafamiliar.getid_tipo_carga_fami());
					this.tipocargafamiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocargafamiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocargafamiBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCargaFami();
				}

				JInternalFrameBase jinternalFrame =this.tipocargafamiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar=(TitledBorder)this.jScrollPanelDatosCargaFamiliar.getBorder();
				TitledBorder titledBordertipocargafami=(TitledBorder)this.tipocargafamiBeanSwingJInternalFrame.jScrollPanelDatosTipoCargaFami.getBorder();

				titledBordertipocargafami.setTitle(titledBorderCargaFamiliar.getTitle() + " -> Tipo Carga Fami");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_carga_famiCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getid_tipo_carga_fami()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_carga_fami = "+this.cargafamiliar.getid_tipo_carga_fami().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_generoCargaFamiliarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipogenero=true;

			idTienePermisotipogenero=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar(TipoGeneroConstantesFunciones.CLASSNAME);

			if(idTienePermisotipogenero) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);

				this.tipogeneroBeanSwingJInternalFrame=new TipoGeneroBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipogeneroBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipogeneroBeanSwingJInternalFrame.getTipoGeneroLogic().setConnexion(this.cargafamiliarLogic.getConnexion());

				if(this.cargafamiliar.getid_tipo_genero()!=null) {
					this.tipogeneroBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipogeneroBeanSwingJInternalFrame.setIdActual(this.cargafamiliar.getid_tipo_genero());
					this.tipogeneroBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipogeneroBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipogeneroBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoGenero();
				}

				JInternalFrameBase jinternalFrame =this.tipogeneroBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar=(TitledBorder)this.jScrollPanelDatosCargaFamiliar.getBorder();
				TitledBorder titledBordertipogenero=(TitledBorder)this.tipogeneroBeanSwingJInternalFrame.jScrollPanelDatosTipoGenero.getBorder();

				titledBordertipogenero.setTitle(titledBorderCargaFamiliar.getTitle() + " -> Tipo Genero");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_generoCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getid_tipo_genero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_genero = "+this.cargafamiliar.getid_tipo_genero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_civilCargaFamiliarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadocivil=true;

			idTienePermisoestadocivil=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar(EstadoCivilConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadocivil) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);

				this.estadocivilBeanSwingJInternalFrame=new EstadoCivilBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadocivilBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadocivilBeanSwingJInternalFrame.getEstadoCivilLogic().setConnexion(this.cargafamiliarLogic.getConnexion());

				if(this.cargafamiliar.getid_estado_civil()!=null) {
					this.estadocivilBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadocivilBeanSwingJInternalFrame.setIdActual(this.cargafamiliar.getid_estado_civil());
					this.estadocivilBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadocivilBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadocivilBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoCivil();
				}

				JInternalFrameBase jinternalFrame =this.estadocivilBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar=(TitledBorder)this.jScrollPanelDatosCargaFamiliar.getBorder();
				TitledBorder titledBorderestadocivil=(TitledBorder)this.estadocivilBeanSwingJInternalFrame.jScrollPanelDatosEstadoCivil.getBorder();

				titledBorderestadocivil.setTitle(titledBorderCargaFamiliar.getTitle() + " -> Estado Civil");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_civilCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getid_estado_civil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_civil = "+this.cargafamiliar.getid_estado_civil().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncedulaCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getcedula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cedula like '%"+this.cargafamiliar.getcedula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.cargafamiliar.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cargafamiliar.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.cargafamiliar.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_nacimientoCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getfecha_nacimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_nacimiento = '"+Funciones2.getStringPostgresDate(this.cargafamiliar.getfecha_nacimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_cupoCargaFamiliarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.getcargafamiliar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar==null) {
						this.cargafamiliar = new CargaFamiliar();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);
				}

				if(this.cargafamiliar.getvalor_cupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_cupo = "+this.cargafamiliar.getvalor_cupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar(false,false);

			this.getCargaFamiliarsFK_IdCliente();

			this.inicializarActualizarBindingCargaFamiliar(false);

			//if(CargaFamiliarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar(false,false);

			this.getCargaFamiliarsFK_IdEmpresa();

			this.inicializarActualizarBindingCargaFamiliar(false);

			//if(CargaFamiliarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoCivilCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar(false,false);

			this.getCargaFamiliarsFK_IdEstadoCivil();

			this.inicializarActualizarBindingCargaFamiliar(false);

			//if(CargaFamiliarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCargaFamiCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar(false,false);

			this.getCargaFamiliarsFK_IdTipoCargaFami();

			this.inicializarActualizarBindingCargaFamiliar(false);

			//if(CargaFamiliarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoGeneroCargaFamiliarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar(false,false);

			this.getCargaFamiliarsFK_IdTipoGenero();

			this.inicializarActualizarBindingCargaFamiliar(false);

			//if(CargaFamiliarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliarLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCargaFamiliar() {
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
			this.jInternalFrameDetalleFormCargaFamiliar.setVisible(false);	    			
			this.jInternalFrameDetalleFormCargaFamiliar.dispose();
			this.jInternalFrameDetalleFormCargaFamiliar=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCargaFamiliar!=null) {
			this.jInternalFrameReporteDinamicoCargaFamiliar.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCargaFamiliar.dispose();
			this.jInternalFrameReporteDinamicoCargaFamiliar=null;
		}
		
		if(this.jInternalFrameImportacionCargaFamiliar!=null) {
			this.jInternalFrameImportacionCargaFamiliar.setVisible(false);	    			
			this.jInternalFrameImportacionCargaFamiliar.dispose();
			this.jInternalFrameImportacionCargaFamiliar=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCargaFamiliar();
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
			
			if(sTipo.equals("NuevoCargaFamiliar")) {
				jButtonNuevoCargaFamiliarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCargaFamiliar")) {
				jButtonDuplicarCargaFamiliarActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCargaFamiliar")) {
				jButtonCopiarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("VerFormCargaFamiliar")) {
				jButtonVerFormCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCargaFamiliar")) {
				jButtonNuevoCargaFamiliarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCargaFamiliar")) {
				jButtonDuplicarCargaFamiliarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCargaFamiliar")) {
				jButtonNuevoCargaFamiliarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCargaFamiliar")) {
				jButtonDuplicarCargaFamiliarActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCargaFamiliar")) {
				jButtonNuevoCargaFamiliarActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCargaFamiliar")) {
				jButtonNuevoCargaFamiliarActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCargaFamiliar")) {
				jButtonNuevoCargaFamiliarActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCargaFamiliar")) {
				jButtonModificarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCargaFamiliar")) {
				jButtonModificarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCargaFamiliar")) {
				jButtonModificarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCargaFamiliar")) {
				jButtonActualizarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCargaFamiliar")) {
				jButtonActualizarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCargaFamiliar")) {
				jButtonActualizarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("EliminarCargaFamiliar")) {
				jButtonEliminarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCargaFamiliar")) {
				jButtonEliminarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCargaFamiliar")) {
				jButtonEliminarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("CancelarCargaFamiliar")) {
				jButtonCancelarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCargaFamiliar")) {
				jButtonCancelarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCargaFamiliar")) {
				jButtonCancelarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("CerrarCargaFamiliar")) {
				jButtonCerrarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCargaFamiliar")) {
				jButtonCerrarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCargaFamiliar")) {
				jButtonCerrarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCargaFamiliar")) {
				jButtonMostrarOcultarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCargaFamiliar")) {
				jButtonCancelarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCargaFamiliar")) {
				jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCargaFamiliar")) {
				jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCargaFamiliar")) {
				jButtonCopiarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCargaFamiliar")) {
				jButtonVerFormCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCargaFamiliar")) {
				jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCargaFamiliar")) {
				jButtonCopiarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCargaFamiliar")) {
				jButtonVerFormCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCargaFamiliar")) {
				jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCargaFamiliar")) {
				jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCargaFamiliar")) {
				jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCargaFamiliar")) {
				jButtonRecargarInformacionCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCargaFamiliar")) {
				jButtonRecargarInformacionCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCargaFamiliar")) {
				jButtonRecargarInformacionCargaFamiliarActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCargaFamiliar")) {
				jButtonAnterioresCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCargaFamiliar")) {
				jButtonAnterioresCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCargaFamiliar")) {
				jButtonAnterioresCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCargaFamiliar")) {
				jButtonSiguientesCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCargaFamiliar")) {
				jButtonSiguientesCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCargaFamiliar")) {
				jButtonSiguientesCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCargaFamiliar") || sTipo.equals("MenuItemDetalleAbrirOrderByCargaFamiliar")) {
				jButtonAbrirOrderByCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCargaFamiliar") || sTipo.equals("MenuItemDetalleMostrarOcultarCargaFamiliar")) {
				jButtonMostrarOcultarCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCargaFamiliar")) {
				jButtonNuevoGuardarCambiosCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCargaFamiliar")) {
				jButtonNuevoGuardarCambiosCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCargaFamiliar")) {
				jButtonNuevoGuardarCambiosCargaFamiliarActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCargaFamiliar")) {
				jButtonCerrarReporteDinamicoCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCargaFamiliar")) {
				jButtonGenerarReporteDinamicoCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCargaFamiliar")) {
				
				jButtonGenerarExcelReporteDinamicoCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCargaFamiliar")) {
				jButtonCerrarImportacionCargaFamiliarActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCargaFamiliar")) {
				
				jButtonGenerarImportacionCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCargaFamiliar")) {
				
				jButtonAbrirImportacionCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCargaFamiliar")) {
				jComboBoxTiposAccionesCargaFamiliarActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCargaFamiliar")) {
				jComboBoxTiposRelacionesCargaFamiliarActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCargaFamiliar")) {
				jComboBoxTiposAccionesCargaFamiliarActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCargaFamiliar")) {
				
				jComboBoxTiposSeleccionarCargaFamiliarActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCargaFamiliar")) {
				jTextFieldValorCampoGeneralCargaFamiliarActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCargaFamiliar")) {
				jButtonAbrirOrderByCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCargaFamiliar")) {
				jButtonAbrirOrderByCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCargaFamiliar")) {
				jButtonCerrarOrderByCargaFamiliarActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargaFamiliarBusqueda")) {
				this.jButtonidCargaFamiliarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargaFamiliarUpdate")) {
				this.jButtonid_empresaCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargaFamiliarBusqueda")) {
				this.jButtonid_empresaCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCargaFamiliar")) {
				this.jButtonid_clienteCargaFamiliarActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCargaFamiliarUpdate")) {
				this.jButtonid_clienteCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCargaFamiliarBusqueda")) {
				this.jButtonid_clienteCargaFamiliarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_carga_famiCargaFamiliarUpdate")) {
				this.jButtonid_tipo_carga_famiCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_carga_famiCargaFamiliarBusqueda")) {
				this.jButtonid_tipo_carga_famiCargaFamiliarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_generoCargaFamiliarUpdate")) {
				this.jButtonid_tipo_generoCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_generoCargaFamiliarBusqueda")) {
				this.jButtonid_tipo_generoCargaFamiliarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_civilCargaFamiliarUpdate")) {
				this.jButtonid_estado_civilCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_civilCargaFamiliarBusqueda")) {
				this.jButtonid_estado_civilCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaCargaFamiliarBusqueda")) {
				this.jButtoncedulaCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCargaFamiliarBusqueda")) {
				this.jButtonapellidoCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCargaFamiliarBusqueda")) {
				this.jButtonnombreCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionCargaFamiliarBusqueda")) {
				this.jButtondireccionCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoCargaFamiliarBusqueda")) {
				this.jButtonfecha_nacimientoCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_cupoCargaFamiliarBusqueda")) {
				this.jButtonvalor_cupoCargaFamiliarBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteCargaFamiliar")) {
				this.jButtonid_clienteCargaFamiliarActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteCargaFamiliar")) {
				this.jButtonFK_IdClienteCargaFamiliarActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoCivilCargaFamiliar")) {
				this.jButtonFK_IdEstadoCivilCargaFamiliarActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCargaFamiCargaFamiliar")) {
				this.jButtonFK_IdTipoCargaFamiCargaFamiliarActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoGeneroCargaFamiliar")) {
				this.jButtonFK_IdTipoGeneroCargaFamiliarActionPerformed(evt);
			}
			
			;
			
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCargaFamiliar();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				


				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CargaFamiliar cargafamiliarLocal=null;
			
			if(!this.getEsControlTabla()) {
				cargafamiliarLocal=this.cargafamiliar;
			} else {
				cargafamiliarLocal=this.cargafamiliarAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
							
				
				


				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
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
			
			


			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
								
						
				


				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
								
				
				


				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
							
				
				


				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
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
			
			


			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliarActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
								
				
				


				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCargaFamiliar")) {
					jCheckBoxSeleccionarTodosCargaFamiliarItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCargaFamiliar")) {
					jCheckBoxSeleccionadosCargaFamiliarItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCargaFamiliar")) {
					
				}
				
				


				
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
												
				
				


				
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliarActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
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
			
			


			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar);
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
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
				
				


				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliarAnterior =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCargaFamiliar")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCargaFamiliarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCargaFamiliar.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cargafamiliar =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cargafamiliar =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cargafamiliar);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCargaFamiliar")) {
				
				}
				
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCargaFamiliar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCargaFamiliar.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCargaFamiliar")) {
			
			}
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCargaFamiliar();
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
			if(sTipo.equals("NuevoCargaFamiliar")) {
				jButtonNuevoCargaFamiliarActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCargaFamiliar")) {
				jButtonDuplicarCargaFamiliarActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCargaFamiliar")) {
				jButtonCopiarCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCargaFamiliar")) {
				jButtonVerFormCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCargaFamiliar")) {
				jButtonNuevoCargaFamiliarActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCargaFamiliar")) {
				jButtonModificarCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCargaFamiliar")) {
				jButtonActualizarCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCargaFamiliar")) {
				jButtonEliminarCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCargaFamiliar")) {
				jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCargaFamiliar")) {
				jButtonCancelarCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCargaFamiliar")) {
				jButtonCerrarCargaFamiliarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCargaFamiliar")) {
				jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCargaFamiliar")) {
				jButtonNuevoGuardarCambiosCargaFamiliarActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCargaFamiliar")) {
				jButtonAbrirOrderByCargaFamiliarActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCargaFamiliar")) {
				jButtonRecargarInformacionCargaFamiliarActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCargaFamiliar")) {
				jButtonAnterioresCargaFamiliarActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCargaFamiliar")) {
				jButtonSiguientesCargaFamiliarActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargaFamiliarBusqueda")) {
				this.jButtonidCargaFamiliarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargaFamiliarUpdate")) {
				this.jButtonid_empresaCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargaFamiliarBusqueda")) {
				this.jButtonid_empresaCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCargaFamiliar")) {
				this.jButtonid_clienteCargaFamiliarActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCargaFamiliarUpdate")) {
				this.jButtonid_clienteCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCargaFamiliarBusqueda")) {
				this.jButtonid_clienteCargaFamiliarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_carga_famiCargaFamiliarUpdate")) {
				this.jButtonid_tipo_carga_famiCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_carga_famiCargaFamiliarBusqueda")) {
				this.jButtonid_tipo_carga_famiCargaFamiliarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_generoCargaFamiliarUpdate")) {
				this.jButtonid_tipo_generoCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_generoCargaFamiliarBusqueda")) {
				this.jButtonid_tipo_generoCargaFamiliarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_civilCargaFamiliarUpdate")) {
				this.jButtonid_estado_civilCargaFamiliarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_civilCargaFamiliarBusqueda")) {
				this.jButtonid_estado_civilCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaCargaFamiliarBusqueda")) {
				this.jButtoncedulaCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCargaFamiliarBusqueda")) {
				this.jButtonapellidoCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCargaFamiliarBusqueda")) {
				this.jButtonnombreCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionCargaFamiliarBusqueda")) {
				this.jButtondireccionCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoCargaFamiliarBusqueda")) {
				this.jButtonfecha_nacimientoCargaFamiliarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_cupoCargaFamiliarBusqueda")) {
				this.jButtonvalor_cupoCargaFamiliarBusquedaActionPerformed(evt);
			}
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCargaFamiliar();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCargaFamiliar")) {
				closingInternalFrameCargaFamiliar();
				
			} else if(sTipo.equals("jButtonCancelarCargaFamiliar")) {
				JInternalFrameBase jInternalFrameDetalleFormCargaFamiliar = (JInternalFrameBase)evt.getSource();
	            	
	            CargaFamiliarBeanSwingJInternalFrame jInternalFrameParent=(CargaFamiliarBeanSwingJInternalFrame)jInternalFrameDetalleFormCargaFamiliar.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCargaFamiliarActionPerformed(null);
			}
			
			CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargafamiliar,new Object(),this.cargafamiliarParameterGeneral,this.cargafamiliarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCargaFamiliar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCargaFamiliar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCargaFamiliar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cargafamiliar)) {
			if(!esControlTabla) {
				if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);			
				}
				
				if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCargaFamiliar(this.cargafamiliar,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargafamiliarReturnGeneral=cargafamiliarLogic.procesarEventosCargaFamiliarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargafamiliarLogic.getCargaFamiliars(),this.cargafamiliar,this.cargafamiliarParameterGeneral,this.isEsNuevoCargaFamiliar,classes);//this.cargafamiliarLogic.getCargaFamiliar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCargaFamiliar(this.cargafamiliarReturnGeneral,this.cargafamiliarBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCargaFamiliar(classes,this.cargafamiliarReturnGeneral,this.cargafamiliarBean,false);
					}
						
					if(this.cargafamiliarReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar(this.cargafamiliarReturnGeneral.getCargaFamiliar());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCargaFamiliar(this.cargafamiliarReturnGeneral.getCargaFamiliar());	
					}
						
					if(this.cargafamiliarReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCargaFamiliar(this.cargafamiliarReturnGeneral.getCargaFamiliar(),classes);//this.cargafamiliarBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCargaFamiliar(this.cargafamiliar,classes);//this.cargafamiliarBean);									
				}
			
				if(CargaFamiliarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar(this.cargafamiliar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar(this.cargafamiliar);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cargafamiliarAnterior!=null) {
						this.cargafamiliar=this.cargafamiliarAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargafamiliarReturnGeneral=cargafamiliarLogic.procesarEventosCargaFamiliarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargafamiliarLogic.getCargaFamiliars(),this.cargafamiliar,this.cargafamiliarParameterGeneral,this.isEsNuevoCargaFamiliar,classes);//this.cargafamiliarLogic.getCargaFamiliar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargafamiliarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cargafamiliarReturnGeneral.getCargaFamiliar(),cargafamiliarLogic.getCargaFamiliars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cargafamiliarReturnGeneral.getCargaFamiliar(),this.cargafamiliars);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCargaFamiliar.repaint();
				
				//((AbstractTableModel) this.jTableDatosCargaFamiliar.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCargaFamiliar();
			}
		}
	}
	
	public void actualizarVisualTableDatosCargaFamiliar() throws Exception {
		
		CargaFamiliarModel cargafamiliarModel=(CargaFamiliarModel)this.jTableDatosCargaFamiliar.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargafamiliarModel.cargafamiliars=this.cargafamiliarLogic.getCargaFamiliars();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cargafamiliarModel.cargafamiliars=this.cargafamiliars;
		}
		
		
		((CargaFamiliarModel) this.jTableDatosCargaFamiliar.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCargaFamiliar() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcargafamiliarAnterior(),this.cargafamiliarLogic.getCargaFamiliars());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcargafamiliarAnterior(),this.cargafamiliars);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCargaFamiliar();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCargaFamiliar(CargaFamiliar cargafamiliar,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
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
										
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargafamiliar,new Object(),generalEntityParameterGeneral,this.cargafamiliarReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CargaFamiliarConstantesFunciones.getClassesRelationshipsOfCargaFamiliar(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CargaFamiliarConstantesFunciones.getClassesRelationshipsFromStringsOfCargaFamiliar(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCargaFamiliar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CargaFamiliarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargafamiliar,new Object(),generalEntityParameterGeneral,this.cargafamiliarReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCargaFamiliar(CargaFamiliarBean cargafamiliarBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCargaFamiliar(ArrayList<Classe> classes,CargaFamiliarReturnGeneral cargafamiliarReturnGeneral,CargaFamiliarBean cargafamiliarBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCargaFamiliar(CargaFamiliar cargafamiliar,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cargafamiliar)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCargaFamiliar = new CargaFamiliarDetalleFormJInternalFrame(jDesktopPane,this.cargafamiliarSessionBean.getConGuardarRelaciones(),this.cargafamiliarSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.setVisible(false);
		this.jInternalFrameDetalleFormCargaFamiliar.setSelected(false);						
		
		this.jInternalFrameDetalleFormCargaFamiliar.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCargaFamiliar.cargafamiliarLogic=this.cargafamiliarLogic;
		
		this.cargarCombosFrameForeignKeyCargaFamiliar("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCargaFamiliar();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargaFamiliar();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCargaFamiliar("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCargaFamiliar();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCargaFamiliar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargaFamiliar"));
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonModificarCargaFamiliar.addActionListener(new ButtonActionListener(this,"ModificarCargaFamiliar"));

		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonModificarToolBarCargaFamiliar.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargaFamiliar"));
					
		this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemModificarCargaFamiliar.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargaFamiliar"));		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarCargaFamiliar.addActionListener (new ButtonActionListener(this,"ActualizarCargaFamiliar"));
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarToolBarCargaFamiliar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargaFamiliar"));
						
		this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemActualizarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargaFamiliar"));		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarCargaFamiliar.addActionListener (new ButtonActionListener(this,"EliminarCargaFamiliar"));
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargaFamiliar"));
								
		this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemEliminarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargaFamiliar"));		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarCargaFamiliar.addActionListener (new ButtonActionListener(this,"CancelarCargaFamiliar"));
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargaFamiliar"));
					
		this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemCancelarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargaFamiliar"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemDetalleCerrarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargaFamiliar"));		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargaFamiliar"));
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargaFamiliar"));
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargaFamiliar"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonidCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"idCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_empresaCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_empresaCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliarBusqueda"));
		//jButtonid_clienteCargaFamiliar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCargaFamiliarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliar.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_carga_famiCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_generoCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_generoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_estado_civilCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_estado_civilCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtoncedulaCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"cedulaCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonapellidoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonnombreCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtondireccionCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"direccionCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonfecha_nacimientoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonvalor_cupoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"valor_cupoCargaFamiliarBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCargaFamiliar.jTabbedPaneRelacionesCargaFamiliar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargaFamiliar"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCargaFamiliar"));
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargaFamiliar"));
		}
		
		this.jTableDatosCargaFamiliar.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCargaFamiliar"));
		
		this.jTableDatosCargaFamiliar.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCargaFamiliar"));
		
		this.jButtonNuevoCargaFamiliar.addActionListener(new ButtonActionListener(this,"NuevoCargaFamiliar"));
		
		this.jButtonDuplicarCargaFamiliar.addActionListener(new ButtonActionListener(this,"DuplicarCargaFamiliar"));
		
		this.jButtonCopiarCargaFamiliar.addActionListener(new ButtonActionListener(this,"CopiarCargaFamiliar"));
		
		this.jButtonVerFormCargaFamiliar.addActionListener(new ButtonActionListener(this,"VerFormCargaFamiliar"));
		
		
		this.jButtonNuevoToolBarCargaFamiliar.addActionListener(new ButtonActionListener(this,"NuevoToolBarCargaFamiliar"));
			
		this.jButtonDuplicarToolBarCargaFamiliar.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCargaFamiliar"));
			
		this.jMenuItemNuevoCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCargaFamiliar"));
			
		this.jMenuItemDuplicarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCargaFamiliar"));		
		
		
		this.jButtonNuevoRelacionesCargaFamiliar.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCargaFamiliar"));
		
		
		this.jButtonNuevoRelacionesToolBarCargaFamiliar.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCargaFamiliar"));
			
		this.jMenuItemNuevoRelacionesCargaFamiliar.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCargaFamiliar"));		
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonModificarCargaFamiliar.addActionListener(new ButtonActionListener(this,"ModificarCargaFamiliar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonModificarToolBarCargaFamiliar.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargaFamiliar"));
			
			this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemModificarCargaFamiliar.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargaFamiliar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarCargaFamiliar.addActionListener (new ButtonActionListener(this,"ActualizarCargaFamiliar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonActualizarToolBarCargaFamiliar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargaFamiliar"));
				
			this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemActualizarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargaFamiliar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarCargaFamiliar.addActionListener (new ButtonActionListener(this,"EliminarCargaFamiliar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonEliminarToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargaFamiliar"));
						
			this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemEliminarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargaFamiliar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarCargaFamiliar.addActionListener (new ButtonActionListener(this,"CancelarCargaFamiliar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonCancelarToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargaFamiliar"));
			
			this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemCancelarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargaFamiliar"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCargaFamiliar"));		
		
		
		this.jButtonCerrarCargaFamiliar.addActionListener (new ButtonActionListener(this,"CerrarCargaFamiliar"));
		
		
		this.jButtonCerrarToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"CerrarToolBarCargaFamiliar"));
			
		this.jMenuItemCerrarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCargaFamiliar"));
			
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jMenuItemDetalleCerrarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargaFamiliar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosCargaFamiliar.addActionListener (new ButtonActionListener(this,"GuardarCambiosCargaFamiliar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargaFamiliar"));
		}
		
		this.jButtonCopiarToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"CopiarToolBarCargaFamiliar"));
			
		this.jButtonVerFormToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"VerFormToolBarCargaFamiliar"));
		
		this.jMenuItemGuardarCambiosCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCargaFamiliar"));
			
		this.jMenuItemCopiarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCargaFamiliar"));		
		
		this.jMenuItemVerFormCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCargaFamiliar"));		
		
		
		this.jButtonGuardarCambiosTablaCargaFamiliar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargaFamiliar"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCargaFamiliar"));
			
		this.jMenuItemGuardarCambiosTablaCargaFamiliar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargaFamiliar"));		
		
		
		
		this.jButtonRecargarInformacionCargaFamiliar.addActionListener (new ButtonActionListener(this,"RecargarInformacionCargaFamiliar"));
					
		this.jButtonRecargarInformacionToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCargaFamiliar"));
		
		this.jMenuItemRecargarInformacionCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCargaFamiliar"));		
		
		
		
		this.jButtonAnterioresCargaFamiliar.addActionListener (new ButtonActionListener(this,"AnterioresCargaFamiliar"));
		
		
		this.jButtonAnterioresToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCargaFamiliar"));
		
		this.jMenuItemAnterioresCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCargaFamiliar"));		
		
		
		this.jButtonSiguientesCargaFamiliar.addActionListener (new ButtonActionListener(this,"SiguientesCargaFamiliar"));
		
		
		this.jButtonSiguientesToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCargaFamiliar"));
			
		this.jMenuItemSiguientesCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCargaFamiliar"));
			
		this.jMenuItemAbrirOrderByCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCargaFamiliar"));
			
		this.jMenuItemMostrarOcultarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCargaFamiliar"));
			
		this.jMenuItemDetalleAbrirOrderByCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCargaFamiliar"));
			
		this.jMenuItemDetalleMostarOcultarCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCargaFamiliar"));		
		
		
		this.jButtonNuevoGuardarCambiosCargaFamiliar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCargaFamiliar"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCargaFamiliar"));
			
		this.jMenuItemNuevoGuardarCambiosCargaFamiliar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCargaFamiliar"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCargaFamiliar.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCargaFamiliar"));

		this.jCheckBoxSeleccionadosCargaFamiliar.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCargaFamiliar"));
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargaFamiliar"));
		}
		
		
		this.jComboBoxTiposRelacionesCargaFamiliar.addActionListener (new ButtonActionListener(this,"TiposRelacionesCargaFamiliar"));
			
		this.jComboBoxTiposAccionesCargaFamiliar.addActionListener (new ButtonActionListener(this,"TiposAccionesCargaFamiliar"));
					
		this.jComboBoxTiposSeleccionarCargaFamiliar.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCargaFamiliar"));
			
		this.jTextFieldValorCampoGeneralCargaFamiliar.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCargaFamiliar"));		
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonidCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"idCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_empresaCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_empresaCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliarBusqueda"));
		//jButtonid_clienteCargaFamiliar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCargaFamiliarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliar.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_carga_famiCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_generoCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_generoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_estado_civilCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_estado_civilCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtoncedulaCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"cedulaCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonapellidoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonnombreCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtondireccionCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"direccionCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonfecha_nacimientoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonvalor_cupoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"valor_cupoCargaFamiliarBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteCargaFamiliar.addActionListener(new ButtonActionListener(this,"FK_IdClienteCargaFamiliar"));

			this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliar"));

			this.jButtonFK_IdEstadoCivilCargaFamiliar.addActionListener(new ButtonActionListener(this,"FK_IdEstadoCivilCargaFamiliar"));

			this.jButtonFK_IdTipoCargaFamiCargaFamiliar.addActionListener(new ButtonActionListener(this,"FK_IdTipoCargaFamiCargaFamiliar"));

			this.jButtonFK_IdTipoGeneroCargaFamiliar.addActionListener(new ButtonActionListener(this,"FK_IdTipoGeneroCargaFamiliar"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCargaFamiliar!=null) {
				this.jInternalFrameReporteDinamicoCargaFamiliar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargaFamiliar"));
				this.jInternalFrameReporteDinamicoCargaFamiliar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargaFamiliar"));
				this.jInternalFrameReporteDinamicoCargaFamiliar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargaFamiliar"));
			}
			
			//this.jButtonCerrarReporteDinamicoCargaFamiliar.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargaFamiliar"));				
			//this.jButtonGenerarReporteDinamicoCargaFamiliar.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargaFamiliar"));
			//this.jButtonGenerarExcelReporteDinamicoCargaFamiliar.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargaFamiliar"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCargaFamiliar!=null) {
				this.jInternalFrameImportacionCargaFamiliar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargaFamiliar"));
				this.jInternalFrameImportacionCargaFamiliar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargaFamiliar"));
				this.jInternalFrameImportacionCargaFamiliar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargaFamiliar"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCargaFamiliar.addActionListener (new ButtonActionListener(this,"AbrirOrderByCargaFamiliar"));
			
			this.jButtonAbrirOrderByToolBarCargaFamiliar.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCargaFamiliar"));			
			
			if(this.jInternalFrameOrderByCargaFamiliar!=null) {
				this.jInternalFrameOrderByCargaFamiliar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargaFamiliar"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar.jTabbedPaneRelacionesCargaFamiliar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargaFamiliar"));
		
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
            		closingInternalFrameCargaFamiliar();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCargaFamiliar.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCargaFamiliar = (JInternalFrameBase)event.getSource();
	            	
	            CargaFamiliarBeanSwingJInternalFrame jInternalFrameParent=(CargaFamiliarBeanSwingJInternalFrame)jInternalFrameDetalleFormCargaFamiliar.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCargaFamiliarActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCargaFamiliar.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCargaFamiliarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCargaFamiliar.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCargaFamiliar.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCargaFamiliar";
		inputMap = this.jButtonNuevoCargaFamiliar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCargaFamiliar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargaFamiliarActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCargaFamiliar";
		inputMap = this.jButtonNuevoRelacionesCargaFamiliar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCargaFamiliar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargaFamiliarActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCargaFamiliar";
		inputMap = this.jButtonModificarCargaFamiliar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCargaFamiliar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCargaFamiliarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCargaFamiliar";
		inputMap = this.jButtonActualizarCargaFamiliar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCargaFamiliar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCargaFamiliarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCargaFamiliar";
		inputMap = this.jButtonEliminarCargaFamiliar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCargaFamiliar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCargaFamiliarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCargaFamiliar";
		inputMap = this.jButtonCancelarCargaFamiliar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCargaFamiliar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCargaFamiliarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCargaFamiliar";
		inputMap = this.jButtonCerrarCargaFamiliar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCargaFamiliar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCargaFamiliarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCargaFamiliar";
		inputMap = this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosCargaFamiliar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonGuardarCambiosCargaFamiliar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCargaFamiliarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCargaFamiliar.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCargaFamiliarItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCargaFamiliar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCargaFamiliarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCargaFamiliar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCargaFamiliarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCargaFamiliar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCargaFamiliarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonidCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"idCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_empresaCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_empresaCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliarBusqueda"));
		//jButtonid_clienteCargaFamiliar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCargaFamiliarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliar.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_carga_famiCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_generoCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_tipo_generoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_estado_civilCargaFamiliarUpdate.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_estado_civilCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtoncedulaCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"cedulaCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonapellidoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonnombreCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtondireccionCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"direccionCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonfecha_nacimientoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoCargaFamiliarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar.jButtonvalor_cupoCargaFamiliarBusqueda.addActionListener(new ButtonActionListener(this,"valor_cupoCargaFamiliarBusqueda"));
		
		
		this.jButtonFK_IdClienteCargaFamiliar.addActionListener(new ButtonActionListener(this,"FK_IdClienteCargaFamiliar"));

		this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar.addActionListener(new ButtonActionListener(this,"id_clienteCargaFamiliar"));

		this.jButtonFK_IdEstadoCivilCargaFamiliar.addActionListener(new ButtonActionListener(this,"FK_IdEstadoCivilCargaFamiliar"));

		this.jButtonFK_IdTipoCargaFamiCargaFamiliar.addActionListener(new ButtonActionListener(this,"FK_IdTipoCargaFamiCargaFamiliar"));

		this.jButtonFK_IdTipoGeneroCargaFamiliar.addActionListener(new ButtonActionListener(this,"FK_IdTipoGeneroCargaFamiliar"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCargaFamiliar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCargaFamiliarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCargaFamiliarActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCargaFamiliar.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCargaFamiliar(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CargaFamiliar cargafamiliarAux:this.cargafamiliarLogic.getCargaFamiliars()) {
					cargafamiliarAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargaFamiliar cargafamiliarAux:cargafamiliars) {
					cargafamiliarAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCargaFamiliarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargaFamiliar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CargaFamiliar cargafamiliarAux:this.cargafamiliarLogic.getCargaFamiliars()) {
						cargafamiliarAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargaFamiliar cargafamiliarAux:cargafamiliars) {
						cargafamiliarAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CargaFamiliar cargafamiliarAux:this.cargafamiliarLogic.getCargaFamiliars()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargaFamiliar cargafamiliarAux:cargafamiliars) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCargaFamiliar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargaFamiliar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargaFamiliar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCargaFamiliarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargaFamiliar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCargaFamiliar.getSelectedRows();
			
			CargaFamiliar cargafamiliarLocal=new CargaFamiliar();
			
			//this.seleccionarTodosCargaFamiliar(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliarLocal =(CargaFamiliar) this.cargafamiliarLogic.getCargaFamiliars().toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cargafamiliarLocal =(CargaFamiliar) this.cargafamiliars.toArray()[this.jTableDatosCargaFamiliar.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cargafamiliarLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CargaFamiliar cargafamiliarAux:this.cargafamiliarLogic.getCargaFamiliars()) {
						cargafamiliarAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargaFamiliar cargafamiliarAux:cargafamiliars) {
						cargafamiliarAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCargaFamiliar(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargaFamiliar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargaFamiliar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCargaFamiliarItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCargaFamiliarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCargaFamiliarActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCargaFamiliar(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCargaFamiliar.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CargaFamiliar cargafamiliarAux:this.cargafamiliarLogic.getCargaFamiliars()) {
				
						if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							cargafamiliarAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cargafamiliarAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cargafamiliarAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							cargafamiliarAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							cargafamiliarAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_VALORCUPO)) {
							existe=true;
							cargafamiliarAux.setvalor_cupo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargaFamiliar cargafamiliarAux:cargafamiliars) {
					
						if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							cargafamiliarAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cargafamiliarAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cargafamiliarAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							cargafamiliarAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							cargafamiliarAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_VALORCUPO)) {
							existe=true;
							cargafamiliarAux.setvalor_cupo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCargaFamiliar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCargaFamiliarActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCargaFamiliar(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCargaFamiliar=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCargaFamiliar.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCargaFamiliar) {				
					conSplash=true;//false;										
					
					//this.startProcessCargaFamiliar(conSplash);
				
					this.generarReporteCargaFamiliarsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCargaFamiliarsSeleccionados();
				//this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargaFamiliarsSeleccionados(false);
				//this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargaFamiliarsSeleccionados(true);
				//this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargaFamiliar();
				
				this.exportarCargaFamiliarsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCargaFamiliars();
				//this.importarCargaFamiliars();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargaFamiliar();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCargaFamiliarsSeleccionados();
				//this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Carga Familiar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCargaFamiliar();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCargaFamiliar)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCargaFamiliar(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.setSelectedIndex(0);					
				}	
			} 			
			else if(CargaFamiliarBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCargaFamiliar) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCargaFamiliar(conSplash);
					
						//this.actualizarParametrosGeneralCargaFamiliar();
						
						this.generarReporteProcesoAccionCargaFamiliarsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CargaFamiliarBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Carga FamiliarES SELECCIONADOS?", "MANTENIMIENTO DE Carga Familiar", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCargaFamiliar();
				
						this.actualizarParametrosGeneralCargaFamiliar();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cargafamiliarReturnGeneral=cargafamiliarLogic.procesarAccionCargaFamiliarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cargafamiliarLogic.getCargaFamiliars(),this.cargafamiliarParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCargaFamiliarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCargaFamiliar();
					
					CargaFamiliarBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCargaFamiliarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargaFamiliar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxTiposAccionesFormularioCargaFamiliar.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCargaFamiliar(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCargaFamiliarActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCargaFamiliar();
			
			if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();		
			CargaFamiliar cargafamiliar=new CargaFamiliar();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCargaFamiliar(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCargaFamiliar.getSelectedItem();
			
			
			
			
			cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
			//this.sTipoAccion;
			
			if(cargafamiliarsSeleccionados.size()==1) {
				for(CargaFamiliar cargafamiliarAux:cargafamiliarsSeleccionados) {
					cargafamiliar=cargafamiliarAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCargaFamiliar();
			
      		//this.finishProcessCargaFamiliar(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCargaFamiliarReturnGeneral() throws Exception {
		if(this.cargafamiliarReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cargafamiliarReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cargafamiliarReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cargafamiliarReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cargafamiliarReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cargafamiliarReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCargaFamiliar(false);
		}
		
		if(this.cargafamiliarReturnGeneral.getConRetornoLista() || this.cargafamiliarReturnGeneral.getConRetornoObjeto()) {
			if(this.cargafamiliarReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargafamiliarLogic.setCargaFamiliars(this.cargafamiliarReturnGeneral.getCargaFamiliars());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cargafamiliarReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargafamiliarLogic.setCargaFamiliar(this.cargafamiliarReturnGeneral.getCargaFamiliar());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCargaFamiliar(false);
		}
	}
	
	public void actualizarParametrosGeneralCargaFamiliar() throws Exception {
		
		
	}
	
	public ArrayList<CargaFamiliar> getCargaFamiliarsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCargaFamiliar) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CargaFamiliar cargafamiliarAux:cargafamiliarLogic.getCargaFamiliars()) {
					if(cargafamiliarAux.getIsSelected()) {
						cargafamiliarsSeleccionados.add(cargafamiliarAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargaFamiliar cargafamiliarAux:this.cargafamiliars) {
					if(cargafamiliarAux.getIsSelected()) {
						cargafamiliarsSeleccionados.add(cargafamiliarAux);				
					}
				}
			}
			
			if(cargafamiliarsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cargafamiliarsSeleccionados.addAll(this.cargafamiliarLogic.getCargaFamiliars());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cargafamiliarsSeleccionados.addAll(this.cargafamiliars);				
					}
				}
			}
		} else {
			cargafamiliarsSeleccionados.add(this.cargafamiliar);
		}
		
		return cargafamiliarsSeleccionados;
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
	
	public void generarReporteCargaFamiliarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCargaFamiliarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCargaFamiliarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargaFamiliarsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargaFamiliarsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Carga Familiar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCargaFamiliarsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();		
		
		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCargaFamiliars("Todos",cargafamiliarsSeleccionados);
		
	}	
	
	public void generarReporteNormalCargaFamiliarsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();		
		
		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCargaFamiliars("Todos",cargafamiliarsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCargaFamiliarsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();
		
		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCargaFamiliars("Todos",cargafamiliarsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCargaFamiliarsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCargaFamiliar();
		
		
		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCargaFamiliar();
		
		
		//this.generarReporteCargaFamiliars("Todos",cargafamiliarsSeleccionados ,cargafamiliarImplementable,cargafamiliarImplementableHome);
	}
	
	public void mostrarImportacionCargaFamiliars() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCargaFamiliar();
		
		this.abrirFrameImportacionCargaFamiliar();		
		
			
		//this.generarReporteCargaFamiliars("Todos",cargafamiliarsSeleccionados ,cargafamiliarImplementable,cargafamiliarImplementableHome);
	}
	
	public void importarCargaFamiliars() throws Exception {		
	
	}
	
	public void exportarCargaFamiliarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCargaFamiliarsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCargaFamiliarsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCargaFamiliarsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Carga Familiar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCargaFamiliarsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();		
		
		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCargaFamiliar(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CargaFamiliar cargafamiliarAux:cargafamiliarsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCargaFamiliar(cargafamiliarAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cargafamiliarAux.setsDetalleGeneralEntityReporte(cargafamiliarAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCargaFamiliar(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_CEDULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliarConstantesFunciones.LABEL_VALORCUPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCargaFamiliar(CargaFamiliar cargafamiliar,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cargafamiliar.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.gettipocargafami_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.gettipogenero_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getestadocivil_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getcedula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getfecha_nacimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar.getvalor_cupo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCargaFamiliarsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();		
		
		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CargaFamiliars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCargaFamiliar(row);				
				iRow++;
			}				
			
			for(CargaFamiliar cargafamiliarAux:cargafamiliarsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCargaFamiliar(cargafamiliarAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCargaFamiliarsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();		
		
		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cargafamiliars");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cargafamiliar");
			//elementRoot.appendChild(element);
		
			for(CargaFamiliar cargafamiliarAux:cargafamiliarsSeleccionados) {
				element = document.createElement("cargafamiliar");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCargaFamiliar(cargafamiliarAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCargaFamiliar(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_CEDULA);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliarConstantesFunciones.LABEL_VALORCUPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCargaFamiliar(CargaFamiliar cargafamiliar,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.gettipocargafami_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.gettipogenero_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getestadocivil_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getcedula());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getfecha_nacimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar.getvalor_cupo());				
	}
	
	public void setFilaDatosExportarXmlCargaFamiliar(CargaFamiliar cargafamiliar,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CargaFamiliarConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cargafamiliar.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CargaFamiliarConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cargafamiliar.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CargaFamiliarConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cargafamiliar.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(CargaFamiliarConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(cargafamiliar.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipocargafami_descripcion = document.createElement(CargaFamiliarConstantesFunciones.IDTIPOCARGAFAMI);
		elementtipocargafami_descripcion.appendChild(document.createTextNode(cargafamiliar.gettipocargafami_descripcion()));
		element.appendChild(elementtipocargafami_descripcion);

		Element elementtipogenero_descripcion = document.createElement(CargaFamiliarConstantesFunciones.IDTIPOGENERO);
		elementtipogenero_descripcion.appendChild(document.createTextNode(cargafamiliar.gettipogenero_descripcion()));
		element.appendChild(elementtipogenero_descripcion);

		Element elementestadocivil_descripcion = document.createElement(CargaFamiliarConstantesFunciones.IDESTADOCIVIL);
		elementestadocivil_descripcion.appendChild(document.createTextNode(cargafamiliar.getestadocivil_descripcion()));
		element.appendChild(elementestadocivil_descripcion);

		Element elementcedula = document.createElement(CargaFamiliarConstantesFunciones.CEDULA);
		elementcedula.appendChild(document.createTextNode(cargafamiliar.getcedula().trim()));
		element.appendChild(elementcedula);

		Element elementapellido = document.createElement(CargaFamiliarConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(cargafamiliar.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementnombre = document.createElement(CargaFamiliarConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cargafamiliar.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdireccion = document.createElement(CargaFamiliarConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(cargafamiliar.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementfecha_nacimiento = document.createElement(CargaFamiliarConstantesFunciones.FECHANACIMIENTO);
		elementfecha_nacimiento.appendChild(document.createTextNode(cargafamiliar.getfecha_nacimiento().toString().trim()));
		element.appendChild(elementfecha_nacimiento);

		Element elementvalor_cupo = document.createElement(CargaFamiliarConstantesFunciones.VALORCUPO);
		elementvalor_cupo.appendChild(document.createTextNode(cargafamiliar.getvalor_cupo().toString().trim()));
		element.appendChild(elementvalor_cupo);
	}
	
	public void generarReporteGroupGenericoCargaFamiliarsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CargaFamiliar> cargafamiliarsSeleccionados=new ArrayList<CargaFamiliar>();
		
		cargafamiliarsSeleccionados=this.getCargaFamiliarsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCargaFamiliar(cargafamiliarsSeleccionados);
		
		this.generarReporteCargaFamiliars("Todos",cargafamiliarsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCargaFamiliar(ArrayList<CargaFamiliar> cargafamiliarsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CargaFamiliar cargafamiliarAux:cargafamiliarsSeleccionados) {
				cargafamiliarAux.setsDetalleGeneralEntityReporte(cargafamiliarAux.toString());
			
				if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(cargafamiliarAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(cargafamiliarAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(cargafamiliarAux.gettipocargafami_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(cargafamiliarAux.gettipogenero_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(cargafamiliarAux.getestadocivil_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_CEDULA)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(cargafamiliarAux.getcedula());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(cargafamiliarAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(cargafamiliarAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(cargafamiliarAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO)) {
					existe=true;
					cargafamiliarAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cargafamiliarAux.getfecha_nacimiento()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCargaFamiliar(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCargaFamiliar=true;
				this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=true;
				this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=true;
			}
			
			this.isVisibilidadCeldaModificarCargaFamiliar=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar=true;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCargaFamiliar=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=false;
			this.isVisibilidadCeldaModificarCargaFamiliar=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar=true;
			this.isVisibilidadCeldaEliminarCargaFamiliar=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar=true;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCargaFamiliar=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=false;
			this.isVisibilidadCeldaModificarCargaFamiliar=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar=true;
			this.isVisibilidadCeldaEliminarCargaFamiliar=true;
			this.isVisibilidadCeldaCancelarCargaFamiliar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar=true;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCargaFamiliar=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=false;
			this.isVisibilidadCeldaModificarCargaFamiliar=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar=true;
			this.isVisibilidadCeldaEliminarCargaFamiliar=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCargaFamiliar=true;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=true;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=true;
			this.isVisibilidadCeldaModificarCargaFamiliar=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar=true;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCargaFamiliar=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCargaFamiliar=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=false;
			this.isVisibilidadCeldaModificarCargaFamiliar=true;
			this.isVisibilidadCeldaActualizarCargaFamiliar=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CargaFamiliarJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCargaFamiliar=true;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=true;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=true;
		} else {
			this.actualizarEstadoPanelsCargaFamiliar(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCargaFamiliar=false;
			//this.isVisibilidadCeldaVerFormCargaFamiliar=false;
			this.isVisibilidadCeldaDuplicarCargaFamiliar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cargafamiliarSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;
		} else {
			this.isVisibilidadCeldaNuevoCargaFamiliar=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			if(!cargafamiliarSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;												
			}
			
			this.jButtonCerrarCargaFamiliar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar=false;
		}
		
		if(!this.permiteMantenimiento(this.cargafamiliar)) {
			this.isVisibilidadCeldaActualizarCargaFamiliar=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCargaFamiliar() {
	}
	
	public void actualizarEstadoPanelsCargaFamiliar(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCargaFamiliar!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar!=null) {
				this.jScrollPanelDatosCargaFamiliar.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargaFamiliar!=null) {
				this.jPanelPaginacionCargaFamiliar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar!=null) {
				this.jPanelParametrosReportesCargaFamiliar.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCargaFamiliar!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCargaFamiliar!=null) {
				this.jScrollPanelDatosCargaFamiliar.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargaFamiliar!=null) {
				this.jPanelPaginacionCargaFamiliar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar!=null) {
				this.jPanelParametrosReportesCargaFamiliar.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCargaFamiliar!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar!=null) {
				this.jScrollPanelDatosCargaFamiliar.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargaFamiliar!=null) {
				this.jPanelPaginacionCargaFamiliar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar!=null) {
				this.jPanelParametrosReportesCargaFamiliar.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCargaFamiliar!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar!=null) {
				this.jScrollPanelDatosCargaFamiliar.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargaFamiliar!=null) {
				this.jPanelPaginacionCargaFamiliar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar!=null) {
				this.jPanelParametrosReportesCargaFamiliar.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCargaFamiliar!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar!=null) {
				this.jScrollPanelDatosCargaFamiliar.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargaFamiliar!=null) {
				this.jPanelPaginacionCargaFamiliar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar!=null) {
				this.jPanelParametrosReportesCargaFamiliar.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCargaFamiliar!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar!=null) {
				this.jScrollPanelDatosCargaFamiliar.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargaFamiliar!=null) {
				this.jPanelPaginacionCargaFamiliar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar!=null) {
				this.jPanelParametrosReportesCargaFamiliar.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCargaFamiliar!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar!=null) {
				this.jScrollPanelDatosCargaFamiliar.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargaFamiliar!=null) {
				this.jPanelPaginacionCargaFamiliar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar!=null) {
				this.jPanelParametrosReportesCargaFamiliar.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCargaFamiliar!=null) {
					this.jTabbedPaneBusquedasCargaFamiliar.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar!=null) {
				this.jPanelParametrosReportesCargaFamiliar.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar!=null) {
				this.jPanelParametrosReportesCargaFamiliar.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdClienteCargaFamiliar);}

			this.isVisibilidadFK_IdEstadoCivil=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdEstadoCivilCargaFamiliar);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar);}

			this.isVisibilidadFK_IdTipoGenero=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoGeneroCargaFamiliar);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdClienteCargaFamiliar);}

			this.isVisibilidadFK_IdEstadoCivil=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdEstadoCivilCargaFamiliar);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar);}

			this.isVisibilidadFK_IdTipoGenero=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoGeneroCargaFamiliar);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCargaFami(Boolean isParaTipoCargaFami){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCargaFamiNegation=!isParaTipoCargaFami;

			this.isVisibilidadFK_IdCliente=isParaTipoCargaFamiNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdClienteCargaFamiliar);}

			this.isVisibilidadFK_IdEstadoCivil=isParaTipoCargaFamiNegation;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdEstadoCivilCargaFamiliar);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaTipoCargaFami;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar);}

			this.isVisibilidadFK_IdTipoGenero=isParaTipoCargaFamiNegation;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoGeneroCargaFamiliar);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoGenero(Boolean isParaTipoGenero){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoGeneroNegation=!isParaTipoGenero;

			this.isVisibilidadFK_IdCliente=isParaTipoGeneroNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdClienteCargaFamiliar);}

			this.isVisibilidadFK_IdEstadoCivil=isParaTipoGeneroNegation;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdEstadoCivilCargaFamiliar);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaTipoGeneroNegation;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar);}

			this.isVisibilidadFK_IdTipoGenero=isParaTipoGenero;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoGeneroCargaFamiliar);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoCivil(Boolean isParaEstadoCivil){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoCivilNegation=!isParaEstadoCivil;

			this.isVisibilidadFK_IdCliente=isParaEstadoCivilNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdClienteCargaFamiliar);}

			this.isVisibilidadFK_IdEstadoCivil=isParaEstadoCivil;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdEstadoCivilCargaFamiliar);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaEstadoCivilNegation;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar);}

			this.isVisibilidadFK_IdTipoGenero=isParaEstadoCivilNegation;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar.remove(jPanelFK_IdTipoGeneroCargaFamiliar);}
		}
		
	}
	
	
	
	

	public String registrarSesionCargaFamiliarParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(cargafamiliarSessionBean==null) {
				cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(cargafamiliarSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.cargafamiliarFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(CargaFamiliarConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionCargaFamiliar(true);
			//clienteSessionBean.setlidCargaFamiliarActual(this.idCargaFamiliarActual);

			cargafamiliarSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar(true);
			cargafamiliarSessionBean.setlIdCargaFamiliarActualForeignKey(this.idCargaFamiliarActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CargaFamiliarSessionBean cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		
		if(this.cargafamiliarSessionBean==null) {
			this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		}
		
		this.cargafamiliarSessionBean.setsUltimaBusquedaCargaFamiliar(this.getsAccionBusqueda());
		this.cargafamiliarSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cargafamiliarSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			cargafamiliarSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cargafamiliarSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoCivil")) {
			cargafamiliarSessionBean.setid_estado_civil(this.getid_estado_civilFK_IdEstadoCivil());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCargaFami")) {
			cargafamiliarSessionBean.setid_tipo_carga_fami(this.getid_tipo_carga_famiFK_IdTipoCargaFami());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoGenero")) {
			cargafamiliarSessionBean.setid_tipo_genero(this.getid_tipo_generoFK_IdTipoGenero());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CargaFamiliarSessionBean cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		
		if(this.cargafamiliarSessionBean==null) {
			this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		}
		
		if(this.cargafamiliarSessionBean.getsUltimaBusquedaCargaFamiliar()!=null&&!this.cargafamiliarSessionBean.getsUltimaBusquedaCargaFamiliar().equals("")) {
			this.setsAccionBusqueda(cargafamiliarSessionBean.getsUltimaBusquedaCargaFamiliar());
			this.setiNumeroPaginacion(cargafamiliarSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cargafamiliarSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(cargafamiliarSessionBean.getid_cliente());
				cargafamiliarSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cargafamiliarSessionBean.getid_empresa());
				cargafamiliarSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoCivil")) {
				this.setid_estado_civilFK_IdEstadoCivil(cargafamiliarSessionBean.getid_estado_civil());
				cargafamiliarSessionBean.setid_estado_civil(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCargaFami")) {
				this.setid_tipo_carga_famiFK_IdTipoCargaFami(cargafamiliarSessionBean.getid_tipo_carga_fami());
				cargafamiliarSessionBean.setid_tipo_carga_fami(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoGenero")) {
				this.setid_tipo_generoFK_IdTipoGenero(cargafamiliarSessionBean.getid_tipo_genero());
				cargafamiliarSessionBean.setid_tipo_genero(-1L);
			}
		}
		
		this.cargafamiliarSessionBean.setsUltimaBusquedaCargaFamiliar("");
		this.cargafamiliarSessionBean.setiNumeroPaginacion(CargaFamiliarConstantesFunciones.INUMEROPAGINACION);
		this.cargafamiliarSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCargaFamiliar(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCargaFamiliar() {
		this.updateBorderResaltarBusquedasFormularioCargaFamiliar();
		this.updateVisibilidadBusquedasFormularioCargaFamiliar();
		this.updateHabilitarBusquedasFormularioCargaFamiliar();
	}
	
	public void updateBorderResaltarBusquedasFormularioCargaFamiliar() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCargaFamiliar.getComponents().length>0) {
	

		if(this.cargafamiliarConstantesFunciones.resaltarFK_IdClienteCargaFamiliar!=null) {
			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdClienteCargaFamiliar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
				jPanel.setBorder(this.cargafamiliarConstantesFunciones.resaltarFK_IdClienteCargaFamiliar);
			}
		}

		if(this.cargafamiliarConstantesFunciones.resaltarFK_IdEstadoCivilCargaFamiliar!=null) {
			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdEstadoCivilCargaFamiliar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
				jPanel.setBorder(this.cargafamiliarConstantesFunciones.resaltarFK_IdEstadoCivilCargaFamiliar);
			}
		}

		if(this.cargafamiliarConstantesFunciones.resaltarFK_IdTipoCargaFamiCargaFamiliar!=null) {
			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdTipoCargaFamiCargaFamiliar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
				jPanel.setBorder(this.cargafamiliarConstantesFunciones.resaltarFK_IdTipoCargaFamiCargaFamiliar);
			}
		}

		if(this.cargafamiliarConstantesFunciones.resaltarFK_IdTipoGeneroCargaFamiliar!=null) {
			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdTipoGeneroCargaFamiliar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
				jPanel.setBorder(this.cargafamiliarConstantesFunciones.resaltarFK_IdTipoGeneroCargaFamiliar);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCargaFamiliar() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCargaFamiliar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdClienteCargaFamiliar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargafamiliarConstantesFunciones.mostrarFK_IdClienteCargaFamiliar);
			if(!this.cargafamiliarConstantesFunciones.mostrarFK_IdClienteCargaFamiliar && index>-1) {
				this.jTabbedPaneBusquedasCargaFamiliar.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdEstadoCivilCargaFamiliar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargafamiliarConstantesFunciones.mostrarFK_IdEstadoCivilCargaFamiliar);
			if(!this.cargafamiliarConstantesFunciones.mostrarFK_IdEstadoCivilCargaFamiliar && index>-1) {
				this.jTabbedPaneBusquedasCargaFamiliar.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdTipoCargaFamiCargaFamiliar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargafamiliarConstantesFunciones.mostrarFK_IdTipoCargaFamiCargaFamiliar);
			if(!this.cargafamiliarConstantesFunciones.mostrarFK_IdTipoCargaFamiCargaFamiliar && index>-1) {
				this.jTabbedPaneBusquedasCargaFamiliar.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdTipoGeneroCargaFamiliar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargafamiliarConstantesFunciones.mostrarFK_IdTipoGeneroCargaFamiliar);
			if(!this.cargafamiliarConstantesFunciones.mostrarFK_IdTipoGeneroCargaFamiliar && index>-1) {
				this.jTabbedPaneBusquedasCargaFamiliar.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCargaFamiliar() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCargaFamiliar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdClienteCargaFamiliar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargafamiliarConstantesFunciones.activarFK_IdClienteCargaFamiliar);
				this.jTabbedPaneBusquedasCargaFamiliar.setEnabledAt(index,this.cargafamiliarConstantesFunciones.activarFK_IdClienteCargaFamiliar);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdEstadoCivilCargaFamiliar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargafamiliarConstantesFunciones.activarFK_IdEstadoCivilCargaFamiliar);
				this.jTabbedPaneBusquedasCargaFamiliar.setEnabledAt(index,this.cargafamiliarConstantesFunciones.activarFK_IdEstadoCivilCargaFamiliar);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdTipoCargaFamiCargaFamiliar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargafamiliarConstantesFunciones.activarFK_IdTipoCargaFamiCargaFamiliar);
				this.jTabbedPaneBusquedasCargaFamiliar.setEnabledAt(index,this.cargafamiliarConstantesFunciones.activarFK_IdTipoCargaFamiCargaFamiliar);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdTipoGeneroCargaFamiliar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargafamiliarConstantesFunciones.activarFK_IdTipoGeneroCargaFamiliar);
				this.jTabbedPaneBusquedasCargaFamiliar.setEnabledAt(index,this.cargafamiliarConstantesFunciones.activarFK_IdTipoGeneroCargaFamiliar);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCargaFamiliar(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdClienteCargaFamiliar);

			this.jTabbedPaneBusquedasCargaFamiliar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);

			this.cargafamiliarConstantesFunciones.setResaltarFK_IdClienteCargaFamiliar(resaltar);

			jPanel.setBorder(this.cargafamiliarConstantesFunciones.resaltarFK_IdClienteCargaFamiliar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoCivil")) {
			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdEstadoCivilCargaFamiliar);

			this.jTabbedPaneBusquedasCargaFamiliar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);

			this.cargafamiliarConstantesFunciones.setResaltarFK_IdEstadoCivilCargaFamiliar(resaltar);

			jPanel.setBorder(this.cargafamiliarConstantesFunciones.resaltarFK_IdEstadoCivilCargaFamiliar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCargaFami")) {
			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdTipoCargaFamiCargaFamiliar);

			this.jTabbedPaneBusquedasCargaFamiliar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);

			this.cargafamiliarConstantesFunciones.setResaltarFK_IdTipoCargaFamiCargaFamiliar(resaltar);

			jPanel.setBorder(this.cargafamiliarConstantesFunciones.resaltarFK_IdTipoCargaFamiCargaFamiliar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoGenero")) {
			index= this.jTabbedPaneBusquedasCargaFamiliar.indexOfComponent(this.jPanelFK_IdTipoGeneroCargaFamiliar);

			this.jTabbedPaneBusquedasCargaFamiliar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar.getComponent(index);

			this.cargafamiliarConstantesFunciones.setResaltarFK_IdTipoGeneroCargaFamiliar(resaltar);

			jPanel.setBorder(this.cargafamiliarConstantesFunciones.resaltarFK_IdTipoGeneroCargaFamiliar);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCargaFamiliar.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCargaFamiliar() throws Exception {

		if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCargaFamiliar();
		this.updateVisibilidadResaltarControlesFormularioCargaFamiliar();
		this.updateHabilitarResaltarControlesFormularioCargaFamiliar();
		
	}
	
	public void updateBorderResaltarControlesFormularioCargaFamiliar() throws Exception {
		if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cargafamiliarConstantesFunciones.resaltaridCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltaridCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarid_empresaCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarid_empresaCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarid_clienteCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarid_clienteCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarid_tipo_carga_famiCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarid_tipo_carga_famiCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarid_tipo_generoCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarid_tipo_generoCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarid_estado_civilCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarid_estado_civilCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarcedulaCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldcedulaCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarcedulaCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarapellidoCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jTextAreaapellidoCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarapellidoCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarnombreCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jTextAreanombreCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarnombreCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltardireccionCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jTextAreadireccionCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltardireccionCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarfecha_nacimientoCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jDateChooserfecha_nacimientoCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarfecha_nacimientoCargaFamiliar);}
		if(this.cargafamiliarConstantesFunciones.resaltarvalor_cupoCargaFamiliar!=null && this.jInternalFrameDetalleFormCargaFamiliar!=null) {this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldvalor_cupoCargaFamiliar.setBorder(this.cargafamiliarConstantesFunciones.resaltarvalor_cupoCargaFamiliar);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCargaFamiliar() throws Exception {		
		if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
	
		//this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostraridCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelidCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostraridCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_empresaCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelid_empresaCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_empresaCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_clienteCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelid_clienteCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_clienteCargaFamiliar);
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_clienteCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_tipo_carga_famiCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelid_tipo_carga_famiCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_tipo_carga_famiCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_tipo_generoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelid_tipo_generoCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_tipo_generoCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_estado_civilCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelid_estado_civilCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarid_estado_civilCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldcedulaCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarcedulaCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelcedulaCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarcedulaCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jTextAreaapellidoCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarapellidoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelapellidoCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarapellidoCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jTextAreanombreCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarnombreCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelnombreCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarnombreCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jTextAreadireccionCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrardireccionCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPaneldireccionCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrardireccionCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jDateChooserfecha_nacimientoCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarfecha_nacimientoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelfecha_nacimientoCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarfecha_nacimientoCargaFamiliar);
		//this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldvalor_cupoCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarvalor_cupoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jPanelvalor_cupoCargaFamiliar.setVisible(this.cargafamiliarConstantesFunciones.mostrarvalor_cupoCargaFamiliar);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCargaFamiliar() throws Exception {
		if(this.jInternalFrameDetalleFormCargaFamiliar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargaFamiliar!=null) {
	
		this.jInternalFrameDetalleFormCargaFamiliar.jLabelidCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activaridCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_empresaCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarid_empresaCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_clienteCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarid_clienteCargaFamiliar);
			this.jInternalFrameDetalleFormCargaFamiliar.jButtonid_clienteCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarid_clienteCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_carga_famiCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarid_tipo_carga_famiCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_tipo_generoCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarid_tipo_generoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jComboBoxid_estado_civilCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarid_estado_civilCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldcedulaCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarcedulaCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jTextAreaapellidoCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarapellidoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jTextAreanombreCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarnombreCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jTextAreadireccionCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activardireccionCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jDateChooserfecha_nacimientoCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarfecha_nacimientoCargaFamiliar);
		this.jInternalFrameDetalleFormCargaFamiliar.jTextFieldvalor_cupoCargaFamiliar.setEnabled(this.cargafamiliarConstantesFunciones.activarvalor_cupoCargaFamiliar);
		}
	}
	
		
}