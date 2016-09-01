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

import com.bydan.erp.tesoreria.util.TipoBancoConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoBancoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoBancoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoBancoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoBancoBeanSwingJInternalFrame extends TipoBancoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoBancoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoBanco> tipobancoValidator = new ClassValidator<TipoBanco>(TipoBanco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoBanco tipobanco;	
	public TipoBanco tipobancoAux;
	public TipoBanco tipobancoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoBanco tipobancoTotales;
	public Long idTipoBancoActual;
	public Long iIdNuevoTipoBanco=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosBanco=false;

	public Boolean getIsTienePermisosBanco() {
		return isTienePermisosBanco;
	}

	public void setIsTienePermisosBanco(Boolean isTienePermisosBanco) {
		this.isTienePermisosBanco= isTienePermisosBanco;
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
	
	public Boolean isPermisoTodoTipoBanco;
	public Boolean isPermisoNuevoTipoBanco;
	public Boolean isPermisoActualizarTipoBanco;
	public Boolean isPermisoActualizarOriginalTipoBanco;
	public Boolean isPermisoEliminarTipoBanco;
	public Boolean isPermisoGuardarCambiosTipoBanco;
	public Boolean isPermisoConsultaTipoBanco;
	public Boolean isPermisoBusquedaTipoBanco;
	public Boolean isPermisoReporteTipoBanco;
	public Boolean isPermisoPaginacionMedioTipoBanco;
	public Boolean isPermisoPaginacionAltoTipoBanco;
	public Boolean isPermisoPaginacionTodoTipoBanco;
	public Boolean isPermisoCopiarTipoBanco;
	public Boolean isPermisoVerFormTipoBanco;
	public Boolean isPermisoDuplicarTipoBanco;
	public Boolean isPermisoOrdenTipoBanco;
	
	
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
	
	public TipoBancoParameterReturnGeneral tipobancoReturnGeneral;
	public TipoBancoParameterReturnGeneral tipobancoParameterGeneral;
	
	

	public BancoLogic bancoLogic=null;

	public BancoLogic getBancoLogic() {
		return bancoLogic;
	}

	public void setBancoLogic(BancoLogic bancoLogic) {
		this.bancoLogic = bancoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoBanco=false;
	public Boolean esParaAccionDesdeFormularioTipoBanco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoBancoSessionBeanAdditional tipobancoSessionBeanAdditional=null;
	
	public TipoBancoSessionBeanAdditional getTipoBancoSessionBeanAdditional() {
		return this.tipobancoSessionBeanAdditional;
	}
	
	public void setTipoBancoSessionBeanAdditional(TipoBancoSessionBeanAdditional tipobancoSessionBeanAdditional) {
		try {
			this.tipobancoSessionBeanAdditional=tipobancoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoBancoBeanSwingJInternalFrameAdditional tipobancoBeanSwingJInternalFrameAdditional=null;
	//public class TipoBancoBeanSwingJInternalFrame
	
	public TipoBancoBeanSwingJInternalFrameAdditional getTipoBancoBeanSwingJInternalFrameAdditional() {
		return this.tipobancoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoBancoBeanSwingJInternalFrameAdditional(TipoBancoBeanSwingJInternalFrameAdditional tipobancoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipobancoBeanSwingJInternalFrameAdditional=tipobancoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoBancoLogic tipobancoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoBanco tipobancoBean;
	public TipoBancoConstantesFunciones tipobancoConstantesFunciones;
	//public TipoBancoParameterReturnGeneral tipobancoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoBanco> tipobancos;	
	//public List<TipoBanco> tipobancosEliminados;
	//public List<TipoBanco> tipobancosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoBanco=false;
	public Boolean isVisibilidadCeldaDuplicarTipoBanco=true;
	public Boolean isVisibilidadCeldaCopiarTipoBanco=true;
	public Boolean isVisibilidadCeldaVerFormTipoBanco=true;
	public Boolean isVisibilidadCeldaOrdenTipoBanco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoBanco=false;
	public Boolean isVisibilidadCeldaModificarTipoBanco=false;
	public Boolean isVisibilidadCeldaActualizarTipoBanco=false;
	public Boolean isVisibilidadCeldaEliminarTipoBanco=false;
	public Boolean isVisibilidadCeldaCancelarTipoBanco=false;
	public Boolean isVisibilidadCeldaGuardarTipoBanco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoBanco=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoBanco() {
		return this.iIdNuevoTipoBanco;
	}

	public void setiIdNuevoTipoBanco(Long iIdNuevoTipoBanco) {
		this.iIdNuevoTipoBanco = iIdNuevoTipoBanco;
	}
	
	public Long getidTipoBancoActual() {
		return this.idTipoBancoActual;
	}

	public void setidTipoBancoActual(Long idTipoBancoActual) {
		this.idTipoBancoActual = idTipoBancoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoBanco gettipobanco() {
		return this.tipobanco;
	}

	public void settipobanco(TipoBanco tipobanco) {
		this.tipobanco = tipobanco;
	}
	
	public TipoBanco gettipobancoAux() {
		return this.tipobancoAux;
	}

	public void settipobancoAux(TipoBanco tipobancoAux) {
		this.tipobancoAux = tipobancoAux;
	}				
	
	public TipoBanco gettipobancoAnterior() {
		return this.tipobancoAnterior;
	}

	public void settipobancoAnterior(TipoBanco tipobancoAnterior) {
		this.tipobancoAnterior = tipobancoAnterior;
	}	
	
	public TipoBanco gettipobancoTotales() {
		return this.tipobancoTotales;
	}

	public void settipobancoTotales(TipoBanco tipobancoTotales) {
		this.tipobancoTotales = tipobancoTotales;
	}	
	
	public TipoBanco gettipobancoBean() {
		return this.tipobancoBean;
	}

	public void settipobancoBean(TipoBanco tipobancoBean) {
		this.tipobancoBean = tipobancoBean;
	}	
	
	public TipoBancoParameterReturnGeneral gettipobancoReturnGeneral() {
		return this.tipobancoReturnGeneral;
	}

	public void settipobancoReturnGeneral(TipoBancoParameterReturnGeneral tipobancoReturnGeneral) {
		this.tipobancoReturnGeneral = tipobancoReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoBancoLogic getTipoBancoLogic()	{		
		return tipobancoLogic;
	}

	public void setTipoBancoLogic(TipoBancoLogic tipobancoLogic) {
		this.tipobancoLogic = tipobancoLogic;
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
	
	public Boolean getIsEsNuevoTipoBanco() {
		return isEsNuevoTipoBanco;
	}

	public void setIsEsNuevoTipoBanco(Boolean isEsNuevoTipoBanco) {
		this.isEsNuevoTipoBanco = isEsNuevoTipoBanco;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoBanco() {
		return esParaAccionDesdeFormularioTipoBanco;
	}
	
	public void setEsParaAccionDesdeFormularioTipoBanco(Boolean esParaAccionDesdeFormularioTipoBanco) {
		this.esParaAccionDesdeFormularioTipoBanco = esParaAccionDesdeFormularioTipoBanco;
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

			if(this.tipobancoSessionBean==null) {
				this.tipobancoSessionBean=new TipoBancoSessionBean();
			}

			if(!this.tipobancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipobancoSessionBean.getlidEmpresaActual());
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

					if(this.tipobanco!=null) {
						this.tipobanco.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoBanco!=null) {
						this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoBanco.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoBanco!=null) {
						if(this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoBancoGenerico)throws Exception
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
				jComboBoxid_empresaTipoBancoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoBancoGenerico!=null && jComboBoxid_empresaTipoBancoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoBanco tipobanco,JComboBox jComboBoxid_empresaTipoBancoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoBancoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoBancoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipobanco.setid_empresa(empresaAux.getId());
				tipobanco.setempresa_descripcion(TipoBancoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipobanco.setEmpresa(empresaAux);			}
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

					if(!TipoBancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoBanco!=null) { 
							this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoBanco!=null) { 
					}

					if(!TipoBancoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoBanco!=null) {
							this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoBanco!=null) {
							this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoBanco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoBancoConstantesFunciones.refrescarForeignKeysDescripcionesTipoBanco(this.tipobancoLogic.getTipoBancos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoBancoConstantesFunciones.refrescarForeignKeysDescripcionesTipoBanco(this.tipobancos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipobancoLogic.setTipoBancos(this.tipobancos);
			tipobancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoBancoParameterReturnGeneral getTipoBancoParameterGeneral() {
		return this.tipobancoParameterGeneral;
	}
	
	public void setTipoBancoParameterGeneral(TipoBancoParameterReturnGeneral tipobancoParameterGeneral) {
		this.tipobancoParameterGeneral = tipobancoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoBanco() {
		return isPermisoTodoTipoBanco;
	}

	public void setIsPermisoTodoTipoBanco(Boolean isPermisoTodoTipoBanco) {
		this.isPermisoTodoTipoBanco = isPermisoTodoTipoBanco;
	}

	public Boolean getIsPermisoNuevoTipoBanco() {
		return isPermisoNuevoTipoBanco;
	}

	public void setIsPermisoNuevoTipoBanco(Boolean isPermisoNuevoTipoBanco) {
		this.isPermisoNuevoTipoBanco = isPermisoNuevoTipoBanco;
	}

	public Boolean getIsPermisoActualizarTipoBanco() {
		return isPermisoActualizarTipoBanco;
	}

	public void setIsPermisoActualizarTipoBanco(Boolean isPermisoActualizarTipoBanco) {
		this.isPermisoActualizarTipoBanco = isPermisoActualizarTipoBanco;
	}

	public Boolean getIsPermisoEliminarTipoBanco() {
		return isPermisoEliminarTipoBanco;
	}

	public void setIsPermisoEliminarTipoBanco(Boolean isPermisoEliminarTipoBanco) {
		this.isPermisoEliminarTipoBanco = isPermisoEliminarTipoBanco;
	}

	public Boolean getIsPermisoGuardarCambiosTipoBanco() {
		return isPermisoGuardarCambiosTipoBanco;
	}

	public void setIsPermisoGuardarCambiosTipoBanco(Boolean isPermisoGuardarCambiosTipoBanco) {
		this.isPermisoGuardarCambiosTipoBanco = isPermisoGuardarCambiosTipoBanco;
	}
	
	public Boolean getIsPermisoConsultaTipoBanco() {
		return isPermisoConsultaTipoBanco;
	}

	public void setIsPermisoConsultaTipoBanco(Boolean isPermisoConsultaTipoBanco) {
		this.isPermisoConsultaTipoBanco = isPermisoConsultaTipoBanco;
	}

	public Boolean getIsPermisoBusquedaTipoBanco() {
		return isPermisoBusquedaTipoBanco;
	}

	public void setIsPermisoBusquedaTipoBanco(Boolean isPermisoBusquedaTipoBanco) {
		this.isPermisoBusquedaTipoBanco = isPermisoBusquedaTipoBanco;
	}

	public Boolean getIsPermisoReporteTipoBanco() {
		return isPermisoReporteTipoBanco;
	}

	public void setIsPermisoReporteTipoBanco(Boolean isPermisoReporteTipoBanco) {
		this.isPermisoReporteTipoBanco = isPermisoReporteTipoBanco;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoBanco() {
		return isPermisoPaginacionMedioTipoBanco;
	}

	public void setIsPermisoPaginacionMedioTipoBanco(Boolean isPermisoPaginacionMedioTipoBanco) {
		this.isPermisoPaginacionMedioTipoBanco = isPermisoPaginacionMedioTipoBanco;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoBanco() {
		return isPermisoPaginacionTodoTipoBanco;
	}

	public void setIsPermisoPaginacionTodoTipoBanco(Boolean isPermisoPaginacionTodoTipoBanco) {
		this.isPermisoPaginacionTodoTipoBanco = isPermisoPaginacionTodoTipoBanco;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoBanco() {
		return isPermisoPaginacionAltoTipoBanco;
	}

	public void setIsPermisoPaginacionAltoTipoBanco(Boolean isPermisoPaginacionAltoTipoBanco) {
		this.isPermisoPaginacionAltoTipoBanco = isPermisoPaginacionAltoTipoBanco;
	}
	
	public Boolean getIsPermisoCopiarTipoBanco() {
		return isPermisoCopiarTipoBanco;
	}

	public void setIsPermisoCopiarTipoBanco(Boolean isPermisoCopiarTipoBanco) {
		this.isPermisoCopiarTipoBanco = isPermisoCopiarTipoBanco;
	}
	
	public Boolean getIsPermisoVerFormTipoBanco() {
		return isPermisoVerFormTipoBanco;
	}

	public void setIsPermisoVerFormTipoBanco(Boolean isPermisoVerFormTipoBanco) {
		this.isPermisoVerFormTipoBanco = isPermisoVerFormTipoBanco;
	}
	
	public Boolean getIsPermisoDuplicarTipoBanco() {
		return isPermisoDuplicarTipoBanco;
	}

	public void setIsPermisoDuplicarTipoBanco(Boolean isPermisoDuplicarTipoBanco) {
		this.isPermisoDuplicarTipoBanco = isPermisoDuplicarTipoBanco;
	}
	
	public Boolean getIsPermisoOrdenTipoBanco() {
		return isPermisoOrdenTipoBanco;
	}

	public void setIsPermisoOrdenTipoBanco(Boolean isPermisoOrdenTipoBanco) {
		this.isPermisoOrdenTipoBanco = isPermisoOrdenTipoBanco;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoBanco() {
		return isVisibilidadCeldaNuevoTipoBanco;
	}

	public void setIsVisibilidadCeldaNuevoTipoBanco(Boolean isVisibilidadCeldaNuevoTipoBanco) {
		this.isVisibilidadCeldaNuevoTipoBanco = isVisibilidadCeldaNuevoTipoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoBanco() {
		return isVisibilidadCeldaDuplicarTipoBanco;
	}

	public void setIsVisibilidadCeldaDuplicarTipoBanco(Boolean isVisibilidadCeldaDuplicarTipoBanco) {
		this.isVisibilidadCeldaDuplicarTipoBanco = isVisibilidadCeldaDuplicarTipoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoBanco() {
		return isVisibilidadCeldaCopiarTipoBanco;
	}

	public void setIsVisibilidadCeldaCopiarTipoBanco(Boolean isVisibilidadCeldaCopiarTipoBanco) {
		this.isVisibilidadCeldaCopiarTipoBanco = isVisibilidadCeldaCopiarTipoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoBanco() {
		return isVisibilidadCeldaVerFormTipoBanco;
	}

	public void setIsVisibilidadCeldaVerFormTipoBanco(Boolean isVisibilidadCeldaVerFormTipoBanco) {
		this.isVisibilidadCeldaVerFormTipoBanco = isVisibilidadCeldaVerFormTipoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoBanco() {
		return isVisibilidadCeldaOrdenTipoBanco;
	}

	public void setIsVisibilidadCeldaOrdenTipoBanco(Boolean isVisibilidadCeldaOrdenTipoBanco) {
		this.isVisibilidadCeldaOrdenTipoBanco = isVisibilidadCeldaOrdenTipoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoBanco() {
		return isVisibilidadCeldaNuevoRelacionesTipoBanco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoBanco(Boolean isVisibilidadCeldaNuevoRelacionesTipoBanco) {
		this.isVisibilidadCeldaNuevoRelacionesTipoBanco = isVisibilidadCeldaNuevoRelacionesTipoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoBanco() {
		return isVisibilidadCeldaModificarTipoBanco;
	}

	public void setIsVisibilidadCeldaModificarTipoBanco(Boolean isVisibilidadCeldaModificarTipoBanco) {
		this.isVisibilidadCeldaModificarTipoBanco = isVisibilidadCeldaModificarTipoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoBanco() {
		return isVisibilidadCeldaActualizarTipoBanco;
	}

	public void setIsVisibilidadCeldaActualizarTipoBanco(Boolean isVisibilidadCeldaActualizarTipoBanco) {
		this.isVisibilidadCeldaActualizarTipoBanco = isVisibilidadCeldaActualizarTipoBanco;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoBanco() {
		return isVisibilidadCeldaEliminarTipoBanco;
	}

	public void setIsVisibilidadCeldaEliminarTipoBanco(Boolean isVisibilidadCeldaEliminarTipoBanco) {
		this.isVisibilidadCeldaEliminarTipoBanco = isVisibilidadCeldaEliminarTipoBanco;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoBanco() {
		return isVisibilidadCeldaCancelarTipoBanco;
	}

	public void setIsVisibilidadCeldaCancelarTipoBanco(Boolean isVisibilidadCeldaCancelarTipoBanco) {
		this.isVisibilidadCeldaCancelarTipoBanco = isVisibilidadCeldaCancelarTipoBanco;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoBanco() {
		return isVisibilidadCeldaGuardarTipoBanco;
	}

	public void setIsVisibilidadCeldaGuardarTipoBanco(Boolean isVisibilidadCeldaGuardarTipoBanco) {
		this.isVisibilidadCeldaGuardarTipoBanco = isVisibilidadCeldaGuardarTipoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoBanco() {
		return isVisibilidadCeldaGuardarCambiosTipoBanco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoBanco(Boolean isVisibilidadCeldaGuardarCambiosTipoBanco) {
		this.isVisibilidadCeldaGuardarCambiosTipoBanco = isVisibilidadCeldaGuardarCambiosTipoBanco;
	}
		
	public TipoBancoSessionBean gettipobancoSessionBean() {
		return this.tipobancoSessionBean;
	}
	
	public void settipobancoSessionBean(TipoBancoSessionBean tipobancoSessionBean) {
		this.tipobancoSessionBean=tipobancoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoBanco(TipoBanco tipobanco)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipobanco,null);
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
	
	public void bugActualizarReferenciaActual(TipoBanco tipobanco,TipoBanco tipobancoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoBanco(tipobanco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipobancoAux.setId(tipobanco.getId());
		tipobancoAux.setVersionRow(tipobanco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoBanco();
		
			int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipobancoValidator.getInvalidValues(this.tipobanco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipobancoLogic.setDatosCliente(datosCliente);
			tipobancoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipobancoAux=new  TipoBanco();
				
				tipobancoAux.setIsNew(true);
				tipobancoAux.setIsChanged(true);
				
				tipobancoAux.setTipoBancoOriginal(this.tipobanco);
				
				tipobancoAux.setId(this.tipobanco.getId());	
				tipobancoAux.setVersionRow(this.tipobanco.getVersionRow());	
				tipobancoAux.setid_empresa(this.tipobanco.getid_empresa());	
				tipobancoAux.setnombre(this.tipobanco.getnombre());	
				tipobancoAux.setcodigo_sri(this.tipobanco.getcodigo_sri());	
				tipobancoAux.setes_defecto(this.tipobanco.getes_defecto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipobancoAux,tipobancoLogic.getTipoBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoAux,tipobancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipobancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoLogic.saveTipoBancos();//WithConnection
						//tipobancoLogic.getSetVersionRowTipoBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobanco,tipobancoAux);
					
					this.refrescarForeignKeysDescripcionesTipoBanco();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos().addAll(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancos.addAll(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobancoLogic.saveTipoBancoRelaciones(tipobancoAux,this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos());//WithConnection
								//tipobancoLogic.getSetVersionRowTipoBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipobanco,tipobancoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.setBancos(new ArrayList<Banco>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancos= new ArrayList<Banco>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipobancoAux.setBancos(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipobancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipobancoAux,tipobancoLogic.getTipoBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipobancoAux,tipobancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipobanco,tipobancoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipobancoAux=new  TipoBanco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipobancoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipobancoSessionBean.getEsGuardarRelacionado() && this.tipobanco.getId()>=0)) {
						
					tipobancoAux.setIsNew(false);
				}
				
				tipobancoAux.setIsDeleted(false);
			
				tipobancoAux.setId(this.tipobanco.getId());	
				tipobancoAux.setVersionRow(this.tipobanco.getVersionRow());	
				tipobancoAux.setid_empresa(this.tipobanco.getid_empresa());	
				tipobancoAux.setnombre(this.tipobanco.getnombre());	
				tipobancoAux.setcodigo_sri(this.tipobanco.getcodigo_sri());	
				tipobancoAux.setes_defecto(this.tipobanco.getes_defecto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobancoAux,tipobancoLogic.getTipoBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoAux,tipobancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipobancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoLogic.saveTipoBancos();//WithConnection
						//tipobancoLogic.getSetVersionRowTipoBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobanco,tipobancoAux);
					
					this.refrescarForeignKeysDescripcionesTipoBanco();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos().addAll(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancos.addAll(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobancoLogic.saveTipoBancoRelaciones(tipobancoAux,this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos());//WithConnection
								//tipobancoLogic.getSetVersionRowTipoBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipobanco,tipobancoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.setBancos(new ArrayList<Banco>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancos= new ArrayList<Banco>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipobancoAux.setBancos(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipobancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipobancoAux,tipobancoLogic.getTipoBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipobancoAux,tipobancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipobanco,tipobancoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipobancoAux=new  TipoBanco();
				
				tipobancoAux.setIsNew(false);
				tipobancoAux.setIsChanged(false);
				
				tipobancoAux.setIsDeleted(true);
				
				tipobancoAux.setId(this.tipobanco.getId());	
				tipobancoAux.setVersionRow(this.tipobanco.getVersionRow());	
				tipobancoAux.setid_empresa(this.tipobanco.getid_empresa());	
				tipobancoAux.setnombre(this.tipobanco.getnombre());	
				tipobancoAux.setcodigo_sri(this.tipobanco.getcodigo_sri());	
				tipobancoAux.setes_defecto(this.tipobanco.getes_defecto());	
				
				if(this.tipobancoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipobancoAux.getId()>=0) {	
						this.tipobancosEliminados.add(tipobancoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipobancoAux,tipobancoLogic.getTipoBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoAux,tipobancos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipobancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoLogic.saveTipoBancos();//WithConnection
						//tipobancoLogic.getSetVersionRowTipoBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos().addAll(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancos.addAll(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobancoLogic.saveTipoBancoRelaciones(tipobancoAux,this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos());//WithConnection
								//tipobancoLogic.getSetVersionRowTipoBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.setBancos(new ArrayList<Banco>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancos= new ArrayList<Banco>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipobancoAux.setBancos(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipobancoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipobancoAux,tipobancoLogic.getTipoBancos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipobancoAux,tipobancos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.getTipoBancos().addAll(this.tipobancosEliminados);
					
					tipobancoLogic.saveTipoBancos();//WithConnection
					//tipobancoLogic.getSetVersionRowTipoBancos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoBanco();
				
				this.tipobancosEliminados= new ArrayList<TipoBanco>();		
			}
			
			if(this.tipobancoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Banco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipobanco=tipobancoAux;
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
      		//this.finishProcessTipoBanco();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoBanco tipobancoLocal) throws Exception {
		
		if(this.tipobancoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipobancoLocal.setBancos(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos());
			
			} else {
			
				tipobancoLocal.setBancos(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoBanco tipobancoLocal) throws Exception {	
		if(this.tipobancoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipobancoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoBancoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipobancoValidator.getInvalidValues(this.tipobanco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoBanco tipobanco,List<TipoBanco> tipobancos) throws Exception {
		try	{		
			TipoBancoConstantesFunciones.actualizarLista(tipobanco,tipobancos,this.tipobancoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoBanco tipobanco,List<TipoBanco> tipobancos) throws Exception {
		try	{			
			TipoBancoConstantesFunciones.actualizarSelectedLista(tipobanco,tipobancos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoBanco> tipobancosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipobancosLocal=this.tipobancoLogic.getTipoBancos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipobancosLocal=this.tipobancos;
			}
			//ARCHITECTURE
		
			for(TipoBanco tipobancoLocal:tipobancosLocal) {
				if(this.permiteMantenimiento(tipobancoLocal) && tipobancoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoBancoConstantesFunciones.getTipoBancoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoBancoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBanco.jLabelid_empresaTipoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBancoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBanco.jLabelnombreTipoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBancoConstantesFunciones.CODIGOSRI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBanco.jLabelcodigo_sriTipoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBancoConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBanco.jLabeles_defectoTipoBanco,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBanco.jLabelid_empresaTipoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBanco.jLabelnombreTipoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBanco.jLabelcodigo_sriTipoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBanco.jLabeles_defectoTipoBanco,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Banco")) {
			if(this.tipobanco==null) {
				this.tipobanco= new TipoBanco();
			}

			if(this.tipobancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoBanco
				this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);

				this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.getbanco().setTipoBanco(this.tipobanco);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoBanco--;	
		
		
		this.tipobancoAux=new TipoBanco();
		
		this.tipobancoAux.setId(this.iIdNuevoTipoBanco);
		this.tipobancoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobancoLogic.getTipoBancos().add(this.tipobancoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipobancos.add(this.tipobancoAux);
		}
		//ARCHITECTURE
		
		this.tipobanco=this.tipobancoAux;
		
		if(TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoBanco(this.tipobanco);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBanco(this.tipobanco);
		}
				
		//this.setDefaultControlesTipoBanco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoBanco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoBanco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBanco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBanco(this.tipobancoBean,this.tipobanco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoBancoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipobancoSessionBean.getConGuardarRelaciones()) {
			classes=TipoBancoConstantesFunciones.getClassesRelationshipsOfTipoBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipobancoReturnGeneral=tipobancoLogic.procesarEventosTipoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancoLogic.getTipoBancos(),this.tipobanco,this.tipobancoParameterGeneral,this.isEsNuevoTipoBanco,classes);//this.tipobancoLogic.getTipoBanco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoBanco(this.tipobancoReturnGeneral,this.tipobancoBean,false);
		
		if(this.tipobancoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBanco(this.tipobancoReturnGeneral.getTipoBanco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoBanco(this.tipobancoReturnGeneral.getTipoBanco());
		}
		
		if(this.tipobancoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoBanco(this.tipobancoReturnGeneral.getTipoBanco(),classes);//this.tipobancoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoBanco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoBanco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoBancoBeanSwingJInternalFrameAdditional.RecargarFormTipoBanco(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoBanco(false);
						
			if(tipobancoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoSessionBean.getEsGuardarRelacionado() && BancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBancoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBanco();
			}
			
			this.actualizarVisualTableDatosTipoBanco();
			
			this.jTableDatosTipoBanco.setRowSelectionInterval(this.getIndiceNuevoTipoBanco(), this.getIndiceNuevoTipoBanco());
			
			this.seleccionarFilaTablaTipoBancoActual();
						
			this.actualizarEstadoCeldasBotonesTipoBanco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoBanco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoBanco.jTextAreanombreTipoBanco.setEnabled(isHabilitar && this.tipobancoConstantesFunciones.activarnombreTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jTextFieldcodigo_sriTipoBanco.setEnabled(isHabilitar && this.tipobancoConstantesFunciones.activarcodigo_sriTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jCheckBoxes_defectoTipoBanco.setEnabled(isHabilitar && this.tipobancoConstantesFunciones.activares_defectoTipoBanco);	
		//
		this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.setEnabled(isHabilitar && this.tipobancoConstantesFunciones.activarid_empresaTipoBanco);
	};
	
	public void setDefaultControlesTipoBanco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoBanco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipobancoSessionBean.setConGuardarRelaciones(true);			
			this.tipobancoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipobancoSessionBean.setConGuardarRelaciones(false);			
			this.tipobancoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoBanco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBanco tipobancoAux:this.tipobancoLogic.getTipoBancos()) {
				if(tipobancoAux.getId().equals(this.iIdNuevoTipoBanco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBanco tipobancoAux:this.tipobancos) {
				if(tipobancoAux.getId().equals(this.iIdNuevoTipoBanco)) {
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
	
	public int getIndiceActualTipoBanco(TipoBanco tipobanco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBanco tipobancoAux:this.tipobancoLogic.getTipoBancos()) {
				if(tipobancoAux.getId().equals(tipobanco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBanco tipobancoAux:this.tipobancos) {
				if(tipobancoAux.getId().equals(tipobanco.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoBanco(TipoBanco tipobancoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBanco tipobancoAux:this.tipobancoLogic.getTipoBancos()) {
				if(tipobancoAux.getTipoBancoOriginal().getId().equals(tipobancoOriginal.getId())) {
					existe=true;
					tipobancoOriginal.setId(tipobancoAux.getId());
					tipobancoOriginal.setVersionRow(tipobancoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBanco tipobancoAux:this.tipobancos) {
				if(tipobancoAux.getTipoBancoOriginal().getId().equals(tipobancoOriginal.getId())) {
					existe=true;
					tipobancoOriginal.setId(tipobancoAux.getId());
					tipobancoOriginal.setVersionRow(tipobancoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoBanco(Boolean esParaCancelar) throws Exception {
		tipobancosAux=new ArrayList<TipoBanco>();
		tipobancoAux=new TipoBanco();
		
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBanco tipobancoAux:this.tipobancoLogic.getTipoBancos()) {
					if(tipobancoAux.getId()<0) {
						tipobancosAux.add(tipobancoAux);
					}		
				}
				this.iIdNuevoTipoBanco=0L;
				this.tipobancoLogic.getTipoBancos().removeAll(tipobancosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBanco tipobancoAux:this.tipobancos) {
					if(tipobancoAux.getId()<0) {
						tipobancosAux.add(tipobancoAux);
					}		
				}
				this.iIdNuevoTipoBanco=0L;
				this.tipobancos.removeAll(tipobancosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoBanco 
					&& this.tipobancoLogic.getTipoBancos().size()>0
					) {
					tipobancoAux=this.tipobancoLogic.getTipoBancos().get(this.tipobancoLogic.getTipoBancos().size() - 1);
				
					if(tipobancoAux.getId()<0) {
						this.tipobancoLogic.getTipoBancos().remove(tipobancoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoBanco && this.tipobancos.size()>0) {
					tipobancoAux=this.tipobancos.get(this.tipobancos.size() - 1);
				
					if(tipobancoAux.getId()<0) {
						this.tipobancos.remove(tipobancoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoBanco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipobanco.getId()<0) {
				this.tipobancoLogic.getTipoBancos().remove(this.tipobanco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipobanco.getId()<0) {
				this.tipobancos.remove(this.tipobanco);
			}
		}			
	}
	
	public void setEstadosInicialesTipoBanco(List<TipoBanco> tipobancosAux) throws Exception {
		TipoBancoConstantesFunciones.setEstadosInicialesTipoBanco(tipobancosAux);
	}
	
	public void setEstadosInicialesTipoBanco(TipoBanco tipobancoAux) throws Exception {
		TipoBancoConstantesFunciones.setEstadosInicialesTipoBanco(tipobancoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoBancoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoBancoActual()) {
				if(!this.isEsNuevoTipoBanco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoBanco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoBancoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Banco ?", "MANTENIMIENTO DE Tipo Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoBanco tipobanco) throws Exception {
		TipoBancoConstantesFunciones.seleccionarAsignar(this.tipobanco,tipobanco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoBanco=this.isPermisoActualizarOriginalTipoBanco;
			
			
			this.seleccionarAsignar(tipobanco);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoBancoConstantesFunciones.quitarEspaciosTipoBanco(this.tipobanco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipobancoSessionBean.setsFuncionBusquedaRapida(this.tipobancoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoBanco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoBanco(esParaCancelar);				
				this.cancelarNuevoTipoBanco(esParaCancelar);								
			}
			
			this.tipobanco=new TipoBanco();
			
			this.inicializarTipoBanco();
			
			this.actualizarEstadoCeldasBotonesTipoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoBanco() throws Exception {
		try {
			TipoBancoConstantesFunciones.inicializarTipoBanco(this.tipobanco);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipobancoLogic.getTipoBancos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoBancos(String sAccionBusqueda,List<TipoBanco> tipobancosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoBanco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoBancoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoBancoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoBanco"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Bancos");		
		parameters.put("busquedapor", TipoBancoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Banco.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoBancoLogic tipobancoLogicAuxiliar=new TipoBancoLogic();
					tipobancoLogicAuxiliar.setDatosCliente(tipobancoLogic.getDatosCliente());				
					tipobancoLogicAuxiliar.setTipoBancos(tipobancosParaReportes);
					
					tipobancoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoBancoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipobancosParaReportes=tipobancoLogicAuxiliar.getTipoBancos();
					
					//tipobancoLogic.getNewConnexionToDeep();
					
					//for (TipoBanco tipobanco:tipobancosParaReportes) {
					//	tipobancoLogic.deepLoad(tipobanco, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipobancoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipobancoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileBanco = AuxiliarReportes.class.getResourceAsStream("BancoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_banco", reportFileBanco);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoBanco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoBanco=new JRBeanArrayDataSource(TipoBancoJInternalFrame.TraerTipoBancoBeans(tipobancosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoBanco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoBancoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoBancoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoBancoBean.TraerTipoBancoBeans(tipobancosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoBancos(sAccionBusqueda,sTipoArchivoReporte,tipobancosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoBancos(sAccionBusqueda,sTipoArchivoReporte,tipobancosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoBancoActionPerformed(null);
					//this.generarExcelReporteTipoBancos(sAccionBusqueda,sTipoArchivoReporte,tipobancosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoBancos(sAccionBusqueda,sTipoArchivoReporte,tipobancosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoBancos(sAccionBusqueda,sTipoArchivoReporte,tipobancosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoBancos(sAccionBusqueda,sTipoArchivoReporte,tipobancosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBanco> tipobancosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobanco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBanco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoBanco tipobanco : tipobancosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoBancoConstantesFunciones.generarExcelReporteDataTipoBanco("NORMAL",row,workbook,tipobanco,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoBanco(String sTipo,Row row,Workbook workbook) {
		
		TipoBancoConstantesFunciones.generarExcelReporteHeaderTipoBanco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBanco> tipobancosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobanco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoBanco tipobanco : tipobancosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoBancoConstantesFunciones.getTipoBancoDescripcion(tipobanco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobanco.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobanco.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoConstantesFunciones.LABEL_CODIGOSRI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoConstantesFunciones.LABEL_CODIGOSRI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobanco.getcodigo_sri());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipobanco.getes_defecto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBanco> tipobancosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoBanco> tipobancosRespaldo=null;
		
		classes=TipoBancoConstantesFunciones.getClassesRelationshipsOfTipoBanco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipobancoLogic.setDatosCliente(this.datosCliente);
		this.tipobancoLogic.setDatosDeep(this.datosDeep);
		this.tipobancoLogic.setIsConDeep(true);
		
		tipobancosRespaldo=this.tipobancoLogic.getTipoBancos();
		
		this.tipobancoLogic.setTipoBancos(tipobancosParaReportes);	
		this.tipobancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipobancosParaReportes=this.tipobancoLogic.getTipoBancos();
		this.tipobancoLogic.setTipoBancos(tipobancosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobanco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBanco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoBanco tipobanco : tipobancosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoBanco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoBancoConstantesFunciones.generarExcelReporteDataTipoBanco("NORMAL",row,workbook,tipobanco,cellStyleDataAux);
		
			
			


				//Banco
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(BancoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipobanco.getBancos()!=null && tipobanco.getBancos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(BancoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					BancoConstantesFunciones.generarExcelReporteHeaderBanco("RELACIONADO",row,workbook);
				}

				if(tipobanco.getBancos()!=null) {
					i2=0;
					for(Banco banco : tipobanco.getBancos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						BancoConstantesFunciones.generarExcelReporteDataBanco("RELACIONADO",row,workbook,banco,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoBancoConstantesFunciones.getTipoBancoDescripcion(tipobanco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBanco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoBanco() throws Exception {		
		this.startProcessTipoBanco(true);
	}
	
	public void startProcessTipoBanco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoBanco ,this.jPanelParametrosReportesTipoBanco, this.jScrollPanelDatosTipoBanco,this.jPanelPaginacionTipoBanco, this.jScrollPanelDatosEdicionTipoBanco, this.jPanelAccionesTipoBanco,this.jPanelAccionesFormularioTipoBanco,this.jmenuBarTipoBanco,this.jmenuBarDetalleTipoBanco,this.jTtoolBarTipoBanco,this.jTtoolBarDetalleTipoBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBanco=this.jTabbedPaneBusquedasTipoBanco; 
		
		final JPanel jPanelParametrosReportesTipoBanco=this.jPanelParametrosReportesTipoBanco;
		//final JScrollPane jScrollPanelDatosTipoBanco=this.jScrollPanelDatosTipoBanco;
		final JTable jTableDatosTipoBanco=this.jTableDatosTipoBanco;		
		final JPanel jPanelPaginacionTipoBanco=this.jPanelPaginacionTipoBanco;
		//final JScrollPane jScrollPanelDatosEdicionTipoBanco=this.jScrollPanelDatosEdicionTipoBanco;
		final JPanel jPanelAccionesTipoBanco=this.jPanelAccionesTipoBanco;
		
		JPanel jPanelCamposAuxiliarTipoBanco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoBanco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			jPanelCamposAuxiliarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jPanelCamposTipoBanco;
			jPanelAccionesFormularioAuxiliarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jPanelAccionesFormularioTipoBanco;
		}
		
		final JPanel jPanelCamposTipoBanco=jPanelCamposAuxiliarTipoBanco;
		final JPanel jPanelAccionesFormularioTipoBanco=jPanelAccionesFormularioAuxiliarTipoBanco;
		
		
		final JMenuBar jmenuBarTipoBanco=this.jmenuBarTipoBanco;
		final JToolBar jTtoolBarTipoBanco=this.jTtoolBarTipoBanco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBanco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			jmenuBarDetalleAuxiliarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jmenuBarDetalleTipoBanco;
			jTtoolBarDetalleAuxiliarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jTtoolBarDetalleTipoBanco;
		}
		
		final JMenuBar jmenuBarDetalleTipoBanco=jmenuBarDetalleAuxiliarTipoBanco;
		final JToolBar jTtoolBarDetalleTipoBanco=jTtoolBarDetalleAuxiliarTipoBanco;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBanco;
			processRunnable.jTableDatos=jTableDatosTipoBanco;
			processRunnable.jPanelCampos=jPanelCamposTipoBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBanco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBanco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBanco;
			processRunnable.jTtoolBar=jTtoolBarTipoBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoBanco ,jPanelParametrosReportesTipoBanco,jTableDatosTipoBanco, /*jScrollPanelDatosTipoBanco,*/jPanelCamposTipoBanco,jPanelPaginacionTipoBanco, /*jScrollPanelDatosEdicionTipoBanco,*/ jPanelAccionesTipoBanco,jPanelAccionesFormularioTipoBanco,jmenuBarTipoBanco,jmenuBarDetalleTipoBanco,jTtoolBarTipoBanco,jTtoolBarDetalleTipoBanco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoBanco ,jPanelParametrosReportesTipoBanco, jScrollPanelDatosTipoBanco,jPanelPaginacionTipoBanco, jScrollPanelDatosEdicionTipoBanco, jPanelAccionesTipoBanco,jPanelAccionesFormularioTipoBanco,jmenuBarTipoBanco,jmenuBarDetalleTipoBanco,jTtoolBarTipoBanco,jTtoolBarDetalleTipoBanco);
						
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
	
	public void finishProcessTipoBanco() {// throws Exception 
		this.finishProcessTipoBanco(true);
	}
	
	public void finishProcessTipoBanco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoBanco ,this.jPanelParametrosReportesTipoBanco, this.jScrollPanelDatosTipoBanco,this.jPanelPaginacionTipoBanco, this.jScrollPanelDatosEdicionTipoBanco, this.jPanelAccionesTipoBanco,this.jPanelAccionesFormularioTipoBanco,this.jmenuBarTipoBanco,this.jmenuBarDetalleTipoBanco,this.jTtoolBarTipoBanco,this.jTtoolBarDetalleTipoBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBanco=this.jTabbedPaneBusquedasTipoBanco; 
		
		final JPanel jPanelParametrosReportesTipoBanco=this.jPanelParametrosReportesTipoBanco;
		//final JScrollPane jScrollPanelDatosTipoBanco=this.jScrollPanelDatosTipoBanco;
		final JTable jTableDatosTipoBanco=this.jTableDatosTipoBanco;		
		final JPanel jPanelPaginacionTipoBanco=this.jPanelPaginacionTipoBanco;
		//final JScrollPane jScrollPanelDatosEdicionTipoBanco=this.jScrollPanelDatosEdicionTipoBanco;
		final JPanel jPanelAccionesTipoBanco=this.jPanelAccionesTipoBanco;
		
		JPanel jPanelCamposAuxiliarTipoBanco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoBanco=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			jPanelCamposAuxiliarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jPanelCamposTipoBanco;
			jPanelAccionesFormularioAuxiliarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jPanelAccionesFormularioTipoBanco;
		}
		
		final JPanel jPanelCamposTipoBanco=jPanelCamposAuxiliarTipoBanco;
		final JPanel jPanelAccionesFormularioTipoBanco=jPanelAccionesFormularioAuxiliarTipoBanco;
		
		
		final JMenuBar jmenuBarTipoBanco=this.jmenuBarTipoBanco;		
		final JToolBar jTtoolBarTipoBanco=this.jTtoolBarTipoBanco;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBanco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			jmenuBarDetalleAuxiliarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jmenuBarDetalleTipoBanco;
			jTtoolBarDetalleAuxiliarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jTtoolBarDetalleTipoBanco;		
		}
		
		final JMenuBar jmenuBarDetalleTipoBanco=jmenuBarDetalleAuxiliarTipoBanco;
		final JToolBar jTtoolBarDetalleTipoBanco=jTtoolBarDetalleAuxiliarTipoBanco;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBanco;
			processRunnable.jTableDatos=jTableDatosTipoBanco;
			processRunnable.jPanelCampos=jPanelCamposTipoBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBanco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBanco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBanco;
			processRunnable.jTtoolBar=jTtoolBarTipoBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoBanco ,jPanelParametrosReportesTipoBanco, jTableDatosTipoBanco,/*jScrollPanelDatosTipoBanco,*/jPanelCamposTipoBanco,jPanelPaginacionTipoBanco, /*jScrollPanelDatosEdicionTipoBanco,*/ jPanelAccionesTipoBanco,jPanelAccionesFormularioTipoBanco,jmenuBarTipoBanco,jmenuBarDetalleTipoBanco,jTtoolBarTipoBanco,jTtoolBarDetalleTipoBanco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoBanco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoBanco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoBanco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoBanco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoBanco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipobancoConstantesFunciones.getsFinalQueryTipoBanco();
		String  finalQueryPaginacionTodos=this.tipobancoConstantesFunciones.getsFinalQueryTipoBanco();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoBancoConstantesFunciones.getArrayColumnasGlobalesNoTipoBanco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoBancoConstantesFunciones.getArrayColumnasGlobalesTipoBanco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoBancoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipobancosEliminados= new ArrayList<TipoBanco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoBanco();
		
				///*TipoBancoSessionBean*/this.tipobancoSessionBean=new TipoBancoSessionBean();
			
			if(this.tipobancoSessionBean==null) {
				this.tipobancoSessionBean=new TipoBancoSessionBean();
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
					this.iNumeroPaginacion=TipoBancoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoBancoConstantesFunciones.getClassesForeignKeysOfTipoBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipobanco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipobancosAux= new ArrayList<TipoBanco>();
			
				
			tipobancoLogic.setDatosCliente(this.datosCliente);
			tipobancoLogic.setDatosDeep(this.datosDeep);
			tipobancoLogic.setIsConDeep(true);
			
			
			tipobancoLogic.getTipoBancoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipobancoLogic.getTodosTipoBancos(finalQueryGlobal,pagination);
					
					//tipobancoLogic.getTodosTipoBancosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipobancoLogic.getTipoBancos()==null|| tipobancoLogic.getTipoBancos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancosAux= new ArrayList<TipoBanco>();
							tipobancosAux.addAll(tipobancoLogic.getTipoBancos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancosAux= new ArrayList<TipoBanco>();
							tipobancosAux.addAll(tipobancos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancoLogic.getTodosTipoBancos(finalQueryGlobal+"",this.pagination);												
							
							//tipobancoLogic.getTodosTipoBancosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoBancos("Todos",tipobancoLogic.getTipoBancos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancoLogic.setTipoBancos(new ArrayList<TipoBanco>());					
							tipobancoLogic.getTipoBancos().addAll(tipobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancos=new ArrayList<TipoBanco>();
							tipobancos.addAll(tipobancosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoBanco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoBanco=this.idActual;
				
				} else if(this.idTipoBancoActual!=null && this.idTipoBancoActual!=0L) {
					idTipoBanco=idTipoBancoActual;
				}
				
					
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndicePorId(idTipoBanco);
				
				this.tipobancos=new ArrayList<TipoBanco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipobancoLogic.getEntity(idTipoBanco);
					
					//tipobancoLogic.getEntityWithConnection(idTipoBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoLogic.setTipoBancos(new ArrayList<TipoBanco>());
					tipobancoLogic.getTipoBancos().add(tipobancoLogic.getTipoBanco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobancos=new ArrayList<TipoBanco>();
					this.tipobancos.add(tipobanco);
				}
				
				if(tipobancoLogic.getTipoBanco()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipobancoLogic.getTipoBancosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipobancoLogic.getTipoBancos()==null||tipobancoLogic.getTipoBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipobancos==null|| tipobancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancosAux=new ArrayList<TipoBanco>();
						tipobancosAux.addAll(tipobancoLogic.getTipoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancosAux=new ArrayList<TipoBanco>();
							tipobancosAux.addAll(tipobancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipobancoLogic.getTipoBancosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoBancos("BusquedaPorNombre",tipobancoLogic.getTipoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoBancos("BusquedaPorNombre",tipobancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoLogic.setTipoBancos(new ArrayList<TipoBanco>());
						tipobancoLogic.getTipoBancos().addAll(tipobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancos=new ArrayList<TipoBanco>();
							tipobancos.addAll(tipobancosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipobancoLogic.getTipoBancosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipobancoLogic.getTipoBancos()==null||tipobancoLogic.getTipoBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipobancos==null|| tipobancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancosAux=new ArrayList<TipoBanco>();
						tipobancosAux.addAll(tipobancoLogic.getTipoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancosAux=new ArrayList<TipoBanco>();
							tipobancosAux.addAll(tipobancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipobancoLogic.getTipoBancosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoBancos("FK_IdEmpresa",tipobancoLogic.getTipoBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoBancos("FK_IdEmpresa",tipobancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoLogic.setTipoBancos(new ArrayList<TipoBanco>());
						tipobancoLogic.getTipoBancos().addAll(tipobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancos=new ArrayList<TipoBanco>();
							tipobancos.addAll(tipobancosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoBanco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoBanco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobancoLogic.getTipoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobancoLogic.getTipoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoBanco tipobanco) {
		Boolean permite=true;
		
		if(this.tipobanco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoBancoConstantesFunciones.getOrderByListaTipoBanco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoBancoConstantesFunciones.getOrderByListaTipoBanco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBanco tipobanco:tipobancoLogic.getTipoBancos()) {
				if(tipobanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoTotales=tipobanco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBanco tipobanco:this.tipobancos) {
				if(tipobanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoTotales=tipobanco;
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
			this.tipobancoAux=new TipoBanco();
			this.tipobancoAux.setsType(Constantes2.S_TOTALES);
			this.tipobancoAux.setIsNew(false);
			this.tipobancoAux.setIsChanged(false);
			this.tipobancoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoBancoConstantesFunciones.TotalizarValoresFilaTipoBanco(this.tipobancoLogic.getTipoBancos(),this.tipobancoAux);
				
				this.tipobancoLogic.getTipoBancos().add(this.tipobancoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoBancoConstantesFunciones.TotalizarValoresFilaTipoBanco(this.tipobancos,this.tipobancoAux);
				
				this.tipobancos.add(this.tipobancoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipobancoTotales=new TipoBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobancoLogic.getTipoBancos().remove(tipobancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobancos.remove(tipobancoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipobancoTotales=new TipoBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBanco tipobanco:tipobancoLogic.getTipoBancos()) {
				if(tipobanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoTotales=tipobanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBancoConstantesFunciones.TotalizarValoresFilaTipoBanco(this.tipobancoLogic.getTipoBancos(),tipobancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBanco tipobanco:this.tipobancos) {
				if(tipobanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoTotales=tipobanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBancoConstantesFunciones.TotalizarValoresFilaTipoBanco(this.tipobancos,tipobancoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoBancosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoBancosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoBancoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoBancosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoLogic.getTipoBancosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoBancosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoLogic.getTipoBancosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoBancoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoLogic.getTipoBancoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoBanco() {
		this.isPermisoTodoTipoBanco=false;
		this.isPermisoNuevoTipoBanco=false;
		this.isPermisoActualizarTipoBanco=false;
		this.isPermisoActualizarOriginalTipoBanco=false;
		this.isPermisoEliminarTipoBanco=false;
		this.isPermisoGuardarCambiosTipoBanco=false;
		this.isPermisoConsultaTipoBanco=false;
		this.isPermisoBusquedaTipoBanco=false;
		this.isPermisoReporteTipoBanco=false;		
		this.isPermisoOrdenTipoBanco=false;		
		this.isPermisoPaginacionMedioTipoBanco=false;		
		this.isPermisoPaginacionAltoTipoBanco=false;
		this.isPermisoPaginacionTodoTipoBanco=false;
		this.isPermisoCopiarTipoBanco=false;		
		this.isPermisoVerFormTipoBanco=false;		
		this.isPermisoDuplicarTipoBanco=false;		
		this.isPermisoOrdenTipoBanco=false;		
	}
	
	public void setPermisosUsuarioTipoBanco(Boolean isPermiso) {
		this.isPermisoTodoTipoBanco=isPermiso;
		this.isPermisoNuevoTipoBanco=isPermiso;
		this.isPermisoActualizarTipoBanco=isPermiso;
		this.isPermisoActualizarOriginalTipoBanco=isPermiso;
		this.isPermisoEliminarTipoBanco=isPermiso;
		this.isPermisoGuardarCambiosTipoBanco=isPermiso;
		this.isPermisoConsultaTipoBanco=isPermiso;
		this.isPermisoBusquedaTipoBanco=isPermiso;
		this.isPermisoReporteTipoBanco=isPermiso;
		this.isPermisoOrdenTipoBanco=isPermiso;		
		this.isPermisoPaginacionMedioTipoBanco=isPermiso;		
		this.isPermisoPaginacionAltoTipoBanco=isPermiso;		
		this.isPermisoPaginacionTodoTipoBanco=isPermiso;		
		this.isPermisoCopiarTipoBanco=isPermiso;		
		this.isPermisoVerFormTipoBanco=isPermiso;		
		this.isPermisoDuplicarTipoBanco=isPermiso;
		this.isPermisoOrdenTipoBanco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoBanco(Boolean isPermiso) {
		//this.isPermisoTodoTipoBanco=isPermiso;
		this.isPermisoNuevoTipoBanco=isPermiso;
		this.isPermisoActualizarTipoBanco=isPermiso;
		this.isPermisoActualizarOriginalTipoBanco=isPermiso;
		this.isPermisoEliminarTipoBanco=isPermiso;
		this.isPermisoGuardarCambiosTipoBanco=isPermiso;
		//this.isPermisoConsultaTipoBanco=isPermiso;
		//this.isPermisoBusquedaTipoBanco=isPermiso;
		//this.isPermisoReporteTipoBanco=isPermiso;
		//this.isPermisoOrdenTipoBanco=isPermiso;		
		//this.isPermisoPaginacionMedioTipoBanco=isPermiso;		
		//this.isPermisoPaginacionAltoTipoBanco=isPermiso;		
		//this.isPermisoPaginacionTodoTipoBanco=isPermiso;		
		//this.isPermisoCopiarTipoBanco=isPermiso;		
		//this.isPermisoDuplicarTipoBanco=isPermiso;
		//this.isPermisoOrdenTipoBanco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoBancoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(BancoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosBanco=false;
		this.isTienePermisosBanco=this.verificarGetPermisosUsuarioOpcionTipoBancoClaseRelacionada(this.opcionsRelacionadas,BancoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoBanco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoBancoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosBanco=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoBancoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoBancoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoBancoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosBanco && this.jInternalFrameDetalleFormTipoBanco!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.remove(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoBanco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipobancoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoBancoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoBanco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoBanco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoBanco=this.isPermisoActualizarTipoBanco;
			this.isPermisoEliminarTipoBanco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoBanco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoBanco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoBanco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoBanco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoBanco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoBanco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoBanco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoBanco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoBanco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoBanco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoBanco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipobancoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoBanco.setToolTipText(this.jTableDatosTipoBanco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoBanco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoBanco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoBanco() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosBanco && this.tipobancoConstantesFunciones.mostrarBancoTipoBanco && !TipoBancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Banco");
			reporte.setsDescripcion("Banco");
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
	public void inicializarCombosForeignKeyTipoBancoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoBancoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoBancoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoBancoParameterReturnGeneral tipobancoReturnGeneral=new TipoBancoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipobancoConstantesFunciones.cargarid_empresaTipoBanco)
					 || (this.esRecargarFks && this.tipobancoConstantesFunciones.cargarid_empresaTipoBanco)) {

					if(!this.tipobancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipobancoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipobancoReturnGeneral=tipobancoLogic.cargarCombosLoteForeignKeyTipoBanco(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipobancoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoBanco()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipobancoSessionBean==null) {
				this.tipobancoSessionBean=new TipoBancoSessionBean();
			}

			if(!this.tipobancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoBanco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBanco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoBanco(TipoBanco tipobanco)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoBanco(TipoBanco tipobanco,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoBanco()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBanco()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoBanco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoBanco()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoBanco()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco!=null && this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoBancoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoBancoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoBancoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipobancoSessionBean=new TipoBancoSessionBean(); 
		this.tipobancoConstantesFunciones=new TipoBancoConstantesFunciones(); 
		this.tipobancoBean=new TipoBanco();//(this.tipobancoConstantesFunciones); 		
		this.tipobancoReturnGeneral=new TipoBancoParameterReturnGeneral(); 
		
		this.tipobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoBanco(true);
			
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
			
			this.tipobancoConstantesFunciones=new TipoBancoConstantesFunciones(); 
			this.tipobancoBean=new TipoBanco();//this.tipobancoConstantesFunciones); 			
			this.tipobancoReturnGeneral=new TipoBancoParameterReturnGeneral(); 
		
			TipoBancoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Banco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipobanco=new TipoBanco();
			this.tipobancos = new ArrayList<TipoBanco>();
			this.tipobancosAux = new ArrayList<TipoBanco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic=new TipoBancoLogic();
				this.tipobancoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoBanco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBanco);	
					}
					
					if(this.jInternalFrameImportacionTipoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBanco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoBanco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoBanco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBanco);
				this.jInternalFrameDetalleFormTipoBanco.setVisible(false);
				this.jInternalFrameDetalleFormTipoBanco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBanco);
					this.jInternalFrameReporteDinamicoTipoBanco.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoBanco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoBanco);
					this.jInternalFrameImportacionTipoBanco.setVisible(false);
					this.jInternalFrameImportacionTipoBanco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoBanco);
					this.jInternalFrameOrderByTipoBanco.setVisible(false);
					this.jInternalFrameOrderByTipoBanco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoBancoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoBancoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipobancoReturnGeneral=new TipoBancoParameterReturnGeneral();
			
			this.tipobancoParameterGeneral=new TipoBancoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipobancoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipobancoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(BancoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobancoSessionBean.getEsGuardarRelacionado(),this.tipobancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobancoSessionBean.getEsGuardarRelacionado(),this.tipobancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoBanco=false;
			this.isVisibilidadCeldaDuplicarTipoBanco=true;
			this.isVisibilidadCeldaCopiarTipoBanco=true;
			this.isVisibilidadCeldaVerFormTipoBanco=true;
			this.isVisibilidadCeldaOrdenTipoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=false;
			this.isVisibilidadCeldaModificarTipoBanco=false;
			this.isVisibilidadCeldaActualizarTipoBanco=false;
			this.isVisibilidadCeldaEliminarTipoBanco=false;
			this.isVisibilidadCeldaCancelarTipoBanco=false;
			this.isVisibilidadCeldaGuardarTipoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoBanco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoBanco(false);
			
			this.setPermisosUsuarioTipoBanco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipobancoSessionBean.getEsGuardarRelacionado() && this.tipobancoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoBancoClasesRelacionadas();
			}
			
			if(this.tipobancoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoBancoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoBanco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoBanco();
			}
			
			if(!this.isPermisoBusquedaTipoBanco) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoBanco.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoBanco,this.isPermisoPaginacionMedioTipoBanco,this.isPermisoPaginacionTodoTipoBanco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoBancoConstantesFunciones.getTiposSeleccionarTipoBanco());
				
				this.tiposColumnasSelect=TipoBancoConstantesFunciones.getTiposSeleccionarTipoBanco(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoBanco();				
				//this.tiposRelacionesSelect=TipoBancoConstantesFunciones.getTiposRelacionesTipoBanco(true);
				
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
			//if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoBanco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoBanco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoBanco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBanco() ;
			
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
			
			
			this.bancoLogic=new BancoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipobancoImplementable= (TipoBancoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipobancoImplementableHome= (TipoBancoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipobancos= new ArrayList<TipoBanco>();
			this.tipobancosEliminados= new ArrayList<TipoBanco>();
						
			this.isEsNuevoTipoBanco=false;
			this.esParaAccionDesdeFormularioTipoBanco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoBanco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoBanco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoBancoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoBancoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoBanco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoBanco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoBanco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoBanco();
			}
			
			TipoBancoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoBanco.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoBanco.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoBanco.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoBanco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoBanco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoBanco() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(BancoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(BancoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoBanco")) {
				iIndex=this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();	
				
				

				if(sTitle.equals("Bancos")) {
					if(!BancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoBanco();

						this.cargarParteTabPanelRelacionadaBanco(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoBanco();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaBanco(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoBanco.cargarSessionConBeanSwingJInternalFrameBanco(false,true,iIndex);
		this.jButtonBancoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaBanco();

		//this.jTabbedPaneRelacionesTipoBanco.updateUI();
		//this.jTabbedPaneRelacionesTipoBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoBanco.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Banco")) {
				int row=this.jTableDatosTipoBanco.getSelectedRow();
				jButtonBancoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Banco")) {

					if(this.isTienePermisosBanco && this.tipobancoConstantesFunciones.mostrarBancoTipoBanco && !TipoBancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Bancos"+"("+BancoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Bancos");

						if(tipobancoConstantesFunciones.resaltarBancoTipoBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipobancoConstantesFunciones.resaltarBancoTipoBanco);
						}

						jmenuItem.setEnabled(this.tipobancoConstantesFunciones.activarBancoTipoBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Banco"));

						

						this.jInternalFrameDetalleFormTipoBanco.jmenuDetalleTipoBanco.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoBanco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoBanco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoBancoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoBanco();
		
		this.cargarCombosFrameForeignKeyTipoBanco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoBanco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoBanco();
		}
	}
	
	
	
	public void jButtonNuevoTipoBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipobancoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
			
			if(jTableDatosTipoBanco.getRowCount()>=1) {
				jTableDatosTipoBanco.removeRowSelectionInterval(0, jTableDatosTipoBanco.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoBanco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoBanco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoBanco(true);			
			//this.tipobanco=new TipoBanco();
			//this.tipobanco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBanco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBanco() ;
			
			if(TipoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBanco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipobanco);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);				
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
			if(this.tipobancoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoBanco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoBanco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoBanco.getSelectedRows().length;			
			}
			
			tipobancosSeleccionados=this.getTipoBancosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoBanco--;			
				//TipoBanco tipobancoAux= new TipoBanco();			
				//tipobancoAux.setId(this.iIdNuevoTipoBanco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoBanco tipobancoOrigen=new TipoBanco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoBanco tipobancoOrigen : tipobancosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipobancoOrigen =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoOrigen =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoBanco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipobanco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoBanco(tipobancoOrigen,this.tipobanco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobancoLogic.getTipoBancos().add(this.tipobancoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobancos.add(this.tipobancoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoBanco(false);
				
				this.jTableDatosTipoBanco.setRowSelectionInterval(this.getIndiceNuevoTipoBanco(), this.getIndiceNuevoTipoBanco());
				
				int iLastRow =  this.jTableDatosTipoBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBanco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();									
		
			TipoBanco tipobancoOrigen=new TipoBanco();
			TipoBanco tipobancoDestino=new TipoBanco();
				
			tipobancosSeleccionados=this.getTipoBancosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoBanco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipobancosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoBanco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoOrigen =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobancoOrigen =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoDestino =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobancoDestino =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipobancoOrigen =tipobancosSeleccionados.get(0);
				tipobancoDestino =tipobancosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoBanco(tipobancoOrigen,tipobancoDestino,true,false);
				
				tipobancoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobancoDestino,tipobancoLogic.getTipoBancos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoDestino,tipobancos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoBanco(false);
				
				//this.jTableDatosTipoBanco.setRowSelectionInterval(this.getIndiceNuevoTipoBanco(), this.getIndiceNuevoTipoBanco());
				
				int iLastRow =  this.jTableDatosTipoBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBanco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoBanco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoBanco.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoBanco.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoBanco.setVisible(!isVisible);
			this.jPanelPaginacionTipoBanco.setVisible(!isVisible);
			this.jPanelAccionesTipoBanco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoBanco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoBanco();
			
			this.abrirFrameOrderByTipoBanco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoBanco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBanco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoBanco.isMaximum()) {
					this.jInternalFrameDetalleFormTipoBanco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoBanco.setSize(this.jInternalFrameDetalleFormTipoBanco.iWidthFormulario,this.jInternalFrameDetalleFormTipoBanco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoBanco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoBanco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoBanco.isMaximum()) {
						this.jInternalFrameDetalleFormTipoBanco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoBanco.jContentPaneDetalleTipoBanco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoBanco.jContentPaneDetalleTipoBanco.getWidth(),TipoBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoBanco.jContentPaneDetalleTipoBanco.getWidth(),TipoBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoBanco.jContentPaneDetalleTipoBanco.getWidth(),TipoBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(BancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaBanco();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoBanco.setVisible(true);
	        this.jInternalFrameDetalleFormTipoBanco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoBanco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBanco,false,this);
				} else {
					this.jInternalFrameOrderByTipoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBanco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoBanco);
				this.jInternalFrameOrderByTipoBanco.setVisible(false);
				this.jInternalFrameOrderByTipoBanco.setSelected(false);
				
				this.jInternalFrameOrderByTipoBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBanco"));
				
				this.inicializarActualizarBindingTablaOrderByTipoBanco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoBanco==null) {
				
				this.jInternalFrameImportacionTipoBanco=new ImportacionJInternalFrame(TipoBancoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBanco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoBanco);
				this.jInternalFrameImportacionTipoBanco.setVisible(false);
				this.jInternalFrameImportacionTipoBanco.setSelected(false);


				this.jInternalFrameImportacionTipoBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBanco"));
				this.jInternalFrameImportacionTipoBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBanco"));
				this.jInternalFrameImportacionTipoBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBanco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoBanco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoBanco==null) {
				this.jInternalFrameReporteDinamicoTipoBanco=new ReporteDinamicoJInternalFrame(TipoBancoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBanco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBanco);
				this.jInternalFrameReporteDinamicoTipoBanco.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoBanco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBanco"));
				this.jInternalFrameReporteDinamicoTipoBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBanco"));
				this.jInternalFrameReporteDinamicoTipoBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBanco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBanco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaBanco() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoBanco.jContentPaneDetalleTipoBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoBanco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBanco);
			
	       	this.jInternalFrameDetalleFormTipoBanco.setVisible(false);
	        this.jInternalFrameDetalleFormTipoBanco.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoBanco.dispose();
			//this.jInternalFrameDetalleFormTipoBanco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoBanco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoBanco.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoBanco.setVisible(true);
	        this.jInternalFrameImportacionTipoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoBanco.setVisible(true);
	        this.jInternalFrameOrderByTipoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoBanco.setVisible(false);
	        this.jInternalFrameOrderByTipoBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoBanco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoBanco.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoBanco.setVisible(false);
	        this.jInternalFrameImportacionTipoBanco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoBanco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoBanco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoBanco(true);
			//this.isEsNuevoTipoBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBanco(false) ;
			
			if(tipobancoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoSessionBean.getEsGuardarRelacionado() && BancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBancoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBanco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoBancoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoBanco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoBanco(true);
			//this.isEsNuevoTipoBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipobanco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoBanco(false) ;
			
			if(TipoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBanco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoBanco(false);
			
			//if(!this.isEsNuevoTipoBanco) {								
				int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
				
			}
			
			if(this.permiteMantenimiento(this.tipobanco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoBanco=true;
					this.inicializarActualizarBindingTablaTipoBanco(false);
					this.isEsNuevoTipoBanco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoBanco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoBanco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBanco(false);
				
				this.habilitarDeshabilitarControlesTipoBanco(false);
			
												
				
				if(TipoBancoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoBanco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoBancoActionPerformed(evt,tipobancoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoBanco(this.tipobanco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoBanco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipobancoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipobanco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				this.tipobanco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				this.tipobanco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipobanco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoBancoModel) this.jTableDatosTipoBanco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoBanco=true;
				this.inicializarActualizarBindingTablaTipoBanco(false);
				this.isEsNuevoTipoBanco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBanco(false);
				
				this.habilitarDeshabilitarControlesTipoBanco(false);
				
				
				
				if(TipoBancoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoBanco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoBancoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoBanco.getRowCount()>=1) {
				jTableDatosTipoBanco.removeRowSelectionInterval(0, jTableDatosTipoBanco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoBanco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoBanco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBanco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBanco(false) ;
			
			this.isEsNuevoTipoBanco=false;
			
			if(TipoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoBanco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoBanco(false);
				
				//SI ES MANUAL
				if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoBanco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoBanco--;			
			//TipoBanco tipobancoAux= new TipoBanco();			
			//tipobancoAux.setId(this.iIdNuevoTipoBanco);
			
			if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoBanco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
			
			this.tipobanco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipobancoLogic.getTipoBancos().add(this.tipobancoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipobancos.add(this.tipobancoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoBanco(false);
			
			this.jTableDatosTipoBanco.setRowSelectionInterval(this.getIndiceNuevoTipoBanco(), this.getIndiceNuevoTipoBanco());
			
			int iLastRow =  this.jTableDatosTipoBanco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoBanco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoBanco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoBanco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoBanco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBanco(false);
			
			//SI ES MANUAL
			if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBanco();
			}
			
			//this.abrirFrameTreeTipoBanco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo BancoS ?", "MANTENIMIENTO DE Tipo Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoBanco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoBanco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipobancoReturnGeneral=tipobancoLogic.procesarImportacionTipoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipobancoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoBancoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoBanco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoBanco.setFileImportacion(this.jInternalFrameImportacionTipoBanco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoBanco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoBanco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoBanco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoBanco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();		

		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoBancoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoBancoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoBancos("Todos",tipobancosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBancoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBancoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBancoConstantesFunciones.LABEL_CODIGOSRI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSri_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSri_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSri_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSri_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBancoConstantesFunciones.LABEL_ESDEFECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Defecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Defecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Defecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Defecto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoBanco.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoBancoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoBancoConstantesFunciones.LABEL_CODIGOSRI:
					sNombreCampoCategoria="codigo_sri";
					break;

				case TipoBancoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoBancoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoBancoConstantesFunciones.LABEL_CODIGOSRI:
					sNombreCampoCategoriaValor="codigo_sri";
					break;

				case TipoBancoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBancoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoBancoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoBancoConstantesFunciones.LABEL_CODIGOSRI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sri",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sri");
					break;

				case TipoBancoConstantesFunciones.LABEL_ESDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_defecto");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoBancoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();		
		
		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobanco";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoBancoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoBanco tipobanco:tipobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobanco.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBancoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoBanco tipobanco:tipobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobanco.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBancoConstantesFunciones.LABEL_CODIGOSRI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoConstantesFunciones.LABEL_CODIGOSRI);
					iRow++;

					for(TipoBanco tipobanco:tipobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobanco.getcodigo_sri());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBancoConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(TipoBanco tipobanco:tipobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobanco.getes_defecto());
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
			//	this.getFilaCabeceraExportarExcelTipoBanco(row);				
			//	iRow++;
			//}				
			
			//for(TipoBanco tipobancoAux:tipobancosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoBanco(tipobancoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipobancoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBanco(false);
			
			//SI ES MANUAL
			if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBanco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBanco(false);
			
			//SI ES MANUAL
			if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBanco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBanco(false);
			
			//SI ES MANUAL
			if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBanco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoBanco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoBanco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoBanco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoBanco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoBanco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoBanco.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoBanco.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoBanco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoBanco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoBanco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoBanco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoBanco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoBanco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoBanco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBanco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoBanco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoBancoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoBanco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoBanco();
		
		this.inicializarActualizarBindingBotonesManualTipoBanco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBanco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBanco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBanco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBanco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoBanco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoBanco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoBanco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoBanco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoBanco.jCheckBoxPostAccionNuevoTipoBanco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoBanco.jCheckBoxPostAccionSinCerrarTipoBanco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoBanco.jCheckBoxPostAccionSinMensajeTipoBanco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoBanco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoBanco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoBanco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoBanco!=null) {
				this.jInternalFrameDetalleFormTipoBanco.jCheckBoxPostAccionNuevoTipoBanco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoBanco.jCheckBoxPostAccionSinCerrarTipoBanco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoBanco.jCheckBoxPostAccionSinMensajeTipoBanco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoBanco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoBanco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoBanco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoBanco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoBanco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoBanco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoBanco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoBanco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoBanco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoBanco(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBanco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoBanco() throws Exception {
		try	{
			if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBanco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBanco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBanco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoBanco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoBanco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoBanco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoBanco.addItem(reporte);
			}
			
			
			if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoBanco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoBanco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBanco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBanco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBanco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoBanco!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBanco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoBanco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBanco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBanco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoBanco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoBanco.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoBanco(Boolean esInicializar) throws Exception {				
		if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBanco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoBanco() throws Exception {
		this.inicializarActualizarBindingTablaTipoBanco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoBanco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoBancoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoBancoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoBancoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoBanco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipobancoLogic.getTipoBancos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipobancos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoBanco.setModel(new TipoBancoModel(this.tipobancoLogic.getTipoBancos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoBanco.setModel(new TipoBancoModel(this.tipobancos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoBanco!=null && this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoBanco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBanco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoBancoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoBancoConstantesFunciones.SCLASSWEBTITULO,tipobancoConstantesFunciones.resaltarSeleccionarTipoBanco,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoBancoConstantesFunciones.SCLASSWEBTITULO,tipobancoConstantesFunciones.resaltarSeleccionarTipoBanco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBanco,TipoBancoConstantesFunciones.LABEL_ID));

		if(this.tipobancoConstantesFunciones.mostraridTipoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipobancoConstantesFunciones.resaltaridTipoBanco,this.tipobancoConstantesFunciones.activaridTipoBanco,this,true,"idTipoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancoConstantesFunciones.resaltaridTipoBanco,this.tipobancoConstantesFunciones.activaridTipoBanco,this,true,"idTipoBanco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBanco,TipoBancoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipobancoConstantesFunciones.mostrarid_empresaTipoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipobancoConstantesFunciones.resaltarid_empresaTipoBanco,this,this.tipobancoConstantesFunciones.activarid_empresaTipoBanco));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipobancoConstantesFunciones.resaltarid_empresaTipoBanco,this,this.tipobancoConstantesFunciones.activarid_empresaTipoBanco,false,"id_empresaTipoBanco","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBanco,TipoBancoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipobancoConstantesFunciones.mostrarnombreTipoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobancoConstantesFunciones.resaltarnombreTipoBanco,this.tipobancoConstantesFunciones.activarnombreTipoBanco,this,true,"nombreTipoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancoConstantesFunciones.resaltarnombreTipoBanco,this.tipobancoConstantesFunciones.activarnombreTipoBanco,this,true,"nombreTipoBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBanco,TipoBancoConstantesFunciones.LABEL_CODIGOSRI));

		if(this.tipobancoConstantesFunciones.mostrarcodigo_sriTipoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoConstantesFunciones.LABEL_CODIGOSRI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobancoConstantesFunciones.resaltarcodigo_sriTipoBanco,this.tipobancoConstantesFunciones.activarcodigo_sriTipoBanco,this,true,"codigo_sriTipoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancoConstantesFunciones.resaltarcodigo_sriTipoBanco,this.tipobancoConstantesFunciones.activarcodigo_sriTipoBanco,this,true,"codigo_sriTipoBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBanco,TipoBancoConstantesFunciones.LABEL_ESDEFECTO));

		if(this.tipobancoConstantesFunciones.mostrares_defectoTipoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipobancoConstantesFunciones.resaltares_defectoTipoBanco,this.tipobancoConstantesFunciones.activares_defectoTipoBanco));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipobancoConstantesFunciones.resaltares_defectoTipoBanco,this.tipobancoConstantesFunciones.activares_defectoTipoBanco,this,true,"es_defectoTipoBanco","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosBanco && this.tipobancoConstantesFunciones.mostrarBancoTipoBanco && !TipoBancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Bancos");
				tableColumn.setHeaderValue("Bancos");
				tableColumn.setCellRenderer(new BancoTableCell(tipobancoConstantesFunciones.resaltarBancoTipoBanco,this,this.tipobancoConstantesFunciones.activarBancoTipoBanco));
				tableColumn.setCellEditor(new BancoTableCell(tipobancoConstantesFunciones.resaltarBancoTipoBanco,this,this.tipobancoConstantesFunciones.activarBancoTipoBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoBanco.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobancoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBanco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobancoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBanco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoBanco && this.isPermisoGuardarCambiosTipoBanco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipobancoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipobancoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoBanco.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipobancoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoBanco.addColumn(tableColumn);
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
			
			this.jTableDatosTipoBanco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBanco && this.isPermisoGuardarCambiosTipoBanco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipobancoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBanco && this.isPermisoGuardarCambiosTipoBanco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoBanco.moveColumn(this.jTableDatosTipoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoBanco.moveColumn(this.jTableDatosTipoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipobancoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoBanco.moveColumn(this.jTableDatosTipoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoBanco.moveColumn(this.jTableDatosTipoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoBanco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoBanco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoBanco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoBanco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoBanco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoBanco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoBanco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoBanco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipobancoLogic.getTipoBancos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipobancos.size()-1;
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
		//this.jTableDatosTipoBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoBanco();
			
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
				
				//this.isEsNuevoTipoBanco=false;
					
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
				if(this.tipobancoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoBanco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBanco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipobanco.getsType().equals("DUPLICADO")
				   || this.tipobanco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoBanco=true;
				
				} else {
					this.isEsNuevoTipoBanco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipobanco.getId()>=0 && !this.tipobanco.getIsNew()) {						
						this.isEsNuevoTipoBanco=false;
						
					} else {
						this.isEsNuevoTipoBanco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoBanco(esRelaciones);						
				
				this.seleccionarTipoBanco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipobanco.getId()<0) {
					this.isEsNuevoTipoBanco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoBanco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoBanco(evt,rowIndex);
				}	
				
				if(this.tipobancoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoBanco: " + this.dDif); 
					}
				}								
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoBanco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipobanco)) {
					if(this.tipobanco.getId()>0) {
						this.tipobanco.setIsDeleted(true);
						
						this.tipobancosEliminados.add(this.tipobanco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobancoLogic.getTipoBancos().remove(this.tipobanco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobancos.remove(this.tipobanco);				
					}
					
					
					((TipoBancoModel) this.jTableDatosTipoBanco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBanco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoBanco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoBanco) {
			
			if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBanco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoBanco(this.tipobanco);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipobancoConstantesFunciones.cargarid_empresaTipoBanco || this.tipobancoConstantesFunciones.event_dependid_empresaTipoBanco) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipobanco.getid_empresa());
									//this.inicializarActualizarBindingTipoBanco(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipobanco.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipobanco.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipobanco.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoBanco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoBanco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBanco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBanco(TipoBanco tipobanco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoBanco(tipobanco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBanco(TipoBanco tipobanco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoBanco(tipobanco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoBanco(tipobanco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoBanco(tipobanco);
	}
	
	public void setVariablesObjetoActualToFormularioTipoBanco(TipoBanco tipobanco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.setText(tipobanco.getId().toString());
			this.jInternalFrameDetalleFormTipoBanco.jTextAreanombreTipoBanco.setText(tipobanco.getnombre());
			this.jInternalFrameDetalleFormTipoBanco.jTextFieldcodigo_sriTipoBanco.setText(tipobanco.getcodigo_sri());
			this.jInternalFrameDetalleFormTipoBanco.jCheckBoxes_defectoTipoBanco.setSelected(tipobanco.getes_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoBanco tipobancoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipobancoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoBanco tipobancoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipobancoLocal=this.tipobanco;
			} else {
				tipobancoLocal=this.tipobancoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipobancoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoBanco(tipobancoLocal,true);
					
					if(tipobancoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipobancoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipobancoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipobancoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoBanco(TipoBanco tipobanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBanco(tipobanco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(tipobanco);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBanco(TipoBanco tipobanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBanco(tipobanco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBanco(TipoBanco tipobanco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.getText()==null || this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.getText()=="" || this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.setText("0");
			}

			if(conColumnasBase) {tipobanco.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBanco.jLabelIdTipoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobanco.setnombre(this.jInternalFrameDetalleFormTipoBanco.jTextAreanombreTipoBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBanco.jLabelnombreTipoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobanco.setcodigo_sri(this.jInternalFrameDetalleFormTipoBanco.jTextFieldcodigo_sriTipoBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoConstantesFunciones.LABEL_CODIGOSRI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBanco.jLabelcodigo_sriTipoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobanco.setes_defecto(this.jInternalFrameDetalleFormTipoBanco.jCheckBoxes_defectoTipoBanco.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBanco.jLabeles_defectoTipoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBanco(TipoBanco tipobancoBean,TipoBanco tipobanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoBanco(TipoBanco tipobancoOrigen,TipoBanco tipobanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobancoOrigen.getId()!=null && !tipobancoOrigen.getId().equals(0L))) {tipobanco.setId(tipobancoOrigen.getId());}}
			if(conDefault || (!conDefault && tipobancoOrigen.getnombre()!=null && !tipobancoOrigen.getnombre().equals(""))) {tipobanco.setnombre(tipobancoOrigen.getnombre());}
			if(conDefault || (!conDefault && tipobancoOrigen.getcodigo_sri()!=null && !tipobancoOrigen.getcodigo_sri().equals(""))) {tipobanco.setcodigo_sri(tipobancoOrigen.getcodigo_sri());}
			if(conDefault || (!conDefault && tipobancoOrigen.getes_defecto()!=null && !tipobancoOrigen.getes_defecto().equals(false))) {tipobanco.setes_defecto(tipobancoOrigen.getes_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBanco(TipoBanco tipobanco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.setText(tipobanco.getId().toString());
			this.jInternalFrameDetalleFormTipoBanco.jTextAreanombreTipoBanco.setText(tipobanco.getnombre());
			this.jInternalFrameDetalleFormTipoBanco.jTextFieldcodigo_sriTipoBanco.setText(tipobanco.getcodigo_sri());
			this.jInternalFrameDetalleFormTipoBanco.jCheckBoxes_defectoTipoBanco.setSelected(tipobanco.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBanco(TipoBancoBean tipobancoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.setText(tipobancoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoBanco.jTextAreanombreTipoBanco.setText(tipobancoBean.getnombre());
			this.jInternalFrameDetalleFormTipoBanco.jTextFieldcodigo_sriTipoBanco.setText(tipobancoBean.getcodigo_sri());
			this.jInternalFrameDetalleFormTipoBanco.jCheckBoxes_defectoTipoBanco.setSelected(tipobancoBean.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoBanco(TipoBancoParameterReturnGeneral tipobancoReturnGeneral,TipoBancoBean tipobancoBean,Boolean conDefault) throws Exception { 
		try {
			TipoBanco tipobancoLocal=new TipoBanco();
			
			tipobancoLocal=tipobancoReturnGeneral.getTipoBanco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobancoLocal.getId()!=null && !tipobancoLocal.getId().equals(0L))) {tipobancoBean.setId(tipobancoLocal.getId());}}
			if(conDefault || (!conDefault && tipobancoLocal.getnombre()!=null && !tipobancoLocal.getnombre().equals(""))) {tipobancoBean.setnombre(tipobancoLocal.getnombre());}
			if(conDefault || (!conDefault && tipobancoLocal.getcodigo_sri()!=null && !tipobancoLocal.getcodigo_sri().equals(""))) {tipobancoBean.setcodigo_sri(tipobancoLocal.getcodigo_sri());}
			if(conDefault || (!conDefault && tipobancoLocal.getes_defecto()!=null && !tipobancoLocal.getes_defecto().equals(false))) {tipobancoBean.setes_defecto(tipobancoLocal.getes_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoBancoGenerico(Long idTipoBancoSeleccionado,JComboBox jComboBoxTipoBanco,List<TipoBanco> tipobancosLocal)throws Exception {
		try {
			TipoBanco  tipobancoTemp=null;

			for(TipoBanco tipobancoAux:tipobancosLocal) {
				if(tipobancoAux.getId()!=null && tipobancoAux.getId().equals(idTipoBancoSeleccionado)) {
					tipobancoTemp=tipobancoAux;
					break;
				}
			}

			jComboBoxTipoBanco.setSelectedItem(tipobancoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoBancoGenerico(JComboBox jComboBoxTipoBanco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBanco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBanco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Banco")) {
			jButtonBancoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobanco=(TipoBanco) tipobancoLogic.getTipoBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobanco =(TipoBanco) tipobancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipobanco.getIsNew() && !tipobanco.getIsChanged() && !tipobanco.getIsDeleted()) {
				sDescripcion=tipobanco.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipobanco.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoBanco tipobancoRow=new TipoBanco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancoRow=(TipoBanco) tipobancoLogic.getTipoBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobancoRow=(TipoBanco) tipobancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonBancoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoBanco tipobanco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobanco = (TipoBanco)this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipobanco = (TipoBanco)this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipobanco!=null) {
						this.tipobanco = tipobanco;
					} else {
						this.tipobanco = new TipoBanco();
					}
				}

				if(this.isTienePermisosBanco && this.permiteMantenimiento(this.tipobanco)) {
					BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFramePopup=new BancoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						bancoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFramePopup;
					} else {
						bancoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame;
					}

					List<TipoBanco> tipobancos=new ArrayList<TipoBanco>();
					tipobancos.add(this.tipobanco);
					if(!esRelacionado) {
						//bancoBeanSwingJInternalFrame.bancoSessionBean.setConGuardarRelaciones(false);
						//bancoBeanSwingJInternalFrame.bancoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					bancoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoBanco.cargarBancoBeanSwingJInternalFrame(tipobancos,this.tipobanco,bancoBeanSwingJInternalFrame,/*conInicializar,*/bancoBeanSwingJInternalFrame.bancoSessionBean.getConGuardarRelaciones(),bancoBeanSwingJInternalFrame.bancoSessionBean.getEsGuardarRelacionado());
					bancoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						bancoBeanSwingJInternalFrame.actualizarEstadoPanelsBanco("no_relacionado");

						bancoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(BancoConstantesFunciones.ITAMANIOFILATABLA + (BancoConstantesFunciones.ITAMANIOFILATABLA/2));

						bancoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoBanco=(TitledBorder)this.jScrollPanelDatosTipoBanco.getBorder();
						TitledBorder titledBorderBanco=(TitledBorder)bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.getBorder();

						titledBorderBanco.setTitle(titledBorderTipoBanco.getTitle() + " -> Banco");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,bancoBeanSwingJInternalFrame);
						}

						bancoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(bancoBeanSwingJInternalFrame);

						bancoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipobancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Banco",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoBanco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoBanco.setVisible((this.isVisibilidadCeldaNuevoTipoBanco && this.isPermisoNuevoTipoBanco));			
			this.jButtonDuplicarTipoBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoBanco && this.isPermisoDuplicarTipoBanco));			
			this.jButtonCopiarTipoBanco.setVisible((this.isVisibilidadCeldaCopiarTipoBanco && this.isPermisoCopiarTipoBanco));
			this.jButtonVerFormTipoBanco.setVisible((this.isVisibilidadCeldaVerFormTipoBanco && this.isPermisoVerFormTipoBanco));
			
			this.jButtonAbrirOrderByTipoBanco.setVisible((this.isVisibilidadCeldaOrdenTipoBanco && this.isPermisoOrdenTipoBanco));			
			
			this.jButtonNuevoRelacionesTipoBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBanco && this.isPermisoNuevoTipoBanco));			
			this.jButtonNuevoGuardarCambiosTipoBanco.setVisible((this.isVisibilidadCeldaNuevoTipoBanco && this.isPermisoNuevoTipoBanco && this.isPermisoGuardarCambiosTipoBanco));
			
			if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonModificarTipoBanco.setVisible((this.isVisibilidadCeldaModificarTipoBanco && this.isPermisoActualizarTipoBanco));	
			this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarTipoBanco.setVisible((this.isVisibilidadCeldaActualizarTipoBanco && this.isPermisoActualizarTipoBanco));	
			this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarTipoBanco.setVisible((this.isVisibilidadCeldaEliminarTipoBanco && this.isPermisoEliminarTipoBanco));
			this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarTipoBanco.setVisible(this.isVisibilidadCeldaCancelarTipoBanco);							
			this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosTipoBanco.setVisible((this.isVisibilidadCeldaGuardarTipoBanco && this.isPermisoGuardarCambiosTipoBanco));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBanco && this.isPermisoGuardarCambiosTipoBanco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoBanco.setVisible((this.isVisibilidadCeldaNuevoTipoBanco && this.isPermisoNuevoTipoBanco));						
			this.jButtonDuplicarToolBarTipoBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoBanco && this.isPermisoDuplicarTipoBanco));						
			this.jButtonCopiarToolBarTipoBanco.setVisible((this.isVisibilidadCeldaCopiarTipoBanco && this.isPermisoCopiarTipoBanco));			
			this.jButtonVerFormToolBarTipoBanco.setVisible((this.isVisibilidadCeldaVerFormTipoBanco && this.isPermisoVerFormTipoBanco));			
			this.jButtonAbrirOrderByToolBarTipoBanco.setVisible((this.isVisibilidadCeldaOrdenTipoBanco && this.isPermisoOrdenTipoBanco));
			this.jButtonNuevoRelacionesToolBarTipoBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBanco && this.isPermisoNuevoTipoBanco));			
			this.jButtonNuevoGuardarCambiosToolBarTipoBanco.setVisible((this.isVisibilidadCeldaNuevoTipoBanco && this.isPermisoNuevoTipoBanco && this.isPermisoGuardarCambiosTipoBanco));			
			
			if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonModificarToolBarTipoBanco.setVisible((this.isVisibilidadCeldaModificarTipoBanco && this.isPermisoActualizarTipoBanco));	
			this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarToolBarTipoBanco.setVisible((this.isVisibilidadCeldaActualizarTipoBanco  && this.isPermisoActualizarTipoBanco));	
			this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarToolBarTipoBanco.setVisible((this.isVisibilidadCeldaEliminarTipoBanco && this.isPermisoEliminarTipoBanco));
			this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarToolBarTipoBanco.setVisible(this.isVisibilidadCeldaCancelarTipoBanco);				
			this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosToolBarTipoBanco.setVisible((this.isVisibilidadCeldaGuardarTipoBanco && this.isPermisoGuardarCambiosTipoBanco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBanco && this.isPermisoGuardarCambiosTipoBanco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoBanco.setVisible((this.isVisibilidadCeldaNuevoTipoBanco && this.isPermisoNuevoTipoBanco));			
			this.jMenuItemDuplicarTipoBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoBanco && this.isPermisoDuplicarTipoBanco));			
			this.jMenuItemCopiarTipoBanco.setVisible((this.isVisibilidadCeldaCopiarTipoBanco && this.isPermisoCopiarTipoBanco));			
			this.jMenuItemVerFormTipoBanco.setVisible((this.isVisibilidadCeldaVerFormTipoBanco && this.isPermisoVerFormTipoBanco));			
			this.jMenuItemAbrirOrderByTipoBanco.setVisible((this.isVisibilidadCeldaOrdenTipoBanco && this.isPermisoOrdenTipoBanco));			
			//this.jMenuItemMostrarOcultarTipoBanco.setVisible((this.isVisibilidadCeldaOrdenTipoBanco && this.isPermisoOrdenTipoBanco));
			this.jMenuItemDetalleAbrirOrderByTipoBanco.setVisible((this.isVisibilidadCeldaOrdenTipoBanco && this.isPermisoOrdenTipoBanco));			
			//this.jMenuItemDetalleMostrarOcultarTipoBanco.setVisible((this.isVisibilidadCeldaOrdenTipoBanco && this.isPermisoOrdenTipoBanco));			
			this.jMenuItemNuevoRelacionesTipoBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBanco && this.isPermisoNuevoTipoBanco));			
			this.jMenuItemNuevoGuardarCambiosTipoBanco.setVisible((this.isVisibilidadCeldaNuevoTipoBanco && this.isPermisoNuevoTipoBanco && this.isPermisoGuardarCambiosTipoBanco));									
			
			if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			this.jInternalFrameDetalleFormTipoBanco.jMenuItemModificarTipoBanco.setVisible((this.isVisibilidadCeldaModificarTipoBanco && this.isPermisoActualizarTipoBanco));	
			this.jInternalFrameDetalleFormTipoBanco.jMenuItemActualizarTipoBanco.setVisible((this.isVisibilidadCeldaActualizarTipoBanco && this.isPermisoActualizarTipoBanco));	
			this.jInternalFrameDetalleFormTipoBanco.jMenuItemEliminarTipoBanco.setVisible((this.isVisibilidadCeldaEliminarTipoBanco && this.isPermisoEliminarTipoBanco));
			this.jInternalFrameDetalleFormTipoBanco.jMenuItemCancelarTipoBanco.setVisible(this.isVisibilidadCeldaCancelarTipoBanco);				
			}
			
			this.jMenuItemGuardarCambiosTipoBanco.setVisible((this.isVisibilidadCeldaGuardarTipoBanco && this.isPermisoGuardarCambiosTipoBanco));						
			this.jMenuItemGuardarCambiosTablaTipoBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBanco && this.isPermisoGuardarCambiosTipoBanco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoBanco=this.jButtonNuevoTipoBanco.isVisible();
			this.isVisibilidadCeldaDuplicarTipoBanco=this.jButtonDuplicarTipoBanco.isVisible();
			this.isVisibilidadCeldaCopiarTipoBanco=this.jButtonCopiarTipoBanco.isVisible();
			this.isVisibilidadCeldaVerFormTipoBanco=this.jButtonVerFormTipoBanco.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoBanco=this.jButtonAbrirOrderByTipoBanco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=this.jButtonNuevoRelacionesTipoBanco.isVisible();
			this.isVisibilidadCeldaModificarTipoBanco=this.jButtonModificarTipoBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			this.isVisibilidadCeldaActualizarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarTipoBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarTipoBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarTipoBanco.isVisible();
			this.isVisibilidadCeldaGuardarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosTipoBanco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=this.jButtonGuardarCambiosTablaTipoBanco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoBanco=this.jButtonNuevoToolBarTipoBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=this.jButtonNuevoRelacionesToolBarTipoBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			this.isVisibilidadCeldaModificarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jButtonModificarToolBarTipoBanco.isVisible();
			this.isVisibilidadCeldaActualizarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarToolBarTipoBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarToolBarTipoBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarToolBarTipoBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBanco=this.jButtonGuardarCambiosToolBarTipoBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=this.jButtonGuardarCambiosTablaToolBarTipoBanco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoBanco=this.jMenuItemNuevoTipoBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=this.jMenuItemNuevoRelacionesTipoBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			this.isVisibilidadCeldaModificarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jMenuItemModificarTipoBanco.isVisible();
			this.isVisibilidadCeldaActualizarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jMenuItemActualizarTipoBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jMenuItemEliminarTipoBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoBanco=this.jInternalFrameDetalleFormTipoBanco.jMenuItemCancelarTipoBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBanco=this.jMenuItemGuardarCambiosTipoBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=this.jMenuItemGuardarCambiosTablaTipoBanco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoBanco(Boolean esInicializar) {
		if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipobancoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipobancoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBanco();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoBanco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoBanco() {
		this.jButtonNuevoTipoBanco.setVisible(this.isPermisoNuevoTipoBanco);			
		this.jButtonDuplicarTipoBanco.setVisible(this.isPermisoDuplicarTipoBanco);			
		this.jButtonCopiarTipoBanco.setVisible(this.isPermisoCopiarTipoBanco);			
		this.jButtonVerFormTipoBanco.setVisible(this.isPermisoVerFormTipoBanco);			
		
		this.jButtonAbrirOrderByTipoBanco.setVisible(this.isPermisoOrdenTipoBanco);					
		
		this.jButtonNuevoRelacionesTipoBanco.setVisible(this.isPermisoNuevoTipoBanco);			
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonModificarTipoBanco.setVisible(this.isPermisoActualizarTipoBanco);	
			this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarTipoBanco.setVisible(this.isPermisoActualizarTipoBanco);	
			this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarTipoBanco.setVisible(this.isPermisoEliminarTipoBanco);
			this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarTipoBanco.setVisible(this.isVisibilidadCeldaCancelarTipoBanco);						
			this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosTipoBanco.setVisible(this.isPermisoGuardarCambiosTipoBanco);							
		}
		
		this.jButtonGuardarCambiosTablaTipoBanco.setVisible(this.isPermisoActualizarTipoBanco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBanco() {
		this.jInternalFrameDetalleFormTipoBanco.jButtonModificarTipoBanco.setVisible(this.isPermisoActualizarTipoBanco);	
		this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarTipoBanco.setVisible(this.isPermisoActualizarTipoBanco);	
		this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarTipoBanco.setVisible(this.isPermisoEliminarTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarTipoBanco.setVisible(this.isVisibilidadCeldaCancelarTipoBanco);							
		this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosTipoBanco.setVisible((this.isVisibilidadCeldaGuardarTipoBanco && this.isPermisoGuardarCambiosTipoBanco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoBanco() {
		if(TipoBancoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoBanco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoBanco() {
	}
	
	public void jTableDatosTipoBancoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoBanco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBanco(this.gettipobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobanco==null) {
						this.tipobanco = new TipoBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
				}

				if(this.tipobanco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipobanco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoBanco(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoBanco(this.gettipobanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipobancoLogic.getConnexion());

				if(this.tipobanco.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipobanco.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoBanco=(TitledBorder)this.jScrollPanelDatosTipoBanco.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoBanco.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBanco(this.gettipobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobanco==null) {
						this.tipobanco = new TipoBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
				}

				if(this.tipobanco.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipobanco.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBanco(this.gettipobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobanco==null) {
						this.tipobanco = new TipoBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
				}

				if(this.tipobanco.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipobanco.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sriTipoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBanco(this.gettipobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobanco==null) {
						this.tipobanco = new TipoBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
				}

				if(this.tipobanco.getcodigo_sri()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sri like '%"+this.tipobanco.getcodigo_sri()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoTipoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBanco(this.gettipobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobanco==null) {
						this.tipobanco = new TipoBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);
				}

				if(this.tipobanco.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.tipobanco.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoBanco(false,false);

			this.getTipoBancosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoBanco(false);

			//if(TipoBancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoBanco(false,false);

			this.getTipoBancosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoBanco(false);

			//if(TipoBancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoBanco() {
		if(this.jInternalFrameDetalleFormTipoBanco!=null) {
		

		if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) {
			this.jInternalFrameDetalleFormTipoBanco.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoBanco.dispose();
			this.jInternalFrameDetalleFormTipoBanco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoBanco!=null) {
			this.jInternalFrameReporteDinamicoTipoBanco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoBanco.dispose();
			this.jInternalFrameReporteDinamicoTipoBanco=null;
		}
		
		if(this.jInternalFrameImportacionTipoBanco!=null) {
			this.jInternalFrameImportacionTipoBanco.setVisible(false);	    			
			this.jInternalFrameImportacionTipoBanco.dispose();
			this.jInternalFrameImportacionTipoBanco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoBanco();
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoBanco")) {
				jButtonNuevoTipoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoBanco")) {
				jButtonDuplicarTipoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoBanco")) {
				jButtonCopiarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoBanco")) {
				jButtonVerFormTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoBanco")) {
				jButtonNuevoTipoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoBanco")) {
				jButtonDuplicarTipoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoBanco")) {
				jButtonNuevoTipoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoBanco")) {
				jButtonDuplicarTipoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoBanco")) {
				jButtonNuevoTipoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoBanco")) {
				jButtonNuevoTipoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoBanco")) {
				jButtonNuevoTipoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoBanco")) {
				jButtonModificarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoBanco")) {
				jButtonModificarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoBanco")) {
				jButtonModificarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoBanco")) {
				jButtonActualizarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoBanco")) {
				jButtonActualizarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoBanco")) {
				jButtonActualizarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoBanco")) {
				jButtonEliminarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoBanco")) {
				jButtonEliminarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoBanco")) {
				jButtonEliminarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoBanco")) {
				jButtonCancelarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoBanco")) {
				jButtonCancelarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoBanco")) {
				jButtonCancelarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoBanco")) {
				jButtonCerrarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoBanco")) {
				jButtonCerrarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoBanco")) {
				jButtonCerrarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoBanco")) {
				jButtonMostrarOcultarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoBanco")) {
				jButtonCancelarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoBanco")) {
				jButtonGuardarCambiosTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoBanco")) {
				jButtonGuardarCambiosTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoBanco")) {
				jButtonCopiarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoBanco")) {
				jButtonVerFormTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoBanco")) {
				jButtonGuardarCambiosTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoBanco")) {
				jButtonCopiarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoBanco")) {
				jButtonVerFormTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoBanco")) {
				jButtonGuardarCambiosTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoBanco")) {
				jButtonGuardarCambiosTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoBanco")) {
				jButtonGuardarCambiosTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoBanco")) {
				jButtonRecargarInformacionTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoBanco")) {
				jButtonRecargarInformacionTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoBanco")) {
				jButtonRecargarInformacionTipoBancoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoBanco")) {
				jButtonAnterioresTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoBanco")) {
				jButtonAnterioresTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoBanco")) {
				jButtonAnterioresTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoBanco")) {
				jButtonSiguientesTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoBanco")) {
				jButtonSiguientesTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoBanco")) {
				jButtonSiguientesTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoBanco") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoBanco")) {
				jButtonAbrirOrderByTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoBanco") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoBanco")) {
				jButtonMostrarOcultarTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBanco")) {
				jButtonNuevoGuardarCambiosTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoBanco")) {
				jButtonNuevoGuardarCambiosTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoBanco")) {
				jButtonNuevoGuardarCambiosTipoBancoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoBanco")) {
				jButtonCerrarReporteDinamicoTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoBanco")) {
				jButtonGenerarReporteDinamicoTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoBanco")) {
				
				jButtonGenerarExcelReporteDinamicoTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoBanco")) {
				jButtonCerrarImportacionTipoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoBanco")) {
				
				jButtonGenerarImportacionTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoBanco")) {
				
				jButtonAbrirImportacionTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoBanco")) {
				jComboBoxTiposAccionesTipoBancoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoBanco")) {
				jComboBoxTiposRelacionesTipoBancoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoBanco")) {
				jComboBoxTiposAccionesTipoBancoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoBanco")) {
				
				jComboBoxTiposSeleccionarTipoBancoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoBanco")) {
				jTextFieldValorCampoGeneralTipoBancoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoBanco")) {
				jButtonAbrirOrderByTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoBanco")) {
				jButtonAbrirOrderByTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoBanco")) {
				jButtonCerrarOrderByTipoBancoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBancoBusqueda")) {
				this.jButtonidTipoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoBancoUpdate")) {
				this.jButtonid_empresaTipoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoBancoBusqueda")) {
				this.jButtonid_empresaTipoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBancoBusqueda")) {
				this.jButtonnombreTipoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sriTipoBancoBusqueda")) {
				this.jButtoncodigo_sriTipoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoTipoBancoBusqueda")) {
				this.jButtones_defectoTipoBancoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoBanco")) {
				this.jButtonBusquedaPorNombreTipoBancoActionPerformed(evt);
			}
			
			;
			
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoBanco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				


				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoBanco tipobancoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipobancoLocal=this.tipobanco;
			} else {
				tipobancoLocal=this.tipobancoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
							
				
				


				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
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
			
			


			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
								
						
				


				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
								
				
				


				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
							
				
				


				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoAnterior =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobancoAnterior =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
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
			
			


			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
								
				
				


				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoBanco")) {
					jCheckBoxSeleccionarTodosTipoBancoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoBanco")) {
					jCheckBoxSeleccionadosTipoBancoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoBanco")) {
					
				}
				
				


				
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
												
				
				


				
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoAnterior =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobancoAnterior =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
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
			
			


			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobanco);
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
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
				
				


				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBanco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoAnterior =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoBanco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoBanco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipobanco =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipobanco =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipobanco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoBanco")) {
				
				}
				
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoBanco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoBanco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoBanco")) {
			
			}
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoBanco();
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoBanco")) {
				jButtonNuevoTipoBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoBanco")) {
				jButtonDuplicarTipoBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoBanco")) {
				jButtonCopiarTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoBanco")) {
				jButtonVerFormTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoBanco")) {
				jButtonNuevoTipoBancoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoBanco")) {
				jButtonModificarTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoBanco")) {
				jButtonActualizarTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoBanco")) {
				jButtonEliminarTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoBanco")) {
				jButtonGuardarCambiosTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoBanco")) {
				jButtonCancelarTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoBanco")) {
				jButtonCerrarTipoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoBanco")) {
				jButtonGuardarCambiosTipoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBanco")) {
				jButtonNuevoGuardarCambiosTipoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoBanco")) {
				jButtonAbrirOrderByTipoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoBanco")) {
				jButtonRecargarInformacionTipoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoBanco")) {
				jButtonAnterioresTipoBancoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoBanco")) {
				jButtonSiguientesTipoBancoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBancoBusqueda")) {
				this.jButtonidTipoBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoBancoUpdate")) {
				this.jButtonid_empresaTipoBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoBancoBusqueda")) {
				this.jButtonid_empresaTipoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBancoBusqueda")) {
				this.jButtonnombreTipoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sriTipoBancoBusqueda")) {
				this.jButtoncodigo_sriTipoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoTipoBancoBusqueda")) {
				this.jButtones_defectoTipoBancoBusquedaActionPerformed(evt);
			}
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoBanco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoBanco")) {
				closingInternalFrameTipoBanco();
				
			} else if(sTipo.equals("jButtonCancelarTipoBanco")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoBanco = (JInternalFrameBase)evt.getSource();
	            	
	            TipoBancoBeanSwingJInternalFrame jInternalFrameParent=(TipoBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBanco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoBancoActionPerformed(null);
			}
			
			TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobanco,new Object(),this.tipobancoParameterGeneral,this.tipobancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipobanco)) {
			if(!esControlTabla) {
				if(TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);			
				}
				
				if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoBanco(this.tipobanco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobancoReturnGeneral=tipobancoLogic.procesarEventosTipoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoLogic.getTipoBancos(),this.tipobanco,this.tipobancoParameterGeneral,this.isEsNuevoTipoBanco,classes);//this.tipobancoLogic.getTipoBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoBanco(this.tipobancoReturnGeneral,this.tipobancoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoBanco(classes,this.tipobancoReturnGeneral,this.tipobancoBean,false);
					}
						
					if(this.tipobancoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoBanco(this.tipobancoReturnGeneral.getTipoBanco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoBanco(this.tipobancoReturnGeneral.getTipoBanco());	
					}
						
					if(this.tipobancoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoBanco(this.tipobancoReturnGeneral.getTipoBanco(),classes);//this.tipobancoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoBanco(this.tipobanco,classes);//this.tipobancoBean);									
				}
			
				if(TipoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoBanco(this.tipobanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBanco(this.tipobanco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipobancoAnterior!=null) {
						this.tipobanco=this.tipobancoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobancoReturnGeneral=tipobancoLogic.procesarEventosTipoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoLogic.getTipoBancos(),this.tipobanco,this.tipobancoParameterGeneral,this.isEsNuevoTipoBanco,classes);//this.tipobancoLogic.getTipoBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipobancoReturnGeneral.getTipoBanco(),tipobancoLogic.getTipoBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipobancoReturnGeneral.getTipoBanco(),this.tipobancos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoBanco.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoBanco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoBanco();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoBanco() throws Exception {
		
		TipoBancoModel tipobancoModel=(TipoBancoModel)this.jTableDatosTipoBanco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancoModel.tipobancos=this.tipobancoLogic.getTipoBancos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipobancoModel.tipobancos=this.tipobancos;
		}
		
		
		((TipoBancoModel) this.jTableDatosTipoBanco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoBanco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipobancoAnterior(),this.tipobancoLogic.getTipoBancos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipobancoAnterior(),this.tipobancos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoBanco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoBanco(TipoBanco tipobanco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Banco.class)) {
					this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.setBancos(tipobanco.getBancos());
					this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
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
										
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobanco,new Object(),generalEntityParameterGeneral,this.tipobancoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipobancoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoBancoConstantesFunciones.getClassesRelationshipsOfTipoBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoBancoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoBanco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobanco,new Object(),generalEntityParameterGeneral,this.tipobancoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoBanco(TipoBancoBean tipobancoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Banco.class)) {
					this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.setBancos(tipobanco.getBancos());
					this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoBanco(ArrayList<Classe> classes,TipoBancoReturnGeneral tipobancoReturnGeneral,TipoBancoBean tipobancoBean,Boolean conDefault) throws Exception {
		
			this.tipobancoBean.setBancos(tipobancoReturnGeneral.getTipoBanco().getBancos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoBanco(TipoBanco tipobanco,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Banco.class)) {
					tipobanco.setBancos(this.jInternalFrameDetalleFormTipoBanco.bancoBeanSwingJInternalFrame.bancoLogic.getBancos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipobanco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoBanco = new TipoBancoDetalleFormJInternalFrame(jDesktopPane,this.tipobancoSessionBean.getConGuardarRelaciones(),this.tipobancoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.setVisible(false);
		this.jInternalFrameDetalleFormTipoBanco.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoBanco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoBanco.tipobancoLogic=this.tipobancoLogic;
		
		this.cargarCombosFrameForeignKeyTipoBanco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBanco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBanco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoBanco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoBanco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBanco"));
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonModificarTipoBanco.addActionListener(new ButtonActionListener(this,"ModificarTipoBanco"));

		
		this.jInternalFrameDetalleFormTipoBanco.jButtonModificarToolBarTipoBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBanco"));
					
		this.jInternalFrameDetalleFormTipoBanco.jMenuItemModificarTipoBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarTipoBanco.addActionListener (new ButtonActionListener(this,"ActualizarTipoBanco"));
		
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarToolBarTipoBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBanco"));
						
		this.jInternalFrameDetalleFormTipoBanco.jMenuItemActualizarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarTipoBanco.addActionListener (new ButtonActionListener(this,"EliminarTipoBanco"));
		
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBanco"));
								
		this.jInternalFrameDetalleFormTipoBanco.jMenuItemEliminarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarTipoBanco.addActionListener (new ButtonActionListener(this,"CancelarTipoBanco"));
		
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBanco"));
					
		this.jInternalFrameDetalleFormTipoBanco.jMenuItemCancelarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBanco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoBanco.jMenuItemDetalleCerrarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBanco"));
		
		
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBanco"));
		
		
		
		this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBanco"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtonidTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBanco.jButtonid_empresaTipoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtonid_empresaTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtonnombreTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtoncodigo_sriTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sriTipoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtones_defectoTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoBancoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBanco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoBanco"));
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBanco"));
		}
		
		this.jTableDatosTipoBanco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoBanco"));
		
		this.jTableDatosTipoBanco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoBanco"));
		
		this.jButtonNuevoTipoBanco.addActionListener(new ButtonActionListener(this,"NuevoTipoBanco"));
		
		this.jButtonDuplicarTipoBanco.addActionListener(new ButtonActionListener(this,"DuplicarTipoBanco"));
		
		this.jButtonCopiarTipoBanco.addActionListener(new ButtonActionListener(this,"CopiarTipoBanco"));
		
		this.jButtonVerFormTipoBanco.addActionListener(new ButtonActionListener(this,"VerFormTipoBanco"));
		
		
		this.jButtonNuevoToolBarTipoBanco.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoBanco"));
			
		this.jButtonDuplicarToolBarTipoBanco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoBanco"));
			
		this.jMenuItemNuevoTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoBanco"));
			
		this.jMenuItemDuplicarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoBanco"));		
		
		
		this.jButtonNuevoRelacionesTipoBanco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoBanco"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoBanco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoBanco"));
			
		this.jMenuItemNuevoRelacionesTipoBanco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoBanco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonModificarTipoBanco.addActionListener(new ButtonActionListener(this,"ModificarTipoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonModificarToolBarTipoBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBanco"));
			
			this.jInternalFrameDetalleFormTipoBanco.jMenuItemModificarTipoBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarTipoBanco.addActionListener (new ButtonActionListener(this,"ActualizarTipoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonActualizarToolBarTipoBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBanco"));
				
			this.jInternalFrameDetalleFormTipoBanco.jMenuItemActualizarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarTipoBanco.addActionListener (new ButtonActionListener(this,"EliminarTipoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonEliminarToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBanco"));
						
			this.jInternalFrameDetalleFormTipoBanco.jMenuItemEliminarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarTipoBanco.addActionListener (new ButtonActionListener(this,"CancelarTipoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonCancelarToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBanco"));
			
			this.jInternalFrameDetalleFormTipoBanco.jMenuItemCancelarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBanco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoBanco"));		
		
		
		this.jButtonCerrarTipoBanco.addActionListener (new ButtonActionListener(this,"CerrarTipoBanco"));
		
		
		this.jButtonCerrarToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoBanco"));
			
		this.jMenuItemCerrarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoBanco"));
			
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jMenuItemDetalleCerrarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosTipoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBanco"));
		}
		
		this.jButtonCopiarToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoBanco"));
			
		this.jButtonVerFormToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoBanco"));
		
		this.jMenuItemGuardarCambiosTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoBanco"));
			
		this.jMenuItemCopiarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoBanco"));		
		
		this.jMenuItemVerFormTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoBanco"));		
		
		
		this.jButtonGuardarCambiosTablaTipoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBanco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoBanco"));
			
		this.jMenuItemGuardarCambiosTablaTipoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBanco"));		
		
		
		
		this.jButtonRecargarInformacionTipoBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoBanco"));
					
		this.jButtonRecargarInformacionToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoBanco"));
		
		this.jMenuItemRecargarInformacionTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoBanco"));		
		
		
		
		this.jButtonAnterioresTipoBanco.addActionListener (new ButtonActionListener(this,"AnterioresTipoBanco"));
		
		
		this.jButtonAnterioresToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoBanco"));
		
		this.jMenuItemAnterioresTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoBanco"));		
		
		
		this.jButtonSiguientesTipoBanco.addActionListener (new ButtonActionListener(this,"SiguientesTipoBanco"));
		
		
		this.jButtonSiguientesToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoBanco"));
			
		this.jMenuItemSiguientesTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoBanco"));
			
		this.jMenuItemAbrirOrderByTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoBanco"));
			
		this.jMenuItemMostrarOcultarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoBanco"));
			
		this.jMenuItemDetalleAbrirOrderByTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoBanco"));
			
		this.jMenuItemDetalleMostarOcultarTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoBanco"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoBanco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoBanco"));
			
		this.jMenuItemNuevoGuardarCambiosTipoBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoBanco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoBanco"));

		this.jCheckBoxSeleccionadosTipoBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoBanco"));
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBanco"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoBanco.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoBanco"));
			
		this.jComboBoxTiposAccionesTipoBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoBanco"));
					
		this.jComboBoxTiposSeleccionarTipoBanco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoBanco"));
			
		this.jTextFieldValorCampoGeneralTipoBanco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoBanco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtonidTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBanco.jButtonid_empresaTipoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtonid_empresaTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtonnombreTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtoncodigo_sriTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sriTipoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtones_defectoTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoBancoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoBanco.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoBanco"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBanco"));
				this.jInternalFrameReporteDinamicoTipoBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBanco"));
				this.jInternalFrameReporteDinamicoTipoBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBanco"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoBanco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBanco"));				
			//this.jButtonGenerarReporteDinamicoTipoBanco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBanco"));
			//this.jButtonGenerarExcelReporteDinamicoTipoBanco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBanco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoBanco!=null) {
				this.jInternalFrameImportacionTipoBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBanco"));
				this.jInternalFrameImportacionTipoBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBanco"));
				this.jInternalFrameImportacionTipoBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBanco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoBanco"));
			
			this.jButtonAbrirOrderByToolBarTipoBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoBanco"));			
			
			if(this.jInternalFrameOrderByTipoBanco!=null) {
				this.jInternalFrameOrderByTipoBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBanco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBanco.jTabbedPaneRelacionesTipoBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBanco"));
		
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
            		closingInternalFrameTipoBanco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoBanco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoBanco = (JInternalFrameBase)event.getSource();
	            	
	            TipoBancoBeanSwingJInternalFrame jInternalFrameParent=(TipoBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBanco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoBancoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoBanco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoBanco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoBanco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoBanco";
		inputMap = this.jButtonNuevoTipoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBancoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoBanco";
		inputMap = this.jButtonNuevoRelacionesTipoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBancoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoBanco";
		inputMap = this.jButtonModificarTipoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoBanco";
		inputMap = this.jButtonActualizarTipoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoBanco";
		inputMap = this.jButtonEliminarTipoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoBanco";
		inputMap = this.jButtonCancelarTipoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoBanco";
		inputMap = this.jButtonCerrarTipoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoBanco";
		inputMap = this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosTipoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoBanco.jButtonGuardarCambiosTipoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoBanco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoBancoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtonidTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBanco.jButtonid_empresaTipoBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtonid_empresaTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtonnombreTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtoncodigo_sriTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sriTipoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBanco.jButtones_defectoTipoBancoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoBancoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoBanco.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoBanco"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoBancoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoBanco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoBanco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoBanco tipobancoAux:this.tipobancoLogic.getTipoBancos()) {
					tipobancoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBanco tipobancoAux:tipobancos) {
					tipobancoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBanco tipobancoAux:this.tipobancoLogic.getTipoBancos()) {
						tipobancoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBanco tipobancoAux:tipobancos) {
						tipobancoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoBanco tipobancoAux:this.tipobancoLogic.getTipoBancos()) {
					
						if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							tipobancoAux.setes_defecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBanco tipobancoAux:tipobancos) {
						
						if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							tipobancoAux.setes_defecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoBanco.getSelectedRows();
			
			TipoBanco tipobancoLocal=new TipoBanco();
			
			//this.seleccionarTodosTipoBanco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoLocal =(TipoBanco) this.tipobancoLogic.getTipoBancos().toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipobancoLocal =(TipoBanco) this.tipobancos.toArray()[this.jTableDatosTipoBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipobancoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBanco tipobancoAux:this.tipobancoLogic.getTipoBancos()) {
						tipobancoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBanco tipobancoAux:tipobancos) {
						tipobancoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoBanco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoBancoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoBancoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoBancoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoBanco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoBanco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBanco tipobancoAux:this.tipobancoLogic.getTipoBancos()) {
				
						if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobancoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_CODIGOSRI)) {
							existe=true;
							tipobancoAux.setcodigo_sri(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBanco tipobancoAux:tipobancos) {
					
						if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobancoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_CODIGOSRI)) {
							existe=true;
							tipobancoAux.setcodigo_sri(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoBancoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoBanco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoBanco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoBanco) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoBanco(conSplash);
				
					this.generarReporteTipoBancosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoBancosSeleccionados();
				//this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBancosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBancosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBanco();
				
				this.exportarTipoBancosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoBancos();
				//this.importarTipoBancos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBanco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoBancosSeleccionados();
				//this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoBanco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoBanco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoBanco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoBancoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoBanco) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoBanco(conSplash);
					
						//this.actualizarParametrosGeneralTipoBanco();
						
						this.generarReporteProcesoAccionTipoBancosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoBancoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo BancoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoBanco();
				
						this.actualizarParametrosGeneralTipoBanco();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipobancoReturnGeneral=tipobancoLogic.procesarAccionTipoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipobancoLogic.getTipoBancos(),this.tipobancoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoBanco();
					
					TipoBancoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoBanco.jComboBoxTiposAccionesFormularioTipoBanco.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoBanco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoBancoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoBanco();
			
			if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();		
			TipoBanco tipobanco=new TipoBanco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoBanco.getSelectedItem();
			
			
			
			
			tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipobancosSeleccionados.size()==1) {
				for(TipoBanco tipobancoAux:tipobancosSeleccionados) {
					tipobanco=tipobancoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Banco")) {
					jButtonBancoActionPerformed(null,rowIndex,true,false,tipobanco);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoBanco();
			
      		//this.finishProcessTipoBanco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoBancoReturnGeneral() throws Exception {
		if(this.tipobancoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipobancoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipobancoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipobancoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipobancoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipobancoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoBanco(false);
		}
		
		if(this.tipobancoReturnGeneral.getConRetornoLista() || this.tipobancoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipobancoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobancoLogic.setTipoBancos(this.tipobancoReturnGeneral.getTipoBancos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipobancoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobancoLogic.setTipoBanco(this.tipobancoReturnGeneral.getTipoBanco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoBanco(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoBanco() throws Exception {
		
		
	}
	
	public ArrayList<TipoBanco> getTipoBancosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoBanco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoBanco tipobancoAux:tipobancoLogic.getTipoBancos()) {
					if(tipobancoAux.getIsSelected()) {
						tipobancosSeleccionados.add(tipobancoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBanco tipobancoAux:this.tipobancos) {
					if(tipobancoAux.getIsSelected()) {
						tipobancosSeleccionados.add(tipobancoAux);				
					}
				}
			}
			
			if(tipobancosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipobancosSeleccionados.addAll(this.tipobancoLogic.getTipoBancos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipobancosSeleccionados.addAll(this.tipobancos);				
					}
				}
			}
		} else {
			tipobancosSeleccionados.add(this.tipobanco);
		}
		
		return tipobancosSeleccionados;
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
	
	public void generarReporteTipoBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBancosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBancosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoBancosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoBancosSeleccionados() throws Exception {
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();		
		
		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoBancos("Todos",tipobancosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoBancosSeleccionados() throws Exception {
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();		
		
		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoBancos("Todos",tipobancosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoBancosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();
		
		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoBancos("Todos",tipobancosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoBancosSeleccionados() throws Exception {
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoBanco();
		
		
		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoBanco();
		
		
		//this.generarReporteTipoBancos("Todos",tipobancosSeleccionados ,tipobancoImplementable,tipobancoImplementableHome);
	}
	
	public void mostrarImportacionTipoBancos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoBanco();
		
		this.abrirFrameImportacionTipoBanco();		
		
			
		//this.generarReporteTipoBancos("Todos",tipobancosSeleccionados ,tipobancoImplementable,tipobancoImplementableHome);
	}
	
	public void importarTipoBancos() throws Exception {		
	
	}
	
	public void exportarTipoBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoBancosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoBancosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoBancosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoBancosSeleccionados() throws Exception {
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();		
		
		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobanco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoBanco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoBanco tipobancoAux:tipobancosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoBanco(tipobancoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipobancoAux.setsDetalleGeneralEntityReporte(tipobancoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoBanco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoBancoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoConstantesFunciones.LABEL_CODIGOSRI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoConstantesFunciones.LABEL_ESDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoBanco(TipoBanco tipobanco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipobanco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobanco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobanco.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobanco.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobanco.getcodigo_sri();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobanco.getes_defecto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoBancosSeleccionados() throws Exception {
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();		
		
		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobanco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoBanco(row);				
				iRow++;
			}				
			
			for(TipoBanco tipobancoAux:tipobancosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoBanco(tipobancoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoBancosSeleccionados() throws Exception {
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();		
		
		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobanco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipobancos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipobanco");
			//elementRoot.appendChild(element);
		
			for(TipoBanco tipobancoAux:tipobancosSeleccionados) {
				element = document.createElement("tipobanco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoBanco(tipobancoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoBanco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoConstantesFunciones.LABEL_CODIGOSRI);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoConstantesFunciones.LABEL_ESDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoBanco(TipoBanco tipobanco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipobanco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobanco.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobanco.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobanco.getcodigo_sri());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobanco.getes_defecto());				
	}
	
	public void setFilaDatosExportarXmlTipoBanco(TipoBanco tipobanco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoBancoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipobanco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoBancoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipobanco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoBancoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipobanco.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoBancoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipobanco.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcodigo_sri = document.createElement(TipoBancoConstantesFunciones.CODIGOSRI);
		elementcodigo_sri.appendChild(document.createTextNode(tipobanco.getcodigo_sri().trim()));
		element.appendChild(elementcodigo_sri);

		Element elementes_defecto = document.createElement(TipoBancoConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(tipobanco.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);
	}
	
	public void generarReporteGroupGenericoTipoBancosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoBanco> tipobancosSeleccionados=new ArrayList<TipoBanco>();
		
		tipobancosSeleccionados=this.getTipoBancosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoBanco(tipobancosSeleccionados);
		
		this.generarReporteTipoBancos("Todos",tipobancosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoBanco(ArrayList<TipoBanco> tipobancosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoBanco tipobancoAux:tipobancosSeleccionados) {
				tipobancoAux.setsDetalleGeneralEntityReporte(tipobancoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipobancoAux.setsDescripcionGeneralEntityReporte1(tipobancoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipobancoAux.setsDescripcionGeneralEntityReporte1(tipobancoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_CODIGOSRI)) {
					existe=true;
					tipobancoAux.setsDescripcionGeneralEntityReporte1(tipobancoAux.getcodigo_sri());
				}
				 else if(sTipoSeleccionar.equals(TipoBancoConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					tipobancoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipobancoAux.getes_defecto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoBanco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoBanco=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoBanco=true;
				this.isVisibilidadCeldaGuardarCambiosTipoBanco=true;
			}
			
			this.isVisibilidadCeldaModificarTipoBanco=false;
			this.isVisibilidadCeldaActualizarTipoBanco=false;
			this.isVisibilidadCeldaEliminarTipoBanco=false;
			this.isVisibilidadCeldaCancelarTipoBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=false;
			this.isVisibilidadCeldaModificarTipoBanco=false;
			this.isVisibilidadCeldaActualizarTipoBanco=true;
			this.isVisibilidadCeldaEliminarTipoBanco=false;
			this.isVisibilidadCeldaCancelarTipoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=false;
			this.isVisibilidadCeldaModificarTipoBanco=false;
			this.isVisibilidadCeldaActualizarTipoBanco=true;
			this.isVisibilidadCeldaEliminarTipoBanco=true;
			this.isVisibilidadCeldaCancelarTipoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=false;
			this.isVisibilidadCeldaModificarTipoBanco=false;
			this.isVisibilidadCeldaActualizarTipoBanco=true;
			this.isVisibilidadCeldaEliminarTipoBanco=false;
			this.isVisibilidadCeldaCancelarTipoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=true;
			this.isVisibilidadCeldaModificarTipoBanco=false;
			this.isVisibilidadCeldaActualizarTipoBanco=false;
			this.isVisibilidadCeldaEliminarTipoBanco=false;
			this.isVisibilidadCeldaCancelarTipoBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=false;
			this.isVisibilidadCeldaActualizarTipoBanco=false;
			this.isVisibilidadCeldaEliminarTipoBanco=false;
			this.isVisibilidadCeldaCancelarTipoBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=false;
			this.isVisibilidadCeldaModificarTipoBanco=true;
			this.isVisibilidadCeldaActualizarTipoBanco=false;
			this.isVisibilidadCeldaEliminarTipoBanco=false;
			this.isVisibilidadCeldaCancelarTipoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBanco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoBancoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=true;
		} else {
			this.actualizarEstadoPanelsTipoBanco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoBanco=false;
			//this.isVisibilidadCeldaVerFormTipoBanco=false;
			this.isVisibilidadCeldaDuplicarTipoBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipobancoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipobancoSessionBean.getEsGuardarRelacionado()) {
			if(!tipobancoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoBanco=false;												
			}
			
			this.jButtonCerrarTipoBanco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBanco=false;
		}
		
		if(!this.permiteMantenimiento(this.tipobanco)) {
			this.isVisibilidadCeldaActualizarTipoBanco=false;
			this.isVisibilidadCeldaEliminarTipoBanco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBanco() {
		this.isVisibilidadCeldaNuevoTipoBanco=false;
		this.isVisibilidadCeldaGuardarCambiosTipoBanco=false;
	}
	
	public void actualizarEstadoPanelsTipoBanco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoBanco!=null) {
				this.jScrollPanelDatosEdicionTipoBanco.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBanco!=null) {
				this.jTabbedPaneBusquedasTipoBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBanco!=null) {
				this.jScrollPanelDatosTipoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBanco!=null) {
				this.jPanelPaginacionTipoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBanco!=null) {
				this.jPanelParametrosReportesTipoBanco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoBanco!=null) {
				this.jScrollPanelDatosEdicionTipoBanco.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBanco!=null) {
				this.jTabbedPaneBusquedasTipoBanco.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoBanco!=null) {
				this.jScrollPanelDatosTipoBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBanco!=null) {
				this.jPanelPaginacionTipoBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBanco!=null) {
				this.jPanelParametrosReportesTipoBanco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoBanco!=null) {
				this.jScrollPanelDatosEdicionTipoBanco.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBanco!=null) {
				this.jTabbedPaneBusquedasTipoBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBanco!=null) {
				this.jScrollPanelDatosTipoBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBanco!=null) {
				this.jPanelPaginacionTipoBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBanco!=null) {
				this.jPanelParametrosReportesTipoBanco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoBanco!=null) {
				this.jScrollPanelDatosEdicionTipoBanco.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBanco!=null) {
				this.jTabbedPaneBusquedasTipoBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBanco!=null) {
				this.jScrollPanelDatosTipoBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBanco!=null) {
				this.jPanelPaginacionTipoBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBanco!=null) {
				this.jPanelParametrosReportesTipoBanco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoBanco!=null) {
				this.jScrollPanelDatosEdicionTipoBanco.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBanco!=null) {
				this.jTabbedPaneBusquedasTipoBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBanco!=null) {
				this.jScrollPanelDatosTipoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBanco!=null) {
				this.jPanelPaginacionTipoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBanco!=null) {
				this.jPanelParametrosReportesTipoBanco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoBanco!=null) {
				this.jScrollPanelDatosEdicionTipoBanco.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBanco!=null) {
				this.jTabbedPaneBusquedasTipoBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBanco!=null) {
				this.jScrollPanelDatosTipoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBanco!=null) {
				this.jPanelPaginacionTipoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBanco!=null) {
				this.jPanelParametrosReportesTipoBanco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoBanco!=null) {
				this.jScrollPanelDatosEdicionTipoBanco.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBanco!=null) {
				this.jTabbedPaneBusquedasTipoBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBanco!=null) {
				this.jScrollPanelDatosTipoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBanco!=null) {
				this.jPanelPaginacionTipoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBanco!=null) {
				this.jPanelParametrosReportesTipoBanco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoBanco!=null) {
					this.jTabbedPaneBusquedasTipoBanco.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoBanco!=null) {
				this.jPanelParametrosReportesTipoBanco.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBanco!=null) {
				this.jTabbedPaneBusquedasTipoBanco.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoBanco!=null) {
				this.jPanelParametrosReportesTipoBanco.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoBanco.remove(jPanelBusquedaPorNombreTipoBanco);}
		}
		
	}
	
	

	public String registrarSesionTipoBancoParaBancos() throws Exception {
		Boolean isPaginaPopupBanco=false;

		try {

			if(this.tipobancoSessionBean==null) {
				this.tipobancoSessionBean=new TipoBancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoBanco.bancoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoBanco.bancoSessionBean=new BancoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoBanco.bancoSessionBean.setsPathNavegacionActual(tipobancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+BancoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoBanco.bancoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupBanco=this.jInternalFrameDetalleFormTipoBanco.bancoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoBanco.bancoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeBanco(true);
			this.jInternalFrameDetalleFormTipoBanco.bancoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeBanco(TipoBancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoBanco.bancoSessionBean.setisBusquedaDesdeForeignKeySesionTipoBanco(true);
			this.jInternalFrameDetalleFormTipoBanco.bancoSessionBean.setlidTipoBancoActual(this.idTipoBancoActual);

			tipobancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoBanco(true);
			tipobancoSessionBean.setlIdTipoBancoActualForeignKey(this.idTipoBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoBancoSessionBean tipobancoSessionBean=new TipoBancoSessionBean();
		
		if(this.tipobancoSessionBean==null) {
			this.tipobancoSessionBean=new TipoBancoSessionBean();
		}
		
		this.tipobancoSessionBean.setsUltimaBusquedaTipoBanco(this.getsAccionBusqueda());
		this.tipobancoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipobancoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipobancoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipobancoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoBancoSessionBean tipobancoSessionBean=new TipoBancoSessionBean();
		
		if(this.tipobancoSessionBean==null) {
			this.tipobancoSessionBean=new TipoBancoSessionBean();
		}
		
		if(this.tipobancoSessionBean.getsUltimaBusquedaTipoBanco()!=null&&!this.tipobancoSessionBean.getsUltimaBusquedaTipoBanco().equals("")) {
			this.setsAccionBusqueda(tipobancoSessionBean.getsUltimaBusquedaTipoBanco());
			this.setiNumeroPaginacion(tipobancoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipobancoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipobancoSessionBean.getnombre());
				tipobancoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipobancoSessionBean.getid_empresa());
				tipobancoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipobancoSessionBean.setsUltimaBusquedaTipoBanco("");
		this.tipobancoSessionBean.setiNumeroPaginacion(TipoBancoConstantesFunciones.INUMEROPAGINACION);
		this.tipobancoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoBanco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoBanco() {
		this.updateBorderResaltarBusquedasFormularioTipoBanco();
		this.updateVisibilidadBusquedasFormularioTipoBanco();
		this.updateHabilitarBusquedasFormularioTipoBanco();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoBanco() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoBanco.getComponents().length>0) {
	

		if(this.tipobancoConstantesFunciones.resaltarBusquedaPorNombreTipoBanco!=null) {
			index= this.jTabbedPaneBusquedasTipoBanco.indexOfComponent(this.jPanelBusquedaPorNombreTipoBanco);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBanco.getComponent(index);
				jPanel.setBorder(this.tipobancoConstantesFunciones.resaltarBusquedaPorNombreTipoBanco);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoBanco() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoBanco.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoBanco.indexOfComponent(this.jPanelBusquedaPorNombreTipoBanco);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBanco.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipobancoConstantesFunciones.mostrarBusquedaPorNombreTipoBanco);
			if(!this.tipobancoConstantesFunciones.mostrarBusquedaPorNombreTipoBanco && index>-1) {
				this.jTabbedPaneBusquedasTipoBanco.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoBanco() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoBanco.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoBanco.indexOfComponent(this.jPanelBusquedaPorNombreTipoBanco);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBanco.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipobancoConstantesFunciones.activarBusquedaPorNombreTipoBanco);
				this.jTabbedPaneBusquedasTipoBanco.setEnabledAt(index,this.tipobancoConstantesFunciones.activarBusquedaPorNombreTipoBanco);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoBanco(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoBanco.indexOfComponent(this.jPanelBusquedaPorNombreTipoBanco);

			this.jTabbedPaneBusquedasTipoBanco.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBanco.getComponent(index);

			this.tipobancoConstantesFunciones.setResaltarBusquedaPorNombreTipoBanco(resaltar);

			jPanel.setBorder(this.tipobancoConstantesFunciones.resaltarBusquedaPorNombreTipoBanco);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoBanco.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoBanco() throws Exception {

		if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoBanco();
		this.updateVisibilidadResaltarControlesFormularioTipoBanco();
		this.updateHabilitarResaltarControlesFormularioTipoBanco();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoBanco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipobancoConstantesFunciones.resaltaridTipoBanco!=null && this.jInternalFrameDetalleFormTipoBanco!=null) {this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.setBorder(this.tipobancoConstantesFunciones.resaltaridTipoBanco);}
		if(this.tipobancoConstantesFunciones.resaltarid_empresaTipoBanco!=null && this.jInternalFrameDetalleFormTipoBanco!=null) {this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.setBorder(this.tipobancoConstantesFunciones.resaltarid_empresaTipoBanco);}
		if(this.tipobancoConstantesFunciones.resaltarnombreTipoBanco!=null && this.jInternalFrameDetalleFormTipoBanco!=null) {this.jInternalFrameDetalleFormTipoBanco.jTextAreanombreTipoBanco.setBorder(this.tipobancoConstantesFunciones.resaltarnombreTipoBanco);}
		if(this.tipobancoConstantesFunciones.resaltarcodigo_sriTipoBanco!=null && this.jInternalFrameDetalleFormTipoBanco!=null) {this.jInternalFrameDetalleFormTipoBanco.jTextFieldcodigo_sriTipoBanco.setBorder(this.tipobancoConstantesFunciones.resaltarcodigo_sriTipoBanco);}
		if(this.tipobancoConstantesFunciones.resaltares_defectoTipoBanco!=null && this.jInternalFrameDetalleFormTipoBanco!=null) {this.jInternalFrameDetalleFormTipoBanco.jCheckBoxes_defectoTipoBanco.setBorderPainted(true);this.jInternalFrameDetalleFormTipoBanco.jCheckBoxes_defectoTipoBanco.setBorder(this.tipobancoConstantesFunciones.resaltares_defectoTipoBanco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoBanco() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) {
	
		//this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostraridTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jPanelidTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostraridTipoBanco);
		//this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostrarid_empresaTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jPanelid_empresaTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostrarid_empresaTipoBanco);
		//this.jInternalFrameDetalleFormTipoBanco.jTextAreanombreTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostrarnombreTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jPanelnombreTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostrarnombreTipoBanco);
		//this.jInternalFrameDetalleFormTipoBanco.jTextFieldcodigo_sriTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostrarcodigo_sriTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jPanelcodigo_sriTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostrarcodigo_sriTipoBanco);
		//this.jInternalFrameDetalleFormTipoBanco.jCheckBoxes_defectoTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostrares_defectoTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jPaneles_defectoTipoBanco.setVisible(this.tipobancoConstantesFunciones.mostrares_defectoTipoBanco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoBanco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBanco!=null) {
	
		this.jInternalFrameDetalleFormTipoBanco.jTextFieldidTipoBanco.setEnabled(this.tipobancoConstantesFunciones.activaridTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jComboBoxid_empresaTipoBanco.setEnabled(this.tipobancoConstantesFunciones.activarid_empresaTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jTextAreanombreTipoBanco.setEnabled(this.tipobancoConstantesFunciones.activarnombreTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jTextFieldcodigo_sriTipoBanco.setEnabled(this.tipobancoConstantesFunciones.activarcodigo_sriTipoBanco);
		this.jInternalFrameDetalleFormTipoBanco.jCheckBoxes_defectoTipoBanco.setEnabled(this.tipobancoConstantesFunciones.activares_defectoTipoBanco);
		}
	}
	
		
}