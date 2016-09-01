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

import com.bydan.erp.tesoreria.util.BancoTipoCuentaBancoGlobalConstantesFunciones;
import com.bydan.erp.tesoreria.util.BancoTipoCuentaBancoGlobalParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.BancoTipoCuentaBancoGlobalParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.BancoTipoCuentaBancoGlobalBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame extends BancoTipoCuentaBancoGlobalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalValidator = new ClassValidator<BancoTipoCuentaBancoGlobal>(BancoTipoCuentaBancoGlobal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal;	
	public BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux;
	public BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalTotales;
	public Long idBancoTipoCuentaBancoGlobalActual;
	public Long iIdNuevoBancoTipoCuentaBancoGlobal=0L;
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

	public String sFinalQueryComboTipoCuentaBancoGlobal="";

	public List<TipoCuentaBancoGlobal> tipocuentabancoglobalsForeignKey;

	public List<TipoCuentaBancoGlobal> gettipocuentabancoglobalsForeignKey() {
		return tipocuentabancoglobalsForeignKey;
	}

	public void settipocuentabancoglobalsForeignKey(List<TipoCuentaBancoGlobal> tipocuentabancoglobalsForeignKey) {
		this.tipocuentabancoglobalsForeignKey = tipocuentabancoglobalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCuentaBancoGlobal tipocuentabancoglobalForeignKey;

	public TipoCuentaBancoGlobal gettipocuentabancoglobalForeignKey() {
		return tipocuentabancoglobalForeignKey;
	}

	public void settipocuentabancoglobalForeignKey(TipoCuentaBancoGlobal tipocuentabancoglobalForeignKey) {
		this.tipocuentabancoglobalForeignKey = tipocuentabancoglobalForeignKey;
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
	
	public Boolean isPermisoTodoBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoNuevoBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoActualizarBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoActualizarOriginalBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoEliminarBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoConsultaBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoBusquedaBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoReporteBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoPaginacionAltoBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoCopiarBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoVerFormBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoDuplicarBancoTipoCuentaBancoGlobal;
	public Boolean isPermisoOrdenBancoTipoCuentaBancoGlobal;
	
	
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
	
	public BancoTipoCuentaBancoGlobalParameterReturnGeneral bancotipocuentabancoglobalReturnGeneral;
	public BancoTipoCuentaBancoGlobalParameterReturnGeneral bancotipocuentabancoglobalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBancoTipoCuentaBancoGlobal=false;
	public Boolean esParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BancoTipoCuentaBancoGlobalSessionBeanAdditional bancotipocuentabancoglobalSessionBeanAdditional=null;
	
	public BancoTipoCuentaBancoGlobalSessionBeanAdditional getBancoTipoCuentaBancoGlobalSessionBeanAdditional() {
		return this.bancotipocuentabancoglobalSessionBeanAdditional;
	}
	
	public void setBancoTipoCuentaBancoGlobalSessionBeanAdditional(BancoTipoCuentaBancoGlobalSessionBeanAdditional bancotipocuentabancoglobalSessionBeanAdditional) {
		try {
			this.bancotipocuentabancoglobalSessionBeanAdditional=bancotipocuentabancoglobalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional bancotipocuentabancoglobalBeanSwingJInternalFrameAdditional=null;
	//public class BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame
	
	public BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional getBancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional() {
		return this.bancotipocuentabancoglobalBeanSwingJInternalFrameAdditional;
	}
	
	public void setBancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional(BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional bancotipocuentabancoglobalBeanSwingJInternalFrameAdditional) {
		try {
			this.bancotipocuentabancoglobalBeanSwingJInternalFrameAdditional=bancotipocuentabancoglobalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BancoTipoCuentaBancoGlobalLogic bancotipocuentabancoglobalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalBean;
	public BancoTipoCuentaBancoGlobalConstantesFunciones bancotipocuentabancoglobalConstantesFunciones;
	//public BancoTipoCuentaBancoGlobalParameterReturnGeneral bancotipocuentabancoglobalReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public BancoLogic bancoLogic;
	public TipoCuentaBancoGlobalLogic tipocuentabancoglobalLogic;
	
	//PARAMETROS
	
	
	//public List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobals;	
	//public List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsEliminados;
	//public List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal=true;
	public Boolean isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal=true;
	public Boolean isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal=true;
	public Boolean isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=false;	
	
	
	public Boolean isVisibilidadFK_IdBanco=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoCuentaBancoGlobal=false;
	
	public Long getiIdNuevoBancoTipoCuentaBancoGlobal() {
		return this.iIdNuevoBancoTipoCuentaBancoGlobal;
	}

	public void setiIdNuevoBancoTipoCuentaBancoGlobal(Long iIdNuevoBancoTipoCuentaBancoGlobal) {
		this.iIdNuevoBancoTipoCuentaBancoGlobal = iIdNuevoBancoTipoCuentaBancoGlobal;
	}
	
	public Long getidBancoTipoCuentaBancoGlobalActual() {
		return this.idBancoTipoCuentaBancoGlobalActual;
	}

	public void setidBancoTipoCuentaBancoGlobalActual(Long idBancoTipoCuentaBancoGlobalActual) {
		this.idBancoTipoCuentaBancoGlobalActual = idBancoTipoCuentaBancoGlobalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public BancoTipoCuentaBancoGlobal getbancotipocuentabancoglobal() {
		return this.bancotipocuentabancoglobal;
	}

	public void setbancotipocuentabancoglobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal) {
		this.bancotipocuentabancoglobal = bancotipocuentabancoglobal;
	}
	
	public BancoTipoCuentaBancoGlobal getbancotipocuentabancoglobalAux() {
		return this.bancotipocuentabancoglobalAux;
	}

	public void setbancotipocuentabancoglobalAux(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux) {
		this.bancotipocuentabancoglobalAux = bancotipocuentabancoglobalAux;
	}				
	
	public BancoTipoCuentaBancoGlobal getbancotipocuentabancoglobalAnterior() {
		return this.bancotipocuentabancoglobalAnterior;
	}

	public void setbancotipocuentabancoglobalAnterior(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAnterior) {
		this.bancotipocuentabancoglobalAnterior = bancotipocuentabancoglobalAnterior;
	}	
	
	public BancoTipoCuentaBancoGlobal getbancotipocuentabancoglobalTotales() {
		return this.bancotipocuentabancoglobalTotales;
	}

	public void setbancotipocuentabancoglobalTotales(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalTotales) {
		this.bancotipocuentabancoglobalTotales = bancotipocuentabancoglobalTotales;
	}	
	
	public BancoTipoCuentaBancoGlobal getbancotipocuentabancoglobalBean() {
		return this.bancotipocuentabancoglobalBean;
	}

	public void setbancotipocuentabancoglobalBean(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalBean) {
		this.bancotipocuentabancoglobalBean = bancotipocuentabancoglobalBean;
	}	
	
	public BancoTipoCuentaBancoGlobalParameterReturnGeneral getbancotipocuentabancoglobalReturnGeneral() {
		return this.bancotipocuentabancoglobalReturnGeneral;
	}

	public void setbancotipocuentabancoglobalReturnGeneral(BancoTipoCuentaBancoGlobalParameterReturnGeneral bancotipocuentabancoglobalReturnGeneral) {
		this.bancotipocuentabancoglobalReturnGeneral = bancotipocuentabancoglobalReturnGeneral;
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

	public Long id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal=-1L;

	public Long getid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal() {
		return this.id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal;
	}

	public void setid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal(Long id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal) {
		this.id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal = id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public BancoTipoCuentaBancoGlobalLogic getBancoTipoCuentaBancoGlobalLogic()	{		
		return bancotipocuentabancoglobalLogic;
	}

	public void setBancoTipoCuentaBancoGlobalLogic(BancoTipoCuentaBancoGlobalLogic bancotipocuentabancoglobalLogic) {
		this.bancotipocuentabancoglobalLogic = bancotipocuentabancoglobalLogic;
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
	
	public Boolean getIsEsNuevoBancoTipoCuentaBancoGlobal() {
		return isEsNuevoBancoTipoCuentaBancoGlobal;
	}

	public void setIsEsNuevoBancoTipoCuentaBancoGlobal(Boolean isEsNuevoBancoTipoCuentaBancoGlobal) {
		this.isEsNuevoBancoTipoCuentaBancoGlobal = isEsNuevoBancoTipoCuentaBancoGlobal;
	}

	public Boolean getEsParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal() {
		return esParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal;
	}
	
	public void setEsParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal(Boolean esParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal) {
		this.esParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal = esParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal;
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

			if(this.bancotipocuentabancoglobalSessionBean==null) {
				this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
			}

			if(!this.bancotipocuentabancoglobalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(bancotipocuentabancoglobalSessionBean.getlidEmpresaActual());
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

			if(this.bancotipocuentabancoglobalSessionBean==null) {
				this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
			}

			if(!this.bancotipocuentabancoglobalSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
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
					bancoLogic.getEntityWithConnection(bancotipocuentabancoglobalSessionBean.getlidBancoActual());
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

	public void cargarCombosTipoCuentaBancoGlobalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocuentabancoglobalsForeignKey=new ArrayList<TipoCuentaBancoGlobal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCuentaBancoGlobalLogic tipocuentabancoglobalLogic=new TipoCuentaBancoGlobalLogic();

			//tipocuentabancoglobalLogic.getTipoCuentaBancoGlobalDataAccess().setIsForForeingKeyData(true);

			if(this.bancotipocuentabancoglobalSessionBean==null) {
				this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
			}

			if(!this.bancotipocuentabancoglobalSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocuentabancoglobalLogic.getTipoCuentaBancoGlobalDataAccess().setIsForForeingKeyData(true);

					tipocuentabancoglobalLogic.getTodosTipoCuentaBancoGlobalsWithConnection(sFinalQuery,new Pagination());

					this.tipocuentabancoglobalsForeignKey=tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCuentaBancoGlobal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancoglobalLogic.getEntityWithConnection(bancotipocuentabancoglobalSessionBean.getlidTipoCuentaBancoGlobalActual());
					this.tipocuentabancoglobalsForeignKey.add(tipocuentabancoglobalLogic.getTipoCuentaBancoGlobal());
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

					if(this.bancotipocuentabancoglobal!=null) {
						this.bancotipocuentabancoglobal.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
						this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaBancoTipoCuentaBancoGlobalGenerico)throws Exception
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
				jComboBoxid_empresaBancoTipoCuentaBancoGlobalGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaBancoTipoCuentaBancoGlobalGenerico!=null && jComboBoxid_empresaBancoTipoCuentaBancoGlobalGenerico.getItemCount()>0) {
					jComboBoxid_empresaBancoTipoCuentaBancoGlobalGenerico.setSelectedIndex(0);
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

					if(this.bancotipocuentabancoglobal!=null) {
						this.bancotipocuentabancoglobal.setBanco(bancoTemp);
					}

					if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
						this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setSelectedItem(bancoTemp);
					}
				} else {
					//jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setSelectedItem(bancoTemp);
					if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(bancoTemp!=null && jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal!=null) {
						jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setSelectedItem(bancoTemp);
					} else {
						if(jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal!=null) {
							//jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setSelectedItem(bancoTemp);
							if(jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.getItemCount()>0) {
								jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setSelectedIndex(0);
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
	public void setActualBancoForeignKeyGenerico(Long idBancoSeleccionado,JComboBox jComboBoxid_bancoBancoTipoCuentaBancoGlobalGenerico)throws Exception
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
				jComboBoxid_bancoBancoTipoCuentaBancoGlobalGenerico.setSelectedItem(bancoTemp);
			} else {
				if(jComboBoxid_bancoBancoTipoCuentaBancoGlobalGenerico!=null && jComboBoxid_bancoBancoTipoCuentaBancoGlobalGenerico.getItemCount()>0) {
					jComboBoxid_bancoBancoTipoCuentaBancoGlobalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCuentaBancoGlobalForeignKey(Long idTipoCuentaBancoGlobalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCuentaBancoGlobal  tipocuentabancoglobalTemp=null;

			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsForeignKey) {
				if(tipocuentabancoglobalAux.getId()!=null && tipocuentabancoglobalAux.getId().equals(idTipoCuentaBancoGlobalSeleccionado)) {
					tipocuentabancoglobalTemp=tipocuentabancoglobalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocuentabancoglobalTemp!=null) {

					if(this.bancotipocuentabancoglobal!=null) {
						this.bancotipocuentabancoglobal.setTipoCuentaBancoGlobal(tipocuentabancoglobalTemp);
					}

					if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
						this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setSelectedItem(tipocuentabancoglobalTemp);
					}
				} else {
					//jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setSelectedItem(tipocuentabancoglobalTemp);
					if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.getItemCount()>0) {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaBancoGlobal") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocuentabancoglobalTemp!=null && jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal!=null) {
						jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setSelectedItem(tipocuentabancoglobalTemp);
					} else {
						if(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal!=null) {
							//jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setSelectedItem(tipocuentabancoglobalTemp);
							if(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.getItemCount()>0) {
								jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setSelectedIndex(0);
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

	public String getActualTipoCuentaBancoGlobalForeignKeyDescripcion(Long idTipoCuentaBancoGlobalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCuentaBancoGlobal  tipocuentabancoglobalTemp=null;

			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsForeignKey) {
				if(tipocuentabancoglobalAux.getId()!=null && tipocuentabancoglobalAux.getId().equals(idTipoCuentaBancoGlobalSeleccionado)) {
					tipocuentabancoglobalTemp=tipocuentabancoglobalAux;
					break;
				}
			}


			sDescripcion=TipoCuentaBancoGlobalConstantesFunciones.getTipoCuentaBancoGlobalDescripcion(tipocuentabancoglobalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCuentaBancoGlobalForeignKeyGenerico(Long idTipoCuentaBancoGlobalSeleccionado,JComboBox jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalGenerico)throws Exception
	{
		try
		{
			TipoCuentaBancoGlobal  tipocuentabancoglobalTemp=null;

			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsForeignKey) {
				if(tipocuentabancoglobalAux.getId()!=null && tipocuentabancoglobalAux.getId().equals(idTipoCuentaBancoGlobalSeleccionado)) {
					tipocuentabancoglobalTemp=tipocuentabancoglobalAux;
					break;
				}
			}

			if(tipocuentabancoglobalTemp!=null) {
				jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalGenerico.setSelectedItem(tipocuentabancoglobalTemp);
			} else {
				if(jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalGenerico!=null && jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalGenerico.getItemCount()>0) {
					jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,JComboBox jComboBoxid_empresaBancoTipoCuentaBancoGlobalGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaBancoTipoCuentaBancoGlobalGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaBancoTipoCuentaBancoGlobalGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				bancotipocuentabancoglobal.setid_empresa(empresaAux.getId());
				bancotipocuentabancoglobal.setempresa_descripcion(BancoTipoCuentaBancoGlobalConstantesFunciones.getEmpresaDescripcion(empresaAux));
				bancotipocuentabancoglobal.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBancoForeignKey(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,JComboBox jComboBoxid_bancoBancoTipoCuentaBancoGlobalGenerico)throws Exception
	{
		try
		{
			Banco  bancoAux=new Banco();

			if(jComboBoxid_bancoBancoTipoCuentaBancoGlobalGenerico==null) {
				bancoAux=(Banco)this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.getSelectedItem();
			} else {
				bancoAux=(Banco)jComboBoxid_bancoBancoTipoCuentaBancoGlobalGenerico.getSelectedItem();
			}

			if(bancoAux!=null && bancoAux.getId()!=null) {
				bancotipocuentabancoglobal.setid_banco(bancoAux.getId());
				bancotipocuentabancoglobal.setbanco_descripcion(BancoTipoCuentaBancoGlobalConstantesFunciones.getBancoDescripcion(bancoAux));
				bancotipocuentabancoglobal.setBanco(bancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCuentaBancoGlobalForeignKey(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,JComboBox jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalGenerico)throws Exception
	{
		try
		{
			TipoCuentaBancoGlobal  tipocuentabancoglobalAux=new TipoCuentaBancoGlobal();

			if(jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalGenerico==null) {
				tipocuentabancoglobalAux=(TipoCuentaBancoGlobal)this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.getSelectedItem();
			} else {
				tipocuentabancoglobalAux=(TipoCuentaBancoGlobal)jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalGenerico.getSelectedItem();
			}

			if(tipocuentabancoglobalAux!=null && tipocuentabancoglobalAux.getId()!=null) {
				bancotipocuentabancoglobal.setid_tipo_cuenta_banco_global(tipocuentabancoglobalAux.getId());
				bancotipocuentabancoglobal.settipocuentabancoglobal_descripcion(BancoTipoCuentaBancoGlobalConstantesFunciones.getTipoCuentaBancoGlobalDescripcion(tipocuentabancoglobalAux));
				bancotipocuentabancoglobal.setTipoCuentaBancoGlobal(tipocuentabancoglobalAux);			}
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

					if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { 
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { 
					}

					if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
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

					if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { 
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.addItem(banco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { 
					}

					if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.addItem(banco);
							}
						}

						if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCuentaBancoGlobalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCuentaBancoGlobal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { 
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.removeAllItems();

							for(TipoCuentaBancoGlobal tipocuentabancoglobal:this.tipocuentabancoglobalsForeignKey) {
								this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.addItem(tipocuentabancoglobal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { 
					}

					if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaBancoGlobal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.removeAllItems();

							for(TipoCuentaBancoGlobal tipocuentabancoglobal:this.tipocuentabancoglobalsForeignKey) {
								this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.addItem(tipocuentabancoglobal);
							}
						}

						if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setSelectedItem(banco);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setSelectedItem(banco);
						} else {
							this.jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCuentaBancoGlobalForeignKey(TipoCuentaBancoGlobal tipocuentabancoglobal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setSelectedItem(tipocuentabancoglobal);
						}
					} else {
						if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setSelectedItem(tipocuentabancoglobal);
						} else {
							this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesBancoTipoCuentaBancoGlobal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			BancoTipoCuentaBancoGlobalConstantesFunciones.refrescarForeignKeysDescripcionesBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			BancoTipoCuentaBancoGlobalConstantesFunciones.refrescarForeignKeysDescripcionesBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Banco.class));
		classes.add(new Classe(TipoCuentaBancoGlobal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(this.bancotipocuentabancoglobals);
			bancotipocuentabancoglobalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public BancoTipoCuentaBancoGlobalParameterReturnGeneral getBancoTipoCuentaBancoGlobalParameterGeneral() {
		return this.bancotipocuentabancoglobalParameterGeneral;
	}
	
	public void setBancoTipoCuentaBancoGlobalParameterGeneral(BancoTipoCuentaBancoGlobalParameterReturnGeneral bancotipocuentabancoglobalParameterGeneral) {
		this.bancotipocuentabancoglobalParameterGeneral = bancotipocuentabancoglobalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoBancoTipoCuentaBancoGlobal() {
		return isPermisoTodoBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoTodoBancoTipoCuentaBancoGlobal(Boolean isPermisoTodoBancoTipoCuentaBancoGlobal) {
		this.isPermisoTodoBancoTipoCuentaBancoGlobal = isPermisoTodoBancoTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoNuevoBancoTipoCuentaBancoGlobal() {
		return isPermisoNuevoBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoNuevoBancoTipoCuentaBancoGlobal(Boolean isPermisoNuevoBancoTipoCuentaBancoGlobal) {
		this.isPermisoNuevoBancoTipoCuentaBancoGlobal = isPermisoNuevoBancoTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoActualizarBancoTipoCuentaBancoGlobal() {
		return isPermisoActualizarBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoActualizarBancoTipoCuentaBancoGlobal(Boolean isPermisoActualizarBancoTipoCuentaBancoGlobal) {
		this.isPermisoActualizarBancoTipoCuentaBancoGlobal = isPermisoActualizarBancoTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoEliminarBancoTipoCuentaBancoGlobal() {
		return isPermisoEliminarBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoEliminarBancoTipoCuentaBancoGlobal(Boolean isPermisoEliminarBancoTipoCuentaBancoGlobal) {
		this.isPermisoEliminarBancoTipoCuentaBancoGlobal = isPermisoEliminarBancoTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoGuardarCambiosBancoTipoCuentaBancoGlobal() {
		return isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoGuardarCambiosBancoTipoCuentaBancoGlobal(Boolean isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal) {
		this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal = isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoConsultaBancoTipoCuentaBancoGlobal() {
		return isPermisoConsultaBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoConsultaBancoTipoCuentaBancoGlobal(Boolean isPermisoConsultaBancoTipoCuentaBancoGlobal) {
		this.isPermisoConsultaBancoTipoCuentaBancoGlobal = isPermisoConsultaBancoTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoBusquedaBancoTipoCuentaBancoGlobal() {
		return isPermisoBusquedaBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoBusquedaBancoTipoCuentaBancoGlobal(Boolean isPermisoBusquedaBancoTipoCuentaBancoGlobal) {
		this.isPermisoBusquedaBancoTipoCuentaBancoGlobal = isPermisoBusquedaBancoTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoReporteBancoTipoCuentaBancoGlobal() {
		return isPermisoReporteBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoReporteBancoTipoCuentaBancoGlobal(Boolean isPermisoReporteBancoTipoCuentaBancoGlobal) {
		this.isPermisoReporteBancoTipoCuentaBancoGlobal = isPermisoReporteBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoPaginacionMedioBancoTipoCuentaBancoGlobal() {
		return isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoPaginacionMedioBancoTipoCuentaBancoGlobal(Boolean isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal) {
		this.isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal = isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoPaginacionTodoBancoTipoCuentaBancoGlobal() {
		return isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoPaginacionTodoBancoTipoCuentaBancoGlobal(Boolean isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal) {
		this.isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal = isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoPaginacionAltoBancoTipoCuentaBancoGlobal() {
		return isPermisoPaginacionAltoBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoPaginacionAltoBancoTipoCuentaBancoGlobal(Boolean isPermisoPaginacionAltoBancoTipoCuentaBancoGlobal) {
		this.isPermisoPaginacionAltoBancoTipoCuentaBancoGlobal = isPermisoPaginacionAltoBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoCopiarBancoTipoCuentaBancoGlobal() {
		return isPermisoCopiarBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoCopiarBancoTipoCuentaBancoGlobal(Boolean isPermisoCopiarBancoTipoCuentaBancoGlobal) {
		this.isPermisoCopiarBancoTipoCuentaBancoGlobal = isPermisoCopiarBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoVerFormBancoTipoCuentaBancoGlobal() {
		return isPermisoVerFormBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoVerFormBancoTipoCuentaBancoGlobal(Boolean isPermisoVerFormBancoTipoCuentaBancoGlobal) {
		this.isPermisoVerFormBancoTipoCuentaBancoGlobal = isPermisoVerFormBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoDuplicarBancoTipoCuentaBancoGlobal() {
		return isPermisoDuplicarBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoDuplicarBancoTipoCuentaBancoGlobal(Boolean isPermisoDuplicarBancoTipoCuentaBancoGlobal) {
		this.isPermisoDuplicarBancoTipoCuentaBancoGlobal = isPermisoDuplicarBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoOrdenBancoTipoCuentaBancoGlobal() {
		return isPermisoOrdenBancoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoOrdenBancoTipoCuentaBancoGlobal(Boolean isPermisoOrdenBancoTipoCuentaBancoGlobal) {
		this.isPermisoOrdenBancoTipoCuentaBancoGlobal = isPermisoOrdenBancoTipoCuentaBancoGlobal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal = isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal = isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal = isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal = isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal = isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal = isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal = isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal = isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal;
	}

	public Boolean getIsVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal = isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal;
	}

	public Boolean getIsVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal = isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal;
	}

	public Boolean getIsVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal = isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal = isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal;
	}
		
	public BancoTipoCuentaBancoGlobalSessionBean getbancotipocuentabancoglobalSessionBean() {
		return this.bancotipocuentabancoglobalSessionBean;
	}
	
	public void setbancotipocuentabancoglobalSessionBean(BancoTipoCuentaBancoGlobalSessionBean bancotipocuentabancoglobalSessionBean) {
		this.bancotipocuentabancoglobalSessionBean=bancotipocuentabancoglobalSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoCuentaBancoGlobal() {
		return this.isVisibilidadFK_IdTipoCuentaBancoGlobal;
	}

	public void setisVisibilidadFK_IdTipoCuentaBancoGlobal(Boolean isVisibilidadFK_IdTipoCuentaBancoGlobal) {
		this.isVisibilidadFK_IdTipoCuentaBancoGlobal=isVisibilidadFK_IdTipoCuentaBancoGlobal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(bancotipocuentabancoglobal,null);
				this.setActualParaGuardarBancoForeignKey(bancotipocuentabancoglobal,null);
				this.setActualParaGuardarTipoCuentaBancoGlobalForeignKey(bancotipocuentabancoglobal,null);
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
	
	public void bugActualizarReferenciaActual(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		bancotipocuentabancoglobalAux.setId(bancotipocuentabancoglobal.getId());
		bancotipocuentabancoglobalAux.setVersionRow(bancotipocuentabancoglobal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessBancoTipoCuentaBancoGlobal();
		
			int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = bancotipocuentabancoglobalValidator.getInvalidValues(this.bancotipocuentabancoglobal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			bancotipocuentabancoglobalLogic.setDatosCliente(datosCliente);
			bancotipocuentabancoglobalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				bancotipocuentabancoglobalAux=new  BancoTipoCuentaBancoGlobal();
				
				bancotipocuentabancoglobalAux.setIsNew(true);
				bancotipocuentabancoglobalAux.setIsChanged(true);
				
				bancotipocuentabancoglobalAux.setBancoTipoCuentaBancoGlobalOriginal(this.bancotipocuentabancoglobal);
				
				bancotipocuentabancoglobalAux.setId(this.bancotipocuentabancoglobal.getId());	
				bancotipocuentabancoglobalAux.setVersionRow(this.bancotipocuentabancoglobal.getVersionRow());	
				bancotipocuentabancoglobalAux.setid_empresa(this.bancotipocuentabancoglobal.getid_empresa());	
				bancotipocuentabancoglobalAux.setid_banco(this.bancotipocuentabancoglobal.getid_banco());	
				bancotipocuentabancoglobalAux.setid_tipo_cuenta_banco_global(this.bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalLogic.saveBancoTipoCuentaBancoGlobals();//WithConnection
						//bancotipocuentabancoglobalLogic.getSetVersionRowBancoTipoCuentaBancoGlobals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bancotipocuentabancoglobal,bancotipocuentabancoglobalAux);
					
					this.refrescarForeignKeysDescripcionesBancoTipoCuentaBancoGlobal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bancotipocuentabancoglobalLogic.saveBancoTipoCuentaBancoGlobalRelaciones(bancotipocuentabancoglobalAux);//WithConnection
								//bancotipocuentabancoglobalLogic.getSetVersionRowBancoTipoCuentaBancoGlobals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bancotipocuentabancoglobal,bancotipocuentabancoglobalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bancotipocuentabancoglobal,bancotipocuentabancoglobalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				bancotipocuentabancoglobalAux=new  BancoTipoCuentaBancoGlobal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado() 
					|| (this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado() && this.bancotipocuentabancoglobal.getId()>=0)) {
						
					bancotipocuentabancoglobalAux.setIsNew(false);
				}
				
				bancotipocuentabancoglobalAux.setIsDeleted(false);
			
				bancotipocuentabancoglobalAux.setId(this.bancotipocuentabancoglobal.getId());	
				bancotipocuentabancoglobalAux.setVersionRow(this.bancotipocuentabancoglobal.getVersionRow());	
				bancotipocuentabancoglobalAux.setid_empresa(this.bancotipocuentabancoglobal.getid_empresa());	
				bancotipocuentabancoglobalAux.setid_banco(this.bancotipocuentabancoglobal.getid_banco());	
				bancotipocuentabancoglobalAux.setid_tipo_cuenta_banco_global(this.bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalLogic.saveBancoTipoCuentaBancoGlobals();//WithConnection
						//bancotipocuentabancoglobalLogic.getSetVersionRowBancoTipoCuentaBancoGlobals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bancotipocuentabancoglobal,bancotipocuentabancoglobalAux);
					
					this.refrescarForeignKeysDescripcionesBancoTipoCuentaBancoGlobal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bancotipocuentabancoglobalLogic.saveBancoTipoCuentaBancoGlobalRelaciones(bancotipocuentabancoglobalAux);//WithConnection
								//bancotipocuentabancoglobalLogic.getSetVersionRowBancoTipoCuentaBancoGlobals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bancotipocuentabancoglobal,bancotipocuentabancoglobalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bancotipocuentabancoglobal,bancotipocuentabancoglobalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				bancotipocuentabancoglobalAux=new  BancoTipoCuentaBancoGlobal();
				
				bancotipocuentabancoglobalAux.setIsNew(false);
				bancotipocuentabancoglobalAux.setIsChanged(false);
				
				bancotipocuentabancoglobalAux.setIsDeleted(true);
				
				bancotipocuentabancoglobalAux.setId(this.bancotipocuentabancoglobal.getId());	
				bancotipocuentabancoglobalAux.setVersionRow(this.bancotipocuentabancoglobal.getVersionRow());	
				bancotipocuentabancoglobalAux.setid_empresa(this.bancotipocuentabancoglobal.getid_empresa());	
				bancotipocuentabancoglobalAux.setid_banco(this.bancotipocuentabancoglobal.getid_banco());	
				bancotipocuentabancoglobalAux.setid_tipo_cuenta_banco_global(this.bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global());	
				
				if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.bancotipocuentabancoglobalAux.getId()>=0) {	
						this.bancotipocuentabancoglobalsEliminados.add(bancotipocuentabancoglobalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalLogic.saveBancoTipoCuentaBancoGlobals();//WithConnection
						//bancotipocuentabancoglobalLogic.getSetVersionRowBancoTipoCuentaBancoGlobals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bancotipocuentabancoglobalLogic.saveBancoTipoCuentaBancoGlobalRelaciones(bancotipocuentabancoglobalAux);//WithConnection
								//bancotipocuentabancoglobalLogic.getSetVersionRowBancoTipoCuentaBancoGlobals();//WithConnection
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
							if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(bancotipocuentabancoglobalAux,bancotipocuentabancoglobals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().addAll(this.bancotipocuentabancoglobalsEliminados);
					
					bancotipocuentabancoglobalLogic.saveBancoTipoCuentaBancoGlobals();//WithConnection
					//bancotipocuentabancoglobalLogic.getSetVersionRowBancoTipoCuentaBancoGlobals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesBancoTipoCuentaBancoGlobal();
				
				this.bancotipocuentabancoglobalsEliminados= new ArrayList<BancoTipoCuentaBancoGlobal>();		
			}
			
			if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Banco Tipo Cuenta Banco Global GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.bancotipocuentabancoglobal=bancotipocuentabancoglobalAux;
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
      		//this.finishProcessBancoTipoCuentaBancoGlobal();
      	}
		
	}	
	
	public void actualizarRelaciones(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalLocal) throws Exception {
		
		if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalLocal) throws Exception {	
		if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				bancotipocuentabancoglobalLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BancoDetalleFormJInternalFrame.class)) {
				BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrameLocal=(BancoBeanSwingJInternalFrame) ((BancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBanco(bancoBeanSwingJInternalFrameLocal.getbanco(),true);
				bancoBeanSwingJInternalFrameLocal.actualizarLista(bancoBeanSwingJInternalFrameLocal.banco,this.bancosForeignKey);

				bancoBeanSwingJInternalFrameLocal.actualizarRelaciones(bancoBeanSwingJInternalFrameLocal.banco);

				bancotipocuentabancoglobalLocal.setBanco(bancoBeanSwingJInternalFrameLocal.banco);

				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey("Formulario");
				this.setActualBancoForeignKey(bancoBeanSwingJInternalFrameLocal.banco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCuentaBancoGlobalDetalleFormJInternalFrame.class)) {
				TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrameLocal=(TipoCuentaBancoGlobalBeanSwingJInternalFrame) ((TipoCuentaBancoGlobalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocuentabancoglobalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCuentaBancoGlobal(tipocuentabancoglobalBeanSwingJInternalFrameLocal.gettipocuentabancoglobal(),true);
				tipocuentabancoglobalBeanSwingJInternalFrameLocal.actualizarLista(tipocuentabancoglobalBeanSwingJInternalFrameLocal.tipocuentabancoglobal,this.tipocuentabancoglobalsForeignKey);

				tipocuentabancoglobalBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocuentabancoglobalBeanSwingJInternalFrameLocal.tipocuentabancoglobal);

				bancotipocuentabancoglobalLocal.setTipoCuentaBancoGlobal(tipocuentabancoglobalBeanSwingJInternalFrameLocal.tipocuentabancoglobal);

				this.addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal();
				this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey("Formulario");
				this.setActualTipoCuentaBancoGlobalForeignKey(tipocuentabancoglobalBeanSwingJInternalFrameLocal.tipocuentabancoglobal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBancoTipoCuentaBancoGlobalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = bancotipocuentabancoglobalValidator.getInvalidValues(this.bancotipocuentabancoglobal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobals) throws Exception {
		try	{		
			BancoTipoCuentaBancoGlobalConstantesFunciones.actualizarLista(bancotipocuentabancoglobal,bancotipocuentabancoglobals,this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobals) throws Exception {
		try	{			
			BancoTipoCuentaBancoGlobalConstantesFunciones.actualizarSelectedLista(bancotipocuentabancoglobal,bancotipocuentabancoglobals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				bancotipocuentabancoglobalsLocal=this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				bancotipocuentabancoglobalsLocal=this.bancotipocuentabancoglobals;
			}
			//ARCHITECTURE
		
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalLocal:bancotipocuentabancoglobalsLocal) {
				if(this.permiteMantenimiento(bancotipocuentabancoglobalLocal) && bancotipocuentabancoglobalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+BancoTipoCuentaBancoGlobalConstantesFunciones.getBancoTipoCuentaBancoGlobalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BancoTipoCuentaBancoGlobalConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelid_empresaBancoTipoCuentaBancoGlobal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoTipoCuentaBancoGlobalConstantesFunciones.IDBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelid_bancoBancoTipoCuentaBancoGlobal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BancoTipoCuentaBancoGlobalConstantesFunciones.IDTIPOCUENTABANCOGLOBAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelid_empresaBancoTipoCuentaBancoGlobal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelid_bancoBancoTipoCuentaBancoGlobal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal,"");
		
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
		this.iIdNuevoBancoTipoCuentaBancoGlobal--;	
		
		
		this.bancotipocuentabancoglobalAux=new BancoTipoCuentaBancoGlobal();
		
		this.bancotipocuentabancoglobalAux.setId(this.iIdNuevoBancoTipoCuentaBancoGlobal);
		this.bancotipocuentabancoglobalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().add(this.bancotipocuentabancoglobalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.bancotipocuentabancoglobals.add(this.bancotipocuentabancoglobalAux);
		}
		//ARCHITECTURE
		
		this.bancotipocuentabancoglobal=this.bancotipocuentabancoglobalAux;
		
		if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
			this.setVariablesObjetoActualToFormularioForeignKeyBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
		}
				
		//this.setDefaultControlesBancoTipoCuentaBancoGlobal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBancoTipoCuentaBancoGlobal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBancoTipoCuentaBancoGlobal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBancoTipoCuentaBancoGlobal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalBean,this.bancotipocuentabancoglobal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
			classes=BancoTipoCuentaBancoGlobalConstantesFunciones.getClassesRelationshipsOfBancoTipoCuentaBancoGlobal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.bancotipocuentabancoglobalReturnGeneral=bancotipocuentabancoglobalLogic.procesarEventosBancoTipoCuentaBancoGlobalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals(),this.bancotipocuentabancoglobal,this.bancotipocuentabancoglobalParameterGeneral,this.isEsNuevoBancoTipoCuentaBancoGlobal,classes);//this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalReturnGeneral,this.bancotipocuentabancoglobalBean,false);
		
		if(this.bancotipocuentabancoglobalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal());
		}
		
		if(this.bancotipocuentabancoglobalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal(),classes);//this.bancotipocuentabancoglobalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBancoTipoCuentaBancoGlobal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBancoTipoCuentaBancoGlobal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.RecargarFormBancoTipoCuentaBancoGlobal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
						
			if(bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBancoTipoCuentaBancoGlobal();
			}
			
			this.actualizarVisualTableDatosBancoTipoCuentaBancoGlobal();
			
			this.jTableDatosBancoTipoCuentaBancoGlobal.setRowSelectionInterval(this.getIndiceNuevoBancoTipoCuentaBancoGlobal(), this.getIndiceNuevoBancoTipoCuentaBancoGlobal());
			
			this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
						
			this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBancoTipoCuentaBancoGlobal(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setEnabled(isHabilitar && this.bancotipocuentabancoglobalConstantesFunciones.activarid_empresaBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setEnabled(isHabilitar && this.bancotipocuentabancoglobalConstantesFunciones.activarid_bancoBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setEnabled(isHabilitar && this.bancotipocuentabancoglobalConstantesFunciones.activarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal);
	};
	
	public void setDefaultControlesBancoTipoCuentaBancoGlobal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBancoTipoCuentaBancoGlobal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.bancotipocuentabancoglobalSessionBean.setConGuardarRelaciones(true);			
			this.bancotipocuentabancoglobalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.setVisible(true);
			
					
		} else {
			//this.bancotipocuentabancoglobalSessionBean.setConGuardarRelaciones(false);			
			this.bancotipocuentabancoglobalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBancoTipoCuentaBancoGlobal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
				if(bancotipocuentabancoglobalAux.getId().equals(this.iIdNuevoBancoTipoCuentaBancoGlobal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobals) {
				if(bancotipocuentabancoglobalAux.getId().equals(this.iIdNuevoBancoTipoCuentaBancoGlobal)) {
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
	
	public int getIndiceActualBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
				if(bancotipocuentabancoglobalAux.getId().equals(bancotipocuentabancoglobal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobals) {
				if(bancotipocuentabancoglobalAux.getId().equals(bancotipocuentabancoglobal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
				if(bancotipocuentabancoglobalAux.getBancoTipoCuentaBancoGlobalOriginal().getId().equals(bancotipocuentabancoglobalOriginal.getId())) {
					existe=true;
					bancotipocuentabancoglobalOriginal.setId(bancotipocuentabancoglobalAux.getId());
					bancotipocuentabancoglobalOriginal.setVersionRow(bancotipocuentabancoglobalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobals) {
				if(bancotipocuentabancoglobalAux.getBancoTipoCuentaBancoGlobalOriginal().getId().equals(bancotipocuentabancoglobalOriginal.getId())) {
					existe=true;
					bancotipocuentabancoglobalOriginal.setId(bancotipocuentabancoglobalAux.getId());
					bancotipocuentabancoglobalOriginal.setVersionRow(bancotipocuentabancoglobalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBancoTipoCuentaBancoGlobal(Boolean esParaCancelar) throws Exception {
		bancotipocuentabancoglobalsAux=new ArrayList<BancoTipoCuentaBancoGlobal>();
		bancotipocuentabancoglobalAux=new BancoTipoCuentaBancoGlobal();
		
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
					if(bancotipocuentabancoglobalAux.getId()<0) {
						bancotipocuentabancoglobalsAux.add(bancotipocuentabancoglobalAux);
					}		
				}
				this.iIdNuevoBancoTipoCuentaBancoGlobal=0L;
				this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().removeAll(bancotipocuentabancoglobalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobals) {
					if(bancotipocuentabancoglobalAux.getId()<0) {
						bancotipocuentabancoglobalsAux.add(bancotipocuentabancoglobalAux);
					}		
				}
				this.iIdNuevoBancoTipoCuentaBancoGlobal=0L;
				this.bancotipocuentabancoglobals.removeAll(bancotipocuentabancoglobalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBancoTipoCuentaBancoGlobal 
					&& this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size()>0
					) {
					bancotipocuentabancoglobalAux=this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().get(this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size() - 1);
				
					if(bancotipocuentabancoglobalAux.getId()<0) {
						this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().remove(bancotipocuentabancoglobalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBancoTipoCuentaBancoGlobal && this.bancotipocuentabancoglobals.size()>0) {
					bancotipocuentabancoglobalAux=this.bancotipocuentabancoglobals.get(this.bancotipocuentabancoglobals.size() - 1);
				
					if(bancotipocuentabancoglobalAux.getId()<0) {
						this.bancotipocuentabancoglobals.remove(bancotipocuentabancoglobalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBancoTipoCuentaBancoGlobal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(bancotipocuentabancoglobal.getId()<0) {
				this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().remove(this.bancotipocuentabancoglobal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(bancotipocuentabancoglobal.getId()<0) {
				this.bancotipocuentabancoglobals.remove(this.bancotipocuentabancoglobal);
			}
		}			
	}
	
	public void setEstadosInicialesBancoTipoCuentaBancoGlobal(List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsAux) throws Exception {
		BancoTipoCuentaBancoGlobalConstantesFunciones.setEstadosInicialesBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalsAux);
	}
	
	public void setEstadosInicialesBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux) throws Exception {
		BancoTipoCuentaBancoGlobalConstantesFunciones.setEstadosInicialesBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBancoTipoCuentaBancoGlobalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBancoTipoCuentaBancoGlobalActual()) {
				if(!this.isEsNuevoBancoTipoCuentaBancoGlobal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBancoTipoCuentaBancoGlobal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBancoTipoCuentaBancoGlobalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Banco Tipo Cuenta Banco Global ?", "MANTENIMIENTO DE Banco Tipo Cuenta Banco Global", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal) throws Exception {
		BancoTipoCuentaBancoGlobalConstantesFunciones.seleccionarAsignar(this.bancotipocuentabancoglobal,bancotipocuentabancoglobal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBancoTipoCuentaBancoGlobal=this.isPermisoActualizarOriginalBancoTipoCuentaBancoGlobal;
			
			
			this.seleccionarAsignar(bancotipocuentabancoglobal);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BancoTipoCuentaBancoGlobalConstantesFunciones.quitarEspaciosBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.bancotipocuentabancoglobalSessionBean.setsFuncionBusquedaRapida(this.bancotipocuentabancoglobalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBancoTipoCuentaBancoGlobal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBancoTipoCuentaBancoGlobal(esParaCancelar);				
				this.cancelarNuevoBancoTipoCuentaBancoGlobal(esParaCancelar);								
			}
			
			this.bancotipocuentabancoglobal=new BancoTipoCuentaBancoGlobal();
			
			this.inicializarBancoTipoCuentaBancoGlobal();
			
			this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBancoTipoCuentaBancoGlobal() throws Exception {
		try {
			BancoTipoCuentaBancoGlobalConstantesFunciones.inicializarBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
			
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
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBancoTipoCuentaBancoGlobals(String sAccionBusqueda,List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsParaReportes) throws Exception {
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
					sPathReporteFinal="BancoTipoCuentaBancoGlobal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BancoTipoCuentaBancoGlobalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BancoTipoCuentaBancoGlobalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="BancoTipoCuentaBancoGlobal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Banco Tipo Cuenta Banco Globales");		
		parameters.put("busquedapor", BancoTipoCuentaBancoGlobalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBancoTipoCuentaBancoGlobal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BancoTipoCuentaBancoGlobalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BancoTipoCuentaBancoGlobalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBancoTipoCuentaBancoGlobal=new JRBeanArrayDataSource(BancoTipoCuentaBancoGlobalJInternalFrame.TraerBancoTipoCuentaBancoGlobalBeans(bancotipocuentabancoglobalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBancoTipoCuentaBancoGlobal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BancoTipoCuentaBancoGlobalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BancoTipoCuentaBancoGlobalBean.TraerBancoTipoCuentaBancoGlobalBeans(bancotipocuentabancoglobalsParaReportes).toArray()));
							
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
				this.generarExcelReporteBancoTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,bancotipocuentabancoglobalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBancoTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,bancotipocuentabancoglobalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(null);
					//this.generarExcelReporteBancoTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,bancotipocuentabancoglobalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBancoTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,bancotipocuentabancoglobalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBancoTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,bancotipocuentabancoglobalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBancoTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,bancotipocuentabancoglobalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBancoTipoCuentaBancoGlobals(String sAccionBusqueda,String sTipoArchivoReporte,List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancotipocuentabancoglobal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BancoTipoCuentaBancoGlobals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBancoTipoCuentaBancoGlobal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal : bancotipocuentabancoglobalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BancoTipoCuentaBancoGlobalConstantesFunciones.generarExcelReporteDataBancoTipoCuentaBancoGlobal("NORMAL",row,workbook,bancotipocuentabancoglobal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBancoTipoCuentaBancoGlobal(String sTipo,Row row,Workbook workbook) {
		
		BancoTipoCuentaBancoGlobalConstantesFunciones.generarExcelReporteHeaderBancoTipoCuentaBancoGlobal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBancoTipoCuentaBancoGlobals(String sAccionBusqueda,String sTipoArchivoReporte,List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancotipocuentabancoglobal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BancoTipoCuentaBancoGlobals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal : bancotipocuentabancoglobalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.getBancoTipoCuentaBancoGlobalDescripcion(bancotipocuentabancoglobal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancotipocuentabancoglobal.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancotipocuentabancoglobal.getbanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bancotipocuentabancoglobal.gettipocuentabancoglobal_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBancoTipoCuentaBancoGlobals(String sAccionBusqueda,String sTipoArchivoReporte,List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsRespaldo=null;
		
		classes=BancoTipoCuentaBancoGlobalConstantesFunciones.getClassesRelationshipsOfBancoTipoCuentaBancoGlobal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.bancotipocuentabancoglobalLogic.setDatosCliente(this.datosCliente);
		this.bancotipocuentabancoglobalLogic.setDatosDeep(this.datosDeep);
		this.bancotipocuentabancoglobalLogic.setIsConDeep(true);
		
		bancotipocuentabancoglobalsRespaldo=this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals();
		
		this.bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(bancotipocuentabancoglobalsParaReportes);	
		this.bancotipocuentabancoglobalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		bancotipocuentabancoglobalsParaReportes=this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals();
		this.bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(bancotipocuentabancoglobalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancotipocuentabancoglobal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BancoTipoCuentaBancoGlobals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBancoTipoCuentaBancoGlobal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal : bancotipocuentabancoglobalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBancoTipoCuentaBancoGlobal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BancoTipoCuentaBancoGlobalConstantesFunciones.generarExcelReporteDataBancoTipoCuentaBancoGlobal("NORMAL",row,workbook,bancotipocuentabancoglobal,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.getBancoTipoCuentaBancoGlobalDescripcion(bancotipocuentabancoglobal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBancoTipoCuentaBancoGlobal() throws Exception {		
		this.startProcessBancoTipoCuentaBancoGlobal(true);
	}
	
	public void startProcessBancoTipoCuentaBancoGlobal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal ,this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal, this.jScrollPanelDatosBancoTipoCuentaBancoGlobal,this.jPanelPaginacionBancoTipoCuentaBancoGlobal, this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal, this.jPanelAccionesBancoTipoCuentaBancoGlobal,this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal,this.jmenuBarBancoTipoCuentaBancoGlobal,this.jmenuBarDetalleBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarDetalleBancoTipoCuentaBancoGlobal);		
		
		final JTabbedPane jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal=this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal; 
		
		final JPanel jPanelParametrosReportesBancoTipoCuentaBancoGlobal=this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal;
		//final JScrollPane jScrollPanelDatosBancoTipoCuentaBancoGlobal=this.jScrollPanelDatosBancoTipoCuentaBancoGlobal;
		final JTable jTableDatosBancoTipoCuentaBancoGlobal=this.jTableDatosBancoTipoCuentaBancoGlobal;		
		final JPanel jPanelPaginacionBancoTipoCuentaBancoGlobal=this.jPanelPaginacionBancoTipoCuentaBancoGlobal;
		//final JScrollPane jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal=this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal;
		final JPanel jPanelAccionesBancoTipoCuentaBancoGlobal=this.jPanelAccionesBancoTipoCuentaBancoGlobal;
		
		JPanel jPanelCamposAuxiliarBancoTipoCuentaBancoGlobal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBancoTipoCuentaBancoGlobal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			jPanelCamposAuxiliarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jPanelCamposBancoTipoCuentaBancoGlobal;
			jPanelAccionesFormularioAuxiliarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal;
		}
		
		final JPanel jPanelCamposBancoTipoCuentaBancoGlobal=jPanelCamposAuxiliarBancoTipoCuentaBancoGlobal;
		final JPanel jPanelAccionesFormularioBancoTipoCuentaBancoGlobal=jPanelAccionesFormularioAuxiliarBancoTipoCuentaBancoGlobal;
		
		
		final JMenuBar jmenuBarBancoTipoCuentaBancoGlobal=this.jmenuBarBancoTipoCuentaBancoGlobal;
		final JToolBar jTtoolBarBancoTipoCuentaBancoGlobal=this.jTtoolBarBancoTipoCuentaBancoGlobal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBancoTipoCuentaBancoGlobal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBancoTipoCuentaBancoGlobal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			jmenuBarDetalleAuxiliarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jmenuBarDetalleBancoTipoCuentaBancoGlobal;
			jTtoolBarDetalleAuxiliarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTtoolBarDetalleBancoTipoCuentaBancoGlobal;
		}
		
		final JMenuBar jmenuBarDetalleBancoTipoCuentaBancoGlobal=jmenuBarDetalleAuxiliarBancoTipoCuentaBancoGlobal;
		final JToolBar jTtoolBarDetalleBancoTipoCuentaBancoGlobal=jTtoolBarDetalleAuxiliarBancoTipoCuentaBancoGlobal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBancoTipoCuentaBancoGlobal;
			processRunnable.jTableDatos=jTableDatosBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelCampos=jPanelCamposBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelPaginacion=jPanelPaginacionBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelAcciones=jPanelAccionesBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBancoTipoCuentaBancoGlobal;
			
			
			processRunnable.jmenuBar=jmenuBarBancoTipoCuentaBancoGlobal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBancoTipoCuentaBancoGlobal;
			processRunnable.jTtoolBar=jTtoolBarBancoTipoCuentaBancoGlobal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBancoTipoCuentaBancoGlobal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal ,jPanelParametrosReportesBancoTipoCuentaBancoGlobal,jTableDatosBancoTipoCuentaBancoGlobal, /*jScrollPanelDatosBancoTipoCuentaBancoGlobal,*/jPanelCamposBancoTipoCuentaBancoGlobal,jPanelPaginacionBancoTipoCuentaBancoGlobal, /*jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal,*/ jPanelAccionesBancoTipoCuentaBancoGlobal,jPanelAccionesFormularioBancoTipoCuentaBancoGlobal,jmenuBarBancoTipoCuentaBancoGlobal,jmenuBarDetalleBancoTipoCuentaBancoGlobal,jTtoolBarBancoTipoCuentaBancoGlobal,jTtoolBarDetalleBancoTipoCuentaBancoGlobal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal ,jPanelParametrosReportesBancoTipoCuentaBancoGlobal, jScrollPanelDatosBancoTipoCuentaBancoGlobal,jPanelPaginacionBancoTipoCuentaBancoGlobal, jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal, jPanelAccionesBancoTipoCuentaBancoGlobal,jPanelAccionesFormularioBancoTipoCuentaBancoGlobal,jmenuBarBancoTipoCuentaBancoGlobal,jmenuBarDetalleBancoTipoCuentaBancoGlobal,jTtoolBarBancoTipoCuentaBancoGlobal,jTtoolBarDetalleBancoTipoCuentaBancoGlobal);
						
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
	
	public void finishProcessBancoTipoCuentaBancoGlobal() {// throws Exception 
		this.finishProcessBancoTipoCuentaBancoGlobal(true);
	}
	
	public void finishProcessBancoTipoCuentaBancoGlobal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal ,this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal, this.jScrollPanelDatosBancoTipoCuentaBancoGlobal,this.jPanelPaginacionBancoTipoCuentaBancoGlobal, this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal, this.jPanelAccionesBancoTipoCuentaBancoGlobal,this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal,this.jmenuBarBancoTipoCuentaBancoGlobal,this.jmenuBarDetalleBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarDetalleBancoTipoCuentaBancoGlobal);		
		
		final JTabbedPane jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal=this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal; 
		
		final JPanel jPanelParametrosReportesBancoTipoCuentaBancoGlobal=this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal;
		//final JScrollPane jScrollPanelDatosBancoTipoCuentaBancoGlobal=this.jScrollPanelDatosBancoTipoCuentaBancoGlobal;
		final JTable jTableDatosBancoTipoCuentaBancoGlobal=this.jTableDatosBancoTipoCuentaBancoGlobal;		
		final JPanel jPanelPaginacionBancoTipoCuentaBancoGlobal=this.jPanelPaginacionBancoTipoCuentaBancoGlobal;
		//final JScrollPane jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal=this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal;
		final JPanel jPanelAccionesBancoTipoCuentaBancoGlobal=this.jPanelAccionesBancoTipoCuentaBancoGlobal;
		
		JPanel jPanelCamposAuxiliarBancoTipoCuentaBancoGlobal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBancoTipoCuentaBancoGlobal=new JPanel();
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			jPanelCamposAuxiliarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jPanelCamposBancoTipoCuentaBancoGlobal;
			jPanelAccionesFormularioAuxiliarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal;
		}
		
		final JPanel jPanelCamposBancoTipoCuentaBancoGlobal=jPanelCamposAuxiliarBancoTipoCuentaBancoGlobal;
		final JPanel jPanelAccionesFormularioBancoTipoCuentaBancoGlobal=jPanelAccionesFormularioAuxiliarBancoTipoCuentaBancoGlobal;
		
		
		final JMenuBar jmenuBarBancoTipoCuentaBancoGlobal=this.jmenuBarBancoTipoCuentaBancoGlobal;		
		final JToolBar jTtoolBarBancoTipoCuentaBancoGlobal=this.jTtoolBarBancoTipoCuentaBancoGlobal;
				
		JMenuBar jmenuBarDetalleAuxiliarBancoTipoCuentaBancoGlobal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBancoTipoCuentaBancoGlobal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			jmenuBarDetalleAuxiliarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jmenuBarDetalleBancoTipoCuentaBancoGlobal;
			jTtoolBarDetalleAuxiliarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTtoolBarDetalleBancoTipoCuentaBancoGlobal;		
		}
		
		final JMenuBar jmenuBarDetalleBancoTipoCuentaBancoGlobal=jmenuBarDetalleAuxiliarBancoTipoCuentaBancoGlobal;
		final JToolBar jTtoolBarDetalleBancoTipoCuentaBancoGlobal=jTtoolBarDetalleAuxiliarBancoTipoCuentaBancoGlobal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBancoTipoCuentaBancoGlobal;
			processRunnable.jTableDatos=jTableDatosBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelCampos=jPanelCamposBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelPaginacion=jPanelPaginacionBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelAcciones=jPanelAccionesBancoTipoCuentaBancoGlobal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBancoTipoCuentaBancoGlobal;
			
			
			processRunnable.jmenuBar=jmenuBarBancoTipoCuentaBancoGlobal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBancoTipoCuentaBancoGlobal;
			processRunnable.jTtoolBar=jTtoolBarBancoTipoCuentaBancoGlobal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBancoTipoCuentaBancoGlobal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal ,jPanelParametrosReportesBancoTipoCuentaBancoGlobal, jTableDatosBancoTipoCuentaBancoGlobal,/*jScrollPanelDatosBancoTipoCuentaBancoGlobal,*/jPanelCamposBancoTipoCuentaBancoGlobal,jPanelPaginacionBancoTipoCuentaBancoGlobal, /*jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal,*/ jPanelAccionesBancoTipoCuentaBancoGlobal,jPanelAccionesFormularioBancoTipoCuentaBancoGlobal,jmenuBarBancoTipoCuentaBancoGlobal,jmenuBarDetalleBancoTipoCuentaBancoGlobal,jTtoolBarBancoTipoCuentaBancoGlobal,jTtoolBarDetalleBancoTipoCuentaBancoGlobal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBancoTipoCuentaBancoGlobal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBancoTipoCuentaBancoGlobal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBancoTipoCuentaBancoGlobal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBancoTipoCuentaBancoGlobal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBancoTipoCuentaBancoGlobal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBancoTipoCuentaBancoGlobal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBancoTipoCuentaBancoGlobal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBancoTipoCuentaBancoGlobal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBancoTipoCuentaBancoGlobal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.bancotipocuentabancoglobalConstantesFunciones.getsFinalQueryBancoTipoCuentaBancoGlobal();
		String  finalQueryPaginacionTodos=this.bancotipocuentabancoglobalConstantesFunciones.getsFinalQueryBancoTipoCuentaBancoGlobal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=BancoTipoCuentaBancoGlobalConstantesFunciones.getArrayColumnasGlobalesNoBancoTipoCuentaBancoGlobal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BancoTipoCuentaBancoGlobalConstantesFunciones.getArrayColumnasGlobalesBancoTipoCuentaBancoGlobal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BancoTipoCuentaBancoGlobalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.bancotipocuentabancoglobalsEliminados= new ArrayList<BancoTipoCuentaBancoGlobal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBancoTipoCuentaBancoGlobal();
		
				///*BancoTipoCuentaBancoGlobalSessionBean*/this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
			
			if(this.bancotipocuentabancoglobalSessionBean==null) {
				this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
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
					this.iNumeroPaginacion=BancoTipoCuentaBancoGlobalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BancoTipoCuentaBancoGlobalConstantesFunciones.getClassesForeignKeysOfBancoTipoCuentaBancoGlobal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/bancotipocuentabancoglobal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			bancotipocuentabancoglobalsAux= new ArrayList<BancoTipoCuentaBancoGlobal>();
			
				
			bancotipocuentabancoglobalLogic.setDatosCliente(this.datosCliente);
			bancotipocuentabancoglobalLogic.setDatosDeep(this.datosDeep);
			bancotipocuentabancoglobalLogic.setIsConDeep(true);
			
			
			bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					bancotipocuentabancoglobalLogic.getTodosBancoTipoCuentaBancoGlobals(finalQueryGlobal,pagination);
					
					//bancotipocuentabancoglobalLogic.getTodosBancoTipoCuentaBancoGlobalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()==null|| bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bancotipocuentabancoglobalsAux= new ArrayList<BancoTipoCuentaBancoGlobal>();
							bancotipocuentabancoglobalsAux.addAll(bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancotipocuentabancoglobalsAux= new ArrayList<BancoTipoCuentaBancoGlobal>();
							bancotipocuentabancoglobalsAux.addAll(bancotipocuentabancoglobals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bancotipocuentabancoglobalLogic.getTodosBancoTipoCuentaBancoGlobals(finalQueryGlobal+"",this.pagination);												
							
							//bancotipocuentabancoglobalLogic.getTodosBancoTipoCuentaBancoGlobalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteBancoTipoCuentaBancoGlobals("Todos",bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(new ArrayList<BancoTipoCuentaBancoGlobal>());					
							bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().addAll(bancotipocuentabancoglobalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancotipocuentabancoglobals=new ArrayList<BancoTipoCuentaBancoGlobal>();
							bancotipocuentabancoglobals.addAll(bancotipocuentabancoglobalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idBancoTipoCuentaBancoGlobal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idBancoTipoCuentaBancoGlobal=this.idActual;
				
				} else if(this.idBancoTipoCuentaBancoGlobalActual!=null && this.idBancoTipoCuentaBancoGlobalActual!=0L) {
					idBancoTipoCuentaBancoGlobal=idBancoTipoCuentaBancoGlobalActual;
				}
				
					
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndicePorId(idBancoTipoCuentaBancoGlobal);
				
				this.bancotipocuentabancoglobals=new ArrayList<BancoTipoCuentaBancoGlobal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					bancotipocuentabancoglobalLogic.getEntity(idBancoTipoCuentaBancoGlobal);
					
					//bancotipocuentabancoglobalLogic.getEntityWithConnection(idBancoTipoCuentaBancoGlobal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(new ArrayList<BancoTipoCuentaBancoGlobal>());
					bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().add(bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancotipocuentabancoglobals=new ArrayList<BancoTipoCuentaBancoGlobal>();
					this.bancotipocuentabancoglobals.add(bancotipocuentabancoglobal);
				}
				
				if(bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBanco")) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalsFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()==null||bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancotipocuentabancoglobals==null|| bancotipocuentabancoglobals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalsAux=new ArrayList<BancoTipoCuentaBancoGlobal>();
						bancotipocuentabancoglobalsAux.addAll(bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancotipocuentabancoglobalsAux=new ArrayList<BancoTipoCuentaBancoGlobal>();
							bancotipocuentabancoglobalsAux.addAll(bancotipocuentabancoglobals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalsFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoTipoCuentaBancoGlobals("FK_IdBanco",bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoTipoCuentaBancoGlobals("FK_IdBanco",bancotipocuentabancoglobals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(new ArrayList<BancoTipoCuentaBancoGlobal>());
						bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().addAll(bancotipocuentabancoglobalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancotipocuentabancoglobals=new ArrayList<BancoTipoCuentaBancoGlobal>();
							bancotipocuentabancoglobals.addAll(bancotipocuentabancoglobalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()==null||bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancotipocuentabancoglobals==null|| bancotipocuentabancoglobals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalsAux=new ArrayList<BancoTipoCuentaBancoGlobal>();
						bancotipocuentabancoglobalsAux.addAll(bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancotipocuentabancoglobalsAux=new ArrayList<BancoTipoCuentaBancoGlobal>();
							bancotipocuentabancoglobalsAux.addAll(bancotipocuentabancoglobals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoTipoCuentaBancoGlobals("FK_IdEmpresa",bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoTipoCuentaBancoGlobals("FK_IdEmpresa",bancotipocuentabancoglobals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(new ArrayList<BancoTipoCuentaBancoGlobal>());
						bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().addAll(bancotipocuentabancoglobalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancotipocuentabancoglobals=new ArrayList<BancoTipoCuentaBancoGlobal>();
							bancotipocuentabancoglobals.addAll(bancotipocuentabancoglobalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCuentaBancoGlobal")) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalsFK_IdTipoCuentaBancoGlobal(finalQueryGlobal,pagination,id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()==null||bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bancotipocuentabancoglobals==null|| bancotipocuentabancoglobals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalsAux=new ArrayList<BancoTipoCuentaBancoGlobal>();
						bancotipocuentabancoglobalsAux.addAll(bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancotipocuentabancoglobalsAux=new ArrayList<BancoTipoCuentaBancoGlobal>();
							bancotipocuentabancoglobalsAux.addAll(bancotipocuentabancoglobals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalsFK_IdTipoCuentaBancoGlobal(finalQueryGlobal,pagination,id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BancoTipoCuentaBancoGlobalConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBancoTipoCuentaBancoGlobals("FK_IdTipoCuentaBancoGlobal",bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBancoTipoCuentaBancoGlobals("FK_IdTipoCuentaBancoGlobal",bancotipocuentabancoglobals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(new ArrayList<BancoTipoCuentaBancoGlobal>());
						bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().addAll(bancotipocuentabancoglobalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancotipocuentabancoglobals=new ArrayList<BancoTipoCuentaBancoGlobal>();
							bancotipocuentabancoglobals.addAll(bancotipocuentabancoglobalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBancoTipoCuentaBancoGlobal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBancoTipoCuentaBancoGlobal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bancotipocuentabancoglobals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bancotipocuentabancoglobals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal) {
		Boolean permite=true;
		
		if(this.bancotipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BancoTipoCuentaBancoGlobalConstantesFunciones.getOrderByListaBancoTipoCuentaBancoGlobal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BancoTipoCuentaBancoGlobalConstantesFunciones.getOrderByListaBancoTipoCuentaBancoGlobal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal:bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
				if(bancotipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
					bancotipocuentabancoglobalTotales=bancotipocuentabancoglobal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal:this.bancotipocuentabancoglobals) {
				if(bancotipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
					bancotipocuentabancoglobalTotales=bancotipocuentabancoglobal;
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
			this.bancotipocuentabancoglobalAux=new BancoTipoCuentaBancoGlobal();
			this.bancotipocuentabancoglobalAux.setsType(Constantes2.S_TOTALES);
			this.bancotipocuentabancoglobalAux.setIsNew(false);
			this.bancotipocuentabancoglobalAux.setIsChanged(false);
			this.bancotipocuentabancoglobalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				BancoTipoCuentaBancoGlobalConstantesFunciones.TotalizarValoresFilaBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals(),this.bancotipocuentabancoglobalAux);
				
				this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().add(this.bancotipocuentabancoglobalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BancoTipoCuentaBancoGlobalConstantesFunciones.TotalizarValoresFilaBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobals,this.bancotipocuentabancoglobalAux);
				
				this.bancotipocuentabancoglobals.add(this.bancotipocuentabancoglobalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		bancotipocuentabancoglobalTotales=new BancoTipoCuentaBancoGlobal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().remove(bancotipocuentabancoglobalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bancotipocuentabancoglobals.remove(bancotipocuentabancoglobalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		bancotipocuentabancoglobalTotales=new BancoTipoCuentaBancoGlobal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal:bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
				if(bancotipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
					bancotipocuentabancoglobalTotales=bancotipocuentabancoglobal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BancoTipoCuentaBancoGlobalConstantesFunciones.TotalizarValoresFilaBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals(),bancotipocuentabancoglobalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal:this.bancotipocuentabancoglobals) {
				if(bancotipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
					bancotipocuentabancoglobalTotales=bancotipocuentabancoglobal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BancoTipoCuentaBancoGlobalConstantesFunciones.TotalizarValoresFilaBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobals,bancotipocuentabancoglobalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBancoTipoCuentaBancoGlobalsFK_IdBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoTipoCuentaBancoGlobalsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBancoTipoCuentaBancoGlobalsFK_IdTipoCuentaBancoGlobal()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCuentaBancoGlobal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getBancoTipoCuentaBancoGlobalsFK_IdBanco(String sFinalQuery,Long id_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalsFK_IdBanco(sFinalQuery,this.pagination,id_banco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoTipoCuentaBancoGlobalsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBancoTipoCuentaBancoGlobalsFK_IdTipoCuentaBancoGlobal(String sFinalQuery,Long id_tipo_cuenta_banco_global)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobalsFK_IdTipoCuentaBancoGlobal(sFinalQuery,this.pagination,id_tipo_cuenta_banco_global);
				
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
	
	public void inicializarPermisosBancoTipoCuentaBancoGlobal() {
		this.isPermisoTodoBancoTipoCuentaBancoGlobal=false;
		this.isPermisoNuevoBancoTipoCuentaBancoGlobal=false;
		this.isPermisoActualizarBancoTipoCuentaBancoGlobal=false;
		this.isPermisoActualizarOriginalBancoTipoCuentaBancoGlobal=false;
		this.isPermisoEliminarBancoTipoCuentaBancoGlobal=false;
		this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal=false;
		this.isPermisoConsultaBancoTipoCuentaBancoGlobal=false;
		this.isPermisoBusquedaBancoTipoCuentaBancoGlobal=false;
		this.isPermisoReporteBancoTipoCuentaBancoGlobal=false;		
		this.isPermisoOrdenBancoTipoCuentaBancoGlobal=false;		
		this.isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal=false;		
		this.isPermisoPaginacionAltoBancoTipoCuentaBancoGlobal=false;
		this.isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal=false;
		this.isPermisoCopiarBancoTipoCuentaBancoGlobal=false;		
		this.isPermisoVerFormBancoTipoCuentaBancoGlobal=false;		
		this.isPermisoDuplicarBancoTipoCuentaBancoGlobal=false;		
		this.isPermisoOrdenBancoTipoCuentaBancoGlobal=false;		
	}
	
	public void setPermisosUsuarioBancoTipoCuentaBancoGlobal(Boolean isPermiso) {
		this.isPermisoTodoBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoNuevoBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoActualizarBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoActualizarOriginalBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoEliminarBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoConsultaBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoBusquedaBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoReporteBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoOrdenBancoTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoPaginacionAltoBancoTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoCopiarBancoTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoVerFormBancoTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoDuplicarBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoOrdenBancoTipoCuentaBancoGlobal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBancoTipoCuentaBancoGlobal(Boolean isPermiso) {
		//this.isPermisoTodoBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoNuevoBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoActualizarBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoActualizarOriginalBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoEliminarBancoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoConsultaBancoTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoBusquedaBancoTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoReporteBancoTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoOrdenBancoTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoPaginacionAltoBancoTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoCopiarBancoTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoDuplicarBancoTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoOrdenBancoTipoCuentaBancoGlobal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBancoTipoCuentaBancoGlobalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebBancoTipoCuentaBancoGlobal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBancoTipoCuentaBancoGlobalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBancoTipoCuentaBancoGlobalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBancoTipoCuentaBancoGlobalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBancoTipoCuentaBancoGlobalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBancoTipoCuentaBancoGlobal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BancoTipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBancoTipoCuentaBancoGlobal=this.isPermisoActualizarBancoTipoCuentaBancoGlobal;
			this.isPermisoEliminarBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBancoTipoCuentaBancoGlobal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBancoTipoCuentaBancoGlobal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBancoTipoCuentaBancoGlobal.setToolTipText(this.jTableDatosBancoTipoCuentaBancoGlobal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBancoTipoCuentaBancoGlobal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBancoTipoCuentaBancoGlobal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioBancoTipoCuentaBancoGlobal() throws Exception {
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
	public void inicializarCombosForeignKeyBancoTipoCuentaBancoGlobalListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.bancosForeignKey=new ArrayList();
				this.tipocuentabancoglobalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBancoTipoCuentaBancoGlobalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BancoTipoCuentaBancoGlobalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyBancoTipoCuentaBancoGlobalListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCuentaBancoGlobalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoCuentaBancoGlobalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocuentabancoglobalsForeignKey==null||this.tipocuentabancoglobalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCuentaBancoGlobalConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBancoGlobal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaBancoGlobalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCuentaBancoGlobalConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCuentaBancoGlobalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyBancoTipoCuentaBancoGlobalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			BancoTipoCuentaBancoGlobalParameterReturnGeneral bancotipocuentabancoglobalReturnGeneral=new BancoTipoCuentaBancoGlobalParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.bancotipocuentabancoglobalConstantesFunciones.cargarid_empresaBancoTipoCuentaBancoGlobal)
					 || (this.esRecargarFks && this.bancotipocuentabancoglobalConstantesFunciones.cargarid_empresaBancoTipoCuentaBancoGlobal)) {

					if(!this.bancotipocuentabancoglobalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+bancotipocuentabancoglobalSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalBanco="";

				if(((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0) && this.bancotipocuentabancoglobalConstantesFunciones.cargarid_bancoBancoTipoCuentaBancoGlobal)
					 || (this.esRecargarFks && this.bancotipocuentabancoglobalConstantesFunciones.cargarid_bancoBancoTipoCuentaBancoGlobal)) {

					if(!this.bancotipocuentabancoglobalSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

						finalQueryGlobalBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalBanco, "");
						finalQueryGlobalBanco+=BancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBanco=" WHERE " + ConstantesSql.ID + "="+bancotipocuentabancoglobalSessionBean.getlidBancoActual();
					}
				} else {
					finalQueryGlobalBanco="NONE";
				}


				String finalQueryGlobalTipoCuentaBancoGlobal="";

				if(((this.tipocuentabancoglobalsForeignKey==null||this.tipocuentabancoglobalsForeignKey.size()<=0) && this.bancotipocuentabancoglobalConstantesFunciones.cargarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal)
					 || (this.esRecargarFks && this.bancotipocuentabancoglobalConstantesFunciones.cargarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal)) {

					if(!this.bancotipocuentabancoglobalSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCuentaBancoGlobalConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBancoGlobal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCuentaBancoGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaBancoGlobalConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCuentaBancoGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCuentaBancoGlobal, "");
						finalQueryGlobalTipoCuentaBancoGlobal+=TipoCuentaBancoGlobalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCuentaBancoGlobalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCuentaBancoGlobal=" WHERE " + ConstantesSql.ID + "="+bancotipocuentabancoglobalSessionBean.getlidTipoCuentaBancoGlobalActual();
					}
				} else {
					finalQueryGlobalTipoCuentaBancoGlobal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				bancotipocuentabancoglobalReturnGeneral=bancotipocuentabancoglobalLogic.cargarCombosLoteForeignKeyBancoTipoCuentaBancoGlobal(finalQueryGlobalEmpresa,finalQueryGlobalBanco,finalQueryGlobalTipoCuentaBancoGlobal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=bancotipocuentabancoglobalReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalBanco.equals("NONE")) {
				this.bancosForeignKey=bancotipocuentabancoglobalReturnGeneral.getbancosForeignKey();
			}

			if(!finalQueryGlobalTipoCuentaBancoGlobal.equals("NONE")) {
				this.tipocuentabancoglobalsForeignKey=bancotipocuentabancoglobalReturnGeneral.gettipocuentabancoglobalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyBancoTipoCuentaBancoGlobal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyBanco();
			this.addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.bancotipocuentabancoglobalSessionBean==null) {
				this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
			}

			if(!this.bancotipocuentabancoglobalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyBanco()throws Exception {
		try {

			if(!this.bancotipocuentabancoglobalSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
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

	public void addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal()throws Exception {
		try {

			if(!this.bancotipocuentabancoglobalSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal()) {
				TipoCuentaBancoGlobal tipocuentabancoglobal=new TipoCuentaBancoGlobal();
				TipoCuentaBancoGlobalConstantesFunciones.setTipoCuentaBancoGlobalDescripcion(tipocuentabancoglobal,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocuentabancoglobal.setId(null);

				if(!TipoCuentaBancoGlobalConstantesFunciones.ExisteEnLista(this.tipocuentabancoglobalsForeignKey,tipocuentabancoglobal,true)) {

					this.tipocuentabancoglobalsForeignKey.add(0,tipocuentabancoglobal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyBancoTipoCuentaBancoGlobal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBancoTipoCuentaBancoGlobal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBancoTipoCuentaBancoGlobal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBancoTipoCuentaBancoGlobal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal)throws Exception {	
		try {
			
			this.setActualBancoForeignKey(bancotipocuentabancoglobal.getid_banco(),false,"Formulario");
			this.setActualTipoCuentaBancoGlobalForeignKey(bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBancoTipoCuentaBancoGlobal()throws Exception {	
		try {
			
			this.setActualBancoForeignKey(this.bancotipocuentabancoglobalConstantesFunciones.getid_banco(),false,"Formulario");
			this.setActualTipoCuentaBancoGlobalForeignKey(this.bancotipocuentabancoglobalConstantesFunciones.getid_tipo_cuenta_banco_global(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBancoTipoCuentaBancoGlobal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBancoTipoCuentaBancoGlobal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBancoTipoCuentaBancoGlobal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBancoTipoCuentaBancoGlobal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBancoTipoCuentaBancoGlobal()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameBancosForeignKey("Todos");
			this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBancoTipoCuentaBancoGlobal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBancoTipoCuentaBancoGlobal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.getItemCount()>0) {
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean(); 
		this.bancotipocuentabancoglobalConstantesFunciones=new BancoTipoCuentaBancoGlobalConstantesFunciones(); 
		this.bancotipocuentabancoglobalBean=new BancoTipoCuentaBancoGlobal();//(this.bancotipocuentabancoglobalConstantesFunciones); 		
		this.bancotipocuentabancoglobalReturnGeneral=new BancoTipoCuentaBancoGlobalParameterReturnGeneral(); 
		
		this.bancotipocuentabancoglobalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBancoTipoCuentaBancoGlobal(true);
			
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
			
			this.bancotipocuentabancoglobalConstantesFunciones=new BancoTipoCuentaBancoGlobalConstantesFunciones(); 
			this.bancotipocuentabancoglobalBean=new BancoTipoCuentaBancoGlobal();//this.bancotipocuentabancoglobalConstantesFunciones); 			
			this.bancotipocuentabancoglobalReturnGeneral=new BancoTipoCuentaBancoGlobalParameterReturnGeneral(); 
		
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Banco Tipo Cuenta Banco Global Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.bancotipocuentabancoglobal=new BancoTipoCuentaBancoGlobal();
			this.bancotipocuentabancoglobals = new ArrayList<BancoTipoCuentaBancoGlobal>();
			this.bancotipocuentabancoglobalsAux = new ArrayList<BancoTipoCuentaBancoGlobal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic=new BancoTipoCuentaBancoGlobalLogic();
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			//this.bancotipocuentabancoglobalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal);	
					}
					
					if(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal);
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setVisible(false);
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal);
					this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setVisible(false);
					this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal);
					this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setVisible(false);
					this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal);
					this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setVisible(false);
					this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBancoTipoCuentaBancoGlobalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BancoTipoCuentaBancoGlobalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.bancotipocuentabancoglobalReturnGeneral=new BancoTipoCuentaBancoGlobalParameterReturnGeneral();
			
			this.bancotipocuentabancoglobalParameterGeneral=new BancoTipoCuentaBancoGlobalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.bancotipocuentabancoglobalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BancoTipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado(),this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BancoTipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado(),this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=false;
			
			
			this.isVisibilidadFK_IdBanco=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoCuentaBancoGlobal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBancoTipoCuentaBancoGlobal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBancoTipoCuentaBancoGlobal(false);
			
			this.setPermisosUsuarioBancoTipoCuentaBancoGlobal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado() 
				|| (this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado() && this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBancoTipoCuentaBancoGlobalClasesRelacionadas();
			}
			
			if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBancoTipoCuentaBancoGlobalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBancoTipoCuentaBancoGlobal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBancoTipoCuentaBancoGlobal();
			}
			
			if(!this.isPermisoBusquedaBancoTipoCuentaBancoGlobal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal,this.isPermisoPaginacionMedioBancoTipoCuentaBancoGlobal,this.isPermisoPaginacionTodoBancoTipoCuentaBancoGlobal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BancoTipoCuentaBancoGlobalConstantesFunciones.getTiposSeleccionarBancoTipoCuentaBancoGlobal());
				
				this.tiposColumnasSelect=BancoTipoCuentaBancoGlobalConstantesFunciones.getTiposSeleccionarBancoTipoCuentaBancoGlobal(true);
				
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
			//if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBancoTipoCuentaBancoGlobal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioBancoTipoCuentaBancoGlobal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioBancoTipoCuentaBancoGlobal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBancoTipoCuentaBancoGlobal() ;
			
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
			this.bancoLogic=new BancoLogic();
			this.tipocuentabancoglobalLogic=new TipoCuentaBancoGlobalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				bancotipocuentabancoglobalImplementable= (BancoTipoCuentaBancoGlobalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BancoTipoCuentaBancoGlobalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				bancotipocuentabancoglobalImplementableHome= (BancoTipoCuentaBancoGlobalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BancoTipoCuentaBancoGlobalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.bancotipocuentabancoglobals= new ArrayList<BancoTipoCuentaBancoGlobal>();
			this.bancotipocuentabancoglobalsEliminados= new ArrayList<BancoTipoCuentaBancoGlobal>();
						
			this.isEsNuevoBancoTipoCuentaBancoGlobal=false;
			this.esParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.bancosForeignKey=new ArrayList<Banco>() ;
			this.tipocuentabancoglobalsForeignKey=new ArrayList<TipoCuentaBancoGlobal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBancoTipoCuentaBancoGlobal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBancoTipoCuentaBancoGlobal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BancoTipoCuentaBancoGlobalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBancoTipoCuentaBancoGlobal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBancoTipoCuentaBancoGlobal();
			}
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBancoTipoCuentaBancoGlobal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga BancoTipoCuentaBancoGlobal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBancoTipoCuentaBancoGlobal() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBancoTipoCuentaBancoGlobal")) {
				iIndex=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBancoTipoCuentaBancoGlobal();	
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
	
	public void cargarCombosForeignKeyBancoTipoCuentaBancoGlobal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBancoTipoCuentaBancoGlobal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBancoTipoCuentaBancoGlobal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBancoTipoCuentaBancoGlobalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBancoTipoCuentaBancoGlobal();
		
		this.cargarCombosFrameForeignKeyBancoTipoCuentaBancoGlobal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBancoTipoCuentaBancoGlobal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBancoTipoCuentaBancoGlobal();
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

	public void cargarCombosForeignKeyTipoCuentaBancoGlobal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCuentaBancoGlobalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal();
				this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCuentaBancoGlobal(this.tipocuentabancoglobalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
			
			if(jTableDatosBancoTipoCuentaBancoGlobal.getRowCount()>=1) {
				jTableDatosBancoTipoCuentaBancoGlobal.removeRowSelectionInterval(0, jTableDatosBancoTipoCuentaBancoGlobal.getRowCount()-1);						
			}
			
			this.isEsNuevoBancoTipoCuentaBancoGlobal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBancoTipoCuentaBancoGlobal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBancoTipoCuentaBancoGlobal(true);			
			//this.bancotipocuentabancoglobal=new BancoTipoCuentaBancoGlobal();
			//this.bancotipocuentabancoglobal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBancoTipoCuentaBancoGlobal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal() ;
			
			if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBancoTipoCuentaBancoGlobal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.bancotipocuentabancoglobal);	
			this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);				
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
			if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar BancoTipoCuentaBancoGlobal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRows().length;			
			}
			
			bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBancoTipoCuentaBancoGlobal--;			
				//BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux= new BancoTipoCuentaBancoGlobal();			
				//bancotipocuentabancoglobalAux.setId(this.iIdNuevoBancoTipoCuentaBancoGlobal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalOrigen=new BancoTipoCuentaBancoGlobal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalOrigen : bancotipocuentabancoglobalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							bancotipocuentabancoglobalOrigen =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bancotipocuentabancoglobalOrigen =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBancoTipoCuentaBancoGlobal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.bancotipocuentabancoglobal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalOrigen,this.bancotipocuentabancoglobal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().add(this.bancotipocuentabancoglobalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bancotipocuentabancoglobals.add(this.bancotipocuentabancoglobalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
				
				this.jTableDatosBancoTipoCuentaBancoGlobal.setRowSelectionInterval(this.getIndiceNuevoBancoTipoCuentaBancoGlobal(), this.getIndiceNuevoBancoTipoCuentaBancoGlobal());
				
				int iLastRow =  this.jTableDatosBancoTipoCuentaBancoGlobal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBancoTipoCuentaBancoGlobal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBancoTipoCuentaBancoGlobal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();									
		
			BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalOrigen=new BancoTipoCuentaBancoGlobal();
			BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalDestino=new BancoTipoCuentaBancoGlobal();
				
			bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || bancotipocuentabancoglobalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalOrigen =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bancotipocuentabancoglobalOrigen =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bancotipocuentabancoglobalDestino =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bancotipocuentabancoglobalDestino =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				bancotipocuentabancoglobalOrigen =bancotipocuentabancoglobalsSeleccionados.get(0);
				bancotipocuentabancoglobalDestino =bancotipocuentabancoglobalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalOrigen,bancotipocuentabancoglobalDestino,true,false);
				
				bancotipocuentabancoglobalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bancotipocuentabancoglobalDestino,bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bancotipocuentabancoglobalDestino,bancotipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
				
				//this.jTableDatosBancoTipoCuentaBancoGlobal.setRowSelectionInterval(this.getIndiceNuevoBancoTipoCuentaBancoGlobal(), this.getIndiceNuevoBancoTipoCuentaBancoGlobal());
				
				int iLastRow =  this.jTableDatosBancoTipoCuentaBancoGlobal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBancoTipoCuentaBancoGlobal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBancoTipoCuentaBancoGlobal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(!isVisible);
			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.setVisible(!isVisible);
			this.jPanelAccionesBancoTipoCuentaBancoGlobal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBancoTipoCuentaBancoGlobal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBancoTipoCuentaBancoGlobal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBancoTipoCuentaBancoGlobal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBancoTipoCuentaBancoGlobal();
			
			this.abrirFrameOrderByBancoTipoCuentaBancoGlobal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBancoTipoCuentaBancoGlobal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBancoTipoCuentaBancoGlobal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.isMaximum()) {
					this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setSize(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.iWidthFormulario,this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.isMaximum()) {
						this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jContentPaneDetalleBancoTipoCuentaBancoGlobal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jContentPaneDetalleBancoTipoCuentaBancoGlobal.getWidth(),BancoTipoCuentaBancoGlobalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jContentPaneDetalleBancoTipoCuentaBancoGlobal.getWidth(),BancoTipoCuentaBancoGlobalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jContentPaneDetalleBancoTipoCuentaBancoGlobal.getWidth(),BancoTipoCuentaBancoGlobalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setVisible(true);
	        this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBancoTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal,false,this);
				} else {
					this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal);
				this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setVisible(false);
				this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setSelected(false);
				
				this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBancoTipoCuentaBancoGlobal"));
				
				this.inicializarActualizarBindingTablaOrderByBancoTipoCuentaBancoGlobal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBancoTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal==null) {
				
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal=new ImportacionJInternalFrame(BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal);
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setVisible(false);
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setSelected(false);


				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBancoTipoCuentaBancoGlobal"));
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBancoTipoCuentaBancoGlobal"));
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBancoTipoCuentaBancoGlobal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBancoTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal==null) {
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal=new ReporteDinamicoJInternalFrame(BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal);
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setVisible(false);
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBancoTipoCuentaBancoGlobal"));
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBancoTipoCuentaBancoGlobal"));
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBancoTipoCuentaBancoGlobal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleBancoTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal);
			
	       	this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setVisible(false);
	        this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setSelected(false);
			
			//this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.dispose();
			//this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBancoTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setVisible(true);
	        this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBancoTipoCuentaBancoGlobal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setVisible(true);
	        this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBancoTipoCuentaBancoGlobal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setVisible(true);
	        this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBancoTipoCuentaBancoGlobal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setVisible(false);
	        this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBancoTipoCuentaBancoGlobal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setVisible(false);
	        this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBancoTipoCuentaBancoGlobal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setVisible(false);
	        this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBancoTipoCuentaBancoGlobal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBancoTipoCuentaBancoGlobal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBancoTipoCuentaBancoGlobal(true);
			//this.isEsNuevoBancoTipoCuentaBancoGlobal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBancoTipoCuentaBancoGlobal(false) ;
			
			if(bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBancoTipoCuentaBancoGlobal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBancoTipoCuentaBancoGlobal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBancoTipoCuentaBancoGlobal(true);
			//this.isEsNuevoBancoTipoCuentaBancoGlobal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.bancotipocuentabancoglobal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBancoTipoCuentaBancoGlobal(false) ;
			
			if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBancoTipoCuentaBancoGlobal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaBanco(List<Banco> bancosForeignKey)throws Exception{
		TableColumn tableColumnBanco=this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobal,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO));
		TableCellEditor tableCellEditorBanco =tableColumnBanco.getCellEditor();

		BancoTableCell bancoTableCellFk=(BancoTableCell)tableCellEditorBanco;

		if(bancoTableCellFk!=null) {
			bancoTableCellFk.setbancosForeignKey(bancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bancoTableCellFk.setRowActual(intSelectedRow);
			//bancoTableCellFk.setbancosForeignKeyActual(bancosForeignKey);
		//}


		if(bancoTableCellFk!=null) {
			bancoTableCellFk.RecargarBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCuentaBancoGlobal(List<TipoCuentaBancoGlobal> tipocuentabancoglobalsForeignKey)throws Exception{
		TableColumn tableColumnTipoCuentaBancoGlobal=this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobal,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL));
		TableCellEditor tableCellEditorTipoCuentaBancoGlobal =tableColumnTipoCuentaBancoGlobal.getCellEditor();

		TipoCuentaBancoGlobalTableCell tipocuentabancoglobalTableCellFk=(TipoCuentaBancoGlobalTableCell)tableCellEditorTipoCuentaBancoGlobal;

		if(tipocuentabancoglobalTableCellFk!=null) {
			tipocuentabancoglobalTableCellFk.settipocuentabancoglobalsForeignKey(tipocuentabancoglobalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocuentabancoglobalTableCellFk.setRowActual(intSelectedRow);
			//tipocuentabancoglobalTableCellFk.settipocuentabancoglobalsForeignKeyActual(tipocuentabancoglobalsForeignKey);
		//}


		if(tipocuentabancoglobalTableCellFk!=null) {
			tipocuentabancoglobalTableCellFk.RecargarTipoCuentaBancoGlobalsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBancoTipoCuentaBancoGlobal(false);
			
			//if(!this.isEsNuevoBancoTipoCuentaBancoGlobal) {								
				int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
				
			}
			
			if(this.permiteMantenimiento(this.bancotipocuentabancoglobal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBancoTipoCuentaBancoGlobal=true;
					this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
					this.isEsNuevoBancoTipoCuentaBancoGlobal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBancoTipoCuentaBancoGlobal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBancoTipoCuentaBancoGlobal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBancoTipoCuentaBancoGlobal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal(false);
				
				this.habilitarDeshabilitarControlesBancoTipoCuentaBancoGlobal(false);
			
												
				
				if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBancoTipoCuentaBancoGlobal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBancoTipoCuentaBancoGlobal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.bancotipocuentabancoglobal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				this.bancotipocuentabancoglobal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				this.bancotipocuentabancoglobal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.bancotipocuentabancoglobal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BancoTipoCuentaBancoGlobalModel) this.jTableDatosBancoTipoCuentaBancoGlobal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBancoTipoCuentaBancoGlobal=true;
				this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
				this.isEsNuevoBancoTipoCuentaBancoGlobal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBancoTipoCuentaBancoGlobal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal(false);
				
				this.habilitarDeshabilitarControlesBancoTipoCuentaBancoGlobal(false);
				
				
				
				if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBancoTipoCuentaBancoGlobal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBancoTipoCuentaBancoGlobal.getRowCount()>=1) {
				jTableDatosBancoTipoCuentaBancoGlobal.removeRowSelectionInterval(0, jTableDatosBancoTipoCuentaBancoGlobal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBancoTipoCuentaBancoGlobal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBancoTipoCuentaBancoGlobal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal(false) ;
			
			this.isEsNuevoBancoTipoCuentaBancoGlobal=false;
			
			if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBancoTipoCuentaBancoGlobal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
				
				//SI ES MANUAL
				if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBancoTipoCuentaBancoGlobal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBancoTipoCuentaBancoGlobal--;			
			//BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux= new BancoTipoCuentaBancoGlobal();			
			//bancotipocuentabancoglobalAux.setId(this.iIdNuevoBancoTipoCuentaBancoGlobal);
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBancoTipoCuentaBancoGlobal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
			
			this.bancotipocuentabancoglobal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().add(this.bancotipocuentabancoglobalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.bancotipocuentabancoglobals.add(this.bancotipocuentabancoglobalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
			
			this.jTableDatosBancoTipoCuentaBancoGlobal.setRowSelectionInterval(this.getIndiceNuevoBancoTipoCuentaBancoGlobal(), this.getIndiceNuevoBancoTipoCuentaBancoGlobal());
			
			int iLastRow =  this.jTableDatosBancoTipoCuentaBancoGlobal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBancoTipoCuentaBancoGlobal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBancoTipoCuentaBancoGlobal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
			
			//SI ES MANUAL
			if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBancoTipoCuentaBancoGlobal();
			}
			
			//this.abrirFrameTreeBancoTipoCuentaBancoGlobal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Banco Tipo Cuenta Banco GlobalES ?", "MANTENIMIENTO DE Banco Tipo Cuenta Banco Global", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralBancoTipoCuentaBancoGlobal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.bancotipocuentabancoglobalReturnGeneral=bancotipocuentabancoglobalLogic.procesarImportacionBancoTipoCuentaBancoGlobalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.bancotipocuentabancoglobalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarBancoTipoCuentaBancoGlobalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setFileImportacion(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBancoTipoCuentaBancoGlobal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();		

		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BancoTipoCuentaBancoGlobalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BancoTipoCuentaBancoGlobalBaseDesign.jrxml";
			
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
			
			this.generarReporteBancoTipoCuentaBancoGlobals("Todos",bancotipocuentabancoglobalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Banco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Banco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Banco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Banco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCuentaBancoGlobal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCuentaBancoGlobal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCuentaBancoGlobal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCuentaBancoGlobal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoria="id_banco";
					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					sNombreCampoCategoria="id_tipo_cuenta_banco_global";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoriaValor="id_banco";
					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					sNombreCampoCategoriaValor="id_tipo_cuenta_banco_global";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_banco");
					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Cuenta Banco Global",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_cuenta_banco_global");
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
	
	public void jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();		
		
		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancotipocuentabancoglobal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("BancoTipoCuentaBancoGlobals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal:bancotipocuentabancoglobalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancotipocuentabancoglobal.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO);
					iRow++;

					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal:bancotipocuentabancoglobalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancotipocuentabancoglobal.getbanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
					iRow++;

					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal:bancotipocuentabancoglobalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bancotipocuentabancoglobal.gettipocuentabancoglobal_descripcion());
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
			//	this.getFilaCabeceraExportarExcelBancoTipoCuentaBancoGlobal(row);				
			//	iRow++;
			//}				
			
			//for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
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
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
			
			//SI ES MANUAL
			if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBancoTipoCuentaBancoGlobal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
			
			//SI ES MANUAL
			if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBancoTipoCuentaBancoGlobal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
			
			//SI ES MANUAL
			if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBancoTipoCuentaBancoGlobal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBancoTipoCuentaBancoGlobal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBancoTipoCuentaBancoGlobal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBancoTipoCuentaBancoGlobal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBancoTipoCuentaBancoGlobal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBancoTipoCuentaBancoGlobal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBancoTipoCuentaBancoGlobal.setMinimumSize(dimensionMinimum);
		this.jTableDatosBancoTipoCuentaBancoGlobal.setMaximumSize(dimensionMaximum);
		this.jTableDatosBancoTipoCuentaBancoGlobal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBancoTipoCuentaBancoGlobal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBancoTipoCuentaBancoGlobal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBancoTipoCuentaBancoGlobal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBancoTipoCuentaBancoGlobal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBancoTipoCuentaBancoGlobal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBancoTipoCuentaBancoGlobal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBancoTipoCuentaBancoGlobal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal();
		
		this.inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBancoTipoCuentaBancoGlobal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBancoTipoCuentaBancoGlobal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBancoTipoCuentaBancoGlobal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBancoTipoCuentaBancoGlobal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jCheckBoxPostAccionNuevoBancoTipoCuentaBancoGlobal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jCheckBoxPostAccionSinCerrarBancoTipoCuentaBancoGlobal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jCheckBoxPostAccionSinMensajeBancoTipoCuentaBancoGlobal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jCheckBoxPostAccionNuevoBancoTipoCuentaBancoGlobal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jCheckBoxPostAccionSinCerrarBancoTipoCuentaBancoGlobal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jCheckBoxPostAccionSinMensajeBancoTipoCuentaBancoGlobal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBancoTipoCuentaBancoGlobal(Boolean esInicializar) throws Exception {
		try	{	
			if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBancoTipoCuentaBancoGlobal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBancoTipoCuentaBancoGlobal() throws Exception {
		try	{
			if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBancoTipoCuentaBancoGlobal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBancoTipoCuentaBancoGlobal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBancoTipoCuentaBancoGlobal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
			if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBancoTipoCuentaBancoGlobal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBancoTipoCuentaBancoGlobal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal!=null) {
				
				if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBancoTipoCuentaBancoGlobal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.getSelectedItem()!=null){this.id_bancoFK_IdBanco=((Banco)this.jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.getSelectedItem()!=null){this.id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal=((TipoCuentaBancoGlobal)this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBancoTipoCuentaBancoGlobal(Boolean esInicializar) throws Exception {				
		if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBancoTipoCuentaBancoGlobal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal() throws Exception {
		this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBancoTipoCuentaBancoGlobal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BancoTipoCuentaBancoGlobalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BancoTipoCuentaBancoGlobalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBancoTipoCuentaBancoGlobalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BancoTipoCuentaBancoGlobalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BancoTipoCuentaBancoGlobalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=bancotipocuentabancoglobals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBancoTipoCuentaBancoGlobal.setModel(new BancoTipoCuentaBancoGlobalModel(this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBancoTipoCuentaBancoGlobal.setModel(new BancoTipoCuentaBancoGlobalModel(this.bancotipocuentabancoglobals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal!=null && this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBancoTipoCuentaBancoGlobal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BancoTipoCuentaBancoGlobalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,bancotipocuentabancoglobalConstantesFunciones.resaltarSeleccionarBancoTipoCuentaBancoGlobal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,bancotipocuentabancoglobalConstantesFunciones.resaltarSeleccionarBancoTipoCuentaBancoGlobal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobal,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_ID));

		if(this.bancotipocuentabancoglobalConstantesFunciones.mostraridBancoTipoCuentaBancoGlobal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bancotipocuentabancoglobalConstantesFunciones.resaltaridBancoTipoCuentaBancoGlobal,this.bancotipocuentabancoglobalConstantesFunciones.activaridBancoTipoCuentaBancoGlobal,this,true,"idBancoTipoCuentaBancoGlobal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bancotipocuentabancoglobalConstantesFunciones.resaltaridBancoTipoCuentaBancoGlobal,this.bancotipocuentabancoglobalConstantesFunciones.activaridBancoTipoCuentaBancoGlobal,this,true,"idBancoTipoCuentaBancoGlobal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobal,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA));

		if(this.bancotipocuentabancoglobalConstantesFunciones.mostrarid_empresaBancoTipoCuentaBancoGlobal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_empresaBancoTipoCuentaBancoGlobal,this,this.bancotipocuentabancoglobalConstantesFunciones.activarid_empresaBancoTipoCuentaBancoGlobal));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_empresaBancoTipoCuentaBancoGlobal,this,this.bancotipocuentabancoglobalConstantesFunciones.activarid_empresaBancoTipoCuentaBancoGlobal,false,"id_empresaBancoTipoCuentaBancoGlobal","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoTipoCuentaBancoGlobalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobal,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO));

		if(this.bancotipocuentabancoglobalConstantesFunciones.mostrarid_bancoBancoTipoCuentaBancoGlobal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BancoTableCell(this.bancosForeignKey,this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_bancoBancoTipoCuentaBancoGlobal,this,this.bancotipocuentabancoglobalConstantesFunciones.activarid_bancoBancoTipoCuentaBancoGlobal));
			tableColumn.setCellEditor(new BancoTableCell(this.bancosForeignKey,this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_bancoBancoTipoCuentaBancoGlobal,this,this.bancotipocuentabancoglobalConstantesFunciones.activarid_bancoBancoTipoCuentaBancoGlobal,true,"id_bancoBancoTipoCuentaBancoGlobal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoTipoCuentaBancoGlobalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobal,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL));

		if(this.bancotipocuentabancoglobalConstantesFunciones.mostrarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCuentaBancoGlobalTableCell(this.tipocuentabancoglobalsForeignKey,this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal,this,this.bancotipocuentabancoglobalConstantesFunciones.activarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal));
			tableColumn.setCellEditor(new TipoCuentaBancoGlobalTableCell(this.tipocuentabancoglobalsForeignKey,this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal,this,this.bancotipocuentabancoglobalConstantesFunciones.activarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal,true,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BancoTipoCuentaBancoGlobalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBancoTipoCuentaBancoGlobal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBancoTipoCuentaBancoGlobal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBancoTipoCuentaBancoGlobal.addColumn(tableColumn);
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
			
			this.jTableDatosBancoTipoCuentaBancoGlobal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBancoTipoCuentaBancoGlobal.moveColumn(this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBancoTipoCuentaBancoGlobal.moveColumn(this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBancoTipoCuentaBancoGlobal.moveColumn(this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBancoTipoCuentaBancoGlobal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBancoTipoCuentaBancoGlobal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBancoTipoCuentaBancoGlobal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBancoTipoCuentaBancoGlobal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBancoTipoCuentaBancoGlobal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBancoTipoCuentaBancoGlobal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=bancotipocuentabancoglobals.size()-1;
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
		//this.jTableDatosBancoTipoCuentaBancoGlobal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBancoTipoCuentaBancoGlobal();
			
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
				
				//this.isEsNuevoBancoTipoCuentaBancoGlobal=false;
					
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
				if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.bancotipocuentabancoglobal.getsType().equals("DUPLICADO")
				   || this.bancotipocuentabancoglobal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBancoTipoCuentaBancoGlobal=true;
				
				} else {
					this.isEsNuevoBancoTipoCuentaBancoGlobal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					if(this.bancotipocuentabancoglobal.getId()>=0 && !this.bancotipocuentabancoglobal.getIsNew()) {						
						this.isEsNuevoBancoTipoCuentaBancoGlobal=false;
						
					} else {
						this.isEsNuevoBancoTipoCuentaBancoGlobal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBancoTipoCuentaBancoGlobal(esRelaciones);						
				
				this.seleccionarBancoTipoCuentaBancoGlobal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.bancotipocuentabancoglobal.getId()<0) {
					this.isEsNuevoBancoTipoCuentaBancoGlobal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBancoTipoCuentaBancoGlobal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBancoTipoCuentaBancoGlobal(evt,rowIndex);
				}	
				
				if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion BancoTipoCuentaBancoGlobal: " + this.dDif); 
					}
				}								
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBancoTipoCuentaBancoGlobal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.bancotipocuentabancoglobal)) {
					if(this.bancotipocuentabancoglobal.getId()>0) {
						this.bancotipocuentabancoglobal.setIsDeleted(true);
						
						this.bancotipocuentabancoglobalsEliminados.add(this.bancotipocuentabancoglobal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().remove(this.bancotipocuentabancoglobal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bancotipocuentabancoglobals.remove(this.bancotipocuentabancoglobal);				
					}
					
					
					((BancoTipoCuentaBancoGlobalModel) this.jTableDatosBancoTipoCuentaBancoGlobal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBancoTipoCuentaBancoGlobal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBancoTipoCuentaBancoGlobal) {
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.bancotipocuentabancoglobalConstantesFunciones.cargarid_empresaBancoTipoCuentaBancoGlobal || this.bancotipocuentabancoglobalConstantesFunciones.event_dependid_empresaBancoTipoCuentaBancoGlobal) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.bancotipocuentabancoglobal.getid_empresa());
									//this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(bancotipocuentabancoglobal.getEmpresa()!=null) {
							this.empresasForeignKey.add(bancotipocuentabancoglobal.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.bancotipocuentabancoglobal.getid_empresa(),false,"Formulario");

					//Banco
					if(!this.bancotipocuentabancoglobalConstantesFunciones.cargarid_bancoBancoTipoCuentaBancoGlobal || this.bancotipocuentabancoglobalConstantesFunciones.event_dependid_bancoBancoTipoCuentaBancoGlobal) {
						//this.cargarCombosBancosForeignKeyLista(" where id="+this.bancotipocuentabancoglobal.getid_banco());
									//this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
						this.bancosForeignKey=new ArrayList<Banco>();

						if(bancotipocuentabancoglobal.getBanco()!=null) {
							this.bancosForeignKey.add(bancotipocuentabancoglobal.getBanco());
						}

						this.addItemDefectoCombosForeignKeyBanco();
						this.cargarCombosFrameBancosForeignKey("Todos");
					}
					this.setActualBancoForeignKey(this.bancotipocuentabancoglobal.getid_banco(),false,"Formulario");

					//TipoCuentaBancoGlobal
					if(!this.bancotipocuentabancoglobalConstantesFunciones.cargarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal || this.bancotipocuentabancoglobalConstantesFunciones.event_dependid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal) {
						//this.cargarCombosTipoCuentaBancoGlobalsForeignKeyLista(" where id="+this.bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global());
									//this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
						this.tipocuentabancoglobalsForeignKey=new ArrayList<TipoCuentaBancoGlobal>();

						if(bancotipocuentabancoglobal.getTipoCuentaBancoGlobal()!=null) {
							this.tipocuentabancoglobalsForeignKey.add(bancotipocuentabancoglobal.getTipoCuentaBancoGlobal());
						}

						this.addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal();
						this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey("Todos");
					}
					this.setActualTipoCuentaBancoGlobalForeignKey(this.bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBancoTipoCuentaBancoGlobal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobal);
	}
	
	public void setVariablesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.setText(bancotipocuentabancoglobal.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,bancotipocuentabancoglobalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				bancotipocuentabancoglobalLocal=this.bancotipocuentabancoglobal;
			} else {
				bancotipocuentabancoglobalLocal=this.bancotipocuentabancoglobalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(bancotipocuentabancoglobalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalLocal,true);
					
					if(bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(bancotipocuentabancoglobalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(bancotipocuentabancoglobalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobal);
	}
	
	public void setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.getText()==null || this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.getText()=="" || this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.getText()=="Id") {
				this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.setText("0");
			}

			if(conColumnasBase) {bancotipocuentabancoglobal.setId(Long.parseLong(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelIdBancoTipoCuentaBancoGlobal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalBean,BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && bancotipocuentabancoglobalBean.getid_banco()!=null && !bancotipocuentabancoglobalBean.getid_banco().equals(-1L))) {bancotipocuentabancoglobal.setid_banco(bancotipocuentabancoglobalBean.getid_banco());}
			if(conDefault || (!conDefault && bancotipocuentabancoglobalBean.getid_tipo_cuenta_banco_global()!=null && !bancotipocuentabancoglobalBean.getid_tipo_cuenta_banco_global().equals(-1L))) {bancotipocuentabancoglobal.setid_tipo_cuenta_banco_global(bancotipocuentabancoglobalBean.getid_tipo_cuenta_banco_global());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalOrigen,BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bancotipocuentabancoglobalOrigen.getId()!=null && !bancotipocuentabancoglobalOrigen.getId().equals(0L))) {bancotipocuentabancoglobal.setId(bancotipocuentabancoglobalOrigen.getId());}}
			if(conDefault || (!conDefault && bancotipocuentabancoglobalOrigen.getid_banco()!=null && !bancotipocuentabancoglobalOrigen.getid_banco().equals(-1L))) {bancotipocuentabancoglobal.setid_banco(bancotipocuentabancoglobalOrigen.getid_banco());}
			if(conDefault || (!conDefault && bancotipocuentabancoglobalOrigen.getid_tipo_cuenta_banco_global()!=null && !bancotipocuentabancoglobalOrigen.getid_tipo_cuenta_banco_global().equals(-1L))) {bancotipocuentabancoglobal.setid_tipo_cuenta_banco_global(bancotipocuentabancoglobalOrigen.getid_tipo_cuenta_banco_global());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.setText(bancotipocuentabancoglobal.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobalBean bancotipocuentabancoglobalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.setText(bancotipocuentabancoglobalBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobalParameterReturnGeneral bancotipocuentabancoglobalReturnGeneral,BancoTipoCuentaBancoGlobalBean bancotipocuentabancoglobalBean,Boolean conDefault) throws Exception { 
		try {
			BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalLocal=new BancoTipoCuentaBancoGlobal();
			
			bancotipocuentabancoglobalLocal=bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bancotipocuentabancoglobalLocal.getId()!=null && !bancotipocuentabancoglobalLocal.getId().equals(0L))) {bancotipocuentabancoglobalBean.setId(bancotipocuentabancoglobalLocal.getId());}}
			if(conDefault || (!conDefault && bancotipocuentabancoglobalLocal.getid_banco()!=null && !bancotipocuentabancoglobalLocal.getid_banco().equals(-1L))) {bancotipocuentabancoglobalBean.setid_banco(bancotipocuentabancoglobalLocal.getid_banco());}
			if(conDefault || (!conDefault && bancotipocuentabancoglobalLocal.getid_tipo_cuenta_banco_global()!=null && !bancotipocuentabancoglobalLocal.getid_tipo_cuenta_banco_global().equals(-1L))) {bancotipocuentabancoglobalBean.setid_tipo_cuenta_banco_global(bancotipocuentabancoglobalLocal.getid_tipo_cuenta_banco_global());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBancoTipoCuentaBancoGlobalGenerico(Long idBancoTipoCuentaBancoGlobalSeleccionado,JComboBox jComboBoxBancoTipoCuentaBancoGlobal,List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsLocal)throws Exception {
		try {
			BancoTipoCuentaBancoGlobal  bancotipocuentabancoglobalTemp=null;

			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobalsLocal) {
				if(bancotipocuentabancoglobalAux.getId()!=null && bancotipocuentabancoglobalAux.getId().equals(idBancoTipoCuentaBancoGlobalSeleccionado)) {
					bancotipocuentabancoglobalTemp=bancotipocuentabancoglobalAux;
					break;
				}
			}

			jComboBoxBancoTipoCuentaBancoGlobal.setSelectedItem(bancotipocuentabancoglobalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBancoTipoCuentaBancoGlobalGenerico(JComboBox jComboBoxBancoTipoCuentaBancoGlobal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBancoTipoCuentaBancoGlobal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBancoTipoCuentaBancoGlobal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBancoTipoCuentaBancoGlobal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBancoTipoCuentaBancoGlobal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bancotipocuentabancoglobal=(BancoTipoCuentaBancoGlobal) bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) bancotipocuentabancoglobals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!bancotipocuentabancoglobal.getIsNew() && !bancotipocuentabancoglobal.getIsChanged() && !bancotipocuentabancoglobal.getIsDeleted()) {
				sDescripcion=bancotipocuentabancoglobal.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=bancotipocuentabancoglobal.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Banco")) {
			//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
			if(!bancotipocuentabancoglobal.getIsNew() && !bancotipocuentabancoglobal.getIsChanged() && !bancotipocuentabancoglobal.getIsDeleted()) {
				sDescripcion=bancotipocuentabancoglobal.getbanco_descripcion();
			} else {
				//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
				sDescripcion=bancotipocuentabancoglobal.getbanco_descripcion();
			}
		}

		if(sTipo.equals("TipoCuentaBancoGlobal")) {
			//sDescripcion=this.getActualTipoCuentaBancoGlobalForeignKeyDescripcion((Long)value);
			if(!bancotipocuentabancoglobal.getIsNew() && !bancotipocuentabancoglobal.getIsChanged() && !bancotipocuentabancoglobal.getIsDeleted()) {
				sDescripcion=bancotipocuentabancoglobal.gettipocuentabancoglobal_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCuentaBancoGlobalForeignKeyDescripcion((Long)value);
				sDescripcion=bancotipocuentabancoglobal.gettipocuentabancoglobal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalRow=new BancoTipoCuentaBancoGlobal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bancotipocuentabancoglobalRow=(BancoTipoCuentaBancoGlobal) bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bancotipocuentabancoglobalRow=(BancoTipoCuentaBancoGlobal) bancotipocuentabancoglobals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal && this.isPermisoNuevoBancoTipoCuentaBancoGlobal));			
			this.jButtonDuplicarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal && this.isPermisoDuplicarBancoTipoCuentaBancoGlobal));			
			this.jButtonCopiarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal && this.isPermisoCopiarBancoTipoCuentaBancoGlobal));
			this.jButtonVerFormBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal && this.isPermisoVerFormBancoTipoCuentaBancoGlobal));
			
			this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal && this.isPermisoOrdenBancoTipoCuentaBancoGlobal));			
			
			this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal && this.isPermisoNuevoBancoTipoCuentaBancoGlobal));			
			this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal && this.isPermisoNuevoBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonModificarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal && this.isPermisoActualizarBancoTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal && this.isPermisoActualizarBancoTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal && this.isPermisoEliminarBancoTipoCuentaBancoGlobal));
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarBancoTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal);							
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));			
			
			}
						
			this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal && this.isPermisoNuevoBancoTipoCuentaBancoGlobal));						
			this.jButtonDuplicarToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal && this.isPermisoDuplicarBancoTipoCuentaBancoGlobal));						
			this.jButtonCopiarToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal && this.isPermisoCopiarBancoTipoCuentaBancoGlobal));			
			this.jButtonVerFormToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal && this.isPermisoVerFormBancoTipoCuentaBancoGlobal));			
			this.jButtonAbrirOrderByToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal && this.isPermisoOrdenBancoTipoCuentaBancoGlobal));
			this.jButtonNuevoRelacionesToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal && this.isPermisoNuevoBancoTipoCuentaBancoGlobal));			
			this.jButtonNuevoGuardarCambiosToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal && this.isPermisoNuevoBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));			
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonModificarToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal && this.isPermisoActualizarBancoTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal  && this.isPermisoActualizarBancoTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal && this.isPermisoEliminarBancoTipoCuentaBancoGlobal));
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarToolBarBancoTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal);				
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal && this.isPermisoNuevoBancoTipoCuentaBancoGlobal));			
			this.jMenuItemDuplicarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal && this.isPermisoDuplicarBancoTipoCuentaBancoGlobal));			
			this.jMenuItemCopiarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal && this.isPermisoCopiarBancoTipoCuentaBancoGlobal));			
			this.jMenuItemVerFormBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal && this.isPermisoVerFormBancoTipoCuentaBancoGlobal));			
			this.jMenuItemAbrirOrderByBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal && this.isPermisoOrdenBancoTipoCuentaBancoGlobal));			
			//this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal && this.isPermisoOrdenBancoTipoCuentaBancoGlobal));
			this.jMenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal && this.isPermisoOrdenBancoTipoCuentaBancoGlobal));			
			//this.jMenuItemDetalleMostrarOcultarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal && this.isPermisoOrdenBancoTipoCuentaBancoGlobal));			
			this.jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal && this.isPermisoNuevoBancoTipoCuentaBancoGlobal));			
			this.jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal && this.isPermisoNuevoBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));									
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemModificarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal && this.isPermisoActualizarBancoTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemActualizarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal && this.isPermisoActualizarBancoTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemEliminarBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal && this.isPermisoEliminarBancoTipoCuentaBancoGlobal));
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemCancelarBancoTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal);				
			}
			
			this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));						
			this.jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=this.jButtonNuevoBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal=this.jButtonDuplicarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal=this.jButtonCopiarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal=this.jButtonVerFormBancoTipoCuentaBancoGlobal.isVisible();
			
			this.isVisibilidadCeldaOrdenBancoTipoCuentaBancoGlobal=this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=this.jButtonModificarBancoTipoCuentaBancoGlobal.isVisible();
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=this.jButtonNuevoToolBarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=this.jButtonNuevoRelacionesToolBarBancoTipoCuentaBancoGlobal.isVisible();
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonModificarToolBarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarToolBarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarToolBarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarToolBarBancoTipoCuentaBancoGlobal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=this.jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=this.jButtonGuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=this.jMenuItemNuevoBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=this.jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal.isVisible();
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemModificarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemActualizarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemEliminarBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemCancelarBancoTipoCuentaBancoGlobal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=this.jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBancoTipoCuentaBancoGlobal(Boolean esInicializar) {
		if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				//if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBancoTipoCuentaBancoGlobal();
			}
			
			this.inicializarActualizarBindingBotonesManualBancoTipoCuentaBancoGlobal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBancoTipoCuentaBancoGlobal() {
		this.jButtonNuevoBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoNuevoBancoTipoCuentaBancoGlobal);			
		this.jButtonDuplicarBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoDuplicarBancoTipoCuentaBancoGlobal);			
		this.jButtonCopiarBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoCopiarBancoTipoCuentaBancoGlobal);			
		this.jButtonVerFormBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoVerFormBancoTipoCuentaBancoGlobal);			
		
		this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoOrdenBancoTipoCuentaBancoGlobal);					
		
		this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoNuevoBancoTipoCuentaBancoGlobal);			
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonModificarBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarBancoTipoCuentaBancoGlobal);	
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarBancoTipoCuentaBancoGlobal);	
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoEliminarBancoTipoCuentaBancoGlobal);
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarBancoTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal);						
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal);							
		}
		
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarBancoTipoCuentaBancoGlobal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBancoTipoCuentaBancoGlobal() {
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonModificarBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarBancoTipoCuentaBancoGlobal);	
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarBancoTipoCuentaBancoGlobal);	
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarBancoTipoCuentaBancoGlobal.setVisible(this.isPermisoEliminarBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarBancoTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal);							
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosBancoTipoCuentaBancoGlobal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBancoTipoCuentaBancoGlobal() {
		if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBancoTipoCuentaBancoGlobal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBancoTipoCuentaBancoGlobal() {
	}
	
	public void jTableDatosBancoTipoCuentaBancoGlobalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBancoTipoCuentaBancoGlobal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBancoTipoCuentaBancoGlobalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.getbancotipocuentabancoglobal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancotipocuentabancoglobal==null) {
						this.bancotipocuentabancoglobal = new BancoTipoCuentaBancoGlobal();
					}

					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
				}

				if(this.bancotipocuentabancoglobal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.bancotipocuentabancoglobal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaBancoTipoCuentaBancoGlobalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebBancoTipoCuentaBancoGlobal(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoTipoCuentaBancoGlobal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoTipoCuentaBancoGlobal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.getbancotipocuentabancoglobal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.bancotipocuentabancoglobalLogic.getConnexion());

				if(this.bancotipocuentabancoglobal.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.bancotipocuentabancoglobal.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoTipoCuentaBancoGlobal=(TitledBorder)this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderBancoTipoCuentaBancoGlobal.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaBancoTipoCuentaBancoGlobalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.getbancotipocuentabancoglobal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancotipocuentabancoglobal==null) {
						this.bancotipocuentabancoglobal = new BancoTipoCuentaBancoGlobal();
					}

					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
				}

				if(this.bancotipocuentabancoglobal.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.bancotipocuentabancoglobal.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bancoBancoTipoCuentaBancoGlobalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobanco=true;

			idTienePermisobanco=this.tienePermisosUsuarioEnPaginaWebBancoTipoCuentaBancoGlobal(BancoConstantesFunciones.CLASSNAME);

			if(idTienePermisobanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoTipoCuentaBancoGlobal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoTipoCuentaBancoGlobal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.getbancotipocuentabancoglobal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);

				this.bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bancoBeanSwingJInternalFrame.getBancoLogic().setConnexion(this.bancotipocuentabancoglobalLogic.getConnexion());

				if(this.bancotipocuentabancoglobal.getid_banco()!=null) {
					this.bancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bancoBeanSwingJInternalFrame.setIdActual(this.bancotipocuentabancoglobal.getid_banco());
					this.bancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco();
				}

				JInternalFrameBase jinternalFrame =this.bancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoTipoCuentaBancoGlobal=(TitledBorder)this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.getBorder();
				TitledBorder titledBorderbanco=(TitledBorder)this.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.getBorder();

				titledBorderbanco.setTitle(titledBorderBancoTipoCuentaBancoGlobal.getTitle() + " -> Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bancoBancoTipoCuentaBancoGlobalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.getbancotipocuentabancoglobal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancotipocuentabancoglobal==null) {
						this.bancotipocuentabancoglobal = new BancoTipoCuentaBancoGlobal();
					}

					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
				}

				if(this.bancotipocuentabancoglobal.getid_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_banco = "+this.bancotipocuentabancoglobal.getid_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocuentabancoglobal=true;

			idTienePermisotipocuentabancoglobal=this.tienePermisosUsuarioEnPaginaWebBancoTipoCuentaBancoGlobal(TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocuentabancoglobal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBancoTipoCuentaBancoGlobal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBancoTipoCuentaBancoGlobal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.getbancotipocuentabancoglobal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);

				this.tipocuentabancoglobalBeanSwingJInternalFrame=new TipoCuentaBancoGlobalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocuentabancoglobalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocuentabancoglobalBeanSwingJInternalFrame.getTipoCuentaBancoGlobalLogic().setConnexion(this.bancotipocuentabancoglobalLogic.getConnexion());

				if(this.bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global()!=null) {
					this.tipocuentabancoglobalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocuentabancoglobalBeanSwingJInternalFrame.setIdActual(this.bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global());
					this.tipocuentabancoglobalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocuentabancoglobalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocuentabancoglobalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBancoGlobal();
				}

				JInternalFrameBase jinternalFrame =this.tipocuentabancoglobalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBancoTipoCuentaBancoGlobal=(TitledBorder)this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.getBorder();
				TitledBorder titledBordertipocuentabancoglobal=(TitledBorder)this.tipocuentabancoglobalBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGlobal.getBorder();

				titledBordertipocuentabancoglobal.setTitle(titledBorderBancoTipoCuentaBancoGlobal.getTitle() + " -> Tipo Cuenta Banco Global");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.getbancotipocuentabancoglobal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bancotipocuentabancoglobal==null) {
						this.bancotipocuentabancoglobal = new BancoTipoCuentaBancoGlobal();
					}

					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);
				}

				if(this.bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_cuenta_banco_global = "+this.bancotipocuentabancoglobal.getid_tipo_cuenta_banco_global().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBancoBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);

			this.getBancoTipoCuentaBancoGlobalsFK_IdBanco();

			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);

			//if(BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);

			this.getBancoTipoCuentaBancoGlobalsFK_IdEmpresa();

			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);

			//if(BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);

			this.getBancoTipoCuentaBancoGlobalsFK_IdTipoCuentaBancoGlobal();

			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);

			//if(BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bancotipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBancoTipoCuentaBancoGlobal() {
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setVisible(false);	    			
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.dispose();
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.dispose();
			this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal=null;
		}
		
		if(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setVisible(false);	    			
			this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.dispose();
			this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBancoTipoCuentaBancoGlobal();
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
			
			if(sTipo.equals("NuevoBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBancoTipoCuentaBancoGlobal")) {
				jButtonDuplicarBancoTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBancoTipoCuentaBancoGlobal")) {
				jButtonCopiarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("VerFormBancoTipoCuentaBancoGlobal")) {
				jButtonVerFormBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonDuplicarBancoTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBancoTipoCuentaBancoGlobal")) {
				jButtonDuplicarBancoTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBancoTipoCuentaBancoGlobal")) {
				jButtonModificarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonModificarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBancoTipoCuentaBancoGlobal")) {
				jButtonModificarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBancoTipoCuentaBancoGlobal")) {
				jButtonActualizarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonActualizarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBancoTipoCuentaBancoGlobal")) {
				jButtonActualizarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("EliminarBancoTipoCuentaBancoGlobal")) {
				jButtonEliminarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonEliminarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBancoTipoCuentaBancoGlobal")) {
				jButtonEliminarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CancelarBancoTipoCuentaBancoGlobal")) {
				jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBancoTipoCuentaBancoGlobal")) {
				jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CerrarBancoTipoCuentaBancoGlobal")) {
				jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBancoTipoCuentaBancoGlobal")) {
				jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonMostrarOcultarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBancoTipoCuentaBancoGlobal")) {
				jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBancoTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonCopiarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonVerFormBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBancoTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBancoTipoCuentaBancoGlobal")) {
				jButtonCopiarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBancoTipoCuentaBancoGlobal")) {
				jButtonVerFormBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBancoTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBancoTipoCuentaBancoGlobal")) {
				jButtonRecargarInformacionBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonRecargarInformacionBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBancoTipoCuentaBancoGlobal")) {
				jButtonRecargarInformacionBancoTipoCuentaBancoGlobalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBancoTipoCuentaBancoGlobal")) {
				jButtonAnterioresBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonAnterioresBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBancoTipoCuentaBancoGlobal")) {
				jButtonAnterioresBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBancoTipoCuentaBancoGlobal")) {
				jButtonSiguientesBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonSiguientesBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBancoTipoCuentaBancoGlobal")) {
				jButtonSiguientesBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBancoTipoCuentaBancoGlobal") || sTipo.equals("MenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal")) {
				jButtonAbrirOrderByBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBancoTipoCuentaBancoGlobal") || sTipo.equals("MenuItemDetalleMostrarOcultarBancoTipoCuentaBancoGlobal")) {
				jButtonMostrarOcultarBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBancoTipoCuentaBancoGlobal")) {
				jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBancoTipoCuentaBancoGlobal")) {
				jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal")) {
				
				jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBancoTipoCuentaBancoGlobal")) {
				jButtonCerrarImportacionBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBancoTipoCuentaBancoGlobal")) {
				
				jButtonGenerarImportacionBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBancoTipoCuentaBancoGlobal")) {
				
				jButtonAbrirImportacionBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBancoTipoCuentaBancoGlobal")) {
				jComboBoxTiposAccionesBancoTipoCuentaBancoGlobalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBancoTipoCuentaBancoGlobal")) {
				jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBancoTipoCuentaBancoGlobal")) {
				jComboBoxTiposAccionesBancoTipoCuentaBancoGlobalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBancoTipoCuentaBancoGlobal")) {
				
				jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBancoTipoCuentaBancoGlobal")) {
				jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBancoTipoCuentaBancoGlobal")) {
				jButtonAbrirOrderByBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBancoTipoCuentaBancoGlobal")) {
				jButtonAbrirOrderByBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBancoTipoCuentaBancoGlobal")) {
				jButtonCerrarOrderByBancoTipoCuentaBancoGlobalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBancoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonidBancoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBancoTipoCuentaBancoGlobalUpdate")) {
				this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBancoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoBancoTipoCuentaBancoGlobalUpdate")) {
				this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoBancoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate")) {
				this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdBancoBancoTipoCuentaBancoGlobal")) {
				this.jButtonFK_IdBancoBancoTipoCuentaBancoGlobalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal")) {
				this.jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobalActionPerformed(evt);
			}
			
			;
			
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBancoTipoCuentaBancoGlobal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				


				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalLocal=null;
			
			if(!this.getEsControlTabla()) {
				bancotipocuentabancoglobalLocal=this.bancotipocuentabancoglobal;
			} else {
				bancotipocuentabancoglobalLocal=this.bancotipocuentabancoglobalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
							
				
				


				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
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
			
			


			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
								
						
				


				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
								
				
				


				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
							
				
				


				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
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
			
			


			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
								
				
				


				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBancoTipoCuentaBancoGlobal")) {
					jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBancoTipoCuentaBancoGlobal")) {
					jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBancoTipoCuentaBancoGlobal")) {
					
				}
				
				


				
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
												
				
				


				
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
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
			
			


			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bancotipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bancotipocuentabancoglobal);
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
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
				
				


				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BancoTipoCuentaBancoGlobal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BancoTipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBancoTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bancotipocuentabancoglobalAnterior =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBancoTipoCuentaBancoGlobal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBancoTipoCuentaBancoGlobalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.bancotipocuentabancoglobal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.bancotipocuentabancoglobal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBancoTipoCuentaBancoGlobal")) {
				
				}
				
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBancoTipoCuentaBancoGlobal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBancoTipoCuentaBancoGlobal")) {
			
			}
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBancoTipoCuentaBancoGlobal();
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
			if(sTipo.equals("NuevoBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBancoTipoCuentaBancoGlobal")) {
				jButtonDuplicarBancoTipoCuentaBancoGlobalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBancoTipoCuentaBancoGlobal")) {
				jButtonCopiarBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBancoTipoCuentaBancoGlobal")) {
				jButtonVerFormBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBancoTipoCuentaBancoGlobal")) {
				jButtonModificarBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBancoTipoCuentaBancoGlobal")) {
				jButtonActualizarBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBancoTipoCuentaBancoGlobal")) {
				jButtonEliminarBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBancoTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBancoTipoCuentaBancoGlobal")) {
				jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBancoTipoCuentaBancoGlobal")) {
				jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBancoTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBancoTipoCuentaBancoGlobal")) {
				jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBancoTipoCuentaBancoGlobal")) {
				jButtonAbrirOrderByBancoTipoCuentaBancoGlobalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBancoTipoCuentaBancoGlobal")) {
				jButtonRecargarInformacionBancoTipoCuentaBancoGlobalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBancoTipoCuentaBancoGlobal")) {
				jButtonAnterioresBancoTipoCuentaBancoGlobalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBancoTipoCuentaBancoGlobal")) {
				jButtonSiguientesBancoTipoCuentaBancoGlobalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBancoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonidBancoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBancoTipoCuentaBancoGlobalUpdate")) {
				this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBancoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoBancoTipoCuentaBancoGlobalUpdate")) {
				this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoBancoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate")) {
				this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBancoTipoCuentaBancoGlobal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBancoTipoCuentaBancoGlobal")) {
				closingInternalFrameBancoTipoCuentaBancoGlobal();
				
			} else if(sTipo.equals("jButtonCancelarBancoTipoCuentaBancoGlobal")) {
				JInternalFrameBase jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal = (JInternalFrameBase)evt.getSource();
	            	
	            BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame jInternalFrameParent=(BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame)jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(null);
			}
			
			BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bancotipocuentabancoglobal,new Object(),this.bancotipocuentabancoglobalParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBancoTipoCuentaBancoGlobal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBancoTipoCuentaBancoGlobal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBancoTipoCuentaBancoGlobal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.bancotipocuentabancoglobal)) {
			if(!esControlTabla) {
				if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);			
				}
				
				if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bancotipocuentabancoglobalReturnGeneral=bancotipocuentabancoglobalLogic.procesarEventosBancoTipoCuentaBancoGlobalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals(),this.bancotipocuentabancoglobal,this.bancotipocuentabancoglobalParameterGeneral,this.isEsNuevoBancoTipoCuentaBancoGlobal,classes);//this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalReturnGeneral,this.bancotipocuentabancoglobalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBancoTipoCuentaBancoGlobal(classes,this.bancotipocuentabancoglobalReturnGeneral,this.bancotipocuentabancoglobalBean,false);
					}
						
					if(this.bancotipocuentabancoglobalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal());	
					}
						
					if(this.bancotipocuentabancoglobalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal(),classes);//this.bancotipocuentabancoglobalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,classes);//this.bancotipocuentabancoglobalBean);									
				}
			
				if(BancoTipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.bancotipocuentabancoglobalAnterior!=null) {
						this.bancotipocuentabancoglobal=this.bancotipocuentabancoglobalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bancotipocuentabancoglobalReturnGeneral=bancotipocuentabancoglobalLogic.procesarEventosBancoTipoCuentaBancoGlobalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals(),this.bancotipocuentabancoglobal,this.bancotipocuentabancoglobalParameterGeneral,this.isEsNuevoBancoTipoCuentaBancoGlobal,classes);//this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal(),bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal(),this.bancotipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBancoTipoCuentaBancoGlobal.repaint();
				
				//((AbstractTableModel) this.jTableDatosBancoTipoCuentaBancoGlobal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBancoTipoCuentaBancoGlobal();
			}
		}
	}
	
	public void actualizarVisualTableDatosBancoTipoCuentaBancoGlobal() throws Exception {
		
		BancoTipoCuentaBancoGlobalModel bancotipocuentabancoglobalModel=(BancoTipoCuentaBancoGlobalModel)this.jTableDatosBancoTipoCuentaBancoGlobal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bancotipocuentabancoglobalModel.bancotipocuentabancoglobals=this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			bancotipocuentabancoglobalModel.bancotipocuentabancoglobals=this.bancotipocuentabancoglobals;
		}
		
		
		((BancoTipoCuentaBancoGlobalModel) this.jTableDatosBancoTipoCuentaBancoGlobal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBancoTipoCuentaBancoGlobal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbancotipocuentabancoglobalAnterior(),this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbancotipocuentabancoglobalAnterior(),this.bancotipocuentabancoglobals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBancoTipoCuentaBancoGlobal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
										
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancotipocuentabancoglobal,new Object(),generalEntityParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BancoTipoCuentaBancoGlobalConstantesFunciones.getClassesRelationshipsOfBancoTipoCuentaBancoGlobal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BancoTipoCuentaBancoGlobalConstantesFunciones.getClassesRelationshipsFromStringsOfBancoTipoCuentaBancoGlobal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBancoTipoCuentaBancoGlobal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bancotipocuentabancoglobal,new Object(),generalEntityParameterGeneral,this.bancotipocuentabancoglobalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobalBean bancotipocuentabancoglobalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBancoTipoCuentaBancoGlobal(ArrayList<Classe> classes,BancoTipoCuentaBancoGlobalReturnGeneral bancotipocuentabancoglobalReturnGeneral,BancoTipoCuentaBancoGlobalBean bancotipocuentabancoglobalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.bancotipocuentabancoglobal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal = new BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame(jDesktopPane,this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones(),this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setVisible(false);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setSelected(false);						
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.bancotipocuentabancoglobalLogic=this.bancotipocuentabancoglobalLogic;
		
		this.cargarCombosFrameForeignKeyBancoTipoCuentaBancoGlobal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBancoTipoCuentaBancoGlobal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBancoTipoCuentaBancoGlobal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBancoTipoCuentaBancoGlobal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBancoTipoCuentaBancoGlobal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBancoTipoCuentaBancoGlobal"));
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonModificarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ModificarBancoTipoCuentaBancoGlobal"));

		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonModificarToolBarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ModificarToolBarBancoTipoCuentaBancoGlobal"));
					
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemModificarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"MenuItemModificarBancoTipoCuentaBancoGlobal"));		
		
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"ActualizarBancoTipoCuentaBancoGlobal"));
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarToolBarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBancoTipoCuentaBancoGlobal"));
						
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemActualizarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBancoTipoCuentaBancoGlobal"));		
		
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"EliminarBancoTipoCuentaBancoGlobal"));
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"EliminarToolBarBancoTipoCuentaBancoGlobal"));
								
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemEliminarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBancoTipoCuentaBancoGlobal"));		
		
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CancelarBancoTipoCuentaBancoGlobal"));
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CancelarToolBarBancoTipoCuentaBancoGlobal"));
					
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemCancelarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBancoTipoCuentaBancoGlobal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBancoTipoCuentaBancoGlobal"));		
		
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBancoTipoCuentaBancoGlobal"));
		
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBancoTipoCuentaBancoGlobal"));
		
		
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBancoTipoCuentaBancoGlobal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonidBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"idBancoTipoCuentaBancoGlobalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBancoTipoCuentaBancoGlobalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBancoTipoCuentaBancoGlobalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate.addActionListener(new ButtonActionListener(this,"id_bancoBancoTipoCuentaBancoGlobalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoBancoTipoCuentaBancoGlobalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBancoTipoCuentaBancoGlobal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBancoTipoCuentaBancoGlobal"));
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBancoTipoCuentaBancoGlobal"));
		}
		
		this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBancoTipoCuentaBancoGlobal"));
		
		this.jTableDatosBancoTipoCuentaBancoGlobal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBancoTipoCuentaBancoGlobal"));
		
		this.jButtonNuevoBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"NuevoBancoTipoCuentaBancoGlobal"));
		
		this.jButtonDuplicarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"DuplicarBancoTipoCuentaBancoGlobal"));
		
		this.jButtonCopiarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"CopiarBancoTipoCuentaBancoGlobal"));
		
		this.jButtonVerFormBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"VerFormBancoTipoCuentaBancoGlobal"));
		
		
		this.jButtonNuevoToolBarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"NuevoToolBarBancoTipoCuentaBancoGlobal"));
			
		this.jButtonDuplicarToolBarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemNuevoBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemDuplicarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBancoTipoCuentaBancoGlobal"));		
		
		
		this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBancoTipoCuentaBancoGlobal"));
		
		
		this.jButtonNuevoRelacionesToolBarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal"));		
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonModificarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ModificarBancoTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonModificarToolBarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ModificarToolBarBancoTipoCuentaBancoGlobal"));
			
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemModificarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"MenuItemModificarBancoTipoCuentaBancoGlobal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"ActualizarBancoTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonActualizarToolBarBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBancoTipoCuentaBancoGlobal"));
				
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemActualizarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBancoTipoCuentaBancoGlobal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"EliminarBancoTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonEliminarToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"EliminarToolBarBancoTipoCuentaBancoGlobal"));
						
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemEliminarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBancoTipoCuentaBancoGlobal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CancelarBancoTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonCancelarToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CancelarToolBarBancoTipoCuentaBancoGlobal"));
			
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemCancelarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBancoTipoCuentaBancoGlobal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBancoTipoCuentaBancoGlobal"));		
		
		
		this.jButtonCerrarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CerrarBancoTipoCuentaBancoGlobal"));
		
		
		this.jButtonCerrarToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CerrarToolBarBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemCerrarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBancoTipoCuentaBancoGlobal"));
			
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBancoTipoCuentaBancoGlobal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosBancoTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBancoTipoCuentaBancoGlobal"));
		}
		
		this.jButtonCopiarToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CopiarToolBarBancoTipoCuentaBancoGlobal"));
			
		this.jButtonVerFormToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"VerFormToolBarBancoTipoCuentaBancoGlobal"));
		
		this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemCopiarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBancoTipoCuentaBancoGlobal"));		
		
		this.jMenuItemVerFormBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBancoTipoCuentaBancoGlobal"));		
		
		
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBancoTipoCuentaBancoGlobal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBancoTipoCuentaBancoGlobal"));		
		
		
		
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"RecargarInformacionBancoTipoCuentaBancoGlobal"));
					
		this.jButtonRecargarInformacionToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBancoTipoCuentaBancoGlobal"));
		
		this.jMenuItemRecargarInformacionBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBancoTipoCuentaBancoGlobal"));		
		
		
		
		this.jButtonAnterioresBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"AnterioresBancoTipoCuentaBancoGlobal"));
		
		
		this.jButtonAnterioresToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBancoTipoCuentaBancoGlobal"));
		
		this.jMenuItemAnterioresBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBancoTipoCuentaBancoGlobal"));		
		
		
		this.jButtonSiguientesBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"SiguientesBancoTipoCuentaBancoGlobal"));
		
		
		this.jButtonSiguientesToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemSiguientesBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemAbrirOrderByBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBancoTipoCuentaBancoGlobal"));		
		
		
		this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBancoTipoCuentaBancoGlobal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBancoTipoCuentaBancoGlobal"));
			
		this.jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBancoTipoCuentaBancoGlobal"));

		this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBancoTipoCuentaBancoGlobal"));
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBancoTipoCuentaBancoGlobal"));
		}
		
		
		this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposRelacionesBancoTipoCuentaBancoGlobal"));
			
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposAccionesBancoTipoCuentaBancoGlobal"));
					
		this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBancoTipoCuentaBancoGlobal"));
			
		this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBancoTipoCuentaBancoGlobal"));		
		
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonidBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"idBancoTipoCuentaBancoGlobalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBancoTipoCuentaBancoGlobalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBancoTipoCuentaBancoGlobalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate.addActionListener(new ButtonActionListener(this,"id_bancoBancoTipoCuentaBancoGlobalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoBancoTipoCuentaBancoGlobalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBancoBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"FK_IdBancoBancoTipoCuentaBancoGlobal"));

			this.jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBancoTipoCuentaBancoGlobal"));
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBancoTipoCuentaBancoGlobal"));
				this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal"));
			}
			
			//this.jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBancoTipoCuentaBancoGlobal"));				
			//this.jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBancoTipoCuentaBancoGlobal"));
			//this.jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBancoTipoCuentaBancoGlobal"));
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBancoTipoCuentaBancoGlobal"));
				this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBancoTipoCuentaBancoGlobal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"AbrirOrderByBancoTipoCuentaBancoGlobal"));
			
			this.jButtonAbrirOrderByToolBarBancoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBancoTipoCuentaBancoGlobal"));			
			
			if(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBancoTipoCuentaBancoGlobal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBancoTipoCuentaBancoGlobal"));
		
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
            		closingInternalFrameBancoTipoCuentaBancoGlobal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal = (JInternalFrameBase)event.getSource();
	            	
	            BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame jInternalFrameParent=(BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame)jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBancoTipoCuentaBancoGlobalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBancoTipoCuentaBancoGlobal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoBancoTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBancoTipoCuentaBancoGlobalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonModificarBancoTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBancoTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonActualizarBancoTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBancoTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonEliminarBancoTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBancoTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonCancelarBancoTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonCerrarBancoTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBancoTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBancoTipoCuentaBancoGlobal";
		inputMap = this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBancoTipoCuentaBancoGlobalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonidBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"idBancoTipoCuentaBancoGlobalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBancoTipoCuentaBancoGlobalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBancoTipoCuentaBancoGlobalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate.addActionListener(new ButtonActionListener(this,"id_bancoBancoTipoCuentaBancoGlobalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoBancoTipoCuentaBancoGlobalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda"));
		
		
		this.jButtonFK_IdBancoBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"FK_IdBancoBancoTipoCuentaBancoGlobal"));

		this.jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBancoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBancoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBancoTipoCuentaBancoGlobal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
					bancotipocuentabancoglobalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobals) {
					bancotipocuentabancoglobalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
						bancotipocuentabancoglobalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobals) {
						bancotipocuentabancoglobalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBancoTipoCuentaBancoGlobal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBancoTipoCuentaBancoGlobal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBancoTipoCuentaBancoGlobal.getSelectedRows();
			
			BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalLocal=new BancoTipoCuentaBancoGlobal();
			
			//this.seleccionarTodosBancoTipoCuentaBancoGlobal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancotipocuentabancoglobalLocal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					bancotipocuentabancoglobalLocal =(BancoTipoCuentaBancoGlobal) this.bancotipocuentabancoglobals.toArray()[this.jTableDatosBancoTipoCuentaBancoGlobal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				bancotipocuentabancoglobalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
						bancotipocuentabancoglobalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobals) {
						bancotipocuentabancoglobalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBancoTipoCuentaBancoGlobal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBancoTipoCuentaBancoGlobal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBancoTipoCuentaBancoGlobal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBancoTipoCuentaBancoGlobalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBancoTipoCuentaBancoGlobalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobals) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBancoTipoCuentaBancoGlobalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBancoTipoCuentaBancoGlobal) {				
					conSplash=true;//false;										
					
					//this.startProcessBancoTipoCuentaBancoGlobal(conSplash);
				
					this.generarReporteBancoTipoCuentaBancoGlobalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBancoTipoCuentaBancoGlobalsSeleccionados();
				//this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBancoTipoCuentaBancoGlobalsSeleccionados(false);
				//this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBancoTipoCuentaBancoGlobalsSeleccionados(true);
				//this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBancoTipoCuentaBancoGlobal();
				
				this.exportarBancoTipoCuentaBancoGlobalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBancoTipoCuentaBancoGlobals();
				//this.importarBancoTipoCuentaBancoGlobals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBancoTipoCuentaBancoGlobal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBancoTipoCuentaBancoGlobalsSeleccionados();
				//this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Banco Tipo Cuenta Banco Global", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBancoTipoCuentaBancoGlobal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBancoTipoCuentaBancoGlobal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBancoTipoCuentaBancoGlobal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
				}	
			} 			
			else if(BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBancoTipoCuentaBancoGlobal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBancoTipoCuentaBancoGlobal(conSplash);
					
						//this.actualizarParametrosGeneralBancoTipoCuentaBancoGlobal();
						
						this.generarReporteProcesoAccionBancoTipoCuentaBancoGlobalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Banco Tipo Cuenta Banco GlobalES SELECCIONADOS?", "MANTENIMIENTO DE Banco Tipo Cuenta Banco Global", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBancoTipoCuentaBancoGlobal();
				
						this.actualizarParametrosGeneralBancoTipoCuentaBancoGlobal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.bancotipocuentabancoglobalReturnGeneral=bancotipocuentabancoglobalLogic.procesarAccionBancoTipoCuentaBancoGlobalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals(),this.bancotipocuentabancoglobalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBancoTipoCuentaBancoGlobalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBancoTipoCuentaBancoGlobal();
					
					BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBancoTipoCuentaBancoGlobalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBancoTipoCuentaBancoGlobal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBancoTipoCuentaBancoGlobal();
			
			if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();		
			BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal=new BancoTipoCuentaBancoGlobal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.getSelectedItem();
			
			
			
			
			bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(bancotipocuentabancoglobalsSeleccionados.size()==1) {
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobalsSeleccionados) {
					bancotipocuentabancoglobal=bancotipocuentabancoglobalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBancoTipoCuentaBancoGlobal();
			
      		//this.finishProcessBancoTipoCuentaBancoGlobal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBancoTipoCuentaBancoGlobalReturnGeneral() throws Exception {
		if(this.bancotipocuentabancoglobalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.bancotipocuentabancoglobalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.bancotipocuentabancoglobalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.bancotipocuentabancoglobalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.bancotipocuentabancoglobalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.bancotipocuentabancoglobalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
		}
		
		if(this.bancotipocuentabancoglobalReturnGeneral.getConRetornoLista() || this.bancotipocuentabancoglobalReturnGeneral.getConRetornoObjeto()) {
			if(this.bancotipocuentabancoglobalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.bancotipocuentabancoglobalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobal(this.bancotipocuentabancoglobalReturnGeneral.getBancoTipoCuentaBancoGlobal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingBancoTipoCuentaBancoGlobal(false);
		}
	}
	
	public void actualizarParametrosGeneralBancoTipoCuentaBancoGlobal() throws Exception {
		
		
	}
	
	public ArrayList<BancoTipoCuentaBancoGlobal> getBancoTipoCuentaBancoGlobalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBancoTipoCuentaBancoGlobal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals()) {
					if(bancotipocuentabancoglobalAux.getIsSelected()) {
						bancotipocuentabancoglobalsSeleccionados.add(bancotipocuentabancoglobalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:this.bancotipocuentabancoglobals) {
					if(bancotipocuentabancoglobalAux.getIsSelected()) {
						bancotipocuentabancoglobalsSeleccionados.add(bancotipocuentabancoglobalAux);				
					}
				}
			}
			
			if(bancotipocuentabancoglobalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						bancotipocuentabancoglobalsSeleccionados.addAll(this.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						bancotipocuentabancoglobalsSeleccionados.addAll(this.bancotipocuentabancoglobals);				
					}
				}
			}
		} else {
			bancotipocuentabancoglobalsSeleccionados.add(this.bancotipocuentabancoglobal);
		}
		
		return bancotipocuentabancoglobalsSeleccionados;
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
	
	public void generarReporteBancoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBancoTipoCuentaBancoGlobalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBancoTipoCuentaBancoGlobalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBancoTipoCuentaBancoGlobalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBancoTipoCuentaBancoGlobalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Banco Tipo Cuenta Banco Global",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBancoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();		
		
		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBancoTipoCuentaBancoGlobals("Todos",bancotipocuentabancoglobalsSeleccionados);
		
	}	
	
	public void generarReporteNormalBancoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();		
		
		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBancoTipoCuentaBancoGlobals("Todos",bancotipocuentabancoglobalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBancoTipoCuentaBancoGlobalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();
		
		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBancoTipoCuentaBancoGlobals("Todos",bancotipocuentabancoglobalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBancoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBancoTipoCuentaBancoGlobal();
		
		
		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBancoTipoCuentaBancoGlobal();
		
		
		//this.generarReporteBancoTipoCuentaBancoGlobals("Todos",bancotipocuentabancoglobalsSeleccionados ,bancotipocuentabancoglobalImplementable,bancotipocuentabancoglobalImplementableHome);
	}
	
	public void mostrarImportacionBancoTipoCuentaBancoGlobals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBancoTipoCuentaBancoGlobal();
		
		this.abrirFrameImportacionBancoTipoCuentaBancoGlobal();		
		
			
		//this.generarReporteBancoTipoCuentaBancoGlobals("Todos",bancotipocuentabancoglobalsSeleccionados ,bancotipocuentabancoglobalImplementable,bancotipocuentabancoglobalImplementableHome);
	}
	
	public void importarBancoTipoCuentaBancoGlobals() throws Exception {		
	
	}
	
	public void exportarBancoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBancoTipoCuentaBancoGlobalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBancoTipoCuentaBancoGlobalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBancoTipoCuentaBancoGlobalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Banco Tipo Cuenta Banco Global",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBancoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();		
		
		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancotipocuentabancoglobal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBancoTipoCuentaBancoGlobal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//bancotipocuentabancoglobalAux.setsDetalleGeneralEntityReporte(bancotipocuentabancoglobalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBancoTipoCuentaBancoGlobal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=bancotipocuentabancoglobal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=bancotipocuentabancoglobal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancotipocuentabancoglobal.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancotipocuentabancoglobal.getbanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bancotipocuentabancoglobal.gettipocuentabancoglobal_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBancoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();		
		
		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancotipocuentabancoglobal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("BancoTipoCuentaBancoGlobals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBancoTipoCuentaBancoGlobal(row);				
				iRow++;
			}				
			
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBancoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();		
		
		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bancotipocuentabancoglobal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("bancotipocuentabancoglobals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("bancotipocuentabancoglobal");
			//elementRoot.appendChild(element);
		
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobalsSeleccionados) {
				element = document.createElement("bancotipocuentabancoglobal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Banco Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBancoTipoCuentaBancoGlobal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(bancotipocuentabancoglobal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(bancotipocuentabancoglobal.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancotipocuentabancoglobal.getbanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bancotipocuentabancoglobal.gettipocuentabancoglobal_descripcion());				
	}
	
	public void setFilaDatosExportarXmlBancoTipoCuentaBancoGlobal(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BancoTipoCuentaBancoGlobalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(bancotipocuentabancoglobal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BancoTipoCuentaBancoGlobalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(bancotipocuentabancoglobal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(BancoTipoCuentaBancoGlobalConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(bancotipocuentabancoglobal.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementbanco_descripcion = document.createElement(BancoTipoCuentaBancoGlobalConstantesFunciones.IDBANCO);
		elementbanco_descripcion.appendChild(document.createTextNode(bancotipocuentabancoglobal.getbanco_descripcion()));
		element.appendChild(elementbanco_descripcion);

		Element elementtipocuentabancoglobal_descripcion = document.createElement(BancoTipoCuentaBancoGlobalConstantesFunciones.IDTIPOCUENTABANCOGLOBAL);
		elementtipocuentabancoglobal_descripcion.appendChild(document.createTextNode(bancotipocuentabancoglobal.gettipocuentabancoglobal_descripcion()));
		element.appendChild(elementtipocuentabancoglobal_descripcion);
	}
	
	public void generarReporteGroupGenericoBancoTipoCuentaBancoGlobalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados=new ArrayList<BancoTipoCuentaBancoGlobal>();
		
		bancotipocuentabancoglobalsSeleccionados=this.getBancoTipoCuentaBancoGlobalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalsSeleccionados);
		
		this.generarReporteBancoTipoCuentaBancoGlobals("Todos",bancotipocuentabancoglobalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBancoTipoCuentaBancoGlobal(ArrayList<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobalAux:bancotipocuentabancoglobalsSeleccionados) {
				bancotipocuentabancoglobalAux.setsDetalleGeneralEntityReporte(bancotipocuentabancoglobalAux.toString());
			
				if(sTipoSeleccionar.equals(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					bancotipocuentabancoglobalAux.setsDescripcionGeneralEntityReporte1(bancotipocuentabancoglobalAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO)) {
					existe=true;
					bancotipocuentabancoglobalAux.setsDescripcionGeneralEntityReporte1(bancotipocuentabancoglobalAux.getbanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL)) {
					existe=true;
					bancotipocuentabancoglobalAux.setsDescripcionGeneralEntityReporte1(bancotipocuentabancoglobalAux.gettipocuentabancoglobal_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=true;
				this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=true;
				this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=true;
			}
			
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=true;
				} else {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=true;
				} else {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=true;
				} else {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				} else {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=true;
				} else {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				} else {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarBancoTipoCuentaBancoGlobal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				} else {
					this.isVisibilidadCeldaGuardarBancoTipoCuentaBancoGlobal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=true;
		} else {
			this.actualizarEstadoPanelsBancoTipoCuentaBancoGlobal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBancoTipoCuentaBancoGlobal=false;
			//this.isVisibilidadCeldaVerFormBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaDuplicarBancoTipoCuentaBancoGlobal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;
		} else {
			this.isVisibilidadCeldaNuevoBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosBancoTipoCuentaBancoGlobal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			if(!bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;												
			}
			
			this.jButtonCerrarBancoTipoCuentaBancoGlobal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBancoTipoCuentaBancoGlobal=false;
		}
		
		if(!this.permiteMantenimiento(this.bancotipocuentabancoglobal)) {
			this.isVisibilidadCeldaActualizarBancoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarBancoTipoCuentaBancoGlobal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBancoTipoCuentaBancoGlobal() {
	}
	
	public void actualizarEstadoPanelsBancoTipoCuentaBancoGlobal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal!=null) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelPaginacionBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionBancoTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal!=null) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelPaginacionBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionBancoTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal!=null) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelPaginacionBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionBancoTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal!=null) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelPaginacionBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionBancoTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal!=null) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelPaginacionBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionBancoTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal!=null) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelPaginacionBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionBancoTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal!=null) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelPaginacionBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionBancoTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal!=null) {
					this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal!=null) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.remove(jPanelFK_IdBancoBancoTipoCuentaBancoGlobal);}

			this.isVisibilidadFK_IdTipoCuentaBancoGlobal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBancoGlobal) {this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.remove(jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);}
		}
		
	}

	public void setVisibilidadBusquedasParaBanco(Boolean isParaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBancoNegation=!isParaBanco;

			this.isVisibilidadFK_IdBanco=isParaBanco;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.remove(jPanelFK_IdBancoBancoTipoCuentaBancoGlobal);}

			this.isVisibilidadFK_IdTipoCuentaBancoGlobal=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBancoGlobal) {this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.remove(jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCuentaBancoGlobal(Boolean isParaTipoCuentaBancoGlobal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCuentaBancoGlobalNegation=!isParaTipoCuentaBancoGlobal;

			this.isVisibilidadFK_IdBanco=isParaTipoCuentaBancoGlobalNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.remove(jPanelFK_IdBancoBancoTipoCuentaBancoGlobal);}

			this.isVisibilidadFK_IdTipoCuentaBancoGlobal=isParaTipoCuentaBancoGlobal;
			if(!this.isVisibilidadFK_IdTipoCuentaBancoGlobal) {this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.remove(jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//BancoTipoCuentaBancoGlobalSessionBean bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
		
		if(this.bancotipocuentabancoglobalSessionBean==null) {
			this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
		}
		
		this.bancotipocuentabancoglobalSessionBean.setsUltimaBusquedaBancoTipoCuentaBancoGlobal(this.getsAccionBusqueda());
		this.bancotipocuentabancoglobalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.bancotipocuentabancoglobalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
			bancotipocuentabancoglobalSessionBean.setid_banco(this.getid_bancoFK_IdBanco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			bancotipocuentabancoglobalSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaBancoGlobal")) {
			bancotipocuentabancoglobalSessionBean.setid_tipo_cuenta_banco_global(this.getid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//BancoTipoCuentaBancoGlobalSessionBean bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
		
		if(this.bancotipocuentabancoglobalSessionBean==null) {
			this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
		}
		
		if(this.bancotipocuentabancoglobalSessionBean.getsUltimaBusquedaBancoTipoCuentaBancoGlobal()!=null&&!this.bancotipocuentabancoglobalSessionBean.getsUltimaBusquedaBancoTipoCuentaBancoGlobal().equals("")) {
			this.setsAccionBusqueda(bancotipocuentabancoglobalSessionBean.getsUltimaBusquedaBancoTipoCuentaBancoGlobal());
			this.setiNumeroPaginacion(bancotipocuentabancoglobalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(bancotipocuentabancoglobalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
				this.setid_bancoFK_IdBanco(bancotipocuentabancoglobalSessionBean.getid_banco());
				bancotipocuentabancoglobalSessionBean.setid_banco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(bancotipocuentabancoglobalSessionBean.getid_empresa());
				bancotipocuentabancoglobalSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaBancoGlobal")) {
				this.setid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal(bancotipocuentabancoglobalSessionBean.getid_tipo_cuenta_banco_global());
				bancotipocuentabancoglobalSessionBean.setid_tipo_cuenta_banco_global(-1L);
			}
		}
		
		this.bancotipocuentabancoglobalSessionBean.setsUltimaBusquedaBancoTipoCuentaBancoGlobal("");
		this.bancotipocuentabancoglobalSessionBean.setiNumeroPaginacion(BancoTipoCuentaBancoGlobalConstantesFunciones.INUMEROPAGINACION);
		this.bancotipocuentabancoglobalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBancoTipoCuentaBancoGlobal() {
		this.updateBorderResaltarBusquedasFormularioBancoTipoCuentaBancoGlobal();
		this.updateVisibilidadBusquedasFormularioBancoTipoCuentaBancoGlobal();
		this.updateHabilitarBusquedasFormularioBancoTipoCuentaBancoGlobal();
	}
	
	public void updateBorderResaltarBusquedasFormularioBancoTipoCuentaBancoGlobal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponents().length>0) {
	

		if(this.bancotipocuentabancoglobalConstantesFunciones.resaltarFK_IdBancoBancoTipoCuentaBancoGlobal!=null) {
			index= this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.indexOfComponent(this.jPanelFK_IdBancoBancoTipoCuentaBancoGlobal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponent(index);
				jPanel.setBorder(this.bancotipocuentabancoglobalConstantesFunciones.resaltarFK_IdBancoBancoTipoCuentaBancoGlobal);
			}
		}

		if(this.bancotipocuentabancoglobalConstantesFunciones.resaltarFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal!=null) {
			index= this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponent(index);
				jPanel.setBorder(this.bancotipocuentabancoglobalConstantesFunciones.resaltarFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBancoTipoCuentaBancoGlobal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.indexOfComponent(this.jPanelFK_IdBancoBancoTipoCuentaBancoGlobal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostrarFK_IdBancoBancoTipoCuentaBancoGlobal);
			if(!this.bancotipocuentabancoglobalConstantesFunciones.mostrarFK_IdBancoBancoTipoCuentaBancoGlobal && index>-1) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.remove(index);
			}

			index= this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostrarFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);
			if(!this.bancotipocuentabancoglobalConstantesFunciones.mostrarFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal && index>-1) {
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBancoTipoCuentaBancoGlobal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.indexOfComponent(this.jPanelFK_IdBancoBancoTipoCuentaBancoGlobal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bancotipocuentabancoglobalConstantesFunciones.activarFK_IdBancoBancoTipoCuentaBancoGlobal);
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setEnabledAt(index,this.bancotipocuentabancoglobalConstantesFunciones.activarFK_IdBancoBancoTipoCuentaBancoGlobal);
			}

			index= this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bancotipocuentabancoglobalConstantesFunciones.activarFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);
				this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setEnabledAt(index,this.bancotipocuentabancoglobalConstantesFunciones.activarFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBancoTipoCuentaBancoGlobal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBanco")) {
			index= this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.indexOfComponent(this.jPanelFK_IdBancoBancoTipoCuentaBancoGlobal);

			this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponent(index);

			this.bancotipocuentabancoglobalConstantesFunciones.setResaltarFK_IdBancoBancoTipoCuentaBancoGlobal(resaltar);

			jPanel.setBorder(this.bancotipocuentabancoglobalConstantesFunciones.resaltarFK_IdBancoBancoTipoCuentaBancoGlobal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCuentaBancoGlobal")) {
			index= this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);

			this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.getComponent(index);

			this.bancotipocuentabancoglobalConstantesFunciones.setResaltarFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal(resaltar);

			jPanel.setBorder(this.bancotipocuentabancoglobalConstantesFunciones.resaltarFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioBancoTipoCuentaBancoGlobal() throws Exception {

		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBancoTipoCuentaBancoGlobal();
		this.updateVisibilidadResaltarControlesFormularioBancoTipoCuentaBancoGlobal();
		this.updateHabilitarResaltarControlesFormularioBancoTipoCuentaBancoGlobal();
		
	}
	
	public void updateBorderResaltarControlesFormularioBancoTipoCuentaBancoGlobal() throws Exception {
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.bancotipocuentabancoglobalConstantesFunciones.resaltaridBancoTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.setBorder(this.bancotipocuentabancoglobalConstantesFunciones.resaltaridBancoTipoCuentaBancoGlobal);}
		if(this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_empresaBancoTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setBorder(this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_empresaBancoTipoCuentaBancoGlobal);}
		if(this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_bancoBancoTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setBorder(this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_bancoBancoTipoCuentaBancoGlobal);}
		if(this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setBorder(this.bancotipocuentabancoglobalConstantesFunciones.resaltarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBancoTipoCuentaBancoGlobal() throws Exception {		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
	
		//this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostraridBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jPanelidBancoTipoCuentaBancoGlobal.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostraridBancoTipoCuentaBancoGlobal);
		//this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostrarid_empresaBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jPanelid_empresaBancoTipoCuentaBancoGlobal.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostrarid_empresaBancoTipoCuentaBancoGlobal);
		//this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostrarid_bancoBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jPanelid_bancoBancoTipoCuentaBancoGlobal.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostrarid_bancoBancoTipoCuentaBancoGlobal);
		//this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostrarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setVisible(this.bancotipocuentabancoglobalConstantesFunciones.mostrarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBancoTipoCuentaBancoGlobal() throws Exception {
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal!=null) {
	
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jLabelidBancoTipoCuentaBancoGlobal.setEnabled(this.bancotipocuentabancoglobalConstantesFunciones.activaridBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setEnabled(this.bancotipocuentabancoglobalConstantesFunciones.activarid_empresaBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setEnabled(this.bancotipocuentabancoglobalConstantesFunciones.activarid_bancoBancoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal.jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setEnabled(this.bancotipocuentabancoglobalConstantesFunciones.activarid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal);
		}
	}
	
		
}