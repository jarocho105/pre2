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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

//import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.puntoventa.util.CajaConstantesFunciones;
import com.bydan.erp.puntoventa.util.CajaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CajaParameterGeneral;

import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.CajaBeanSwingJInternalFrame;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
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
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.CajaJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.CajaDetalleFormJInternalFrame;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
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



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class CajaModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CajaConstantesFunciones.LABEL_ID
										,CajaConstantesFunciones.LABEL_IDEMPRESA
										,CajaConstantesFunciones.LABEL_IDSUCURSAL
										,CajaConstantesFunciones.LABEL_NOMBRE
										,CajaConstantesFunciones.LABEL_NOMBREEQUIPO
										,CajaConstantesFunciones.LABEL_NOMBREIMPRESORA
										,CajaConstantesFunciones.LABEL_SECUENCIALPEDIDO
										,CajaConstantesFunciones.LABEL_SECUENCIALPEDIDOFORMATO
										,CajaConstantesFunciones.LABEL_PUNTOEMISION
										,CajaConstantesFunciones.LABEL_ESTABLECIMIENTO
										,CajaConstantesFunciones.LABEL_FECHAINICIO
										,CajaConstantesFunciones.LABEL_FECHAFINAL
										,CajaConstantesFunciones.LABEL_ESTAACTIVO
										,CajaConstantesFunciones.LABEL_DESCRIPCION
										,CajaConstantesFunciones.LABEL_SECUENCIALFACTURA
										,CajaConstantesFunciones.LABEL_SECUENCIALFACTURAFORMATO
										,CajaConstantesFunciones.LABEL_SECUENCIALNOTAVENTA
										,CajaConstantesFunciones.LABEL_SECUENCIALNOTAVENTAFORMATO
										,CajaConstantesFunciones.LABEL_SECUENCIANOTACREDITO
										,CajaConstantesFunciones.LABEL_SECUENCIANOTACREDITOFORMATO
										,CajaConstantesFunciones.LABEL_AUTORIZACIONFACTURA
										,CajaConstantesFunciones.LABEL_AUTORIZACIONNOTAVENTA
										,CajaConstantesFunciones.LABEL_AUTORIZACIONNOTACREDITO
										,CajaConstantesFunciones.LABEL_FECHACADUCAFACTURA
										,CajaConstantesFunciones.LABEL_FECHACADUCANOTAVENTA
										,CajaConstantesFunciones.LABEL_FECHACADUCANOTACREDITO
										,CajaConstantesFunciones.LABEL_SERIEFACTURA
										,CajaConstantesFunciones.LABEL_SERIENOTAVENTA
										,CajaConstantesFunciones.LABEL_SERIENOTACREDITO
										,CajaConstantesFunciones.LABEL_SECINICIALFACTURA
										,CajaConstantesFunciones.LABEL_SECINICIALNOTAVENTA
										,CajaConstantesFunciones.LABEL_SECINICIALNOTACREDITO
										,CajaConstantesFunciones.LABEL_SECFINALFACTURA
										,CajaConstantesFunciones.LABEL_SECFINALNOTAVENTA
										,CajaConstantesFunciones.LABEL_SECFINALNOTACREDITO
										,CajaConstantesFunciones.LABEL_IDPAIS
										,CajaConstantesFunciones.LABEL_IDCIUDAD
										,CajaConstantesFunciones.LABEL_IDZONA
										};
	   
	    public List<Caja> cajas;
	  	 
	    //NO SE UTILIZA
	    public CajaModel(List<Caja> cajas,JInternalFrameBase jInternalFrameBase) {
	    	this.cajas=cajas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CajaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.cajas=new ArrayList<Caja>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.cajas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.cajas.get(rowIndex).getIsSelected();
	            
				case 1: return this.cajas.get(rowIndex).getId();
				case 2: return this.cajas.get(rowIndex).getid_empresa();
				case 3: return this.cajas.get(rowIndex).getid_sucursal();
				case 4: return this.cajas.get(rowIndex).getnombre();
				case 5: return this.cajas.get(rowIndex).getnombre_equipo();
				case 6: return this.cajas.get(rowIndex).getnombre_impresora();
				case 7: return this.cajas.get(rowIndex).getsecuencial_pedido();
				case 8: return this.cajas.get(rowIndex).getsecuencial_pedido_formato();
				case 9: return this.cajas.get(rowIndex).getpunto_emision();
				case 10: return this.cajas.get(rowIndex).getestablecimiento();
				case 11: return this.cajas.get(rowIndex).getfecha_inicio();
				case 12: return this.cajas.get(rowIndex).getfecha_final();
				case 13: return this.cajas.get(rowIndex).getesta_activo();
				case 14: return this.cajas.get(rowIndex).getdescripcion();
				case 15: return this.cajas.get(rowIndex).getsecuencial_factura();
				case 16: return this.cajas.get(rowIndex).getsecuencial_factura_formato();
				case 17: return this.cajas.get(rowIndex).getsecuencial_nota_venta();
				case 18: return this.cajas.get(rowIndex).getsecuencial_nota_venta_formato();
				case 19: return this.cajas.get(rowIndex).getsecuencia_nota_credito();
				case 20: return this.cajas.get(rowIndex).getsecuencia_nota_credito_formato();
				case 21: return this.cajas.get(rowIndex).getautorizacion_factura();
				case 22: return this.cajas.get(rowIndex).getautorizacion_nota_venta();
				case 23: return this.cajas.get(rowIndex).getautorizacion_nota_credito();
				case 24: return this.cajas.get(rowIndex).getfecha_caduca_factura();
				case 25: return this.cajas.get(rowIndex).getfecha_caduca_nota_venta();
				case 26: return this.cajas.get(rowIndex).getfecha_caduca_nota_credito();
				case 27: return this.cajas.get(rowIndex).getserie_factura();
				case 28: return this.cajas.get(rowIndex).getserie_nota_venta();
				case 29: return this.cajas.get(rowIndex).getserie_nota_credito();
				case 30: return this.cajas.get(rowIndex).getsec_inicial_factura();
				case 31: return this.cajas.get(rowIndex).getsec_inicial_nota_venta();
				case 32: return this.cajas.get(rowIndex).getsec_inicial_nota_credito();
				case 33: return this.cajas.get(rowIndex).getsec_final_factura();
				case 34: return this.cajas.get(rowIndex).getsec_final_nota_venta();
				case 35: return this.cajas.get(rowIndex).getsec_final_nota_credito();
				case 36: return this.cajas.get(rowIndex).getid_pais();
				case 37: return this.cajas.get(rowIndex).getid_ciudad();
				case 38: return this.cajas.get(rowIndex).getid_zona();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return Long.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return Date.class;
				case 12: return Date.class;
				case 13: return Boolean.class;
				case 14: return String.class;
				case 15: return Long.class;
				case 16: return String.class;
				case 17: return Long.class;
				case 18: return String.class;
				case 19: return Long.class;
				case 20: return String.class;
				case 21: return String.class;
				case 22: return String.class;
				case 23: return String.class;
				case 24: return Date.class;
				case 25: return Date.class;
				case 26: return Date.class;
				case 27: return String.class;
				case 28: return String.class;
				case 29: return String.class;
				case 30: return String.class;
				case 31: return String.class;
				case 32: return String.class;
				case 33: return String.class;
				case 34: return String.class;
				case 35: return String.class;
				case 36: return Long.class;
				case 37: return Long.class;
				case 38: return Long.class;	            
	            default: return String.class;
	        }	    		        
	    }
	 
	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	    	switch (columnIndex) {
				case 0: return true;
            	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;
				case 16: return true;
				case 17: return true;
				case 18: return true;
				case 19: return true;
				case 20: return true;
				case 21: return true;
				case 22: return true;
				case 23: return true;
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;
				case 28: return true;
				case 29: return true;
				case 30: return true;
				case 31: return true;
				case 32: return true;
				case 33: return true;
				case 34: return true;
				case 35: return true;
				case 36: return true;
				case 37: return true;
				case 38: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Caja caja = this.cajas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame=(CajaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {caja.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {caja.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {caja.setid_empresa((Long) value);caja.setempresa_descripcion(cajaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {caja.setid_sucursal((Long) value);caja.setsucursal_descripcion(cajaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {caja.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {caja.setnombre_equipo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {caja.setnombre_impresora((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {caja.setsecuencial_pedido((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {caja.setsecuencial_pedido_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {caja.setpunto_emision((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {caja.setestablecimiento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {caja.setfecha_inicio((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {caja.setfecha_final((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {caja.setesta_activo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {caja.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {caja.setsecuencial_factura((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {caja.setsecuencial_factura_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {caja.setsecuencial_nota_venta((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {caja.setsecuencial_nota_venta_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {caja.setsecuencia_nota_credito((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {caja.setsecuencia_nota_credito_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {caja.setautorizacion_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {caja.setautorizacion_nota_venta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {caja.setautorizacion_nota_credito((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {caja.setfecha_caduca_factura((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {caja.setfecha_caduca_nota_venta((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {caja.setfecha_caduca_nota_credito((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {caja.setserie_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {caja.setserie_nota_venta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {caja.setserie_nota_credito((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {caja.setsec_inicial_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {caja.setsec_inicial_nota_venta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {caja.setsec_inicial_nota_credito((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {caja.setsec_final_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {caja.setsec_final_nota_venta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {caja.setsec_final_nota_credito((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {caja.setid_pais((Long) value);caja.setpais_descripcion(cajaBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {caja.setid_ciudad((Long) value);caja.setciudad_descripcion(cajaBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {caja.setid_zona((Long) value);caja.setzona_descripcion(cajaBeanSwingJInternalFrame.getActualZonaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private CajaDetalleFormJInternalFrame cajaJInternalFrame=null;
		
		public CajaModel(CajaDetalleFormJInternalFrame cajaJInternalFrame) {
			this.cajaJInternalFrame=cajaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.cajaJInternalFrame.getjButtonActualizarToolBarCaja();
			
			if(component!=null && component.equals(this.cajaJInternalFrame.getjButtonActualizarToolBarCaja())) {
				componentTab=this.cajaJInternalFrame.getjButtonEliminarToolBarCaja();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cajaJInternalFrame.getjButtonEliminarToolBarCaja())) {
				componentTab=this.cajaJInternalFrame.getjButtonCancelarToolBarCaja();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cajaJInternalFrame.getjButtonCancelarToolBarCaja())) {
				componentTab=this.cajaJInternalFrame.jComboBoxid_empresaCaja;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_zonaCaja)) {
				componentTab=this.cajaJInternalFrame.jComboBoxTiposAccionesFormularioCaja;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxTiposAccionesFormularioCaja)) {
				componentTab=this.cajaJInternalFrame.jButtonEliminarCaja;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cajaJInternalFrame.jButtonEliminarCaja)) {
				componentTab=this.cajaJInternalFrame.jButtonActualizarCaja;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cajaJInternalFrame.jButtonActualizarCaja)) {
				componentTab=this.cajaJInternalFrame.jButtonCancelarCaja;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_empresaCaja)) {
			componentTab=this.cajaJInternalFrame.jComboBoxid_sucursalCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_sucursalCaja)) {
			componentTab=this.cajaJInternalFrame.jTextAreanombreCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextAreanombreCaja)) {
			componentTab=this.cajaJInternalFrame.jTextAreanombre_equipoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextAreanombre_equipoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextAreanombre_impresoraCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextAreanombre_impresoraCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_pedidoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_pedidoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_pedido_formatoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_pedido_formatoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldpunto_emisionCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldpunto_emisionCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldestablecimientoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldestablecimientoCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_inicioCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_inicioCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_finalCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_finalCaja)) {
			componentTab=this.cajaJInternalFrame.jCheckBoxesta_activoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jCheckBoxesta_activoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextAreadescripcionCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextAreadescripcionCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_factura_formatoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_factura_formatoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_nota_venta_formatoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_nota_venta_formatoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencia_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencia_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencia_nota_credito_formatoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencia_nota_credito_formatoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldautorizacion_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldautorizacion_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldautorizacion_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldautorizacion_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldautorizacion_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldautorizacion_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_caduca_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_caduca_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_caduca_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_caduca_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_caduca_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_caduca_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldserie_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldserie_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldserie_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldserie_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldserie_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldserie_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_inicial_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_inicial_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_inicial_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_inicial_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_inicial_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_inicial_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_final_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_final_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_final_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_final_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_final_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_final_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jComboBoxid_paisCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_paisCaja)) {
			componentTab=this.cajaJInternalFrame.jComboBoxid_ciudadCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_ciudadCaja)) {
			componentTab=this.cajaJInternalFrame.jComboBoxid_zonaCaja;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.cajaJInternalFrame.getjButtonActualizarToolBarCaja();
			
			if(component!=null && component.equals(this.cajaJInternalFrame.getjButtonEliminarToolBarCaja())) {
				componentTab=this.cajaJInternalFrame.getjButtonActualizarToolBarCaja();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cajaJInternalFrame.getjButtonCancelarToolBarCaja())) {
				componentTab=this.cajaJInternalFrame.getjButtonEliminarToolBarCaja();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_empresaCaja)) {
				
				componentTab=this.cajaJInternalFrame.getjButtonCancelarToolBarCaja();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxTiposAccionesFormularioCaja)) {
				componentTab=this.cajaJInternalFrame.jComboBoxid_zonaCaja;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cajaJInternalFrame.jButtonEliminarCaja)) {
				componentTab=this.cajaJInternalFrame.jComboBoxTiposAccionesFormularioCaja;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cajaJInternalFrame.jButtonActualizarCaja)) {
				componentTab=this.cajaJInternalFrame.jButtonEliminarCaja;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cajaJInternalFrame.jButtonCancelarCaja)) {
				componentTab=this.cajaJInternalFrame.jButtonActualizarCaja;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_sucursalCaja)) {
			componentTab=this.cajaJInternalFrame.jComboBoxid_empresaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextAreanombreCaja)) {
			componentTab=this.cajaJInternalFrame.jComboBoxid_sucursalCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextAreanombre_equipoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextAreanombreCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextAreanombre_impresoraCaja)) {
			componentTab=this.cajaJInternalFrame.jTextAreanombre_equipoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_pedidoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextAreanombre_impresoraCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_pedido_formatoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_pedidoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldpunto_emisionCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_pedido_formatoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldestablecimientoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldpunto_emisionCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_inicioCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldestablecimientoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_finalCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_inicioCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jCheckBoxesta_activoCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_finalCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextAreadescripcionCaja)) {
			componentTab=this.cajaJInternalFrame.jCheckBoxesta_activoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextAreadescripcionCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_factura_formatoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_factura_formatoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencial_nota_venta_formatoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencia_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencial_nota_venta_formatoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsecuencia_nota_credito_formatoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencia_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldautorizacion_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsecuencia_nota_credito_formatoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldautorizacion_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldautorizacion_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldautorizacion_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldautorizacion_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_caduca_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldautorizacion_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_caduca_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_caduca_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jDateChooserfecha_caduca_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_caduca_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldserie_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jDateChooserfecha_caduca_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldserie_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldserie_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldserie_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldserie_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_inicial_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldserie_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_inicial_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_inicial_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_inicial_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_inicial_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_final_facturaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_inicial_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_final_nota_ventaCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_final_facturaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jTextFieldsec_final_nota_creditoCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_final_nota_ventaCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_paisCaja)) {
			componentTab=this.cajaJInternalFrame.jTextFieldsec_final_nota_creditoCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_ciudadCaja)) {
			componentTab=this.cajaJInternalFrame.jComboBoxid_paisCaja;
			return componentTab;
		}

		if(component!=null && component.equals(this.cajaJInternalFrame.jComboBoxid_zonaCaja)) {
			componentTab=this.cajaJInternalFrame.jComboBoxid_ciudadCaja;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.cajaJInternalFrame.getjButtonActualizarToolBarCaja();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.cajaJInternalFrame.getjButtonActualizarToolBarCaja();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.cajaJInternalFrame.getjButtonCancelarToolBarCaja();
			
			
			return componentTab;		
		}
		
		public CajaDetalleFormJInternalFrame getcajaJInternalFrame() {
			return this.cajaJInternalFrame;
		}
		
		public void setcajaJInternalFrame(CajaDetalleFormJInternalFrame cajaJInternalFrame) {
			this.cajaJInternalFrame=cajaJInternalFrame;
		}
		
		public Component getComponentTab() {
			return this.componentTab;
		}
		
		public void setComponentTab(Component componentTab) {
			this.componentTab=componentTab;
		}
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
		
		
		/*FUNCIONES PARA AbstractTableModel*/
		/*
		Notas:
		* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
		* Se copia del Jdk javax.swing.table.AbstractTableModel
		* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
		* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
		*/
		
		protected EventListenerList listenerList = new EventListenerList();

		public int findColumn(String columnName) {
			for (int i = 0; i < getColumnCount(); i++) {
				if (columnName.equals(getColumnName(i))) {
					return i;
				}
			}
			return -1;
		}
		
		public void addTableModelListener(TableModelListener l) {
        	listenerList.add(TableModelListener.class, l);
    	}
		
		public void removeTableModelListener(TableModelListener l) {
        	listenerList.remove(TableModelListener.class, l);
    	}
		
		public TableModelListener[] getTableModelListeners() {
			return listenerList.getListeners(TableModelListener.class);
		}
		
		public void fireTableDataChanged() {
			fireTableChanged(new TableModelEvent(this));
		}
		
		public void fireTableStructureChanged() {
        	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
    	}
		
		public void fireTableRowsInserted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
		}
	
		public void fireTableRowsUpdated(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
		}
		
		public void fireTableRowsDeleted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
		}
	
		public void fireTableCellUpdated(int row, int column) {
			fireTableChanged(new TableModelEvent(this, row, row, column));
		}
		
		public void fireTableChanged(TableModelEvent e) {
			// Guaranteed to return a non-null array
			Object[] listeners = listenerList.getListenerList();
			// Process the listeners last to first, notifying
			// those that are interested in this event
			for (int i = listeners.length-2; i>=0; i-=2) {
				if (listeners[i]==TableModelListener.class) {
					((TableModelListener)listeners[i+1]).tableChanged(e);
				}
			}
		}
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
			return listenerList.getListeners(listenerType);
		}
		/*FUNCIONES PARA AbstractTableModel FIN*/
}
